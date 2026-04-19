---
description: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionRequest
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html
title: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionRequest
---

# Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionRequest

> **Summary:** Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionRequest

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
- ServerReflectionRequest
- [ServerReflectionResponse](ServerReflectionResponse.html "The message sent by the server to answer ServerReflectionInfo method.")
- [ServiceResponse](ServiceResponse.html "The information of a single service used by ListServiceResponse to answer list_services request.")
[c](ServerReflectionRequest$.html "See companion object")[grpc](../../../index.html).[reflection](../../index.html).[v1alpha](../index.html).[reflection](index.html)

# [ServerReflectionRequest](ServerReflectionRequest$.html "See companion object")[**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html "Permalink")

### Companion [object ServerReflectionRequest](ServerReflectionRequest$.html "See companion object")

#### final  case class ServerReflectionRequest(host: String \= "", messageRequest: [MessageRequest](ServerReflectionRequest$$MessageRequest.html) \= [grpc.reflection.v1alpha.reflection.ServerReflectionRequest.MessageRequest.Empty](../../../index.html), unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty) extends GeneratedMessage with Updatable\[ServerReflectionRequest] with Product with Serializable

The message sent by the client when calling ServerReflectionInfo method.

Annotations@SerialVersionUID() Source[ServerReflectionRequest.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/target/scala-2.13/src_managed/main/grpc/reflection/v1alpha/reflection/ServerReflectionRequest.scala#L11)Linear SupertypesUpdatable\[ServerReflectionRequest], GeneratedMessage, [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), Product, Equals, AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServerReflectionRequest
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

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#<init>(host:String,messageRequest:grpc.reflection.v1alpha.reflection.ServerReflectionRequest.MessageRequest,unknownFields:scalapb.UnknownFieldSet):grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  new ServerReflectionRequest(host: String \= "", messageRequest: [MessageRequest](ServerReflectionRequest$$MessageRequest.html) \= [grpc.reflection.v1alpha.reflection.ServerReflectionRequest.MessageRequest.Empty](../../../index.html), unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty)
### Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#clearMessageRequest:grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  def clearMessageRequest: ServerReflectionRequest
6. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#companion:grpc.reflection.v1alpha.reflection.ServerReflectionRequest.type "Permalink")  def companion: [ServerReflectionRequest](ServerReflectionRequest$.html).typeDefinition ClassesServerReflectionRequest → GeneratedMessage
8. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#discardUnknownFields:grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  def discardUnknownFields: ServerReflectionRequest
9. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
10. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#getAllExtensionNumbersOfType:String "Permalink")  def getAllExtensionNumbersOfType: String
11. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#getField(__field:scalapb.descriptors.FieldDescriptor):scalapb.descriptors.PValue "Permalink")  def getField(\_\_field: FieldDescriptor): PValueDefinition ClassesServerReflectionRequest → GeneratedMessage
13. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#getFieldByNumber(__fieldNumber:Int):Any "Permalink")  def getFieldByNumber(\_\_fieldNumber: Int): AnyDefinition ClassesServerReflectionRequest → GeneratedMessage
14. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#getFileByFilename:String "Permalink")  def getFileByFilename: String
15. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#getFileContainingExtension:grpc.reflection.v1alpha.reflection.ExtensionRequest "Permalink")  def getFileContainingExtension: [ExtensionRequest](ExtensionRequest.html)
16. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#getFileContainingSymbol:String "Permalink")  def getFileContainingSymbol: String
17. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#getListServices:String "Permalink")  def getListServices: String
18. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#host:String "Permalink")  val host: String
19. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
20. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#messageRequest:grpc.reflection.v1alpha.reflection.ServerReflectionRequest.MessageRequest "Permalink")  val messageRequest: [MessageRequest](ServerReflectionRequest$$MessageRequest.html)
21. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
22. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
23. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
24. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
25. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#serializedSize:Int "Permalink")  def serializedSize: IntDefinition ClassesServerReflectionRequest → GeneratedMessage
26. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#toByteArray:Array[Byte] "Permalink") final  def toByteArray: Array\[Byte]Definition ClassesGeneratedMessage
28. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#toByteString:com.google.protobuf.ByteString "Permalink") final  def toByteString: ByteStringDefinition ClassesGeneratedMessage
29. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#toPMessage:scalapb.descriptors.PMessage "Permalink") final  def toPMessage: PMessageDefinition ClassesGeneratedMessage
30. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#toProtoString:String "Permalink")  def toProtoString: StringDefinition ClassesServerReflectionRequest → GeneratedMessage
31. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#unknownFields:scalapb.UnknownFieldSet "Permalink")  val unknownFields: UnknownFieldSet
32. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#update(ms:scalapb.lenses.Lens[A,A]=>scalapb.lenses.Mutation[A]*):A "Permalink")  def update(ms: (Lens\[ServerReflectionRequest, ServerReflectionRequest]) \=\> Mutation\[ServerReflectionRequest]\*): ServerReflectionRequestDefinition ClassesUpdatable
33. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#withAllExtensionNumbersOfType(__v:String):grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  def withAllExtensionNumbersOfType(\_\_v: String): ServerReflectionRequest
37. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#withFileByFilename(__v:String):grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  def withFileByFilename(\_\_v: String): ServerReflectionRequest
38. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#withFileContainingExtension(__v:grpc.reflection.v1alpha.reflection.ExtensionRequest):grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  def withFileContainingExtension(\_\_v: [ExtensionRequest](ExtensionRequest.html)): ServerReflectionRequest
39. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#withFileContainingSymbol(__v:String):grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  def withFileContainingSymbol(\_\_v: String): ServerReflectionRequest
40. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#withHost(__v:String):grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  def withHost(\_\_v: String): ServerReflectionRequest
41. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#withListServices(__v:String):grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  def withListServices(\_\_v: String): ServerReflectionRequest
42. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#withMessageRequest(__v:grpc.reflection.v1alpha.reflection.ServerReflectionRequest.MessageRequest):grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  def withMessageRequest(\_\_v: [MessageRequest](ServerReflectionRequest$$MessageRequest.html)): ServerReflectionRequest
43. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#withUnknownFields(__v:scalapb.UnknownFieldSet):grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  def withUnknownFields(\_\_v: UnknownFieldSet): ServerReflectionRequest
44. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#writeDelimitedTo(output:java.io.OutputStream):Unit "Permalink") final  def writeDelimitedTo(output: [OutputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)): UnitDefinition ClassesGeneratedMessage
45. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#writeTo(_output__:com.google.protobuf.CodedOutputStream):Unit "Permalink")  def writeTo(\_output\_\_: CodedOutputStream): UnitDefinition ClassesServerReflectionRequest → GeneratedMessage
46. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#writeTo(output:java.io.OutputStream):Unit "Permalink") final  def writeTo(output: [OutputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)): UnitDefinition ClassesGeneratedMessage
### Deprecated Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from Updatable\[ServerReflectionRequest]

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
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest$$MessageRequest.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html](https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html)*