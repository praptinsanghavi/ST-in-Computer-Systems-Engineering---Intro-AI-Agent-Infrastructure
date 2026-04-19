---
description: Alpakka Kafka 8.0.1 - akka.kafka.ProducerSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/ProducerSettings$.html
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
- [ProducerSettings](ProducerSettings.html "Settings for producers.")
- [RestrictedConsumer](RestrictedConsumer.html "Offers parts of the org.apache.kafka.clients.consumer.Consumer API which becomes available to the akka.kafka.scaladsl.PartitionAssignmentHandler callbacks.")
- [Subscription](Subscription.html)
- [Subscriptions](Subscriptions$.html)
- [TopicPartitionsAssigned](TopicPartitionsAssigned.html)
- [TopicPartitionsRevoked](TopicPartitionsRevoked.html)
- [Version](Version$.html)
- [WakeupsExceeded](WakeupsExceeded.html)
[o](ProducerSettings.html "See companion class")[akka](../index.html).[kafka](index.html)

# [ProducerSettings](ProducerSettings.html "See companion class")[**](../../akka/kafka/ProducerSettings$.html "Permalink")

### Companion [class ProducerSettings](ProducerSettings.html "See companion class")

#### object ProducerSettings

Source[ProducerSettings.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/ProducerSettings.scala#L24)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../akka/kafka/ProducerSettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/kafka/ProducerSettings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/kafka/ProducerSettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/kafka/ProducerSettings$.html#apply[K,V](config:com.typesafe.config.Config,keySerializer:org.apache.kafka.common.serialization.Serializer[K],valueSerializer:org.apache.kafka.common.serialization.Serializer[V]):akka.kafka.ProducerSettings[K,V] "Permalink")  def apply\[K, V](config: [Config](https://javadoc.io/static/com.typesafe/config/1.4.5/com/typesafe/config/Config.html#com.typesafe.config.Config), keySerializer: [Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[K], valueSerializer: [Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[V]): [ProducerSettings](ProducerSettings.html)\[K, V]Create settings from a configuration with the same layout as
the default configuration `akka.kafka.producer`.

Create settings from a configuration with the same layout as
the default configuration `akka.kafka.producer`.
Key and value serializer must be passed explicitly.
5. [**](../../akka/kafka/ProducerSettings$.html#apply[K,V](system:akka.actor.ClassicActorSystemProvider,keySerializer:org.apache.kafka.common.serialization.Serializer[K],valueSerializer:org.apache.kafka.common.serialization.Serializer[V]):akka.kafka.ProducerSettings[K,V] "Permalink")  def apply\[K, V](system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider), keySerializer: [Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[K], valueSerializer: [Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[V]): [ProducerSettings](ProducerSettings.html)\[K, V]Create settings from the default configuration
`akka.kafka.producer`.

Create settings from the default configuration
`akka.kafka.producer`.
Key and value serializer must be passed explicitly.

For use with the `akka.actor.typed` API.
6. [**](../../akka/kafka/ProducerSettings$.html#apply[K,V](system:akka.actor.ActorSystem,keySerializer:org.apache.kafka.common.serialization.Serializer[K],valueSerializer:org.apache.kafka.common.serialization.Serializer[V]):akka.kafka.ProducerSettings[K,V] "Permalink")  def apply\[K, V](system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem), keySerializer: [Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[K], valueSerializer: [Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[V]): [ProducerSettings](ProducerSettings.html)\[K, V]Create settings from the default configuration
`akka.kafka.producer`.

Create settings from the default configuration
`akka.kafka.producer`.
Key and value serializer must be passed explicitly.
7. [**](../../akka/kafka/ProducerSettings$.html#apply[K,V](config:com.typesafe.config.Config,keySerializer:Option[org.apache.kafka.common.serialization.Serializer[K]],valueSerializer:Option[org.apache.kafka.common.serialization.Serializer[V]]):akka.kafka.ProducerSettings[K,V] "Permalink")  def apply\[K, V](config: [Config](https://javadoc.io/static/com.typesafe/config/1.4.5/com/typesafe/config/Config.html#com.typesafe.config.Config), keySerializer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[K]], valueSerializer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[V]]): [ProducerSettings](ProducerSettings.html)\[K, V]Create settings from a configuration with the same layout as
the default configuration `akka.kafka.producer`.

Create settings from a configuration with the same layout as
the default configuration `akka.kafka.producer`.
Key or value serializer can be passed explicitly or retrieved from configuration.
8. [**](../../akka/kafka/ProducerSettings$.html#apply[K,V](system:akka.actor.ClassicActorSystemProvider,keySerializer:Option[org.apache.kafka.common.serialization.Serializer[K]],valueSerializer:Option[org.apache.kafka.common.serialization.Serializer[V]]):akka.kafka.ProducerSettings[K,V] "Permalink")  def apply\[K, V](system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider), keySerializer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[K]], valueSerializer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[V]]): [ProducerSettings](ProducerSettings.html)\[K, V]Create settings from the default configuration
`akka.kafka.producer`.

Create settings from the default configuration
`akka.kafka.producer`.
Key or value serializer can be passed explicitly or retrieved from configuration.

For use with the `akka.actor.typed` API.
9. [**](../../akka/kafka/ProducerSettings$.html#apply[K,V](system:akka.actor.ActorSystem,keySerializer:Option[org.apache.kafka.common.serialization.Serializer[K]],valueSerializer:Option[org.apache.kafka.common.serialization.Serializer[V]]):akka.kafka.ProducerSettings[K,V] "Permalink")  def apply\[K, V](system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem), keySerializer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[K]], valueSerializer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[V]]): [ProducerSettings](ProducerSettings.html)\[K, V]Create settings from the default configuration
`akka.kafka.producer`.

Create settings from the default configuration
`akka.kafka.producer`.
Key or value serializer can be passed explicitly or retrieved from configuration.
10. [**](../../akka/kafka/ProducerSettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../akka/kafka/ProducerSettings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
12. [**](../../akka/kafka/ProducerSettings$.html#configPath:String "Permalink")  val configPath: [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)
13. [**](../../akka/kafka/ProducerSettings$.html#create[K,V](config:com.typesafe.config.Config,keySerializer:org.apache.kafka.common.serialization.Serializer[K],valueSerializer:org.apache.kafka.common.serialization.Serializer[V]):akka.kafka.ProducerSettings[K,V] "Permalink")  def create\[K, V](config: [Config](https://javadoc.io/static/com.typesafe/config/1.4.5/com/typesafe/config/Config.html#com.typesafe.config.Config), keySerializer: [Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[K], valueSerializer: [Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[V]): [ProducerSettings](ProducerSettings.html)\[K, V]Java API: Create settings from a configuration with the same layout as
the default configuration `akka.kafka.producer`.

Java API: Create settings from a configuration with the same layout as
the default configuration `akka.kafka.producer`.
Key and value serializer must be passed explicitly.
14. [**](../../akka/kafka/ProducerSettings$.html#create[K,V](system:akka.actor.ClassicActorSystemProvider,keySerializer:org.apache.kafka.common.serialization.Serializer[K],valueSerializer:org.apache.kafka.common.serialization.Serializer[V]):akka.kafka.ProducerSettings[K,V] "Permalink")  def create\[K, V](system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider), keySerializer: [Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[K], valueSerializer: [Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[V]): [ProducerSettings](ProducerSettings.html)\[K, V]Java API: Create settings from the default configuration
`akka.kafka.producer`.

Java API: Create settings from the default configuration
`akka.kafka.producer`.
Key and value serializer must be passed explicitly.

For use with the `akka.actor.typed` API.
15. [**](../../akka/kafka/ProducerSettings$.html#create[K,V](system:akka.actor.ActorSystem,keySerializer:org.apache.kafka.common.serialization.Serializer[K],valueSerializer:org.apache.kafka.common.serialization.Serializer[V]):akka.kafka.ProducerSettings[K,V] "Permalink")  def create\[K, V](system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem), keySerializer: [Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[K], valueSerializer: [Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[V]): [ProducerSettings](ProducerSettings.html)\[K, V]Java API: Create settings from the default configuration
`akka.kafka.producer`.

Java API: Create settings from the default configuration
`akka.kafka.producer`.
Key and value serializer must be passed explicitly.
16. [**](../../akka/kafka/ProducerSettings$.html#create[K,V](config:com.typesafe.config.Config,keySerializer:java.util.Optional[org.apache.kafka.common.serialization.Serializer[K]],valueSerializer:java.util.Optional[org.apache.kafka.common.serialization.Serializer[V]]):akka.kafka.ProducerSettings[K,V] "Permalink")  def create\[K, V](config: [Config](https://javadoc.io/static/com.typesafe/config/1.4.5/com/typesafe/config/Config.html#com.typesafe.config.Config), keySerializer: [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[K]], valueSerializer: [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[V]]): [ProducerSettings](ProducerSettings.html)\[K, V]Java API: Create settings from a configuration with the same layout as
the default configuration `akka.kafka.producer`.

Java API: Create settings from a configuration with the same layout as
the default configuration `akka.kafka.producer`.
Key or value serializer can be passed explicitly or retrieved from configuration.
17. [**](../../akka/kafka/ProducerSettings$.html#create[K,V](system:akka.actor.ClassicActorSystemProvider,keySerializer:java.util.Optional[org.apache.kafka.common.serialization.Serializer[K]],valueSerializer:java.util.Optional[org.apache.kafka.common.serialization.Serializer[V]]):akka.kafka.ProducerSettings[K,V] "Permalink")  def create\[K, V](system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider), keySerializer: [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[K]], valueSerializer: [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[V]]): [ProducerSettings](ProducerSettings.html)\[K, V]Java API: Create settings from the default configuration
`akka.kafka.producer`.

Java API: Create settings from the default configuration
`akka.kafka.producer`.
Key or value serializer can be passed explicitly or retrieved from configuration.

For use with the `akka.actor.typed` API.
18. [**](../../akka/kafka/ProducerSettings$.html#create[K,V](system:akka.actor.ActorSystem,keySerializer:java.util.Optional[org.apache.kafka.common.serialization.Serializer[K]],valueSerializer:java.util.Optional[org.apache.kafka.common.serialization.Serializer[V]]):akka.kafka.ProducerSettings[K,V] "Permalink")  def create\[K, V](system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem), keySerializer: [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[K]], valueSerializer: [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Serializer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/serialization/Serializer.html#org.apache.kafka.common.serialization.Serializer)\[V]]): [ProducerSettings](ProducerSettings.html)\[K, V]Java API: Create settings from the default configuration
`akka.kafka.producer`.

Java API: Create settings from the default configuration
`akka.kafka.producer`.
Key or value serializer can be passed explicitly or retrieved from configuration.
19. [**](../../akka/kafka/ProducerSettings$.html#createKafkaProducer[K,V](settings:akka.kafka.ProducerSettings[K,V]):org.apache.kafka.clients.producer.KafkaProducer[K,V] "Permalink")  def createKafkaProducer\[K, V](settings: [ProducerSettings](ProducerSettings.html)\[K, V]): [KafkaProducer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/KafkaProducer.html#org.apache.kafka.clients.producer.KafkaProducer)\[K, V]Create a [KafkaProducer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/KafkaProducer.html) instance from the settings.
20. [**](../../akka/kafka/ProducerSettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/kafka/ProducerSettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
22. [**](../../akka/kafka/ProducerSettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
23. [**](../../akka/kafka/ProducerSettings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
24. [**](../../akka/kafka/ProducerSettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../akka/kafka/ProducerSettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../akka/kafka/ProducerSettings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
27. [**](../../akka/kafka/ProducerSettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
28. [**](../../akka/kafka/ProducerSettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../akka/kafka/ProducerSettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../akka/kafka/ProducerSettings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../akka/kafka/ProducerSettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../akka/kafka/ProducerSettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/kafka/ProducerSettings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
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
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings$.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings$.html)*