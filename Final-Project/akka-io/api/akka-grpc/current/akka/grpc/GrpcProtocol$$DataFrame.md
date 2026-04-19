---
description: Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol.DataFrame
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:36:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$DataFrame.html
title: Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol.DataFrame
---

# Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol.DataFrame

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol.DataFrame

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/grpc/index.html "Permalink")  package [grpc](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/grpc/GrpcProtocol$.html "Permalink")  object [GrpcProtocol](GrpcProtocol$.html "INTERNAL API")INTERNAL API

INTERNAL API

Core definitions for gRPC protocols.

Definition Classes[grpc](index.html)Annotations@InternalApi()
- DataFrame
- [Frame](GrpcProtocol$$Frame.html "A frame in a logical gRPC protocol stream")
- [GrpcProtocolReader](GrpcProtocol$$GrpcProtocolReader.html "Implements the decoding of the gRPC framing from a physical/transport layer.")
- [GrpcProtocolWriter](GrpcProtocol$$GrpcProtocolWriter.html "Implements the encoding of a stream of gRPC Frames into a physical/transport layer.")
- [TrailerFrame](GrpcProtocol$$TrailerFrame.html "A trailer (status headers) frame in a gRPC protocol stream")
c[akka](../index.html).[grpc](index.html).[GrpcProtocol](GrpcProtocol$.html)

# DataFrame[**](../../akka/grpc/GrpcProtocol$$DataFrame.html "Permalink")

### 

#### case class DataFrame(data: ByteString) extends [Frame](GrpcProtocol$$Frame.html) with Product with Serializable

A data (or message) frame in a gRPC protocol stream.

Source[GrpcProtocol.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/GrpcProtocol.scala#L73)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), Product, Equals, [Frame](GrpcProtocol$$Frame.html), AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DataFrame
2. Serializable
3. Product
4. Equals
5. Frame
6. AnyRef
7. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#<init>(data:akka.util.ByteString):akka.grpc.GrpcProtocol.DataFrame "Permalink")  new DataFrame(data: ByteString)
### Value Members

1. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#data:akka.util.ByteString "Permalink")  val data: ByteString
7. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
8. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
10. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
11. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
12. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
13. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
14. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
16. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/grpc/GrpcProtocol$$DataFrame.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from Product

### Inherited from Equals

### Inherited from [Frame](GrpcProtocol$$Frame.html)

### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$DataFrame.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$Frame.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$GrpcProtocolReader.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$GrpcProtocolWriter.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$TrailerFrame.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$DataFrame.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$DataFrame.html)*