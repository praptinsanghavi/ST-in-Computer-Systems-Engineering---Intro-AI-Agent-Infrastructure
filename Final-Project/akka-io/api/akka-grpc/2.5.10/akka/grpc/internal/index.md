---
description: Akka gRPC 2.5.10 - akka.grpc.internal
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/index.html
title: Akka gRPC 2.5.10 - akka.grpc.internal
---

# Akka gRPC 2.5.10 - akka.grpc.internal

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.internal

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/internal/index.html "Permalink")  package internalDefinition Classes[grpc](../index.html)
- [AbstractGrpcProtocol](AbstractGrpcProtocol.html)
- [AkkaHttpClientUtils](AkkaHttpClientUtils$.html "INTERNAL API")
- [BaseMarshaller](BaseMarshaller.html "INTERNAL API")
- [CancellationBarrierGraphStage](CancellationBarrierGraphStage.html "'barrier' that makes sure that, even when downstream is cancelled, the complete upstream is consumed.")
- [ChannelUtils](ChannelUtils$.html "INTERNAL API")
- [ClientClosedException](ClientClosedException.html "INTERNAL API Used from generated code so can't be private.")
- [ClientConnectionException](ClientConnectionException.html "Used to indicate that a gRPC client can not establish a connection after the configured number of attempts.")
- [ClientState](ClientState.html "INTERNAL API")
- [Codec](Codec.html)
- [Codecs](Codecs$.html)
- [EntryMetadataImpl](EntryMetadataImpl.html "This class represents metadata as a list of (key, entry) tuples.")
- [GrpcEntityHelpers](GrpcEntityHelpers$.html "INTERNAL API")
- [GrpcMetadataImpl](GrpcMetadataImpl.html "This class wraps a mutable Metadata from io.grpc with the Scala Metadata interface.")
- [GrpcProtocolNative](GrpcProtocolNative$.html "Implementation of the gRPC (application/grpc+proto) protocol:")
- [GrpcProtocolWeb](GrpcProtocolWeb$.html "Implementation of the gRPC Web protocol.")
- [GrpcProtocolWebBase](GrpcProtocolWebBase.html)
- [GrpcProtocolWebText](GrpcProtocolWebText$.html "The application/grpc-web-text+proto variant of gRPC.")
- [GrpcRequestHelpers](GrpcRequestHelpers$.html)
- [GrpcResponseHelpers](GrpcResponseHelpers$.html "Some helpers for creating HTTP entities for use with gRPC.")
- [Gzip](Gzip$.html)
- [HardcodedServiceDiscovery](HardcodedServiceDiscovery.html)
- [HeaderMetadataImpl](HeaderMetadataImpl.html "This class wraps a list of headers from an HttpResponse with the Metadata interface.")
- [HttpMessageMetadataImpl](HttpMessageMetadataImpl.html "This class wraps an HttpMessage with the Metadata interface.")
- [Identity](Identity$.html)
- [InternalChannel](InternalChannel.html "INTERNAL API")
- [JavaBidirectionalStreamingRequestBuilder](JavaBidirectionalStreamingRequestBuilder.html "INTERNAL API")
- [JavaClientStreamingRequestBuilder](JavaClientStreamingRequestBuilder.html "INTERNAL API")
- [JavaMetadataImpl](JavaMetadataImpl.html "This class wraps a scaladsl.Metadata instance with the javadsl.Metadata interface.")
- [JavaServerStreamingRequestBuilder](JavaServerStreamingRequestBuilder.html "INTERNAL API")
- [JavaUnaryRequestBuilder](JavaUnaryRequestBuilder.html "INTERNAL API")
- [Marshaller](Marshaller.html "INTERNAL API")
- [MetadataImpl](MetadataImpl.html "INTERNAL API")
- [MetadataOperations](MetadataOperations.html "INTERNAL API")
- [MissingParameterException](MissingParameterException.html)
- [NettyClientUtils](NettyClientUtils$.html "INTERNAL API")
- [ProtoMarshaller](ProtoMarshaller.html "INTERNAL API")
- [RequestBuilderImpl](RequestBuilderImpl$.html)
- [RichGrpcMetadataImpl](RichGrpcMetadataImpl.html)
- [ScalaBidirectionalStreamingRequestBuilder](ScalaBidirectionalStreamingRequestBuilder.html "INTERNAL API")
- [ScalaClientStreamingRequestBuilder](ScalaClientStreamingRequestBuilder.html "INTERNAL API")
- [ScalaServerStreamingRequestBuilder](ScalaServerStreamingRequestBuilder.html "INTERNAL API")
- [ScalaUnaryRequestBuilder](ScalaUnaryRequestBuilder.html "INTERNAL API")
- [ServerReflectionImpl](ServerReflectionImpl.html "INTERNAL API")
- [ServiceDescriptionImpl](ServiceDescriptionImpl.html "INTERNAL API")
- [SingleParameterSink](SingleParameterSink$.html)
- [TelemetryExtension](TelemetryExtension$.html "INTERNAL API")
- [TelemetrySpi](TelemetrySpi.html)
- [WithProtobufSerializer](WithProtobufSerializer.html)
- [**](../../../akka/grpc/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[grpc](../index.html)
- [**](../../../akka/grpc/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[grpc](../index.html)
p[akka](../../index.html).[grpc](../index.html)

# internal[**](../../../akka/grpc/internal/index.html "Permalink")

#### package internal

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/grpc/internal/AbstractGrpcProtocol.html "Permalink") abstract  class [AbstractGrpcProtocol](AbstractGrpcProtocol.html) extends [GrpcProtocol](../GrpcProtocol.html)
2. [**](../../../akka/grpc/internal/BaseMarshaller.html "Permalink") abstract  class [BaseMarshaller](BaseMarshaller.html "INTERNAL API")\[T] extends io.grpc.MethodDescriptor.Marshaller\[T] with [WithProtobufSerializer](WithProtobufSerializer.html)\[T]INTERNAL API

INTERNAL API

Annotations@InternalStableApi()
3. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html "Permalink")  class [CancellationBarrierGraphStage](CancellationBarrierGraphStage.html "'barrier' that makes sure that, even when downstream is cancelled, the complete upstream is consumed.")\[T] extends GraphStage\[FlowShape\[T, T]]'barrier' that makes sure that, even when downstream is cancelled,
the complete upstream is consumed.
4. [**](../../../akka/grpc/internal/ClientClosedException.html "Permalink") final  class [ClientClosedException](ClientClosedException.html "INTERNAL API Used from generated code so can't be private.") extends RuntimeExceptionINTERNAL API
Used from generated code so can't be private.

INTERNAL API
Used from generated code so can't be private.

Thrown if a withChannel call is called after closing the internal channel

Annotations@InternalApi()
5. [**](../../../akka/grpc/internal/ClientConnectionException.html "Permalink")  class [ClientConnectionException](ClientConnectionException.html "Used to indicate that a gRPC client can not establish a connection after the configured number of attempts.") extends RuntimeExceptionUsed to indicate that a gRPC client can not establish a connection
after the configured number of attempts.

Used to indicate that a gRPC client can not establish a connection
after the configured number of attempts.

Can be caught to re\-create the client if it is likely that
your service discovery mechanism will resolve to different instances.
6. [**](../../../akka/grpc/internal/Codec.html "Permalink") abstract  class [Codec](Codec.html) extends AnyRef
7. [**](../../../akka/grpc/internal/EntryMetadataImpl.html "Permalink")  class [EntryMetadataImpl](EntryMetadataImpl.html "This class represents metadata as a list of (key, entry) tuples.") extends [Metadata](../scaladsl/Metadata.html)This class represents metadata as a list of (key, entry) tuples.

This class represents metadata as a list of (key, entry) tuples.

Annotations@InternalApi()
8. [**](../../../akka/grpc/internal/GrpcMetadataImpl.html "Permalink")  class [GrpcMetadataImpl](GrpcMetadataImpl.html "This class wraps a mutable Metadata from io.grpc with the Scala Metadata interface.") extends [Metadata](../scaladsl/Metadata.html)This class wraps a mutable Metadata from io.grpc with the Scala Metadata interface.

This class wraps a mutable Metadata from io.grpc with the Scala Metadata interface.

Annotations@InternalApi()
9. [**](../../../akka/grpc/internal/GrpcProtocolWebBase.html "Permalink") abstract  class [GrpcProtocolWebBase](GrpcProtocolWebBase.html) extends [AbstractGrpcProtocol](AbstractGrpcProtocol.html)
10. [**](../../../akka/grpc/internal/HardcodedServiceDiscovery.html "Permalink")  class [HardcodedServiceDiscovery](HardcodedServiceDiscovery.html) extends ServiceDiscovery
11. [**](../../../akka/grpc/internal/HeaderMetadataImpl.html "Permalink")  class [HeaderMetadataImpl](HeaderMetadataImpl.html "This class wraps a list of headers from an HttpResponse with the Metadata interface.") extends [Metadata](../scaladsl/Metadata.html)This class wraps a list of headers from an HttpResponse with the Metadata interface.

This class wraps a list of headers from an HttpResponse with the Metadata interface.

Annotations@InternalApi()
12. [**](../../../akka/grpc/internal/HttpMessageMetadataImpl.html "Permalink")  class [HttpMessageMetadataImpl](HttpMessageMetadataImpl.html "This class wraps an HttpMessage with the Metadata interface.") extends [HeaderMetadataImpl](HeaderMetadataImpl.html)This class wraps an HttpMessage with the Metadata interface.
13. [**](../../../akka/grpc/internal/InternalChannel.html "Permalink") abstract  class [InternalChannel](InternalChannel.html "INTERNAL API") extends AnyRefINTERNAL API

INTERNAL API

Annotations@InternalApi()
14. [**](../../../akka/grpc/internal/JavaBidirectionalStreamingRequestBuilder.html "Permalink") final  class [JavaBidirectionalStreamingRequestBuilder](JavaBidirectionalStreamingRequestBuilder.html "INTERNAL API")\[I, O] extends [StreamResponseRequestBuilder](../javadsl/StreamResponseRequestBuilder.html)\[Source\[I, NotUsed], O] with [MetadataOperations](MetadataOperations.html)\[[JavaBidirectionalStreamingRequestBuilder](JavaBidirectionalStreamingRequestBuilder.html)\[I, O]]INTERNAL API

INTERNAL API

Annotations@InternalApi()
15. [**](../../../akka/grpc/internal/JavaClientStreamingRequestBuilder.html "Permalink") final  class [JavaClientStreamingRequestBuilder](JavaClientStreamingRequestBuilder.html "INTERNAL API")\[I, O] extends [SingleResponseRequestBuilder](../javadsl/SingleResponseRequestBuilder.html)\[Source\[I, NotUsed], O] with [MetadataOperations](MetadataOperations.html)\[[JavaClientStreamingRequestBuilder](JavaClientStreamingRequestBuilder.html)\[I, O]]INTERNAL API

INTERNAL API

Annotations@InternalApi()
16. [**](../../../akka/grpc/internal/JavaMetadataImpl.html "Permalink")  class [JavaMetadataImpl](JavaMetadataImpl.html "This class wraps a scaladsl.Metadata instance with the javadsl.Metadata interface.") extends [Metadata](../javadsl/Metadata.html) with [MetadataStatus](../javadsl/MetadataStatus.html)This class wraps a scaladsl.Metadata instance with the javadsl.Metadata interface.

This class wraps a scaladsl.Metadata instance with the javadsl.Metadata interface.

Annotations@InternalApi()
17. [**](../../../akka/grpc/internal/JavaServerStreamingRequestBuilder.html "Permalink") final  class [JavaServerStreamingRequestBuilder](JavaServerStreamingRequestBuilder.html "INTERNAL API")\[I, O] extends [StreamResponseRequestBuilder](../javadsl/StreamResponseRequestBuilder.html)\[I, O] with [MetadataOperations](MetadataOperations.html)\[[JavaServerStreamingRequestBuilder](JavaServerStreamingRequestBuilder.html)\[I, O]]INTERNAL API

INTERNAL API

Annotations@InternalApi()
18. [**](../../../akka/grpc/internal/JavaUnaryRequestBuilder.html "Permalink") final  class [JavaUnaryRequestBuilder](JavaUnaryRequestBuilder.html "INTERNAL API")\[I, O] extends [SingleResponseRequestBuilder](../javadsl/SingleResponseRequestBuilder.html)\[I, O] with [MetadataOperations](MetadataOperations.html)\[[JavaUnaryRequestBuilder](JavaUnaryRequestBuilder.html)\[I, O]]INTERNAL API

INTERNAL API

Annotations@InternalApi()
19. [**](../../../akka/grpc/internal/Marshaller.html "Permalink") final  class [Marshaller](Marshaller.html "INTERNAL API")\[T \<: GeneratedMessage] extends [BaseMarshaller](BaseMarshaller.html)\[T]INTERNAL API

INTERNAL API

Annotations@InternalStableApi()
20. [**](../../../akka/grpc/internal/MetadataImpl.html "Permalink") final  class [MetadataImpl](MetadataImpl.html "INTERNAL API") extends AnyRefINTERNAL API

INTERNAL API

Annotations@InternalApi()
21. [**](../../../akka/grpc/internal/MetadataOperations.html "Permalink")  trait [MetadataOperations](MetadataOperations.html "INTERNAL API")\[T \<: [MetadataOperations](MetadataOperations.html)\[T]] extends AnyRefINTERNAL API

INTERNAL API

Annotations@InternalApi()
22. [**](../../../akka/grpc/internal/MissingParameterException.html "Permalink")  class [MissingParameterException](MissingParameterException.html) extends Throwable
23. [**](../../../akka/grpc/internal/ProtoMarshaller.html "Permalink")  class [ProtoMarshaller](ProtoMarshaller.html "INTERNAL API")\[T \<: Message] extends [BaseMarshaller](BaseMarshaller.html)\[T]INTERNAL API

INTERNAL API

Annotations@InternalStableApi()
24. [**](../../../akka/grpc/internal/RichGrpcMetadataImpl.html "Permalink")  class [RichGrpcMetadataImpl](RichGrpcMetadataImpl.html) extends [GrpcMetadataImpl](GrpcMetadataImpl.html) with [MetadataStatus](../scaladsl/MetadataStatus.html)
25. [**](../../../akka/grpc/internal/ScalaBidirectionalStreamingRequestBuilder.html "Permalink") final  class [ScalaBidirectionalStreamingRequestBuilder](ScalaBidirectionalStreamingRequestBuilder.html "INTERNAL API")\[I, O] extends [StreamResponseRequestBuilder](../scaladsl/StreamResponseRequestBuilder.html)\[Source\[I, NotUsed], O] with [MetadataOperations](MetadataOperations.html)\[[ScalaBidirectionalStreamingRequestBuilder](ScalaBidirectionalStreamingRequestBuilder.html)\[I, O]]INTERNAL API

INTERNAL API

Annotations@InternalApi()
26. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html "Permalink") final  class [ScalaClientStreamingRequestBuilder](ScalaClientStreamingRequestBuilder.html "INTERNAL API")\[I, O] extends [SingleResponseRequestBuilder](../scaladsl/SingleResponseRequestBuilder.html)\[Source\[I, NotUsed], O] with [MetadataOperations](MetadataOperations.html)\[[ScalaClientStreamingRequestBuilder](ScalaClientStreamingRequestBuilder.html)\[I, O]]INTERNAL API

INTERNAL API

Annotations@InternalApi()
27. [**](../../../akka/grpc/internal/ScalaServerStreamingRequestBuilder.html "Permalink") final  class [ScalaServerStreamingRequestBuilder](ScalaServerStreamingRequestBuilder.html "INTERNAL API")\[I, O] extends [StreamResponseRequestBuilder](../scaladsl/StreamResponseRequestBuilder.html)\[I, O] with [MetadataOperations](MetadataOperations.html)\[[ScalaServerStreamingRequestBuilder](ScalaServerStreamingRequestBuilder.html)\[I, O]]INTERNAL API

INTERNAL API

Annotations@InternalApi()
28. [**](../../../akka/grpc/internal/ScalaUnaryRequestBuilder.html "Permalink") final  class [ScalaUnaryRequestBuilder](ScalaUnaryRequestBuilder.html "INTERNAL API")\[I, O] extends [SingleResponseRequestBuilder](../scaladsl/SingleResponseRequestBuilder.html)\[I, O] with [MetadataOperations](MetadataOperations.html)\[[ScalaUnaryRequestBuilder](ScalaUnaryRequestBuilder.html)\[I, O]]INTERNAL API

INTERNAL API

Annotations@InternalApi()
29. [**](../../../akka/grpc/internal/ServerReflectionImpl.html "Permalink") final  class [ServerReflectionImpl](ServerReflectionImpl.html "INTERNAL API") extends [ServerReflection](../../../grpc/reflection/v1alpha/reflection/ServerReflection.html)INTERNAL API

INTERNAL API

Annotations@InternalApi()
30. [**](../../../akka/grpc/internal/ServiceDescriptionImpl.html "Permalink")  class [ServiceDescriptionImpl](ServiceDescriptionImpl.html "INTERNAL API") extends [ServiceDescription](../ServiceDescription.html)INTERNAL API

INTERNAL API

Annotations@InternalApi()
31. [**](../../../akka/grpc/internal/TelemetrySpi.html "Permalink")  trait [TelemetrySpi](TelemetrySpi.html) extends AnyRefAnnotations@InternalStableApi()
32. [**](../../../akka/grpc/internal/WithProtobufSerializer.html "Permalink")  trait [WithProtobufSerializer](WithProtobufSerializer.html)\[T] extends AnyRef
### Deprecated Type Members

1. [**](../../../akka/grpc/internal/ClientState.html "Permalink") final  class [ClientState](ClientState.html "INTERNAL API") extends AnyRefINTERNAL API

INTERNAL API

Deprecated: This class wraps a GrpcChannel for compatibility with clients generated by previous versions.

Annotations@deprecated @InternalApi() Deprecated*(Since version akka\-grpc 2\.1\.5\)* Kept for binary compatibility between generated code and runtime
### Value Members

1. [**](../../../akka/grpc/internal/AbstractGrpcProtocol$.html "Permalink")  object [AbstractGrpcProtocol](AbstractGrpcProtocol$.html)
2. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$.html "Permalink")  object [AkkaHttpClientUtils](AkkaHttpClientUtils$.html "INTERNAL API")INTERNAL API

INTERNAL API

Annotations@InternalApi()
3. [**](../../../akka/grpc/internal/ChannelUtils$.html "Permalink")  object [ChannelUtils](ChannelUtils$.html "INTERNAL API")INTERNAL API

INTERNAL API

Annotations@InternalApi()
4. [**](../../../akka/grpc/internal/Codecs$.html "Permalink")  object [Codecs](Codecs$.html)
5. [**](../../../akka/grpc/internal/GrpcEntityHelpers$.html "Permalink")  object [GrpcEntityHelpers](GrpcEntityHelpers$.html "INTERNAL API")INTERNAL API

INTERNAL API

Annotations@InternalApi()
6. [**](../../../akka/grpc/internal/GrpcProtocolNative$.html "Permalink")  object [GrpcProtocolNative](GrpcProtocolNative$.html "Implementation of the gRPC (application/grpc+proto) protocol:") extends [AbstractGrpcProtocol](AbstractGrpcProtocol.html)Implementation of the gRPC (`application/grpc+proto`) protocol:

Implementation of the gRPC (`application/grpc+proto`) protocol:

Protocol:

	- Data frames are encoded to a stream of Chunk as per the gRPC specification
	- Trailer frames are encoded to LastChunk, to be rendered into the underlying HTTP/2 transport
7. [**](../../../akka/grpc/internal/GrpcProtocolWeb$.html "Permalink")  object [GrpcProtocolWeb](GrpcProtocolWeb$.html "Implementation of the gRPC Web protocol.") extends [GrpcProtocolWebBase](GrpcProtocolWebBase.html)Implementation of the gRPC Web protocol.

Implementation of the gRPC Web protocol.

Protocol:

	- Data frames are encoded to a stream of Chunk as per the gRPC\-web specification.
	- Trailer frames are encoded to a Chunk (containing a marked trailer frame) as per the gRPC\-web specification.
8. [**](../../../akka/grpc/internal/GrpcProtocolWebText$.html "Permalink")  object [GrpcProtocolWebText](GrpcProtocolWebText$.html "The application/grpc-web-text+proto variant of gRPC.") extends [GrpcProtocolWebBase](GrpcProtocolWebBase.html)The `application/grpc-web-text+proto` variant of gRPC.

The `application/grpc-web-text+proto` variant of gRPC.

This is the same as `application/grpc-web+proto`, but with each chunk of the frame encoded gRPC data also base64 encoded.
9. [**](../../../akka/grpc/internal/GrpcRequestHelpers$.html "Permalink")  object [GrpcRequestHelpers](GrpcRequestHelpers$.html)Annotations@InternalApi()
10. [**](../../../akka/grpc/internal/GrpcResponseHelpers$.html "Permalink")  object [GrpcResponseHelpers](GrpcResponseHelpers$.html "Some helpers for creating HTTP entities for use with gRPC.")Some helpers for creating HTTP entities for use with gRPC.

Some helpers for creating HTTP entities for use with gRPC.

INTERNAL API

Annotations@InternalApi()
11. [**](../../../akka/grpc/internal/Gzip$.html "Permalink")  object [Gzip](Gzip$.html) extends [Codec](Codec.html)
12. [**](../../../akka/grpc/internal/Identity$.html "Permalink")  object [Identity](Identity$.html) extends [Codec](Codec.html)
13. [**](../../../akka/grpc/internal/MetadataImpl$.html "Permalink")  object [MetadataImpl](MetadataImpl$.html "INTERNAL API")INTERNAL API

INTERNAL API

Annotations@InternalApi()
14. [**](../../../akka/grpc/internal/NettyClientUtils$.html "Permalink")  object [NettyClientUtils](NettyClientUtils$.html "INTERNAL API")INTERNAL API

INTERNAL API

Annotations@InternalApi()
15. [**](../../../akka/grpc/internal/RequestBuilderImpl$.html "Permalink")  object [RequestBuilderImpl](RequestBuilderImpl$.html)
16. [**](../../../akka/grpc/internal/ServerReflectionImpl$.html "Permalink")  object [ServerReflectionImpl](ServerReflectionImpl$.html "INTERNAL API")INTERNAL API

INTERNAL API

Annotations@InternalApi()
17. [**](../../../akka/grpc/internal/SingleParameterSink$.html "Permalink")  object [SingleParameterSink](SingleParameterSink$.html)
18. [**](../../../akka/grpc/internal/TelemetryExtension$.html "Permalink")  object [TelemetryExtension](TelemetryExtension$.html "INTERNAL API") extends ExtensionId\[TelemetryExtensionImpl] with ExtensionIdProviderINTERNAL API

INTERNAL API

Annotations@InternalStableApi()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcProtocol.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/ServiceDescription.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/AbstractGrpcProtocol$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/AbstractGrpcProtocol.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/AkkaHttpClientUtils$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/BaseMarshaller.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/CancellationBarrierGraphStage.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/ChannelUtils$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/ClientClosedException.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/ClientConnectionException.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/ClientState.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/Codec.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/Codecs$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/EntryMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/GrpcEntityHelpers$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/GrpcMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/GrpcProtocolNative$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/GrpcProtocolWeb$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/GrpcProtocolWebBase.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/GrpcProtocolWebText$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/GrpcRequestHelpers$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/GrpcResponseHelpers$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/Gzip$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/HardcodedServiceDiscovery.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/HeaderMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/HttpMessageMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/Identity$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/InternalChannel.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/JavaBidirectionalStreamingRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/JavaClientStreamingRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/JavaMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/JavaServerStreamingRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/JavaUnaryRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/Marshaller.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/MetadataImpl$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/MetadataImpl.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/MetadataOperations.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/MissingParameterException.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/NettyClientUtils$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/ProtoMarshaller.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/RequestBuilderImpl$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/RichGrpcMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/ScalaBidirectionalStreamingRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/ScalaClientStreamingRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/ScalaServerStreamingRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/ScalaUnaryRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/ServerReflectionImpl$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/ServerReflectionImpl.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/ServiceDescriptionImpl.html

---
*Source: [https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/index.html](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/index.html)*