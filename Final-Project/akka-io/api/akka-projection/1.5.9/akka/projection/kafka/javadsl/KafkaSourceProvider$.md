---
description: Akka Projection 1.5.9 - akka.projection.kafka.javadsl.KafkaSourceProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/kafka/javadsl/KafkaSourceProvider$.html
title: Akka Projection 1.5.9 - akka.projection.kafka.javadsl.KafkaSourceProvider
---

# Akka Projection 1.5.9 - akka.projection.kafka.javadsl.KafkaSourceProvider

> **Summary:** Akka Projection 1.5.9 - akka.projection.kafka.javadsl.KafkaSourceProvider

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/projection/index.html "Permalink")  package [projection](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/projection/kafka/index.html "Permalink")  package [kafka](../index.html)Definition Classes[projection](../../index.html)
- [**](../../../../akka/projection/kafka/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[kafka](../index.html)
- KafkaSourceProvider
o[akka](../../../index.html).[projection](../../index.html).[kafka](../index.html).[javadsl](index.html)

# KafkaSourceProvider[**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html "Permalink")

### 

#### object KafkaSourceProvider

Source[KafkaSourceProvider.scala](https://github.com/akka/akka-projection/tree/v1.5.9/akka-projection-kafka/src/main/scala/akka/projection/kafka/javadsl/KafkaSourceProvider.scala#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. KafkaSourceProvider
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#create[K,V](system:akka.actor.typed.ActorSystem[_],settings:akka.kafka.ConsumerSettings[K,V],topics:java.util.Set[String]):akka.projection.javadsl.SourceProvider[akka.projection.MergeableOffset[Long],org.apache.kafka.clients.consumer.ConsumerRecord[K,V]] "Permalink")  def create\[K, V](system: [ActorSystem](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_], settings: ConsumerSettings\[K, V], topics: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]): [SourceProvider](../../javadsl/SourceProvider.html)\[[MergeableOffset](../../MergeableOffset.html)\[[Long](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Long.html#java.lang.Long)], ConsumerRecord\[K, V]]Create a SourceProvider that resumes from externally managed offsets
7. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/projection/kafka/javadsl/KafkaSourceProvider$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/MergeableOffset.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/kafka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/kafka/javadsl/KafkaSourceProvider$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/kafka/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html
- https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/kafka/javadsl/KafkaSourceProvider$.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/kafka/javadsl/KafkaSourceProvider$.html)*