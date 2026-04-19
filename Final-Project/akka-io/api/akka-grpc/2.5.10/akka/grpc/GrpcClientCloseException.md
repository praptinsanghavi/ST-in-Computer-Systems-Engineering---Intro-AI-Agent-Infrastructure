---
description: Akka gRPC 2.5.10 - akka.grpc.GrpcClientCloseException
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientCloseException.html
title: Akka gRPC 2.5.10 - akka.grpc.GrpcClientCloseException
---

# Akka gRPC 2.5.10 - akka.grpc.GrpcClientCloseException

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.GrpcClientCloseException

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
- GrpcClientCloseException
- [GrpcClientSettings](GrpcClientSettings.html)
- [GrpcProtocol](GrpcProtocol.html "A variant of the gRPC protocol - e.g.")
- [GrpcResponseMetadata](GrpcResponseMetadata.html "Represents the metadata related to a gRPC call with a streaming response")
- [GrpcServiceException](GrpcServiceException.html)
- [GrpcSingleResponse](GrpcSingleResponse.html "Represents the metadata related to a gRPC call with a single response value")
- [ProtobufSerializer](ProtobufSerializer.html)
- [SSLContextUtils](SSLContextUtils$.html)
- [ServiceDescription](ServiceDescription.html)
- [Trailers](Trailers.html)
c[akka](../index.html).[grpc](index.html)

# GrpcClientCloseException[**](../../akka/grpc/GrpcClientCloseException.html "Permalink")

### 

#### final  class GrpcClientCloseException extends [IllegalStateException](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/IllegalStateException.html#java.lang.IllegalStateException)

Thrown if close() is called on a client that uses a shared channel.

Source[GrpcClientCloseException.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/GrpcClientCloseException.scala#L10)Linear Supertypes[IllegalStateException](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/IllegalStateException.html#java.lang.IllegalStateException), [RuntimeException](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcClientCloseException
2. IllegalStateException
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

1. [**](../../akka/grpc/GrpcClientCloseException.html#<init>():akka.grpc.GrpcClientCloseException "Permalink")  new GrpcClientCloseException()
### Value Members

1. [**](../../akka/grpc/GrpcClientCloseException.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../akka/grpc/GrpcClientCloseException.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../akka/grpc/GrpcClientCloseException.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../akka/grpc/GrpcClientCloseException.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): UnitDefinition ClassesThrowable
5. [**](../../akka/grpc/GrpcClientCloseException.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/grpc/GrpcClientCloseException.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../akka/grpc/GrpcClientCloseException.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
8. [**](../../akka/grpc/GrpcClientCloseException.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
9. [**](../../akka/grpc/GrpcClientCloseException.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
10. [**](../../akka/grpc/GrpcClientCloseException.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
11. [**](../../akka/grpc/GrpcClientCloseException.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../akka/grpc/GrpcClientCloseException.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
13. [**](../../akka/grpc/GrpcClientCloseException.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
14. [**](../../akka/grpc/GrpcClientCloseException.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): Array\[[StackTraceElement](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
15. [**](../../akka/grpc/GrpcClientCloseException.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): Array\[[Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
16. [**](../../akka/grpc/GrpcClientCloseException.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
17. [**](../../akka/grpc/GrpcClientCloseException.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
18. [**](../../akka/grpc/GrpcClientCloseException.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
19. [**](../../akka/grpc/GrpcClientCloseException.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
20. [**](../../akka/grpc/GrpcClientCloseException.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
21. [**](../../akka/grpc/GrpcClientCloseException.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
22. [**](../../akka/grpc/GrpcClientCloseException.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): UnitDefinition ClassesThrowable
23. [**](../../akka/grpc/GrpcClientCloseException.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): UnitDefinition ClassesThrowable
24. [**](../../akka/grpc/GrpcClientCloseException.html#printStackTrace():Unit "Permalink")  def printStackTrace(): UnitDefinition ClassesThrowable
25. [**](../../akka/grpc/GrpcClientCloseException.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: Array\[[StackTraceElement](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): UnitDefinition ClassesThrowable
26. [**](../../akka/grpc/GrpcClientCloseException.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../akka/grpc/GrpcClientCloseException.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
28. [**](../../akka/grpc/GrpcClientCloseException.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../akka/grpc/GrpcClientCloseException.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../akka/grpc/GrpcClientCloseException.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/grpc/GrpcClientCloseException.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [IllegalStateException](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/IllegalStateException.html#java.lang.IllegalStateException)

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
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcClientCloseException.html](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcClientCloseException.html)*