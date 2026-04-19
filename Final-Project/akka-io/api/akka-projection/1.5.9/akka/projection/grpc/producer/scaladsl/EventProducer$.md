---
description: Akka Projection 1.5.9 - akka.projection.grpc.producer.scaladsl.EventProducer
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/scaladsl/EventProducer$.html
title: Akka Projection 1.5.9 - akka.projection.grpc.producer.scaladsl.EventProducer
---

# Akka Projection 1.5.9 - akka.projection.grpc.producer.scaladsl.EventProducer

> **Summary:** Akka Projection 1.5.9 - akka.projection.grpc.producer.scaladsl.EventProducer

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/producer/index.html "Permalink")  package [producer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/producer/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[producer](../index.html)
- EventProducer
- [EventProducerInterceptor](EventProducerInterceptor.html "Interceptor allowing for example authentication/authorization of incoming requests to consume a specific stream.")
- [EventProducerPush](EventProducerPush.html)
o[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[producer](../index.html).[scaladsl](index.html)

# EventProducer[**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html "Permalink")

### 

#### object EventProducer

The event producer implementation that can be included a gRPC route in an Akka HTTP server.

Source[EventProducer.scala](https://github.com/akka/akka-projection/tree/v1.5.9/akka-projection-grpc/src/main/scala/akka/projection/grpc/producer/scaladsl/EventProducer.scala#L33)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventProducer
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html "Permalink") final  class [EventProducerSource](EventProducer$$EventProducerSource.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html "Permalink") final  class [Transformation](EventProducer$$Transformation.html "Transformation of events to the external (public) representation.") extends [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Transformation of events to the external (public) representation.

Transformation of events to the external (public) representation.
Events can be excluded by mapping them to `None`.
### Value Members

1. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#grpcServiceHandler(sources:Set[akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource],interceptor:Option[akka.projection.grpc.producer.scaladsl.EventProducerInterceptor])(implicitsystem:akka.actor.typed.ActorSystem[_]):PartialFunction[akka.http.scaladsl.model.HttpRequest,scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse]] "Permalink")  def grpcServiceHandler(sources: Set\[[EventProducerSource](EventProducer$$EventProducerSource.html)], interceptor: [Option](https://www.scala-lang.org/api/2.13.15/scala/Option.html#scala.Option)\[[EventProducerInterceptor](EventProducerInterceptor.html)])(implicit system: [ActorSystem](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [PartialFunction](https://www.scala-lang.org/api/2.13.15/scala/PartialFunction.html#scala.PartialFunction)\[[HttpRequest](https://doc.akka.io/api/akka-http/10.6.3/akka/http/scaladsl/model/HttpRequest.html#akka.http.scaladsl.model.HttpRequest), [Future](https://www.scala-lang.org/api/2.13.15/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](https://doc.akka.io/api/akka-http/10.6.3/akka/http/scaladsl/model/HttpResponse.html#akka.http.scaladsl.model.HttpResponse)]]The gRPC route that can be included in an Akka HTTP server.

The gRPC route that can be included in an Akka HTTP server.

sourcesAll sources that should be available from this event producer

interceptorAn optional request interceptor applied to each request to the service
10. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#grpcServiceHandler(sources:Set[akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource])(implicitsystem:akka.actor.typed.ActorSystem[_]):PartialFunction[akka.http.scaladsl.model.HttpRequest,scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse]] "Permalink")  def grpcServiceHandler(sources: Set\[[EventProducerSource](EventProducer$$EventProducerSource.html)])(implicit system: [ActorSystem](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [PartialFunction](https://www.scala-lang.org/api/2.13.15/scala/PartialFunction.html#scala.PartialFunction)\[[HttpRequest](https://doc.akka.io/api/akka-http/10.6.3/akka/http/scaladsl/model/HttpRequest.html#akka.http.scaladsl.model.HttpRequest), [Future](https://www.scala-lang.org/api/2.13.15/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](https://doc.akka.io/api/akka-http/10.6.3/akka/http/scaladsl/model/HttpResponse.html#akka.http.scaladsl.model.HttpResponse)]]The gRPC route that can be included in an Akka HTTP server.

The gRPC route that can be included in an Akka HTTP server.

sourcesAll sources that should be available from this event producer
11. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#grpcServiceHandler(source:akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource)(implicitsystem:akka.actor.typed.ActorSystem[_]):PartialFunction[akka.http.scaladsl.model.HttpRequest,scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse]] "Permalink")  def grpcServiceHandler(source: [EventProducerSource](EventProducer$$EventProducerSource.html))(implicit system: [ActorSystem](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [PartialFunction](https://www.scala-lang.org/api/2.13.15/scala/PartialFunction.html#scala.PartialFunction)\[[HttpRequest](https://doc.akka.io/api/akka-http/10.6.3/akka/http/scaladsl/model/HttpRequest.html#akka.http.scaladsl.model.HttpRequest), [Future](https://www.scala-lang.org/api/2.13.15/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](https://doc.akka.io/api/akka-http/10.6.3/akka/http/scaladsl/model/HttpResponse.html#akka.http.scaladsl.model.HttpResponse)]]The gRPC route that can be included in an Akka HTTP server.
12. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html "Permalink")  object [EventProducerSource](EventProducer$$EventProducerSource$.html)
23. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation$.html "Permalink")  object [Transformation](EventProducer$$Transformation$.html)
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.6.3/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.6.3/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/scaladsl/EventProducer$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/scaladsl/EventProducerInterceptor.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/scaladsl/EventProducerPush$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/scaladsl/EventProducerPush.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html
- https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/scaladsl/EventProducer$.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/scaladsl/EventProducer$.html)*