---
description: Akka gRPC 2.5.10 - akka.grpc.scaladsl.BytesEntry
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:36:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/BytesEntry.html
title: Akka gRPC 2.5.10 - akka.grpc.scaladsl.BytesEntry
---

# Akka gRPC 2.5.10 - akka.grpc.scaladsl.BytesEntry

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.scaladsl.BytesEntry

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[grpc](../index.html)
- [**](../../../akka/grpc/scaladsl/headers/index.html "Permalink")  package [headers](headers/index.html)Definition Classes[scaladsl](index.html)
- [AkkaGrpcClient](AkkaGrpcClient.html "Common trait of all generated Akka gRPC clients.")
- BytesEntry
- [GrpcExceptionHandler](GrpcExceptionHandler$.html)
- [GrpcMarshalling](GrpcMarshalling$.html)
- [InstancePerRequestFactory](InstancePerRequestFactory.html "Not for user extension, used by generated code.")
- [Metadata](Metadata.html "Immutable representation of the metadata in a call")
- [MetadataBuilder](MetadataBuilder.html "This class provides an interface for constructing immutable Metadata instances.")
- [MetadataEntry](MetadataEntry.html "Represents a entry (value) in a collection of Metadata.")
- [MetadataStatus](MetadataStatus.html "Provides access to details to more rich error details using the logical gRPC com.google.rpc.Status message, see [API Design Guide](https://cloud.google.com/apis/design/errors) for more details.")
- [ScalapbProtobufSerializer](ScalapbProtobufSerializer.html)
- [ServerReflection](ServerReflection$.html)
- [ServiceHandler](ServiceHandler$.html)
- [SingleResponseRequestBuilder](SingleResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through GrpcClientSettings upon creation.")
- [StreamResponseRequestBuilder](StreamResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through GrpcClientSettings upon creation.")
- [StringEntry](StringEntry.html "Represents a text metadata entry.")
- [WebHandler](WebHandler$.html)
c[akka](../../index.html).[grpc](../index.html).[scaladsl](index.html)

# BytesEntry[**](../../../akka/grpc/scaladsl/BytesEntry.html "Permalink")

### 

#### case class BytesEntry(value: ByteString) extends [MetadataEntry](MetadataEntry.html) with [javadsl.BytesEntry](../javadsl/BytesEntry.html) with Product with Serializable

Represents a binary metadata entry.

valueThe entry value.

Source[MetadataEntry.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/scaladsl/MetadataEntry.scala#L33)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), Product, Equals, [javadsl.BytesEntry](../javadsl/BytesEntry.html), [MetadataEntry](MetadataEntry.html), [javadsl.MetadataEntry](../javadsl/MetadataEntry.html), AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BytesEntry
2. Serializable
3. Product
4. Equals
5. BytesEntry
6. MetadataEntry
7. MetadataEntry
8. AnyRef
9. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/grpc/scaladsl/BytesEntry.html#<init>(value:akka.util.ByteString):akka.grpc.scaladsl.BytesEntry "Permalink")  new BytesEntry(value: ByteString)valueThe entry value.
### Value Members

1. [**](../../../akka/grpc/scaladsl/BytesEntry.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/scaladsl/BytesEntry.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/scaladsl/BytesEntry.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/scaladsl/BytesEntry.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/grpc/scaladsl/BytesEntry.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/grpc/scaladsl/BytesEntry.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../../akka/grpc/scaladsl/BytesEntry.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
8. [**](../../../akka/grpc/scaladsl/BytesEntry.html#getValue():akka.util.ByteString "Permalink")  def getValue(): ByteStringJava API: Get the entry value.

Java API: Get the entry value.

Definition ClassesBytesEntry → [BytesEntry](../javadsl/BytesEntry.html)
9. [**](../../../akka/grpc/scaladsl/BytesEntry.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
10. [**](../../../akka/grpc/scaladsl/BytesEntry.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
11. [**](../../../akka/grpc/scaladsl/BytesEntry.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
12. [**](../../../akka/grpc/scaladsl/BytesEntry.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
13. [**](../../../akka/grpc/scaladsl/BytesEntry.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
14. [**](../../../akka/grpc/scaladsl/BytesEntry.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/grpc/scaladsl/BytesEntry.html#value:akka.util.ByteString "Permalink")  val value: ByteString
16. [**](../../../akka/grpc/scaladsl/BytesEntry.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/grpc/scaladsl/BytesEntry.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/grpc/scaladsl/BytesEntry.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/grpc/scaladsl/BytesEntry.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from Product

### Inherited from Equals

### Inherited from [javadsl.BytesEntry](../javadsl/BytesEntry.html)

### Inherited from [MetadataEntry](MetadataEntry.html)

### Inherited from [javadsl.MetadataEntry](../javadsl/MetadataEntry.html)

### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/BytesEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/MetadataEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/AkkaGrpcClient.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/BytesEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/GrpcExceptionHandler$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/GrpcMarshalling$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/InstancePerRequestFactory.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/Metadata.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/MetadataBuilder$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/MetadataBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/MetadataEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/MetadataStatus.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/ScalapbProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/ServerReflection$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/ServiceHandler$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/SingleResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/StreamResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/StringEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/WebHandler$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/BytesEntry.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/BytesEntry.html)*