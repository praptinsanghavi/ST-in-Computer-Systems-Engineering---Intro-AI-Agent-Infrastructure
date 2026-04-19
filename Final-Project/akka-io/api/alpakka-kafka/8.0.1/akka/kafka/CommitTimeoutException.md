---
description: Alpakka Kafka 8.0.1 - akka.kafka.CommitTimeoutException
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:05:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/CommitTimeoutException.html
title: Alpakka Kafka 8.0.1 - akka.kafka.CommitTimeoutException
---

# Alpakka Kafka 8.0.1 - akka.kafka.CommitTimeoutException

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.CommitTimeoutException

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
- CommitTimeoutException
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
c[akka](../index.html).[kafka](index.html)

# CommitTimeoutException[**](../../akka/kafka/CommitTimeoutException.html "Permalink")

### 

#### class CommitTimeoutException extends [TimeoutException](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/TimeoutException.html#java.util.concurrent.TimeoutException)

Commits will be failed with this exception if Kafka doesn't respond within `commit-timeout`

Source[CommitTimeoutException.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/CommitTimeoutException.scala#L13)Linear Supertypes[TimeoutException](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/TimeoutException.html#java.util.concurrent.TimeoutException), [Exception](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CommitTimeoutException
2. TimeoutException
3. Exception
4. Throwable
5. Serializable
6. AnyRef
7. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/kafka/CommitTimeoutException.html#<init>(msg:String):akka.kafka.CommitTimeoutException "Permalink")  new CommitTimeoutException(msg: String)
### Value Members

1. [**](../../akka/kafka/CommitTimeoutException.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/kafka/CommitTimeoutException.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/kafka/CommitTimeoutException.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/kafka/CommitTimeoutException.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
5. [**](../../akka/kafka/CommitTimeoutException.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/kafka/CommitTimeoutException.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../akka/kafka/CommitTimeoutException.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../akka/kafka/CommitTimeoutException.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../akka/kafka/CommitTimeoutException.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
10. [**](../../akka/kafka/CommitTimeoutException.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
11. [**](../../akka/kafka/CommitTimeoutException.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../akka/kafka/CommitTimeoutException.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
13. [**](../../akka/kafka/CommitTimeoutException.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
14. [**](../../akka/kafka/CommitTimeoutException.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
15. [**](../../akka/kafka/CommitTimeoutException.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
16. [**](../../akka/kafka/CommitTimeoutException.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
17. [**](../../akka/kafka/CommitTimeoutException.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
18. [**](../../akka/kafka/CommitTimeoutException.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/kafka/CommitTimeoutException.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/kafka/CommitTimeoutException.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
21. [**](../../akka/kafka/CommitTimeoutException.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
22. [**](../../akka/kafka/CommitTimeoutException.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
23. [**](../../akka/kafka/CommitTimeoutException.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
24. [**](../../akka/kafka/CommitTimeoutException.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
25. [**](../../akka/kafka/CommitTimeoutException.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
26. [**](../../akka/kafka/CommitTimeoutException.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../akka/kafka/CommitTimeoutException.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
28. [**](../../akka/kafka/CommitTimeoutException.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../akka/kafka/CommitTimeoutException.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../akka/kafka/CommitTimeoutException.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/kafka/CommitTimeoutException.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [TimeoutException](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/TimeoutException.html#java.util.concurrent.TimeoutException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

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
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/CommitTimeoutException.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/CommitTimeoutException.html)*