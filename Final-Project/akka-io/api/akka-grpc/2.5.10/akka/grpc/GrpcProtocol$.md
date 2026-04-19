---
description: Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$.html
title: Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol
---

# Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/grpc/index.html "Permalink")  package [grpc](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/grpc/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[grpc](index.html)
- [**](../../akka/grpc/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[grpc](index.html)
- [**](../../akka/grpc/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[grpc](index.html)
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
[o](GrpcProtocol.html "See companion trait")[akka](../index.html).[grpc](index.html)

# [GrpcProtocol](GrpcProtocol.html "See companion trait")[**](../../akka/grpc/GrpcProtocol$.html "Permalink")

### Companion [trait GrpcProtocol](GrpcProtocol.html "See companion trait")

#### object GrpcProtocol

INTERNAL API

Core definitions for gRPC protocols.

Annotations@InternalApi() Source[GrpcProtocol.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/GrpcProtocol.scala#L67)Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcProtocol
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html "Permalink")  case class [DataFrame](GrpcProtocol$$DataFrame.html "A data (or message) frame in a gRPC protocol stream.")(data: ByteString) extends [Frame](GrpcProtocol$$Frame.html) with Product with SerializableA data (or message) frame in a gRPC protocol stream.
2. [**](../../akka/grpc/GrpcProtocol$$Frame.html "Permalink") sealed  trait [Frame](GrpcProtocol$$Frame.html "A frame in a logical gRPC protocol stream") extends AnyRefA frame in a logical gRPC protocol stream
3. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html "Permalink")  case class [GrpcProtocolReader](GrpcProtocol$$GrpcProtocolReader.html "Implements the decoding of the gRPC framing from a physical/transport layer.")(messageEncoding: [Codec](internal/Codec.html), decodeSingleFrame: (ByteString) \=\> ByteString, frameDecoder: Flow\[ByteString, [Frame](GrpcProtocol$$Frame.html), NotUsed]) extends Product with SerializableImplements the decoding of the gRPC framing from a physical/transport layer.
4. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolWriter.html "Permalink")  case class [GrpcProtocolWriter](GrpcProtocol$$GrpcProtocolWriter.html "Implements the encoding of a stream of gRPC Frames into a physical/transport layer.")(contentType: ContentType, messageEncoding: [Codec](internal/Codec.html), encodeFrame: ([Frame](GrpcProtocol$$Frame.html)) \=\> ChunkStreamPart, encodeDataToResponse: (ByteString, Seq\[HttpHeader], Trailer) \=\> HttpResponse, frameEncoder: Flow\[[Frame](GrpcProtocol$$Frame.html), ChunkStreamPart, NotUsed]) extends Product with SerializableImplements the encoding of a stream of gRPC Frames into a physical/transport layer.

Implements the encoding of a stream of gRPC Frames into a physical/transport layer.

This maps the logical gRPC frames into a stream of chunks that can be handled by the HTTP/2 or HTTP/1\.1 transport layer.
5. [**](../../akka/grpc/GrpcProtocol$$TrailerFrame.html "Permalink")  case class [TrailerFrame](GrpcProtocol$$TrailerFrame.html "A trailer (status headers) frame in a gRPC protocol stream")(trailers: List\[HttpHeader]) extends [Frame](GrpcProtocol$$Frame.html) with Product with SerializableA trailer (status headers) frame in a gRPC protocol stream
### Value Members

1. [**](../../akka/grpc/GrpcProtocol$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../akka/grpc/GrpcProtocol$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../akka/grpc/GrpcProtocol$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../akka/grpc/GrpcProtocol$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/grpc/GrpcProtocol$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/grpc/GrpcProtocol$.html#detect(mediaType:akka.http.javadsl.model.MediaType):Option[akka.grpc.GrpcProtocol] "Permalink")  def detect(mediaType: MediaType): Option\[[GrpcProtocol](GrpcProtocol.html)]Detects which gRPC protocol variant is indicated by a mediatype.

Detects which gRPC protocol variant is indicated by a mediatype.

returnsa [GrpcProtocol](GrpcProtocol.html) matching the request mediatype if known.
7. [**](../../akka/grpc/GrpcProtocol$.html#detect(request:akka.http.javadsl.model.HttpRequest):Option[akka.grpc.GrpcProtocol] "Permalink")  def detect(request: HttpRequest): Option\[[GrpcProtocol](GrpcProtocol.html)]Detects which gRPC protocol variant is indicated in a request.

Detects which gRPC protocol variant is indicated in a request.

returnsa [GrpcProtocol](GrpcProtocol.html) matching the request mediatype if specified and known.
8. [**](../../akka/grpc/GrpcProtocol$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
9. [**](../../akka/grpc/GrpcProtocol$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
10. [**](../../akka/grpc/GrpcProtocol$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../akka/grpc/GrpcProtocol$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../akka/grpc/GrpcProtocol$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
13. [**](../../akka/grpc/GrpcProtocol$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
14. [**](../../akka/grpc/GrpcProtocol$.html#negotiate(request:akka.http.javadsl.model.HttpRequest):Option[(scala.util.Try[akka.grpc.GrpcProtocol.GrpcProtocolReader],akka.grpc.GrpcProtocol.GrpcProtocolWriter)] "Permalink")  def negotiate(request: HttpRequest): Option\[(Try\[[GrpcProtocolReader](GrpcProtocol$$GrpcProtocolReader.html)], [GrpcProtocolWriter](GrpcProtocol$$GrpcProtocolWriter.html))]Calculates the gRPC protocol encoding to use for an interaction with a gRPC client.

Calculates the gRPC protocol encoding to use for an interaction with a gRPC client.

requestthe client request to respond to.

returnsthe protocol reader for the request, and a protocol writer for the response.
15. [**](../../akka/grpc/GrpcProtocol$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
16. [**](../../akka/grpc/GrpcProtocol$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
17. [**](../../akka/grpc/GrpcProtocol$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../akka/grpc/GrpcProtocol$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../akka/grpc/GrpcProtocol$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../akka/grpc/GrpcProtocol$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../akka/grpc/GrpcProtocol$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/grpc/GrpcProtocol$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/AkkaGrpcGenerated.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcChannel$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcChannel.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcClientCloseException.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcProtocol$$DataFrame.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcProtocol$$Frame.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcProtocol$$GrpcProtocolReader.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcProtocol$$GrpcProtocolWriter.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcProtocol$$TrailerFrame.html
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
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/Codec.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcProtocol$.html](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcProtocol$.html)*