---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ClientConnectionSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:10:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ClientConnectionSettings
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ClientConnectionSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ClientConnectionSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](index.html)Definition Classes[scaladsl](../index.html)
- ClientConnectionSettings
- [ConnectionPoolSettings](ConnectionPoolSettings.html "Public API but not intended for subclassing")
- [CorsSettings](CorsSettings.html "Settings for the CORS support")
- [Http2ClientSettings](Http2ClientSettings.html)
- [Http2ServerSettings](Http2ServerSettings.html)
- [HttpsProxySettings](HttpsProxySettings.html "Public API but not intended for subclassing")
- [ParserSettings](ParserSettings.html "Public API but not intended for subclassing")
- [PreviewServerSettings](PreviewServerSettings.html "Public API but not intended for subclassing")
- [RoutingSettings](RoutingSettings.html "Public API but not intended for subclassing")
- [ServerSentEventSettings](ServerSentEventSettings.html "Public API but not intended for subclassing")
- [ServerSettings](ServerSettings.html "Public API but not intended for subclassing")
- [WebSocketSettings](WebSocketSettings.html)
[c](ClientConnectionSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[settings](index.html)

# [ClientConnectionSettings](ClientConnectionSettings$.html "See companion object")[**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html "Permalink")

### Companion [object ClientConnectionSettings](ClientConnectionSettings$.html "See companion object")

#### abstract  class ClientConnectionSettings extends [javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)

Public API but not intended for subclassing

Self TypeClientConnectionSettingsImplAnnotations@DoNotInherit() Source[ClientConnectionSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/settings/ClientConnectionSettings.scala#L27)Linear Supertypes[javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClientConnectionSettings
2. ClientConnectionSettings
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#connectingTimeout:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def connectingTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
2. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#http2Settings:akka.http.scaladsl.settings.Http2ClientSettings "Permalink") abstract  def http2Settings: [Http2ClientSettings](Http2ClientSettings.html)
3. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#idleTimeout:scala.concurrent.duration.Duration "Permalink") abstract  def idleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
4. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#localAddress:Option[java.net.InetSocketAddress] "Permalink") abstract  def localAddress: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]
5. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#logUnencryptedNetworkBytes:Option[Int] "Permalink") abstract  def logUnencryptedNetworkBytes: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
6. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#parserSettings:akka.http.scaladsl.settings.ParserSettings "Permalink") abstract  def parserSettings: [ParserSettings](ParserSettings.html)
7. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#requestHeaderSizeHint:Int "Permalink") abstract  def requestHeaderSizeHint: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
8. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#socketOptions:Seq[akka.io.Inet.SocketOption] "Permalink") abstract  def socketOptions: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[SocketOption]
9. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#streamCancellationDelay:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def streamCancellationDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
10. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#transport:akka.http.scaladsl.ClientTransport "Permalink") abstract  def transport: [ClientTransport](../ClientTransport.html)The underlying transport used to connect to hosts.

The underlying transport used to connect to hosts. By default [ClientTransport.TCP](../ClientTransport$.html#TCP:akka.http.scaladsl.ClientTransport) is used.

Annotations@ApiMayChange()
11. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#userAgentHeader:Option[akka.http.scaladsl.model.headers.User-Agent] "Permalink") abstract  def userAgentHeader: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[User\-Agent](../model/headers/User$minusAgent.html)]
12. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#websocketRandomFactory:()=>java.util.Random "Permalink") abstract  def websocketRandomFactory: () \=\> [Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)
13. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#websocketSettings:akka.http.scaladsl.settings.WebSocketSettings "Permalink") abstract  def websocketSettings: [WebSocketSettings](WebSocketSettings.html)
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClientConnectionSettings toany2stringadd\[ClientConnectionSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClientConnectionSettings, B)ImplicitThis member is added by an implicit conversion from ClientConnectionSettings toArrowAssoc\[ClientConnectionSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClientConnectionSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClientConnectionSettingsImplicitThis member is added by an implicit conversion from ClientConnectionSettings toEnsuring\[ClientConnectionSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClientConnectionSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClientConnectionSettingsImplicitThis member is added by an implicit conversion from ClientConnectionSettings toEnsuring\[ClientConnectionSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClientConnectionSettingsImplicitThis member is added by an implicit conversion from ClientConnectionSettings toEnsuring\[ClientConnectionSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClientConnectionSettingsImplicitThis member is added by an implicit conversion from ClientConnectionSettings toEnsuring\[ClientConnectionSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#getConnectingTimeout:scala.concurrent.duration.FiniteDuration "Permalink") final  def getConnectingTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
16. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#getIdleTimeout:scala.concurrent.duration.Duration "Permalink") final  def getIdleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
17. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#getLocalAddress:java.util.Optional[java.net.InetSocketAddress] "Permalink") final  def getLocalAddress: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
18. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#getLogUnencryptedNetworkBytes:java.util.Optional[Int] "Permalink") final  def getLogUnencryptedNetworkBytes: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
19. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#getParserSettings:akka.http.javadsl.settings.ParserSettings "Permalink") final  def getParserSettings: [javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
20. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#getRequestHeaderSizeHint:Int "Permalink") final  def getRequestHeaderSizeHint: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
21. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#getSocketOptions:Iterable[akka.io.Inet.SocketOption] "Permalink") final  def getSocketOptions: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[SocketOption]Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
22. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#getStreamCancellationDelay:scala.concurrent.duration.FiniteDuration "Permalink") final  def getStreamCancellationDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
23. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#getTransport:akka.http.javadsl.ClientTransport "Permalink")  def getTransport: [javadsl.ClientTransport](../../javadsl/ClientTransport.html)The underlying transport used to connect to hosts.

The underlying transport used to connect to hosts. By default [ClientTransport.TCP](../ClientTransport$.html#TCP:akka.http.scaladsl.ClientTransport) is used.

Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)Annotations@ApiMayChange()
24. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#getUserAgentHeader:java.util.Optional[akka.http.javadsl.model.headers.UserAgent] "Permalink") final  def getUserAgentHeader: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[UserAgent](../../javadsl/model/headers/UserAgent.html)]Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
25. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#getWebsocketRandomFactory:java.util.function.Supplier[java.util.Random] "Permalink") final  def getWebsocketRandomFactory: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)]Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
26. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#getWebsocketSettings:akka.http.javadsl.settings.WebSocketSettings "Permalink") final  def getWebsocketSettings: [javadsl.settings.WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
27. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
29. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#mapHttp2Settings(f:akka.http.scaladsl.settings.Http2ClientSettings=>akka.http.scaladsl.settings.Http2ClientSettings):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def mapHttp2Settings(f: ([Http2ClientSettings](Http2ClientSettings.html)) \=\> [Http2ClientSettings](Http2ClientSettings.html)): ClientConnectionSettings
30. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
31. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
35. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
37. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withConnectingTimeout(newValue:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withConnectingTimeout(newValue: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClientConnectionSettingsDefinition ClassesClientConnectionSettings → [ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
39. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withHttp2Settings(newValue:akka.http.scaladsl.settings.Http2ClientSettings):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withHttp2Settings(newValue: [Http2ClientSettings](Http2ClientSettings.html)): ClientConnectionSettings
40. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withIdleTimeout(newValue:scala.concurrent.duration.Duration):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withIdleTimeout(newValue: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): ClientConnectionSettingsDefinition ClassesClientConnectionSettings → [ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
41. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withLocalAddress(newValue:Option[java.net.InetSocketAddress]):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withLocalAddress(newValue: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]): ClientConnectionSettings
42. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withLocalAddress(newValue:java.util.Optional[java.net.InetSocketAddress]):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withLocalAddress(newValue: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]): [javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
43. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withLocalAddressOverride(overrideLocalAddressOption:Option[java.net.InetSocketAddress]):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withLocalAddressOverride(overrideLocalAddressOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]): ClientConnectionSettingsReturns a new instance with the given local address set if the given override is `Some(address)`, otherwise
return this instance unchanged.
44. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withLogUnencryptedNetworkBytes(newValue:Option[Int]):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withLogUnencryptedNetworkBytes(newValue: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]): ClientConnectionSettings
45. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withLogUnencryptedNetworkBytes(newValue:java.util.Optional[Int]):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withLogUnencryptedNetworkBytes(newValue: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]): [javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
46. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withParserSettings(newValue:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withParserSettings(newValue: [ParserSettings](ParserSettings.html)): ClientConnectionSettings
47. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withParserSettings(newValue:akka.http.javadsl.settings.ParserSettings):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withParserSettings(newValue: [javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html)): [javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
48. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withRequestHeaderSizeHint(newValue:Int):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withRequestHeaderSizeHint(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ClientConnectionSettingsDefinition ClassesClientConnectionSettings → [ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
49. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withSocketOptions(newValue:Seq[akka.io.Inet.SocketOption]):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withSocketOptions(newValue: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[SocketOption]): ClientConnectionSettings
50. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withSocketOptions(newValue:Iterable[akka.io.Inet.SocketOption]):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withSocketOptions(newValue: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[SocketOption]): [javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
51. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withStreamCancellationDelay(newValue:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withStreamCancellationDelay(newValue: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClientConnectionSettingsDefinition ClassesClientConnectionSettings → [ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
52. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withTransport(newTransport:akka.http.scaladsl.ClientTransport):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withTransport(newTransport: [ClientTransport](../ClientTransport.html)): ClientConnectionSettingsAnnotations@ApiMayChange()
53. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withTransport(newValue:akka.http.javadsl.ClientTransport):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withTransport(newValue: [javadsl.ClientTransport](../../javadsl/ClientTransport.html)): [javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)Annotations@ApiMayChange()
54. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withUserAgentHeader(newValue:Option[akka.http.scaladsl.model.headers.User-Agent]):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withUserAgentHeader(newValue: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[User\-Agent](../model/headers/User$minusAgent.html)]): ClientConnectionSettings
55. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withUserAgentHeader(newValue:java.util.Optional[akka.http.javadsl.model.headers.UserAgent]):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withUserAgentHeader(newValue: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[UserAgent](../../javadsl/model/headers/UserAgent.html)]): [javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
56. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withWebsocketRandomFactory(newValue:()=>java.util.Random):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withWebsocketRandomFactory(newValue: () \=\> [Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)): ClientConnectionSettings
57. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withWebsocketRandomFactory(newValue:java.util.function.Supplier[java.util.Random]):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withWebsocketRandomFactory(newValue: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)]): [javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
58. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withWebsocketSettings(newValue:akka.http.scaladsl.settings.WebSocketSettings):akka.http.scaladsl.settings.ClientConnectionSettings "Permalink")  def withWebsocketSettings(newValue: [WebSocketSettings](WebSocketSettings.html)): ClientConnectionSettings
59. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#withWebsocketSettings(newValue:akka.http.javadsl.settings.WebSocketSettings):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withWebsocketSettings(newValue: [javadsl.settings.WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)): [javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)Definition Classes[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClientConnectionSettings toStringFormat\[ClientConnectionSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/settings/ClientConnectionSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClientConnectionSettings, B)ImplicitThis member is added by an implicit conversion from ClientConnectionSettings toArrowAssoc\[ClientConnectionSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClientConnectionSettings to any2stringadd\[ClientConnectionSettings]

### Inherited by implicit conversion StringFormat fromClientConnectionSettings to StringFormat\[ClientConnectionSettings]

### Inherited by implicit conversion Ensuring fromClientConnectionSettings to Ensuring\[ClientConnectionSettings]

### Inherited by implicit conversion ArrowAssoc fromClientConnectionSettings to ArrowAssoc\[ClientConnectionSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/UserAgent.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/User$minusAgent.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/CorsSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/CorsSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/RoutingSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html)*