---
description: Akka HTTP 10.7.4 - akka.http.caching.scaladsl.CachingSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/caching/scaladsl/CachingSettings.html
title: Akka HTTP 10.7.4 - akka.http.caching.scaladsl.CachingSettings
---

# Akka HTTP 10.7.4 - akka.http.caching.scaladsl.CachingSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.caching.scaladsl.CachingSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/caching/index.html "Permalink")  package [caching](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/caching/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[caching](../index.html)
- [Cache](Cache.html "API MAY CHANGE")
- CachingSettings
- [LfuCacheSettings](LfuCacheSettings.html "Public API but not intended for subclassing")
[c](CachingSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[caching](../index.html).[scaladsl](index.html)

# [CachingSettings](CachingSettings$.html "See companion object")[**](../../../../akka/http/caching/scaladsl/CachingSettings.html "Permalink")

### Companion [object CachingSettings](CachingSettings$.html "See companion object")

#### abstract  class CachingSettings extends [javadsl.CachingSettings](../javadsl/CachingSettings.html)

Public API but not intended for subclassing

Self TypeCachingSettingsImplAnnotations@DoNotInherit() Source[CachingSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-caching/src/main/scala/akka/http/caching/scaladsl/CachingSettings.scala#L17)Linear Supertypes[javadsl.CachingSettings](../javadsl/CachingSettings.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CachingSettings
2. CachingSettings
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

1. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#lfuCacheSettings:akka.http.caching.scaladsl.LfuCacheSettings "Permalink") abstract  def lfuCacheSettings: [LfuCacheSettings](LfuCacheSettings.html)Definition ClassesCachingSettings → [CachingSettings](../javadsl/CachingSettings.html)
### Concrete Value Members

1. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CachingSettings toany2stringadd\[CachingSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CachingSettings, B)ImplicitThis member is added by an implicit conversion from CachingSettings toArrowAssoc\[CachingSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CachingSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CachingSettingsImplicitThis member is added by an implicit conversion from CachingSettings toEnsuring\[CachingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CachingSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CachingSettingsImplicitThis member is added by an implicit conversion from CachingSettings toEnsuring\[CachingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CachingSettingsImplicitThis member is added by an implicit conversion from CachingSettings toEnsuring\[CachingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CachingSettingsImplicitThis member is added by an implicit conversion from CachingSettings toEnsuring\[CachingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#withLfuCacheSettings(newSettings:akka.http.caching.scaladsl.LfuCacheSettings):akka.http.caching.scaladsl.CachingSettings "Permalink")  def withLfuCacheSettings(newSettings: [LfuCacheSettings](LfuCacheSettings.html)): CachingSettings
26. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#withLfuCacheSettings(newSettings:akka.http.caching.javadsl.LfuCacheSettings):akka.http.caching.javadsl.CachingSettings "Permalink")  def withLfuCacheSettings(newSettings: [javadsl.LfuCacheSettings](../javadsl/LfuCacheSettings.html)): [javadsl.CachingSettings](../javadsl/CachingSettings.html)Definition Classes[CachingSettings](../javadsl/CachingSettings.html)
### Deprecated Value Members

1. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CachingSettings toStringFormat\[CachingSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/caching/scaladsl/CachingSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CachingSettings, B)ImplicitThis member is added by an implicit conversion from CachingSettings toArrowAssoc\[CachingSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.CachingSettings](../javadsl/CachingSettings.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCachingSettings to any2stringadd\[CachingSettings]

### Inherited by implicit conversion StringFormat fromCachingSettings to StringFormat\[CachingSettings]

### Inherited by implicit conversion Ensuring fromCachingSettings to Ensuring\[CachingSettings]

### Inherited by implicit conversion ArrowAssoc fromCachingSettings to ArrowAssoc\[CachingSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/CachingSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/LfuCacheSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/CachingSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/CachingSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/LfuCacheSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/LfuCacheSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/CachingSettings.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/CachingSettings.html)*