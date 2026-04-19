---
description: Akka gRPC 2.5.10 - akka.grpc.scaladsl.GrpcMarshalling
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:36:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/GrpcMarshalling$.html
title: Akka gRPC 2.5.10 - akka.grpc.scaladsl.GrpcMarshalling
---

# Akka gRPC 2.5.10 - akka.grpc.scaladsl.GrpcMarshalling

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.scaladsl.GrpcMarshalling

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[grpc](../index.html)
- [**](../../../akka/grpc/scaladsl/headers/index.html "Permalink")  package [headers](headers/index.html)Definition Classes[scaladsl](index.html)
- [AkkaGrpcClient](AkkaGrpcClient.html "Common trait of all generated Akka gRPC clients.")
- [BytesEntry](BytesEntry.html "Represents a binary metadata entry.")
- [GrpcExceptionHandler](GrpcExceptionHandler$.html)
- GrpcMarshalling
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
o[akka](../../index.html).[grpc](../index.html).[scaladsl](index.html)

# GrpcMarshalling[**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html "Permalink")

### 

#### object GrpcMarshalling

Source[GrpcMarshalling.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/scaladsl/GrpcMarshalling.scala#L24)Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcMarshalling
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
11. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#marshal[T](e:T,eHandler:akka.actor.ActorSystem=>PartialFunction[Throwable,akka.grpc.Trailers])(implicitm:akka.grpc.ProtobufSerializer[T],implicitwriter:akka.grpc.GrpcProtocol.GrpcProtocolWriter,implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpResponse "Permalink")  def marshal\[T](e: T \= [Identity](../../index.html), eHandler: (ActorSystem) \=\> PartialFunction\[Throwable, [Trailers](../Trailers.html)] \= [GrpcExceptionHandler.defaultMapper](GrpcExceptionHandler$.html))(implicit m: [ProtobufSerializer](../ProtobufSerializer.html)\[T], writer: [GrpcProtocolWriter](../GrpcProtocol$$GrpcProtocolWriter.html), system: ClassicActorSystemProvider): HttpResponse
12. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#marshalRequest[T](uri:akka.http.scaladsl.model.Uri,e:T,eHandler:akka.actor.ActorSystem=>PartialFunction[Throwable,akka.grpc.Trailers])(implicitm:akka.grpc.ProtobufSerializer[T],implicitwriter:akka.grpc.GrpcProtocol.GrpcProtocolWriter,implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpRequest "Permalink")  def marshalRequest\[T](uri: Uri, e: T, eHandler: (ActorSystem) \=\> PartialFunction\[Throwable, [Trailers](../Trailers.html)] \= [GrpcExceptionHandler.defaultMapper](GrpcExceptionHandler$.html))(implicit m: [ProtobufSerializer](../ProtobufSerializer.html)\[T], writer: [GrpcProtocolWriter](../GrpcProtocol$$GrpcProtocolWriter.html), system: ClassicActorSystemProvider): HttpRequestAnnotations@InternalApi()
13. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#marshalStream[T](e:akka.stream.scaladsl.Source[T,akka.NotUsed],eHandler:akka.actor.ActorSystem=>PartialFunction[Throwable,akka.grpc.Trailers])(implicitm:akka.grpc.ProtobufSerializer[T],implicitwriter:akka.grpc.GrpcProtocol.GrpcProtocolWriter,implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpResponse "Permalink")  def marshalStream\[T](e: Source\[T, NotUsed], eHandler: (ActorSystem) \=\> PartialFunction\[Throwable, [Trailers](../Trailers.html)] \= [GrpcExceptionHandler.defaultMapper](GrpcExceptionHandler$.html))(implicit m: [ProtobufSerializer](../ProtobufSerializer.html)\[T], writer: [GrpcProtocolWriter](../GrpcProtocol$$GrpcProtocolWriter.html), system: ClassicActorSystemProvider): HttpResponse
14. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#marshalStreamRequest[T](uri:akka.http.scaladsl.model.Uri,e:akka.stream.scaladsl.Source[T,akka.NotUsed],eHandler:akka.actor.ActorSystem=>PartialFunction[Throwable,akka.grpc.Trailers])(implicitm:akka.grpc.ProtobufSerializer[T],implicitwriter:akka.grpc.GrpcProtocol.GrpcProtocolWriter,implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpRequest "Permalink")  def marshalStreamRequest\[T](uri: Uri, e: Source\[T, NotUsed], eHandler: (ActorSystem) \=\> PartialFunction\[Throwable, [Trailers](../Trailers.html)] \= [GrpcExceptionHandler.defaultMapper](GrpcExceptionHandler$.html))(implicit m: [ProtobufSerializer](../ProtobufSerializer.html)\[T], writer: [GrpcProtocolWriter](../GrpcProtocol$$GrpcProtocolWriter.html), system: ClassicActorSystemProvider): HttpRequestAnnotations@InternalApi()
15. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
16. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#negotiated[T](req:akka.http.scaladsl.model.HttpRequest,f:(akka.grpc.GrpcProtocol.GrpcProtocolReader,akka.grpc.GrpcProtocol.GrpcProtocolWriter)=>scala.concurrent.Future[T]):Option[scala.concurrent.Future[T]] "Permalink")  def negotiated\[T](req: HttpRequest, f: ([GrpcProtocolReader](../GrpcProtocol$$GrpcProtocolReader.html), [GrpcProtocolWriter](../GrpcProtocol$$GrpcProtocolWriter.html)) \=\> Future\[T]): Option\[Future\[T]]
17. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
18. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
19. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#unmarshal[T](entity:akka.http.scaladsl.model.HttpEntity)(implicitu:akka.grpc.ProtobufSerializer[T],implicitmat:akka.stream.Materializer,implicitreader:akka.grpc.GrpcProtocol.GrpcProtocolReader):scala.concurrent.Future[T] "Permalink")  def unmarshal\[T](entity: HttpEntity)(implicit u: [ProtobufSerializer](../ProtobufSerializer.html)\[T], mat: Materializer, reader: [GrpcProtocolReader](../GrpcProtocol$$GrpcProtocolReader.html)): Future\[T]
22. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#unmarshal[T](data:akka.stream.scaladsl.Source[akka.util.ByteString,Any])(implicitu:akka.grpc.ProtobufSerializer[T],implicitmat:akka.stream.Materializer,implicitreader:akka.grpc.GrpcProtocol.GrpcProtocolReader):scala.concurrent.Future[T] "Permalink")  def unmarshal\[T](data: Source\[ByteString, Any])(implicit u: [ProtobufSerializer](../ProtobufSerializer.html)\[T], mat: Materializer, reader: [GrpcProtocolReader](../GrpcProtocol$$GrpcProtocolReader.html)): Future\[T]
23. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#unmarshal[T](req:akka.http.scaladsl.model.HttpRequest)(implicitu:akka.grpc.ProtobufSerializer[T],implicitmat:akka.stream.Materializer):scala.concurrent.Future[T] "Permalink")  def unmarshal\[T](req: HttpRequest)(implicit u: [ProtobufSerializer](../ProtobufSerializer.html)\[T], mat: Materializer): Future\[T]
24. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#unmarshalStream[T](entity:akka.http.scaladsl.model.HttpEntity)(implicitu:akka.grpc.ProtobufSerializer[T],implicitmat:akka.stream.Materializer,implicitreader:akka.grpc.GrpcProtocol.GrpcProtocolReader):scala.concurrent.Future[akka.stream.scaladsl.Source[T,akka.NotUsed]] "Permalink")  def unmarshalStream\[T](entity: HttpEntity)(implicit u: [ProtobufSerializer](../ProtobufSerializer.html)\[T], mat: Materializer, reader: [GrpcProtocolReader](../GrpcProtocol$$GrpcProtocolReader.html)): Future\[Source\[T, NotUsed]]
25. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#unmarshalStream[T](data:akka.stream.scaladsl.Source[akka.util.ByteString,Any])(implicitu:akka.grpc.ProtobufSerializer[T],implicitmat:akka.stream.Materializer,implicitreader:akka.grpc.GrpcProtocol.GrpcProtocolReader):scala.concurrent.Future[akka.stream.scaladsl.Source[T,akka.NotUsed]] "Permalink")  def unmarshalStream\[T](data: Source\[ByteString, Any])(implicit u: [ProtobufSerializer](../ProtobufSerializer.html)\[T], mat: Materializer, reader: [GrpcProtocolReader](../GrpcProtocol$$GrpcProtocolReader.html)): Future\[Source\[T, NotUsed]]
26. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#unmarshalStream[T](req:akka.http.scaladsl.model.HttpRequest)(implicitu:akka.grpc.ProtobufSerializer[T],implicitmat:akka.stream.Materializer):scala.concurrent.Future[akka.stream.scaladsl.Source[T,akka.NotUsed]] "Permalink")  def unmarshalStream\[T](req: HttpRequest)(implicit u: [ProtobufSerializer](../ProtobufSerializer.html)\[T], mat: Materializer): Future\[Source\[T, NotUsed]]
27. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/grpc/scaladsl/GrpcMarshalling$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$GrpcProtocolReader.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$GrpcProtocolWriter.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/ProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/Trailers.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/AkkaGrpcClient.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/BytesEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/GrpcExceptionHandler$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/GrpcMarshalling$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/InstancePerRequestFactory.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/Metadata.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/MetadataBuilder$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/MetadataBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/MetadataEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/MetadataStatus.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/ScalapbProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/ServerReflection$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/ServiceHandler$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/SingleResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/StreamResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/StringEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/WebHandler$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/GrpcMarshalling$.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/GrpcMarshalling$.html)*