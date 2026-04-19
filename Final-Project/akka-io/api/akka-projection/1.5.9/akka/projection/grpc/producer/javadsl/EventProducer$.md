---
description: Akka Projection 1.5.9 - akka.projection.grpc.producer.javadsl.EventProducer
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/javadsl/EventProducer$.html
title: Akka Projection 1.5.9 - akka.projection.grpc.producer.javadsl.EventProducer
---

# Akka Projection 1.5.9 - akka.projection.grpc.producer.javadsl.EventProducer

> **Summary:** Akka Projection 1.5.9 - akka.projection.grpc.producer.javadsl.EventProducer

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/producer/index.html "Permalink")  package [producer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/producer/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[producer](../index.html)
- EventProducer
- [EventProducerInterceptor](EventProducerInterceptor.html "Interceptor allowing for example authentication/authorization of incoming requests to consume a specific stream.")
- [EventProducerPush](EventProducerPush.html)
- [EventProducerSource](EventProducerSource.html)
- [Mapper](Mapper.html)
- [Transformation](Transformation.html "Transformation of events to the external (public) representation.")
o[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[producer](../index.html).[javadsl](index.html)

# EventProducer[**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html "Permalink")

### 

#### object EventProducer

The event producer implementation that can be included a gRPC route in an Akka HTTP server.

Source[EventProducer.scala](https://github.com/akka/akka-projection/tree/v1.5.9/akka-projection-grpc/src/main/scala/akka/projection/grpc/producer/javadsl/EventProducer.scala#L25)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventProducer
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#grpcServiceHandler(system:akka.actor.typed.ActorSystem[_],sources:java.util.Set[akka.projection.grpc.producer.javadsl.EventProducerSource],interceptor:java.util.Optional[akka.projection.grpc.producer.javadsl.EventProducerInterceptor]):akka.japi.function.Function[akka.http.javadsl.model.HttpRequest,java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse]] "Permalink")  def grpcServiceHandler(system: [ActorSystem](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_], sources: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[EventProducerSource](EventProducerSource.html)], interceptor: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[EventProducerInterceptor](EventProducerInterceptor.html)]): [Function](https://doc.akka.io/api/akka/2.9.6/akka/japi/function/Function.html#akka.japi.function.Function)\[[HttpRequest](https://doc.akka.io/api/akka-http/10.6.3/akka/http/javadsl/model/HttpRequest.html#akka.http.javadsl.model.HttpRequest), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](https://doc.akka.io/api/akka-http/10.6.3/akka/http/javadsl/model/HttpResponse.html#akka.http.javadsl.model.HttpResponse)]]The gRPC route that can be included in an Akka HTTP server.

The gRPC route that can be included in an Akka HTTP server.

sourcesAll sources that should be available from this event producer

interceptorAn optional request interceptor applied to each request to the service
10. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#grpcServiceHandler(system:akka.actor.typed.ActorSystem[_],sources:java.util.Set[akka.projection.grpc.producer.javadsl.EventProducerSource]):akka.japi.function.Function[akka.http.javadsl.model.HttpRequest,java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse]] "Permalink")  def grpcServiceHandler(system: [ActorSystem](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_], sources: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[EventProducerSource](EventProducerSource.html)]): [Function](https://doc.akka.io/api/akka/2.9.6/akka/japi/function/Function.html#akka.japi.function.Function)\[[HttpRequest](https://doc.akka.io/api/akka-http/10.6.3/akka/http/javadsl/model/HttpRequest.html#akka.http.javadsl.model.HttpRequest), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](https://doc.akka.io/api/akka-http/10.6.3/akka/http/javadsl/model/HttpResponse.html#akka.http.javadsl.model.HttpResponse)]]The gRPC route that can be included in an Akka HTTP server.

The gRPC route that can be included in an Akka HTTP server.

sourcesAll sources that should be available from this event producer
11. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#grpcServiceHandler(system:akka.actor.typed.ActorSystem[_],source:akka.projection.grpc.producer.javadsl.EventProducerSource):akka.japi.function.Function[akka.http.javadsl.model.HttpRequest,java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse]] "Permalink")  def grpcServiceHandler(system: [ActorSystem](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_], source: [EventProducerSource](EventProducerSource.html)): [Function](https://doc.akka.io/api/akka/2.9.6/akka/japi/function/Function.html#akka.japi.function.Function)\[[HttpRequest](https://doc.akka.io/api/akka-http/10.6.3/akka/http/javadsl/model/HttpRequest.html#akka.http.javadsl.model.HttpRequest), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](https://doc.akka.io/api/akka-http/10.6.3/akka/http/javadsl/model/HttpResponse.html#akka.http.javadsl.model.HttpResponse)]]The gRPC route that can be included in an Akka HTTP server.

The gRPC route that can be included in an Akka HTTP server.

sourceThe source that should be available from this event producer
12. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/producer/javadsl/EventProducer$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.6.3/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.6.3/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/javadsl/EventProducer$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/javadsl/EventProducerInterceptor.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/javadsl/EventProducerPush$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/javadsl/EventProducerPush.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/javadsl/EventProducerSource$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/javadsl/EventProducerSource.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/javadsl/Mapper.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/javadsl/Transformation$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/javadsl/Transformation.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html
- https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.9.6/akka/japi/function/Function.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/javadsl/EventProducer$.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/producer/javadsl/EventProducer$.html)*