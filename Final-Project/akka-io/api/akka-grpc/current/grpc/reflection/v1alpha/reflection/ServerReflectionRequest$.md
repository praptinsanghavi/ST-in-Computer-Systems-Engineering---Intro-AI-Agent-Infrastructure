---
description: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ServerReflectionRequest
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html
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
- [ServerReflectionRequest](ServerReflectionRequest.html "The message sent by the client when calling ServerReflectionInfo method.")
- [ServerReflectionResponse](ServerReflectionResponse.html "The message sent by the server to answer ServerReflectionInfo method.")
- [ServiceResponse](ServiceResponse.html "The information of a single service used by ListServiceResponse to answer list_services request.")
[o](ServerReflectionRequest.html "See companion class")[grpc](../../../index.html).[reflection](../../index.html).[v1alpha](../index.html).[reflection](index.html)

# [ServerReflectionRequest](ServerReflectionRequest.html "See companion class")[**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html "Permalink")

### Companion [class ServerReflectionRequest](ServerReflectionRequest.html "See companion class")

#### object ServerReflectionRequest extends GeneratedMessageCompanion\[[ServerReflectionRequest](ServerReflectionRequest.html)]

Source[ServerReflectionRequest.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/target/scala-2.13/src_managed/main/grpc/reflection/v1alpha/reflection/ServerReflectionRequest.scala#L134)Linear SupertypesGeneratedMessageCompanion\[[ServerReflectionRequest](ServerReflectionRequest.html)], [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServerReflectionRequest
2. GeneratedMessageCompanion
3. Serializable
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$$MessageRequest.html "Permalink") sealed  trait [MessageRequest](ServerReflectionRequest$$MessageRequest.html) extends GeneratedOneof
2. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$$ServerReflectionRequestLens.html "Permalink") implicit  class [ServerReflectionRequestLens](ServerReflectionRequest$$ServerReflectionRequestLens.html)\[UpperPB] extends ObjectLens\[UpperPB, [ServerReflectionRequest](ServerReflectionRequest.html)]
3. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#ValueType=A "Permalink")  type ValueType \= [ServerReflectionRequest](ServerReflectionRequest.html)Definition ClassesGeneratedMessageCompanion
### Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#ALL_EXTENSION_NUMBERS_OF_TYPE_FIELD_NUMBER:Int(6) "Permalink") final  val ALL\_EXTENSION\_NUMBERS\_OF\_TYPE\_FIELD\_NUMBER: Int(6\)
5. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#FILE_BY_FILENAME_FIELD_NUMBER:Int(3) "Permalink") final  val FILE\_BY\_FILENAME\_FIELD\_NUMBER: Int(3\)
6. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#FILE_CONTAINING_EXTENSION_FIELD_NUMBER:Int(5) "Permalink") final  val FILE\_CONTAINING\_EXTENSION\_FIELD\_NUMBER: Int(5\)
7. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#FILE_CONTAINING_SYMBOL_FIELD_NUMBER:Int(4) "Permalink") final  val FILE\_CONTAINING\_SYMBOL\_FIELD\_NUMBER: Int(4\)
8. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#HOST_FIELD_NUMBER:Int(1) "Permalink") final  val HOST\_FIELD\_NUMBER: Int(1\)
9. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#LIST_SERVICES_FIELD_NUMBER:Int(7) "Permalink") final  val LIST\_SERVICES\_FIELD\_NUMBER: Int(7\)
10. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
12. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#defaultInstance:grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  lazy val defaultInstance: [ServerReflectionRequest](ServerReflectionRequest.html)Definition ClassesServerReflectionRequest → GeneratedMessageCompanion
13. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#enumCompanionForField(field:com.google.protobuf.Descriptors.FieldDescriptor):scalapb.GeneratedEnumCompanion[_] "Permalink")  def enumCompanionForField(field: FieldDescriptor): GeneratedEnumCompanion\[\_]Definition ClassesGeneratedMessageCompanion
14. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#enumCompanionForFieldNumber(__fieldNumber:Int):scalapb.GeneratedEnumCompanion[_] "Permalink")  def enumCompanionForFieldNumber(\_\_fieldNumber: Int): GeneratedEnumCompanion\[\_]Definition ClassesServerReflectionRequest → GeneratedMessageCompanion
15. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
16. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
17. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#fromAscii(s:String):A "Permalink")  def fromAscii(s: String): [ServerReflectionRequest](ServerReflectionRequest.html)Definition ClassesGeneratedMessageCompanion
18. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
19. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
20. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
21. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#javaDescriptor:com.google.protobuf.Descriptors.Descriptor "Permalink")  def javaDescriptor: DescriptorDefinition ClassesServerReflectionRequest → GeneratedMessageCompanion
22. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#merge(a:A,input:com.google.protobuf.CodedInputStream):A "Permalink")  def merge(a: [ServerReflectionRequest](ServerReflectionRequest.html), input: CodedInputStream): [ServerReflectionRequest](ServerReflectionRequest.html)Definition ClassesGeneratedMessageCompanion
23. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#messageCompanion:scalapb.GeneratedMessageCompanion[grpc.reflection.v1alpha.reflection.ServerReflectionRequest] "Permalink") implicit  def messageCompanion: GeneratedMessageCompanion\[[ServerReflectionRequest](ServerReflectionRequest.html)]
24. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#messageCompanionForField(field:com.google.protobuf.Descriptors.FieldDescriptor):scalapb.GeneratedMessageCompanion[_] "Permalink")  def messageCompanionForField(field: FieldDescriptor): GeneratedMessageCompanion\[\_]Definition ClassesGeneratedMessageCompanion
25. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#messageCompanionForFieldNumber(__number:Int):scalapb.GeneratedMessageCompanion[_] "Permalink")  def messageCompanionForFieldNumber(\_\_number: Int): GeneratedMessageCompanion\[\_]Definition ClassesServerReflectionRequest → GeneratedMessageCompanion
26. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#messageReads:scalapb.descriptors.Reads[grpc.reflection.v1alpha.reflection.ServerReflectionRequest] "Permalink") implicit  def messageReads: Reads\[[ServerReflectionRequest](ServerReflectionRequest.html)]Definition ClassesServerReflectionRequest → GeneratedMessageCompanion
27. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
28. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#nestedMessagesCompanions:Seq[scalapb.GeneratedMessageCompanion[_<:scalapb.GeneratedMessage]] "Permalink")  lazy val nestedMessagesCompanions: Seq\[GeneratedMessageCompanion\[\_ \<: GeneratedMessage]]Definition ClassesServerReflectionRequest → GeneratedMessageCompanion
29. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
30. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
31. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#of(host:String,messageRequest:grpc.reflection.v1alpha.reflection.ServerReflectionRequest.MessageRequest):grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  def of(host: String, messageRequest: [MessageRequest](ServerReflectionRequest$$MessageRequest.html)): [ServerReflectionRequest](ServerReflectionRequest.html)
32. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#parseDelimitedFrom(input:java.io.InputStream):Option[A] "Permalink")  def parseDelimitedFrom(input: [InputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)): Option\[[ServerReflectionRequest](ServerReflectionRequest.html)]Definition ClassesGeneratedMessageCompanion
33. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#parseDelimitedFrom(input:com.google.protobuf.CodedInputStream):Option[A] "Permalink")  def parseDelimitedFrom(input: CodedInputStream): Option\[[ServerReflectionRequest](ServerReflectionRequest.html)]Definition ClassesGeneratedMessageCompanion
34. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#parseFrom(_input__:com.google.protobuf.CodedInputStream):grpc.reflection.v1alpha.reflection.ServerReflectionRequest "Permalink")  def parseFrom(\_input\_\_: CodedInputStream): [ServerReflectionRequest](ServerReflectionRequest.html)Definition ClassesServerReflectionRequest → GeneratedMessageCompanion
35. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#parseFrom(s:Array[Byte]):A "Permalink")  def parseFrom(s: Array\[Byte]): [ServerReflectionRequest](ServerReflectionRequest.html)Definition ClassesGeneratedMessageCompanion
36. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#parseFrom(input:java.io.InputStream):A "Permalink")  def parseFrom(input: [InputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)): [ServerReflectionRequest](ServerReflectionRequest.html)Definition ClassesGeneratedMessageCompanion
37. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#scalaDescriptor:scalapb.descriptors.Descriptor "Permalink")  def scalaDescriptor: DescriptorDefinition ClassesServerReflectionRequest → GeneratedMessageCompanion
38. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#streamFromDelimitedInput(input:java.io.InputStream):Stream[A] "Permalink")  def streamFromDelimitedInput(input: [InputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)): Stream\[[ServerReflectionRequest](ServerReflectionRequest.html)]Definition ClassesGeneratedMessageCompanion
39. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
40. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#toByteArray(a:A):Array[Byte] "Permalink")  def toByteArray(a: [ServerReflectionRequest](ServerReflectionRequest.html)): Array\[Byte]Definition ClassesGeneratedMessageCompanion
41. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
42. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#validate(s:Array[Byte]):scala.util.Try[A] "Permalink")  def validate(s: Array\[Byte]): Try\[[ServerReflectionRequest](ServerReflectionRequest.html)]Definition ClassesGeneratedMessageCompanion
43. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#validateAscii(s:String):Either[scalapb.TextFormatError,A] "Permalink")  def validateAscii(s: String): Either\[TextFormatError, [ServerReflectionRequest](ServerReflectionRequest.html)]Definition ClassesGeneratedMessageCompanion
44. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
45. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
46. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
47. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$$MessageRequest$.html "Permalink")  object [MessageRequest](ServerReflectionRequest$$MessageRequest$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from GeneratedMessageCompanion\[[ServerReflectionRequest](ServerReflectionRequest.html)]

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
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest$$MessageRequest$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest$$MessageRequest.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest$$ServerReflectionRequestLens.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html](https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html)*