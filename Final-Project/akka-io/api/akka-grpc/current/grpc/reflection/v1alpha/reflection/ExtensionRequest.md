---
description: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ExtensionRequest
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ExtensionRequest.html
title: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ExtensionRequest
---

# Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ExtensionRequest

> **Summary:** Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ExtensionRequest

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../grpc/index.html "Permalink")  package [grpc](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../grpc/reflection/index.html "Permalink")  package [reflection](../../index.html)Definition Classes[grpc](../../../index.html)
- [**](../../../../grpc/reflection/v1alpha/index.html "Permalink")  package [v1alpha](../index.html)Definition Classes[reflection](../../index.html)
- [**](../../../../grpc/reflection/v1alpha/reflection/index.html "Permalink")  package [reflection](index.html)Definition Classes[v1alpha](../index.html)
- [ErrorResponse](ErrorResponse.html "The error code and error message sent by the server when an error occurs.")
- [ExtensionNumberResponse](ExtensionNumberResponse.html "A list of extension numbers sent by the server answering all_extension_numbers_of_type request.")
- ExtensionRequest
- [FileDescriptorResponse](FileDescriptorResponse.html "Serialized FileDescriptorProto messages sent by the server answering a file_by_filename, file_containing_symbol, or file_containing_extension request.")
- [ListServiceResponse](ListServiceResponse.html "A list of ServiceResponse sent by the server answering list_services request.")
- [ReflectionProto](ReflectionProto$.html)
- [ServerReflection](ServerReflection.html)
- [ServerReflectionClient](ServerReflectionClient.html)
- [ServerReflectionClientPowerApi](ServerReflectionClientPowerApi.html)
- [ServerReflectionHandler](ServerReflectionHandler$.html)
- [ServerReflectionMarshallers](ServerReflectionMarshallers$.html)
- [ServerReflectionRequest](ServerReflectionRequest.html "The message sent by the client when calling ServerReflectionInfo method.")
- [ServerReflectionResponse](ServerReflectionResponse.html "The message sent by the server to answer ServerReflectionInfo method.")
- [ServiceResponse](ServiceResponse.html "The information of a single service used by ListServiceResponse to answer list_services request.")
[c](ExtensionRequest$.html "See companion object")[grpc](../../../index.html).[reflection](../../index.html).[v1alpha](../index.html).[reflection](index.html)

# [ExtensionRequest](ExtensionRequest$.html "See companion object")[**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html "Permalink")

### Companion [object ExtensionRequest](ExtensionRequest$.html "See companion object")

#### final  case class ExtensionRequest(containingType: String \= "", extensionNumber: Int \= 0, unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty) extends GeneratedMessage with Updatable\[ExtensionRequest] with Product with Serializable

The type name and extension number sent by the client when requesting
file\_containing\_extension.

containingType
 Fully\-qualified type name. The format should be \<package\>.\<type\>

Annotations@SerialVersionUID() Source[ExtensionRequest.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/target/scala-2.13/src_managed/main/grpc/reflection/v1alpha/reflection/ExtensionRequest.scala#L15)Linear SupertypesUpdatable\[ExtensionRequest], GeneratedMessage, [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), Product, Equals, AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ExtensionRequest
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

1. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#<init>(containingType:String,extensionNumber:Int,unknownFields:scalapb.UnknownFieldSet):grpc.reflection.v1alpha.reflection.ExtensionRequest "Permalink")  new ExtensionRequest(containingType: String \= "", extensionNumber: Int \= 0, unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty)containingType
 Fully\-qualified type name. The format should be \<package\>.\<type\>
### Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#companion:grpc.reflection.v1alpha.reflection.ExtensionRequest.type "Permalink")  def companion: [ExtensionRequest](ExtensionRequest$.html).typeDefinition ClassesExtensionRequest → GeneratedMessage
7. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#containingType:String "Permalink")  val containingType: String
8. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#discardUnknownFields:grpc.reflection.v1alpha.reflection.ExtensionRequest "Permalink")  def discardUnknownFields: ExtensionRequest
9. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
10. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#extensionNumber:Int "Permalink")  val extensionNumber: Int
11. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#getField(__field:scalapb.descriptors.FieldDescriptor):scalapb.descriptors.PValue "Permalink")  def getField(\_\_field: FieldDescriptor): PValueDefinition ClassesExtensionRequest → GeneratedMessage
13. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#getFieldByNumber(__fieldNumber:Int):Any "Permalink")  def getFieldByNumber(\_\_fieldNumber: Int): AnyDefinition ClassesExtensionRequest → GeneratedMessage
14. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
15. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
16. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
17. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
18. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
19. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#serializedSize:Int "Permalink")  def serializedSize: IntDefinition ClassesExtensionRequest → GeneratedMessage
20. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#toByteArray:Array[Byte] "Permalink") final  def toByteArray: Array\[Byte]Definition ClassesGeneratedMessage
22. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#toByteString:com.google.protobuf.ByteString "Permalink") final  def toByteString: ByteStringDefinition ClassesGeneratedMessage
23. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#toPMessage:scalapb.descriptors.PMessage "Permalink") final  def toPMessage: PMessageDefinition ClassesGeneratedMessage
24. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#toProtoString:String "Permalink")  def toProtoString: StringDefinition ClassesExtensionRequest → GeneratedMessage
25. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#unknownFields:scalapb.UnknownFieldSet "Permalink")  val unknownFields: UnknownFieldSet
26. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#update(ms:scalapb.lenses.Lens[A,A]=>scalapb.lenses.Mutation[A]*):A "Permalink")  def update(ms: (Lens\[ExtensionRequest, ExtensionRequest]) \=\> Mutation\[ExtensionRequest]\*): ExtensionRequestDefinition ClassesUpdatable
27. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#withContainingType(__v:String):grpc.reflection.v1alpha.reflection.ExtensionRequest "Permalink")  def withContainingType(\_\_v: String): ExtensionRequest
31. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#withExtensionNumber(__v:Int):grpc.reflection.v1alpha.reflection.ExtensionRequest "Permalink")  def withExtensionNumber(\_\_v: Int): ExtensionRequest
32. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#withUnknownFields(__v:scalapb.UnknownFieldSet):grpc.reflection.v1alpha.reflection.ExtensionRequest "Permalink")  def withUnknownFields(\_\_v: UnknownFieldSet): ExtensionRequest
33. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#writeDelimitedTo(output:java.io.OutputStream):Unit "Permalink") final  def writeDelimitedTo(output: [OutputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)): UnitDefinition ClassesGeneratedMessage
34. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#writeTo(_output__:com.google.protobuf.CodedOutputStream):Unit "Permalink")  def writeTo(\_output\_\_: CodedOutputStream): UnitDefinition ClassesExtensionRequest → GeneratedMessage
35. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#writeTo(output:java.io.OutputStream):Unit "Permalink") final  def writeTo(output: [OutputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)): UnitDefinition ClassesGeneratedMessage
### Deprecated Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from Updatable\[ExtensionRequest]

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
*Source: [https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ExtensionRequest.html](https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ExtensionRequest.html)*