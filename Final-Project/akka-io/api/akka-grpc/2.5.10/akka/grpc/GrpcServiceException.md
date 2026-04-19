---
description: Akka gRPC 2.5.10 - akka.grpc.GrpcServiceException
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:48:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcServiceException.html
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
- GrpcServiceException
- [GrpcSingleResponse](GrpcSingleResponse.html "Represents the metadata related to a gRPC call with a single response value")
- [ProtobufSerializer](ProtobufSerializer.html)
- [SSLContextUtils](SSLContextUtils$.html)
- [ServiceDescription](ServiceDescription.html)
- [Trailers](Trailers.html)
[c](GrpcServiceException$.html "See companion object")[akka](../index.html).[grpc](index.html)

# [GrpcServiceException](GrpcServiceException$.html "See companion object")[**](../../akka/grpc/GrpcServiceException.html "Permalink")

### Companion [object GrpcServiceException](GrpcServiceException$.html "See companion object")

#### class GrpcServiceException extends StatusRuntimeException

Annotations@ApiMayChange() Source[GrpcServiceException.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/GrpcServiceException.scala#L63)Linear SupertypesStatusRuntimeException, [RuntimeException](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcServiceException
2. StatusRuntimeException
3. RuntimeException
4. Exception
5. Throwable
6. Serializable
7. AnyRef
8. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/grpc/GrpcServiceException.html#<init>(status:io.grpc.Status,metadata:akka.grpc.javadsl.Metadata):akka.grpc.GrpcServiceException "Permalink")  new GrpcServiceException(status: Status, metadata: [Metadata](javadsl/Metadata.html))Java API: Constructs a service exception which includes response metadata.
2. [**](../../akka/grpc/GrpcServiceException.html#<init>(status:io.grpc.Status):akka.grpc.GrpcServiceException "Permalink")  new GrpcServiceException(status: Status)
3. [**](../../akka/grpc/GrpcServiceException.html#<init>(status:io.grpc.Status,metadata:akka.grpc.scaladsl.Metadata):akka.grpc.GrpcServiceException "Permalink")  new GrpcServiceException(status: Status, metadata: [Metadata](scaladsl/Metadata.html))
### Value Members

1. [**](../../akka/grpc/GrpcServiceException.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../akka/grpc/GrpcServiceException.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../akka/grpc/GrpcServiceException.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../akka/grpc/GrpcServiceException.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): UnitDefinition ClassesThrowable
5. [**](../../akka/grpc/GrpcServiceException.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/grpc/GrpcServiceException.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../akka/grpc/GrpcServiceException.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
8. [**](../../akka/grpc/GrpcServiceException.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
9. [**](../../akka/grpc/GrpcServiceException.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
10. [**](../../akka/grpc/GrpcServiceException.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
11. [**](../../akka/grpc/GrpcServiceException.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../akka/grpc/GrpcServiceException.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
13. [**](../../akka/grpc/GrpcServiceException.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
14. [**](../../akka/grpc/GrpcServiceException.html#getMetadata:akka.grpc.javadsl.Metadata "Permalink")  def getMetadata: [Metadata](javadsl/Metadata.html)Java API: The response metadata.
15. [**](../../akka/grpc/GrpcServiceException.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): Array\[[StackTraceElement](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
16. [**](../../akka/grpc/GrpcServiceException.html#getStatus():io.grpc.Status "Permalink") final  def getStatus(): StatusDefinition ClassesStatusRuntimeException
17. [**](../../akka/grpc/GrpcServiceException.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): Array\[[Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
18. [**](../../akka/grpc/GrpcServiceException.html#getTrailers():io.grpc.Metadata "Permalink") final  def getTrailers(): MetadataDefinition ClassesStatusRuntimeExceptionAnnotations@Nullable()
19. [**](../../akka/grpc/GrpcServiceException.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
20. [**](../../akka/grpc/GrpcServiceException.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
21. [**](../../akka/grpc/GrpcServiceException.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
22. [**](../../akka/grpc/GrpcServiceException.html#metadata:akka.grpc.scaladsl.Metadata "Permalink")  val metadata: [Metadata](scaladsl/Metadata.html)
23. [**](../../akka/grpc/GrpcServiceException.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
24. [**](../../akka/grpc/GrpcServiceException.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
25. [**](../../akka/grpc/GrpcServiceException.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
26. [**](../../akka/grpc/GrpcServiceException.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): UnitDefinition ClassesThrowable
27. [**](../../akka/grpc/GrpcServiceException.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): UnitDefinition ClassesThrowable
28. [**](../../akka/grpc/GrpcServiceException.html#printStackTrace():Unit "Permalink")  def printStackTrace(): UnitDefinition ClassesThrowable
29. [**](../../akka/grpc/GrpcServiceException.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: Array\[[StackTraceElement](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): UnitDefinition ClassesThrowable
30. [**](../../akka/grpc/GrpcServiceException.html#status:io.grpc.Status "Permalink")  val status: Status
31. [**](../../akka/grpc/GrpcServiceException.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../akka/grpc/GrpcServiceException.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
33. [**](../../akka/grpc/GrpcServiceException.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../akka/grpc/GrpcServiceException.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../akka/grpc/GrpcServiceException.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/grpc/GrpcServiceException.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from StatusRuntimeException

### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

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
*Source: [https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc//GrpcServiceException.html](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc//GrpcServiceException.html)*