---
description: Akka gRPC 2.5.10 - akka.grpc.GrpcSingleResponse
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcSingleResponse.html
title: Akka gRPC 2.5.10 - akka.grpc.GrpcSingleResponse
---

# Akka gRPC 2.5.10 - akka.grpc.GrpcSingleResponse

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.GrpcSingleResponse

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
- GrpcSingleResponse
- [ProtobufSerializer](ProtobufSerializer.html)
- [SSLContextUtils](SSLContextUtils$.html)
- [ServiceDescription](ServiceDescription.html)
- [Trailers](Trailers.html)
t[akka](../index.html).[grpc](index.html)

# GrpcSingleResponse[**](../../akka/grpc/GrpcSingleResponse.html "Permalink")

### 

#### trait GrpcSingleResponse\[T] extends [GrpcResponseMetadata](GrpcResponseMetadata.html)

Represents the metadata related to a gRPC call with a single response value

Not for user extension

Annotations@DoNotInherit() Source[GrpcClientResponse.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/GrpcClientResponse.scala#L49)Linear Supertypes[GrpcResponseMetadata](GrpcResponseMetadata.html), AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcSingleResponse
2. GrpcResponseMetadata
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../akka/grpc/GrpcSingleResponse.html#getHeaders():akka.grpc.javadsl.Metadata "Permalink") abstract  def getHeaders(): [Metadata](javadsl/Metadata.html)Java API: The response metadata, the metadata is only for reading and must not be mutated.

Java API: The response metadata, the metadata is only for reading and must not be mutated.

Definition Classes[GrpcResponseMetadata](GrpcResponseMetadata.html)
2. [**](../../akka/grpc/GrpcSingleResponse.html#getTrailers():java.util.concurrent.CompletionStage[akka.grpc.javadsl.Metadata] "Permalink") abstract  def getTrailers(): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Metadata](javadsl/Metadata.html)]Java API: Trailers from the server, is completed after the response stream completes

Java API: Trailers from the server, is completed after the response stream completes

Definition Classes[GrpcResponseMetadata](GrpcResponseMetadata.html)
3. [**](../../akka/grpc/GrpcSingleResponse.html#getValue():T "Permalink") abstract  def getValue(): TJava API: The response body
4. [**](../../akka/grpc/GrpcSingleResponse.html#headers:akka.grpc.scaladsl.Metadata "Permalink") abstract  def headers: [Metadata](scaladsl/Metadata.html)Scala API: The response metadata, the metadata is only for reading and must not be mutated.

Scala API: The response metadata, the metadata is only for reading and must not be mutated.

Definition Classes[GrpcResponseMetadata](GrpcResponseMetadata.html)
5. [**](../../akka/grpc/GrpcSingleResponse.html#trailers:scala.concurrent.Future[akka.grpc.scaladsl.Metadata] "Permalink") abstract  def trailers: Future\[[Metadata](scaladsl/Metadata.html)]Scala API: Trailers from the server, is completed after the response stream completes

Scala API: Trailers from the server, is completed after the response stream completes

Definition Classes[GrpcResponseMetadata](GrpcResponseMetadata.html)
6. [**](../../akka/grpc/GrpcSingleResponse.html#value:T "Permalink") abstract  def value: TScala API: The response body
### Concrete Value Members

1. [**](../../akka/grpc/GrpcSingleResponse.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../akka/grpc/GrpcSingleResponse.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../akka/grpc/GrpcSingleResponse.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../akka/grpc/GrpcSingleResponse.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/grpc/GrpcSingleResponse.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/grpc/GrpcSingleResponse.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../akka/grpc/GrpcSingleResponse.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../akka/grpc/GrpcSingleResponse.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../akka/grpc/GrpcSingleResponse.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../akka/grpc/GrpcSingleResponse.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
11. [**](../../akka/grpc/GrpcSingleResponse.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../akka/grpc/GrpcSingleResponse.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
13. [**](../../akka/grpc/GrpcSingleResponse.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
14. [**](../../akka/grpc/GrpcSingleResponse.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../akka/grpc/GrpcSingleResponse.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../akka/grpc/GrpcSingleResponse.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/grpc/GrpcSingleResponse.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../akka/grpc/GrpcSingleResponse.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/grpc/GrpcSingleResponse.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [GrpcResponseMetadata](GrpcResponseMetadata.html)

### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/AkkaGrpcGenerated.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcChannel$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcChannel.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientCloseException.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientSettings$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientSettings.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcResponseMetadata.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcServiceException$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcServiceException.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcSingleResponse.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/ProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/SSLContextUtils$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/ServiceDescription.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/Trailers$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/Trailers.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/Metadata.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/Metadata.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcSingleResponse.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcSingleResponse.html)*