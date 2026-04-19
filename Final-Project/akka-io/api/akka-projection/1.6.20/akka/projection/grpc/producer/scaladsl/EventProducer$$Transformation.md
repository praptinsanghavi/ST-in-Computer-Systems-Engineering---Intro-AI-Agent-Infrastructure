---
description: Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl.EventProducer.Transformation
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:46:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html
title: Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl.EventProducer.Transformation
---

# Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl.EventProducer.Transformation

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl.EventProducer.Transformation

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
- Transformation
[c](EventProducer$$Transformation$.html "See companion object")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[producer](../index.html).[scaladsl](index.html).[EventProducer](EventProducer$.html)

# [Transformation](EventProducer$$Transformation$.html "See companion object")[**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html "Permalink")

### Companion [object Transformation](EventProducer$$Transformation$.html "See companion object")

#### final  class Transformation extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Transformation of events to the external (public) representation.
Events can be excluded by mapping them to `None`.

Source[EventProducer.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/producer/scaladsl/EventProducer.scala#L188)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Transformation
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#registerAsyncEnvelopeMapper[A,B](f:akka.persistence.query.typed.EventEnvelope[A]=>scala.concurrent.Future[Option[B]])(implicitevidence$1:scala.reflect.ClassTag[A]):akka.projection.grpc.producer.scaladsl.EventProducer.Transformation "Permalink")  def registerAsyncEnvelopeMapper\[A, B](f: ([EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[A]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): TransformationfA function that is fed each event envelope where the payload is of type `A` and returns an
 async payload to emit, or `None` to filter the event from being produced.
15. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#registerAsyncEnvelopeOrElseMapper(m:akka.persistence.query.typed.EventEnvelope[Any]=>scala.concurrent.Future[Option[Any]]):akka.projection.grpc.producer.scaladsl.EventProducer.Transformation "Permalink")  def registerAsyncEnvelopeOrElseMapper(m: ([EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]): TransformationmA function that is fed each event envelope, that did not match any other registered mappers, returns a
 payload to emit, or `None` to filter the event from being produced. Replaces any previous "orElse"
 mapper defined.
16. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#registerAsyncMapper[A,B](f:A=>scala.concurrent.Future[Option[B]])(implicitevidence$2:scala.reflect.ClassTag[A]):akka.projection.grpc.producer.scaladsl.EventProducer.Transformation "Permalink")  def registerAsyncMapper\[A, B](f: (A) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): TransformationfA function that is fed each event payload of type `A` and returns an
 async payload to emit, or `None` to filter the event from being produced.
17. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#registerAsyncOrElseMapper(f:Any=>scala.concurrent.Future[Option[Any]]):akka.projection.grpc.producer.scaladsl.EventProducer.Transformation "Permalink")  def registerAsyncOrElseMapper(f: ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]): TransformationfA function that is fed each event payload, that did not match any other registered mappers, returns an
 async payload to emit, or `None` to filter the event from being produced. Replaces any previous "orElse"
 mapper defined.
18. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#registerEnvelopeMapper[A,B](f:akka.persistence.query.typed.EventEnvelope[A]=>Option[B])(implicitevidence$4:scala.reflect.ClassTag[A]):akka.projection.grpc.producer.scaladsl.EventProducer.Transformation "Permalink")  def registerEnvelopeMapper\[A, B](f: ([EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[A]) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): TransformationfA function that is fed each event envelope where the payload is of type `A` and returns a
 payload to emit, or `None` to filter the event from being produced.
19. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#registerMapper[A,B](f:A=>Option[B])(implicitevidence$3:scala.reflect.ClassTag[A]):akka.projection.grpc.producer.scaladsl.EventProducer.Transformation "Permalink")  def registerMapper\[A, B](f: (A) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): TransformationfA function that is fed each event payload of type `A` and returns a
 payload to emit, or `None` to filter the event from being produced.
20. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#registerOrElseMapper(f:Any=>Option[Any]):akka.projection.grpc.producer.scaladsl.EventProducer.Transformation "Permalink")  def registerOrElseMapper(f: ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): TransformationfA function that is fed each event payload, that did not match any other registered mappers, returns a
 payload to emit, or `None` to filter the event from being produced. Replaces any previous "orElse"
 mapper defined.
21. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
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
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html)*