---
description: Akka gRPC 2.5.10 - akka.grpc.Trailers
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/Trailers.html
title: Akka gRPC 2.5.10 - akka.grpc.Trailers
---

# Akka gRPC 2.5.10 - akka.grpc.Trailers

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.Trailers

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
- Trailers
[c](Trailers$.html "See companion object")[akka](../index.html).[grpc](index.html)

# [Trailers](Trailers$.html "See companion object")[**](../../akka/grpc/Trailers.html "Permalink")

### Companion [object Trailers](Trailers$.html "See companion object")

#### class Trailers extends AnyRef

Annotations@ApiMayChange() Source[Trailers.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/Trailers.scala#L16)Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Trailers
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/grpc/Trailers.html#<init>(status:io.grpc.Status,metadata:akka.grpc.javadsl.Metadata):akka.grpc.Trailers "Permalink")  new Trailers(status: Status, metadata: [Metadata](javadsl/Metadata.html))
2. [**](../../akka/grpc/Trailers.html#<init>(status:io.grpc.Status):akka.grpc.Trailers "Permalink")  new Trailers(status: Status)
3. [**](../../akka/grpc/Trailers.html#<init>(status:io.grpc.Status,metadata:akka.grpc.scaladsl.Metadata):akka.grpc.Trailers "Permalink")  new Trailers(status: Status, metadata: [Metadata](scaladsl/Metadata.html))
### Value Members

1. [**](../../akka/grpc/Trailers.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../akka/grpc/Trailers.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../akka/grpc/Trailers.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../akka/grpc/Trailers.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/grpc/Trailers.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/grpc/Trailers.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../akka/grpc/Trailers.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../akka/grpc/Trailers.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../akka/grpc/Trailers.html#getMetadata:akka.grpc.javadsl.Metadata "Permalink")  def getMetadata: [Metadata](javadsl/Metadata.html)Java API: Returns the trailing metadata.
10. [**](../../akka/grpc/Trailers.html#getStatus:io.grpc.Status "Permalink")  def getStatus: StatusJava API: Returns the status.
11. [**](../../akka/grpc/Trailers.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../akka/grpc/Trailers.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
13. [**](../../akka/grpc/Trailers.html#metadata:akka.grpc.scaladsl.Metadata "Permalink")  val metadata: [Metadata](scaladsl/Metadata.html)
14. [**](../../akka/grpc/Trailers.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
15. [**](../../akka/grpc/Trailers.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
16. [**](../../akka/grpc/Trailers.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
17. [**](../../akka/grpc/Trailers.html#status:io.grpc.Status "Permalink")  val status: Status
18. [**](../../akka/grpc/Trailers.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../akka/grpc/Trailers.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../akka/grpc/Trailers.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../akka/grpc/Trailers.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/grpc/Trailers.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/grpc/Trailers.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
*Source: [https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/Trailers.html](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/Trailers.html)*