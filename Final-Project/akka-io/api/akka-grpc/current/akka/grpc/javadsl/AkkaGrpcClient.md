---
description: Akka gRPC 2.5.10 - akka.grpc.javadsl.AkkaGrpcClient
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:35:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/AkkaGrpcClient.html
title: Akka gRPC 2.5.10 - akka.grpc.javadsl.AkkaGrpcClient
---

# Akka gRPC 2.5.10 - akka.grpc.javadsl.AkkaGrpcClient

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.javadsl.AkkaGrpcClient

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[grpc](../index.html)
- AkkaGrpcClient
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
- [SingleBlockingResponseRequestBuilder](SingleBlockingResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")
- [SingleResponseRequestBuilder](SingleResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")
- [StreamResponseRequestBuilder](StreamResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through akka.grpc.GrpcClientSettings upon creation.")
- [StringEntry](StringEntry.html "Represents a text metadata entry.")
- [WebHandler](WebHandler$.html)
t[akka](../../index.html).[grpc](../index.html).[javadsl](index.html)

# AkkaGrpcClient[**](../../../akka/grpc/javadsl/AkkaGrpcClient.html "Permalink")

### 

#### trait AkkaGrpcClient extends AnyRef

Common trait of all generated Akka gRPC clients. Not for user extension.

Annotations@DoNotInherit() Source[AkkaGrpcClient.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/javadsl/AkkaGrpcClient.scala#L14)Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AkkaGrpcClient
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#close():java.util.concurrent.CompletionStage[akka.Done] "Permalink") abstract  def close(): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]Initiates a shutdown in which preexisting and new calls are cancelled.

Initiates a shutdown in which preexisting and new calls are cancelled.

This method is only valid for clients that use an internal channel. If the client was created
with a shared, user\-provided channel, the channel itself should be closed.

Exceptions thrown[`akka.grpc.GrpcClientCloseException`](../GrpcClientCloseException.html) if client was created with a user\-provided [akka.grpc.GrpcChannel](../GrpcChannel.html).
2. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#closed():java.util.concurrent.CompletionStage[akka.Done] "Permalink") abstract  def closed(): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]
### Concrete Value Members

1. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#addRequestHeader(key:String,value:String):akka.grpc.javadsl.AkkaGrpcClient "Permalink")  def addRequestHeader(key: String, value: String): AkkaGrpcClientreturnsThe same client decorated to add the given key and value to the metadata of any request issued.
5. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
8. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
9. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
12. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
13. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
14. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
15. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/grpc/javadsl/AkkaGrpcClient.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcChannel.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientCloseException.html
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
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/AkkaGrpcClient.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/AkkaGrpcClient.html)*