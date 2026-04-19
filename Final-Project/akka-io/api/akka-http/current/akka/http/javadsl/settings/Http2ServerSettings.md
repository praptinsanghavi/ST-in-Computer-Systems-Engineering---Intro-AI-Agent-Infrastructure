---
description: Akka HTTP 10.7.4 - akka.http.javadsl.settings.Http2ServerSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:11:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.settings.Http2ServerSettings
---

# Akka HTTP 10.7.4 - akka.http.javadsl.settings.Http2ServerSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.settings.Http2ServerSettings

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
- Http2ServerSettings
- [HttpsProxySettings](HttpsProxySettings.html "Public API but not intended for subclassing")
- [ParserSettings](ParserSettings.html "Public API but not intended for subclassing")
- [PreviewServerSettings](PreviewServerSettings.html "Public API but not intended for subclassing")
- [RoutingSettings](RoutingSettings.html "Public API but not intended for subclassing")
- [ServerSentEventSettings](ServerSentEventSettings.html "Public API but not intended for subclassing")
- [ServerSettings](ServerSettings.html "Public API but not intended for subclassing")
- [SettingsCompanion](SettingsCompanion.html)
- [WebSocketSettings](WebSocketSettings.html "Public API but not intended for subclassing")
[t](Http2ServerSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[settings](index.html)

# [Http2ServerSettings](Http2ServerSettings$.html "See companion object")[**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html "Permalink")

### Companion [object Http2ServerSettings](Http2ServerSettings$.html "See companion object")

#### trait Http2ServerSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Self Type[scaladsl.settings.Http2ServerSettings](../../scaladsl/settings/Http2ServerSettings.html) with Http2ServerSettingsImplAnnotations@DoNotInherit() Source[Http2ServerSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/settings/Http2ServerSettings.scala#L15)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Http2ServerSettings](../../scaladsl/settings/Http2ServerSettings.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Http2ServerSettings
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

1. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#logFrames:Boolean "Permalink") abstract  def logFrames: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
2. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#maxResets:Int "Permalink") abstract  def maxResets: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
3. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#minCollectStrictEntitySize:Int "Permalink") abstract  def minCollectStrictEntitySize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
4. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#withIncomingConnectionLevelBufferSize(newIncomingConnectionLevelBufferSize:Int):akka.http.javadsl.settings.Http2ServerSettings "Permalink") abstract  def withIncomingConnectionLevelBufferSize(newIncomingConnectionLevelBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Http2ServerSettings
5. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#withIncomingStreamLevelBufferSize(newIncomingStreamLevelBufferSize:Int):akka.http.javadsl.settings.Http2ServerSettings "Permalink") abstract  def withIncomingStreamLevelBufferSize(newIncomingStreamLevelBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Http2ServerSettings
6. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#withLogFrames(shouldLog:Boolean):akka.http.javadsl.settings.Http2ServerSettings "Permalink") abstract  def withLogFrames(shouldLog: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Http2ServerSettings
7. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#withMaxConcurrentStreams(newValue:Int):akka.http.javadsl.settings.Http2ServerSettings "Permalink") abstract  def withMaxConcurrentStreams(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Http2ServerSettings
8. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#withMinCollectStrictEntitySize(newValue:Int):akka.http.javadsl.settings.Http2ServerSettings "Permalink") abstract  def withMinCollectStrictEntitySize(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Http2ServerSettings
9. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#withOutgoingControlFrameBufferSize(newValue:Int):akka.http.javadsl.settings.Http2ServerSettings "Permalink") abstract  def withOutgoingControlFrameBufferSize(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Http2ServerSettings
10. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#withRequestEntityChunkSize(newRequestEntityChunkSize:Int):akka.http.javadsl.settings.Http2ServerSettings "Permalink") abstract  def withRequestEntityChunkSize(newRequestEntityChunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Http2ServerSettings
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Http2ServerSettings toany2stringadd\[Http2ServerSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Http2ServerSettings, B)ImplicitThis member is added by an implicit conversion from Http2ServerSettings toArrowAssoc\[Http2ServerSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Http2ServerSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Http2ServerSettingsImplicitThis member is added by an implicit conversion from Http2ServerSettings toEnsuring\[Http2ServerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Http2ServerSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Http2ServerSettingsImplicitThis member is added by an implicit conversion from Http2ServerSettings toEnsuring\[Http2ServerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Http2ServerSettingsImplicitThis member is added by an implicit conversion from Http2ServerSettings toEnsuring\[Http2ServerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Http2ServerSettingsImplicitThis member is added by an implicit conversion from Http2ServerSettings toEnsuring\[Http2ServerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#getGoawayGracePeriod:java.time.Duration "Permalink")  def getGoawayGracePeriod: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)
16. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#getIncomingConnectionLevelBufferSize:Int "Permalink")  def getIncomingConnectionLevelBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
17. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#getIncomingStreamLevelBufferSize:Int "Permalink")  def getIncomingStreamLevelBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
18. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#getMaxConcurrentStreams:Int "Permalink")  def getMaxConcurrentStreams: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
19. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#getMaxResetsInterval:java.time.Duration "Permalink")  def getMaxResetsInterval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)
20. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#getOutgoingControlFrameBufferSize:Int "Permalink")  def getOutgoingControlFrameBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
21. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#getPingInterval:java.time.Duration "Permalink")  def getPingInterval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)
22. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#getPingTimeout:java.time.Duration "Permalink")  def getPingTimeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)
23. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#getRequestEntityChunkSize:Int "Permalink")  def getRequestEntityChunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
24. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#withGoawayGracePeriod(duration:java.time.Duration):akka.http.javadsl.settings.Http2ServerSettings "Permalink")  def withGoawayGracePeriod(duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Http2ServerSettings
35. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#withMaxResets(n:Int):akka.http.javadsl.settings.Http2ServerSettings "Permalink")  def withMaxResets(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Http2ServerSettings
36. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#withMaxResetsInterval(interval:java.time.Duration):akka.http.javadsl.settings.Http2ServerSettings "Permalink")  def withMaxResetsInterval(interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Http2ServerSettings
37. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#withPingInterval(interval:java.time.Duration):akka.http.javadsl.settings.Http2ServerSettings "Permalink")  def withPingInterval(interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Http2ServerSettings
38. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#withPingTimeout(timeout:java.time.Duration):akka.http.javadsl.settings.Http2ServerSettings "Permalink")  def withPingTimeout(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Http2ServerSettings
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Http2ServerSettings toStringFormat\[Http2ServerSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/settings/Http2ServerSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Http2ServerSettings, B)ImplicitThis member is added by an implicit conversion from Http2ServerSettings toArrowAssoc\[Http2ServerSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHttp2ServerSettings to any2stringadd\[Http2ServerSettings]

### Inherited by implicit conversion StringFormat fromHttp2ServerSettings to StringFormat\[Http2ServerSettings]

### Inherited by implicit conversion Ensuring fromHttp2ServerSettings to Ensuring\[Http2ServerSettings]

### Inherited by implicit conversion ArrowAssoc fromHttp2ServerSettings to ArrowAssoc\[Http2ServerSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ConnectionPoolSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/CorsSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/Http2ClientSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/HttpsProxySettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/HttpsProxySettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/RoutingSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/SettingsCompanion.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/WebSocketSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings.html)*