---
description: Akka gRPC 2.5.10 - akka.grpc.javadsl.Metadata
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:35:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/Metadata.html
title: Akka gRPC 2.5.10 - akka.grpc.javadsl.Metadata
---

# Akka gRPC 2.5.10 - akka.grpc.javadsl.Metadata

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.javadsl.Metadata

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[grpc](../index.html)
- [AkkaGrpcClient](AkkaGrpcClient.html "Common trait of all generated Akka gRPC clients.")
- [BytesEntry](BytesEntry.html "Represents a binary metadata entry.")
- [GoogleProtobufSerializer](GoogleProtobufSerializer.html)
- [GrpcExceptionHandler](GrpcExceptionHandler$.html)
- [GrpcMarshalling](GrpcMarshalling$.html)
- Metadata
- [MetadataBuilder](MetadataBuilder.html "This class provides an interface for constructing immutable Metadata instances.")
- [MetadataEntry](MetadataEntry.html "Represents metadata entry.")
- [MetadataStatus](MetadataStatus.html "Provides access to details to more rich error details using the logical gRPC com.google.rpc.Status message, see [API Design Guide](https://cloud.google.com/apis/design/errors) for more details.")
- [ServerReflection](ServerReflection$.html)
- [ServiceHandler](ServiceHandler$.html)
- [SingleBlockingResponseRequestBuilder](SingleBlockingResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")
- [SingleResponseRequestBuilder](SingleResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")
- [StreamResponseRequestBuilder](StreamResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")
- [StringEntry](StringEntry.html "Represents a text metadata entry.")
- [WebHandler](WebHandler$.html)
t[akka](../../index.html).[grpc](../index.html).[javadsl](index.html)

# Metadata[**](../../../akka/grpc/javadsl/Metadata.html "Permalink")

### 

#### trait Metadata extends AnyRef

Immutable representation of the metadata in a call

Not for user extension

Annotations@DoNotInherit() @ApiMayChange() Source[Metadata.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/javadsl/Metadata.scala#L21)Linear SupertypesAnyRef, AnyKnown Subclasses[JavaMetadataImpl](../internal/JavaMetadataImpl.html), [MetadataStatus](MetadataStatus.html)****Ordering1. Alphabetic
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

1. [**](../../../akka/grpc/javadsl/Metadata.html#asList():java.util.List[akka.japi.Pair[String,akka.grpc.javadsl.MetadataEntry]] "Permalink") abstract  def asList(): [List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[Pair\[String, [MetadataEntry](MetadataEntry.html)]]returnsA list of (key, entry) pairs. Pairs with the same key will be ordered based on when they were added
 or received.
2. [**](../../../akka/grpc/javadsl/Metadata.html#asMap():java.util.Map[String,java.util.List[akka.grpc.javadsl.MetadataEntry]] "Permalink") abstract  def asMap(): [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[[MetadataEntry](MetadataEntry.html)]]returnsA map from keys to a list of metadata entries. Entries with the same key will be ordered based on
 when they were added or received.
3. [**](../../../akka/grpc/javadsl/Metadata.html#asScala:akka.grpc.scaladsl.Metadata "Permalink") abstract  def asScala: [scaladsl.Metadata](../scaladsl/Metadata.html)returnsReturns the scaladsl.Metadata interface for this instance.
4. [**](../../../akka/grpc/javadsl/Metadata.html#getAttribute[T](key:akka.http.javadsl.model.AttributeKey[T]):java.util.Optional[T] "Permalink") abstract  def getAttribute\[T](key: AttributeKey\[T]): [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]Get an attribute from the underlying akka\-http message associated with this metadata.

Get an attribute from the underlying akka\-http message associated with this metadata.

Will return `None` if this metadata is not associated with an akka\-http request or response, for example,
if using the netty client support.
5. [**](../../../akka/grpc/javadsl/Metadata.html#getBinary(key:String):java.util.Optional[akka.util.ByteString] "Permalink") abstract  def getBinary(key: String): [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[ByteString]returnsThe binary header value for `key` if one exists, if the same key has multiple values the last occurrence
 that is a text key is used.
6. [**](../../../akka/grpc/javadsl/Metadata.html#getText(key:String):java.util.Optional[String] "Permalink") abstract  def getText(key: String): [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String]returnsThe text header value for `key` if one exists, if the same key has multiple values the last occurrence
 that is a text key is used.
### Concrete Value Members

1. [**](../../../akka/grpc/javadsl/Metadata.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/javadsl/Metadata.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/javadsl/Metadata.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/javadsl/Metadata.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/grpc/javadsl/Metadata.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/grpc/javadsl/Metadata.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../../akka/grpc/javadsl/Metadata.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../../akka/grpc/javadsl/Metadata.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../../akka/grpc/javadsl/Metadata.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/grpc/javadsl/Metadata.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
11. [**](../../../akka/grpc/javadsl/Metadata.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../../akka/grpc/javadsl/Metadata.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
13. [**](../../../akka/grpc/javadsl/Metadata.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
14. [**](../../../akka/grpc/javadsl/Metadata.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/grpc/javadsl/Metadata.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/grpc/javadsl/Metadata.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/grpc/javadsl/Metadata.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/grpc/javadsl/Metadata.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/grpc/javadsl/Metadata.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/JavaMetadataImpl.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/AkkaGrpcClient.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/BytesEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/GoogleProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/GrpcExceptionHandler$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/GrpcMarshalling$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/Metadata.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/MetadataBuilder$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/MetadataBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/MetadataEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/MetadataStatus.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/ServerReflection$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/ServiceHandler$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/SingleResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/StreamResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/StringEntry.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/WebHandler$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/Metadata.html
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/Metadata.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/Metadata.html)*