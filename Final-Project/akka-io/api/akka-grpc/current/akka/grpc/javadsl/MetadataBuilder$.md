---
description: Akka gRPC 2.5.10 - akka.grpc.javadsl.MetadataBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:35:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/MetadataBuilder$.html
title: Akka gRPC 2.5.10 - akka.grpc.javadsl.MetadataBuilder
---

# Akka gRPC 2.5.10 - akka.grpc.javadsl.MetadataBuilder

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.javadsl.MetadataBuilder

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
[o](MetadataBuilder.html "See companion class")[akka](../../index.html).[grpc](../index.html).[javadsl](index.html)

# [MetadataBuilder](MetadataBuilder.html "See companion class")[**](../../../akka/grpc/javadsl/MetadataBuilder$.html "Permalink")

### Companion [class MetadataBuilder](MetadataBuilder.html "See companion class")

#### object MetadataBuilder

Annotations@ApiMayChange() Source[MetadataBuilder.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/javadsl/MetadataBuilder.scala#L56)Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MetadataBuilder
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#empty:akka.grpc.javadsl.Metadata "Permalink")  val empty: [Metadata](Metadata.html)returnsAn empty metadata instance.
7. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
8. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
9. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#fromHeaders(headers:Iterable[akka.http.javadsl.model.HttpHeader]):akka.grpc.javadsl.Metadata "Permalink")  def fromHeaders(headers: [Iterable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[HttpHeader]): [Metadata](Metadata.html)Constructs a Metadata instance from a collection of HTTP headers.

Constructs a Metadata instance from a collection of HTTP headers.

headersThe headers.

returnsThe metadata instance.
10. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#fromHttpMessage(message:akka.http.javadsl.model.HttpMessage):akka.grpc.javadsl.Metadata "Permalink")  def fromHttpMessage(message: HttpMessage): [Metadata](Metadata.html)Constructs a Metadata instance from an HTTP message.

Constructs a Metadata instance from an HTTP message.

messageThe HTTP message.

returnsThe metadata instance.
11. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
14. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
15. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
16. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
17. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/grpc/javadsl/MetadataBuilder$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

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
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/MetadataBuilder$.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/MetadataBuilder$.html)*