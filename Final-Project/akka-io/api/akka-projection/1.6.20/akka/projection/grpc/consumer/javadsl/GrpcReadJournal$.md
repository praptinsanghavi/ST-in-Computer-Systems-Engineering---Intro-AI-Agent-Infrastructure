---
description: Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.GrpcReadJournal
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html
title: Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.GrpcReadJournal
---

# Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.GrpcReadJournal

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.GrpcReadJournal

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
- [Transformation](Transformation.html "Transformation of incoming pushed events from the producer to the internal representation stored in the journal and seen by local projections.")
[o](GrpcReadJournal.html "See companion class")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[consumer](../index.html).[javadsl](index.html)

# [GrpcReadJournal](GrpcReadJournal.html "See companion class")[**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html "Permalink")

### Companion [class GrpcReadJournal](GrpcReadJournal.html "See companion class")

#### object GrpcReadJournal

Source[GrpcReadJournal.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.scala#L39)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcReadJournal
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#Identifier:String "Permalink")  val Identifier: String
5. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
7. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#create(system:akka.actor.ClassicActorSystemProvider,settings:akka.projection.grpc.consumer.GrpcQuerySettings,clientSettings:akka.grpc.GrpcClientSettings,protobufDescriptors:java.util.List[com.google.protobuf.Descriptors.FileDescriptor]):akka.projection.grpc.consumer.javadsl.GrpcReadJournal "Permalink")  def create(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider), settings: [GrpcQuerySettings](../GrpcQuerySettings.html), clientSettings: [GrpcClientSettings](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc//GrpcClientSettings.html#akka.grpc.GrpcClientSettings), protobufDescriptors: [List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[FileDescriptor]): [GrpcReadJournal](GrpcReadJournal.html)Construct a gRPC read journal for the given settings and explicit `GrpcClientSettings` to control
how to reach the Akka Projection gRPC producer service (host, port etc).
8. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#create(system:akka.actor.ClassicActorSystemProvider,settings:akka.projection.grpc.consumer.GrpcQuerySettings,protobufDescriptors:java.util.List[com.google.protobuf.Descriptors.FileDescriptor]):akka.projection.grpc.consumer.javadsl.GrpcReadJournal "Permalink")  def create(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider), settings: [GrpcQuerySettings](../GrpcQuerySettings.html), protobufDescriptors: [List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[FileDescriptor]): [GrpcReadJournal](GrpcReadJournal.html)Construct a gRPC read journal for the given settings.

Construct a gRPC read journal for the given settings.

Configuration from `akka.projection.grpc.consumer.client` will be used to connect to the remote producer.
9. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#create(system:akka.actor.ClassicActorSystemProvider,protobufDescriptors:java.util.List[com.google.protobuf.Descriptors.FileDescriptor]):akka.projection.grpc.consumer.javadsl.GrpcReadJournal "Permalink")  def create(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider), protobufDescriptors: [List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[FileDescriptor]): [GrpcReadJournal](GrpcReadJournal.html)Construct a gRPC read journal from configuration `akka.projection.grpc.consumer`.

Construct a gRPC read journal from configuration `akka.projection.grpc.consumer`. The `stream-id` must
be defined in the configuration.

Configuration from `akka.projection.grpc.consumer.client` will be used to connect to the remote producer.
10. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
17. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
18. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc//GrpcClientSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html
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
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html)*