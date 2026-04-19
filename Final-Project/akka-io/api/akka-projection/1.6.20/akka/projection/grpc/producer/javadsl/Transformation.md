---
description: Akka Projection 1.6.20 - akka.projection.grpc.producer.javadsl.Transformation
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:46:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/Transformation.html
title: Akka Projection 1.6.20 - akka.projection.grpc.producer.javadsl.Transformation
---

# Akka Projection 1.6.20 - akka.projection.grpc.producer.javadsl.Transformation

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.producer.javadsl.Transformation

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/producer/index.html "Permalink")  package [producer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/producer/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[producer](../index.html)
- [EventProducer](EventProducer$.html "The event producer implementation that can be included a gRPC route in an Akka HTTP server.")
- [EventProducerInterceptor](EventProducerInterceptor.html "Interceptor allowing for example authentication/authorization of incoming requests to consume a specific stream.")
- [EventProducerPush](EventProducerPush.html)
- [EventProducerSource](EventProducerSource.html)
- [Mapper](Mapper.html)
- Transformation
[c](Transformation$.html "See companion object")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[producer](../index.html).[javadsl](index.html)

# [Transformation](Transformation$.html "See companion object")[**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html "Permalink")

### Companion [object Transformation](Transformation$.html "See companion object")

#### final  class Transformation extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Transformation of events to the external (public) representation.
Events can be excluded by mapping them to `Optional.empty`.

Not for direct construction, use [Transformation.empty](Transformation$.html#empty:akka.projection.grpc.producer.javadsl.Transformation) as starting point and register
mappers to build your needed Transformation

Source[Transformation.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/producer/javadsl/Transformation.scala#L47)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#registerAsyncEnvelopeMapper[A,B](inputEventClass:Class[A],f:java.util.function.Function[akka.persistence.query.typed.EventEnvelope[A],java.util.concurrent.CompletionStage[java.util.Optional[B]]]):akka.projection.grpc.producer.javadsl.Transformation "Permalink")  def registerAsyncEnvelopeMapper\[A, B](inputEventClass: Class\[A], f: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[A], [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[B]]]): TransformationfA function that is fed each event envelope for payloads of type `A` and returns an
 async payload to emit, or `Optional.empty()` to filter the event from being produced.
15. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#registerAsyncEnvelopeOrElseMapper(f:java.util.function.Function[akka.persistence.query.typed.EventEnvelope[Any],java.util.concurrent.CompletionStage[java.util.Optional[Any]]]):akka.projection.grpc.producer.javadsl.Transformation "Permalink")  def registerAsyncEnvelopeOrElseMapper(f: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]]): TransformationfA function that is fed each event envelope, that did not match any other registered mappers, returns an
 async payload to emit, or `Optional.empty()` to filter the event from being produced. Replaces any previous "orElse"
 mapper defined.
16. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#registerAsyncMapper[A,B](inputEventClass:Class[A],f:java.util.function.Function[A,java.util.concurrent.CompletionStage[java.util.Optional[B]]]):akka.projection.grpc.producer.javadsl.Transformation "Permalink")  def registerAsyncMapper\[A, B](inputEventClass: Class\[A], f: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[A, [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[B]]]): TransformationfA function that is fed each event payload of type `A` and returns an
 async payload to emit, or `Optional.empty()` to filter the event from being produced.
17. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#registerAsyncOrElseMapper(f:AnyRef=>java.util.concurrent.CompletionStage[java.util.Optional[AnyRef]]):akka.projection.grpc.producer.javadsl.Transformation "Permalink")  def registerAsyncOrElseMapper(f: ([AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)) \=\> [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]]): TransformationfA function that is fed each event payload, that did not match any other registered mappers, returns an
 async payload to emit, or `Optional.empty()` to filter the event from being produced. Replaces any previous "orElse"
 mapper defined.
18. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#registerEnvelopeMapper[A,B](inputEventClass:Class[A],f:java.util.function.Function[akka.persistence.query.typed.EventEnvelope[A],java.util.Optional[B]]):akka.projection.grpc.producer.javadsl.Transformation "Permalink")  def registerEnvelopeMapper\[A, B](inputEventClass: Class\[A], f: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[A], [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[B]]): TransformationfA function that is fed each event envelope for payloads of type `A` and returns a
 payload to emit, or `Optional.empty()` to filter the event from being produced.
19. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#registerMapper[A,B](inputEventClass:Class[A],f:java.util.function.Function[A,java.util.Optional[B]]):akka.projection.grpc.producer.javadsl.Transformation "Permalink")  def registerMapper\[A, B](inputEventClass: Class\[A], f: [Function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Function.html#java.util.function.Function)\[A, [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[B]]): TransformationfA function that is fed each event payload of type `A` and returns a
 payload to emit, or `Optional.empty()` to filter the event from being produced.
20. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#registerOrElseMapper(f:AnyRef=>java.util.Optional[AnyRef]):akka.projection.grpc.producer.javadsl.Transformation "Permalink")  def registerOrElseMapper(f: ([AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)) \=\> [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): TransformationfA function that is fed each event payload, that did not match any other registered mappers, returns a
 payload to emit, or `Optional.empty()` to filter the event from being produced. Replaces any previous "orElse"
 mapper defined.
21. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/producer/javadsl/Transformation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducer$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerInterceptor.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerPush$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerPush.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerSource$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerSource.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/Mapper.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/Transformation$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/Transformation.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/Transformation.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/Transformation.html)*