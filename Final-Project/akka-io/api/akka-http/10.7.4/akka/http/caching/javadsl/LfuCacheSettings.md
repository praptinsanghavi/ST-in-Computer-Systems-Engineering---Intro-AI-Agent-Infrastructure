---
description: Akka HTTP 10.7.4 - akka.http.caching.javadsl.LfuCacheSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:58:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/caching/javadsl/LfuCacheSettings.html
title: Akka HTTP 10.7.4 - akka.http.caching.javadsl.LfuCacheSettings
---

# Akka HTTP 10.7.4 - akka.http.caching.javadsl.LfuCacheSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.caching.javadsl.LfuCacheSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/caching/index.html "Permalink")  package [caching](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/caching/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[caching](../index.html)
- [Cache](Cache.html)
- [CachingSettings](CachingSettings.html "Public API but not intended for subclassing")
- LfuCacheSettings
[c](LfuCacheSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[caching](../index.html).[javadsl](index.html)

# [LfuCacheSettings](LfuCacheSettings$.html "See companion object")[**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html "Permalink")

### Companion [object LfuCacheSettings](LfuCacheSettings$.html "See companion object")

#### abstract  class LfuCacheSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Public API but not intended for subclassing

Self TypeLfuCachingSettingsImplAnnotations@DoNotInherit() Source[LfuCacheSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-caching/src/main/scala/akka/http/caching/javadsl/LfuCacheSettings.scala#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[LfuCacheSettings](../scaladsl/LfuCacheSettings.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LfuCacheSettings
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

1. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#getInitialCapacity:Int "Permalink") abstract  def getInitialCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
2. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#getMaxCapacity:Int "Permalink") abstract  def getMaxCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
3. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#getTimeToIdle:scala.concurrent.duration.Duration "Permalink") abstract  def getTimeToIdle: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
4. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#getTimeToLive:scala.concurrent.duration.Duration "Permalink") abstract  def getTimeToLive: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
### Concrete Value Members

1. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LfuCacheSettings toany2stringadd\[LfuCacheSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LfuCacheSettings, B)ImplicitThis member is added by an implicit conversion from LfuCacheSettings toArrowAssoc\[LfuCacheSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LfuCacheSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LfuCacheSettingsImplicitThis member is added by an implicit conversion from LfuCacheSettings toEnsuring\[LfuCacheSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LfuCacheSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LfuCacheSettingsImplicitThis member is added by an implicit conversion from LfuCacheSettings toEnsuring\[LfuCacheSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LfuCacheSettingsImplicitThis member is added by an implicit conversion from LfuCacheSettings toEnsuring\[LfuCacheSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LfuCacheSettingsImplicitThis member is added by an implicit conversion from LfuCacheSettings toEnsuring\[LfuCacheSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#withInitialCapacity(newInitialCapacity:Int):akka.http.caching.javadsl.LfuCacheSettings "Permalink")  def withInitialCapacity(newInitialCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): LfuCacheSettings
26. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#withMaxCapacity(newMaxCapacity:Int):akka.http.caching.javadsl.LfuCacheSettings "Permalink")  def withMaxCapacity(newMaxCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): LfuCacheSettings
27. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#withTimeToIdle(newTimeToIdle:scala.concurrent.duration.Duration):akka.http.caching.javadsl.LfuCacheSettings "Permalink")  def withTimeToIdle(newTimeToIdle: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): LfuCacheSettings
28. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#withTimeToLive(newTimeToLive:scala.concurrent.duration.Duration):akka.http.caching.javadsl.LfuCacheSettings "Permalink")  def withTimeToLive(newTimeToLive: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): LfuCacheSettings
### Deprecated Value Members

1. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LfuCacheSettings toStringFormat\[LfuCacheSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/caching/javadsl/LfuCacheSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LfuCacheSettings, B)ImplicitThis member is added by an implicit conversion from LfuCacheSettings toArrowAssoc\[LfuCacheSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLfuCacheSettings to any2stringadd\[LfuCacheSettings]

### Inherited by implicit conversion StringFormat fromLfuCacheSettings to StringFormat\[LfuCacheSettings]

### Inherited by implicit conversion Ensuring fromLfuCacheSettings to Ensuring\[LfuCacheSettings]

### Inherited by implicit conversion ArrowAssoc fromLfuCacheSettings to ArrowAssoc\[LfuCacheSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/Cache.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/CachingSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/CachingSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/LfuCacheSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/LfuCacheSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/LfuCacheSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/LfuCacheSettings.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/LfuCacheSettings.html)*