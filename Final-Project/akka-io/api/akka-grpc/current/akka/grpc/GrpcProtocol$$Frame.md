---
description: Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol.Frame
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:37:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$Frame.html
title: Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol.Frame
---

# Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol.Frame

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.GrpcProtocol.Frame

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
- Frame
- [GrpcProtocolReader](GrpcProtocol$$GrpcProtocolReader.html "Implements the decoding of the gRPC framing from a physical/transport layer.")
- [GrpcProtocolWriter](GrpcProtocol$$GrpcProtocolWriter.html "Implements the encoding of a stream of gRPC Frames into a physical/transport layer.")
- [TrailerFrame](GrpcProtocol$$TrailerFrame.html "A trailer (status headers) frame in a gRPC protocol stream")
t[akka](../index.html).[grpc](index.html).[GrpcProtocol](GrpcProtocol$.html)

# Frame[**](../../akka/grpc/GrpcProtocol$$Frame.html "Permalink")

### 

#### sealed  trait Frame extends AnyRef

A frame in a logical gRPC protocol stream

Source[GrpcProtocol.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/GrpcProtocol.scala#L70)Linear SupertypesAnyRef, AnyKnown Subclasses[DataFrame](GrpcProtocol$$DataFrame.html), [TrailerFrame](GrpcProtocol$$TrailerFrame.html)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Frame
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/grpc/GrpcProtocol$$Frame.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../akka/grpc/GrpcProtocol$$Frame.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../akka/grpc/GrpcProtocol$$Frame.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../akka/grpc/GrpcProtocol$$Frame.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/grpc/GrpcProtocol$$Frame.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/grpc/GrpcProtocol$$Frame.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../akka/grpc/GrpcProtocol$$Frame.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../akka/grpc/GrpcProtocol$$Frame.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../akka/grpc/GrpcProtocol$$Frame.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../akka/grpc/GrpcProtocol$$Frame.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
11. [**](../../akka/grpc/GrpcProtocol$$Frame.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../akka/grpc/GrpcProtocol$$Frame.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
13. [**](../../akka/grpc/GrpcProtocol$$Frame.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
14. [**](../../akka/grpc/GrpcProtocol$$Frame.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../akka/grpc/GrpcProtocol$$Frame.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../akka/grpc/GrpcProtocol$$Frame.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/grpc/GrpcProtocol$$Frame.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../akka/grpc/GrpcProtocol$$Frame.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/grpc/GrpcProtocol$$Frame.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$Frame.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$$Frame.html)*