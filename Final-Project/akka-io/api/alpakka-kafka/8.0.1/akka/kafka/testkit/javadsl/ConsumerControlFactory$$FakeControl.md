---
description: Alpakka Kafka 8.0.1 - akka.kafka.testkit.javadsl.ConsumerControlFactory.FakeControl
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:45:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html
title: Alpakka Kafka 8.0.1 - akka.kafka.testkit.javadsl.ConsumerControlFactory.FakeControl
---

# Alpakka Kafka 8.0.1 - akka.kafka.testkit.javadsl.ConsumerControlFactory.FakeControl

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.testkit.javadsl.ConsumerControlFactory.FakeControl

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/kafka/index.html "Permalink")  package [kafka](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/kafka/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[kafka](../../index.html)
- [**](../../../../akka/kafka/testkit/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$.html "Permalink")  object [ConsumerControlFactory](ConsumerControlFactory$.html "Helper factory to create akka.kafka.javadsl.Consumer.Control instances when testing without a Kafka broker.")Helper factory to create [akka.kafka.javadsl.Consumer.Control](../../javadsl/Consumer$$Control.html) instances when
testing without a Kafka broker.

Helper factory to create [akka.kafka.javadsl.Consumer.Control](../../javadsl/Consumer$$Control.html) instances when
testing without a Kafka broker.

Definition Classes[javadsl](index.html)Annotations@ApiMayChange()
- FakeControl
c[akka](../../../index.html).[kafka](../../index.html).[testkit](../index.html).[javadsl](index.html).[ConsumerControlFactory](ConsumerControlFactory$.html)

# FakeControl[**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html "Permalink")

### 

#### class FakeControl extends [Control](../../javadsl/Consumer$$Control.html)

Source[ConsumerControlFactory.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/testkit/src/main/scala/akka/kafka/testkit/javadsl/ConsumerControlFactory.scala#L37)Linear Supertypes[Control](../../javadsl/Consumer$$Control.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FakeControl
2. Control
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#<init>(killSwitch:akka.stream.KillSwitch):akka.kafka.testkit.javadsl.ConsumerControlFactory.FakeControl "Permalink")  new FakeControl(killSwitch: [KillSwitch](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/KillSwitch.html#akka.stream.KillSwitch))
### Value Members

1. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#drainAndShutdown[T](streamCompletion:java.util.concurrent.CompletionStage[T],ec:java.util.concurrent.Executor):java.util.concurrent.CompletionStage[T] "Permalink")  def drainAndShutdown\[T](streamCompletion: [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T], ec: [Executor](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor)): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Stop producing messages from the `Source`, wait for stream completion
and shut down the consumer `Source` so that all consumed messages
reach the end of the stream.

Stop producing messages from the `Source`, wait for stream completion
and shut down the consumer `Source` so that all consumed messages
reach the end of the stream.
Failures in stream completion will be propagated, the source will be shut down anyway.

Definition ClassesFakeControl → [Control](../../javadsl/Consumer$$Control.html)
7. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#getMetrics:java.util.concurrent.CompletionStage[java.util.Map[org.apache.kafka.common.MetricName,org.apache.kafka.common.Metric]] "Permalink")  def getMetrics: [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[[MetricName](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/MetricName.html#org.apache.kafka.common.MetricName), [Metric](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/Metric.html#org.apache.kafka.common.Metric)]]Exposes underlying consumer or producer metrics (as reported by underlying Kafka client library)

Exposes underlying consumer or producer metrics (as reported by underlying Kafka client library)

Definition ClassesFakeControl → [Control](../../javadsl/Consumer$$Control.html)
11. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#isShutdown:java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def isShutdown: [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Shutdown status.

Shutdown status. The `CompletionStage` will be completed when the stage has been shut down
and the underlying `KafkaConsumer` has been closed. Shutdown can be triggered
from downstream cancellation, errors, or [\#shutdown](#shutdown():java.util.concurrent.CompletionStage[akka.Done]).

Definition ClassesFakeControl → [Control](../../javadsl/Consumer$$Control.html)
14. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#killSwitch:akka.stream.KillSwitch "Permalink")  val killSwitch: [KillSwitch](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/KillSwitch.html#akka.stream.KillSwitch)
15. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
17. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
18. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#shutdown():java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def shutdown(): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Shutdown the consumer `Source`.

Shutdown the consumer `Source`. It will wait for outstanding offset
commit requests before shutting down.

Definition ClassesFakeControl → [Control](../../javadsl/Consumer$$Control.html)
19. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#shutdownPromise:java.util.concurrent.CompletableFuture[akka.Done] "Permalink")  val shutdownPromise: [CompletableFuture](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletableFuture.html#java.util.concurrent.CompletableFuture)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]
20. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#stop():java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def stop(): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Stop producing messages from the `Source`.

Stop producing messages from the `Source`. This does not stop underlying kafka consumer
and does not unsubscribe from any topics/partitions.

Call [\#shutdown](#shutdown():java.util.concurrent.CompletionStage[akka.Done]) to close consumer

Definition ClassesFakeControl → [Control](../../javadsl/Consumer$$Control.html)
21. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Control](../../javadsl/Consumer$$Control.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/KillSwitch.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$Control.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/javadsl/ConsumerControlFactory$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/javadsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/javadsl/ConsumerControlFactory$$FakeControl.html)*