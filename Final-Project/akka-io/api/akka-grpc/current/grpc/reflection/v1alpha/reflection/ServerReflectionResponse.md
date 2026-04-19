---
description: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionResponse
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html
title: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionResponse
---

# Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionResponse

> **Summary:** Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionResponse

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
- [ServerReflectionHandler](ServerReflectionHandler$.html)
- [ServerReflectionMarshallers](ServerReflectionMarshallers$.html)
- [ServerReflectionRequest](ServerReflectionRequest.html "The message sent by the client when calling ServerReflectionInfo method.")
- ServerReflectionResponse
- [ServiceResponse](ServiceResponse.html "The information of a single service used by ListServiceResponse to answer list_services request.")
[c](ServerReflectionResponse$.html "See companion object")[grpc](../../../index.html).[reflection](../../index.html).[v1alpha](../index.html).[reflection](index.html)

# [ServerReflectionResponse](ServerReflectionResponse$.html "See companion object")[**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html "Permalink")

### Companion [object ServerReflectionResponse](ServerReflectionResponse$.html "See companion object")

#### final  case class ServerReflectionResponse(validHost: String \= "", originalRequest: Option\[[ServerReflectionRequest](ServerReflectionRequest.html)] \= \_root\_.scala.None, messageResponse: [MessageResponse](ServerReflectionResponse$$MessageResponse.html) \= [grpc.reflection.v1alpha.reflection.ServerReflectionResponse.MessageResponse.Empty](../../../index.html), unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty) extends GeneratedMessage with Updatable\[ServerReflectionResponse] with Product with Serializable

The message sent by the server to answer ServerReflectionInfo method.

Annotations@SerialVersionUID() Source[ServerReflectionResponse.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/target/scala-2.13/src_managed/main/grpc/reflection/v1alpha/reflection/ServerReflectionResponse.scala#L11)Linear SupertypesUpdatable\[ServerReflectionResponse], GeneratedMessage, [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), Product, Equals, AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServerReflectionResponse
2. Updatable
3. GeneratedMessage
4. Serializable
5. Product
6. Equals
7. AnyRef
8. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#<init>(validHost:String,originalRequest:Option[grpc.reflection.v1alpha.reflection.ServerReflectionRequest],messageResponse:grpc.reflection.v1alpha.reflection.ServerReflectionResponse.MessageResponse,unknownFields:scalapb.UnknownFieldSet):grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  new ServerReflectionResponse(validHost: String \= "", originalRequest: Option\[[ServerReflectionRequest](ServerReflectionRequest.html)] \= \_root\_.scala.None, messageResponse: [MessageResponse](ServerReflectionResponse$$MessageResponse.html) \= [grpc.reflection.v1alpha.reflection.ServerReflectionResponse.MessageResponse.Empty](../../../index.html), unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty)
### Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#clearMessageResponse:grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  def clearMessageResponse: ServerReflectionResponse
6. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#clearOriginalRequest:grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  def clearOriginalRequest: ServerReflectionResponse
7. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
8. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#companion:grpc.reflection.v1alpha.reflection.ServerReflectionResponse.type "Permalink")  def companion: [ServerReflectionResponse](ServerReflectionResponse$.html).typeDefinition ClassesServerReflectionResponse → GeneratedMessage
9. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#discardUnknownFields:grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  def discardUnknownFields: ServerReflectionResponse
10. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
11. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#getAllExtensionNumbersResponse:grpc.reflection.v1alpha.reflection.ExtensionNumberResponse "Permalink")  def getAllExtensionNumbersResponse: [ExtensionNumberResponse](ExtensionNumberResponse.html)
12. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#getErrorResponse:grpc.reflection.v1alpha.reflection.ErrorResponse "Permalink")  def getErrorResponse: [ErrorResponse](ErrorResponse.html)
14. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#getField(__field:scalapb.descriptors.FieldDescriptor):scalapb.descriptors.PValue "Permalink")  def getField(\_\_field: FieldDescriptor): PValueDefinition ClassesServerReflectionResponse → GeneratedMessage
15. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#getFieldByNumber(__fieldNumber:Int):Any "Permalink")  def getFieldByNumber(\_\_fieldNumber: Int): AnyDefinition ClassesServerReflectionResponse → GeneratedMessage
16. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#getFileDescriptorResponse:grpc.reflection.v1alpha.reflection.FileDescriptorResponse "Permalink")  def getFileDescriptorResponse: [FileDescriptorResponse](FileDescriptorResponse.html)
17. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#getListServicesResponse:grpc.reflection.v1alpha.reflection.ListServiceResponse "Permalink")  def getListServicesResponse: [ListServiceResponse](ListServiceResponse.html)
18. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#getOriginalRequest:grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  def getOriginalRequest: [ServerReflectionRequest](ServerReflectionRequest.html)
19. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
20. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#messageResponse:grpc.reflection.v1alpha.reflection.ServerReflectionResponse.MessageResponse "Permalink")  val messageResponse: [MessageResponse](ServerReflectionResponse$$MessageResponse.html)
21. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
22. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
23. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
24. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#originalRequest:Option[grpc.reflection.v1alpha.reflection.ServerReflectionRequest] "Permalink")  val originalRequest: Option\[[ServerReflectionRequest](ServerReflectionRequest.html)]
25. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
26. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#serializedSize:Int "Permalink")  def serializedSize: IntDefinition ClassesServerReflectionResponse → GeneratedMessage
27. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#toByteArray:Array[Byte] "Permalink") final  def toByteArray: Array\[Byte]Definition ClassesGeneratedMessage
29. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#toByteString:com.google.protobuf.ByteString "Permalink") final  def toByteString: ByteStringDefinition ClassesGeneratedMessage
30. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#toPMessage:scalapb.descriptors.PMessage "Permalink") final  def toPMessage: PMessageDefinition ClassesGeneratedMessage
31. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#toProtoString:String "Permalink")  def toProtoString: StringDefinition ClassesServerReflectionResponse → GeneratedMessage
32. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#unknownFields:scalapb.UnknownFieldSet "Permalink")  val unknownFields: UnknownFieldSet
33. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#update(ms:scalapb.lenses.Lens[A,A]=>scalapb.lenses.Mutation[A]*):A "Permalink")  def update(ms: (Lens\[ServerReflectionResponse, ServerReflectionResponse]) \=\> Mutation\[ServerReflectionResponse]\*): ServerReflectionResponseDefinition ClassesUpdatable
34. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#validHost:String "Permalink")  val validHost: String
35. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
38. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#withAllExtensionNumbersResponse(__v:grpc.reflection.v1alpha.reflection.ExtensionNumberResponse):grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  def withAllExtensionNumbersResponse(\_\_v: [ExtensionNumberResponse](ExtensionNumberResponse.html)): ServerReflectionResponse
39. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#withErrorResponse(__v:grpc.reflection.v1alpha.reflection.ErrorResponse):grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  def withErrorResponse(\_\_v: [ErrorResponse](ErrorResponse.html)): ServerReflectionResponse
40. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#withFileDescriptorResponse(__v:grpc.reflection.v1alpha.reflection.FileDescriptorResponse):grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  def withFileDescriptorResponse(\_\_v: [FileDescriptorResponse](FileDescriptorResponse.html)): ServerReflectionResponse
41. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#withListServicesResponse(__v:grpc.reflection.v1alpha.reflection.ListServiceResponse):grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  def withListServicesResponse(\_\_v: [ListServiceResponse](ListServiceResponse.html)): ServerReflectionResponse
42. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#withMessageResponse(__v:grpc.reflection.v1alpha.reflection.ServerReflectionResponse.MessageResponse):grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  def withMessageResponse(\_\_v: [MessageResponse](ServerReflectionResponse$$MessageResponse.html)): ServerReflectionResponse
43. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#withOriginalRequest(__v:grpc.reflection.v1alpha.reflection.ServerReflectionRequest):grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  def withOriginalRequest(\_\_v: [ServerReflectionRequest](ServerReflectionRequest.html)): ServerReflectionResponse
44. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#withUnknownFields(__v:scalapb.UnknownFieldSet):grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  def withUnknownFields(\_\_v: UnknownFieldSet): ServerReflectionResponse
45. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#withValidHost(__v:String):grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  def withValidHost(\_\_v: String): ServerReflectionResponse
46. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#writeDelimitedTo(output:java.io.OutputStream):Unit "Permalink") final  def writeDelimitedTo(output: [OutputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)): UnitDefinition ClassesGeneratedMessage
47. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#writeTo(_output__:com.google.protobuf.CodedOutputStream):Unit "Permalink")  def writeTo(\_output\_\_: CodedOutputStream): UnitDefinition ClassesServerReflectionResponse → GeneratedMessage
48. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#writeTo(output:java.io.OutputStream):Unit "Permalink") final  def writeTo(output: [OutputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)): UnitDefinition ClassesGeneratedMessage
### Deprecated Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from Updatable\[ServerReflectionResponse]

### Inherited from GeneratedMessage

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from Product

### Inherited from Equals

### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

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
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$$MessageResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html](https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html)*