---
description: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.FileDescriptorResponse
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html
title: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.FileDescriptorResponse
---

# Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.FileDescriptorResponse

> **Summary:** Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.FileDescriptorResponse

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
- FileDescriptorResponse
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
[c](FileDescriptorResponse$.html "See companion object")[grpc](../../../index.html).[reflection](../../index.html).[v1alpha](../index.html).[reflection](index.html)

# [FileDescriptorResponse](FileDescriptorResponse$.html "See companion object")[**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html "Permalink")

### Companion [object FileDescriptorResponse](FileDescriptorResponse$.html "See companion object")

#### final  case class FileDescriptorResponse(fileDescriptorProto: Seq\[ByteString] \= \_root\_.scala.Seq.empty, unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty) extends GeneratedMessage with Updatable\[FileDescriptorResponse] with Product with Serializable

Serialized FileDescriptorProto messages sent by the server answering
a file\_by\_filename, file\_containing\_symbol, or file\_containing\_extension
request.

fileDescriptorProto
 Serialized FileDescriptorProto messages. We avoid taking a dependency on
 descriptor.proto, which uses proto2 only features, by making them opaque
 bytes instead.

Annotations@SerialVersionUID() Source[FileDescriptorResponse.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/target/scala-2.13/src_managed/main/grpc/reflection/v1alpha/reflection/FileDescriptorResponse.scala#L18)Linear SupertypesUpdatable\[FileDescriptorResponse], GeneratedMessage, [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), Product, Equals, AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FileDescriptorResponse
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

1. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#<init>(fileDescriptorProto:Seq[com.google.protobuf.ByteString],unknownFields:scalapb.UnknownFieldSet):grpc.reflection.v1alpha.reflection.FileDescriptorResponse "Permalink")  new FileDescriptorResponse(fileDescriptorProto: Seq\[ByteString] \= \_root\_.scala.Seq.empty, unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty)fileDescriptorProto
 Serialized FileDescriptorProto messages. We avoid taking a dependency on
 descriptor.proto, which uses proto2 only features, by making them opaque
 bytes instead.
### Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#addAllFileDescriptorProto(__vs:Iterable[com.google.protobuf.ByteString]):grpc.reflection.v1alpha.reflection.FileDescriptorResponse "Permalink")  def addAllFileDescriptorProto(\_\_vs: Iterable\[ByteString]): FileDescriptorResponse
5. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#addFileDescriptorProto(__vs:com.google.protobuf.ByteString*):grpc.reflection.v1alpha.reflection.FileDescriptorResponse "Permalink")  def addFileDescriptorProto(\_\_vs: ByteString\*): FileDescriptorResponse
6. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#clearFileDescriptorProto:grpc.reflection.v1alpha.reflection.FileDescriptorResponse "Permalink")  def clearFileDescriptorProto: FileDescriptorResponse
8. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
9. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#companion:grpc.reflection.v1alpha.reflection.FileDescriptorResponse.type "Permalink")  def companion: [FileDescriptorResponse](FileDescriptorResponse$.html).typeDefinition ClassesFileDescriptorResponse → GeneratedMessage
10. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#discardUnknownFields:grpc.reflection.v1alpha.reflection.FileDescriptorResponse "Permalink")  def discardUnknownFields: FileDescriptorResponse
11. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#fileDescriptorProto:Seq[com.google.protobuf.ByteString] "Permalink")  val fileDescriptorProto: Seq\[ByteString]
13. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
14. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#getField(__field:scalapb.descriptors.FieldDescriptor):scalapb.descriptors.PValue "Permalink")  def getField(\_\_field: FieldDescriptor): PValueDefinition ClassesFileDescriptorResponse → GeneratedMessage
15. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#getFieldByNumber(__fieldNumber:Int):Any "Permalink")  def getFieldByNumber(\_\_fieldNumber: Int): AnyDefinition ClassesFileDescriptorResponse → GeneratedMessage
16. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
17. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
18. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
19. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
20. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#serializedSize:Int "Permalink")  def serializedSize: IntDefinition ClassesFileDescriptorResponse → GeneratedMessage
22. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#toByteArray:Array[Byte] "Permalink") final  def toByteArray: Array\[Byte]Definition ClassesGeneratedMessage
24. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#toByteString:com.google.protobuf.ByteString "Permalink") final  def toByteString: ByteStringDefinition ClassesGeneratedMessage
25. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#toPMessage:scalapb.descriptors.PMessage "Permalink") final  def toPMessage: PMessageDefinition ClassesGeneratedMessage
26. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#toProtoString:String "Permalink")  def toProtoString: StringDefinition ClassesFileDescriptorResponse → GeneratedMessage
27. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#unknownFields:scalapb.UnknownFieldSet "Permalink")  val unknownFields: UnknownFieldSet
28. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#update(ms:scalapb.lenses.Lens[A,A]=>scalapb.lenses.Mutation[A]*):A "Permalink")  def update(ms: (Lens\[FileDescriptorResponse, FileDescriptorResponse]) \=\> Mutation\[FileDescriptorResponse]\*): FileDescriptorResponseDefinition ClassesUpdatable
29. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#withFileDescriptorProto(__v:Seq[com.google.protobuf.ByteString]):grpc.reflection.v1alpha.reflection.FileDescriptorResponse "Permalink")  def withFileDescriptorProto(\_\_v: Seq\[ByteString]): FileDescriptorResponse
33. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#withUnknownFields(__v:scalapb.UnknownFieldSet):grpc.reflection.v1alpha.reflection.FileDescriptorResponse "Permalink")  def withUnknownFields(\_\_v: UnknownFieldSet): FileDescriptorResponse
34. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#writeDelimitedTo(output:java.io.OutputStream):Unit "Permalink") final  def writeDelimitedTo(output: [OutputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)): UnitDefinition ClassesGeneratedMessage
35. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#writeTo(_output__:com.google.protobuf.CodedOutputStream):Unit "Permalink")  def writeTo(\_output\_\_: CodedOutputStream): UnitDefinition ClassesFileDescriptorResponse → GeneratedMessage
36. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#writeTo(output:java.io.OutputStream):Unit "Permalink") final  def writeTo(output: [OutputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)): UnitDefinition ClassesGeneratedMessage
### Deprecated Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from Updatable\[FileDescriptorResponse]

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
*Source: [https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html](https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html)*