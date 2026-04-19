---
description: Akka gRPC 2.5.10 - akka.grpc.scaladsl.SingleResponseRequestBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:36:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/SingleResponseRequestBuilder.html
title: Akka gRPC 2.5.10 - akka.grpc.scaladsl.SingleResponseRequestBuilder
---

# Akka gRPC 2.5.10 - akka.grpc.scaladsl.SingleResponseRequestBuilder

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.scaladsl.SingleResponseRequestBuilder

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
- [Metadata](Metadata.html "Immutable representation of the metadata in a call")
- [MetadataBuilder](MetadataBuilder.html "This class provides an interface for constructing immutable Metadata instances.")
- [MetadataEntry](MetadataEntry.html "Represents a entry (value) in a collection of Metadata.")
- [MetadataStatus](MetadataStatus.html "Provides access to details to more rich error details using the logical gRPC com.google.rpc.Status message, see [API Design Guide](https://cloud.google.com/apis/design/errors) for more details.")
- [ScalapbProtobufSerializer](ScalapbProtobufSerializer.html)
- [ServerReflection](ServerReflection$.html)
- [ServiceHandler](ServiceHandler$.html)
- SingleResponseRequestBuilder
- [StreamResponseRequestBuilder](StreamResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through GrpcClientSettings upon creation.")
- [StringEntry](StringEntry.html "Represents a text metadata entry.")
- [WebHandler](WebHandler$.html)
t[akka](../../index.html).[grpc](../index.html).[scaladsl](index.html)

# SingleResponseRequestBuilder[**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html "Permalink")

### 

#### trait SingleResponseRequestBuilder\[Req, Res] extends AnyRef

Request builder for requests providing per call specific metadata capabilities in
addition to the client instance default options provided to it through [GrpcClientSettings](../GrpcClientSettings.html) upon creation.

Instances are immutable so can be shared and re\-used but are backed by the client that created the instance,
so if that is stopped the invocations will fail.

Not for user extension

Annotations@DoNotInherit() @ApiMayChange() Source[RequestBuilder.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/scaladsl/RequestBuilder.scala#L28)Linear SupertypesAnyRef, AnyKnown Subclasses[ScalaClientStreamingRequestBuilder](../internal/ScalaClientStreamingRequestBuilder.html), [ScalaUnaryRequestBuilder](../internal/ScalaUnaryRequestBuilder.html)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SingleResponseRequestBuilder
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#addHeader(key:String,value:akka.util.ByteString):akka.grpc.scaladsl.SingleResponseRequestBuilder[Req,Res] "Permalink") abstract  def addHeader(key: String, value: ByteString): SingleResponseRequestBuilder\[Req, Res]Add a binary header, the same header key can be added multiple times with
different values.

Add a binary header, the same header key can be added multiple times with
different values.

returnsA new request builder, that will pass the added header to the server when invoked
2. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#addHeader(key:String,value:String):akka.grpc.scaladsl.SingleResponseRequestBuilder[Req,Res] "Permalink") abstract  def addHeader(key: String, value: String): SingleResponseRequestBuilder\[Req, Res]Add a header, the value will be ASCII encoded, the same header key can be added multiple times with
different values.

Add a header, the value will be ASCII encoded, the same header key can be added multiple times with
different values.

returnsA new request builder, that will pass the added header to the server when invoked
3. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#invoke(request:Req):scala.concurrent.Future[Res] "Permalink") abstract  def invoke(request: Req): Future\[Res]Invoke the gRPC method with the additional metadata added
4. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#invokeWithMetadata(request:Req):scala.concurrent.Future[akka.grpc.GrpcSingleResponse[Res]] "Permalink") abstract  def invokeWithMetadata(request: Req): Future\[[GrpcSingleResponse](../GrpcSingleResponse.html)\[Res]]Invoke the gRPC method with the additional metadata added and provide access to response metadata
5. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#setDeadline(deadline:scala.concurrent.duration.Duration):akka.grpc.scaladsl.SingleResponseRequestBuilder[Req,Res] "Permalink") abstract  def setDeadline(deadline: Duration): SingleResponseRequestBuilder\[Req, Res]Set the deadline for this call

Set the deadline for this call

returnsA new request builder, that will use the supplied deadline when invoked
6. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#withRetry(maxRetries:Int):akka.grpc.scaladsl.SingleResponseRequestBuilder[Req,Res] "Permalink") abstract  def withRetry(maxRetries: Int): SingleResponseRequestBuilder\[Req, Res]Set the retry settings for this call.

Set the retry settings for this call. A predifined backoff strategy will be calculated based on the number of maxRetries.

maxRetriesThe number of retries to make
7. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#withRetry(retrySettings:akka.pattern.RetrySettings):akka.grpc.scaladsl.SingleResponseRequestBuilder[Req,Res] "Permalink") abstract  def withRetry(retrySettings: RetrySettings): SingleResponseRequestBuilder\[Req, Res]Use these retry settings to retry if the call fails.
### Concrete Value Members

1. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
11. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
13. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
14. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/grpc/scaladsl/SingleResponseRequestBuilder.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientSettings.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcSingleResponse.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ScalaClientStreamingRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/ScalaUnaryRequestBuilder.html
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
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/SingleResponseRequestBuilder.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/SingleResponseRequestBuilder.html)*