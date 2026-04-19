---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.PreviewServerSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:11:14Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.PreviewServerSettings
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.settings.PreviewServerSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.settings.PreviewServerSettings

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
- PreviewServerSettings
- [RoutingSettings](RoutingSettings.html "Public API but not intended for subclassing")
- [ServerSentEventSettings](ServerSentEventSettings.html "Public API but not intended for subclassing")
- [ServerSettings](ServerSettings.html "Public API but not intended for subclassing")
- [WebSocketSettings](WebSocketSettings.html)
[c](PreviewServerSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[settings](index.html)

# [PreviewServerSettings](PreviewServerSettings$.html "See companion object")[**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html "Permalink")

### Companion [object PreviewServerSettings](PreviewServerSettings$.html "See companion object")

#### abstract  class PreviewServerSettings extends [javadsl.settings.PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html)

Public API but not intended for subclassing

Options that are in "preview" or "early access" mode.
These options may change and/or be removed within patch releases
without early notice (e.g. by moving them into a stable supported place).

Self TypePreviewServerSettingsImplAnnotations@ApiMayChange() @DoNotInherit() Source[PreviewServerSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/settings/PreviewServerSettings.scala#L19)Linear Supertypes[javadsl.settings.PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PreviewServerSettings
2. PreviewServerSettings
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

1. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#enableHttp2:Boolean "Permalink") abstract  def enableHttp2: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Configures the Http extension to bind using HTTP/2 if given an
[akka.http.scaladsl.HttpsConnectionContext](../HttpsConnectionContext.html).

Configures the Http extension to bind using HTTP/2 if given an
[akka.http.scaladsl.HttpsConnectionContext](../HttpsConnectionContext.html). Otherwise binds as plain HTTP.

Definition ClassesPreviewServerSettings → [PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html)Annotations@deprecated Deprecated*(Since version 10\.5\.0\)* Use ServerSettings.http2Enabled instead
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PreviewServerSettings toany2stringadd\[PreviewServerSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PreviewServerSettings, B)ImplicitThis member is added by an implicit conversion from PreviewServerSettings toArrowAssoc\[PreviewServerSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PreviewServerSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PreviewServerSettingsImplicitThis member is added by an implicit conversion from PreviewServerSettings toEnsuring\[PreviewServerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PreviewServerSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PreviewServerSettingsImplicitThis member is added by an implicit conversion from PreviewServerSettings toEnsuring\[PreviewServerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PreviewServerSettingsImplicitThis member is added by an implicit conversion from PreviewServerSettings toEnsuring\[PreviewServerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PreviewServerSettingsImplicitThis member is added by an implicit conversion from PreviewServerSettings toEnsuring\[PreviewServerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PreviewServerSettings toStringFormat\[PreviewServerSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#withEnableHttp2(newValue:Boolean):akka.http.scaladsl.settings.PreviewServerSettings "Permalink")  def withEnableHttp2(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PreviewServerSettingsDefinition ClassesPreviewServerSettings → [PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html)Annotations@deprecated Deprecated*(Since version 10\.5\.0\)* Use ServerSettings.withHttp2Enabled instead
4. [**](../../../../akka/http/scaladsl/settings/PreviewServerSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PreviewServerSettings, B)ImplicitThis member is added by an implicit conversion from PreviewServerSettings toArrowAssoc\[PreviewServerSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.settings.PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPreviewServerSettings to any2stringadd\[PreviewServerSettings]

### Inherited by implicit conversion StringFormat fromPreviewServerSettings to StringFormat\[PreviewServerSettings]

### Inherited by implicit conversion Ensuring fromPreviewServerSettings to Ensuring\[PreviewServerSettings]

### Inherited by implicit conversion ArrowAssoc fromPreviewServerSettings to ArrowAssoc\[PreviewServerSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
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
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html)*