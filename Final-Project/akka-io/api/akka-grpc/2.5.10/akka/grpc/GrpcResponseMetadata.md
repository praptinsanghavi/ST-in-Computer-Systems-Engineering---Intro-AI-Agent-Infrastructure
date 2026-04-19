---
description: Akka gRPC 2.5.10 - akka.grpc.GrpcResponseMetadata
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcResponseMetadata.html
title: Akka gRPC 2.5.10 - akka.grpc.GrpcResponseMetadata
---

# Akka gRPC 2.5.10 - akka.grpc.GrpcResponseMetadata

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.GrpcResponseMetadata

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
- GrpcResponseMetadata
- [GrpcServiceException](GrpcServiceException.html)
- [GrpcSingleResponse](GrpcSingleResponse.html "Represents the metadata related to a gRPC call with a single response value")
- [ProtobufSerializer](ProtobufSerializer.html)
- [SSLContextUtils](SSLContextUtils$.html)
- [ServiceDescription](ServiceDescription.html)
- [Trailers](Trailers.html)
t[akka](../index.html).[grpc](index.html)

# GrpcResponseMetadata[**](../../akka/grpc/GrpcResponseMetadata.html "Permalink")

### 

#### trait GrpcResponseMetadata extends AnyRef

Represents the metadata related to a gRPC call with a streaming response

Not for user extension

Annotations@DoNotInherit() @ApiMayChange() Source[GrpcClientResponse.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/GrpcClientResponse.scala#L20)Linear SupertypesAnyRef, AnyKnown Subclasses[GrpcSingleResponse](GrpcSingleResponse.html)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcResponseMetadata
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../akka/grpc/GrpcResponseMetadata.html#getHeaders():akka.grpc.javadsl.Metadata "Permalink") abstract  def getHeaders(): [Metadata](javadsl/Metadata.html)Java API: The response metadata, the metadata is only for reading and must not be mutated.
2. [**](../../akka/grpc/GrpcResponseMetadata.html#getTrailers():java.util.concurrent.CompletionStage[akka.grpc.javadsl.Metadata] "Permalink") abstract  def getTrailers(): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Metadata](javadsl/Metadata.html)]Java API: Trailers from the server, is completed after the response stream completes
3. [**](../../akka/grpc/GrpcResponseMetadata.html#headers:akka.grpc.scaladsl.Metadata "Permalink") abstract  def headers: [Metadata](scaladsl/Metadata.html)Scala API: The response metadata, the metadata is only for reading and must not be mutated.
4. [**](../../akka/grpc/GrpcResponseMetadata.html#trailers:scala.concurrent.Future[akka.grpc.scaladsl.Metadata] "Permalink") abstract  def trailers: Future\[[Metadata](scaladsl/Metadata.html)]Scala API: Trailers from the server, is completed after the response stream completes
### Concrete Value Members

1. [**](../../akka/grpc/GrpcResponseMetadata.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../akka/grpc/GrpcResponseMetadata.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../akka/grpc/GrpcResponseMetadata.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../akka/grpc/GrpcResponseMetadata.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/grpc/GrpcResponseMetadata.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/grpc/GrpcResponseMetadata.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../akka/grpc/GrpcResponseMetadata.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../akka/grpc/GrpcResponseMetadata.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../akka/grpc/GrpcResponseMetadata.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../akka/grpc/GrpcResponseMetadata.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
11. [**](../../akka/grpc/GrpcResponseMetadata.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../akka/grpc/GrpcResponseMetadata.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
13. [**](../../akka/grpc/GrpcResponseMetadata.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
14. [**](../../akka/grpc/GrpcResponseMetadata.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../akka/grpc/GrpcResponseMetadata.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../akka/grpc/GrpcResponseMetadata.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/grpc/GrpcResponseMetadata.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../akka/grpc/GrpcResponseMetadata.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/grpc/GrpcResponseMetadata.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/Metadata.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/Metadata.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcResponseMetadata.html](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcResponseMetadata.html)*