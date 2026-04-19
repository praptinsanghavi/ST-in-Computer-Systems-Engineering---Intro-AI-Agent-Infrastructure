---
description: Akka HTTP 10.7.4 - akka.http.javadsl.settings.ClientConnectionSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:06:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.settings.ClientConnectionSettings
---

# Akka HTTP 10.7.4 - akka.http.javadsl.settings.ClientConnectionSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.settings.ClientConnectionSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](index.html)Definition Classes[javadsl](../index.html)
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
- [SettingsCompanion](SettingsCompanion.html)
- [WebSocketSettings](WebSocketSettings.html "Public API but not intended for subclassing")
[c](ClientConnectionSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[settings](index.html)

# [ClientConnectionSettings](ClientConnectionSettings$.html "See companion object")[**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html "Permalink")

### Companion [object ClientConnectionSettings](ClientConnectionSettings$.html "See companion object")

#### abstract  class ClientConnectionSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Public API but not intended for subclassing

Self TypeClientConnectionSettingsImplAnnotations@DoNotInherit() Source[ClientConnectionSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/settings/ClientConnectionSettings.scala#L29)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClientConnectionSettings
2. AnyRef
3. Any
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

1. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#withConnectingTimeout(newValue:scala.concurrent.duration.FiniteDuration):akka.http.javadsl.settings.ClientConnectionSettings "Permalink") abstract  def withConnectingTimeout(newValue: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClientConnectionSettings
2. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#withIdleTimeout(newValue:scala.concurrent.duration.Duration):akka.http.javadsl.settings.ClientConnectionSettings "Permalink") abstract  def withIdleTimeout(newValue: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): ClientConnectionSettings
3. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#withRequestHeaderSizeHint(newValue:Int):akka.http.javadsl.settings.ClientConnectionSettings "Permalink") abstract  def withRequestHeaderSizeHint(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ClientConnectionSettings
4. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#withStreamCancellationDelay(newValue:scala.concurrent.duration.FiniteDuration):akka.http.javadsl.settings.ClientConnectionSettings "Permalink") abstract  def withStreamCancellationDelay(newValue: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClientConnectionSettings
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClientConnectionSettings toany2stringadd\[ClientConnectionSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClientConnectionSettings, B)ImplicitThis member is added by an implicit conversion from ClientConnectionSettings toArrowAssoc\[ClientConnectionSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClientConnectionSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClientConnectionSettingsImplicitThis member is added by an implicit conversion from ClientConnectionSettings toEnsuring\[ClientConnectionSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClientConnectionSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClientConnectionSettingsImplicitThis member is added by an implicit conversion from ClientConnectionSettings toEnsuring\[ClientConnectionSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClientConnectionSettingsImplicitThis member is added by an implicit conversion from ClientConnectionSettings toEnsuring\[ClientConnectionSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClientConnectionSettingsImplicitThis member is added by an implicit conversion from ClientConnectionSettings toEnsuring\[ClientConnectionSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#getConnectingTimeout:scala.concurrent.duration.FiniteDuration "Permalink") final  def getConnectingTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
16. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#getIdleTimeout:scala.concurrent.duration.Duration "Permalink") final  def getIdleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
17. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#getLocalAddress:java.util.Optional[java.net.InetSocketAddress] "Permalink") final  def getLocalAddress: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]
18. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#getLogUnencryptedNetworkBytes:java.util.Optional[Int] "Permalink") final  def getLogUnencryptedNetworkBytes: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
19. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#getParserSettings:akka.http.javadsl.settings.ParserSettings "Permalink") final  def getParserSettings: [ParserSettings](ParserSettings.html)
20. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#getRequestHeaderSizeHint:Int "Permalink") final  def getRequestHeaderSizeHint: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
21. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#getSocketOptions:Iterable[akka.io.Inet.SocketOption] "Permalink") final  def getSocketOptions: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[SocketOption]
22. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#getStreamCancellationDelay:scala.concurrent.duration.FiniteDuration "Permalink") final  def getStreamCancellationDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
23. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#getTransport:akka.http.javadsl.ClientTransport "Permalink")  def getTransport: [ClientTransport](../ClientTransport.html)The underlying transport used to connect to hosts.

The underlying transport used to connect to hosts. By default [ClientTransport.TCP](../ClientTransport$.html#TCP:akka.http.javadsl.ClientTransport) is used.

Annotations@ApiMayChange()
24. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#getUserAgentHeader:java.util.Optional[akka.http.javadsl.model.headers.UserAgent] "Permalink") final  def getUserAgentHeader: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[UserAgent](../model/headers/UserAgent.html)]
25. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#getWebsocketRandomFactory:java.util.function.Supplier[java.util.Random] "Permalink") final  def getWebsocketRandomFactory: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)]
26. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#getWebsocketSettings:akka.http.javadsl.settings.WebSocketSettings "Permalink") final  def getWebsocketSettings: [WebSocketSettings](WebSocketSettings.html)
27. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
29. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
30. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
34. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#withLocalAddress(newValue:java.util.Optional[java.net.InetSocketAddress]):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withLocalAddress(newValue: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]): ClientConnectionSettings
38. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#withLogUnencryptedNetworkBytes(newValue:java.util.Optional[Int]):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withLogUnencryptedNetworkBytes(newValue: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]): ClientConnectionSettings
39. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#withParserSettings(newValue:akka.http.javadsl.settings.ParserSettings):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withParserSettings(newValue: [ParserSettings](ParserSettings.html)): ClientConnectionSettings
40. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#withSocketOptions(newValue:Iterable[akka.io.Inet.SocketOption]):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withSocketOptions(newValue: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[SocketOption]): ClientConnectionSettings
41. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#withTransport(newValue:akka.http.javadsl.ClientTransport):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withTransport(newValue: [ClientTransport](../ClientTransport.html)): ClientConnectionSettingsAnnotations@ApiMayChange()
42. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#withUserAgentHeader(newValue:java.util.Optional[akka.http.javadsl.model.headers.UserAgent]):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withUserAgentHeader(newValue: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[UserAgent](../model/headers/UserAgent.html)]): ClientConnectionSettings
43. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#withWebsocketRandomFactory(newValue:java.util.function.Supplier[java.util.Random]):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withWebsocketRandomFactory(newValue: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)]): ClientConnectionSettings
44. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#withWebsocketSettings(newValue:akka.http.javadsl.settings.WebSocketSettings):akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def withWebsocketSettings(newValue: [WebSocketSettings](WebSocketSettings.html)): ClientConnectionSettings
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClientConnectionSettings toStringFormat\[ClientConnectionSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/settings/ClientConnectionSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClientConnectionSettings, B)ImplicitThis member is added by an implicit conversion from ClientConnectionSettings toArrowAssoc\[ClientConnectionSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClientConnectionSettings to any2stringadd\[ClientConnectionSettings]

### Inherited by implicit conversion StringFormat fromClientConnectionSettings to StringFormat\[ClientConnectionSettings]

### Inherited by implicit conversion Ensuring fromClientConnectionSettings to Ensuring\[ClientConnectionSettings]

### Inherited by implicit conversion ArrowAssoc fromClientConnectionSettings to ArrowAssoc\[ClientConnectionSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/UserAgent.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ConnectionPoolSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/CorsSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/Http2ClientSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/Http2ServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/Http2ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/HttpsProxySettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/HttpsProxySettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/PreviewServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/PreviewServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/SettingsCompanion.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/WebSocketSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ClientConnectionSettings.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ClientConnectionSettings.html)*