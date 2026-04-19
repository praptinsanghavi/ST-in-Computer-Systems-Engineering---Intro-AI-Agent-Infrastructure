---
description: Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.Consumer.DrainingControl
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:45:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/scaladsl/Consumer$$DrainingControl$.html
title: Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.Consumer.DrainingControl
---

# Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.Consumer.DrainingControl

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.Consumer.DrainingControl

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/kafka/index.html "Permalink")  package [kafka](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/kafka/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[kafka](../index.html)
- [**](../../../akka/kafka/scaladsl/Consumer$.html "Permalink")  object [Consumer](Consumer$.html "Akka Stream connector for subscribing to Kafka topics.")Akka Stream connector for subscribing to Kafka topics.

Akka Stream connector for subscribing to Kafka topics.

Definition Classes[scaladsl](index.html)
- [Control](Consumer$$Control.html "Materialized value of the consumer Source.")
- [DrainingControl](Consumer$$DrainingControl.html "Combine control and a stream completion signal materialized values into one, so that the stream can be stopped in a controlled way without losing commits.")
- [NoopControl](Consumer$$NoopControl$.html "An implementation of Control to be used as an empty value, all methods return a failed future.")
[o](Consumer$$DrainingControl.html "See companion class")[akka](../../index.html).[kafka](../index.html).[scaladsl](index.html).[Consumer](Consumer$.html)

# [DrainingControl](Consumer$$DrainingControl.html "See companion class")[**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html "Permalink")

### Companion [class DrainingControl](Consumer$$DrainingControl.html "See companion class")

#### object DrainingControl

Source[Consumer.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/scaladsl/Consumer.scala#L127)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DrainingControl
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#apply[T]:(akka.kafka.scaladsl.Consumer.Control,scala.concurrent.Future[T])=>akka.kafka.scaladsl.Consumer.DrainingControl[T] "Permalink")  def apply\[T]: ([Control](Consumer$$Control.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]) \=\> [DrainingControl](Consumer$$DrainingControl.html)\[T]Combine the consumer control and a stream completion signal materialized values into
one, so that the stream can be stopped in a controlled way without losing
commits.

Combine the consumer control and a stream completion signal materialized values into
one, so that the stream can be stopped in a controlled way without losing
commits.

For use in the `toMat` combination of materialized values.
5. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#apply[T](tuple:(akka.kafka.scaladsl.Consumer.Control,scala.concurrent.Future[T])):akka.kafka.scaladsl.Consumer.DrainingControl[T] "Permalink")  def apply\[T](tuple: ([Control](Consumer$$Control.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T])): [DrainingControl](Consumer$$DrainingControl.html)\[T]Combine the consumer control and a stream completion signal materialized values into
one, so that the stream can be stopped in a controlled way without losing
commits.

Combine the consumer control and a stream completion signal materialized values into
one, so that the stream can be stopped in a controlled way without losing
commits.

For use in `mapMaterializedValue`.
6. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
8. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
15. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
16. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$Control.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$DrainingControl$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$DrainingControl.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$NoopControl$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$DrainingControl$.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$DrainingControl$.html)*