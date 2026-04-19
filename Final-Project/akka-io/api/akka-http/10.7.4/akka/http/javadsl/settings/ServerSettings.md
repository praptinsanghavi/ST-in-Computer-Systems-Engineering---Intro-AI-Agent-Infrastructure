---
description: Akka HTTP 10.7.4 - akka.http.javadsl.settings.ServerSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:06:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ServerSettings.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.settings.ServerSettings
---

# Akka HTTP 10.7.4 - akka.http.javadsl.settings.ServerSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.settings.ServerSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](index.html)Definition Classes[javadsl](../index.html)
- [ClientConnectionSettings](ClientConnectionSettings.html "Public API but not intended for subclassing")
- [ConnectionPoolSettings](ConnectionPoolSettings.html "Public API but not intended for subclassing")
- [CorsSettings](CorsSettings.html "Settings for the CORS support")
- [Http2ClientSettings](Http2ClientSettings.html)
- [Http2ServerSettings](Http2ServerSettings.html)
- [HttpsProxySettings](HttpsProxySettings.html "Public API but not intended for subclassing")
- [ParserSettings](ParserSettings.html "Public API but not intended for subclassing")
- [PreviewServerSettings](PreviewServerSettings.html "Public API but not intended for subclassing")
- [RoutingSettings](RoutingSettings.html "Public API but not intended for subclassing")
- [ServerSentEventSettings](ServerSentEventSettings.html "Public API but not intended for subclassing")
- ServerSettings
- [SettingsCompanion](SettingsCompanion.html)
- [WebSocketSettings](WebSocketSettings.html "Public API but not intended for subclassing")
[c](ServerSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[settings](index.html)

# [ServerSettings](ServerSettings$.html "See companion object")[**](../../../../akka/http/javadsl/settings/ServerSettings.html "Permalink")

### Companion [object ServerSettings](ServerSettings$.html "See companion object")

#### abstract  class ServerSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Public API but not intended for subclassing

Self TypeServerSettingsImplAnnotations@DoNotInherit() Source[ServerSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/settings/ServerSettings.scala#L26)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ServerSettings](../../scaladsl/settings/ServerSettings.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServerSettings
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
### Instance Constructors

1. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#<init>():akka.http.javadsl.settings.ServerSettings "Permalink")  new ServerSettings()
### Abstract Value Members

1. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getBacklog:Int "Permalink") abstract  def getBacklog: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
2. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getDefaultHostHeader:akka.http.javadsl.model.headers.Host "Permalink") abstract  def getDefaultHostHeader: [Host](../model/headers/Host.html)
3. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getDefaultHttpPort:Int "Permalink") abstract  def getDefaultHttpPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
4. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getDefaultHttpsPort:Int "Permalink") abstract  def getDefaultHttpsPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
5. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getLogUnencryptedNetworkBytes:java.util.Optional[Int] "Permalink") abstract  def getLogUnencryptedNetworkBytes: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
6. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getMaxConnections:Int "Permalink") abstract  def getMaxConnections: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
7. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getParserSettings:akka.http.javadsl.settings.ParserSettings "Permalink") abstract  def getParserSettings: [ParserSettings](ParserSettings.html)
8. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getParsingErrorHandler:String "Permalink") abstract  def getParsingErrorHandler: String
9. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getPipeliningLimit:Int "Permalink") abstract  def getPipeliningLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
10. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getPreviewServerSettings:akka.http.javadsl.settings.PreviewServerSettings "Permalink") abstract  def getPreviewServerSettings: [PreviewServerSettings](PreviewServerSettings.html)
11. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getRawRequestUriHeader:Boolean "Permalink") abstract  def getRawRequestUriHeader: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
12. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getRemoteAddressAttribute:Boolean "Permalink") abstract  def getRemoteAddressAttribute: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
13. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getResponseHeaderSizeHint:Int "Permalink") abstract  def getResponseHeaderSizeHint: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
14. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getServerHeader:java.util.Optional[akka.http.javadsl.model.headers.Server] "Permalink") abstract  def getServerHeader: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Server](../model/headers/Server.html)]
15. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getSocketOptions:Iterable[akka.io.Inet.SocketOption] "Permalink") abstract  def getSocketOptions: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[SocketOption]
16. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getStreamCancellationDelay:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def getStreamCancellationDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
17. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getTerminationDeadlineExceededResponse:akka.http.javadsl.model.HttpResponse "Permalink") abstract  def getTerminationDeadlineExceededResponse: [HttpResponse](../model/HttpResponse.html)
18. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getTimeouts:akka.http.javadsl.settings.ServerSettings.Timeouts "Permalink") abstract  def getTimeouts: [Timeouts](ServerSettings$$Timeouts.html)
19. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getTransparentHeadRequests:Boolean "Permalink") abstract  def getTransparentHeadRequests: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
20. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getVerboseErrorMessages:Boolean "Permalink") abstract  def getVerboseErrorMessages: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
21. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getWebsocketSettings:akka.http.javadsl.settings.WebSocketSettings "Permalink") abstract  def getWebsocketSettings: [WebSocketSettings](WebSocketSettings.html)
22. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#http2Enabled:Boolean "Permalink") abstract  def http2Enabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
23. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getRemoteAddressHeader:Boolean "Permalink") abstract  def getRemoteAddressHeader: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Use remoteAddressAttribute instead
24. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getWebsocketRandomFactory:java.util.function.Supplier[java.util.Random] "Permalink") abstract  def getWebsocketRandomFactory: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)]Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Kept for binary compatibility; Use websocketSettings.getRandomFactory instead
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/settings/ServerSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ServerSettings toany2stringadd\[ServerSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ServerSettings, B)ImplicitThis member is added by an implicit conversion from ServerSettings toArrowAssoc\[ServerSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ServerSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServerSettingsImplicitThis member is added by an implicit conversion from ServerSettings toEnsuring\[ServerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ServerSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerSettingsImplicitThis member is added by an implicit conversion from ServerSettings toEnsuring\[ServerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServerSettingsImplicitThis member is added by an implicit conversion from ServerSettings toEnsuring\[ServerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerSettingsImplicitThis member is added by an implicit conversion from ServerSettings toEnsuring\[ServerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#getHttp2Settings:akka.http.javadsl.settings.Http2ServerSettings "Permalink")  def getHttp2Settings: [Http2ServerSettings](Http2ServerSettings.html)
16. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withBacklog(newValue:Int):akka.http.javadsl.settings.ServerSettings "Permalink")  def withBacklog(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ServerSettings
27. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withDefaultHostHeader(newValue:akka.http.javadsl.model.headers.Host):akka.http.javadsl.settings.ServerSettings "Permalink")  def withDefaultHostHeader(newValue: [Host](../model/headers/Host.html)): ServerSettings
28. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withDefaultHttpPort(newValue:Int):akka.http.javadsl.settings.ServerSettings "Permalink")  def withDefaultHttpPort(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ServerSettings
29. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withDefaultHttpsPort(newValue:Int):akka.http.javadsl.settings.ServerSettings "Permalink")  def withDefaultHttpsPort(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ServerSettings
30. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withHttp2Enabled(enabled:Boolean):akka.http.javadsl.settings.ServerSettings "Permalink")  def withHttp2Enabled(enabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerSettings
31. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withHttp2Settings(newValue:akka.http.javadsl.settings.Http2ServerSettings):akka.http.javadsl.settings.ServerSettings "Permalink")  def withHttp2Settings(newValue: [Http2ServerSettings](Http2ServerSettings.html)): ServerSettings
32. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withLogUnencryptedNetworkBytes(newValue:java.util.Optional[Int]):akka.http.javadsl.settings.ServerSettings "Permalink")  def withLogUnencryptedNetworkBytes(newValue: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]): ServerSettings
33. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withMaxConnections(newValue:Int):akka.http.javadsl.settings.ServerSettings "Permalink")  def withMaxConnections(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ServerSettings
34. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withParserSettings(newValue:akka.http.javadsl.settings.ParserSettings):akka.http.javadsl.settings.ServerSettings "Permalink")  def withParserSettings(newValue: [ParserSettings](ParserSettings.html)): ServerSettings
35. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withParsingErrorHandler(newValue:String):akka.http.javadsl.settings.ServerSettings "Permalink")  def withParsingErrorHandler(newValue: String): ServerSettings
36. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withPipeliningLimit(newValue:Int):akka.http.javadsl.settings.ServerSettings "Permalink")  def withPipeliningLimit(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ServerSettings
37. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withPreviewServerSettings(newValue:akka.http.javadsl.settings.PreviewServerSettings):akka.http.javadsl.settings.ServerSettings "Permalink")  def withPreviewServerSettings(newValue: [PreviewServerSettings](PreviewServerSettings.html)): ServerSettings
38. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withRawRequestUriHeader(newValue:Boolean):akka.http.javadsl.settings.ServerSettings "Permalink")  def withRawRequestUriHeader(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerSettings
39. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withRemoteAddressAttribute(newValue:Boolean):akka.http.javadsl.settings.ServerSettings "Permalink")  def withRemoteAddressAttribute(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerSettings
40. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withRemoteAddressHeader(newValue:Boolean):akka.http.javadsl.settings.ServerSettings "Permalink")  def withRemoteAddressHeader(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerSettings
41. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withResponseHeaderSizeHint(newValue:Int):akka.http.javadsl.settings.ServerSettings "Permalink")  def withResponseHeaderSizeHint(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ServerSettings
42. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withServerHeader(newValue:java.util.Optional[akka.http.javadsl.model.headers.Server]):akka.http.javadsl.settings.ServerSettings "Permalink")  def withServerHeader(newValue: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Server](../model/headers/Server.html)]): ServerSettings
43. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withSocketOptions(newValue:Iterable[akka.io.Inet.SocketOption]):akka.http.javadsl.settings.ServerSettings "Permalink")  def withSocketOptions(newValue: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[SocketOption]): ServerSettings
44. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withStreamCancellationDelay(newValue:scala.concurrent.duration.FiniteDuration):akka.http.javadsl.settings.ServerSettings "Permalink")  def withStreamCancellationDelay(newValue: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ServerSettings
45. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withTerminationDeadlineExceededResponse(response:akka.http.javadsl.model.HttpResponse):akka.http.javadsl.settings.ServerSettings "Permalink")  def withTerminationDeadlineExceededResponse(response: [HttpResponse](../model/HttpResponse.html)): ServerSettings
46. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withTimeouts(newValue:akka.http.javadsl.settings.ServerSettings.Timeouts):akka.http.javadsl.settings.ServerSettings "Permalink")  def withTimeouts(newValue: [Timeouts](ServerSettings$$Timeouts.html)): ServerSettings
47. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withTransparentHeadRequests(newValue:Boolean):akka.http.javadsl.settings.ServerSettings "Permalink")  def withTransparentHeadRequests(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerSettings
48. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withVerboseErrorMessages(newValue:Boolean):akka.http.javadsl.settings.ServerSettings "Permalink")  def withVerboseErrorMessages(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerSettings
49. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withWebsocketSettings(newValue:akka.http.javadsl.settings.WebSocketSettings):akka.http.javadsl.settings.ServerSettings "Permalink")  def withWebsocketSettings(newValue: [WebSocketSettings](WebSocketSettings.html)): ServerSettings
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ServerSettings toStringFormat\[ServerSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#withWebsocketRandomFactory(newValue:java.util.function.Supplier[java.util.Random]):akka.http.javadsl.settings.ServerSettings "Permalink")  def withWebsocketRandomFactory(newValue: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)]): ServerSettingsAnnotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Kept for binary compatibility; Use websocketSettings.withRandomFactoryFactory instead
4. [**](../../../../akka/http/javadsl/settings/ServerSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ServerSettings, B)ImplicitThis member is added by an implicit conversion from ServerSettings toArrowAssoc\[ServerSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromServerSettings to any2stringadd\[ServerSettings]

### Inherited by implicit conversion StringFormat fromServerSettings to StringFormat\[ServerSettings]

### Inherited by implicit conversion Ensuring fromServerSettings to Ensuring\[ServerSettings]

### Inherited by implicit conversion ArrowAssoc fromServerSettings to ArrowAssoc\[ServerSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/Server.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ServerSettings$$Timeouts.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/SettingsCompanion.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/WebSocketSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ServerSettings.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ServerSettings.html)*