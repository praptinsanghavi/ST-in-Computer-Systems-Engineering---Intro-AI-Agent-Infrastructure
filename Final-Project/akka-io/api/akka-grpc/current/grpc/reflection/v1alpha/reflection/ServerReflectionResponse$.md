---
description: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionResponse
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html
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
- [ServerReflectionResponse](ServerReflectionResponse.html "The message sent by the server to answer ServerReflectionInfo method.")
- [ServiceResponse](ServiceResponse.html "The information of a single service used by ListServiceResponse to answer list_services request.")
[o](ServerReflectionResponse.html "See companion class")[grpc](../../../index.html).[reflection](../../index.html).[v1alpha](../index.html).[reflection](index.html)

# [ServerReflectionResponse](ServerReflectionResponse.html "See companion class")[**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html "Permalink")

### Companion [class ServerReflectionResponse](ServerReflectionResponse.html "See companion class")

#### object ServerReflectionResponse extends GeneratedMessageCompanion\[[ServerReflectionResponse](ServerReflectionResponse.html)]

Source[ServerReflectionResponse.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/target/scala-2.13/src_managed/main/grpc/reflection/v1alpha/reflection/ServerReflectionResponse.scala#L144)Linear SupertypesGeneratedMessageCompanion\[[ServerReflectionResponse](ServerReflectionResponse.html)], [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServerReflectionResponse
2. GeneratedMessageCompanion
3. Serializable
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$$MessageResponse.html "Permalink") sealed  trait [MessageResponse](ServerReflectionResponse$$MessageResponse.html) extends GeneratedOneof
2. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$$ServerReflectionResponseLens.html "Permalink") implicit  class [ServerReflectionResponseLens](ServerReflectionResponse$$ServerReflectionResponseLens.html)\[UpperPB] extends ObjectLens\[UpperPB, [ServerReflectionResponse](ServerReflectionResponse.html)]
3. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#ValueType=A "Permalink")  type ValueType \= [ServerReflectionResponse](ServerReflectionResponse.html)Definition ClassesGeneratedMessageCompanion
### Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#ALL_EXTENSION_NUMBERS_RESPONSE_FIELD_NUMBER:Int(5) "Permalink") final  val ALL\_EXTENSION\_NUMBERS\_RESPONSE\_FIELD\_NUMBER: Int(5\)
5. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#ERROR_RESPONSE_FIELD_NUMBER:Int(7) "Permalink") final  val ERROR\_RESPONSE\_FIELD\_NUMBER: Int(7\)
6. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#FILE_DESCRIPTOR_RESPONSE_FIELD_NUMBER:Int(4) "Permalink") final  val FILE\_DESCRIPTOR\_RESPONSE\_FIELD\_NUMBER: Int(4\)
7. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#LIST_SERVICES_RESPONSE_FIELD_NUMBER:Int(6) "Permalink") final  val LIST\_SERVICES\_RESPONSE\_FIELD\_NUMBER: Int(6\)
8. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#ORIGINAL_REQUEST_FIELD_NUMBER:Int(2) "Permalink") final  val ORIGINAL\_REQUEST\_FIELD\_NUMBER: Int(2\)
9. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#VALID_HOST_FIELD_NUMBER:Int(1) "Permalink") final  val VALID\_HOST\_FIELD\_NUMBER: Int(1\)
10. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
12. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#defaultInstance:grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  lazy val defaultInstance: [ServerReflectionResponse](ServerReflectionResponse.html)Definition ClassesServerReflectionResponse → GeneratedMessageCompanion
13. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#enumCompanionForField(field:com.google.protobuf.Descriptors.FieldDescriptor):scalapb.GeneratedEnumCompanion[_] "Permalink")  def enumCompanionForField(field: FieldDescriptor): GeneratedEnumCompanion\[\_]Definition ClassesGeneratedMessageCompanion
14. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#enumCompanionForFieldNumber(__fieldNumber:Int):scalapb.GeneratedEnumCompanion[_] "Permalink")  def enumCompanionForFieldNumber(\_\_fieldNumber: Int): GeneratedEnumCompanion\[\_]Definition ClassesServerReflectionResponse → GeneratedMessageCompanion
15. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
16. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
17. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#fromAscii(s:String):A "Permalink")  def fromAscii(s: String): [ServerReflectionResponse](ServerReflectionResponse.html)Definition ClassesGeneratedMessageCompanion
18. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
19. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
20. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
21. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#javaDescriptor:com.google.protobuf.Descriptors.Descriptor "Permalink")  def javaDescriptor: DescriptorDefinition ClassesServerReflectionResponse → GeneratedMessageCompanion
22. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#merge(a:A,input:com.google.protobuf.CodedInputStream):A "Permalink")  def merge(a: [ServerReflectionResponse](ServerReflectionResponse.html), input: CodedInputStream): [ServerReflectionResponse](ServerReflectionResponse.html)Definition ClassesGeneratedMessageCompanion
23. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#messageCompanion:scalapb.GeneratedMessageCompanion[grpc.reflection.v1alpha.reflection.ServerReflectionResponse] "Permalink") implicit  def messageCompanion: GeneratedMessageCompanion\[[ServerReflectionResponse](ServerReflectionResponse.html)]
24. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#messageCompanionForField(field:com.google.protobuf.Descriptors.FieldDescriptor):scalapb.GeneratedMessageCompanion[_] "Permalink")  def messageCompanionForField(field: FieldDescriptor): GeneratedMessageCompanion\[\_]Definition ClassesGeneratedMessageCompanion
25. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#messageCompanionForFieldNumber(__number:Int):scalapb.GeneratedMessageCompanion[_] "Permalink")  def messageCompanionForFieldNumber(\_\_number: Int): GeneratedMessageCompanion\[\_]Definition ClassesServerReflectionResponse → GeneratedMessageCompanion
26. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#messageReads:scalapb.descriptors.Reads[grpc.reflection.v1alpha.reflection.ServerReflectionResponse] "Permalink") implicit  def messageReads: Reads\[[ServerReflectionResponse](ServerReflectionResponse.html)]Definition ClassesServerReflectionResponse → GeneratedMessageCompanion
27. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
28. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#nestedMessagesCompanions:Seq[scalapb.GeneratedMessageCompanion[_<:scalapb.GeneratedMessage]] "Permalink")  lazy val nestedMessagesCompanions: Seq\[GeneratedMessageCompanion\[\_ \<: GeneratedMessage]]Definition ClassesServerReflectionResponse → GeneratedMessageCompanion
29. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
30. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
31. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#of(validHost:String,originalRequest:Option[grpc.reflection.v1alpha.reflection.ServerReflectionRequest],messageResponse:grpc.reflection.v1alpha.reflection.ServerReflectionResponse.MessageResponse):grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  def of(validHost: String, originalRequest: Option\[[ServerReflectionRequest](ServerReflectionRequest.html)], messageResponse: [MessageResponse](ServerReflectionResponse$$MessageResponse.html)): [ServerReflectionResponse](ServerReflectionResponse.html)
32. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#parseDelimitedFrom(input:java.io.InputStream):Option[A] "Permalink")  def parseDelimitedFrom(input: [InputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)): Option\[[ServerReflectionResponse](ServerReflectionResponse.html)]Definition ClassesGeneratedMessageCompanion
33. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#parseDelimitedFrom(input:com.google.protobuf.CodedInputStream):Option[A] "Permalink")  def parseDelimitedFrom(input: CodedInputStream): Option\[[ServerReflectionResponse](ServerReflectionResponse.html)]Definition ClassesGeneratedMessageCompanion
34. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#parseFrom(_input__:com.google.protobuf.CodedInputStream):grpc.reflection.v1alpha.reflection.ServerReflectionResponse "Permalink")  def parseFrom(\_input\_\_: CodedInputStream): [ServerReflectionResponse](ServerReflectionResponse.html)Definition ClassesServerReflectionResponse → GeneratedMessageCompanion
35. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#parseFrom(s:Array[Byte]):A "Permalink")  def parseFrom(s: Array\[Byte]): [ServerReflectionResponse](ServerReflectionResponse.html)Definition ClassesGeneratedMessageCompanion
36. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#parseFrom(input:java.io.InputStream):A "Permalink")  def parseFrom(input: [InputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)): [ServerReflectionResponse](ServerReflectionResponse.html)Definition ClassesGeneratedMessageCompanion
37. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#scalaDescriptor:scalapb.descriptors.Descriptor "Permalink")  def scalaDescriptor: DescriptorDefinition ClassesServerReflectionResponse → GeneratedMessageCompanion
38. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#streamFromDelimitedInput(input:java.io.InputStream):Stream[A] "Permalink")  def streamFromDelimitedInput(input: [InputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)): Stream\[[ServerReflectionResponse](ServerReflectionResponse.html)]Definition ClassesGeneratedMessageCompanion
39. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
40. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#toByteArray(a:A):Array[Byte] "Permalink")  def toByteArray(a: [ServerReflectionResponse](ServerReflectionResponse.html)): Array\[Byte]Definition ClassesGeneratedMessageCompanion
41. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
42. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#validate(s:Array[Byte]):scala.util.Try[A] "Permalink")  def validate(s: Array\[Byte]): Try\[[ServerReflectionResponse](ServerReflectionResponse.html)]Definition ClassesGeneratedMessageCompanion
43. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#validateAscii(s:String):Either[scalapb.TextFormatError,A] "Permalink")  def validateAscii(s: String): Either\[TextFormatError, [ServerReflectionResponse](ServerReflectionResponse.html)]Definition ClassesGeneratedMessageCompanion
44. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
45. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
46. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
47. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$$MessageResponse$.html "Permalink")  object [MessageResponse](ServerReflectionResponse$$MessageResponse$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from GeneratedMessageCompanion\[[ServerReflectionResponse](ServerReflectionResponse.html)]

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
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$$MessageResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$$MessageResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$$ServerReflectionResponseLens.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html](https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html)*