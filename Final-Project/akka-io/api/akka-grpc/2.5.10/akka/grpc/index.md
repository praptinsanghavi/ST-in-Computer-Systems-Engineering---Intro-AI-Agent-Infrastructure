---
description: Akka gRPC 2.5.10 - akka.grpc
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
title: Akka gRPC 2.5.10 - akka.grpc
---

# Akka gRPC 2.5.10 - akka.grpc

> **Summary:** Akka gRPC 2.5.10 - akka.grpc

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/grpc/index.html "Permalink")  package grpcDefinition Classes[akka](../index.html)
- [**](../../akka/grpc/internal/index.html "Permalink")  package [internal](internal/index.html)
- [**](../../akka/grpc/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../akka/grpc/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [AkkaGrpcGenerated](AkkaGrpcGenerated.html)
- [GrpcChannel](GrpcChannel.html)
- [GrpcClientCloseException](GrpcClientCloseException.html "Thrown if close() is called on a client that uses a shared channel.")
- [GrpcClientSettings](GrpcClientSettings.html)
- [GrpcProtocol](GrpcProtocol.html "A variant of the gRPC protocol - e.g.")
- [GrpcResponseMetadata](GrpcResponseMetadata.html "Represents the metadata related to a gRPC call with a streaming response")
- [GrpcServiceException](GrpcServiceException.html)
- [GrpcSingleResponse](GrpcSingleResponse.html "Represents the metadata related to a gRPC call with a single response value")
- [ProtobufSerializer](ProtobufSerializer.html)
- [SSLContextUtils](SSLContextUtils$.html)
- [ServiceDescription](ServiceDescription.html)
- [Trailers](Trailers.html)
p[akka](../index.html)

# grpc[**](../../akka/grpc/index.html "Permalink")

#### package grpc

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/grpc/internal/index.html "Permalink")  package [internal](internal/index.html)
2. [**](../../akka/grpc/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
3. [**](../../akka/grpc/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
### Type Members

1. [**](../../akka/grpc/AkkaGrpcGenerated.html "Permalink")  trait [AkkaGrpcGenerated](AkkaGrpcGenerated.html) extends [Annotation](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/annotation/Annotation.html#java.lang.annotation.Annotation)Annotations@Retention()
2. [**](../../akka/grpc/GrpcChannel.html "Permalink") final  class [GrpcChannel](GrpcChannel.html) extends AnyRef
3. [**](../../akka/grpc/GrpcClientCloseException.html "Permalink") final  class [GrpcClientCloseException](GrpcClientCloseException.html "Thrown if close() is called on a client that uses a shared channel.") extends [IllegalStateException](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/IllegalStateException.html#java.lang.IllegalStateException)Thrown if close() is called on a client that uses a shared channel.
4. [**](../../akka/grpc/GrpcClientSettings.html "Permalink") final  class [GrpcClientSettings](GrpcClientSettings.html) extends AnyRefAnnotations@ApiMayChange()
5. [**](../../akka/grpc/GrpcProtocol.html "Permalink")  trait [GrpcProtocol](GrpcProtocol.html "A variant of the gRPC protocol - e.g.") extends AnyRefA variant of the gRPC protocol \- e.g.

A variant of the gRPC protocol \- e.g. gRPC and gRPC\-Web
6. [**](../../akka/grpc/GrpcResponseMetadata.html "Permalink")  trait [GrpcResponseMetadata](GrpcResponseMetadata.html "Represents the metadata related to a gRPC call with a streaming response") extends AnyRefRepresents the metadata related to a gRPC call with a streaming response

Represents the metadata related to a gRPC call with a streaming response

Not for user extension

Annotations@DoNotInherit() @ApiMayChange()
7. [**](../../akka/grpc/GrpcServiceException.html "Permalink")  class [GrpcServiceException](GrpcServiceException.html) extends StatusRuntimeExceptionAnnotations@ApiMayChange()
8. [**](../../akka/grpc/GrpcSingleResponse.html "Permalink")  trait [GrpcSingleResponse](GrpcSingleResponse.html "Represents the metadata related to a gRPC call with a single response value")\[T] extends [GrpcResponseMetadata](GrpcResponseMetadata.html)Represents the metadata related to a gRPC call with a single response value

Represents the metadata related to a gRPC call with a single response value

Not for user extension

Annotations@DoNotInherit()
9. [**](../../akka/grpc/ProtobufSerializer.html "Permalink")  trait [ProtobufSerializer](ProtobufSerializer.html)\[T] extends AnyRef
10. [**](../../akka/grpc/ServiceDescription.html "Permalink")  trait [ServiceDescription](ServiceDescription.html) extends AnyRefAnnotations@ApiMayChange()
11. [**](../../akka/grpc/Trailers.html "Permalink")  class [Trailers](Trailers.html) extends AnyRefAnnotations@ApiMayChange()
### Value Members

1. [**](../../akka/grpc/GrpcChannel$.html "Permalink")  object [GrpcChannel](GrpcChannel$.html)
2. [**](../../akka/grpc/GrpcClientSettings$.html "Permalink")  object [GrpcClientSettings](GrpcClientSettings$.html)
3. [**](../../akka/grpc/GrpcProtocol$.html "Permalink")  object [GrpcProtocol](GrpcProtocol$.html "INTERNAL API")INTERNAL API

INTERNAL API

Core definitions for gRPC protocols.

Annotations@InternalApi()
4. [**](../../akka/grpc/GrpcServiceException$.html "Permalink")  object [GrpcServiceException](GrpcServiceException$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
5. [**](../../akka/grpc/SSLContextUtils$.html "Permalink")  object [SSLContextUtils](SSLContextUtils$.html)
6. [**](../../akka/grpc/Trailers$.html "Permalink")  object [Trailers](Trailers$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/AkkaGrpcGenerated.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcChannel$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcChannel.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcClientCloseException.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcProtocol$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcProtocol.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcResponseMetadata.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcServiceException$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcServiceException.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcSingleResponse.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/ProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/SSLContextUtils$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/ServiceDescription.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/Trailers$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/Trailers.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/index.html](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/index.html)*