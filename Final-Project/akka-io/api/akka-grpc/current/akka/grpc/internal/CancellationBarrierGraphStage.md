---
description: Akka gRPC 2.5.10 - akka.grpc.internal.CancellationBarrierGraphStage
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:35:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/CancellationBarrierGraphStage.html
title: Akka gRPC 2.5.10 - akka.grpc.internal.CancellationBarrierGraphStage
---

# Akka gRPC 2.5.10 - akka.grpc.internal.CancellationBarrierGraphStage

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.internal.CancellationBarrierGraphStage

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[grpc](../index.html)
- [AbstractGrpcProtocol](AbstractGrpcProtocol.html)
- [AkkaHttpClientUtils](AkkaHttpClientUtils$.html "INTERNAL API")
- [BaseMarshaller](BaseMarshaller.html "INTERNAL API")
- CancellationBarrierGraphStage
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
c[akka](../../index.html).[grpc](../index.html).[internal](index.html)

# CancellationBarrierGraphStage[**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html "Permalink")

### 

#### class CancellationBarrierGraphStage\[T] extends GraphStage\[FlowShape\[T, T]]

'barrier' that makes sure that, even when downstream is cancelled,
the complete upstream is consumed.

Source[CancellationBarrierGraphStage.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/internal/CancellationBarrierGraphStage.scala#L16)Linear SupertypesGraphStage\[FlowShape\[T, T]], GraphStageWithMaterializedValue\[FlowShape\[T, T], NotUsed], Graph\[FlowShape\[T, T], NotUsed], AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CancellationBarrierGraphStage
2. GraphStage
3. GraphStageWithMaterializedValue
4. Graph
5. AnyRef
6. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#<init>():akka.grpc.internal.CancellationBarrierGraphStage[T] "Permalink")  new CancellationBarrierGraphStage()
### Type Members

1. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#Shape=S@scala.annotation.unchecked.uncheckedVariance "Permalink")  type Shape \= FlowShape\[T, T]Definition ClassesGraph
### Value Members

1. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#addAttributes(attr:akka.stream.Attributes):akka.stream.Graph[S,M] "Permalink")  def addAttributes(attr: Attributes): Graph\[FlowShape\[T, T], NotUsed]Definition ClassesGraph
5. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String, inputBufferSize: Int): Graph\[FlowShape\[T, T], NotUsed]Definition ClassesGraph
7. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#async(dispatcher:String):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String): Graph\[FlowShape\[T, T], NotUsed]Definition ClassesGraph
8. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#async:akka.stream.Graph[S,M] "Permalink")  def async: Graph\[FlowShape\[T, T], NotUsed]Definition ClassesGraph
9. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
10. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#createLogic(inheritedAttributes:akka.stream.Attributes):akka.stream.stage.GraphStageLogic "Permalink")  def createLogic(inheritedAttributes: Attributes): GraphStageLogicDefinition ClassesCancellationBarrierGraphStage → GraphStage
11. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#createLogicAndMaterializedValue(inheritedAttributes:akka.stream.Attributes):(akka.stream.stage.GraphStageLogic,akka.NotUsed) "Permalink") final  def createLogicAndMaterializedValue(inheritedAttributes: Attributes): (GraphStageLogic, NotUsed)Definition ClassesGraphStage → GraphStageWithMaterializedValue
12. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
13. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
14. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#getAttributes:akka.stream.Attributes "Permalink")  def getAttributes: AttributesDefinition ClassesGraph
15. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
16. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
17. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#in:akka.stream.Inlet[T] "Permalink")  val in: Inlet\[T]
18. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#initialAttributes:akka.stream.Attributes "Permalink")  def initialAttributes: AttributesAttributesprotected Definition ClassesGraphStageWithMaterializedValue
19. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
20. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#named(name:String):akka.stream.Graph[S,M] "Permalink")  def named(name: String): Graph\[FlowShape\[T, T], NotUsed]Definition ClassesGraph
21. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
22. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
23. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
24. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#out:akka.stream.Outlet[T] "Permalink")  val out: Outlet\[T]
25. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#shape:akka.stream.FlowShape[T,T] "Permalink")  val shape: FlowShape\[T, T]Definition ClassesCancellationBarrierGraphStage → Graph
26. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#withAttributes(attr:akka.stream.Attributes):akka.stream.Graph[S,M] "Permalink") final  def withAttributes(attr: Attributes): Graph\[FlowShape\[T, T], NotUsed]Definition ClassesGraphStageWithMaterializedValue → Graph
### Deprecated Value Members

1. [**](../../../akka/grpc/internal/CancellationBarrierGraphStage.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from GraphStage\[FlowShape\[T, T]]

### Inherited from GraphStageWithMaterializedValue\[FlowShape\[T, T], NotUsed]

### Inherited from Graph\[FlowShape\[T, T], NotUsed]

### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

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
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/SingleParameterSink$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/TelemetryExtension$.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/CancellationBarrierGraphStage.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/CancellationBarrierGraphStage.html)*