---
description: Akka gRPC 2.5.10 - akka.grpc.javadsl.SingleBlockingResponseRequestBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:35:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html
title: Akka gRPC 2.5.10 - akka.grpc.javadsl.SingleBlockingResponseRequestBuilder
---

# Akka gRPC 2.5.10 - akka.grpc.javadsl.SingleBlockingResponseRequestBuilder

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.javadsl.SingleBlockingResponseRequestBuilder

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
- [Metadata](Metadata.html "Immutable representation of the metadata in a call")
- [MetadataBuilder](MetadataBuilder.html "This class provides an interface for constructing immutable Metadata instances.")
- [MetadataEntry](MetadataEntry.html "Represents metadata entry.")
- [MetadataStatus](MetadataStatus.html "Provides access to details to more rich error details using the logical gRPC com.google.rpc.Status message, see [API Design Guide](https://cloud.google.com/apis/design/errors) for more details.")
- [ServerReflection](ServerReflection$.html)
- [ServiceHandler](ServiceHandler$.html)
- SingleBlockingResponseRequestBuilder
- [SingleResponseRequestBuilder](SingleResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")
- [StreamResponseRequestBuilder](StreamResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")
- [StringEntry](StringEntry.html "Represents a text metadata entry.")
- [WebHandler](WebHandler$.html)
t[akka](../../index.html).[grpc](../index.html).[javadsl](index.html)

# SingleBlockingResponseRequestBuilder[**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html "Permalink")

### 

#### trait SingleBlockingResponseRequestBuilder\[Req, Res] extends AnyRef

Request builder for requests providing per call specific metadata capabilities in
addition to the client instance default options provided to it through [akka.grpc.GrpcClientSettings](../GrpcClientSettings.html) upon creation.

Instances are immutable so can be shared and re\-used but are backed by the client that created the instance,
so if that is stopped the invocations will fail.

Only expected to be useful and generated for Java 21 and later where blocking can be done safely on virtual
threads.

Not for user extension

Annotations@DoNotInherit() @ApiMayChange() Source[RequestBuilder.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/javadsl/RequestBuilder.scala#L86)Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SingleBlockingResponseRequestBuilder
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#addHeader(key:String,value:akka.util.ByteString):akka.grpc.javadsl.SingleBlockingResponseRequestBuilder[Req,Res] "Permalink") abstract  def addHeader(key: String, value: ByteString): SingleBlockingResponseRequestBuilder\[Req, Res]Add a binary header, the same header key can be added multiple times with
different values.

Add a binary header, the same header key can be added multiple times with
different values.

returnsA new request builder, that will pass the added header to the server when invoked
2. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#addHeader(key:String,value:String):akka.grpc.javadsl.SingleBlockingResponseRequestBuilder[Req,Res] "Permalink") abstract  def addHeader(key: String, value: String): SingleBlockingResponseRequestBuilder\[Req, Res]Add a header, the value will be ASCII encoded, the same header key can be added multiple times with
different values.

Add a header, the value will be ASCII encoded, the same header key can be added multiple times with
different values.

returnsA new request builder, that will pass the added header to the server when invoked
3. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#invoke(request:Req):Res "Permalink") abstract  def invoke(request: Req): ResInvoke the gRPC method with the additional metadata added
4. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#invokeAsync(request:Req):java.util.concurrent.CompletionStage[Res] "Permalink") abstract  def invokeAsync(request: Req): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Res]Invoke the gRPC method with the additional metadata added
5. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#invokeWithMetadata(request:Req):akka.grpc.GrpcSingleResponse[Res] "Permalink") abstract  def invokeWithMetadata(request: Req): [GrpcSingleResponse](../GrpcSingleResponse.html)\[Res]Invoke the gRPC method with the additional metadata added and provide access to response metadata
6. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#invokeWithMetadataAsync(request:Req):java.util.concurrent.CompletionStage[akka.grpc.GrpcSingleResponse[Res]] "Permalink") abstract  def invokeWithMetadataAsync(request: Req): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[GrpcSingleResponse](../GrpcSingleResponse.html)\[Res]]Invoke the gRPC method with the additional metadata added and provide access to response metadata
7. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#setDeadline(deadline:java.time.Duration):akka.grpc.javadsl.SingleBlockingResponseRequestBuilder[Req,Res] "Permalink") abstract  def setDeadline(deadline: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): SingleBlockingResponseRequestBuilder\[Req, Res]Set the deadline for this call

Set the deadline for this call

returnsA new request builder, that will use the supplied deadline when invoked
8. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#withRetry(maxRetries:Int):akka.grpc.javadsl.SingleBlockingResponseRequestBuilder[Req,Res] "Permalink") abstract  def withRetry(maxRetries: Int): SingleBlockingResponseRequestBuilder\[Req, Res]Set the retry settings for this call.

Set the retry settings for this call. A predifined backoff strategy will be calculated based on the number of maxRetries.

maxRetriesThe number of retries to make
9. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#withRetry(retrySettings:akka.pattern.RetrySettings):akka.grpc.javadsl.SingleBlockingResponseRequestBuilder[Req,Res] "Permalink") abstract  def withRetry(retrySettings: RetrySettings): SingleBlockingResponseRequestBuilder\[Req, Res]Use these retry settings to retry if the call fails.
### Concrete Value Members

1. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
11. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
13. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
14. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientSettings.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcSingleResponse.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
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
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/SingleBlockingResponseRequestBuilder.html)*