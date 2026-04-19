---
description: Akka gRPC 2.5.10 - akka.grpc.GrpcChannel
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcChannel$.html
title: Akka gRPC 2.5.10 - akka.grpc.GrpcChannel
---

# Akka gRPC 2.5.10 - akka.grpc.GrpcChannel

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.GrpcChannel

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
[o](GrpcChannel.html "See companion class")[akka](../index.html).[grpc](index.html)

# [GrpcChannel](GrpcChannel.html "See companion class")[**](../../akka/grpc/GrpcChannel$.html "Permalink")

### Companion [class GrpcChannel](GrpcChannel.html "See companion class")

#### object GrpcChannel

Source[GrpcChannel.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/GrpcChannel.scala#L53)Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcChannel
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/grpc/GrpcChannel$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../akka/grpc/GrpcChannel$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../akka/grpc/GrpcChannel$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../akka/grpc/GrpcChannel$.html#apply(settings:akka.grpc.GrpcClientSettings)(implicitsys:akka.actor.ClassicActorSystemProvider):akka.grpc.GrpcChannel "Permalink")  def apply(settings: [GrpcClientSettings](GrpcClientSettings.html))(implicit sys: ClassicActorSystemProvider): [GrpcChannel](GrpcChannel.html)
5. [**](../../akka/grpc/GrpcChannel$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/grpc/GrpcChannel$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../akka/grpc/GrpcChannel$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
8. [**](../../akka/grpc/GrpcChannel$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
9. [**](../../akka/grpc/GrpcChannel$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../akka/grpc/GrpcChannel$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../akka/grpc/GrpcChannel$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
12. [**](../../akka/grpc/GrpcChannel$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
13. [**](../../akka/grpc/GrpcChannel$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
14. [**](../../akka/grpc/GrpcChannel$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
15. [**](../../akka/grpc/GrpcChannel$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../akka/grpc/GrpcChannel$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../akka/grpc/GrpcChannel$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../akka/grpc/GrpcChannel$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../akka/grpc/GrpcChannel$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/grpc/GrpcChannel$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcChannel$.html](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcChannel$.html)*