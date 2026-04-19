---
description: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionHandler
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html
title: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionHandler
---

# Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionHandler

> **Summary:** Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionHandler

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../grpc/index.html "Permalink")  package [grpc](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../grpc/reflection/index.html "Permalink")  package [reflection](../../index.html)Definition Classes[grpc](../../../index.html)
- [**](../../../../grpc/reflection/v1alpha/index.html "Permalink")  package [v1alpha](../index.html)Definition Classes[reflection](../../index.html)
- [**](../../../../grpc/reflection/v1alpha/reflection/index.html "Permalink")  package [reflection](index.html)Definition Classes[v1alpha](../index.html)
- [ErrorResponse](ErrorResponse.html "The error code and error message sent by the server when an error occurs.")
- [ExtensionNumberResponse](ExtensionNumberResponse.html "A list of extension numbers sent by the server answering all_extension_numbers_of_type request.")
- [ExtensionRequest](ExtensionRequest.html "The type name and extension number sent by the client when requesting file_containing_extension.")
- [FileDescriptorResponse](FileDescriptorResponse.html "Serialized FileDescriptorProto messages sent by the server answering a file_by_filename, file_containing_symbol, or file_containing_extension request.")
- [ListServiceResponse](ListServiceResponse.html "A list of ServiceResponse sent by the server answering list_services request.")
- [ReflectionProto](ReflectionProto$.html)
- [ServerReflection](ServerReflection.html)
- [ServerReflectionClient](ServerReflectionClient.html)
- [ServerReflectionClientPowerApi](ServerReflectionClientPowerApi.html)
- ServerReflectionHandler
- [ServerReflectionMarshallers](ServerReflectionMarshallers$.html)
- [ServerReflectionRequest](ServerReflectionRequest.html "The message sent by the client when calling ServerReflectionInfo method.")
- [ServerReflectionResponse](ServerReflectionResponse.html "The message sent by the server to answer ServerReflectionInfo method.")
- [ServiceResponse](ServiceResponse.html "The information of a single service used by ListServiceResponse to answer list_services request.")
o[grpc](../../../index.html).[reflection](../../index.html).[v1alpha](../index.html).[reflection](index.html)

# ServerReflectionHandler[**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html "Permalink")

### 

#### object ServerReflectionHandler

Annotations@ApiMayChange() @[AkkaGrpcGenerated](../../../../akka/grpc/AkkaGrpcGenerated.html)() Source[ServerReflectionHandler.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/target/scala-2.13/src_managed/main/grpc/reflection/v1alpha/reflection/ServerReflectionHandler.scala#L32)Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServerReflectionHandler
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#apply(implementation:grpc.reflection.v1alpha.reflection.ServerReflection,prefix:String,eHandler:akka.actor.ActorSystem=>PartialFunction[Throwable,akka.grpc.Trailers])(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpRequest=>scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse] "Permalink")  def apply(implementation: [ServerReflection](ServerReflection.html), prefix: String, eHandler: (ActorSystem) \=\> PartialFunction\[Throwable, [Trailers](../../../../akka/grpc/Trailers.html)])(implicit system: ClassicActorSystemProvider): (HttpRequest) \=\> Future\[HttpResponse]Creates a `HttpRequest` to `HttpResponse` handler that can be used in for example `Http().bindAndHandleAsync`
for the generated partial function handler and ends with `StatusCodes.NotFound` if the request is not matching.

Creates a `HttpRequest` to `HttpResponse` handler that can be used in for example `Http().bindAndHandleAsync`
for the generated partial function handler and ends with `StatusCodes.NotFound` if the request is not matching.

Use `akka.grpc.scaladsl.ServiceHandler.concatOrNotFound` with `ServerReflectionHandler.partial` when combining
several services.

Registering a gRPC service under a custom prefix is not widely supported and strongly discouraged by the specification.
5. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#apply(implementation:grpc.reflection.v1alpha.reflection.ServerReflection,prefix:String)(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpRequest=>scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse] "Permalink")  def apply(implementation: [ServerReflection](ServerReflection.html), prefix: String)(implicit system: ClassicActorSystemProvider): (HttpRequest) \=\> Future\[HttpResponse]Creates a `HttpRequest` to `HttpResponse` handler that can be used in for example `Http().bindAndHandleAsync`
for the generated partial function handler and ends with `StatusCodes.NotFound` if the request is not matching.

Creates a `HttpRequest` to `HttpResponse` handler that can be used in for example `Http().bindAndHandleAsync`
for the generated partial function handler and ends with `StatusCodes.NotFound` if the request is not matching.

Use `akka.grpc.scaladsl.ServiceHandler.concatOrNotFound` with `ServerReflectionHandler.partial` when combining
several services.

Registering a gRPC service under a custom prefix is not widely supported and strongly discouraged by the specification.
6. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#apply(implementation:grpc.reflection.v1alpha.reflection.ServerReflection,eHandler:akka.actor.ActorSystem=>PartialFunction[Throwable,akka.grpc.Trailers])(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpRequest=>scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse] "Permalink")  def apply(implementation: [ServerReflection](ServerReflection.html), eHandler: (ActorSystem) \=\> PartialFunction\[Throwable, [Trailers](../../../../akka/grpc/Trailers.html)])(implicit system: ClassicActorSystemProvider): (HttpRequest) \=\> Future\[HttpResponse]Creates a `HttpRequest` to `HttpResponse` handler that can be used in for example `Http().bindAndHandleAsync`
for the generated partial function handler and ends with `StatusCodes.NotFound` if the request is not matching.

Creates a `HttpRequest` to `HttpResponse` handler that can be used in for example `Http().bindAndHandleAsync`
for the generated partial function handler and ends with `StatusCodes.NotFound` if the request is not matching.

Use `akka.grpc.scaladsl.ServiceHandler.concatOrNotFound` with `ServerReflectionHandler.partial` when combining
several services.
7. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#apply(implementation:grpc.reflection.v1alpha.reflection.ServerReflection)(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpRequest=>scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse] "Permalink")  def apply(implementation: [ServerReflection](ServerReflection.html))(implicit system: ClassicActorSystemProvider): (HttpRequest) \=\> Future\[HttpResponse]Creates a `HttpRequest` to `HttpResponse` handler that can be used in for example `Http().bindAndHandleAsync`
for the generated partial function handler and ends with `StatusCodes.NotFound` if the request is not matching.

Creates a `HttpRequest` to `HttpResponse` handler that can be used in for example `Http().bindAndHandleAsync`
for the generated partial function handler and ends with `StatusCodes.NotFound` if the request is not matching.

Use `akka.grpc.scaladsl.ServiceHandler.concatOrNotFound` with `ServerReflectionHandler.partial` when combining
several services.
8. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
10. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
11. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
12. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
14. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
15. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
16. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
17. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
18. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#partial(implementation:grpc.reflection.v1alpha.reflection.ServerReflection,prefix:String,eHandler:akka.actor.ActorSystem=>PartialFunction[Throwable,akka.grpc.Trailers])(implicitsystem:akka.actor.ClassicActorSystemProvider):PartialFunction[akka.http.scaladsl.model.HttpRequest,scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse]] "Permalink")  def partial(implementation: [ServerReflection](ServerReflection.html), prefix: String \= [ServerReflection.name](ServerReflection$.html), eHandler: (ActorSystem) \=\> PartialFunction\[Throwable, [Trailers](../../../../akka/grpc/Trailers.html)] \= [GrpcExceptionHandler.defaultMapper](../../../../akka/index.html))(implicit system: ClassicActorSystemProvider): PartialFunction\[HttpRequest, Future\[HttpResponse]]Creates a partial `HttpRequest` to `HttpResponse` handler that can be combined with handlers of other
services with `akka.grpc.scaladsl.ServiceHandler.concatOrNotFound` and then used in for example
`Http().bindAndHandleAsync`.

Creates a partial `HttpRequest` to `HttpResponse` handler that can be combined with handlers of other
services with `akka.grpc.scaladsl.ServiceHandler.concatOrNotFound` and then used in for example
`Http().bindAndHandleAsync`.

Use `ServerReflectionHandler.apply` if the server is only handling one service.

Registering a gRPC service under a custom prefix is not widely supported and strongly discouraged by the specification.
19. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/AkkaGrpcGenerated.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/Trailers.html
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/grpc/index.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/index.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/index.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ErrorResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ErrorResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ExtensionNumberResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ExtensionNumberResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ExtensionRequest$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ExtensionRequest.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ListServiceResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ListServiceResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ReflectionProto$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflection$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflection.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionClient$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionClient.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionMarshallers$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html](https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html)*