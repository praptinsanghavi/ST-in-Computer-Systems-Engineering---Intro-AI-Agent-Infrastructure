---
description: Akka gRPC 2.5.10 - akka.grpc.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/index.html
title: Akka gRPC 2.5.10 - akka.grpc.javadsl
---

# Akka gRPC 2.5.10 - akka.grpc.javadsl

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.javadsl

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[grpc](../index.html)
- [**](../../../akka/grpc/javadsl/index.html "Permalink")  package javadslDefinition Classes[grpc](../index.html)
- [AkkaGrpcClient](AkkaGrpcClient.html "Common trait of all generated Akka gRPC clients.")
- [BytesEntry](BytesEntry.html "Represents a binary metadata entry.")
- [GoogleProtobufSerializer](GoogleProtobufSerializer.html)
- [GrpcExceptionHandler](GrpcExceptionHandler$.html)
- [GrpcMarshalling](GrpcMarshalling$.html)
- [Metadata](Metadata.html "Immutable representation of the metadata in a call")
- [MetadataBuilder](MetadataBuilder.html "This class provides an interface for constructing immutable Metadata instances.")
- [MetadataEntry](MetadataEntry.html "Represents metadata entry.")
- [MetadataStatus](MetadataStatus.html "Provides access to details to more rich error details using the logical gRPC com.google.rpc.Status message, see [API Design Guide](https://cloud.google.com/apis/design/errors) for more details.")
- [ServerReflection](ServerReflection$.html)
- [ServiceHandler](ServiceHandler$.html)
- [SingleBlockingResponseRequestBuilder](SingleBlockingResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")
- [SingleResponseRequestBuilder](SingleResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")
- [StreamResponseRequestBuilder](StreamResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")
- [StringEntry](StringEntry.html "Represents a text metadata entry.")
- [WebHandler](WebHandler$.html)
- [**](../../../akka/grpc/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[grpc](../index.html)
p[akka](../../index.html).[grpc](../index.html)

# javadsl[**](../../../akka/grpc/javadsl/index.html "Permalink")

#### package javadsl

Source[package.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/javadsl/package.scala#L7)Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. javadsl
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html "Permalink")  trait [AkkaGrpcClient](AkkaGrpcClient.html "Common trait of all generated Akka gRPC clients.") extends AnyRefCommon trait of all generated Akka gRPC clients.

Common trait of all generated Akka gRPC clients. Not for user extension.

Annotations@DoNotInherit()
2. [**](../../../akka/grpc/javadsl/BytesEntry.html "Permalink")  trait [BytesEntry](BytesEntry.html "Represents a binary metadata entry.") extends [MetadataEntry](MetadataEntry.html)Represents a binary metadata entry.

Represents a binary metadata entry.

Annotations@DoNotInherit()
3. [**](../../../akka/grpc/javadsl/GoogleProtobufSerializer.html "Permalink")  class [GoogleProtobufSerializer](GoogleProtobufSerializer.html)\[T \<: Message] extends [ProtobufSerializer](../ProtobufSerializer.html)\[T]Annotations@ApiMayChange()
4. [**](../../../akka/grpc/javadsl/Metadata.html "Permalink")  trait [Metadata](Metadata.html "Immutable representation of the metadata in a call") extends AnyRefImmutable representation of the metadata in a call

Immutable representation of the metadata in a call

Not for user extension

Annotations@DoNotInherit() @ApiMayChange()
5. [**](../../../akka/grpc/javadsl/MetadataBuilder.html "Permalink")  class [MetadataBuilder](MetadataBuilder.html "This class provides an interface for constructing immutable Metadata instances.") extends AnyRefThis class provides an interface for constructing immutable Metadata instances.

This class provides an interface for constructing immutable Metadata instances.

Annotations@ApiMayChange()
6. [**](../../../akka/grpc/javadsl/MetadataEntry.html "Permalink")  trait [MetadataEntry](MetadataEntry.html "Represents metadata entry.") extends AnyRefRepresents metadata entry.

Represents metadata entry.

Annotations@DoNotInherit() @ApiMayChange()
7. [**](../../../akka/grpc/javadsl/MetadataStatus.html "Permalink")  trait [MetadataStatus](MetadataStatus.html "Provides access to details to more rich error details using the logical gRPC com.google.rpc.Status message, see [API Design Guide](https://cloud.google.com/apis/design/errors) for more details.") extends [Metadata](Metadata.html)Provides access to details to more rich error details using the logical gRPC com.google.rpc.Status message, see
\[API Design Guide](https://cloud.google.com/apis/design/errors) for more details.

Provides access to details to more rich error details using the logical gRPC com.google.rpc.Status message, see
\[API Design Guide](https://cloud.google.com/apis/design/errors) for more details.

Not for user extension

Annotations@ApiMayChange() @DoNotInherit()
8. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html "Permalink")  trait [SingleBlockingResponseRequestBuilder](SingleBlockingResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")\[Req, Res] extends AnyRefRequest builder for requests providing per call specific metadata capabilities in
addition to the client instance default options provided to it through [akka.grpc.GrpcClientSettings](../GrpcClientSettings.html) upon creation.

Request builder for requests providing per call specific metadata capabilities in
addition to the client instance default options provided to it through [akka.grpc.GrpcClientSettings](../GrpcClientSettings.html) upon creation.

Instances are immutable so can be shared and re\-used but are backed by the client that created the instance,
so if that is stopped the invocations will fail.

Only expected to be useful and generated for Java 21 and later where blocking can be done safely on virtual
threads.

Not for user extension

Annotations@DoNotInherit() @ApiMayChange()
9. [**](../../../akka/grpc/javadsl/SingleResponseRequestBuilder.html "Permalink")  trait [SingleResponseRequestBuilder](SingleResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")\[Req, Res] extends AnyRefRequest builder for requests providing per call specific metadata capabilities in
addition to the client instance default options provided to it through [akka.grpc.GrpcClientSettings](../GrpcClientSettings.html) upon creation.

Request builder for requests providing per call specific metadata capabilities in
addition to the client instance default options provided to it through [akka.grpc.GrpcClientSettings](../GrpcClientSettings.html) upon creation.

Instances are immutable so can be shared and re\-used but are backed by the client that created the instance,
so if that is stopped the invocations will fail.

Not for user extension

Annotations@DoNotInherit() @ApiMayChange()
10. [**](../../../akka/grpc/javadsl/StreamResponseRequestBuilder.html "Permalink")  trait [StreamResponseRequestBuilder](StreamResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")\[Req, Res] extends AnyRefRequest builder for requests providing per call specific metadata capabilities in
addition to the client instance default options provided to it through [akka.grpc.GrpcClientSettings](../GrpcClientSettings.html) upon creation.

Request builder for requests providing per call specific metadata capabilities in
addition to the client instance default options provided to it through [akka.grpc.GrpcClientSettings](../GrpcClientSettings.html) upon creation.

Instances are immutable so can be shared and re\-used but are backed by the client that created the instance,
so if that is stopped the invocations will fail.

Not for user extension

Annotations@DoNotInherit() @ApiMayChange()
11. [**](../../../akka/grpc/javadsl/StringEntry.html "Permalink")  trait [StringEntry](StringEntry.html "Represents a text metadata entry.") extends [MetadataEntry](MetadataEntry.html)Represents a text metadata entry.

Represents a text metadata entry.

Annotations@DoNotInherit()
### Value Members

1. [**](../../../akka/grpc/javadsl/index.html#japiFunction[A,B](f:A=>B):akka.japi.function.Function[A,B] "Permalink")  def japiFunction\[A, B](f: (A) \=\> B): Function\[A, B]Helper for creating akka.japi.function.Function instances from Scala
functions as Scala 2\.11 does not know about SAMs.
2. [**](../../../akka/grpc/javadsl/index.html#javaFunction[A,B](f:A=>B):java.util.function.Function[A,B] "Permalink")  def javaFunction\[A, B](f: (A) \=\> B): [Function](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[A, B]Helper for creating java.util.function.Function instances from Scala
functions as Scala 2\.11 does not know about SAMs.
3. [**](../../../akka/grpc/javadsl/index.html#scalaAnonymousPartialFunction[A,B,C](f:akka.japi.Function[A,akka.japi.Function[B,C]]):A=>PartialFunction[B,C] "Permalink")  def scalaAnonymousPartialFunction\[A, B, C](f: Function\[A, Function\[B, C]]): (A) \=\> PartialFunction\[B, C]Helper for creating Scala anonymous partial functions from akka.japi.Function
instances as Scala 2\.11 does not know about SAMs.
4. [**](../../../akka/grpc/javadsl/index.html#scalaPartialFunction[A,B](f:akka.japi.Function[A,B]):PartialFunction[A,B] "Permalink")  def scalaPartialFunction\[A, B](f: Function\[A, B]): PartialFunction\[A, B]Helper for creating Scala partial functions from akka.japi.Function
instances as Scala 2\.11 does not know about SAMs.
5. [**](../../../akka/grpc/javadsl/GrpcExceptionHandler$.html "Permalink")  object [GrpcExceptionHandler](GrpcExceptionHandler$.html)Annotations@ApiMayChange()
6. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html "Permalink")  object [GrpcMarshalling](GrpcMarshalling$.html)
7. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html "Permalink")  object [MetadataBuilder](MetadataBuilder$.html)Annotations@ApiMayChange()
8. [**](../../../akka/grpc/javadsl/ServerReflection$.html "Permalink")  object [ServerReflection](ServerReflection$.html)Annotations@ApiMayChange()
9. [**](../../../akka/grpc/javadsl/ServiceHandler$.html "Permalink")  object [ServiceHandler](ServiceHandler$.html)Annotations@ApiMayChange()
10. [**](../../../akka/grpc/javadsl/WebHandler$.html "Permalink")  object [WebHandler](WebHandler$.html)Annotations@ApiMayChange()
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/ProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/AkkaGrpcClient.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/BytesEntry.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/GoogleProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/GrpcExceptionHandler$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/GrpcMarshalling$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/Metadata.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/MetadataBuilder$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/MetadataBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/MetadataEntry.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/MetadataStatus.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/ServerReflection$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/ServiceHandler$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/SingleResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/StreamResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/StringEntry.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/WebHandler$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/index.html](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/index.html)*