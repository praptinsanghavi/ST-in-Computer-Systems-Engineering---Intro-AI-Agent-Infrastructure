---
description: Akka HTTP 10.7.4 - akka.http.javadsl.settings.RoutingSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:11:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/RoutingSettings.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.settings.RoutingSettings
---

# Akka HTTP 10.7.4 - akka.http.javadsl.settings.RoutingSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.settings.RoutingSettings

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
- RoutingSettings
- [ServerSentEventSettings](ServerSentEventSettings.html "Public API but not intended for subclassing")
- [ServerSettings](ServerSettings.html "Public API but not intended for subclassing")
- [SettingsCompanion](SettingsCompanion.html)
- [WebSocketSettings](WebSocketSettings.html "Public API but not intended for subclassing")
[c](RoutingSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[settings](index.html)

# [RoutingSettings](RoutingSettings$.html "See companion object")[**](../../../../akka/http/javadsl/settings/RoutingSettings.html "Permalink")

### Companion [object RoutingSettings](RoutingSettings$.html "See companion object")

#### abstract  class RoutingSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Public API but not intended for subclassing

Self TypeRoutingSettingsImplAnnotations@DoNotInherit() Source[RoutingSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/javadsl/settings/RoutingSettings.scala#L16)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[RoutingSettings](../../scaladsl/settings/RoutingSettings.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RoutingSettings
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

1. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#getDecodeMaxBytesPerChunk:Int "Permalink") abstract  def getDecodeMaxBytesPerChunk: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
2. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#getFileGetConditional:Boolean "Permalink") abstract  def getFileGetConditional: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
3. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#getRangeCoalescingThreshold:Long "Permalink") abstract  def getRangeCoalescingThreshold: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
4. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#getRangeCountLimit:Int "Permalink") abstract  def getRangeCountLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
5. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#getRenderVanityFooter:Boolean "Permalink") abstract  def getRenderVanityFooter: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
6. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#getVerboseErrorMessages:Boolean "Permalink") abstract  def getVerboseErrorMessages: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
7. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#getFileIODispatcher:String "Permalink") abstract  def getFileIODispatcher: StringAnnotations@deprecated @Deprecated Deprecated*(Since version 10\.1\.6\)* binary compatibility method. Use `akka.stream.materializer.blocking-io-dispatcher` to configure the dispatcher
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RoutingSettings toany2stringadd\[RoutingSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RoutingSettings, B)ImplicitThis member is added by an implicit conversion from RoutingSettings toArrowAssoc\[RoutingSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RoutingSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RoutingSettingsImplicitThis member is added by an implicit conversion from RoutingSettings toEnsuring\[RoutingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RoutingSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RoutingSettingsImplicitThis member is added by an implicit conversion from RoutingSettings toEnsuring\[RoutingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RoutingSettingsImplicitThis member is added by an implicit conversion from RoutingSettings toEnsuring\[RoutingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RoutingSettingsImplicitThis member is added by an implicit conversion from RoutingSettings toEnsuring\[RoutingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#withDecodeMaxBytesPerChunk(decodeMaxBytesPerChunk:Int):akka.http.javadsl.settings.RoutingSettings "Permalink")  def withDecodeMaxBytesPerChunk(decodeMaxBytesPerChunk: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): RoutingSettings
26. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#withDecodeMaxSize(decodeMaxSize:Long):akka.http.javadsl.settings.RoutingSettings "Permalink")  def withDecodeMaxSize(decodeMaxSize: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): RoutingSettings
27. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#withFileGetConditional(fileGetConditional:Boolean):akka.http.javadsl.settings.RoutingSettings "Permalink")  def withFileGetConditional(fileGetConditional: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RoutingSettings
28. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#withRangeCoalescingThreshold(rangeCoalescingThreshold:Long):akka.http.javadsl.settings.RoutingSettings "Permalink")  def withRangeCoalescingThreshold(rangeCoalescingThreshold: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): RoutingSettings
29. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#withRangeCountLimit(rangeCountLimit:Int):akka.http.javadsl.settings.RoutingSettings "Permalink")  def withRangeCountLimit(rangeCountLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): RoutingSettings
30. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#withRenderVanityFooter(renderVanityFooter:Boolean):akka.http.javadsl.settings.RoutingSettings "Permalink")  def withRenderVanityFooter(renderVanityFooter: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RoutingSettings
31. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#withVerboseErrorMessages(verboseErrorMessages:Boolean):akka.http.javadsl.settings.RoutingSettings "Permalink")  def withVerboseErrorMessages(verboseErrorMessages: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RoutingSettings
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RoutingSettings toStringFormat\[RoutingSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#withFileIODispatcher(fileIODispatcher:String):akka.http.javadsl.settings.RoutingSettings "Permalink")  def withFileIODispatcher(fileIODispatcher: String): RoutingSettingsAnnotations@deprecated @Deprecated Deprecated*(Since version 10\.1\.6\)* binary compatibility method. Use `akka.stream.materializer.blocking-io-dispatcher` to configure the dispatcher
4. [**](../../../../akka/http/javadsl/settings/RoutingSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RoutingSettings, B)ImplicitThis member is added by an implicit conversion from RoutingSettings toArrowAssoc\[RoutingSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRoutingSettings to any2stringadd\[RoutingSettings]

### Inherited by implicit conversion StringFormat fromRoutingSettings to StringFormat\[RoutingSettings]

### Inherited by implicit conversion Ensuring fromRoutingSettings to Ensuring\[RoutingSettings]

### Inherited by implicit conversion ArrowAssoc fromRoutingSettings to ArrowAssoc\[RoutingSettings]

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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/RoutingSettings.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/RoutingSettings.html)*