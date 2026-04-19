---
description: Akka gRPC 2.5.10 - akka.grpc.GrpcClientSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientSettings.html
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
- GrpcClientSettings
- [GrpcProtocol](GrpcProtocol.html "A variant of the gRPC protocol - e.g.")
- [GrpcResponseMetadata](GrpcResponseMetadata.html "Represents the metadata related to a gRPC call with a streaming response")
- [GrpcServiceException](GrpcServiceException.html)
- [GrpcSingleResponse](GrpcSingleResponse.html "Represents the metadata related to a gRPC call with a single response value")
- [ProtobufSerializer](ProtobufSerializer.html)
- [SSLContextUtils](SSLContextUtils$.html)
- [ServiceDescription](ServiceDescription.html)
- [Trailers](Trailers.html)
[c](GrpcClientSettings$.html "See companion object")[akka](../index.html).[grpc](index.html)

# [GrpcClientSettings](GrpcClientSettings$.html "See companion object")[**](../../akka/grpc/GrpcClientSettings.html "Permalink")

### Companion [object GrpcClientSettings](GrpcClientSettings$.html "See companion object")

#### final  class GrpcClientSettings extends AnyRef

Annotations@ApiMayChange() Source[GrpcClientSettings.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/GrpcClientSettings.scala#L197)Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
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

1. [**](../../akka/grpc/GrpcClientSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../akka/grpc/GrpcClientSettings.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../akka/grpc/GrpcClientSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../akka/grpc/GrpcClientSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/grpc/GrpcClientSettings.html#backend:String "Permalink")  val backend: String
6. [**](../../akka/grpc/GrpcClientSettings.html#callCredentials:Option[io.grpc.CallCredentials] "Permalink")  val callCredentials: Option\[CallCredentials]
7. [**](../../akka/grpc/GrpcClientSettings.html#channelBuilderOverrides:io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder=>io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder "Permalink")  val channelBuilderOverrides: (NettyChannelBuilder) \=\> NettyChannelBuilder
8. [**](../../akka/grpc/GrpcClientSettings.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
9. [**](../../akka/grpc/GrpcClientSettings.html#connectionAttempts:Option[Int] "Permalink")  val connectionAttempts: Option\[Int]
10. [**](../../akka/grpc/GrpcClientSettings.html#deadline:scala.concurrent.duration.Duration "Permalink")  val deadline: Duration
11. [**](../../akka/grpc/GrpcClientSettings.html#defaultPort:Int "Permalink")  val defaultPort: Int
12. [**](../../akka/grpc/GrpcClientSettings.html#discoveryRefreshInterval:Option[scala.concurrent.duration.FiniteDuration] "Permalink")  val discoveryRefreshInterval: Option\[FiniteDuration]
13. [**](../../akka/grpc/GrpcClientSettings.html#eagerConnection:Boolean "Permalink")  val eagerConnection: Boolean
14. [**](../../akka/grpc/GrpcClientSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
15. [**](../../akka/grpc/GrpcClientSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
16. [**](../../akka/grpc/GrpcClientSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
17. [**](../../akka/grpc/GrpcClientSettings.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
18. [**](../../akka/grpc/GrpcClientSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
19. [**](../../akka/grpc/GrpcClientSettings.html#loadBalancingPolicy:Option[String] "Permalink")  val loadBalancingPolicy: Option\[String]
20. [**](../../akka/grpc/GrpcClientSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
21. [**](../../akka/grpc/GrpcClientSettings.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
22. [**](../../akka/grpc/GrpcClientSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
23. [**](../../akka/grpc/GrpcClientSettings.html#overrideAuthority:Option[String] "Permalink")  val overrideAuthority: Option\[String]
24. [**](../../akka/grpc/GrpcClientSettings.html#resolveTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val resolveTimeout: FiniteDuration
25. [**](../../akka/grpc/GrpcClientSettings.html#serviceDiscovery:akka.discovery.ServiceDiscovery "Permalink")  val serviceDiscovery: ServiceDiscovery
26. [**](../../akka/grpc/GrpcClientSettings.html#serviceName:String "Permalink")  val serviceName: String
27. [**](../../akka/grpc/GrpcClientSettings.html#servicePortName:Option[String] "Permalink")  val servicePortName: Option\[String]
28. [**](../../akka/grpc/GrpcClientSettings.html#serviceProtocol:Option[String] "Permalink")  val serviceProtocol: Option\[String]
29. [**](../../akka/grpc/GrpcClientSettings.html#sslContext:Option[javax.net.ssl.SSLContext] "Permalink")  val sslContext: Option\[[SSLContext](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)]
30. [**](../../akka/grpc/GrpcClientSettings.html#sslContextProvider:Option[()=>javax.net.ssl.SSLContext] "Permalink")  val sslContextProvider: Option\[() \=\> [SSLContext](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)]
31. [**](../../akka/grpc/GrpcClientSettings.html#sslProvider:Option[io.grpc.netty.shaded.io.netty.handler.ssl.SslProvider] "Permalink")  val sslProvider: Option\[SslProvider]
32. [**](../../akka/grpc/GrpcClientSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../akka/grpc/GrpcClientSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
34. [**](../../akka/grpc/GrpcClientSettings.html#trustManager:Option[javax.net.ssl.TrustManager] "Permalink")  val trustManager: Option\[[TrustManager](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/javax/net/ssl/TrustManager.html#javax.net.ssl.TrustManager)]
35. [**](../../akka/grpc/GrpcClientSettings.html#useTls:Boolean "Permalink")  val useTls: Boolean
36. [**](../../akka/grpc/GrpcClientSettings.html#userAgent:Option[String] "Permalink")  val userAgent: Option\[String]
37. [**](../../akka/grpc/GrpcClientSettings.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../akka/grpc/GrpcClientSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
39. [**](../../akka/grpc/GrpcClientSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
40. [**](../../akka/grpc/GrpcClientSettings.html#withBackend(value:String):akka.grpc.GrpcClientSettings "Permalink")  def withBackend(value: String): GrpcClientSettingsAnnotations@ApiMayChange()
41. [**](../../akka/grpc/GrpcClientSettings.html#withCallCredentials(value:io.grpc.CallCredentials):akka.grpc.GrpcClientSettings "Permalink")  def withCallCredentials(value: CallCredentials): GrpcClientSettings
42. [**](../../akka/grpc/GrpcClientSettings.html#withChannelBuilderOverrides(builderOverrides:io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder=>io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder):akka.grpc.GrpcClientSettings "Permalink")  def withChannelBuilderOverrides(builderOverrides: (NettyChannelBuilder) \=\> NettyChannelBuilder): GrpcClientSettingsTo override any default channel configurations used by netty.

To override any default channel configurations used by netty. Only for power users.
API may change when io.grpc:grpc\-netty\-shaded is replaced by io.grpc:grpc\-core and Akka HTTP.

Annotations@ApiMayChange()
43. [**](../../akka/grpc/GrpcClientSettings.html#withConnectionAttempts(value:Int):akka.grpc.GrpcClientSettings "Permalink")  def withConnectionAttempts(value: Int): GrpcClientSettingsHow many times to retry establishing a connection before failing the client
Failure can be monitored using client.stopped and monitoring the Future/CompletionStage.

How many times to retry establishing a connection before failing the client
Failure can be monitored using client.stopped and monitoring the Future/CompletionStage.
An exponentially increasing backoff is used between attempts.
44. [**](../../akka/grpc/GrpcClientSettings.html#withDeadline(value:java.time.Duration):akka.grpc.GrpcClientSettings "Permalink")  def withDeadline(value: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): GrpcClientSettingsEach call will have this deadline.
45. [**](../../akka/grpc/GrpcClientSettings.html#withDeadline(value:scala.concurrent.duration.Duration):akka.grpc.GrpcClientSettings "Permalink")  def withDeadline(value: Duration): GrpcClientSettingsEach call will have this deadline.
46. [**](../../akka/grpc/GrpcClientSettings.html#withDefaultPort(value:Int):akka.grpc.GrpcClientSettings "Permalink")  def withDefaultPort(value: Int): GrpcClientSettingsIf using ServiceDiscovery and no port is returned use this one.
47. [**](../../akka/grpc/GrpcClientSettings.html#withDiscoveryRefreshInterval(refreshInterval:java.time.Duration):akka.grpc.GrpcClientSettings "Permalink")  def withDiscoveryRefreshInterval(refreshInterval: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration)): GrpcClientSettingsJava API: Set this to a duration to trigger periodic refresh of the resolved endpoints, evicting cached entries
if the discovery mechanism supports that.

Java API: Set this to a duration to trigger periodic refresh of the resolved endpoints, evicting cached entries
if the discovery mechanism supports that. The default is no periodic refresh and instead
only does refresh when the client implementation decides to.

Currently only supported by the Netty client backend.

Annotations@ApiMayChange()
48. [**](../../akka/grpc/GrpcClientSettings.html#withDiscoveryRefreshInterval(refreshInterval:scala.concurrent.duration.FiniteDuration):akka.grpc.GrpcClientSettings "Permalink")  def withDiscoveryRefreshInterval(refreshInterval: FiniteDuration): GrpcClientSettingsScala API: Set this to a duration to trigger periodic refresh of the resolved endpoints, evicting cached entries
if the discovery mechanism supports that.

Scala API: Set this to a duration to trigger periodic refresh of the resolved endpoints, evicting cached entries
if the discovery mechanism supports that. The default is no periodic refresh and instead
\* only does refresh when the client implementation decides to.

Currently only supported by the Netty client backend.

Annotations@ApiMayChange()
49. [**](../../akka/grpc/GrpcClientSettings.html#withEagerConnection(eagerConnection:Boolean):akka.grpc.GrpcClientSettings "Permalink")  def withEagerConnection(eagerConnection: Boolean): GrpcClientSettingsRequest that the client try to connect the service immediately when the client is created
rather than on the first request.

Request that the client try to connect the service immediately when the client is created
rather than on the first request. Only supported for the Netty client backend, the akka\-http client backend
is always eager.
50. [**](../../akka/grpc/GrpcClientSettings.html#withLoadBalancingPolicy(loadBalancingPolicy:String):akka.grpc.GrpcClientSettings "Permalink")  def withLoadBalancingPolicy(loadBalancingPolicy: String): GrpcClientSettings
51. [**](../../akka/grpc/GrpcClientSettings.html#withOverrideAuthority(value:String):akka.grpc.GrpcClientSettings "Permalink")  def withOverrideAuthority(value: String): GrpcClientSettings
52. [**](../../akka/grpc/GrpcClientSettings.html#withResolveTimeout(value:scala.concurrent.duration.FiniteDuration):akka.grpc.GrpcClientSettings "Permalink")  def withResolveTimeout(value: FiniteDuration): GrpcClientSettings
53. [**](../../akka/grpc/GrpcClientSettings.html#withServicePortName(servicePortName:String):akka.grpc.GrpcClientSettings "Permalink")  def withServicePortName(servicePortName: String): GrpcClientSettingsWhen using service discovery, port name is the optional parameter to filter the requests.

When using service discovery, port name is the optional parameter to filter the requests. Looking up a service
may return multiple ports (http/https/...) if the remote process only serves the grpc service on a specific port
you must use this setting.
54. [**](../../akka/grpc/GrpcClientSettings.html#withServiceProtocol(serviceProtocol:String):akka.grpc.GrpcClientSettings "Permalink")  def withServiceProtocol(serviceProtocol: String): GrpcClientSettings
55. [**](../../akka/grpc/GrpcClientSettings.html#withSslContext(sslContext:javax.net.ssl.SSLContext):akka.grpc.GrpcClientSettings "Permalink")  def withSslContext(sslContext: [SSLContext](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)): GrpcClientSettings
56. [**](../../akka/grpc/GrpcClientSettings.html#withSslContextCreator(provider:akka.japi.function.Creator[javax.net.ssl.SSLContext]):akka.grpc.GrpcClientSettings "Permalink")  def withSslContextCreator(provider: Creator\[[SSLContext](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)]): GrpcClientSettingsJava API: For each new client connection, invoke this provider to set up TLS, useful for example for using rotating
certs for the client provided by `SSLContextFactory.refreshingSSLEngineProvider`.

Java API: For each new client connection, invoke this provider to set up TLS, useful for example for using rotating
certs for the client provided by `SSLContextFactory.refreshingSSLEngineProvider`.

When setting this the other TLS settings (`sslContext`,`tlsManager`) must not be set.
57. [**](../../akka/grpc/GrpcClientSettings.html#withSslContextProvider(provider:()=>javax.net.ssl.SSLContext):akka.grpc.GrpcClientSettings "Permalink")  def withSslContextProvider(provider: () \=\> [SSLContext](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)): GrpcClientSettingsScala API: For each new client connection, invoke this provider to set up TLS, useful for example for using rotating
certs for the client provided by `SSLContextFactory.refreshingSSLEngineProvider`.

Scala API: For each new client connection, invoke this provider to set up TLS, useful for example for using rotating
certs for the client provided by `SSLContextFactory.refreshingSSLEngineProvider`.

When setting this the other TLS settings (`sslContext`,`tlsManager`) must not be set.
58. [**](../../akka/grpc/GrpcClientSettings.html#withSslProvider(sslProvider:io.grpc.netty.shaded.io.netty.handler.ssl.SslProvider):akka.grpc.GrpcClientSettings "Permalink")  def withSslProvider(sslProvider: SslProvider): GrpcClientSettingsNote: Netty client backend specific setting
59. [**](../../akka/grpc/GrpcClientSettings.html#withTls(enabled:Boolean):akka.grpc.GrpcClientSettings "Permalink")  def withTls(enabled: Boolean): GrpcClientSettingsSet to false to use unencrypted HTTP/2\.

Set to false to use unencrypted HTTP/2\. This should not be used in production system.
60. [**](../../akka/grpc/GrpcClientSettings.html#withTrustManager(trustManager:javax.net.ssl.TrustManager):akka.grpc.GrpcClientSettings "Permalink")  def withTrustManager(trustManager: [TrustManager](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/javax/net/ssl/TrustManager.html#javax.net.ssl.TrustManager)): GrpcClientSettings
61. [**](../../akka/grpc/GrpcClientSettings.html#withUserAgent(value:String):akka.grpc.GrpcClientSettings "Permalink")  def withUserAgent(value: String): GrpcClientSettingsProvides a custom `User-Agent` for the application.

Provides a custom `User-Agent` for the application.

It's an optional parameter. The library will provide a user agent independent of this
option. If provided, the given agent will prepend the library's user agent information.
### Deprecated Value Members

1. [**](../../akka/grpc/GrpcClientSettings.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/grpc/GrpcClientSettings.html#withGrpcLoadBalancingType(loadBalancingType:String):akka.grpc.GrpcClientSettings "Permalink")  def withGrpcLoadBalancingType(loadBalancingType: String): GrpcClientSettingsAnnotations@deprecated Deprecated*(Since version 1\.0\.0\)* use withLoadBalancingPolicy
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
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientSettings.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/GrpcClientSettings.html)*