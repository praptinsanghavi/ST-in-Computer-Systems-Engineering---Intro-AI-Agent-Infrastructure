---
description: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection.ExtensionRequest
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ExtensionRequest$.html
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
[o](ExtensionRequest.html "See companion class")[grpc](../../../index.html).[reflection](../../index.html).[v1alpha](../index.html).[reflection](index.html)

# [ExtensionRequest](ExtensionRequest.html "See companion class")[**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html "Permalink")

### Companion [class ExtensionRequest](ExtensionRequest.html "See companion class")

#### object ExtensionRequest extends GeneratedMessageCompanion\[[ExtensionRequest](ExtensionRequest.html)]

Source[ExtensionRequest.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/target/scala-2.13/src_managed/main/grpc/reflection/v1alpha/reflection/ExtensionRequest.scala#L93)Linear SupertypesGeneratedMessageCompanion\[[ExtensionRequest](ExtensionRequest.html)], [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ExtensionRequest
2. GeneratedMessageCompanion
3. Serializable
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$$ExtensionRequestLens.html "Permalink") implicit  class [ExtensionRequestLens](ExtensionRequest$$ExtensionRequestLens.html)\[UpperPB] extends ObjectLens\[UpperPB, [ExtensionRequest](ExtensionRequest.html)]
2. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#ValueType=A "Permalink")  type ValueType \= [ExtensionRequest](ExtensionRequest.html)Definition ClassesGeneratedMessageCompanion
### Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#CONTAINING_TYPE_FIELD_NUMBER:Int(1) "Permalink") final  val CONTAINING\_TYPE\_FIELD\_NUMBER: Int(1\)
5. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#EXTENSION_NUMBER_FIELD_NUMBER:Int(2) "Permalink") final  val EXTENSION\_NUMBER\_FIELD\_NUMBER: Int(2\)
6. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
8. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#defaultInstance:grpc.reflection.v1alpha.reflection.ExtensionRequest "Permalink")  lazy val defaultInstance: [ExtensionRequest](ExtensionRequest.html)Definition ClassesExtensionRequest → GeneratedMessageCompanion
9. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#enumCompanionForField(field:com.google.protobuf.Descriptors.FieldDescriptor):scalapb.GeneratedEnumCompanion[_] "Permalink")  def enumCompanionForField(field: FieldDescriptor): GeneratedEnumCompanion\[\_]Definition ClassesGeneratedMessageCompanion
10. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#enumCompanionForFieldNumber(__fieldNumber:Int):scalapb.GeneratedEnumCompanion[_] "Permalink")  def enumCompanionForFieldNumber(\_\_fieldNumber: Int): GeneratedEnumCompanion\[\_]Definition ClassesExtensionRequest → GeneratedMessageCompanion
11. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
13. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#fromAscii(s:String):A "Permalink")  def fromAscii(s: String): [ExtensionRequest](ExtensionRequest.html)Definition ClassesGeneratedMessageCompanion
14. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
15. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
16. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
17. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#javaDescriptor:com.google.protobuf.Descriptors.Descriptor "Permalink")  def javaDescriptor: DescriptorDefinition ClassesExtensionRequest → GeneratedMessageCompanion
18. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#merge(a:A,input:com.google.protobuf.CodedInputStream):A "Permalink")  def merge(a: [ExtensionRequest](ExtensionRequest.html), input: CodedInputStream): [ExtensionRequest](ExtensionRequest.html)Definition ClassesGeneratedMessageCompanion
19. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#messageCompanion:scalapb.GeneratedMessageCompanion[grpc.reflection.v1alpha.reflection.ExtensionRequest] "Permalink") implicit  def messageCompanion: GeneratedMessageCompanion\[[ExtensionRequest](ExtensionRequest.html)]
20. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#messageCompanionForField(field:com.google.protobuf.Descriptors.FieldDescriptor):scalapb.GeneratedMessageCompanion[_] "Permalink")  def messageCompanionForField(field: FieldDescriptor): GeneratedMessageCompanion\[\_]Definition ClassesGeneratedMessageCompanion
21. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#messageCompanionForFieldNumber(__number:Int):scalapb.GeneratedMessageCompanion[_] "Permalink")  def messageCompanionForFieldNumber(\_\_number: Int): GeneratedMessageCompanion\[\_]Definition ClassesExtensionRequest → GeneratedMessageCompanion
22. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#messageReads:scalapb.descriptors.Reads[grpc.reflection.v1alpha.reflection.ExtensionRequest] "Permalink") implicit  def messageReads: Reads\[[ExtensionRequest](ExtensionRequest.html)]Definition ClassesExtensionRequest → GeneratedMessageCompanion
23. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
24. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#nestedMessagesCompanions:Seq[scalapb.GeneratedMessageCompanion[_<:scalapb.GeneratedMessage]] "Permalink")  lazy val nestedMessagesCompanions: Seq\[GeneratedMessageCompanion\[\_ \<: GeneratedMessage]]Definition ClassesExtensionRequest → GeneratedMessageCompanion
25. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
26. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
27. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#of(containingType:String,extensionNumber:Int):grpc.reflection.v1alpha.reflection.ExtensionRequest "Permalink")  def of(containingType: String, extensionNumber: Int): [ExtensionRequest](ExtensionRequest.html)
28. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#parseDelimitedFrom(input:java.io.InputStream):Option[A] "Permalink")  def parseDelimitedFrom(input: [InputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)): Option\[[ExtensionRequest](ExtensionRequest.html)]Definition ClassesGeneratedMessageCompanion
29. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#parseDelimitedFrom(input:com.google.protobuf.CodedInputStream):Option[A] "Permalink")  def parseDelimitedFrom(input: CodedInputStream): Option\[[ExtensionRequest](ExtensionRequest.html)]Definition ClassesGeneratedMessageCompanion
30. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#parseFrom(_input__:com.google.protobuf.CodedInputStream):grpc.reflection.v1alpha.reflection.ExtensionRequest "Permalink")  def parseFrom(\_input\_\_: CodedInputStream): [ExtensionRequest](ExtensionRequest.html)Definition ClassesExtensionRequest → GeneratedMessageCompanion
31. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#parseFrom(s:Array[Byte]):A "Permalink")  def parseFrom(s: Array\[Byte]): [ExtensionRequest](ExtensionRequest.html)Definition ClassesGeneratedMessageCompanion
32. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#parseFrom(input:java.io.InputStream):A "Permalink")  def parseFrom(input: [InputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)): [ExtensionRequest](ExtensionRequest.html)Definition ClassesGeneratedMessageCompanion
33. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#scalaDescriptor:scalapb.descriptors.Descriptor "Permalink")  def scalaDescriptor: DescriptorDefinition ClassesExtensionRequest → GeneratedMessageCompanion
34. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#streamFromDelimitedInput(input:java.io.InputStream):Stream[A] "Permalink")  def streamFromDelimitedInput(input: [InputStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)): Stream\[[ExtensionRequest](ExtensionRequest.html)]Definition ClassesGeneratedMessageCompanion
35. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#toByteArray(a:A):Array[Byte] "Permalink")  def toByteArray(a: [ExtensionRequest](ExtensionRequest.html)): Array\[Byte]Definition ClassesGeneratedMessageCompanion
37. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
38. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#validate(s:Array[Byte]):scala.util.Try[A] "Permalink")  def validate(s: Array\[Byte]): Try\[[ExtensionRequest](ExtensionRequest.html)]Definition ClassesGeneratedMessageCompanion
39. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#validateAscii(s:String):Either[scalapb.TextFormatError,A] "Permalink")  def validateAscii(s: String): Either\[TextFormatError, [ExtensionRequest](ExtensionRequest.html)]Definition ClassesGeneratedMessageCompanion
40. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
42. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from GeneratedMessageCompanion\[[ExtensionRequest](ExtensionRequest.html)]

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
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ExtensionRequest$$ExtensionRequestLens.html
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
*Source: [https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ExtensionRequest$.html](https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ExtensionRequest$.html)*