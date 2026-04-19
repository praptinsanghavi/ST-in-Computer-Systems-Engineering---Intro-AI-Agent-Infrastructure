---
description: Alpakka Kafka 6.0.0 - akka.kafka.javadsl.Producer
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/javadsl/Producer$.html
title: Alpakka Kafka 6.0.0 - akka.kafka.javadsl.Producer
---

# Alpakka Kafka 6.0.0 - akka.kafka.javadsl.Producer

> **Summary:** Alpakka Kafka 6.0.0 - akka.kafka.javadsl.Producer

## Content

Alpakka Kafka6\.0\.0 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/kafka/index.html "Permalink")  package [kafka](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/kafka/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[kafka](../index.html)
- [Committer](Committer$.html)
- [Consumer](Consumer$.html "Akka Stream connector for subscribing to Kafka topics.")
- [DiscoverySupport](DiscoverySupport$.html "Scala API.")
- [MetadataClient](MetadataClient.html)
- [PartitionAssignmentHandler](PartitionAssignmentHandler.html "The API is new and may change in further releases.")
- Producer
- [SendProducer](SendProducer.html "Utility class for producing to Kafka without using Akka Streams.")
- [Transactional](Transactional$.html "Akka Stream connector to support transactions between Kafka topics.")
o[akka](../../index.html).[kafka](../index.html).[javadsl](index.html)

# Producer[**](../../../akka/kafka/javadsl/Producer$.html "Permalink")

### 

#### object Producer

Akka Stream connector for publishing messages to Kafka topics.

Source[Producer.scala](https://github.com/akka/alpakka-kafka/tree/v6.0.0/core/src/main/scala/akka/kafka/javadsl/Producer.scala#L23)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.13/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.13/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Producer
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/kafka/javadsl/Producer$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.13/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.13/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/kafka/javadsl/Producer$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.13/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/kafka/javadsl/Producer$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.13/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.13/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/kafka/javadsl/Producer$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/kafka/javadsl/Producer$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.13/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/kafka/javadsl/Producer$.html#committableSink[K,V,IN<:akka.kafka.ProducerMessage.Envelope[K,V,akka.kafka.ConsumerMessage.Committable]](producerSettings:akka.kafka.ProducerSettings[K,V],committerSettings:akka.kafka.CommitterSettings):akka.stream.javadsl.Sink[IN,java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def committableSink\[K, V, IN \<: [Envelope](../ProducerMessage$$Envelope.html)\[K, V, [Committable](../ConsumerMessage$$Committable.html)]](producerSettings: [ProducerSettings](../ProducerSettings.html)\[K, V], committerSettings: [CommitterSettings](../CommitterSettings.html)): [Sink](https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/Sink.html#akka.stream.javadsl.Sink)\[IN, [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka/2.9.3/akka/Done.html#akka.Done)]]Create a sink that is aware of the [committable offset](../ConsumerMessage$$Committable.html)
from a [Consumer.committableSource](Consumer$.html#committableSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.kafka.javadsl.Consumer.Control]).

Create a sink that is aware of the [committable offset](../ConsumerMessage$$Committable.html)
from a [Consumer.committableSource](Consumer$.html#committableSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.kafka.javadsl.Consumer.Control]). The offsets are batched and committed regularly.

It publishes records to Kafka topics conditionally:

\- [Message](../ProducerMessage$$Message.html) publishes a single message to its topic, and commits the offset

\- [MultiMessage](../ProducerMessage$$MultiMessage.html) publishes all messages in its `records` field, and commits the offset

\- [PassThroughMessage](../ProducerMessage$$PassThroughMessage.html) does not publish anything, but commits the offset

Note that there is a risk that something fails after publishing but before
committing, so it is "at\-least once delivery" semantics.
7. [**](../../../akka/kafka/javadsl/Producer$.html#committableSinkWithOffsetContext[K,V,IN<:akka.kafka.ProducerMessage.Envelope[K,V,_],C<:akka.kafka.ConsumerMessage.Committable](producerSettings:akka.kafka.ProducerSettings[K,V],committerSettings:akka.kafka.CommitterSettings):akka.stream.javadsl.Sink[akka.japi.Pair[IN,C],java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def committableSinkWithOffsetContext\[K, V, IN \<: [Envelope](../ProducerMessage$$Envelope.html)\[K, V, \_], C \<: [Committable](../ConsumerMessage$$Committable.html)](producerSettings: [ProducerSettings](../ProducerSettings.html)\[K, V], committerSettings: [CommitterSettings](../CommitterSettings.html)): [Sink](https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/Sink.html#akka.stream.javadsl.Sink)\[[Pair](https://doc.akka.io/api/akka/2.9.3/akka/japi/Pair.html#akka.japi.Pair)\[IN, C], [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka/2.9.3/akka/Done.html#akka.Done)]]Create a sink that is aware of the [committable offset](../ConsumerMessage$$Committable.html) passed as
context from a [Consumer.sourceWithOffsetContext](Consumer$.html#sourceWithOffsetContext[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription,metadataFromRecord:java.util.function.Function[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],String]):akka.stream.javadsl.SourceWithContext[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.ConsumerMessage.CommittableOffset,akka.kafka.javadsl.Consumer.Control]).

Create a sink that is aware of the [committable offset](../ConsumerMessage$$Committable.html) passed as
context from a [Consumer.sourceWithOffsetContext](Consumer$.html#sourceWithOffsetContext[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription,metadataFromRecord:java.util.function.Function[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],String]):akka.stream.javadsl.SourceWithContext[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.ConsumerMessage.CommittableOffset,akka.kafka.javadsl.Consumer.Control]). The offsets are batched and committed regularly.

It publishes records to Kafka topics conditionally:

\- [Message](../ProducerMessage$$Message.html) publishes a single message to its topic, and commits the offset

\- [MultiMessage](../ProducerMessage$$MultiMessage.html) publishes all messages in its `records` field, and commits the offset

\- [PassThroughMessage](../ProducerMessage$$PassThroughMessage.html) does not publish anything, but commits the offset

Note that there is a risk that something fails after publishing but before
committing, so it is "at\-least once delivery" semantics.

Annotations@ApiMayChange()
8. [**](../../../akka/kafka/javadsl/Producer$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.13/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.13/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../akka/kafka/javadsl/Producer$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.13/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.13/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../akka/kafka/javadsl/Producer$.html#flexiFlow[K,V,PassThrough](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.Flow[akka.kafka.ProducerMessage.Envelope[K,V,PassThrough],akka.kafka.ProducerMessage.Results[K,V,PassThrough],akka.NotUsed] "Permalink")  def flexiFlow\[K, V, PassThrough](settings: [ProducerSettings](../ProducerSettings.html)\[K, V]): [Flow](https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Envelope](../ProducerMessage$$Envelope.html)\[K, V, PassThrough], [Results](../ProducerMessage$$Results.html)\[K, V, PassThrough], [NotUsed](https://doc.akka.io/api/akka/2.9.3/akka/NotUsed.html#akka.NotUsed)]Create a flow to conditionally publish records to Kafka topics and then pass it on.

Create a flow to conditionally publish records to Kafka topics and then pass it on.

It publishes records to Kafka topics conditionally:

\- [Message](../ProducerMessage$$Message.html) publishes a single message to its topic, and continues in the stream as [Result](../ProducerMessage$$Result.html)

\- [MultiMessage](../ProducerMessage$$MultiMessage.html) publishes all messages in its `records` field, and continues in the stream as [MultiResult](../ProducerMessage$$MultiResult.html)

\- [PassThroughMessage](../ProducerMessage$$PassThroughMessage.html) does not publish anything, and continues in the stream as [PassThroughResult](../ProducerMessage$$PassThroughResult.html)

The messages support the possibility to pass through arbitrary data, which can for example be a [CommittableOffset](../ConsumerMessage$$CommittableOffset.html)
or [CommittableOffsetBatch](../ConsumerMessage$$CommittableOffsetBatch.html) that can
be committed later in the flow.
11. [**](../../../akka/kafka/javadsl/Producer$.html#flowWithContext[K,V,C](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.FlowWithContext[akka.kafka.ProducerMessage.Envelope[K,V,akka.NotUsed],C,akka.kafka.ProducerMessage.Results[K,V,C],C,akka.NotUsed] "Permalink")  def flowWithContext\[K, V, C](settings: [ProducerSettings](../ProducerSettings.html)\[K, V]): [FlowWithContext](https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/FlowWithContext.html#akka.stream.javadsl.FlowWithContext)\[[Envelope](../ProducerMessage$$Envelope.html)\[K, V, [NotUsed](https://doc.akka.io/api/akka/2.9.3/akka/NotUsed.html#akka.NotUsed)], C, [Results](../ProducerMessage$$Results.html)\[K, V, C], C, [NotUsed](https://doc.akka.io/api/akka/2.9.3/akka/NotUsed.html#akka.NotUsed)]API MAY CHANGE

API MAY CHANGE

Create a flow to conditionally publish records to Kafka topics and then pass it on.

It publishes records to Kafka topics conditionally:

\- [Message](../ProducerMessage$$Message.html) publishes a single message to its topic, and continues in the stream as [Result](../ProducerMessage$$Result.html)

\- [MultiMessage](../ProducerMessage$$MultiMessage.html) publishes all messages in its `records` field, and continues in the stream as [MultiResult](../ProducerMessage$$MultiResult.html)

\- [PassThroughMessage](../ProducerMessage$$PassThroughMessage.html) does not publish anything, and continues in the stream as [PassThroughResult](../ProducerMessage$$PassThroughResult.html)

This flow is intended to be used with Akka's \[flow with context](https://doc.akka.io/libraries/akka\-core/current/stream/operators/Flow/asFlowWithContext.html).

Cthe flow context type

Annotations@ApiMayChange()
12. [**](../../../akka/kafka/javadsl/Producer$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.13/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../akka/kafka/javadsl/Producer$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.13/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
14. [**](../../../akka/kafka/javadsl/Producer$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.13/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/kafka/javadsl/Producer$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.13/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.13/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/kafka/javadsl/Producer$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.13/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
17. [**](../../../akka/kafka/javadsl/Producer$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.13/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
18. [**](../../../akka/kafka/javadsl/Producer$.html#plainSink[K,V](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.Sink[org.apache.kafka.clients.producer.ProducerRecord[K,V],java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def plainSink\[K, V](settings: [ProducerSettings](../ProducerSettings.html)\[K, V]): [Sink](https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/Sink.html#akka.stream.javadsl.Sink)\[[ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/3.7.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V], [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka/2.9.3/akka/Done.html#akka.Done)]]Create a sink for publishing records to Kafka topics.

Create a sink for publishing records to Kafka topics.

The [Kafka ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/3.7.0/org/apache/kafka/clients/producer/ProducerRecord.html) contains the topic name to which the record is being sent, an optional
partition number, and an optional key and value.
19. [**](../../../akka/kafka/javadsl/Producer$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../akka/kafka/javadsl/Producer$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../akka/kafka/javadsl/Producer$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.13/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/kafka/javadsl/Producer$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.13/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.13/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.13/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/kafka/javadsl/Producer$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.13/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.13/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/kafka/javadsl/Producer$.html#committableSink[K,V](settings:akka.kafka.ProducerSettings[K,V],producer:org.apache.kafka.clients.producer.Producer[K,V]):akka.stream.javadsl.Sink[akka.kafka.ProducerMessage.Envelope[K,V,akka.kafka.ConsumerMessage.Committable],java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def committableSink\[K, V](settings: [ProducerSettings](../ProducerSettings.html)\[K, V], producer: [org.apache.kafka.clients.producer.Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/3.7.0/org/apache/kafka/clients/producer/Producer.html#org.apache.kafka.clients.producer.Producer)\[K, V]): [Sink](https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/Sink.html#akka.stream.javadsl.Sink)\[[Envelope](../ProducerMessage$$Envelope.html)\[K, V, [Committable](../ConsumerMessage$$Committable.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka/2.9.3/akka/Done.html#akka.Done)]]Create a sink that is aware of the [committable offset](../ConsumerMessage$$Committable.html)
from a [Consumer.committableSource](Consumer$.html#committableSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.kafka.javadsl.Consumer.Control]).

Create a sink that is aware of the [committable offset](../ConsumerMessage$$Committable.html)
from a [Consumer.committableSource](Consumer$.html#committableSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.kafka.javadsl.Consumer.Control]). It will commit the consumer offset when the message has
been published successfully to the topic.

It publishes records to Kafka topics conditionally:

\- [Message](../ProducerMessage$$Message.html) publishes a single message to its topic, and commits the offset

\- [MultiMessage](../ProducerMessage$$MultiMessage.html) publishes all messages in its `records` field, and commits the offset

\- [PassThroughMessage](../ProducerMessage$$PassThroughMessage.html) does not publish anything, but commits the offset

Note that there is always a risk that something fails after publishing but before
committing, so it is "at\-least once delivery" semantics.

Supports sharing a Kafka Producer instance.

Annotations@Deprecated Deprecated
2. [**](../../../akka/kafka/javadsl/Producer$.html#committableSink[K,V,IN<:akka.kafka.ProducerMessage.Envelope[K,V,akka.kafka.ConsumerMessage.Committable]](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.Sink[IN,java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def committableSink\[K, V, IN \<: [Envelope](../ProducerMessage$$Envelope.html)\[K, V, [Committable](../ConsumerMessage$$Committable.html)]](settings: [ProducerSettings](../ProducerSettings.html)\[K, V]): [Sink](https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/Sink.html#akka.stream.javadsl.Sink)\[IN, [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka/2.9.3/akka/Done.html#akka.Done)]]Create a sink that is aware of the [committable offset](../ConsumerMessage$$Committable.html)
from a [Consumer.committableSource](Consumer$.html#committableSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.kafka.javadsl.Consumer.Control]).

Create a sink that is aware of the [committable offset](../ConsumerMessage$$Committable.html)
from a [Consumer.committableSource](Consumer$.html#committableSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.kafka.javadsl.Consumer.Control]). It will commit the consumer offset when the message has
been published successfully to the topic.

It publishes records to Kafka topics conditionally:

\- [Message](../ProducerMessage$$Message.html) publishes a single message to its topic, and commits the offset

\- [MultiMessage](../ProducerMessage$$MultiMessage.html) publishes all messages in its `records` field, and commits the offset

\- [PassThroughMessage](../ProducerMessage$$PassThroughMessage.html) does not publish anything, but commits the offset

Note that there is a risk that something fails after publishing but before
committing, so it is "at\-least once delivery" semantics.

Annotations@Deprecated Deprecated
3. [**](../../../akka/kafka/javadsl/Producer$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.13/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
4. [**](../../../akka/kafka/javadsl/Producer$.html#flexiFlow[K,V,PassThrough](settings:akka.kafka.ProducerSettings[K,V],producer:org.apache.kafka.clients.producer.Producer[K,V]):akka.stream.javadsl.Flow[akka.kafka.ProducerMessage.Envelope[K,V,PassThrough],akka.kafka.ProducerMessage.Results[K,V,PassThrough],akka.NotUsed] "Permalink")  def flexiFlow\[K, V, PassThrough](settings: [ProducerSettings](../ProducerSettings.html)\[K, V], producer: [org.apache.kafka.clients.producer.Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/3.7.0/org/apache/kafka/clients/producer/Producer.html#org.apache.kafka.clients.producer.Producer)\[K, V]): [Flow](https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Envelope](../ProducerMessage$$Envelope.html)\[K, V, PassThrough], [Results](../ProducerMessage$$Results.html)\[K, V, PassThrough], [NotUsed](https://doc.akka.io/api/akka/2.9.3/akka/NotUsed.html#akka.NotUsed)]Create a flow to conditionally publish records to Kafka topics and then pass it on.

Create a flow to conditionally publish records to Kafka topics and then pass it on.

It publishes records to Kafka topics conditionally:

\- [Message](../ProducerMessage$$Message.html) publishes a single message to its topic, and continues in the stream as [Result](../ProducerMessage$$Result.html)

\- [MultiMessage](../ProducerMessage$$MultiMessage.html) publishes all messages in its `records` field, and continues in the stream as [MultiResult](../ProducerMessage$$MultiResult.html)

\- [PassThroughMessage](../ProducerMessage$$PassThroughMessage.html) does not publish anything, and continues in the stream as [PassThroughResult](../ProducerMessage$$PassThroughResult.html)

The messages support the possibility to pass through arbitrary data, which can for example be a [CommittableOffset](../ConsumerMessage$$CommittableOffset.html)
or [CommittableOffsetBatch](../ConsumerMessage$$CommittableOffsetBatch.html) that can
be committed later in the flow.

Supports sharing a Kafka Producer instance.

Annotations@Deprecated Deprecated
5. [**](../../../akka/kafka/javadsl/Producer$.html#flow[K,V,PassThrough](settings:akka.kafka.ProducerSettings[K,V],producer:org.apache.kafka.clients.producer.Producer[K,V]):akka.stream.javadsl.Flow[akka.kafka.ProducerMessage.Message[K,V,PassThrough],akka.kafka.ProducerMessage.Result[K,V,PassThrough],akka.NotUsed] "Permalink")  def flow\[K, V, PassThrough](settings: [ProducerSettings](../ProducerSettings.html)\[K, V], producer: [org.apache.kafka.clients.producer.Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/3.7.0/org/apache/kafka/clients/producer/Producer.html#org.apache.kafka.clients.producer.Producer)\[K, V]): [Flow](https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Message](../ProducerMessage$$Message.html)\[K, V, PassThrough], [Result](../ProducerMessage$$Result.html)\[K, V, PassThrough], [NotUsed](https://doc.akka.io/api/akka/2.9.3/akka/NotUsed.html#akka.NotUsed)]Create a flow to publish records to Kafka topics and then pass it on.

Create a flow to publish records to Kafka topics and then pass it on.

The records must be wrapped in a [Message](../ProducerMessage$$Message.html) and continue in the stream as [Result](../ProducerMessage$$Result.html).

The messages support the possibility to pass through arbitrary data, which can for example be a [CommittableOffset](../ConsumerMessage$$CommittableOffset.html)
or [CommittableOffsetBatch](../ConsumerMessage$$CommittableOffsetBatch.html) that can
be committed later in the flow.

Supports sharing a Kafka Producer instance.

Annotations@Deprecated Deprecated
6. [**](../../../akka/kafka/javadsl/Producer$.html#flow[K,V,PassThrough](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.Flow[akka.kafka.ProducerMessage.Message[K,V,PassThrough],akka.kafka.ProducerMessage.Result[K,V,PassThrough],akka.NotUsed] "Permalink")  def flow\[K, V, PassThrough](settings: [ProducerSettings](../ProducerSettings.html)\[K, V]): [Flow](https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Message](../ProducerMessage$$Message.html)\[K, V, PassThrough], [Result](../ProducerMessage$$Result.html)\[K, V, PassThrough], [NotUsed](https://doc.akka.io/api/akka/2.9.3/akka/NotUsed.html#akka.NotUsed)]Create a flow to publish records to Kafka topics and then pass it on.

Create a flow to publish records to Kafka topics and then pass it on.

The records must be wrapped in a [Message](../ProducerMessage$$Message.html) and continue in the stream as [Result](../ProducerMessage$$Result.html).

The messages support the possibility to pass through arbitrary data, which can for example be a [CommittableOffset](../ConsumerMessage$$CommittableOffset.html)
or [CommittableOffsetBatch](../ConsumerMessage$$CommittableOffsetBatch.html) that can
be committed later in the flow.

Annotations@Deprecated Deprecated
7. [**](../../../akka/kafka/javadsl/Producer$.html#flowWithContext[K,V,C](settings:akka.kafka.ProducerSettings[K,V],producer:org.apache.kafka.clients.producer.Producer[K,V]):akka.stream.javadsl.FlowWithContext[akka.kafka.ProducerMessage.Envelope[K,V,akka.NotUsed],C,akka.kafka.ProducerMessage.Results[K,V,C],C,akka.NotUsed] "Permalink")  def flowWithContext\[K, V, C](settings: [ProducerSettings](../ProducerSettings.html)\[K, V], producer: [org.apache.kafka.clients.producer.Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/3.7.0/org/apache/kafka/clients/producer/Producer.html#org.apache.kafka.clients.producer.Producer)\[K, V]): [FlowWithContext](https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/FlowWithContext.html#akka.stream.javadsl.FlowWithContext)\[[Envelope](../ProducerMessage$$Envelope.html)\[K, V, [NotUsed](https://doc.akka.io/api/akka/2.9.3/akka/NotUsed.html#akka.NotUsed)], C, [Results](../ProducerMessage$$Results.html)\[K, V, C], C, [NotUsed](https://doc.akka.io/api/akka/2.9.3/akka/NotUsed.html#akka.NotUsed)]API MAY CHANGE

API MAY CHANGE

Create a flow to conditionally publish records to Kafka topics and then pass it on.

It publishes records to Kafka topics conditionally:

\- [Message](../ProducerMessage$$Message.html) publishes a single message to its topic, and continues in the stream as [Result](../ProducerMessage$$Result.html)

\- [MultiMessage](../ProducerMessage$$MultiMessage.html) publishes all messages in its `records` field, and continues in the stream as [MultiResult](../ProducerMessage$$MultiResult.html)

\- [PassThroughMessage](../ProducerMessage$$PassThroughMessage.html) does not publish anything, and continues in the stream as [PassThroughResult](../ProducerMessage$$PassThroughResult.html)

This flow is intended to be used with Akka's \[flow with context](https://doc.akka.io/libraries/akka\-core/current/stream/operators/Flow/asFlowWithContext.html).

Supports sharing a Kafka Producer instance.

Cthe flow context type

Annotations@Deprecated @ApiMayChange() Deprecated
8. [**](../../../akka/kafka/javadsl/Producer$.html#plainSink[K,V](settings:akka.kafka.ProducerSettings[K,V],producer:org.apache.kafka.clients.producer.Producer[K,V]):akka.stream.javadsl.Sink[org.apache.kafka.clients.producer.ProducerRecord[K,V],java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def plainSink\[K, V](settings: [ProducerSettings](../ProducerSettings.html)\[K, V], producer: [org.apache.kafka.clients.producer.Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/3.7.0/org/apache/kafka/clients/producer/Producer.html#org.apache.kafka.clients.producer.Producer)\[K, V]): [Sink](https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/Sink.html#akka.stream.javadsl.Sink)\[[ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/3.7.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V], [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka/2.9.3/akka/Done.html#akka.Done)]]Create a sink for publishing records to Kafka topics.

Create a sink for publishing records to Kafka topics.

The [Kafka ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/3.7.0/org/apache/kafka/clients/producer/ProducerRecord.html) contains the topic name to which the record is being sent, an optional
partition number, and an optional key and value.

Supports sharing a Kafka Producer instance.

Annotations@Deprecated Deprecated
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.13/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.13/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.9.3/akka/Done.html
- https://doc.akka.io/api/akka/2.9.3/akka/NotUsed.html
- https://doc.akka.io/api/akka/2.9.3/akka/japi/Pair.html
- https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/api/akka/2.9.3/akka/stream/javadsl/Sink.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/CommitterSettings.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/ConsumerMessage$$Committable.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/ConsumerMessage$$CommittableOffset.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/ProducerMessage$$Envelope.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/ProducerMessage$$Message.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/ProducerMessage$$MultiMessage.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/ProducerMessage$$MultiResult.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/ProducerMessage$$PassThroughMessage.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/ProducerMessage$$PassThroughResult.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/ProducerMessage$$Result.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/ProducerMessage$$Results.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/ProducerSettings.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/javadsl/Committer$.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/javadsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/javadsl/DiscoverySupport$.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/javadsl/MetadataClient$.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/javadsl/MetadataClient.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/javadsl/PartitionAssignmentHandler.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/javadsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/javadsl/SendProducer.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/javadsl/Transactional$.html
- https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/javadsl/index.html
- https://doc.akka.io/api/alpakka-kafka/6.0/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/javadsl/Producer$.html](https://doc.akka.io/api/alpakka-kafka/6.0/akka/kafka/javadsl/Producer$.html)*