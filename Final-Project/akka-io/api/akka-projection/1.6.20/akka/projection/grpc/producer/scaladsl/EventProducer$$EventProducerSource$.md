---
description: Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:46:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html
title: Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource
---

# Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/producer/index.html "Permalink")  package [producer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/producer/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[producer](../index.html)
- [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html "Permalink")  object [EventProducer](EventProducer$.html "The event producer implementation that can be included a gRPC route in an Akka HTTP server.")The event producer implementation that can be included a gRPC route in an Akka HTTP server.

The event producer implementation that can be included a gRPC route in an Akka HTTP server.

Definition Classes[scaladsl](index.html)
- [EventProducerSource](EventProducer$$EventProducerSource.html)
- [Transformation](EventProducer$$Transformation.html "Transformation of events to the external (public) representation.")
[o](EventProducer$$EventProducerSource.html "See companion class")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[producer](../index.html).[scaladsl](index.html).[EventProducer](EventProducer$.html)

# [EventProducerSource](EventProducer$$EventProducerSource.html "See companion class")[**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html "Permalink")

### Companion [class EventProducerSource](EventProducer$$EventProducerSource.html "See companion class")

#### object EventProducerSource

Source[EventProducer.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/producer/scaladsl/EventProducer.scala#L36)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventProducerSource
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#apply[Event](entityType:String,streamId:String,transformation:akka.projection.grpc.producer.scaladsl.EventProducer.Transformation,settings:akka.projection.grpc.producer.EventProducerSettings,producerFilter:akka.persistence.query.typed.EventEnvelope[Event]=>Boolean):akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource "Permalink")  def apply\[Event](entityType: String, streamId: String, transformation: [Transformation](EventProducer$$Transformation.html), settings: [EventProducerSettings](../EventProducerSettings.html), producerFilter: ([EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[Event]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [EventProducerSource](EventProducer$$EventProducerSource.html)
5. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#apply(entityType:String,streamId:String,transformation:akka.projection.grpc.producer.scaladsl.EventProducer.Transformation,settings:akka.projection.grpc.producer.EventProducerSettings):akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource "Permalink")  def apply(entityType: String, streamId: String, transformation: [Transformation](EventProducer$$Transformation.html), settings: [EventProducerSettings](../EventProducerSettings.html)): [EventProducerSource](EventProducer$$EventProducerSource.html)
6. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
8. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
11. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
12. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
15. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
16. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/EventProducerSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html)*