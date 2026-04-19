---
description: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.FileDescriptorResponse
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html
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
[o](FileDescriptorResponse.html "See companion class")[grpc](../../../index.html).[reflection](../../index.html).[v1alpha](../index.html).[reflection](index.html)

# [FileDescriptorResponse](FileDescriptorResponse.html "See companion class")[**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html "Permalink")

### Companion [class FileDescriptorResponse](FileDescriptorResponse.html "See companion class")

#### object FileDescriptorResponse extends GeneratedMessageCompanion\[[FileDescriptorResponse](FileDescriptorResponse.html)]

Source[FileDescriptorResponse.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/target/scala-2.13/src_managed/main/grpc/reflection/v1alpha/reflection/FileDescriptorResponse.scala#L71)Linear SupertypesGeneratedMessageCompanion\[[FileDescriptorResponse](FileDescriptorResponse.html)], [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FileDescriptorResponse
2. GeneratedMessageCompanion
3. Serializable
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$$FileDescriptorResponseLens.html "Permalink") implicit  class [FileDescriptorResponseLens](FileDescriptorResponse$$FileDescriptorResponseLens.html)\[UpperPB] extends ObjectLens\[UpperPB, [FileDescriptorResponse](FileDescriptorResponse.html)]
2. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#ValueType=A "Permalink")  type ValueType \= [FileDescriptorResponse](FileDescriptorResponse.html)Definition ClassesGeneratedMessageCompanion
### Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#FILE_DESCRIPTOR_PROTO_FIELD_NUMBER:Int(1) "Permalink") final  val FILE\_DESCRIPTOR\_PROTO\_FIELD\_NUMBER: Int(1\)
5. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#defaultInstance:grpc.reflection.v1alpha.reflection.FileDescriptorResponse "Permalink")  lazy val defaultInstance: [FileDescriptorResponse](FileDescriptorResponse.html)Definition ClassesFileDescriptorResponse → GeneratedMessageCompanion
8. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#enumCompanionForField(field:com.google.protobuf.Descriptors.FieldDescriptor):scalapb.GeneratedEnumCompanion[_] "Permalink")  def enumCompanionForField(field: FieldDescriptor): GeneratedEnumCompanion\[\_]Definition ClassesGeneratedMessageCompanion
9. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#enumCompanionForFieldNumber(__fieldNumber:Int):scalapb.GeneratedEnumCompanion[_] "Permalink")  def enumCompanionForFieldNumber(\_\_fieldNumber: Int): GeneratedEnumCompanion\[\_]Definition ClassesFileDescriptorResponse → GeneratedMessageCompanion
10. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
11. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
12. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#fromAscii(s:String):A "Permalink")  def fromAscii(s: String): [FileDescriptorResponse](FileDescriptorResponse.html)Definition ClassesGeneratedMessageCompanion
13. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
14. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
15. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
16. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#javaDescriptor:com.google.protobuf.Descriptors.Descriptor "Permalink")  def javaDescriptor: DescriptorDefinition ClassesFileDescriptorResponse → GeneratedMessageCompanion
17. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#merge(a:A,input:com.google.protobuf.CodedInputStream):A "Permalink")  def merge(a: [FileDescriptorResponse](FileDescriptorResponse.html), input: CodedInputStream): [FileDescriptorResponse](FileDescriptorResponse.html)Definition ClassesGeneratedMessageCompanion
18. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#messageCompanion:scalapb.GeneratedMessageCompanion[grpc.reflection.v1alpha.reflection.FileDescriptorResponse] "Permalink") implicit  def messageCompanion: GeneratedMessageCompanion\[[FileDescriptorResponse](FileDescriptorResponse.html)]
19. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#messageCompanionForField(field:com.google.protobuf.Descriptors.FieldDescriptor):scalapb.GeneratedMessageCompanion[_] "Permalink")  def messageCompanionForField(field: FieldDescriptor): GeneratedMessageCompanion\[\_]Definition ClassesGeneratedMessageCompanion
20. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#messageCompanionForFieldNumber(__number:Int):scalapb.GeneratedMessageCompanion[_] "Permalink")  def messageCompanionForFieldNumber(\_\_number: Int): GeneratedMessageCompanion\[\_]Definition ClassesFileDescriptorResponse → GeneratedMessageCompanion
21. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#messageReads:scalapb.descriptors.Reads[grpc.reflection.v1alpha.reflection.FileDescriptorResponse] "Permalink") implicit  def messageReads: Reads\[[FileDescriptorResponse](FileDescriptorResponse.html)]Definition ClassesFileDescriptorResponse → GeneratedMessageCompanion
22. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
23. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#nestedMessagesCompanions:Seq[scalapb.GeneratedMessageCompanion[_<:scalapb.GeneratedMessage]] "Permalink")  lazy val nestedMessagesCompanions: Seq\[GeneratedMessageCompanion\[\_ \<: GeneratedMessage]]Definition ClassesFileDescriptorResponse → GeneratedMessageCompanion
24. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
25. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
26. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#of(fileDescriptorProto:Seq[com.google.protobuf.ByteString]):grpc.reflection.v1alpha.reflection.FileDescriptorResponse "Permalink")  def of(fileDescriptorProto: Seq\[ByteString]): [FileDescriptorResponse](FileDescriptorResponse.html)
27. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#parseDelimitedFrom(input:java.io.InputStream):Option[A] "Permalink")  def parseDelimitedFrom(input: [InputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)): Option\[[FileDescriptorResponse](FileDescriptorResponse.html)]Definition ClassesGeneratedMessageCompanion
28. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#parseDelimitedFrom(input:com.google.protobuf.CodedInputStream):Option[A] "Permalink")  def parseDelimitedFrom(input: CodedInputStream): Option\[[FileDescriptorResponse](FileDescriptorResponse.html)]Definition ClassesGeneratedMessageCompanion
29. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#parseFrom(_input__:com.google.protobuf.CodedInputStream):grpc.reflection.v1alpha.reflection.FileDescriptorResponse "Permalink")  def parseFrom(\_input\_\_: CodedInputStream): [FileDescriptorResponse](FileDescriptorResponse.html)Definition ClassesFileDescriptorResponse → GeneratedMessageCompanion
30. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#parseFrom(s:Array[Byte]):A "Permalink")  def parseFrom(s: Array\[Byte]): [FileDescriptorResponse](FileDescriptorResponse.html)Definition ClassesGeneratedMessageCompanion
31. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#parseFrom(input:java.io.InputStream):A "Permalink")  def parseFrom(input: [InputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)): [FileDescriptorResponse](FileDescriptorResponse.html)Definition ClassesGeneratedMessageCompanion
32. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#scalaDescriptor:scalapb.descriptors.Descriptor "Permalink")  def scalaDescriptor: DescriptorDefinition ClassesFileDescriptorResponse → GeneratedMessageCompanion
33. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#streamFromDelimitedInput(input:java.io.InputStream):Stream[A] "Permalink")  def streamFromDelimitedInput(input: [InputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)): Stream\[[FileDescriptorResponse](FileDescriptorResponse.html)]Definition ClassesGeneratedMessageCompanion
34. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
35. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#toByteArray(a:A):Array[Byte] "Permalink")  def toByteArray(a: [FileDescriptorResponse](FileDescriptorResponse.html)): Array\[Byte]Definition ClassesGeneratedMessageCompanion
36. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
37. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#validate(s:Array[Byte]):scala.util.Try[A] "Permalink")  def validate(s: Array\[Byte]): Try\[[FileDescriptorResponse](FileDescriptorResponse.html)]Definition ClassesGeneratedMessageCompanion
38. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#validateAscii(s:String):Either[scalapb.TextFormatError,A] "Permalink")  def validateAscii(s: String): Either\[TextFormatError, [FileDescriptorResponse](FileDescriptorResponse.html)]Definition ClassesGeneratedMessageCompanion
39. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from GeneratedMessageCompanion\[[FileDescriptorResponse](FileDescriptorResponse.html)]

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

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
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/FileDescriptorResponse$$FileDescriptorResponseLens.html
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
*Source: [https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html](https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html)*