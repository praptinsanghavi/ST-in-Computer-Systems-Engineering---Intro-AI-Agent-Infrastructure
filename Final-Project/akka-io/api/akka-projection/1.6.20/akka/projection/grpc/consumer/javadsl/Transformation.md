---
description: Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.Transformation
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:46:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/Transformation.html
title: Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.Transformation
---

# Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.Transformation

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.Transformation

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/index.html "Permalink")  package [consumer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[consumer](../index.html)
- [EventDestinationInterceptor](EventDestinationInterceptor.html "Interceptor allowing for example authentication/authorization of incoming connections to a EventProducerPushDestination")
- [EventProducerPushDestination](EventProducerPushDestination.html)
- [GrpcReadJournal](GrpcReadJournal.html)
- Transformation
[c](Transformation$.html "See companion object")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[consumer](../index.html).[javadsl](index.html)

# [Transformation](Transformation$.html "See companion object")[**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html "Permalink")

### Companion [object Transformation](Transformation$.html "See companion object")

#### final  class Transformation extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Transformation of incoming pushed events from the producer to the internal representation stored in the journal
and seen by local projections. Start from [Transformation.empty](Transformation$.html#empty:akka.projection.grpc.consumer.javadsl.Transformation) when defining transformations.

Source[Transformation.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/consumer/javadsl/Transformation.scala#L47)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#delegate:akka.projection.grpc.consumer.scaladsl.EventProducerPushDestination.Transformation "Permalink")  val delegate: [scaladsl.EventProducerPushDestination.Transformation](../scaladsl/EventProducerPushDestination$$Transformation.html)
7. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
11. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
15. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#registerEnvelopeMapper[A,B](inputEventClass:Class[A],f:java.util.function.Function[akka.persistence.query.typed.EventEnvelope[A],java.util.Optional[B]]):akka.projection.grpc.consumer.javadsl.Transformation "Permalink")  def registerEnvelopeMapper\[A, B](inputEventClass: Class\[A], f: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[A], [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[B]]): TransformationTransform incoming event payloads, with access to the entire envelope for additional metadata.

Transform incoming event payloads, with access to the entire envelope for additional metadata.

Events can be excluded by mapping the payload `Optional.empty`.
16. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#registerMapper[A,B](inputEventClass:Class[A],f:java.util.function.Function[A,java.util.Optional[B]]):akka.projection.grpc.consumer.javadsl.Transformation "Permalink")  def registerMapper\[A, B](inputEventClass: Class\[A], f: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[A, [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[B]]): TransformationTransform incoming event payloads.

Transform incoming event payloads.

Events can be excluded by mapping the payload to `Optional.empty`.
17. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#registerOrElsePayloadMapper(f:java.util.function.Function[akka.persistence.query.typed.EventEnvelope[Any],java.util.Optional[Any]]):akka.projection.grpc.consumer.javadsl.Transformation "Permalink")  def registerOrElsePayloadMapper(f: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]): TransformationEvents can be excluded by mapping them to `Optional.empty`.
18. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#registerPersistenceIdMapper(system:akka.actor.typed.ActorSystem[_],f:java.util.function.Function[akka.persistence.query.typed.EventEnvelope[Any],String]):akka.projection.grpc.consumer.javadsl.Transformation "Permalink")  def registerPersistenceIdMapper(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_], f: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], String]): TransformationTransform incoming persistence ids, care must be taken to produce a valid persistence id and to always map the
same incoming persistence id to the same stored persistence id to not introduce gaps in the sequence numbers
and break consuming projections.
19. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#registerTagMapper[A](inputEventClass:Class[A],f:java.util.function.Function[akka.persistence.query.typed.EventEnvelope[A],java.util.Set[String]]):akka.projection.grpc.consumer.javadsl.Transformation "Permalink")  def registerTagMapper\[A](inputEventClass: Class\[A], f: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[A], [Set](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Set.html#java.util.Set)\[String]]): TransformationAdd or replace tags for incoming events
20. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/consumer/javadsl/Transformation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventDestinationInterceptor.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventProducerPushDestination$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/Transformation$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/Transformation.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$$Transformation.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/Transformation.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/Transformation.html)*