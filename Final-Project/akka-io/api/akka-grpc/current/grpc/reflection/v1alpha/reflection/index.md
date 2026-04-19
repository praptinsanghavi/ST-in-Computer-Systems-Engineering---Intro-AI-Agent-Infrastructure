---
description: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/index.html
title: Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection
---

# Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection

> **Summary:** Akka gRPC 2.5.10 - grpc.reflection.v1alpha.reflection

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../grpc/index.html "Permalink")  package [grpc](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../grpc/reflection/index.html "Permalink")  package [reflection](../../index.html)Definition Classes[grpc](../../../index.html)
- [**](../../../../grpc/reflection/v1alpha/index.html "Permalink")  package [v1alpha](../index.html)Definition Classes[reflection](../../index.html)
- [**](../../../../grpc/reflection/v1alpha/reflection/index.html "Permalink")  package reflectionDefinition Classes[v1alpha](../index.html)
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
p[grpc](../../../index.html).[reflection](../../index.html).[v1alpha](../index.html)

# reflection[**](../../../../grpc/reflection/v1alpha/reflection/index.html "Permalink")

#### package reflection

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ErrorResponse.html "Permalink") final  case class [ErrorResponse](ErrorResponse.html "The error code and error message sent by the server when an error occurs.")(errorCode: Int \= 0, errorMessage: String \= "", unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty) extends GeneratedMessage with Updatable\[[ErrorResponse](ErrorResponse.html)] with Product with SerializableThe error code and error message sent by the server when an error occurs.

The error code and error message sent by the server when an error occurs.

errorCode
 This field uses the error codes defined in grpc::StatusCode.

Annotations@SerialVersionUID()
2. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionNumberResponse.html "Permalink") final  case class [ExtensionNumberResponse](ExtensionNumberResponse.html "A list of extension numbers sent by the server answering all_extension_numbers_of_type request.")(baseTypeName: String \= "", extensionNumber: Seq\[Int] \= \_root\_.scala.Seq.empty, unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty) extends GeneratedMessage with Updatable\[[ExtensionNumberResponse](ExtensionNumberResponse.html)] with Product with SerializableA list of extension numbers sent by the server answering
all\_extension\_numbers\_of\_type request.

A list of extension numbers sent by the server answering
all\_extension\_numbers\_of\_type request.

baseTypeName
 Full name of the base type, including the package name. The format
 is \<package\>.\<type\>

Annotations@SerialVersionUID()
3. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest.html "Permalink") final  case class [ExtensionRequest](ExtensionRequest.html "The type name and extension number sent by the client when requesting file_containing_extension.")(containingType: String \= "", extensionNumber: Int \= 0, unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty) extends GeneratedMessage with Updatable\[[ExtensionRequest](ExtensionRequest.html)] with Product with SerializableThe type name and extension number sent by the client when requesting
file\_containing\_extension.

The type name and extension number sent by the client when requesting
file\_containing\_extension.

containingType
 Fully\-qualified type name. The format should be \<package\>.\<type\>

Annotations@SerialVersionUID()
4. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse.html "Permalink") final  case class [FileDescriptorResponse](FileDescriptorResponse.html "Serialized FileDescriptorProto messages sent by the server answering a file_by_filename, file_containing_symbol, or file_containing_extension request.")(fileDescriptorProto: Seq\[ByteString] \= \_root\_.scala.Seq.empty, unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty) extends GeneratedMessage with Updatable\[[FileDescriptorResponse](FileDescriptorResponse.html)] with Product with SerializableSerialized FileDescriptorProto messages sent by the server answering
a file\_by\_filename, file\_containing\_symbol, or file\_containing\_extension
request.

Serialized FileDescriptorProto messages sent by the server answering
a file\_by\_filename, file\_containing\_symbol, or file\_containing\_extension
request.

fileDescriptorProto
 Serialized FileDescriptorProto messages. We avoid taking a dependency on
 descriptor.proto, which uses proto2 only features, by making them opaque
 bytes instead.

Annotations@SerialVersionUID()
5. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse.html "Permalink") final  case class [ListServiceResponse](ListServiceResponse.html "A list of ServiceResponse sent by the server answering list_services request.")(service: Seq\[[ServiceResponse](ServiceResponse.html)] \= \_root\_.scala.Seq.empty, unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty) extends GeneratedMessage with Updatable\[[ListServiceResponse](ListServiceResponse.html)] with Product with SerializableA list of ServiceResponse sent by the server answering list\_services request.

A list of ServiceResponse sent by the server answering list\_services request.

service
 The information of each service may be expanded in the future, so we use
 ServiceResponse message to encapsulate it.

Annotations@SerialVersionUID()
6. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflection.html "Permalink")  trait [ServerReflection](ServerReflection.html) extends AnyRefAnnotations@[AkkaGrpcGenerated](../../../../akka/grpc/AkkaGrpcGenerated.html)()
7. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClient.html "Permalink")  trait [ServerReflectionClient](ServerReflectionClient.html) extends [ServerReflection](ServerReflection.html) with [ServerReflectionClientPowerApi](ServerReflectionClientPowerApi.html) with [AkkaGrpcClient](../../../../akka/grpc/scaladsl/AkkaGrpcClient.html)Annotations@[AkkaGrpcGenerated](../../../../akka/grpc/AkkaGrpcGenerated.html)()
8. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClientPowerApi.html "Permalink")  trait [ServerReflectionClientPowerApi](ServerReflectionClientPowerApi.html) extends AnyRefAnnotations@[AkkaGrpcGenerated](../../../../akka/grpc/AkkaGrpcGenerated.html)()
9. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest.html "Permalink") final  case class [ServerReflectionRequest](ServerReflectionRequest.html "The message sent by the client when calling ServerReflectionInfo method.")(host: String \= "", messageRequest: [MessageRequest](ServerReflectionRequest$$MessageRequest.html) \= [grpc.reflection.v1alpha.reflection.ServerReflectionRequest.MessageRequest.Empty](../../../index.html), unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty) extends GeneratedMessage with Updatable\[[ServerReflectionRequest](ServerReflectionRequest.html)] with Product with SerializableThe message sent by the client when calling ServerReflectionInfo method.

The message sent by the client when calling ServerReflectionInfo method.

Annotations@SerialVersionUID()
10. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html "Permalink") final  case class [ServerReflectionResponse](ServerReflectionResponse.html "The message sent by the server to answer ServerReflectionInfo method.")(validHost: String \= "", originalRequest: Option\[[ServerReflectionRequest](ServerReflectionRequest.html)] \= \_root\_.scala.None, messageResponse: [MessageResponse](ServerReflectionResponse$$MessageResponse.html) \= [grpc.reflection.v1alpha.reflection.ServerReflectionResponse.MessageResponse.Empty](../../../index.html), unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty) extends GeneratedMessage with Updatable\[[ServerReflectionResponse](ServerReflectionResponse.html)] with Product with SerializableThe message sent by the server to answer ServerReflectionInfo method.

The message sent by the server to answer ServerReflectionInfo method.

Annotations@SerialVersionUID()
11. [**](../../../../grpc/reflection/v1alpha/reflection/ServiceResponse.html "Permalink") final  case class [ServiceResponse](ServiceResponse.html "The information of a single service used by ListServiceResponse to answer list_services request.")(name: String \= "", unknownFields: UnknownFieldSet \= \_root\_.scalapb.UnknownFieldSet.empty) extends GeneratedMessage with Updatable\[[ServiceResponse](ServiceResponse.html)] with Product with SerializableThe information of a single service used by ListServiceResponse to answer
list\_services request.

The information of a single service used by ListServiceResponse to answer
list\_services request.

name
 Full name of a registered service, including its package name. The format
 is \<package\>.\<service\>

Annotations@SerialVersionUID()
### Value Members

1. [**](../../../../grpc/reflection/v1alpha/reflection/ErrorResponse$.html "Permalink")  object [ErrorResponse](ErrorResponse$.html) extends GeneratedMessageCompanion\[[ErrorResponse](ErrorResponse.html)]
2. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionNumberResponse$.html "Permalink")  object [ExtensionNumberResponse](ExtensionNumberResponse$.html) extends GeneratedMessageCompanion\[[ExtensionNumberResponse](ExtensionNumberResponse.html)]
3. [**](../../../../grpc/reflection/v1alpha/reflection/ExtensionRequest$.html "Permalink")  object [ExtensionRequest](ExtensionRequest$.html) extends GeneratedMessageCompanion\[[ExtensionRequest](ExtensionRequest.html)]
4. [**](../../../../grpc/reflection/v1alpha/reflection/FileDescriptorResponse$.html "Permalink")  object [FileDescriptorResponse](FileDescriptorResponse$.html) extends GeneratedMessageCompanion\[[FileDescriptorResponse](FileDescriptorResponse.html)]
5. [**](../../../../grpc/reflection/v1alpha/reflection/ListServiceResponse$.html "Permalink")  object [ListServiceResponse](ListServiceResponse$.html) extends GeneratedMessageCompanion\[[ListServiceResponse](ListServiceResponse.html)]
6. [**](../../../../grpc/reflection/v1alpha/reflection/ReflectionProto$.html "Permalink")  object [ReflectionProto](ReflectionProto$.html) extends GeneratedFileObject
7. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflection$.html "Permalink")  object [ServerReflection](ServerReflection$.html) extends [ServiceDescription](../../../../akka/grpc/ServiceDescription.html)Annotations@[AkkaGrpcGenerated](../../../../akka/grpc/AkkaGrpcGenerated.html)()
8. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionClient$.html "Permalink")  object [ServerReflectionClient](ServerReflectionClient$.html)Annotations@[AkkaGrpcGenerated](../../../../akka/grpc/AkkaGrpcGenerated.html)()
9. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionHandler$.html "Permalink")  object [ServerReflectionHandler](ServerReflectionHandler$.html)Annotations@ApiMayChange() @[AkkaGrpcGenerated](../../../../akka/grpc/AkkaGrpcGenerated.html)()
10. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionMarshallers$.html "Permalink")  object [ServerReflectionMarshallers](ServerReflectionMarshallers$.html)Annotations@[AkkaGrpcGenerated](../../../../akka/grpc/AkkaGrpcGenerated.html)()
11. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionRequest$.html "Permalink")  object [ServerReflectionRequest](ServerReflectionRequest$.html) extends GeneratedMessageCompanion\[[ServerReflectionRequest](ServerReflectionRequest.html)]
12. [**](../../../../grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html "Permalink")  object [ServerReflectionResponse](ServerReflectionResponse$.html) extends GeneratedMessageCompanion\[[ServerReflectionResponse](ServerReflectionResponse.html)]
13. [**](../../../../grpc/reflection/v1alpha/reflection/ServiceResponse$.html "Permalink")  object [ServiceResponse](ServiceResponse$.html) extends GeneratedMessageCompanion\[[ServiceResponse](ServiceResponse.html)]
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/AkkaGrpcGenerated.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/ServiceDescription.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/AkkaGrpcClient.html
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
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$$MessageResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse$.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServiceResponse.html
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/index.html](https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/index.html)*