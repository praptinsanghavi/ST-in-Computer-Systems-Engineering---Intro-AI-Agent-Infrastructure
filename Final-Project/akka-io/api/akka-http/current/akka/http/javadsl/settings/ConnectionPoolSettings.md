---
description: Akka HTTP 10.7.4 - akka.http.javadsl.settings.ConnectionPoolSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:11:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ConnectionPoolSettings.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.settings.ConnectionPoolSettings
---

# Akka HTTP 10.7.4 - akka.http.javadsl.settings.ConnectionPoolSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.settings.ConnectionPoolSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](index.html)Definition Classes[javadsl](../index.html)
- [ClientConnectionSettings](ClientConnectionSettings.html "Public API but not intended for subclassing")
- ConnectionPoolSettings
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
[c](ConnectionPoolSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[settings](index.html)

# [ConnectionPoolSettings](ConnectionPoolSettings$.html "See companion object")[**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html "Permalink")

### Companion [object ConnectionPoolSettings](ConnectionPoolSettings$.html "See companion object")

#### abstract  class ConnectionPoolSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Public API but not intended for subclassing

Self TypeConnectionPoolSettingsImplAnnotations@DoNotInherit() Source[ConnectionPoolSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/settings/ConnectionPoolSettings.scala#L23)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConnectionPoolSettings
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

1. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withBaseConnectionBackoff(newValue:scala.concurrent.duration.FiniteDuration):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink") abstract  def withBaseConnectionBackoff(newValue: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConnectionPoolSettings
2. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withIdleTimeout(newValue:scala.concurrent.duration.Duration):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink") abstract  def withIdleTimeout(newValue: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): ConnectionPoolSettings
3. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withKeepAliveTimeout(newValue:scala.concurrent.duration.Duration):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink") abstract  def withKeepAliveTimeout(newValue: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): ConnectionPoolSettings
4. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withMaxConnectionBackoff(newValue:scala.concurrent.duration.FiniteDuration):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink") abstract  def withMaxConnectionBackoff(newValue: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConnectionPoolSettings
5. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withMaxConnectionLifetime(newValue:scala.concurrent.duration.Duration):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink") abstract  def withMaxConnectionLifetime(newValue: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): ConnectionPoolSettings
6. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withMaxConnections(n:Int):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink") abstract  def withMaxConnections(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ConnectionPoolSettings
7. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withMaxOpenRequests(newValue:Int):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink") abstract  def withMaxOpenRequests(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ConnectionPoolSettings
8. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withMaxRetries(n:Int):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink") abstract  def withMaxRetries(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ConnectionPoolSettings
9. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withMinConnections(n:Int):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink") abstract  def withMinConnections(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ConnectionPoolSettings
10. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withPipeliningLimit(newValue:Int):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink") abstract  def withPipeliningLimit(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ConnectionPoolSettingsClient\-side pipelining is not currently supported, see https://github.com/akka/akka\-http/issues/32
11. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withResponseEntitySubscriptionTimeout(newValue:scala.concurrent.duration.Duration):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink") abstract  def withResponseEntitySubscriptionTimeout(newValue: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): ConnectionPoolSettingsAnnotations@ApiMayChange()
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toany2stringadd\[ConnectionPoolSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ConnectionPoolSettings, B)ImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toArrowAssoc\[ConnectionPoolSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#appendHostOverride(hostPattern:String,settings:akka.http.javadsl.settings.ConnectionPoolSettings):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink")  def appendHostOverride(hostPattern: String, settings: ConnectionPoolSettings): ConnectionPoolSettingsAnnotations@ApiMayChange()
7. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ConnectionPoolSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConnectionPoolSettingsImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toEnsuring\[ConnectionPoolSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ConnectionPoolSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConnectionPoolSettingsImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toEnsuring\[ConnectionPoolSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConnectionPoolSettingsImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toEnsuring\[ConnectionPoolSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConnectionPoolSettingsImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toEnsuring\[ConnectionPoolSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#getBaseConnectionBackoff:scala.concurrent.duration.FiniteDuration "Permalink")  def getBaseConnectionBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
16. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#getConnectionSettings:akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def getConnectionSettings: [ClientConnectionSettings](ClientConnectionSettings.html)
18. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#getIdleTimeout:scala.concurrent.duration.Duration "Permalink")  def getIdleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
19. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#getKeepAliveTimeout:scala.concurrent.duration.Duration "Permalink")  def getKeepAliveTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
20. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#getMaxConnectionBackoff:scala.concurrent.duration.FiniteDuration "Permalink")  def getMaxConnectionBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
21. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#getMaxConnectionLifetime:java.time.Duration "Permalink")  def getMaxConnectionLifetime: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)
22. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#getMaxConnections:Int "Permalink")  def getMaxConnections: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
23. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#getMaxOpenRequests:Int "Permalink")  def getMaxOpenRequests: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
24. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#getMaxRetries:Int "Permalink")  def getMaxRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
25. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#getMinConnections:Int "Permalink")  def getMinConnections: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
26. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#getPipeliningLimit:Int "Permalink")  def getPipeliningLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
27. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#getResponseEntitySubscriptionTimeout:scala.concurrent.duration.Duration "Permalink")  def getResponseEntitySubscriptionTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Annotations@ApiMayChange()
28. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
30. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
31. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
35. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
37. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withConnectionSettings(newValue:akka.http.javadsl.settings.ClientConnectionSettings):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink")  def withConnectionSettings(newValue: [ClientConnectionSettings](ClientConnectionSettings.html)): ConnectionPoolSettings
39. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withHostOverrides(hostOverrides:java.util.List[(String,akka.http.javadsl.settings.ConnectionPoolSettings)]):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink")  def withHostOverrides(hostOverrides: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[(String, ConnectionPoolSettings)]): ConnectionPoolSettingsAnnotations@ApiMayChange()
40. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#withTransport(newValue:akka.http.javadsl.ClientTransport):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink")  def withTransport(newValue: [ClientTransport](../ClientTransport.html)): ConnectionPoolSettings
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toStringFormat\[ConnectionPoolSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/settings/ConnectionPoolSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ConnectionPoolSettings, B)ImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toArrowAssoc\[ConnectionPoolSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromConnectionPoolSettings to any2stringadd\[ConnectionPoolSettings]

### Inherited by implicit conversion StringFormat fromConnectionPoolSettings to StringFormat\[ConnectionPoolSettings]

### Inherited by implicit conversion Ensuring fromConnectionPoolSettings to Ensuring\[ConnectionPoolSettings]

### Inherited by implicit conversion ArrowAssoc fromConnectionPoolSettings to ArrowAssoc\[ConnectionPoolSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ClientTransport.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ConnectionPoolSettings.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ConnectionPoolSettings.html)*