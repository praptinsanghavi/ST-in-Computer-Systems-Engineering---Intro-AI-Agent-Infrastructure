---
description: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionClientPowerApi
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html
title: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionClientPowerApi
---

# Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionClientPowerApi

> **Summary:** Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionClientPowerApi

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
- ServerReflectionClientPowerApi
- [ServerReflectionHandler](ServerReflectionHandler$.html)
- [ServerReflectionMarshallers](ServerReflectionMarshallers$.html)
- [ServerReflectionRequest](ServerReflectionRequest.html "The message sent by the client when calling ServerReflectionInfo method.")
- [ServerReflectionResponse](ServerReflectionResponse.html "The message sent by the server to answer ServerReflectionInfo method.")
- [ServiceResponse](ServiceResponse.html "The information of a single service used by ListServiceResponse to answer list_services request.")
t[grpc](../../../index.html).[reflection](../../index.html).[v1alpha](../index.html).[reflection](index.html)

# ServerReflectionClientPowerApi[**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html "Permalink")

### 

#### trait ServerReflectionClientPowerApi extends AnyRef

Annotations@[AkkaGrpcGenerated](../../../../akka/grpc/AkkaGrpcGenerated.html)() Source[ServerReflectionClient.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/target/scala-2.13/src_managed/main/grpc/reflection/v1alpha/reflection/ServerReflectionClient.scala#L90)Linear SupertypesAnyRef, AnyKnown Subclasses[ServerReflectionClient](ServerReflectionClient.html)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServerReflectionClientPowerApi
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
11. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
13. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
14. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#serverReflectionInfo():akka.grpc.scaladsl.StreamResponseRequestBuilder[akka.stream.scaladsl.Source[grpc.reflection.v1alpha.reflection.ServerReflectionRequest,akka.NotUsed],grpc.reflection.v1alpha.reflection.ServerReflectionResponse] "Permalink")  def serverReflectionInfo(): [StreamResponseRequestBuilder](../../../../akka/grpc/scaladsl/StreamResponseRequestBuilder.html)\[Source\[[ServerReflectionRequest](ServerReflectionRequest.html), NotUsed], [ServerReflectionResponse](ServerReflectionResponse.html)]Lower level "lifted" version of the method, giving access to request metadata etc.

Lower level "lifted" version of the method, giving access to request metadata etc.
prefer serverReflectionInfo(akka.stream.scaladsl.Source\[grpc.reflection.v1alpha.reflection.ServerReflectionRequest, akka.NotUsed]) if possible.
15. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/AkkaGrpcGenerated.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/StreamResponseRequestBuilder.html
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
*Source: [https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html](https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html)*