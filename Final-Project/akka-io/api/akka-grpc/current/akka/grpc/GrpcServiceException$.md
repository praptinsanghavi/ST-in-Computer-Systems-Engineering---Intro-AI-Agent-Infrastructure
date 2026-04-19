---
description: Akka gRPC 2.5.10 - akka.grpc.GrpcServiceException
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcServiceException$.html
title: Akka gRPC 2.5.10 - akka.grpc.GrpcServiceException
---

# Akka gRPC 2.5.10 - akka.grpc.GrpcServiceException

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.GrpcServiceException

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
[o](GrpcServiceException.html "See companion class")[akka](../index.html).[grpc](index.html)

# [GrpcServiceException](GrpcServiceException.html "See companion class")[**](../../akka/grpc/GrpcServiceException$.html "Permalink")

### Companion [class GrpcServiceException](GrpcServiceException.html "See companion class")

#### object GrpcServiceException extends [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[GrpcServiceException.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/GrpcServiceException.scala#L17)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcServiceException
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/grpc/GrpcServiceException$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../akka/grpc/GrpcServiceException$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../akka/grpc/GrpcServiceException$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../akka/grpc/GrpcServiceException$.html#apply(ex:io.grpc.StatusRuntimeException):akka.grpc.GrpcServiceException "Permalink")  def apply(ex: StatusRuntimeException): [GrpcServiceException](GrpcServiceException.html)
5. [**](../../akka/grpc/GrpcServiceException$.html#apply(code:com.google.rpc.Code,message:String,details:Seq[scalapb.GeneratedMessage]):akka.grpc.GrpcServiceException "Permalink")  def apply(code: Code, message: String, details: Seq\[GeneratedMessage]): [GrpcServiceException](GrpcServiceException.html)Scala API
6. [**](../../akka/grpc/GrpcServiceException$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/grpc/GrpcServiceException$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
8. [**](../../akka/grpc/GrpcServiceException$.html#create(code:com.google.rpc.Code,message:String,details:java.util.List[com.google.protobuf.Message]):akka.grpc.GrpcServiceException "Permalink")  def create(code: Code, message: String, details: [List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[Message]): [GrpcServiceException](GrpcServiceException.html)Java API
9. [**](../../akka/grpc/GrpcServiceException$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
10. [**](../../akka/grpc/GrpcServiceException$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
11. [**](../../akka/grpc/GrpcServiceException$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../akka/grpc/GrpcServiceException$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../akka/grpc/GrpcServiceException$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
14. [**](../../akka/grpc/GrpcServiceException$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
15. [**](../../akka/grpc/GrpcServiceException$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
16. [**](../../akka/grpc/GrpcServiceException$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
17. [**](../../akka/grpc/GrpcServiceException$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../akka/grpc/GrpcServiceException$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../akka/grpc/GrpcServiceException$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../akka/grpc/GrpcServiceException$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../akka/grpc/GrpcServiceException$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/grpc/GrpcServiceException$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

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
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcServiceException$.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcServiceException$.html)*