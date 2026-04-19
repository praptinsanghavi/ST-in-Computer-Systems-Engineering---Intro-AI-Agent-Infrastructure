---
description: Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.Consumer.Control
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/scaladsl/Consumer$$Control.html
title: Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.Consumer.Control
---

# Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.Consumer.Control

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.Consumer.Control

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/kafka/index.html "Permalink")  package [kafka](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/kafka/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[kafka](../index.html)
- [**](../../../akka/kafka/scaladsl/Consumer$.html "Permalink")  object [Consumer](Consumer$.html "Akka Stream connector for subscribing to Kafka topics.")Akka Stream connector for subscribing to Kafka topics.

Akka Stream connector for subscribing to Kafka topics.

Definition Classes[scaladsl](index.html)
- Control
- [DrainingControl](Consumer$$DrainingControl.html "Combine control and a stream completion signal materialized values into one, so that the stream can be stopped in a controlled way without losing commits.")
- [NoopControl](Consumer$$NoopControl$.html "An implementation of Control to be used as an empty value, all methods return a failed future.")
t[akka](../../index.html).[kafka](../index.html).[scaladsl](index.html).[Consumer](Consumer$.html)

# Control[**](../../../akka/kafka/scaladsl/Consumer$$Control.html "Permalink")

### 

#### trait Control extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Materialized value of the consumer `Source`.

See [Controlled shutdown](https://doc.akka.io/libraries/alpakka-kafka/current/consumer.html#controlled-shutdown)

Source[Consumer.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/scaladsl/Consumer.scala#L31)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[DrainingControl](Consumer$$DrainingControl.html), [NoopControl](Consumer$$NoopControl$.html), [FakeControl](../testkit/scaladsl/ConsumerControlFactory$$FakeControl.html)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Control
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#isShutdown:scala.concurrent.Future[akka.Done] "Permalink") abstract  def isShutdown: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Shutdown status.

Shutdown status. The `Future` will be completed when the stage has been shut down
and the underlying `KafkaConsumer` has been closed. Shutdown can be triggered
from downstream cancellation, errors, or [\#shutdown](#shutdown():scala.concurrent.Future[akka.Done]).
2. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#metrics:scala.concurrent.Future[Map[org.apache.kafka.common.MetricName,org.apache.kafka.common.Metric]] "Permalink") abstract  def metrics: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Map\[[MetricName](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/MetricName.html#org.apache.kafka.common.MetricName), [Metric](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/Metric.html#org.apache.kafka.common.Metric)]]Exposes underlying consumer or producer metrics (as reported by underlying Kafka client library)
3. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#shutdown():scala.concurrent.Future[akka.Done] "Permalink") abstract  def shutdown(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Shut down the consumer `Source`.

Shut down the consumer `Source`.

The actor backing the source will stay alive for `akka.kafka.consumer.stop-timeout` so that more commits
from enqueued messages can be handled.
The actor will wait for acknowledgements of the already sent offset commits from the Kafka broker before shutting down.

See [Controlled shutdown](https://doc.akka.io/libraries/alpakka-kafka/current/consumer.html#controlled-shutdown)
4. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#stop():scala.concurrent.Future[akka.Done] "Permalink") abstract  def stop(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Stop producing messages from the `Source` and complete the stream.

Stop producing messages from the `Source` and complete the stream.
The underlying Kafka consumer stays alive so that it can handle commits for the
already enqueued messages. It does not unsubscribe from any topics/partitions
as that could trigger a consumer group rebalance.

See [Controlled shutdown](https://doc.akka.io/libraries/alpakka-kafka/current/consumer.html#controlled-shutdown)

Call [\#shutdown](#shutdown():scala.concurrent.Future[akka.Done]) to close consumer.
### Concrete Value Members

1. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#drainAndShutdown[S](streamCompletion:scala.concurrent.Future[S])(implicitec:scala.concurrent.ExecutionContext):scala.concurrent.Future[S] "Permalink")  def drainAndShutdown\[S](streamCompletion: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[S])(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[S]Stop producing messages from the `Source`, wait for stream completion
and shut down the consumer `Source` so that all consumed messages
reach the end of the stream.

Stop producing messages from the `Source`, wait for stream completion
and shut down the consumer `Source` so that all consumed messages
reach the end of the stream.
Failures in stream completion will be propagated, the source will be shut down anyway.
7. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
14. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
15. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$Control.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$DrainingControl$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$DrainingControl.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$NoopControl$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/scaladsl/ConsumerControlFactory$$FakeControl.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/index.html
- https://doc.akka.io/libraries/alpakka-kafka/current/consumer.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$Control.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$Control.html)*