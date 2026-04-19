---
description: Akka gRPC 2.5.10 - akka.grpc.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/index.html
title: Akka gRPC 2.5.10 - akka.grpc.scaladsl
---

# Akka gRPC 2.5.10 - akka.grpc.scaladsl

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.scaladsl

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[grpc](../index.html)
- [**](../../../akka/grpc/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[grpc](../index.html)
- [**](../../../akka/grpc/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[grpc](../index.html)
- [**](../../../akka/grpc/scaladsl/headers/index.html "Permalink")  package [headers](headers/index.html)
- [AkkaGrpcClient](AkkaGrpcClient.html "Common trait of all generated Akka gRPC clients.")
- [BytesEntry](BytesEntry.html "Represents a binary metadata entry.")
- [GrpcExceptionHandler](GrpcExceptionHandler$.html)
- [GrpcMarshalling](GrpcMarshalling$.html)
- [InstancePerRequestFactory](InstancePerRequestFactory.html "Not for user extension, used by generated code.")
- [Metadata](Metadata.html "Immutable representation of the metadata in a call")
- [MetadataBuilder](MetadataBuilder.html "This class provides an interface for constructing immutable Metadata instances.")
- [MetadataEntry](MetadataEntry.html "Represents a entry (value) in a collection of Metadata.")
- [MetadataStatus](MetadataStatus.html "Provides access to details to more rich error details using the logical gRPC com.google.rpc.Status message, see [API Design Guide](https://cloud.google.com/apis/design/errors) for more details.")
- [ScalapbProtobufSerializer](ScalapbProtobufSerializer.html)
- [ServerReflection](ServerReflection$.html)
- [ServiceHandler](ServiceHandler$.html)
- [SingleResponseRequestBuilder](SingleResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through GrpcClientSettings upon creation.")
- [StreamResponseRequestBuilder](StreamResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through GrpcClientSettings upon creation.")
- [StringEntry](StringEntry.html "Represents a text metadata entry.")
- [WebHandler](WebHandler$.html)
p[akka](../../index.html).[grpc](../index.html)

# scaladsl[**](../../../akka/grpc/scaladsl/index.html "Permalink")

#### package scaladsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/grpc/scaladsl/headers/index.html "Permalink")  package [headers](headers/index.html)
### Type Members

1. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html "Permalink")  trait [AkkaGrpcClient](AkkaGrpcClient.html "Common trait of all generated Akka gRPC clients.") extends AnyRefCommon trait of all generated Akka gRPC clients.

Common trait of all generated Akka gRPC clients. Not for user extension.

Annotations@DoNotInherit()
2. [**](../../../akka/grpc/scaladsl/BytesEntry.html "Permalink")  case class [BytesEntry](BytesEntry.html "Represents a binary metadata entry.")(value: ByteString) extends [MetadataEntry](MetadataEntry.html) with [javadsl.BytesEntry](../javadsl/BytesEntry.html) with Product with SerializableRepresents a binary metadata entry.

Represents a binary metadata entry.

valueThe entry value.
3. [**](../../../akka/grpc/scaladsl/InstancePerRequestFactory.html "Permalink")  trait [InstancePerRequestFactory](InstancePerRequestFactory.html "Not for user extension, used by generated code.")\[S] extends AnyRefNot for user extension, used by generated code.

Not for user extension, used by generated code.

Internal abstraction for Akka gRPC integration in Akka SDK. Implemented only by the generated ScalaHandlerFactory for
Java gRPC service bootstrap when the codegen option generateScalaHandlerFactory is set.

Sthe gRPC service type

Annotations@DoNotInherit() @ApiMayChange()
4. [**](../../../akka/grpc/scaladsl/Metadata.html "Permalink")  trait [Metadata](Metadata.html "Immutable representation of the metadata in a call") extends AnyRefImmutable representation of the metadata in a call

Immutable representation of the metadata in a call

Not for user extension

Annotations@ApiMayChange() @DoNotInherit()
5. [**](../../../akka/grpc/scaladsl/MetadataBuilder.html "Permalink")  class [MetadataBuilder](MetadataBuilder.html "This class provides an interface for constructing immutable Metadata instances.") extends AnyRefThis class provides an interface for constructing immutable Metadata instances.

This class provides an interface for constructing immutable Metadata instances.

Annotations@DoNotInherit() @ApiMayChange()
6. [**](../../../akka/grpc/scaladsl/MetadataEntry.html "Permalink") sealed  trait [MetadataEntry](MetadataEntry.html "Represents a entry (value) in a collection of Metadata.") extends [javadsl.MetadataEntry](../javadsl/MetadataEntry.html)Represents a entry (value) in a collection of Metadata.

Represents a entry (value) in a collection of Metadata.

Annotations@ApiMayChange()
7. [**](../../../akka/grpc/scaladsl/MetadataStatus.html "Permalink")  trait [MetadataStatus](MetadataStatus.html "Provides access to details to more rich error details using the logical gRPC com.google.rpc.Status message, see [API Design Guide](https://cloud.google.com/apis/design/errors) for more details.") extends [Metadata](Metadata.html)Provides access to details to more rich error details using the logical gRPC com.google.rpc.Status message, see
\[API Design Guide](https://cloud.google.com/apis/design/errors) for more details.

Provides access to details to more rich error details using the logical gRPC com.google.rpc.Status message, see
\[API Design Guide](https://cloud.google.com/apis/design/errors) for more details.

Not for user extension

Annotations@ApiMayChange() @DoNotInherit()
8. [**](../../../akka/grpc/scaladsl/ScalapbProtobufSerializer.html "Permalink")  class [ScalapbProtobufSerializer](ScalapbProtobufSerializer.html)\[T \<: GeneratedMessage] extends [ProtobufSerializer](../ProtobufSerializer.html)\[T]Annotations@ApiMayChange()
9. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html "Permalink")  trait [SingleResponseRequestBuilder](SingleResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through GrpcClientSettings upon creation.")\[Req, Res] extends AnyRefRequest builder for requests providing per call specific metadata capabilities in
addition to the client instance default options provided to it through [GrpcClientSettings](../GrpcClientSettings.html) upon creation.

Request builder for requests providing per call specific metadata capabilities in
addition to the client instance default options provided to it through [GrpcClientSettings](../GrpcClientSettings.html) upon creation.

Instances are immutable so can be shared and re\-used but are backed by the client that created the instance,
so if that is stopped the invocations will fail.

Not for user extension

Annotations@DoNotInherit() @ApiMayChange()
10. [**](../../../akka/grpc/scaladsl/StreamResponseRequestBuilder.html "Permalink")  trait [StreamResponseRequestBuilder](StreamResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through GrpcClientSettings upon creation.")\[Req, Res] extends AnyRefRequest builder for requests providing per call specific metadata capabilities in
addition to the client instance default options provided to it through [GrpcClientSettings](../GrpcClientSettings.html) upon creation.

Request builder for requests providing per call specific metadata capabilities in
addition to the client instance default options provided to it through [GrpcClientSettings](../GrpcClientSettings.html) upon creation.

Instances are immutable so can be shared and re\-used but are backed by the client that created the instance,
so if that is stopped the invocations will fail.

Not for user extension

Annotations@DoNotInherit() @ApiMayChange()
11. [**](../../../akka/grpc/scaladsl/StringEntry.html "Permalink")  case class [StringEntry](StringEntry.html "Represents a text metadata entry.")(value: String) extends [MetadataEntry](MetadataEntry.html) with [javadsl.StringEntry](../javadsl/StringEntry.html) with Product with SerializableRepresents a text metadata entry.

Represents a text metadata entry.

valueThe entry value.
### Value Members

1. [**](../../../akka/grpc/scaladsl/GrpcExceptionHandler$.html "Permalink")  object [GrpcExceptionHandler](GrpcExceptionHandler$.html)Annotations@ApiMayChange()
2. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html "Permalink")  object [GrpcMarshalling](GrpcMarshalling$.html)
3. [**](../../../akka/grpc/scaladsl/MetadataBuilder$.html "Permalink")  object [MetadataBuilder](MetadataBuilder$.html)
4. [**](../../../akka/grpc/scaladsl/ServerReflection$.html "Permalink")  object [ServerReflection](ServerReflection$.html)Annotations@ApiMayChange()
5. [**](../../../akka/grpc/scaladsl/ServiceHandler$.html "Permalink")  object [ServiceHandler](ServiceHandler$.html)Annotations@ApiMayChange()
6. [**](../../../akka/grpc/scaladsl/WebHandler$.html "Permalink")  object [WebHandler](WebHandler$.html)Annotations@ApiMayChange()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/ProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/BytesEntry.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/MetadataEntry.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/StringEntry.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/AkkaGrpcClient.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/BytesEntry.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/GrpcExceptionHandler$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/GrpcMarshalling$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/InstancePerRequestFactory.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/Metadata.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/MetadataBuilder$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/MetadataBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/MetadataEntry.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/MetadataStatus.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/ScalapbProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/ServerReflection$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/ServiceHandler$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/SingleResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/StreamResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/StringEntry.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/WebHandler$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/headers/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/index.html](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/index.html)*