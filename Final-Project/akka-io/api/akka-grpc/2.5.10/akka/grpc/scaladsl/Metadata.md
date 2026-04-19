---
description: Akka gRPC 2.5.10 - akka.grpc.scaladsl.Metadata
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:48:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/Metadata.html
title: Akka gRPC 2.5.10 - akka.grpc.scaladsl.Metadata
---

# Akka gRPC 2.5.10 - akka.grpc.scaladsl.Metadata

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.scaladsl.Metadata

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[grpc](../index.html)
- [**](../../../akka/grpc/scaladsl/headers/index.html "Permalink")  package [headers](headers/index.html)Definition Classes[scaladsl](index.html)
- [AkkaGrpcClient](AkkaGrpcClient.html "Common trait of all generated Akka gRPC clients.")
- [BytesEntry](BytesEntry.html "Represents a binary metadata entry.")
- [GrpcExceptionHandler](GrpcExceptionHandler$.html)
- [GrpcMarshalling](GrpcMarshalling$.html)
- [InstancePerRequestFactory](InstancePerRequestFactory.html "Not for user extension, used by generated code.")
- Metadata
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
t[akka](../../index.html).[grpc](../index.html).[scaladsl](index.html)

# Metadata[**](../../../akka/grpc/scaladsl/Metadata.html "Permalink")

### 

#### trait Metadata extends AnyRef

Immutable representation of the metadata in a call

Not for user extension

Annotations@ApiMayChange() @DoNotInherit() Source[Metadata.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/scaladsl/Metadata.scala#L18)Linear SupertypesAnyRef, AnyKnown Subclasses[EntryMetadataImpl](../internal/EntryMetadataImpl.html), [GrpcMetadataImpl](../internal/GrpcMetadataImpl.html), [HeaderMetadataImpl](../internal/HeaderMetadataImpl.html), [HttpMessageMetadataImpl](../internal/HttpMessageMetadataImpl.html), [RichGrpcMetadataImpl](../internal/RichGrpcMetadataImpl.html), [MetadataStatus](MetadataStatus.html)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Metadata
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../akka/grpc/scaladsl/Metadata.html#asList:List[(String,akka.grpc.scaladsl.MetadataEntry)] "Permalink") abstract  def asList: List\[(String, [MetadataEntry](MetadataEntry.html))]returnsA list of (key, MetadataEntry) tuples.

Annotations@ApiMayChange()
2. [**](../../../akka/grpc/scaladsl/Metadata.html#asMap:Map[String,List[akka.grpc.scaladsl.MetadataEntry]] "Permalink") abstract  def asMap: Map\[String, List\[[MetadataEntry](MetadataEntry.html)]]returnsThe metadata as a map.

Annotations@ApiMayChange()
3. [**](../../../akka/grpc/scaladsl/Metadata.html#attribute[T](key:akka.http.scaladsl.model.AttributeKey[T]):Option[T] "Permalink") abstract  def attribute\[T](key: AttributeKey\[T]): Option\[T]Get an attribute from the underlying akka\-http message associated with this metadata.

Get an attribute from the underlying akka\-http message associated with this metadata.

Will return `None` if this metadata is not associated with an akka\-http request or response, for example,
if using the netty client support.
4. [**](../../../akka/grpc/scaladsl/Metadata.html#getBinary(key:String):Option[akka.util.ByteString] "Permalink") abstract  def getBinary(key: String): Option\[ByteString]returnsThe binary header value for `key` if one exists, if the same key has multiple values the last occurrence
 that is a text key is used.
5. [**](../../../akka/grpc/scaladsl/Metadata.html#getText(key:String):Option[String] "Permalink") abstract  def getText(key: String): Option\[String]returnsThe text header value for `key` if one exists, if the same key has multiple values the last occurrence
 that is a text key is used.
### Concrete Value Members

1. [**](../../../akka/grpc/scaladsl/Metadata.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/scaladsl/Metadata.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/scaladsl/Metadata.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/scaladsl/Metadata.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/grpc/scaladsl/Metadata.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/grpc/scaladsl/Metadata.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../../akka/grpc/scaladsl/Metadata.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../../akka/grpc/scaladsl/Metadata.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../../akka/grpc/scaladsl/Metadata.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/grpc/scaladsl/Metadata.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
11. [**](../../../akka/grpc/scaladsl/Metadata.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../../akka/grpc/scaladsl/Metadata.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
13. [**](../../../akka/grpc/scaladsl/Metadata.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
14. [**](../../../akka/grpc/scaladsl/Metadata.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/grpc/scaladsl/Metadata.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/grpc/scaladsl/Metadata.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/grpc/scaladsl/Metadata.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/grpc/scaladsl/Metadata.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/grpc/scaladsl/Metadata.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/EntryMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/GrpcMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/HeaderMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/HttpMessageMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/internal/RichGrpcMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/AkkaGrpcClient.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/BytesEntry.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/GrpcExceptionHandler$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/GrpcMarshalling$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/InstancePerRequestFactory.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/Metadata.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/MetadataBuilder$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/MetadataBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/MetadataEntry.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/MetadataStatus.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/ScalapbProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/ServerReflection$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/ServiceHandler$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/SingleResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/StreamResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/StringEntry.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/WebHandler$.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/headers/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/index.html
- https://doc.akka.io/api/akka-grpc/2.5.10/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc//scaladsl/Metadata.html](https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc//scaladsl/Metadata.html)*