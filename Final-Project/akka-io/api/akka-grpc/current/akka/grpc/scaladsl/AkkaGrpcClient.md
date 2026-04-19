---
description: Akka gRPC 2.5.10 - akka.grpc.scaladsl.AkkaGrpcClient
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:36:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/AkkaGrpcClient.html
title: Akka gRPC 2.5.10 - akka.grpc.scaladsl.AkkaGrpcClient
---

# Akka gRPC 2.5.10 - akka.grpc.scaladsl.AkkaGrpcClient

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.scaladsl.AkkaGrpcClient

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[grpc](../index.html)
- [**](../../../akka/grpc/scaladsl/headers/index.html "Permalink")  package [headers](headers/index.html)Definition Classes[scaladsl](index.html)
- AkkaGrpcClient
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
- [SingleResponseRequestBuilder](SingleResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through GrpcClientSettings upon creation.")
- [StreamResponseRequestBuilder](StreamResponseRequestBuilder.html "Request builder for requests providing per call specific metadata capabilities in addition to the client instance default options provided to it through GrpcClientSettings upon creation.")
- [StringEntry](StringEntry.html "Represents a text metadata entry.")
- [WebHandler](WebHandler$.html)
t[akka](../../index.html).[grpc](../index.html).[scaladsl](index.html)

# AkkaGrpcClient[**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html "Permalink")

### 

#### trait AkkaGrpcClient extends AnyRef

Common trait of all generated Akka gRPC clients. Not for user extension.

Annotations@DoNotInherit() Source[AkkaGrpcClient.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/scaladsl/AkkaGrpcClient.scala#L14)Linear SupertypesAnyRef, AnyKnown Subclasses[ServerReflectionClient](../../../grpc/reflection/v1alpha/reflection/ServerReflectionClient.html)****Ordering1. Alphabetic
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

1. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#close():scala.concurrent.Future[akka.Done] "Permalink") abstract  def close(): Future\[Done]Initiates a shutdown in which preexisting and new calls are cancelled.

Initiates a shutdown in which preexisting and new calls are cancelled.

This method is only valid for clients that use an internal channel. If the client was created
with a shared user\-provided channel, the channel itself should be closed.

Exceptions thrown[`akka.grpc.GrpcClientCloseException`](../GrpcClientCloseException.html) if client was created with a user\-provided [akka.grpc.GrpcChannel](../GrpcChannel.html).
2. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#closed:scala.concurrent.Future[akka.Done] "Permalink") abstract  def closed: Future\[Done]A Future that completes successfully when shutdown via close()
or exceptionally if a connection can not be established or reestablished
after maxConnectionAttempts.
### Concrete Value Members

1. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#addRequestHeader(key:String,value:String):akka.grpc.scaladsl.AkkaGrpcClient "Permalink")  def addRequestHeader(key: String, value: String): AkkaGrpcClientThe same client instance decorated to add the given key and value to the metadata of any request issued.
5. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
8. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
9. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
12. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
13. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
14. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
15. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/grpc/scaladsl/AkkaGrpcClient.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcChannel.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientCloseException.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
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
- https://doc.akka.io/api/akka-grpc/current/grpc/reflection/v1alpha/reflection/ServerReflectionClient.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/AkkaGrpcClient.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/AkkaGrpcClient.html)*