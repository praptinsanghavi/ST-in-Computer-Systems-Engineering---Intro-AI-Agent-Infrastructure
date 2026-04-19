---
description: Alpakka Kafka 8.0.1 - akka.kafka.ConsumerSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/ConsumerSettings.html
title: Alpakka Kafka 8.0.1 - akka.kafka.ConsumerSettings
---

# Alpakka Kafka 8.0.1 - akka.kafka.ConsumerSettings

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.ConsumerSettings

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
- ConsumerSettings
- [InitialPollFailed](InitialPollFailed.html)
- [KafkaConnectionFailed](KafkaConnectionFailed.html)
- [KafkaConsumerActor](KafkaConsumerActor$.html)
- [ManualSubscription](ManualSubscription.html "Kafka-speak for these is \"Assignments\".")
- [Metadata](Metadata$.html "Messages for Kafka metadata fetching via KafkaConsumerActor.")
- [OffsetResetProtectionSettings](OffsetResetProtectionSettings.html)
- [ProducerMessage](ProducerMessage$.html "Classes that are used in both javadsl.Producer and scaladsl.Producer.")
- [ProducerSettings](ProducerSettings.html "Settings for producers.")
- [RestrictedConsumer](RestrictedConsumer.html "Offers parts of the org.apache.kafka.clients.consumer.Consumer API which becomes available to the akka.kafka.scaladsl.PartitionAssignmentHandler callbacks.")
- [Subscription](Subscription.html)
- [Subscriptions](Subscriptions$.html)
- [TopicPartitionsAssigned](TopicPartitionsAssigned.html)
- [TopicPartitionsRevoked](TopicPartitionsRevoked.html)
- [Version](Version$.html)
- [WakeupsExceeded](WakeupsExceeded.html)
[c](ConsumerSettings$.html "See companion object")[akka](../index.html).[kafka](index.html)

# [ConsumerSettings](ConsumerSettings$.html "See companion object")[**](../../akka/kafka/ConsumerSettings.html "Permalink")

### Companion [object ConsumerSettings](ConsumerSettings$.html "See companion object")

#### class ConsumerSettings\[K, V] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Settings for consumers. See `akka.kafka.consumer` section in
`reference.conf`. Note that the [companion](ConsumerSettings$.html) object provides
`apply` and `create` functions for convenient construction of the settings, together with
the `with` methods.

The constructor is Internal API.

Source[ConsumerSettings.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/ConsumerSettings.scala#L255)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConsumerSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/kafka/ConsumerSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/kafka/ConsumerSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/kafka/ConsumerSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/kafka/ConsumerSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/kafka/ConsumerSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/kafka/ConsumerSettings.html#closeTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val closeTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
7. [**](../../akka/kafka/ConsumerSettings.html#commitRefreshInterval:scala.concurrent.duration.Duration "Permalink")  val commitRefreshInterval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
8. [**](../../akka/kafka/ConsumerSettings.html#commitTimeWarning:scala.concurrent.duration.FiniteDuration "Permalink")  val commitTimeWarning: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
9. [**](../../akka/kafka/ConsumerSettings.html#commitTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val commitTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
10. [**](../../akka/kafka/ConsumerSettings.html#connectionCheckerSettings:akka.kafka.ConnectionCheckerSettings "Permalink")  val connectionCheckerSettings: [ConnectionCheckerSettings](ConnectionCheckerSettings.html)
11. [**](../../akka/kafka/ConsumerSettings.html#consumerFactory:akka.kafka.ConsumerSettings[K,V]=>org.apache.kafka.clients.consumer.Consumer[K,V] "Permalink")  val consumerFactory: (ConsumerSettings\[K, V]) \=\> [Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html#org.apache.kafka.clients.consumer.Consumer)\[K, V]
12. [**](../../akka/kafka/ConsumerSettings.html#consumerGroupUpdateInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val consumerGroupUpdateInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
13. [**](../../akka/kafka/ConsumerSettings.html#createKafkaConsumer():org.apache.kafka.clients.consumer.Consumer[K,V] "Permalink")  def createKafkaConsumer(): [Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html#org.apache.kafka.clients.consumer.Consumer)\[K, V]Create a [Kafka Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html) instance from these settings.

Create a [Kafka Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html) instance from these settings.

This will fail with `IllegalStateException` if asynchronous enrichment is set up \-\- always prefer createKafkaConsumerAsync() or createKafkaConsumerCompletionStage().

Exceptions thrown`IllegalStateException` if asynchronous enrichment is set via `withEnrichAsync` or `withEnrichCompletionStage`, you must use `createKafkaConsumerAsync` or `createKafkaConsumerCompletionStage` to apply it
14. [**](../../akka/kafka/ConsumerSettings.html#createKafkaConsumerAsync()(implicitexecutionContext:scala.concurrent.ExecutionContext):scala.concurrent.Future[org.apache.kafka.clients.consumer.Consumer[K,V]] "Permalink")  def createKafkaConsumerAsync()(implicit executionContext: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html#org.apache.kafka.clients.consumer.Consumer)\[K, V]]Scala API.

Scala API.

Create a [Kafka Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html) instance from these settings
(without blocking for `enriched`).
15. [**](../../akka/kafka/ConsumerSettings.html#createKafkaConsumerCompletionStage(executor:java.util.concurrent.Executor):java.util.concurrent.CompletionStage[org.apache.kafka.clients.consumer.Consumer[K,V]] "Permalink")  def createKafkaConsumerCompletionStage(executor: [Executor](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor)): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html#org.apache.kafka.clients.consumer.Consumer)\[K, V]]Java API.

Java API.

Create a [Kafka Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html) instance from these settings
(without blocking for `enriched`).
16. [**](../../akka/kafka/ConsumerSettings.html#dispatcher:String "Permalink")  val dispatcher: String
17. [**](../../akka/kafka/ConsumerSettings.html#drainingCheckInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val drainingCheckInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
18. [**](../../akka/kafka/ConsumerSettings.html#enrichAsync:Option[akka.kafka.ConsumerSettings[K,V]=>scala.concurrent.Future[akka.kafka.ConsumerSettings[K,V]]] "Permalink")  val enrichAsync: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(ConsumerSettings\[K, V]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[ConsumerSettings\[K, V]]]
19. [**](../../akka/kafka/ConsumerSettings.html#enriched:scala.concurrent.Future[akka.kafka.ConsumerSettings[K,V]] "Permalink")  def enriched: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[ConsumerSettings\[K, V]]Applies `enrichAsync` to complement these settings from asynchronous sources.
20. [**](../../akka/kafka/ConsumerSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/kafka/ConsumerSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
22. [**](../../akka/kafka/ConsumerSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
23. [**](../../akka/kafka/ConsumerSettings.html#getCloseTimeout:java.time.Duration "Permalink")  def getCloseTimeout: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)
24. [**](../../akka/kafka/ConsumerSettings.html#getMetadataRequestTimeout:java.time.Duration "Permalink")  def getMetadataRequestTimeout: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)
25. [**](../../akka/kafka/ConsumerSettings.html#getOffsetForTimesTimeout:java.time.Duration "Permalink")  def getOffsetForTimesTimeout: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)
26. [**](../../akka/kafka/ConsumerSettings.html#getPositionTimeout:java.time.Duration "Permalink")  def getPositionTimeout: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)
27. [**](../../akka/kafka/ConsumerSettings.html#getProperties:java.util.Map[String,AnyRef] "Permalink")  def getProperties: [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Get the Kafka consumer settings as map.
28. [**](../../akka/kafka/ConsumerSettings.html#getProperty(key:String):String "Permalink")  def getProperty(key: String): StringJava API: Get a raw property.

Java API: Get a raw property. `null` if it is not defined.
29. [**](../../akka/kafka/ConsumerSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
30. [**](../../akka/kafka/ConsumerSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
31. [**](../../akka/kafka/ConsumerSettings.html#keyDeserializerOpt:Option[org.apache.kafka.common.serialization.Deserializer[K]] "Permalink")  val keyDeserializerOpt: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Deserializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Deserializer.html#org.apache.kafka.common.serialization.Deserializer)\[K]]
32. [**](../../akka/kafka/ConsumerSettings.html#metadataRequestTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val metadataRequestTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
33. [**](../../akka/kafka/ConsumerSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
34. [**](../../akka/kafka/ConsumerSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
35. [**](../../akka/kafka/ConsumerSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
36. [**](../../akka/kafka/ConsumerSettings.html#offsetForTimesTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val offsetForTimesTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
37. [**](../../akka/kafka/ConsumerSettings.html#partitionHandlerWarning:scala.concurrent.duration.FiniteDuration "Permalink")  val partitionHandlerWarning: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
38. [**](../../akka/kafka/ConsumerSettings.html#pollInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val pollInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
39. [**](../../akka/kafka/ConsumerSettings.html#pollTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val pollTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
40. [**](../../akka/kafka/ConsumerSettings.html#positionTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val positionTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
41. [**](../../akka/kafka/ConsumerSettings.html#properties:Map[String,String] "Permalink")  val properties: Map\[String, String]
42. [**](../../akka/kafka/ConsumerSettings.html#resetProtectionSettings:akka.kafka.OffsetResetProtectionSettings "Permalink")  val resetProtectionSettings: [OffsetResetProtectionSettings](OffsetResetProtectionSettings.html)
43. [**](../../akka/kafka/ConsumerSettings.html#stopTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val stopTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
44. [**](../../akka/kafka/ConsumerSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
45. [**](../../akka/kafka/ConsumerSettings.html#toString():String "Permalink")  def toString(): StringDefinition ClassesConsumerSettings → AnyRef → Any
46. [**](../../akka/kafka/ConsumerSettings.html#valueDeserializerOpt:Option[org.apache.kafka.common.serialization.Deserializer[V]] "Permalink")  val valueDeserializerOpt: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Deserializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Deserializer.html#org.apache.kafka.common.serialization.Deserializer)\[V]]
47. [**](../../akka/kafka/ConsumerSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
48. [**](../../akka/kafka/ConsumerSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
49. [**](../../akka/kafka/ConsumerSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
50. [**](../../akka/kafka/ConsumerSettings.html#waitClosePartition:scala.concurrent.duration.FiniteDuration "Permalink")  val waitClosePartition: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
51. [**](../../akka/kafka/ConsumerSettings.html#withBootstrapServers(bootstrapServers:String):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withBootstrapServers(bootstrapServers: String): ConsumerSettings\[K, V]A comma\-separated list of host/port pairs to use for establishing the initial connection to the Kafka cluster.
52. [**](../../akka/kafka/ConsumerSettings.html#withClientId(clientId:String):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withClientId(clientId: String): ConsumerSettings\[K, V]An id string to pass to the server when making requests.

An id string to pass to the server when making requests. The purpose of this is to be able to track the source
of requests beyond just ip/port by allowing a logical application name to be included in server\-side request logging.
53. [**](../../akka/kafka/ConsumerSettings.html#withCloseTimeout(closeTimeout:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withCloseTimeout(closeTimeout: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API:
Set duration to wait for `KafkaConsumer.close` to finish.
54. [**](../../akka/kafka/ConsumerSettings.html#withCloseTimeout(closeTimeout:scala.concurrent.duration.FiniteDuration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withCloseTimeout(closeTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConsumerSettings\[K, V]Set duration to wait for `KafkaConsumer.close` to finish.
55. [**](../../akka/kafka/ConsumerSettings.html#withCommitRefreshInterval(commitRefreshInterval:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withCommitRefreshInterval(commitRefreshInterval: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API:
If set to a finite duration, the consumer will re\-send the last committed offsets periodically
for all assigned partitions.

Java API:
If set to a finite duration, the consumer will re\-send the last committed offsets periodically
for all assigned partitions. @see https://issues.apache.org/jira/browse/KAFKA\-4682
Set to `java.time.Duration.ZERO` to switch it off.

See alsohttps://issues.apache.org/jira/browse/KAFKA\-4682
56. [**](../../akka/kafka/ConsumerSettings.html#withCommitRefreshInterval(commitRefreshInterval:scala.concurrent.duration.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withCommitRefreshInterval(commitRefreshInterval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): ConsumerSettings\[K, V]If set to a finite duration, the consumer will re\-send the last committed offsets periodically
for all assigned partitions.

If set to a finite duration, the consumer will re\-send the last committed offsets periodically
for all assigned partitions.

See alsohttps://issues.apache.org/jira/browse/KAFKA\-4682
57. [**](../../akka/kafka/ConsumerSettings.html#withCommitTimeout(commitTimeout:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withCommitTimeout(commitTimeout: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API:
If offset commit requests are not completed within this timeout
the returned Future is completed with [akka.kafka.CommitTimeoutException](CommitTimeoutException.html).
58. [**](../../akka/kafka/ConsumerSettings.html#withCommitTimeout(commitTimeout:scala.concurrent.duration.FiniteDuration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withCommitTimeout(commitTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConsumerSettings\[K, V]If offset commit requests are not completed within this timeout
the returned Future is completed with [akka.kafka.CommitTimeoutException](CommitTimeoutException.html).
59. [**](../../akka/kafka/ConsumerSettings.html#withCommitWarning(commitTimeWarning:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withCommitWarning(commitTimeWarning: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API:
If commits take longer than this time a warning is logged
60. [**](../../akka/kafka/ConsumerSettings.html#withCommitWarning(commitTimeWarning:scala.concurrent.duration.FiniteDuration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withCommitWarning(commitTimeWarning: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConsumerSettings\[K, V]If commits take longer than this time a warning is logged
61. [**](../../akka/kafka/ConsumerSettings.html#withConnectionChecker(kafkaConnectionCheckerConfig:akka.kafka.ConnectionCheckerSettings):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withConnectionChecker(kafkaConnectionCheckerConfig: [ConnectionCheckerSettings](ConnectionCheckerSettings.html)): ConsumerSettings\[K, V]Enable kafka connection checker with provided settings
62. [**](../../akka/kafka/ConsumerSettings.html#withConsumerFactory(factory:akka.kafka.ConsumerSettings[K,V]=>org.apache.kafka.clients.consumer.Consumer[K,V]):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withConsumerFactory(factory: (ConsumerSettings\[K, V]) \=\> [Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html#org.apache.kafka.clients.consumer.Consumer)\[K, V]): ConsumerSettings\[K, V]Replaces the default Kafka consumer creation logic.
63. [**](../../akka/kafka/ConsumerSettings.html#withConsumerGroupUpdateInterval(interval:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withConsumerGroupUpdateInterval(interval: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API: For transactional flows only, how often to push consumer group metadata to the producers
a shorter interval makes the risk of dropping batched elements smaller but at the cost
of more work sending those updates.
64. [**](../../akka/kafka/ConsumerSettings.html#withConsumerGroupUpdateInterval(interval:scala.concurrent.duration.FiniteDuration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withConsumerGroupUpdateInterval(interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConsumerSettings\[K, V]Scala API: For transactional flows only, how often to push consumer group metadata to the producers
a shorter interval makes the risk of dropping batched elements smaller but at the cost
of more work sending those updates.
65. [**](../../akka/kafka/ConsumerSettings.html#withDispatcher(dispatcher:String):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withDispatcher(dispatcher: String): ConsumerSettings\[K, V]Fully qualified config path which holds the dispatcher configuration
to be used by the [akka.kafka.KafkaConsumerActor](KafkaConsumerActor$.html).

Fully qualified config path which holds the dispatcher configuration
to be used by the [akka.kafka.KafkaConsumerActor](KafkaConsumerActor$.html). Some blocking may occur.
66. [**](../../akka/kafka/ConsumerSettings.html#withDrainingCheckInterval(drainingCheckInterval:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withDrainingCheckInterval(drainingCheckInterval: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API: Check interval for TransactionalProducer when finishing transaction before shutting down consumer
67. [**](../../akka/kafka/ConsumerSettings.html#withDrainingCheckInterval(drainingCheckInterval:scala.concurrent.duration.FiniteDuration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withDrainingCheckInterval(drainingCheckInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConsumerSettings\[K, V]Scala API: Check interval for TransactionalProducer when finishing transaction before shutting down consumer
68. [**](../../akka/kafka/ConsumerSettings.html#withEnrichAsync(value:akka.kafka.ConsumerSettings[K,V]=>scala.concurrent.Future[akka.kafka.ConsumerSettings[K,V]]):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withEnrichAsync(value: (ConsumerSettings\[K, V]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[ConsumerSettings\[K, V]]): ConsumerSettings\[K, V]Scala API.

Scala API.
A hook to allow for resolving some settings asynchronously.

Since2\.0\.0
69. [**](../../akka/kafka/ConsumerSettings.html#withEnrichCompletionStage(value:java.util.function.Function[akka.kafka.ConsumerSettings[K,V],java.util.concurrent.CompletionStage[akka.kafka.ConsumerSettings[K,V]]]):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withEnrichCompletionStage(value: [Function](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[ConsumerSettings\[K, V], [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[ConsumerSettings\[K, V]]]): ConsumerSettings\[K, V]Java API.

Java API.
A hook to allow for resolving some settings asynchronously.

Since2\.0\.0
70. [**](../../akka/kafka/ConsumerSettings.html#withGroupId(groupId:String):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withGroupId(groupId: String): ConsumerSettings\[K, V]A unique string that identifies the consumer group this consumer belongs to.
71. [**](../../akka/kafka/ConsumerSettings.html#withGroupInstanceId(groupInstanceId:String):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withGroupInstanceId(groupInstanceId: String): ConsumerSettings\[K, V]An id string that marks consumer as a unique static member of the consumer group.
72. [**](../../akka/kafka/ConsumerSettings.html#withMetadataRequestTimeout(metadataRequestTimeout:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withMetadataRequestTimeout(metadataRequestTimeout: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API
73. [**](../../akka/kafka/ConsumerSettings.html#withMetadataRequestTimeout(metadataRequestTimeout:scala.concurrent.duration.FiniteDuration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withMetadataRequestTimeout(metadataRequestTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConsumerSettings\[K, V]Scala API
74. [**](../../akka/kafka/ConsumerSettings.html#withOffsetForTimesTimeout(offsetForTimesTimeout:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withOffsetForTimesTimeout(offsetForTimesTimeout: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API: Limits the blocking on Kafka consumer offsetForTimes calls.
75. [**](../../akka/kafka/ConsumerSettings.html#withOffsetForTimesTimeout(offsetForTimesTimeout:scala.concurrent.duration.FiniteDuration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withOffsetForTimesTimeout(offsetForTimesTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConsumerSettings\[K, V]Scala API: Limits the blocking on Kafka consumer offsetForTimes calls.
76. [**](../../akka/kafka/ConsumerSettings.html#withPartitionAssignmentStrategies(strategies:Array[String]):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withPartitionAssignmentStrategies(strategies: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[String]): ConsumerSettings\[K, V]A list of class names or class types, ordered by preference, of supported
partition assignment strategies that the client will use to distribute
partition ownership amongst consumer instances when group management is used.

A list of class names or class types, ordered by preference, of supported
partition assignment strategies that the client will use to distribute
partition ownership amongst consumer instances when group management is used.

See https://kafka.apache.org/documentation/\#consumerconfigs\_partition.assignment.strategy
77. [**](../../akka/kafka/ConsumerSettings.html#withPartitionAssignmentStrategyCooperativeStickyAssignor():akka.kafka.ConsumerSettings[K,V] "Permalink")  def withPartitionAssignmentStrategyCooperativeStickyAssignor(): ConsumerSettings\[K, V]Sets the `CooperativeStickyAssignor` assignment strategy.

Sets the `CooperativeStickyAssignor` assignment strategy.

See alsohttps://kafka.apache.org/documentation/\#consumerconfigs\_partition.assignment.strategy

https://kafka.apache.org/33/documentation.html\#upgrade\_300\_notable
78. [**](../../akka/kafka/ConsumerSettings.html#withPartitionHandlerWarning(partitionHandlerWarning:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withPartitionHandlerWarning(partitionHandlerWarning: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API
79. [**](../../akka/kafka/ConsumerSettings.html#withPartitionHandlerWarning(partitionHandlerWarning:scala.concurrent.duration.FiniteDuration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withPartitionHandlerWarning(partitionHandlerWarning: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConsumerSettings\[K, V]Scala API
80. [**](../../akka/kafka/ConsumerSettings.html#withPollInterval(pollInterval:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withPollInterval(pollInterval: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API:
Set the interval from one scheduled poll to the next.
81. [**](../../akka/kafka/ConsumerSettings.html#withPollInterval(pollInterval:scala.concurrent.duration.FiniteDuration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withPollInterval(pollInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConsumerSettings\[K, V]Set the interval from one scheduled poll to the next.
82. [**](../../akka/kafka/ConsumerSettings.html#withPollTimeout(pollTimeout:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withPollTimeout(pollTimeout: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API:
Set the maximum duration a poll to the Kafka broker is allowed to take.
83. [**](../../akka/kafka/ConsumerSettings.html#withPollTimeout(pollTimeout:scala.concurrent.duration.FiniteDuration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withPollTimeout(pollTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConsumerSettings\[K, V]Set the maximum duration a poll to the Kafka broker is allowed to take.
84. [**](../../akka/kafka/ConsumerSettings.html#withPositionTimeout(positionTimeout:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withPositionTimeout(positionTimeout: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API: Limits the blocking on Kafka consumer position calls.
85. [**](../../akka/kafka/ConsumerSettings.html#withPositionTimeout(positionTimeout:scala.concurrent.duration.FiniteDuration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withPositionTimeout(positionTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConsumerSettings\[K, V]Scala API: Limits the blocking on Kafka consumer position calls.
86. [**](../../akka/kafka/ConsumerSettings.html#withProperties(properties:java.util.Map[String,String]):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withProperties(properties: [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String]): ConsumerSettings\[K, V]Java API:
The raw properties of the kafka\-clients driver, see constants in
[org.apache.kafka.clients.consumer.ConsumerConfig](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerConfig.html).
87. [**](../../akka/kafka/ConsumerSettings.html#withProperties(properties:(String,String)*):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withProperties(properties: (String, String)\*): ConsumerSettings\[K, V]Scala API:
The raw properties of the kafka\-clients driver, see constants in
[org.apache.kafka.clients.consumer.ConsumerConfig](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerConfig.html).
88. [**](../../akka/kafka/ConsumerSettings.html#withProperties(properties:Map[String,String]):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withProperties(properties: Map\[String, String]): ConsumerSettings\[K, V]Scala API:
The raw properties of the kafka\-clients driver, see constants in
[org.apache.kafka.clients.consumer.ConsumerConfig](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerConfig.html).
89. [**](../../akka/kafka/ConsumerSettings.html#withProperty(key:String,value:String):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withProperty(key: String, value: String): ConsumerSettings\[K, V]The raw properties of the kafka\-clients driver, see constants in
[org.apache.kafka.clients.consumer.ConsumerConfig](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerConfig.html).
90. [**](../../akka/kafka/ConsumerSettings.html#withResetProtectionSettings(resetProtection:akka.kafka.OffsetResetProtectionSettings):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withResetProtectionSettings(resetProtection: [OffsetResetProtectionSettings](OffsetResetProtectionSettings.html)): ConsumerSettings\[K, V]Set the protection for unintentional offset reset.
91. [**](../../akka/kafka/ConsumerSettings.html#withStopTimeout(stopTimeout:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withStopTimeout(stopTimeout: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API:
The stage will await outstanding offset commit requests before
shutting down, but if that takes longer than this timeout it will
stop forcefully.
92. [**](../../akka/kafka/ConsumerSettings.html#withStopTimeout(stopTimeout:scala.concurrent.duration.FiniteDuration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withStopTimeout(stopTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConsumerSettings\[K, V]The stage will await outstanding offset commit requests before
shutting down, but if that takes longer than this timeout it will
stop forcefully.
93. [**](../../akka/kafka/ConsumerSettings.html#withWaitClosePartition(waitClosePartition:java.time.Duration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withWaitClosePartition(waitClosePartition: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ConsumerSettings\[K, V]Java API:
Time to wait for pending requests when a partition is closed.
94. [**](../../akka/kafka/ConsumerSettings.html#withWaitClosePartition(waitClosePartition:scala.concurrent.duration.FiniteDuration):akka.kafka.ConsumerSettings[K,V] "Permalink")  def withWaitClosePartition(waitClosePartition: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConsumerSettings\[K, V]Time to wait for pending requests when a partition is closed.
### Deprecated Value Members

1. [**](../../akka/kafka/ConsumerSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html)*