---
description: Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol.GrpcProtocolReader
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$GrpcProtocolReader.html
title: Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol.GrpcProtocolReader
---

# Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol.GrpcProtocolReader

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol.GrpcProtocolReader

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/grpc/index.html "Permalink")  package [grpc](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/grpc/GrpcProtocol$.html "Permalink")  object [GrpcProtocol](GrpcProtocol$.html "INTERNAL API")INTERNAL API

INTERNAL API

Core definitions for gRPC protocols.

Definition Classes[grpc](index.html)Annotations@InternalApi()
- [DataFrame](GrpcProtocol$$DataFrame.html "A data (or message) frame in a gRPC protocol stream.")
- [Frame](GrpcProtocol$$Frame.html "A frame in a logical gRPC protocol stream")
- GrpcProtocolReader
- [GrpcProtocolWriter](GrpcProtocol$$GrpcProtocolWriter.html "Implements the encoding of a stream of gRPC Frames into a physical/transport layer.")
- [TrailerFrame](GrpcProtocol$$TrailerFrame.html "A trailer (status headers) frame in a gRPC protocol stream")
c[akka](../index.html).[grpc](index.html).[GrpcProtocol](GrpcProtocol$.html)

# GrpcProtocolReader[**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html "Permalink")

### 

#### case class GrpcProtocolReader(messageEncoding: [Codec](internal/Codec.html), decodeSingleFrame: (ByteString) \=\> ByteString, frameDecoder: Flow\[ByteString, [Frame](GrpcProtocol$$Frame.html), NotUsed]) extends Product with Serializable

Implements the decoding of the gRPC framing from a physical/transport layer.

Source[GrpcProtocol.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/GrpcProtocol.scala#L98)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), Product, Equals, AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcProtocolReader
2. Serializable
3. Product
4. Equals
5. AnyRef
6. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#<init>(messageEncoding:akka.grpc.internal.Codec,decodeSingleFrame:akka.util.ByteString=>akka.util.ByteString,frameDecoder:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.grpc.GrpcProtocol.Frame,akka.NotUsed]):akka.grpc.GrpcProtocol.GrpcProtocolReader "Permalink")  new GrpcProtocolReader(messageEncoding: [Codec](internal/Codec.html), decodeSingleFrame: (ByteString) \=\> ByteString, frameDecoder: Flow\[ByteString, [Frame](GrpcProtocol$$Frame.html), NotUsed])
### Value Members

1. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#dataFrameDecoder:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "Permalink")  val dataFrameDecoder: Flow\[ByteString, ByteString, NotUsed]A Flow of Frames over a stream of messages encoded in gRPC framing that only
expects data frames, and produces the body of each data frame.

A Flow of Frames over a stream of messages encoded in gRPC framing that only
expects data frames, and produces the body of each data frame.
This flow will throw IllegalStateException if anything other than a data frame is encountered.
7. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#decodeSingleFrame:akka.util.ByteString=>akka.util.ByteString "Permalink")  val decodeSingleFrame: (ByteString) \=\> ByteString
8. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
9. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#frameDecoder:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.grpc.GrpcProtocol.Frame,akka.NotUsed] "Permalink")  val frameDecoder: Flow\[ByteString, [Frame](GrpcProtocol$$Frame.html), NotUsed]
10. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
12. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#messageEncoding:akka.grpc.internal.Codec "Permalink")  val messageEncoding: [Codec](internal/Codec.html)
13. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
14. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
15. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
16. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
17. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/grpc/GrpcProtocol$$GrpcProtocolReader.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from Product

### Inherited from Equals

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
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/Codec.html
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$GrpcProtocolReader.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$GrpcProtocolReader.html)*