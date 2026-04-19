---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.WebSocketSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.WebSocketSettings
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.settings.WebSocketSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.settings.WebSocketSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](index.html)Definition Classes[scaladsl](../index.html)
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
- [ServerSettings](ServerSettings.html "Public API but not intended for subclassing")
- WebSocketSettings
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[settings](index.html)

# WebSocketSettings[**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html "Permalink")

### 

#### abstract  class WebSocketSettings extends [javadsl.settings.WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)

Self TypeWebSocketSettingsImplAnnotations@DoNotInherit() Source[WebSocketSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/settings/WebSocketSettings.scala#L16)Linear Supertypes[javadsl.settings.WebSocketSettings](../../javadsl/settings/WebSocketSettings.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. WebSocketSettings
2. WebSocketSettings
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
### Instance Constructors

1. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#<init>():akka.http.scaladsl.settings.WebSocketSettings "Permalink")  new WebSocketSettings()
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#logFrames:Boolean "Permalink") abstract  def logFrames: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesWebSocketSettings → [WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)
2. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#periodicKeepAliveData:()=>akka.util.ByteString "Permalink") abstract  def periodicKeepAliveData: () \=\> [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)The provided function will be invoked for each new keep\-alive frame that is sent.

The provided function will be invoked for each new keep\-alive frame that is sent.
The ByteString will be included in the Ping or Pong frame sent as heartbeat,
so keep in mind to keep it relatively small, in order not to make the frames too bloated.
3. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#periodicKeepAliveMaxIdle:scala.concurrent.duration.Duration "Permalink") abstract  def periodicKeepAliveMaxIdle: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Definition ClassesWebSocketSettings → [WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)
4. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#periodicKeepAliveMode:String "Permalink") abstract  def periodicKeepAliveMode: StringDefinition ClassesWebSocketSettings → [WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)
5. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#randomFactory:()=>java.util.Random "Permalink") abstract  def randomFactory: () \=\> [Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)
6. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#receiveIdleTimeout:scala.concurrent.duration.Duration "Permalink") abstract  def receiveIdleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Definition ClassesWebSocketSettings → [WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)
7. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#sendIdleTimeout:scala.concurrent.duration.Duration "Permalink") abstract  def sendIdleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Definition ClassesWebSocketSettings → [WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from WebSocketSettings toany2stringadd\[WebSocketSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (WebSocketSettings, B)ImplicitThis member is added by an implicit conversion from WebSocketSettings toArrowAssoc\[WebSocketSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (WebSocketSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WebSocketSettingsImplicitThis member is added by an implicit conversion from WebSocketSettings toEnsuring\[WebSocketSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (WebSocketSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WebSocketSettingsImplicitThis member is added by an implicit conversion from WebSocketSettings toEnsuring\[WebSocketSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WebSocketSettingsImplicitThis member is added by an implicit conversion from WebSocketSettings toEnsuring\[WebSocketSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WebSocketSettingsImplicitThis member is added by an implicit conversion from WebSocketSettings toEnsuring\[WebSocketSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#getPeriodicKeepAliveData:java.util.function.Supplier[akka.util.ByteString] "Permalink") final  def getPeriodicKeepAliveData: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]The provided supplier will be invoked for each new keep\-alive frame that is sent.

The provided supplier will be invoked for each new keep\-alive frame that is sent.
The ByteString will be included in the Ping or Pong frame sent as heartbeat,
so keep in mind to keep it relatively small, in order not to make the frames too bloated.

Definition ClassesWebSocketSettings → [WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)
16. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#getRandomFactory:java.util.function.Supplier[java.util.Random] "Permalink") final  val getRandomFactory: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)]Definition ClassesWebSocketSettings → [WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)
17. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#withLogFrames(shouldLog:Boolean):akka.http.scaladsl.settings.WebSocketSettings "Permalink")  def withLogFrames(shouldLog: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WebSocketSettingsDefinition ClassesWebSocketSettings → [WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)
28. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#withPeriodicKeepAliveData(newValue:()=>akka.util.ByteString):akka.http.scaladsl.settings.WebSocketSettings "Permalink")  def withPeriodicKeepAliveData(newValue: () \=\> [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)): WebSocketSettings
29. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#withPeriodicKeepAliveData(newValue:java.util.function.Supplier[akka.util.ByteString]):akka.http.javadsl.settings.WebSocketSettings "Permalink")  def withPeriodicKeepAliveData(newValue: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]): [javadsl.settings.WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)Definition Classes[WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)
30. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#withPeriodicKeepAliveMaxIdle(newValue:scala.concurrent.duration.Duration):akka.http.scaladsl.settings.WebSocketSettings "Permalink")  def withPeriodicKeepAliveMaxIdle(newValue: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): WebSocketSettingsDefinition ClassesWebSocketSettings → [WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)
31. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#withPeriodicKeepAliveMode(newValue:String):akka.http.scaladsl.settings.WebSocketSettings "Permalink")  def withPeriodicKeepAliveMode(newValue: String): WebSocketSettingsDefinition ClassesWebSocketSettings → [WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)
32. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#withRandomFactoryFactory(newValue:java.util.function.Supplier[java.util.Random]):akka.http.scaladsl.settings.WebSocketSettings "Permalink")  def withRandomFactoryFactory(newValue: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)]): WebSocketSettingsDefinition ClassesWebSocketSettings → [WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from WebSocketSettings toStringFormat\[WebSocketSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/settings/WebSocketSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (WebSocketSettings, B)ImplicitThis member is added by an implicit conversion from WebSocketSettings toArrowAssoc\[WebSocketSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.settings.WebSocketSettings](../../javadsl/settings/WebSocketSettings.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromWebSocketSettings to any2stringadd\[WebSocketSettings]

### Inherited by implicit conversion StringFormat fromWebSocketSettings to StringFormat\[WebSocketSettings]

### Inherited by implicit conversion Ensuring fromWebSocketSettings to Ensuring\[WebSocketSettings]

### Inherited by implicit conversion ArrowAssoc fromWebSocketSettings to ArrowAssoc\[WebSocketSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ConnectionPoolSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/CorsSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/CorsSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ClientSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ClientSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/HttpsProxySettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/HttpsProxySettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/PreviewServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/PreviewServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSentEventSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/WebSocketSettings.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/WebSocketSettings.html)*