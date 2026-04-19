---
description: Alpakka Kafka 8.0.1 - akka.kafka.javadsl.Consumer.DrainingControl
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/javadsl/Consumer$$DrainingControl.html
title: Alpakka Kafka 8.0.1 - akka.kafka.javadsl.Consumer.DrainingControl
---

# Alpakka Kafka 8.0.1 - akka.kafka.javadsl.Consumer.DrainingControl

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.javadsl.Consumer.DrainingControl

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/kafka/index.html "Permalink")  package [kafka](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/kafka/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[kafka](../index.html)
- [**](../../../akka/kafka/javadsl/Consumer$.html "Permalink")  object [Consumer](Consumer$.html "Akka Stream connector for subscribing to Kafka topics.")Akka Stream connector for subscribing to Kafka topics.

Akka Stream connector for subscribing to Kafka topics.

Definition Classes[javadsl](index.html)
- [Control](Consumer$$Control.html "Materialized value of the consumer Source.")
- DrainingControl
c[akka](../../index.html).[kafka](../index.html).[javadsl](index.html).[Consumer](Consumer$.html)

# DrainingControl[**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html "Permalink")

### 

#### final  class DrainingControl\[T] extends [Control](Consumer$$Control.html)

Combine control and a stream completion signal materialized values into
one, so that the stream can be stopped in a controlled way without losing
commits.

Source[Consumer.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/javadsl/Consumer.scala#L77)Linear Supertypes[Control](Consumer$$Control.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DrainingControl
2. Control
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#drainAndShutdown(ec:java.util.concurrent.Executor):java.util.concurrent.CompletionStage[T] "Permalink")  def drainAndShutdown(ec: [Executor](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor)): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Stop producing messages from the `Source`, wait for stream completion
and shut down the consumer `Source`.

Stop producing messages from the `Source`, wait for stream completion
and shut down the consumer `Source`. It will wait for outstanding offset
commit requests to finish before shutting down.
7. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#drainAndShutdown[S](streamCompletion:java.util.concurrent.CompletionStage[S],ec:java.util.concurrent.Executor):java.util.concurrent.CompletionStage[S] "Permalink")  def drainAndShutdown\[S](streamCompletion: [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[S], ec: [Executor](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor)): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[S]Stop producing messages from the `Source`, wait for stream completion
and shut down the consumer `Source` so that all consumed messages
reach the end of the stream.

Stop producing messages from the `Source`, wait for stream completion
and shut down the consumer `Source` so that all consumed messages
reach the end of the stream.
Failures in stream completion will be propagated, the source will be shut down anyway.

Definition ClassesDrainingControl → [Control](Consumer$$Control.html)
8. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#getMetrics:java.util.concurrent.CompletionStage[java.util.Map[org.apache.kafka.common.MetricName,org.apache.kafka.common.Metric]] "Permalink")  def getMetrics: [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[[MetricName](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/MetricName.html#org.apache.kafka.common.MetricName), [Metric](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/Metric.html#org.apache.kafka.common.Metric)]]Exposes underlying consumer or producer metrics (as reported by underlying Kafka client library)

Exposes underlying consumer or producer metrics (as reported by underlying Kafka client library)

Definition ClassesDrainingControl → [Control](Consumer$$Control.html)
12. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#isShutdown:java.util.concurrent.CompletionStage[akka.Done] "Permalink")  val isShutdown: [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Shutdown status.

Shutdown status. The `CompletionStage` will be completed when the stage has been shut down
and the underlying `KafkaConsumer` has been closed. Shutdown can be triggered
from downstream cancellation, errors, or [\#shutdown](#shutdown():java.util.concurrent.CompletionStage[akka.Done]).

Definition ClassesDrainingControl → [Control](Consumer$$Control.html)
15. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
17. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
18. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#shutdown():java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def shutdown(): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Shutdown the consumer `Source`.

Shutdown the consumer `Source`. It will wait for outstanding offset
commit requests before shutting down.

Definition ClassesDrainingControl → [Control](Consumer$$Control.html)
19. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#stop():java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def stop(): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Stop producing messages from the `Source`.

Stop producing messages from the `Source`. This does not stop underlying kafka consumer
and does not unsubscribe from any topics/partitions.

Call [\#shutdown](#shutdown():java.util.concurrent.CompletionStage[akka.Done]) to close consumer

Definition ClassesDrainingControl → [Control](Consumer$$Control.html)
20. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#streamCompletion:java.util.concurrent.CompletionStage[T] "Permalink")  val streamCompletion: [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]
21. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/kafka/javadsl/Consumer$$DrainingControl.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Control](Consumer$$Control.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$Control.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$DrainingControl.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$DrainingControl.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$DrainingControl.html)*