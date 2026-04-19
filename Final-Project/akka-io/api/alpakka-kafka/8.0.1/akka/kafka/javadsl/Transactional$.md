---
description: Alpakka Kafka 8.0.1 - akka.kafka.javadsl.Transactional
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/javadsl/Transactional$.html
title: Alpakka Kafka 8.0.1 - akka.kafka.javadsl.Transactional
---

# Alpakka Kafka 8.0.1 - akka.kafka.javadsl.Transactional

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.javadsl.Transactional

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
- [PartitionAssignmentHandler](PartitionAssignmentHandler.html "The API is new and may change in further releases.")
- [Producer](Producer$.html "Akka Stream connector for publishing messages to Kafka topics.")
- [SendProducer](SendProducer.html "Utility class for producing to Kafka without using Akka Streams.")
- Transactional
o[akka](../../index.html).[kafka](../index.html).[javadsl](index.html)

# Transactional[**](../../../akka/kafka/javadsl/Transactional$.html "Permalink")

### 

#### object Transactional

 Akka Stream connector to support transactions between Kafka topics.

Source[Transactional.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/javadsl/Transactional.scala#L26)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Transactional
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/kafka/javadsl/Transactional$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/kafka/javadsl/Transactional$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/kafka/javadsl/Transactional$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/kafka/javadsl/Transactional$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/kafka/javadsl/Transactional$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/kafka/javadsl/Transactional$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/kafka/javadsl/Transactional$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/kafka/javadsl/Transactional$.html#flow[K,V,IN<:akka.kafka.ProducerMessage.Envelope[K,V,akka.kafka.ConsumerMessage.PartitionOffset]](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.Flow[IN,akka.kafka.ProducerMessage.Results[K,V,akka.kafka.ConsumerMessage.PartitionOffset],akka.NotUsed] "Permalink")  def flow\[K, V, IN \<: [Envelope](../ProducerMessage$$Envelope.html)\[K, V, [PartitionOffset](../ConsumerMessage$$PartitionOffset.html)]](settings: [ProducerSettings](../ProducerSettings.html)\[K, V]): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[IN, [Results](../ProducerMessage$$Results.html)\[K, V, [PartitionOffset](../ConsumerMessage$$PartitionOffset.html)], [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Publish records to Kafka topics and then continue the flow.

Publish records to Kafka topics and then continue the flow. The flow can only be used with a [Transactional.source](#source[K,V](consumerSettings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.TransactionalMessage[K,V],akka.kafka.javadsl.Consumer.Control]) that
emits a [ConsumerMessage.TransactionalMessage](../ConsumerMessage$$TransactionalMessage.html). The flow requires a unique `transactional.id` across all app
instances. The flow will override producer properties to enable Kafka exactly\-once transactional support.
9. [**](../../../akka/kafka/javadsl/Transactional$.html#flowWithOffsetContext[K,V](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.FlowWithContext[akka.kafka.ProducerMessage.Envelope[K,V,akka.NotUsed],akka.kafka.ConsumerMessage.PartitionOffset,akka.kafka.ProducerMessage.Results[K,V,akka.kafka.ConsumerMessage.PartitionOffset],akka.kafka.ConsumerMessage.PartitionOffset,akka.NotUsed] "Permalink")  def flowWithOffsetContext\[K, V](settings: [ProducerSettings](../ProducerSettings.html)\[K, V]): [FlowWithContext](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/FlowWithContext.html#akka.stream.javadsl.FlowWithContext)\[[Envelope](../ProducerMessage$$Envelope.html)\[K, V, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)], [PartitionOffset](../ConsumerMessage$$PartitionOffset.html), [Results](../ProducerMessage$$Results.html)\[K, V, [PartitionOffset](../ConsumerMessage$$PartitionOffset.html)], [PartitionOffset](../ConsumerMessage$$PartitionOffset.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]API MAY CHANGE

API MAY CHANGE

Publish records to Kafka topics and then continue the flow. The flow can only be used with a [Transactional.sourceWithOffsetContext](#sourceWithOffsetContext[K,V](consumerSettings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.SourceWithContext[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.ConsumerMessage.PartitionOffset,akka.kafka.javadsl.Consumer.Control]) that
carries [ConsumerMessage.PartitionOffset](../ConsumerMessage$$PartitionOffset.html) as context. The flow requires a unique `transactional.id` across all app
instances. The flow will override producer properties to enable Kafka exactly\-once transactional support.

This flow is intended to be used with Akka's \[flow with context](https://doc.akka.io/libraries/akka\-core/current/stream/operators/Flow/asFlowWithContext.html)
and [Transactional.sourceWithOffsetContext](#sourceWithOffsetContext[K,V](consumerSettings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.SourceWithContext[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.ConsumerMessage.PartitionOffset,akka.kafka.javadsl.Consumer.Control]).

Annotations@ApiMayChange()
10. [**](../../../akka/kafka/javadsl/Transactional$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../akka/kafka/javadsl/Transactional$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../akka/kafka/javadsl/Transactional$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../akka/kafka/javadsl/Transactional$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/kafka/javadsl/Transactional$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
15. [**](../../../akka/kafka/javadsl/Transactional$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
16. [**](../../../akka/kafka/javadsl/Transactional$.html#sink[K,V,IN<:akka.kafka.ProducerMessage.Envelope[K,V,akka.kafka.ConsumerMessage.PartitionOffset]](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.Sink[IN,java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def sink\[K, V, IN \<: [Envelope](../ProducerMessage$$Envelope.html)\[K, V, [PartitionOffset](../ConsumerMessage$$PartitionOffset.html)]](settings: [ProducerSettings](../ProducerSettings.html)\[K, V]): [Sink](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Sink.html#akka.stream.javadsl.Sink)\[IN, [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]]Sink that is aware of the [ConsumerMessage.TransactionalMessage.partitionOffset](../ConsumerMessage$$TransactionalMessage.html#partitionOffset:akka.kafka.ConsumerMessage.PartitionOffset) from a [Transactional.source](#source[K,V](consumerSettings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.TransactionalMessage[K,V],akka.kafka.javadsl.Consumer.Control]).

Sink that is aware of the [ConsumerMessage.TransactionalMessage.partitionOffset](../ConsumerMessage$$TransactionalMessage.html#partitionOffset:akka.kafka.ConsumerMessage.PartitionOffset) from a [Transactional.source](#source[K,V](consumerSettings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.TransactionalMessage[K,V],akka.kafka.javadsl.Consumer.Control]). It will
initialize, begin, produce, and commit the consumer offset as part of a transaction.
17. [**](../../../akka/kafka/javadsl/Transactional$.html#sinkWithOffsetContext[K,V](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.Sink[akka.japi.Pair[akka.kafka.ProducerMessage.Envelope[K,V,akka.NotUsed],akka.kafka.ConsumerMessage.PartitionOffset],java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def sinkWithOffsetContext\[K, V](settings: [ProducerSettings](../ProducerSettings.html)\[K, V]): [Sink](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Sink.html#akka.stream.javadsl.Sink)\[[Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[Envelope](../ProducerMessage$$Envelope.html)\[K, V, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)], [PartitionOffset](../ConsumerMessage$$PartitionOffset.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]]API MAY CHANGE

API MAY CHANGE

Sink that uses the context as [ConsumerMessage.TransactionalMessage.partitionOffset](../ConsumerMessage$$TransactionalMessage.html#partitionOffset:akka.kafka.ConsumerMessage.PartitionOffset) from a [Transactional.sourceWithOffsetContext](#sourceWithOffsetContext[K,V](consumerSettings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.SourceWithContext[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.ConsumerMessage.PartitionOffset,akka.kafka.javadsl.Consumer.Control]).
It will initialize, begin, produce, and commit the consumer offset as part of a transaction.

Annotations@ApiMayChange()
18. [**](../../../akka/kafka/javadsl/Transactional$.html#source[K,V](consumerSettings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.TransactionalMessage[K,V],akka.kafka.javadsl.Consumer.Control] "Permalink")  def source\[K, V](consumerSettings: [ConsumerSettings](../ConsumerSettings.html)\[K, V], subscription: [Subscription](../Subscription.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[TransactionalMessage](../ConsumerMessage$$TransactionalMessage.html)\[K, V], [Control](Consumer$$Control.html)]Transactional source to setup a stream for Exactly Only Once (EoS) kafka message semantics.

Transactional source to setup a stream for Exactly Only Once (EoS) kafka message semantics. To enable EoS it's
necessary to use the [Transactional.sink](#sink[K,V,IN<:akka.kafka.ProducerMessage.Envelope[K,V,akka.kafka.ConsumerMessage.PartitionOffset]](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.Sink[IN,java.util.concurrent.CompletionStage[akka.Done]]) or [Transactional.flow](#flow[K,V,IN<:akka.kafka.ProducerMessage.Envelope[K,V,akka.kafka.ConsumerMessage.PartitionOffset]](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.Flow[IN,akka.kafka.ProducerMessage.Results[K,V,akka.kafka.ConsumerMessage.PartitionOffset],akka.NotUsed]) (for passthrough).
19. [**](../../../akka/kafka/javadsl/Transactional$.html#sourceWithOffsetContext[K,V](consumerSettings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.SourceWithContext[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.ConsumerMessage.PartitionOffset,akka.kafka.javadsl.Consumer.Control] "Permalink")  def sourceWithOffsetContext\[K, V](consumerSettings: [ConsumerSettings](../ConsumerSettings.html)\[K, V], subscription: [Subscription](../Subscription.html)): [SourceWithContext](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/SourceWithContext.html#akka.stream.javadsl.SourceWithContext)\[[ConsumerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRecord.html#org.apache.kafka.clients.consumer.ConsumerRecord)\[K, V], [PartitionOffset](../ConsumerMessage$$PartitionOffset.html), [Control](Consumer$$Control.html)]API MAY CHANGE

API MAY CHANGE

This source is intended to be used with Akka's \[flow with context](https://doc.akka.io/libraries/akka\-core/current/stream/operators/Flow/asFlowWithContext.html)
and [Transactional.flowWithOffsetContext](#flowWithOffsetContext[K,V](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.FlowWithContext[akka.kafka.ProducerMessage.Envelope[K,V,akka.NotUsed],akka.kafka.ConsumerMessage.PartitionOffset,akka.kafka.ProducerMessage.Results[K,V,akka.kafka.ConsumerMessage.PartitionOffset],akka.kafka.ConsumerMessage.PartitionOffset,akka.NotUsed]).

Annotations@ApiMayChange()
20. [**](../../../akka/kafka/javadsl/Transactional$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/kafka/javadsl/Transactional$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/kafka/javadsl/Transactional$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/kafka/javadsl/Transactional$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/kafka/javadsl/Transactional$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/kafka/javadsl/Transactional$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/kafka/javadsl/Transactional$.html#flow[K,V,IN<:akka.kafka.ProducerMessage.Envelope[K,V,akka.kafka.ConsumerMessage.PartitionOffset]](settings:akka.kafka.ProducerSettings[K,V],transactionalId:String):akka.stream.javadsl.Flow[IN,akka.kafka.ProducerMessage.Results[K,V,akka.kafka.ConsumerMessage.PartitionOffset],akka.NotUsed] "Permalink")  def flow\[K, V, IN \<: [Envelope](../ProducerMessage$$Envelope.html)\[K, V, [PartitionOffset](../ConsumerMessage$$PartitionOffset.html)]](settings: [ProducerSettings](../ProducerSettings.html)\[K, V], transactionalId: String): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[IN, [Results](../ProducerMessage$$Results.html)\[K, V, [PartitionOffset](../ConsumerMessage$$PartitionOffset.html)], [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Publish records to Kafka topics and then continue the flow.

Publish records to Kafka topics and then continue the flow. The flow can only be used with a [Transactional.source](#source[K,V](consumerSettings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.TransactionalMessage[K,V],akka.kafka.javadsl.Consumer.Control]) that
emits a [ConsumerMessage.TransactionalMessage](../ConsumerMessage$$TransactionalMessage.html). The flow requires a unique `transactional.id` across all app
instances. The flow will override producer properties to enable Kafka exactly\-once transactional support.

Annotations@deprecated DeprecatedUse the 'flow' factory method without a transactionalId parameter
3. [**](../../../akka/kafka/javadsl/Transactional$.html#sink[K,V,IN<:akka.kafka.ProducerMessage.Envelope[K,V,akka.kafka.ConsumerMessage.PartitionOffset]](settings:akka.kafka.ProducerSettings[K,V],transactionalId:String):akka.stream.javadsl.Sink[IN,java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def sink\[K, V, IN \<: [Envelope](../ProducerMessage$$Envelope.html)\[K, V, [PartitionOffset](../ConsumerMessage$$PartitionOffset.html)]](settings: [ProducerSettings](../ProducerSettings.html)\[K, V], transactionalId: String): [Sink](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Sink.html#akka.stream.javadsl.Sink)\[IN, [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]]Sink that is aware of the [ConsumerMessage.TransactionalMessage.partitionOffset](../ConsumerMessage$$TransactionalMessage.html#partitionOffset:akka.kafka.ConsumerMessage.PartitionOffset) from a [Transactional.source](#source[K,V](consumerSettings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.TransactionalMessage[K,V],akka.kafka.javadsl.Consumer.Control]).

Sink that is aware of the [ConsumerMessage.TransactionalMessage.partitionOffset](../ConsumerMessage$$TransactionalMessage.html#partitionOffset:akka.kafka.ConsumerMessage.PartitionOffset) from a [Transactional.source](#source[K,V](consumerSettings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.TransactionalMessage[K,V],akka.kafka.javadsl.Consumer.Control]). It will
initialize, begin, produce, and commit the consumer offset as part of a transaction.

Annotations@deprecated DeprecatedUse the 'sink' factory method without a transactionalId parameter
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
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/SourceWithContext.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$PartitionOffset.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$TransactionalMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Results.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Subscription.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Committer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$Control.html
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
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html)*