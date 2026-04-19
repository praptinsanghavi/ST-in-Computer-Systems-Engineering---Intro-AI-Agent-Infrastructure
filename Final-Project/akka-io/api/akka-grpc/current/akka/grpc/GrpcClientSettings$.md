---
description: Akka gRPC 2.5.10 - akka.grpc.GrpcClientSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientSettings$.html
title: Akka gRPC 2.5.10 - akka.grpc.GrpcClientSettings
---

# Akka gRPC 2.5.10 - akka.grpc.GrpcClientSettings

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.GrpcClientSettings

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/grpc/index.html "Permalink")  package [grpc](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/grpc/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[grpc](index.html)
- [**](../../akka/grpc/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[grpc](index.html)
- [**](../../akka/grpc/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[grpc](index.html)
- [AkkaGrpcGenerated](AkkaGrpcGenerated.html)
- [GrpcChannel](GrpcChannel.html)
- [GrpcClientCloseException](GrpcClientCloseException.html "Thrown if close() is called on a client that uses a shared channel.")
- [GrpcClientSettings](GrpcClientSettings.html)
- [GrpcProtocol](GrpcProtocol.html "A variant of the gRPC protocol - e.g.")
- [GrpcResponseMetadata](GrpcResponseMetadata.html "Represents the metadata related to a gRPC call with a streaming response")
- [GrpcServiceException](GrpcServiceException.html)
- [GrpcSingleResponse](GrpcSingleResponse.html "Represents the metadata related to a gRPC call with a single response value")
- [ProtobufSerializer](ProtobufSerializer.html)
- [SSLContextUtils](SSLContextUtils$.html)
- [ServiceDescription](ServiceDescription.html)
- [Trailers](Trailers.html)
[o](GrpcClientSettings.html "See companion class")[akka](../index.html).[grpc](index.html)

# [GrpcClientSettings](GrpcClientSettings.html "See companion class")[**](../../akka/grpc/GrpcClientSettings$.html "Permalink")

### Companion [class GrpcClientSettings](GrpcClientSettings.html "See companion class")

#### object GrpcClientSettings

Source[GrpcClientSettings.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/GrpcClientSettings.scala#L24)Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcClientSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/grpc/GrpcClientSettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../akka/grpc/GrpcClientSettings$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../akka/grpc/GrpcClientSettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../akka/grpc/GrpcClientSettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/grpc/GrpcClientSettings$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/grpc/GrpcClientSettings$.html#connectToServiceAt(host:String,port:Int)(implicitactorSystem:akka.actor.ClassicActorSystemProvider):akka.grpc.GrpcClientSettings "Permalink")  def connectToServiceAt(host: String, port: Int)(implicit actorSystem: ClassicActorSystemProvider): [GrpcClientSettings](GrpcClientSettings.html)Create a client that uses a static host and port.

Create a client that uses a static host and port. Default configuration
is loaded from reference.conf
7. [**](../../akka/grpc/GrpcClientSettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
8. [**](../../akka/grpc/GrpcClientSettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
9. [**](../../akka/grpc/GrpcClientSettings$.html#fromConfig(clientConfiguration:com.typesafe.config.Config)(implicitsys:akka.actor.ClassicActorSystemProvider):akka.grpc.GrpcClientSettings "Permalink")  def fromConfig(clientConfiguration: Config)(implicit sys: ClassicActorSystemProvider): [GrpcClientSettings](GrpcClientSettings.html)Configure client via the provided Config.

Configure client via the provided Config. See reference.conf for configuration properties.
10. [**](../../akka/grpc/GrpcClientSettings$.html#fromConfig(clientName:String,config:com.typesafe.config.Config)(implicitactorSystem:akka.actor.ClassicActorSystemProvider):akka.grpc.GrpcClientSettings "Permalink")  def fromConfig(clientName: String, config: Config)(implicit actorSystem: ClassicActorSystemProvider): [GrpcClientSettings](GrpcClientSettings.html)Look up client settings from the given configuration.

Look up client settings from the given configuration. Will look for an entry with the given name client name
directly in the config block. Each client configuration falls back to the defaults defined in reference.conf

clientNameof the client name to lookup config from the given config
11. [**](../../akka/grpc/GrpcClientSettings$.html#fromConfig(clientName:String)(implicitactorSystem:akka.actor.ClassicActorSystemProvider):akka.grpc.GrpcClientSettings "Permalink")  def fromConfig(clientName: String)(implicit actorSystem: ClassicActorSystemProvider): [GrpcClientSettings](GrpcClientSettings.html)Look up client settings from an ActorSystem's configuration.

Look up client settings from an ActorSystem's configuration. Client configuration
must be under `akka.grpc.client`. Each client configuration falls back to the
defaults defined in reference.conf

clientNameof the client configuration to lookup config from the ActorSystem's config
12. [**](../../akka/grpc/GrpcClientSettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../akka/grpc/GrpcClientSettings$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
14. [**](../../akka/grpc/GrpcClientSettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
15. [**](../../akka/grpc/GrpcClientSettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
16. [**](../../akka/grpc/GrpcClientSettings$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
17. [**](../../akka/grpc/GrpcClientSettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
18. [**](../../akka/grpc/GrpcClientSettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../akka/grpc/GrpcClientSettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../akka/grpc/GrpcClientSettings$.html#usingServiceDiscovery(serviceName:String,discovery:akka.discovery.ServiceDiscovery)(implicitactorSystem:akka.actor.ClassicActorSystemProvider):akka.grpc.GrpcClientSettings "Permalink")  def usingServiceDiscovery(serviceName: String, discovery: ServiceDiscovery)(implicit actorSystem: ClassicActorSystemProvider): [GrpcClientSettings](GrpcClientSettings.html)Configure the client to lookup a valid hostname:port from a service registry accessed via the provided `ServiceDiscovery`.

Configure the client to lookup a valid hostname:port from a service registry accessed via the provided `ServiceDiscovery`.
When invoking a lookup operation on the service registry, a
name is required and optionally a port name and a protocol. This factory method only requires a `serviceName`.
Use `withServicePortName` and `withServiceProtocol` to refine the lookup on the service registry.

serviceNamename of the remote service to lookup.
21. [**](../../akka/grpc/GrpcClientSettings$.html#usingServiceDiscovery(serviceName:String)(implicitactorSystem:akka.actor.ClassicActorSystemProvider):akka.grpc.GrpcClientSettings "Permalink")  def usingServiceDiscovery(serviceName: String)(implicit actorSystem: ClassicActorSystemProvider): [GrpcClientSettings](GrpcClientSettings.html)Configure the client to lookup a valid hostname:port from a service registry accessed via the `ServiceDiscovery`
instance registered in the `actorSystem` provided.

Configure the client to lookup a valid hostname:port from a service registry accessed via the `ServiceDiscovery`
instance registered in the `actorSystem` provided. When invoking a lookup operation on the service registry, a
name is required and optionally a port name and a protocol. This factory method only requires a `serviceName`.
Use `withServicePortName` and `withServiceProtocol` to refine the lookup on the service registry.

serviceNamename of the remote service to lookup.
22. [**](../../akka/grpc/GrpcClientSettings$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/grpc/GrpcClientSettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/grpc/GrpcClientSettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/grpc/GrpcClientSettings$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/AkkaGrpcGenerated.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcChannel$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcChannel.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientCloseException.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientSettings$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientSettings.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcProtocol.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcResponseMetadata.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcServiceException$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcServiceException.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcSingleResponse.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/ProtobufSerializer.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/SSLContextUtils$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/ServiceDescription.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/Trailers$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/Trailers.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/javadsl/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientSettings$.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientSettings$.html)*