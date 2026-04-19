---
description: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ListServiceResponse
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ListServiceResponse.html
title: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ListServiceResponse
---

# Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ListServiceResponse

> **Summary:** Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ListServiceResponse

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
- ListServiceResponse
- [ReflectionProto](ReflectionProto$.html)
- [ServerReflection](ServerReflection.html)
- [ServerReflectionClient](ServerReflectionClient.html)
- [ServerReflectionClientPowerApi](ServerReflectionClientPowerApi.html)
- [ServerReflectionHandler](ServerReflectionHandler$.html)
- [ServerReflectionMarshallers](ServerReflectionMarshallers$.html)
- [ServerReflectionRequest](ServerReflectionRequest.html "The message sent by the client when calling ServerReflectionInfo method.")
- [ServerReflectionResponse](ServerReflectionResponse.html "The message sent by the server to answer ServerReflectionInfo method.")
- [ServiceResponse](ServiceResponse.html "The information of a single service used by ListServiceResponse to answer list_services request.")
[c](ListServiceResponse$.html "See companion object")[grpc](../../../index.html).[reflection](../../index.html).[v1alpha](../index.html).[reflection](index.html)

# [ListServiceResponse](ListServiceResponse$.html "See companion object")[**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html "Permalink")

### Companion [object ListServiceResponse](ListServiceResponse$.html "See companion object")

#### final  case class ListServiceResponse(service: Seq\[[ServiceResponse](ServiceResponse.html)] \= \_root\_.scala.Seq.empty, unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty) extends GeneratedMessage with Updatable\[ListServiceResponse] with Product with Serializable

A list of ServiceResponse sent by the server answering list\_services request.

service
 The information of each service may be expanded in the future, so we use
 ServiceResponse message to encapsulate it.

Annotations@SerialVersionUID() Source[ListServiceResponse.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/target/scala-2.13/src_managed/main/grpc/reflection/v1alpha/reflection/ListServiceResponse.scala#L15)Linear SupertypesUpdatable\[ListServiceResponse], GeneratedMessage, [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), Product, Equals, AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ListServiceResponse
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

1. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#<init>(service:Seq[grpc.reflection.v1alpha.reflection.ServiceResponse],unknownFields:scalapb.UnknownFieldSet):grpc.reflection.v1alpha.reflection.ListServiceResponse "Permalink")  new ListServiceResponse(service: Seq\[[ServiceResponse](ServiceResponse.html)] \= \_root\_.scala.Seq.empty, unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty)service
 The information of each service may be expanded in the future, so we use
 ServiceResponse message to encapsulate it.
### Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#addAllService(__vs:Iterable[grpc.reflection.v1alpha.reflection.ServiceResponse]):grpc.reflection.v1alpha.reflection.ListServiceResponse "Permalink")  def addAllService(\_\_vs: Iterable\[[ServiceResponse](ServiceResponse.html)]): ListServiceResponse
5. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#addService(__vs:grpc.reflection.v1alpha.reflection.ServiceResponse*):grpc.reflection.v1alpha.reflection.ListServiceResponse "Permalink")  def addService(\_\_vs: [ServiceResponse](ServiceResponse.html)\*): ListServiceResponse
6. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#clearService:grpc.reflection.v1alpha.reflection.ListServiceResponse "Permalink")  def clearService: ListServiceResponse
8. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
9. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#companion:grpc.reflection.v1alpha.reflection.ListServiceResponse.type "Permalink")  def companion: [ListServiceResponse](ListServiceResponse$.html).typeDefinition ClassesListServiceResponse → GeneratedMessage
10. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#discardUnknownFields:grpc.reflection.v1alpha.reflection.ListServiceResponse "Permalink")  def discardUnknownFields: ListServiceResponse
11. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#getField(__field:scalapb.descriptors.FieldDescriptor):scalapb.descriptors.PValue "Permalink")  def getField(\_\_field: FieldDescriptor): PValueDefinition ClassesListServiceResponse → GeneratedMessage
14. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#getFieldByNumber(__fieldNumber:Int):Any "Permalink")  def getFieldByNumber(\_\_fieldNumber: Int): AnyDefinition ClassesListServiceResponse → GeneratedMessage
15. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
16. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
17. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
18. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
19. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#serializedSize:Int "Permalink")  def serializedSize: IntDefinition ClassesListServiceResponse → GeneratedMessage
21. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#service:Seq[grpc.reflection.v1alpha.reflection.ServiceResponse] "Permalink")  val service: Seq\[[ServiceResponse](ServiceResponse.html)]
22. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#toByteArray:Array[Byte] "Permalink") final  def toByteArray: Array\[Byte]Definition ClassesGeneratedMessage
24. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#toByteString:com.google.protobuf.ByteString "Permalink") final  def toByteString: ByteStringDefinition ClassesGeneratedMessage
25. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#toPMessage:scalapb.descriptors.PMessage "Permalink") final  def toPMessage: PMessageDefinition ClassesGeneratedMessage
26. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#toProtoString:String "Permalink")  def toProtoString: StringDefinition ClassesListServiceResponse → GeneratedMessage
27. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#unknownFields:scalapb.UnknownFieldSet "Permalink")  val unknownFields: UnknownFieldSet
28. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#update(ms:scalapb.lenses.Lens[A,A]=>scalapb.lenses.Mutation[A]*):A "Permalink")  def update(ms: (Lens\[ListServiceResponse, ListServiceResponse]) \=\> Mutation\[ListServiceResponse]\*): ListServiceResponseDefinition ClassesUpdatable
29. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#withService(__v:Seq[grpc.reflection.v1alpha.reflection.ServiceResponse]):grpc.reflection.v1alpha.reflection.ListServiceResponse "Permalink")  def withService(\_\_v: Seq\[[ServiceResponse](ServiceResponse.html)]): ListServiceResponse
33. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#withUnknownFields(__v:scalapb.UnknownFieldSet):grpc.reflection.v1alpha.reflection.ListServiceResponse "Permalink")  def withUnknownFields(\_\_v: UnknownFieldSet): ListServiceResponse
34. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#writeDelimitedTo(output:java.io.OutputStream):Unit "Permalink") final  def writeDelimitedTo(output: [OutputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)): UnitDefinition ClassesGeneratedMessage
35. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#writeTo(_output__:com.google.protobuf.CodedOutputStream):Unit "Permalink")  def writeTo(\_output\_\_: CodedOutputStream): UnitDefinition ClassesListServiceResponse → GeneratedMessage
36. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#writeTo(output:java.io.OutputStream):Unit "Permalink") final  def writeTo(output: [OutputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)): UnitDefinition ClassesGeneratedMessage
### Deprecated Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from Updatable\[ListServiceResponse]

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
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ListServiceResponse.html](https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ListServiceResponse.html)*