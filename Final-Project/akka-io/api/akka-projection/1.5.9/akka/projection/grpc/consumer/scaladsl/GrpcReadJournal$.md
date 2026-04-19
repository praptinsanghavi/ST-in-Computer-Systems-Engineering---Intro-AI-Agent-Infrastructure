---
description: Akka Projection 1.5.9 - akka.projection.grpc.consumer.scaladsl.GrpcReadJournal
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html
title: Akka Projection 1.5.9 - akka.projection.grpc.consumer.scaladsl.GrpcReadJournal
---

# Akka Projection 1.5.9 - akka.projection.grpc.consumer.scaladsl.GrpcReadJournal

> **Summary:** Akka Projection 1.5.9 - akka.projection.grpc.consumer.scaladsl.GrpcReadJournal

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/index.html "Permalink")  package [consumer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[consumer](../index.html)
- [EventDestinationInterceptor](EventDestinationInterceptor.html "Interceptor allowing for example authentication/authorization of incoming connections to a EventProducerPushDestination")
- [EventProducerPushDestination](EventProducerPushDestination.html)
- [GrpcReadJournal](GrpcReadJournal.html)
[o](GrpcReadJournal.html "See companion class")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[consumer](../index.html).[scaladsl](index.html)

# [GrpcReadJournal](GrpcReadJournal.html "See companion class")[**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html "Permalink")

### Companion [class GrpcReadJournal](GrpcReadJournal.html "See companion class")

#### object GrpcReadJournal

Source[GrpcReadJournal.scala](https://github.com/akka/akka-projection/tree/v1.5.9/akka-projection-grpc/src/main/scala/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.scala#L68)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#Identifier:String "Permalink")  val Identifier: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
5. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#apply(settings:akka.projection.grpc.consumer.GrpcQuerySettings,clientSettings:akka.grpc.GrpcClientSettings,protobufDescriptors:Seq[com.google.protobuf.Descriptors.FileDescriptor])(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.projection.grpc.consumer.scaladsl.GrpcReadJournal "Permalink")  def apply(settings: [GrpcQuerySettings](../GrpcQuerySettings.html), clientSettings: [GrpcClientSettings](https://doc.akka.io/api/akka-grpc/2.4.4/akka/grpc//GrpcClientSettings.html#akka.grpc.GrpcClientSettings), protobufDescriptors: [Seq](https://www.scala-lang.org/api/2.13.15/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[FileDescriptor])(implicit system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka/2.9.6/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [GrpcReadJournal](GrpcReadJournal.html)Construct a gRPC read journal for the given settings and explicit `GrpcClientSettings` to control
how to reach the Akka Projection gRPC producer service (host, port etc).

Construct a gRPC read journal for the given settings and explicit `GrpcClientSettings` to control
how to reach the Akka Projection gRPC producer service (host, port etc).

Note that the `protobufDescriptors` is a list of the `javaDescriptor` for the used protobuf messages. It is
defined in the ScalaPB generated `Proto` companion object.
6. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#apply(settings:akka.projection.grpc.consumer.GrpcQuerySettings,protobufDescriptors:Seq[com.google.protobuf.Descriptors.FileDescriptor])(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.projection.grpc.consumer.scaladsl.GrpcReadJournal "Permalink")  def apply(settings: [GrpcQuerySettings](../GrpcQuerySettings.html), protobufDescriptors: [Seq](https://www.scala-lang.org/api/2.13.15/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[FileDescriptor])(implicit system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka/2.9.6/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [GrpcReadJournal](GrpcReadJournal.html)Construct a gRPC read journal for the given settings.

Construct a gRPC read journal for the given settings.

Configuration from `akka.projection.grpc.consumer.client` will be used to connect to the remote producer.

Note that the `protobufDescriptors` is a list of the `javaDescriptor` for the used protobuf messages. It is
defined in the ScalaPB generated `Proto` companion object.
7. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#apply(protobufDescriptors:Seq[com.google.protobuf.Descriptors.FileDescriptor])(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.projection.grpc.consumer.scaladsl.GrpcReadJournal "Permalink")  def apply(protobufDescriptors: [Seq](https://www.scala-lang.org/api/2.13.15/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[FileDescriptor])(implicit system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka/2.9.6/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [GrpcReadJournal](GrpcReadJournal.html)Construct a gRPC read journal from configuration `akka.projection.grpc.consumer`.

Construct a gRPC read journal from configuration `akka.projection.grpc.consumer`. The `stream-id` must
be defined in the configuration.

Configuration from `akka.projection.grpc.consumer.client` will be used to connect to the remote producer.

Note that the `protobufDescriptors` is a list of the `javaDescriptor` for the used protobuf messages. It is
defined in the ScalaPB generated `Proto` companion object.
8. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/2.4.4/akka/grpc//GrpcClientSettings.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/GrpcQuerySettings.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/EventDestinationInterceptor.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html
- https://doc.akka.io/api/akka/2.9.6/akka/actor/ClassicActorSystemProvider.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html)*