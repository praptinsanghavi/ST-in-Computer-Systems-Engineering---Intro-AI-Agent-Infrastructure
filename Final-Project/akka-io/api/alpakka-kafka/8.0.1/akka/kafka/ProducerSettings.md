---
description: Alpakka Kafka 8.0.1 - akka.kafka.ProducerSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/ProducerSettings.html
title: Alpakka Kafka 8.0.1 - akka.kafka.ProducerSettings
---

# Alpakka Kafka 8.0.1 - akka.kafka.ProducerSettings

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.ProducerSettings

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
- ProducerSettings
- [RestrictedConsumer](RestrictedConsumer.html "Offers parts of the org.apache.kafka.clients.consumer.Consumer API which becomes available to the akka.kafka.scaladsl.PartitionAssignmentHandler callbacks.")
- [Subscription](Subscription.html)
- [Subscriptions](Subscriptions$.html)
- [TopicPartitionsAssigned](TopicPartitionsAssigned.html)
- [TopicPartitionsRevoked](TopicPartitionsRevoked.html)
- [Version](Version$.html)
- [WakeupsExceeded](WakeupsExceeded.html)
[c](ProducerSettings$.html "See companion object")[akka](../index.html).[kafka](index.html)

# [ProducerSettings](ProducerSettings$.html "See companion object")[**](../../akka/kafka/ProducerSettings.html "Permalink")

### Companion [object ProducerSettings](ProducerSettings$.html "See companion object")

#### class ProducerSettings\[K, V] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Settings for producers. See `akka.kafka.producer` section in
reference.conf. Note that the [companion](ProducerSettings$.html) object provides
`apply` and `create` functions for convenient construction of the settings, together with
the `with` methods.

The constructor is Internal API.

Source[ProducerSettings.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/ProducerSettings.scala#L230)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ProducerSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/kafka/ProducerSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/kafka/ProducerSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/kafka/ProducerSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/kafka/ProducerSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/kafka/ProducerSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/kafka/ProducerSettings.html#closeProducerOnStop:Boolean "Permalink")  val closeProducerOnStop: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
7. [**](../../akka/kafka/ProducerSettings.html#closeTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val closeTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
8. [**](../../akka/kafka/ProducerSettings.html#createKafkaProducer():org.apache.kafka.clients.producer.Producer[K,V] "Permalink")  def createKafkaProducer(): [Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/Producer.html#org.apache.kafka.clients.producer.Producer)\[K, V]Create a `Producer` instance from these settings.

Create a `Producer` instance from these settings.

This will fail with `IllegalStateException` if asynchronous enrichment is set up \-\- always prefer createKafkaProducerAsync() or createKafkaProducerCompletionStage().

Exceptions thrown`IllegalStateException` if asynchronous enrichment is set via `withEnrichAsync` or `withEnrichCompletionStage`, you must use `createKafkaProducerAsync` / `createKafkaProducerCompletionStage` to apply it
9. [**](../../akka/kafka/ProducerSettings.html#createKafkaProducerAsync()(implicitexecutionContext:scala.concurrent.ExecutionContext):scala.concurrent.Future[org.apache.kafka.clients.producer.Producer[K,V]] "Permalink")  def createKafkaProducerAsync()(implicit executionContext: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/Producer.html#org.apache.kafka.clients.producer.Producer)\[K, V]]Scala API.

Scala API.

Create a [Kafka Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/Producer.html) instance from these settings
(without blocking for `enriched`).
10. [**](../../akka/kafka/ProducerSettings.html#createKafkaProducerCompletionStage(executor:java.util.concurrent.Executor):java.util.concurrent.CompletionStage[org.apache.kafka.clients.producer.Producer[K,V]] "Permalink")  def createKafkaProducerCompletionStage(executor: [Executor](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor)): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/Producer.html#org.apache.kafka.clients.producer.Producer)\[K, V]]Java API.

Java API.

Create a [Kafka Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/Producer.html) instance from these settings
(without blocking for `enriched`).

executorExecutor for asynchronous producer creation
11. [**](../../akka/kafka/ProducerSettings.html#dispatcher:String "Permalink")  val dispatcher: String
12. [**](../../akka/kafka/ProducerSettings.html#enrichAsync:Option[akka.kafka.ProducerSettings[K,V]=>scala.concurrent.Future[akka.kafka.ProducerSettings[K,V]]] "Permalink")  val enrichAsync: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(ProducerSettings\[K, V]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[ProducerSettings\[K, V]]]
13. [**](../../akka/kafka/ProducerSettings.html#enriched:scala.concurrent.Future[akka.kafka.ProducerSettings[K,V]] "Permalink")  def enriched: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[ProducerSettings\[K, V]]Applies `enrichAsync` to complement these settings from asynchronous sources.
14. [**](../../akka/kafka/ProducerSettings.html#eosCommitInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val eosCommitInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
15. [**](../../akka/kafka/ProducerSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/kafka/ProducerSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../akka/kafka/ProducerSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
18. [**](../../akka/kafka/ProducerSettings.html#getProperties:java.util.Map[String,AnyRef] "Permalink")  def getProperties: [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Get the Kafka producer settings as map.
19. [**](../../akka/kafka/ProducerSettings.html#getProperty(key:String):String "Permalink")  def getProperty(key: String): StringJava API: Get a raw property.

Java API: Get a raw property. `null` if it is not defined.
20. [**](../../akka/kafka/ProducerSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
21. [**](../../akka/kafka/ProducerSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../akka/kafka/ProducerSettings.html#keySerializerOpt:Option[org.apache.kafka.common.serialization.Serializer[K]] "Permalink")  val keySerializerOpt: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[K]]
23. [**](../../akka/kafka/ProducerSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/kafka/ProducerSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
25. [**](../../akka/kafka/ProducerSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
26. [**](../../akka/kafka/ProducerSettings.html#parallelism:Int "Permalink")  val parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
27. [**](../../akka/kafka/ProducerSettings.html#producerFactorySync:Option[akka.kafka.ProducerSettings[K,V]=>org.apache.kafka.clients.producer.Producer[K,V]] "Permalink")  val producerFactorySync: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(ProducerSettings\[K, V]) \=\> [Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/Producer.html#org.apache.kafka.clients.producer.Producer)\[K, V]]
28. [**](../../akka/kafka/ProducerSettings.html#properties:Map[String,String] "Permalink")  val properties: Map\[String, String]
29. [**](../../akka/kafka/ProducerSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../akka/kafka/ProducerSettings.html#toString():String "Permalink")  def toString(): StringDefinition ClassesProducerSettings → AnyRef → Any
31. [**](../../akka/kafka/ProducerSettings.html#transactionIdPrefix:String "Permalink")  val transactionIdPrefix: String
32. [**](../../akka/kafka/ProducerSettings.html#transactionalMaxInFlightRequestsPerConnection:Int "Permalink")  val transactionalMaxInFlightRequestsPerConnection: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
33. [**](../../akka/kafka/ProducerSettings.html#valueSerializerOpt:Option[org.apache.kafka.common.serialization.Serializer[V]] "Permalink")  val valueSerializerOpt: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[V]]
34. [**](../../akka/kafka/ProducerSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../akka/kafka/ProducerSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../akka/kafka/ProducerSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
37. [**](../../akka/kafka/ProducerSettings.html#withBootstrapServers(bootstrapServers:String):akka.kafka.ProducerSettings[K,V] "Permalink")  def withBootstrapServers(bootstrapServers: String): ProducerSettings\[K, V]A comma\-separated list of host/port pairs to use for establishing the initial connection to the Kafka cluster.
38. [**](../../akka/kafka/ProducerSettings.html#withClientId(clientId:String):akka.kafka.ProducerSettings[K,V] "Permalink")  def withClientId(clientId: String): ProducerSettings\[K, V]An id string to pass to the server when making requests.

An id string to pass to the server when making requests. The purpose of this is to be able to track the source
of requests beyond just ip/port by allowing a logical application name to be included in server\-side request logging.
39. [**](../../akka/kafka/ProducerSettings.html#withCloseProducerOnStop(closeProducerOnStop:Boolean):akka.kafka.ProducerSettings[K,V] "Permalink")  def withCloseProducerOnStop(closeProducerOnStop: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ProducerSettings\[K, V]Call `KafkaProducer.close` on the [org.apache.kafka.clients.producer.KafkaProducer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/KafkaProducer.html) when the producer stage
receives a shutdown signal.
40. [**](../../akka/kafka/ProducerSettings.html#withCloseTimeout(closeTimeout:java.time.Duration):akka.kafka.ProducerSettings[K,V] "Permalink")  def withCloseTimeout(closeTimeout: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ProducerSettings\[K, V]Java API:
Duration to wait for `KafkaProducer.close` to finish.
41. [**](../../akka/kafka/ProducerSettings.html#withCloseTimeout(closeTimeout:scala.concurrent.duration.FiniteDuration):akka.kafka.ProducerSettings[K,V] "Permalink")  def withCloseTimeout(closeTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ProducerSettings\[K, V]Duration to wait for `KafkaProducer.close` to finish.
42. [**](../../akka/kafka/ProducerSettings.html#withDispatcher(dispatcher:String):akka.kafka.ProducerSettings[K,V] "Permalink")  def withDispatcher(dispatcher: String): ProducerSettings\[K, V]Fully qualified config path which holds the dispatcher configuration
to be used by the producer stages.

Fully qualified config path which holds the dispatcher configuration
to be used by the producer stages. Some blocking may occur.
When this value is empty, the dispatcher configured for the stream
will be used.
43. [**](../../akka/kafka/ProducerSettings.html#withEnrichAsync(value:akka.kafka.ProducerSettings[K,V]=>scala.concurrent.Future[akka.kafka.ProducerSettings[K,V]]):akka.kafka.ProducerSettings[K,V] "Permalink")  def withEnrichAsync(value: (ProducerSettings\[K, V]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[ProducerSettings\[K, V]]): ProducerSettings\[K, V]Scala API.

Scala API.
A hook to allow for resolving some settings asynchronously.

Since2\.0\.0
44. [**](../../akka/kafka/ProducerSettings.html#withEnrichCompletionStage(value:java.util.function.Function[akka.kafka.ProducerSettings[K,V],java.util.concurrent.CompletionStage[akka.kafka.ProducerSettings[K,V]]]):akka.kafka.ProducerSettings[K,V] "Permalink")  def withEnrichCompletionStage(value: [Function](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[ProducerSettings\[K, V], [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[ProducerSettings\[K, V]]]): ProducerSettings\[K, V]Java API.

Java API.
A hook to allow for resolving some settings asynchronously.

Since2\.0\.0
45. [**](../../akka/kafka/ProducerSettings.html#withEosCommitInterval(eosCommitInterval:java.time.Duration):akka.kafka.ProducerSettings[K,V] "Permalink")  def withEosCommitInterval(eosCommitInterval: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ProducerSettings\[K, V]Java API:
The time interval to commit a transaction when using the `Transactional.sink` or `Transactional.flow`.
46. [**](../../akka/kafka/ProducerSettings.html#withEosCommitInterval(eosCommitInterval:scala.concurrent.duration.FiniteDuration):akka.kafka.ProducerSettings[K,V] "Permalink")  def withEosCommitInterval(eosCommitInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ProducerSettings\[K, V]The time interval to commit a transaction when using the `Transactional.sink` or `Transactional.flow`.
47. [**](../../akka/kafka/ProducerSettings.html#withParallelism(parallelism:Int):akka.kafka.ProducerSettings[K,V] "Permalink")  def withParallelism(parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ProducerSettings\[K, V]Tuning parameter of how many sends that can run in parallel.
48. [**](../../akka/kafka/ProducerSettings.html#withProducer(producer:org.apache.kafka.clients.producer.Producer[K,V]):akka.kafka.ProducerSettings[K,V] "Permalink")  def withProducer(producer: [Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/Producer.html#org.apache.kafka.clients.producer.Producer)\[K, V]): ProducerSettings\[K, V]Replaces the default Kafka producer creation logic with an external producer.

Replaces the default Kafka producer creation logic with an external producer. This will also set
`closeProducerOnStop = false` by default.
49. [**](../../akka/kafka/ProducerSettings.html#withProducerFactory(factory:akka.kafka.ProducerSettings[K,V]=>org.apache.kafka.clients.producer.Producer[K,V]):akka.kafka.ProducerSettings[K,V] "Permalink")  def withProducerFactory(factory: (ProducerSettings\[K, V]) \=\> [Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/Producer.html#org.apache.kafka.clients.producer.Producer)\[K, V]): ProducerSettings\[K, V]Replaces the default Kafka producer creation logic.
50. [**](../../akka/kafka/ProducerSettings.html#withProperties(properties:java.util.Map[String,String]):akka.kafka.ProducerSettings[K,V] "Permalink")  def withProperties(properties: [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String]): ProducerSettings\[K, V]Java API:
The raw properties of the kafka\-clients driver, see constants in
[org.apache.kafka.clients.producer.ProducerConfig](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerConfig.html).
51. [**](../../akka/kafka/ProducerSettings.html#withProperties(properties:(String,String)*):akka.kafka.ProducerSettings[K,V] "Permalink")  def withProperties(properties: (String, String)\*): ProducerSettings\[K, V]Scala API:
The raw properties of the kafka\-clients driver, see constants in
[org.apache.kafka.clients.producer.ProducerConfig](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerConfig.html).
52. [**](../../akka/kafka/ProducerSettings.html#withProperties(properties:Map[String,String]):akka.kafka.ProducerSettings[K,V] "Permalink")  def withProperties(properties: Map\[String, String]): ProducerSettings\[K, V]Scala API:
The raw properties of the kafka\-clients driver, see constants in
[org.apache.kafka.clients.producer.ProducerConfig](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerConfig.html).
53. [**](../../akka/kafka/ProducerSettings.html#withProperty(key:String,value:String):akka.kafka.ProducerSettings[K,V] "Permalink")  def withProperty(key: String, value: String): ProducerSettings\[K, V]The raw properties of the kafka\-clients driver, see constants in
[org.apache.kafka.clients.producer.ProducerConfig](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerConfig.html).
54. [**](../../akka/kafka/ProducerSettings.html#withTransactionIdPrefix(transactionIdPrefix:String):akka.kafka.ProducerSettings[K,V] "Permalink")  def withTransactionIdPrefix(transactionIdPrefix: String): ProducerSettings\[K, V]The prefix to append to the generated transaction id when using the `Transactional.sink` or `Transactional.flow`.
55. [**](../../akka/kafka/ProducerSettings.html#withTransactionalMaxInFlightRequestsPerConnection(value:Int):akka.kafka.ProducerSettings[K,V] "Permalink")  def withTransactionalMaxInFlightRequestsPerConnection(value: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ProducerSettings\[K, V]The value of `max.in.flight.requests.per.connection` used by the transactional producer.

The value of `max.in.flight.requests.per.connection` used by the transactional producer.
Defaults to `1`. Kafka 2\.5\+ (KIP\-360\) supports up to `5` in\-flight requests with
exactly\-once semantics, which can improve throughput.
### Deprecated Value Members

1. [**](../../akka/kafka/ProducerSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/kafka/ProducerSettings.html#producerFactory:akka.kafka.ProducerSettings[K,V]=>org.apache.kafka.clients.producer.Producer[K,V] "Permalink")  def producerFactory: (ProducerSettings\[K, V]) \=\> [Producer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/Producer.html#org.apache.kafka.clients.producer.Producer)\[K, V]Annotations@deprecated Deprecated*(Since version 2\.0\.0\)* Use createKafkaProducer(), createKafkaProducerAsync(), or createKafkaProducerCompletionStage() to get a new KafkaProducer
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
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings.html)*