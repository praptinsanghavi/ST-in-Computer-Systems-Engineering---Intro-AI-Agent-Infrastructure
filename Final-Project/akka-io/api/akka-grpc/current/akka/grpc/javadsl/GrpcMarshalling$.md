---
description: Akka gRPC 2.5.10 - akka.grpc.javadsl.GrpcMarshalling
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:35:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/GrpcMarshalling$.html
title: Akka gRPC 2.5.10 - akka.grpc.javadsl.GrpcMarshalling
---

# Akka gRPC 2.5.10 - akka.grpc.javadsl.GrpcMarshalling

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.javadsl.GrpcMarshalling

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[grpc](../index.html)
- [AkkaGrpcClient](AkkaGrpcClient.html "Common trait of all generated Akka gRPC clients.")
- [BytesEntry](BytesEntry.html "Represents a binary metadata entry.")
- [GoogleProtobufSerializer](GoogleProtobufSerializer.html)
- [GrpcExceptionHandler](GrpcExceptionHandler$.html)
- GrpcMarshalling
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
o[akka](../../index.html).[grpc](../index.html).[javadsl](index.html)

# GrpcMarshalling[**](../../../akka/grpc/javadsl/GrpcMarshalling$.html "Permalink")

### 

#### object GrpcMarshalling

Source[GrpcMarshalling.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/javadsl/GrpcMarshalling.scala#L23)Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
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

1. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
11. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#marshal[T](e:T,m:akka.grpc.ProtobufSerializer[T],writer:akka.grpc.GrpcProtocol.GrpcProtocolWriter,system:akka.actor.ClassicActorSystemProvider,eHandler:akka.japi.Function[akka.actor.ActorSystem,akka.japi.Function[Throwable,akka.grpc.Trailers]]):akka.http.javadsl.model.HttpResponse "Permalink")  def marshal\[T](e: T, m: [ProtobufSerializer](../ProtobufSerializer.html)\[T], writer: [GrpcProtocolWriter](../GrpcProtocol$$GrpcProtocolWriter.html), system: ClassicActorSystemProvider, eHandler: Function\[ActorSystem, Function\[Throwable, [Trailers](../Trailers.html)]] \= [GrpcExceptionHandler.defaultMapper](GrpcExceptionHandler$.html)): HttpResponse
12. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#marshalStream[T](e:akka.stream.javadsl.Source[T,akka.NotUsed],m:akka.grpc.ProtobufSerializer[T],writer:akka.grpc.GrpcProtocol.GrpcProtocolWriter,system:akka.actor.ClassicActorSystemProvider,eHandler:akka.japi.Function[akka.actor.ActorSystem,akka.japi.Function[Throwable,akka.grpc.Trailers]]):akka.http.javadsl.model.HttpResponse "Permalink")  def marshalStream\[T](e: Source\[T, NotUsed], m: [ProtobufSerializer](../ProtobufSerializer.html)\[T], writer: [GrpcProtocolWriter](../GrpcProtocol$$GrpcProtocolWriter.html), system: ClassicActorSystemProvider, eHandler: Function\[ActorSystem, Function\[Throwable, [Trailers](../Trailers.html)]] \= [GrpcExceptionHandler.defaultMapper](GrpcExceptionHandler$.html)): HttpResponse
13. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
14. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#negotiated[T](req:akka.http.javadsl.model.HttpRequest,f:(akka.grpc.GrpcProtocol.GrpcProtocolReader,akka.grpc.GrpcProtocol.GrpcProtocolWriter)=>java.util.concurrent.CompletionStage[T]):java.util.Optional[java.util.concurrent.CompletionStage[T]] "Permalink")  def negotiated\[T](req: HttpRequest, f: ([GrpcProtocolReader](../GrpcProtocol$$GrpcProtocolReader.html), [GrpcProtocolWriter](../GrpcProtocol$$GrpcProtocolWriter.html)) \=\> [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]): [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]]
15. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
16. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
17. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#unmarshal[T](entity:akka.http.javadsl.model.HttpEntity,u:akka.grpc.ProtobufSerializer[T],mat:akka.stream.Materializer,reader:akka.grpc.GrpcProtocol.GrpcProtocolReader):java.util.concurrent.CompletionStage[T] "Permalink")  def unmarshal\[T](entity: HttpEntity, u: [ProtobufSerializer](../ProtobufSerializer.html)\[T], mat: Materializer, reader: [GrpcProtocolReader](../GrpcProtocol$$GrpcProtocolReader.html)): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]
20. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#unmarshal[T](data:akka.stream.javadsl.Source[akka.util.ByteString,AnyRef],u:akka.grpc.ProtobufSerializer[T],mat:akka.stream.Materializer,reader:akka.grpc.GrpcProtocol.GrpcProtocolReader):java.util.concurrent.CompletionStage[T] "Permalink")  def unmarshal\[T](data: Source\[ByteString, AnyRef], u: [ProtobufSerializer](../ProtobufSerializer.html)\[T], mat: Materializer, reader: [GrpcProtocolReader](../GrpcProtocol$$GrpcProtocolReader.html)): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]
21. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#unmarshalStream[T](entity:akka.http.javadsl.model.HttpEntity,u:akka.grpc.ProtobufSerializer[T],mat:akka.stream.Materializer,reader:akka.grpc.GrpcProtocol.GrpcProtocolReader):java.util.concurrent.CompletionStage[akka.stream.javadsl.Source[T,akka.NotUsed]] "Permalink")  def unmarshalStream\[T](entity: HttpEntity, u: [ProtobufSerializer](../ProtobufSerializer.html)\[T], mat: Materializer, reader: [GrpcProtocolReader](../GrpcProtocol$$GrpcProtocolReader.html)): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Source\[T, NotUsed]]
22. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#unmarshalStream[T](data:akka.stream.javadsl.Source[akka.util.ByteString,AnyRef],u:akka.grpc.ProtobufSerializer[T],mat:akka.stream.Materializer,reader:akka.grpc.GrpcProtocol.GrpcProtocolReader):java.util.concurrent.CompletionStage[akka.stream.javadsl.Source[T,akka.NotUsed]] "Permalink")  def unmarshalStream\[T](data: Source\[ByteString, AnyRef], u: [ProtobufSerializer](../ProtobufSerializer.html)\[T], mat: Materializer, reader: [GrpcProtocolReader](../GrpcProtocol$$GrpcProtocolReader.html)): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Source\[T, NotUsed]]
23. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/grpc/javadsl/GrpcMarshalling$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$GrpcProtocolReader.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$GrpcProtocolWriter.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/ProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/Trailers.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/AkkaGrpcClient.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/BytesEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/GoogleProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/GrpcExceptionHandler$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/GrpcMarshalling$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/Metadata.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/MetadataBuilder$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/MetadataBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/MetadataEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/MetadataStatus.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/ServerReflection$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/ServiceHandler$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/SingleResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/StreamResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/StringEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/WebHandler$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/GrpcMarshalling$.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/GrpcMarshalling$.html)*