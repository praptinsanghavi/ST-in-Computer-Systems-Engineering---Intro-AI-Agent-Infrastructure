---
description: Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.EventProducerPushDestination
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:30:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html
title: Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.EventProducerPushDestination
---

# Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.EventProducerPushDestination

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.EventProducerPushDestination

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/index.html "Permalink")  package [consumer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[consumer](../index.html)
- [EventDestinationInterceptor](EventDestinationInterceptor.html "Interceptor allowing for example authentication/authorization of incoming connections to a EventProducerPushDestination")
- EventProducerPushDestination
- [GrpcReadJournal](GrpcReadJournal.html)
- [Transformation](Transformation.html "Transformation of incoming pushed events from the producer to the internal representation stored in the journal and seen by local projections.")
[c](EventProducerPushDestination$.html "See companion object")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[consumer](../index.html).[javadsl](index.html)

# [EventProducerPushDestination](EventProducerPushDestination$.html "See companion object")[**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html "Permalink")

### Companion [object EventProducerPushDestination](EventProducerPushDestination$.html "See companion object")

#### final  class EventProducerPushDestination extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[EventProducerPushDestination.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.scala#L113)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventProducerPushDestination
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#acceptedStreamId:String "Permalink")  val acceptedStreamId: String
5. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
7. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#filters:java.util.List[akka.projection.grpc.consumer.ConsumerFilter.FilterCriteria] "Permalink")  val filters: [List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[[FilterCriteria](../ConsumerFilter$$FilterCriteria.html)]
10. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
11. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
12. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#interceptor:java.util.Optional[akka.projection.grpc.consumer.javadsl.EventDestinationInterceptor] "Permalink")  val interceptor: [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[EventDestinationInterceptor](EventDestinationInterceptor.html)]
13. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#journalPluginId:java.util.Optional[String] "Permalink")  val journalPluginId: [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[String]
15. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
17. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
18. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#protobufDescriptors:java.util.List[com.google.protobuf.Descriptors.FileDescriptor] "Permalink")  val protobufDescriptors: [List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[FileDescriptor]
19. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#settings:akka.projection.grpc.consumer.EventProducerPushDestinationSettings "Permalink")  val settings: [EventProducerPushDestinationSettings](../EventProducerPushDestinationSettings.html)
20. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#transformationForOrigin:java.util.function.BiFunction[String,akka.grpc.javadsl.Metadata,akka.projection.grpc.consumer.javadsl.Transformation] "Permalink")  val transformationForOrigin: [BiFunction](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[String, [Metadata](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc//javadsl/Metadata.html#akka.grpc.javadsl.Metadata), [Transformation](Transformation.html)]
23. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#withConsumerFilters(filters:java.util.List[akka.projection.grpc.consumer.ConsumerFilter.FilterCriteria]):akka.projection.grpc.consumer.javadsl.EventProducerPushDestination "Permalink")  def withConsumerFilters(filters: [List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[[FilterCriteria](../ConsumerFilter$$FilterCriteria.html)]): EventProducerPushDestinationFilter incoming streams, at producer side, with these filters
27. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#withInterceptor(interceptor:akka.projection.grpc.consumer.javadsl.EventDestinationInterceptor):akka.projection.grpc.consumer.javadsl.EventProducerPushDestination "Permalink")  def withInterceptor(interceptor: [EventDestinationInterceptor](EventDestinationInterceptor.html)): EventProducerPushDestination
28. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#withJournalPluginId(journalPluginId:String):akka.projection.grpc.consumer.javadsl.EventProducerPushDestination "Permalink")  def withJournalPluginId(journalPluginId: String): EventProducerPushDestination
29. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#withSettings(settings:akka.projection.grpc.consumer.EventProducerPushDestinationSettings):akka.projection.grpc.consumer.javadsl.EventProducerPushDestination "Permalink")  def withSettings(settings: [EventProducerPushDestinationSettings](../EventProducerPushDestinationSettings.html)): EventProducerPushDestination
30. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#withTransformation(transformation:akka.projection.grpc.consumer.javadsl.Transformation):akka.projection.grpc.consumer.javadsl.EventProducerPushDestination "Permalink")  def withTransformation(transformation: [Transformation](Transformation.html)): EventProducerPushDestinationtransformationA transformation to use for all events.
31. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#withTransformationForOrigin(transformationForOrigin:java.util.function.BiFunction[String,akka.grpc.javadsl.Metadata,akka.projection.grpc.consumer.javadsl.Transformation]):akka.projection.grpc.consumer.javadsl.EventProducerPushDestination "Permalink")  def withTransformationForOrigin(transformationForOrigin: [BiFunction](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[String, [Metadata](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc//javadsl/Metadata.html#akka.grpc.javadsl.Metadata), [Transformation](Transformation.html)]): EventProducerPushDestination
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc//javadsl/Metadata.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$FilterCriteria.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/EventProducerPushDestinationSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventDestinationInterceptor.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventProducerPushDestination$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/Transformation$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/Transformation.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html)*