---
description: Akka gRPC 2.5.10 - akka.grpc.internal.ScalaClientStreamingRequestBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:36:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ScalaClientStreamingRequestBuilder.html
title: Akka gRPC 2.5.10 - akka.grpc.internal.ScalaClientStreamingRequestBuilder
---

# Akka gRPC 2.5.10 - akka.grpc.internal.ScalaClientStreamingRequestBuilder

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.internal.ScalaClientStreamingRequestBuilder

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[grpc](../index.html)
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
- ScalaClientStreamingRequestBuilder
- [ScalaServerStreamingRequestBuilder](ScalaServerStreamingRequestBuilder.html "INTERNAL API")
- [ScalaUnaryRequestBuilder](ScalaUnaryRequestBuilder.html "INTERNAL API")
- [ServerReflectionImpl](ServerReflectionImpl.html "INTERNAL API")
- [ServiceDescriptionImpl](ServiceDescriptionImpl.html "INTERNAL API")
- [SingleParameterSink](SingleParameterSink$.html)
- [TelemetryExtension](TelemetryExtension$.html "INTERNAL API")
- [TelemetrySpi](TelemetrySpi.html)
- [WithProtobufSerializer](WithProtobufSerializer.html)
c[akka](../../index.html).[grpc](../index.html).[internal](index.html)

# ScalaClientStreamingRequestBuilder[**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html "Permalink")

### 

#### final  class ScalaClientStreamingRequestBuilder\[I, O] extends [SingleResponseRequestBuilder](../scaladsl/SingleResponseRequestBuilder.html)\[Source\[I, NotUsed], O] with [MetadataOperations](MetadataOperations.html)\[ScalaClientStreamingRequestBuilder\[I, O]]

INTERNAL API

Annotations@InternalApi() Source[RequestBuilderImpl.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/internal/RequestBuilderImpl.scala#L170)Linear Supertypes[MetadataOperations](MetadataOperations.html)\[ScalaClientStreamingRequestBuilder\[I, O]], [SingleResponseRequestBuilder](../scaladsl/SingleResponseRequestBuilder.html)\[Source\[I, NotUsed], O], AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ScalaClientStreamingRequestBuilder
2. MetadataOperations
3. SingleResponseRequestBuilder
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#<init>(descriptor:io.grpc.MethodDescriptor[I,O],channel:akka.grpc.internal.InternalChannel,defaultOptions:io.grpc.CallOptions,settings:akka.grpc.GrpcClientSettings)(implicitmat:akka.stream.Materializer,implicitec:scala.concurrent.ExecutionContext):akka.grpc.internal.ScalaClientStreamingRequestBuilder[I,O] "Permalink")  new ScalaClientStreamingRequestBuilder(descriptor: MethodDescriptor\[I, O], channel: [InternalChannel](InternalChannel.html), defaultOptions: CallOptions, settings: [GrpcClientSettings](../GrpcClientSettings.html))(implicit mat: Materializer, ec: ExecutionContext)Annotations@InternalStableApi()
2. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#<init>(descriptor:io.grpc.MethodDescriptor[I,O],channel:akka.grpc.internal.InternalChannel,defaultOptions:io.grpc.CallOptions,settings:akka.grpc.GrpcClientSettings,headers:akka.grpc.internal.MetadataImpl)(implicitmat:akka.stream.Materializer,implicitec:scala.concurrent.ExecutionContext):akka.grpc.internal.ScalaClientStreamingRequestBuilder[I,O] "Permalink")  new ScalaClientStreamingRequestBuilder(descriptor: MethodDescriptor\[I, O], channel: [InternalChannel](InternalChannel.html), defaultOptions: CallOptions, settings: [GrpcClientSettings](../GrpcClientSettings.html), headers: [MetadataImpl](MetadataImpl.html))(implicit mat: Materializer, ec: ExecutionContext)
3. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#<init>(descriptor:io.grpc.MethodDescriptor[I,O],channel:akka.grpc.internal.InternalChannel,defaultOptions:io.grpc.CallOptions,settings:akka.grpc.GrpcClientSettings,headers:akka.grpc.internal.MetadataImpl,retrySettings:Option[akka.pattern.RetrySettings])(implicitmat:akka.stream.Materializer,implicitec:scala.concurrent.ExecutionContext):akka.grpc.internal.ScalaClientStreamingRequestBuilder[I,O] "Permalink")  new ScalaClientStreamingRequestBuilder(descriptor: MethodDescriptor\[I, O], channel: [InternalChannel](InternalChannel.html), defaultOptions: CallOptions, settings: [GrpcClientSettings](../GrpcClientSettings.html), headers: [MetadataImpl](MetadataImpl.html), retrySettings: Option\[RetrySettings])(implicit mat: Materializer, ec: ExecutionContext)
4. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#<init>(descriptor:io.grpc.MethodDescriptor[I,O],fqMethodName:String,channel:akka.grpc.internal.InternalChannel,defaultOptions:io.grpc.CallOptions,settings:akka.grpc.GrpcClientSettings)(implicitmat:akka.stream.Materializer,implicitec:scala.concurrent.ExecutionContext):akka.grpc.internal.ScalaClientStreamingRequestBuilder[I,O] "Permalink")  new ScalaClientStreamingRequestBuilder(descriptor: MethodDescriptor\[I, O], fqMethodName: String, channel: [InternalChannel](InternalChannel.html), defaultOptions: CallOptions, settings: [GrpcClientSettings](../GrpcClientSettings.html))(implicit mat: Materializer, ec: ExecutionContext)Annotations@deprecated @InternalStableApi() Deprecated*(Since version 1\.1\.0\)* fqMethodName was removed since it can be derived from the descriptor
### Value Members

1. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#addHeader(key:String,value:akka.util.ByteString):T "Permalink")  def addHeader(key: String, value: ByteString): ScalaClientStreamingRequestBuilder\[I, O]Definition Classes[MetadataOperations](MetadataOperations.html)
5. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#addHeader(key:String,value:String):T "Permalink")  def addHeader(key: String, value: String): ScalaClientStreamingRequestBuilder\[I, O]Definition Classes[MetadataOperations](MetadataOperations.html)
6. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
8. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
9. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
10. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#headers:akka.grpc.internal.MetadataImpl "Permalink")  val headers: [MetadataImpl](MetadataImpl.html)Definition ClassesScalaClientStreamingRequestBuilder → [MetadataOperations](MetadataOperations.html)
13. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#invoke(request:akka.stream.scaladsl.Source[I,akka.NotUsed]):scala.concurrent.Future[O] "Permalink")  def invoke(request: Source\[I, NotUsed]): Future\[O]Invoke the gRPC method with the additional metadata added

Invoke the gRPC method with the additional metadata added

Definition ClassesScalaClientStreamingRequestBuilder → [SingleResponseRequestBuilder](../scaladsl/SingleResponseRequestBuilder.html)
14. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#invokeWithMetadata(source:akka.stream.scaladsl.Source[I,akka.NotUsed]):scala.concurrent.Future[akka.grpc.GrpcSingleResponse[O]] "Permalink")  def invokeWithMetadata(source: Source\[I, NotUsed]): Future\[[GrpcSingleResponse](../GrpcSingleResponse.html)\[O]]Invoke the gRPC method with the additional metadata added and provide access to response metadata

Invoke the gRPC method with the additional metadata added and provide access to response metadata

Definition ClassesScalaClientStreamingRequestBuilder → [SingleResponseRequestBuilder](../scaladsl/SingleResponseRequestBuilder.html)
15. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
16. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
17. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
18. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
19. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#setDeadline(deadline:scala.concurrent.duration.Duration):akka.grpc.internal.ScalaClientStreamingRequestBuilder[I,O] "Permalink")  def setDeadline(deadline: Duration): ScalaClientStreamingRequestBuilder\[I, O]Set the deadline for this call

Set the deadline for this call

returnsA new request builder, that will use the supplied deadline when invoked

Definition ClassesScalaClientStreamingRequestBuilder → [SingleResponseRequestBuilder](../scaladsl/SingleResponseRequestBuilder.html)
20. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#withHeaders(headers:akka.grpc.internal.MetadataImpl):akka.grpc.internal.ScalaClientStreamingRequestBuilder[I,O] "Permalink")  def withHeaders(headers: [MetadataImpl](MetadataImpl.html)): ScalaClientStreamingRequestBuilder\[I, O]Definition ClassesScalaClientStreamingRequestBuilder → [MetadataOperations](MetadataOperations.html)
26. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#withRetry(maxRetries:Int):akka.grpc.scaladsl.SingleResponseRequestBuilder[akka.stream.scaladsl.Source[I,akka.NotUsed],O] "Permalink")  def withRetry(maxRetries: Int): [SingleResponseRequestBuilder](../scaladsl/SingleResponseRequestBuilder.html)\[Source\[I, NotUsed], O]Set the retry settings for this call.

Set the retry settings for this call. A predifined backoff strategy will be calculated based on the number of maxRetries.

maxRetriesThe number of retries to make

Definition ClassesScalaClientStreamingRequestBuilder → [SingleResponseRequestBuilder](../scaladsl/SingleResponseRequestBuilder.html)
27. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#withRetry(retrySettings:akka.pattern.RetrySettings):akka.grpc.scaladsl.SingleResponseRequestBuilder[akka.stream.scaladsl.Source[I,akka.NotUsed],O] "Permalink")  def withRetry(retrySettings: RetrySettings): [SingleResponseRequestBuilder](../scaladsl/SingleResponseRequestBuilder.html)\[Source\[I, NotUsed], O]Use these retry settings to retry if the call fails.

Use these retry settings to retry if the call fails.

Definition ClassesScalaClientStreamingRequestBuilder → [SingleResponseRequestBuilder](../scaladsl/SingleResponseRequestBuilder.html)
### Deprecated Value Members

1. [**](../../../akka/grpc/internal/ScalaClientStreamingRequestBuilder.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [MetadataOperations](MetadataOperations.html)\[ScalaClientStreamingRequestBuilder\[I, O]]

### Inherited from [SingleResponseRequestBuilder](../scaladsl/SingleResponseRequestBuilder.html)\[Source\[I, NotUsed], O]

### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientSettings.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcSingleResponse.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AbstractGrpcProtocol$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AbstractGrpcProtocol.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AkkaHttpClientUtils$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/BaseMarshaller.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/CancellationBarrierGraphStage.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ChannelUtils$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ClientClosedException.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ClientConnectionException.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ClientState.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/Codec.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/Codecs$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/EntryMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/GrpcEntityHelpers$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/GrpcMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/GrpcProtocolNative$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/GrpcProtocolWeb$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/GrpcProtocolWebBase.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/GrpcProtocolWebText$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/GrpcRequestHelpers$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/GrpcResponseHelpers$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/Gzip$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/HardcodedServiceDiscovery.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/HeaderMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/HttpMessageMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/Identity$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/InternalChannel.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/JavaBidirectionalStreamingRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/JavaClientStreamingRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/JavaMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/JavaServerStreamingRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/JavaUnaryRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/Marshaller.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/MetadataImpl$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/MetadataImpl.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/MetadataOperations.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/MissingParameterException.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/NettyClientUtils$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ProtoMarshaller.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/RequestBuilderImpl$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/RichGrpcMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ScalaBidirectionalStreamingRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ScalaClientStreamingRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ScalaServerStreamingRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ScalaUnaryRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ServerReflectionImpl$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ServerReflectionImpl.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ServiceDescriptionImpl.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ScalaClientStreamingRequestBuilder.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ScalaClientStreamingRequestBuilder.html)*