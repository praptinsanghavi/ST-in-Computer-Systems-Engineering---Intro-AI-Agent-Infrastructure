---
description: Akka Projection 1.6.20 - akka.projection.grpc.consumer.scaladsl.EventProducerPushDestination
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:46:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html
title: Akka Projection 1.6.20 - akka.projection.grpc.consumer.scaladsl.EventProducerPushDestination
---

# Akka Projection 1.6.20 - akka.projection.grpc.consumer.scaladsl.EventProducerPushDestination

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.consumer.scaladsl.EventProducerPushDestination

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/index.html "Permalink")  package [consumer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[consumer](../index.html)
- [EventDestinationInterceptor](EventDestinationInterceptor.html "Interceptor allowing for example authentication/authorization of incoming connections to a EventProducerPushDestination")
- [EventProducerPushDestination](EventProducerPushDestination.html)
- [GrpcReadJournal](GrpcReadJournal.html)
[o](EventProducerPushDestination.html "See companion class")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[consumer](../index.html).[scaladsl](index.html)

# [EventProducerPushDestination](EventProducerPushDestination.html "See companion class")[**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html "Permalink")

### Companion [class EventProducerPushDestination](EventProducerPushDestination.html "See companion class")

#### object EventProducerPushDestination

A passive consumer service for event producer push that can be bound as a gRPC endpoint accepting active producers
pushing events, for example to run a projection piercing firewalls or NAT. Events are pushed directly into the
configured journal and can then be consumed through a local projection. A producer can push events for multiple
entities but no two producer are allowed to push events for the same entity, at the same time.

The event consumer service is not needed for normal projections over gRPC where the consuming side can access and
initiate connections to the producing side.

Producers are started using the [akka.projection.grpc.producer.scaladsl.EventProducerPush](../../producer/scaladsl/EventProducerPush.html) API.

Source[EventProducerPushDestination.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination.scala#L38)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventProducerPushDestination
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$$Transformation.html "Permalink") final  class [Transformation](EventProducerPushDestination$$Transformation.html "Transformation of incoming pushed events from the producer to the internal representation stored in the journal and seen by local projections.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Transformation of incoming pushed events from the producer to the internal representation stored in the journal
and seen by local projections.

Transformation of incoming pushed events from the producer to the internal representation stored in the journal
and seen by local projections. Start from [Transformation.empty](EventProducerPushDestination$$Transformation$.html#empty:akka.projection.grpc.consumer.scaladsl.EventProducerPushDestination.Transformation) when defining transformations.
### Value Members

1. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#apply(acceptedStreamId:String,protobufDescriptors:Seq[com.google.protobuf.Descriptors.FileDescriptor])(implicitsystem:akka.actor.typed.ActorSystem[_]):akka.projection.grpc.consumer.scaladsl.EventProducerPushDestination "Permalink")  def apply(acceptedStreamId: String, protobufDescriptors: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[FileDescriptor])(implicit system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [EventProducerPushDestination](EventProducerPushDestination.html)acceptedStreamIdOnly accept this stream ids, deny others

protobufDescriptorsWhen using protobuf as event wire format, rather than direct Akka Serialization,
 all message descriptors needs to be listed up front when creating the destination.
 If not using protobuf encoded events, use an empty list.
5. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
7. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#grpcServiceHandler(eventConsumer:Set[akka.projection.grpc.consumer.scaladsl.EventProducerPushDestination])(implicitsystem:akka.actor.typed.ActorSystem[_]):PartialFunction[akka.http.scaladsl.model.HttpRequest,scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse]] "Permalink")  def grpcServiceHandler(eventConsumer: Set\[[EventProducerPushDestination](EventProducerPushDestination.html)])(implicit system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpRequest](https://doc.akka.io/api/akka-http/10.7.3/akka/http/scaladsl/model/HttpRequest.html#akka.http.scaladsl.model.HttpRequest), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](https://doc.akka.io/api/akka-http/10.7.3/akka/http/scaladsl/model/HttpResponse.html#akka.http.scaladsl.model.HttpResponse)]]
11. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#grpcServiceHandler(eventConsumer:akka.projection.grpc.consumer.scaladsl.EventProducerPushDestination)(implicitsystem:akka.actor.typed.ActorSystem[_]):PartialFunction[akka.http.scaladsl.model.HttpRequest,scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse]] "Permalink")  def grpcServiceHandler(eventConsumer: [EventProducerPushDestination](EventProducerPushDestination.html))(implicit system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpRequest](https://doc.akka.io/api/akka-http/10.7.3/akka/http/scaladsl/model/HttpRequest.html#akka.http.scaladsl.model.HttpRequest), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](https://doc.akka.io/api/akka-http/10.7.3/akka/http/scaladsl/model/HttpResponse.html#akka.http.scaladsl.model.HttpResponse)]]
12. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
16. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
17. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$$Transformation$.html "Permalink")  object [Transformation](EventProducerPushDestination$$Transformation$.html)
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/EventDestinationInterceptor.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$$Transformation$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$$Transformation.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducerPush.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html)*