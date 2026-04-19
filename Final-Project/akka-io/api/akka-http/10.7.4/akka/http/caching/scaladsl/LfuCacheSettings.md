---
description: Akka HTTP 10.7.4 - akka.http.caching.scaladsl.LfuCacheSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/caching/scaladsl/LfuCacheSettings.html
title: Akka HTTP 10.7.4 - akka.http.caching.scaladsl.LfuCacheSettings
---

# Akka HTTP 10.7.4 - akka.http.caching.scaladsl.LfuCacheSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.caching.scaladsl.LfuCacheSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/caching/index.html "Permalink")  package [caching](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/caching/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[caching](../index.html)
- [Cache](Cache.html "API MAY CHANGE")
- [CachingSettings](CachingSettings.html "Public API but not intended for subclassing")
- LfuCacheSettings
[c](LfuCacheSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[caching](../index.html).[scaladsl](index.html)

# [LfuCacheSettings](LfuCacheSettings$.html "See companion object")[**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html "Permalink")

### Companion [object LfuCacheSettings](LfuCacheSettings$.html "See companion object")

#### abstract  class LfuCacheSettings extends [javadsl.LfuCacheSettings](../javadsl/LfuCacheSettings.html)

Public API but not intended for subclassing

Self TypeLfuCachingSettingsImplAnnotations@DoNotInherit() Source[LfuCacheSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-caching/src/main/scala/akka/http/caching/scaladsl/LfuCacheSettings.scala#L19)Linear Supertypes[javadsl.LfuCacheSettings](../javadsl/LfuCacheSettings.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LfuCacheSettings
2. LfuCacheSettings
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

1. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#initialCapacity:Int "Permalink") abstract  def initialCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
2. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#maxCapacity:Int "Permalink") abstract  def maxCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
3. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#timeToIdle:scala.concurrent.duration.Duration "Permalink") abstract  def timeToIdle: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
4. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#timeToLive:scala.concurrent.duration.Duration "Permalink") abstract  def timeToLive: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
### Concrete Value Members

1. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LfuCacheSettings toany2stringadd\[LfuCacheSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LfuCacheSettings, B)ImplicitThis member is added by an implicit conversion from LfuCacheSettings toArrowAssoc\[LfuCacheSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LfuCacheSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LfuCacheSettingsImplicitThis member is added by an implicit conversion from LfuCacheSettings toEnsuring\[LfuCacheSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LfuCacheSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LfuCacheSettingsImplicitThis member is added by an implicit conversion from LfuCacheSettings toEnsuring\[LfuCacheSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LfuCacheSettingsImplicitThis member is added by an implicit conversion from LfuCacheSettings toEnsuring\[LfuCacheSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LfuCacheSettingsImplicitThis member is added by an implicit conversion from LfuCacheSettings toEnsuring\[LfuCacheSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#getInitialCapacity:Int "Permalink") final  def getInitialCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLfuCacheSettings → [LfuCacheSettings](../javadsl/LfuCacheSettings.html)
16. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#getMaxCapacity:Int "Permalink") final  def getMaxCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLfuCacheSettings → [LfuCacheSettings](../javadsl/LfuCacheSettings.html)
17. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#getTimeToIdle:scala.concurrent.duration.Duration "Permalink") final  def getTimeToIdle: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Definition ClassesLfuCacheSettings → [LfuCacheSettings](../javadsl/LfuCacheSettings.html)
18. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#getTimeToLive:scala.concurrent.duration.Duration "Permalink") final  def getTimeToLive: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Definition ClassesLfuCacheSettings → [LfuCacheSettings](../javadsl/LfuCacheSettings.html)
19. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#withInitialCapacity(newInitialCapacity:Int):akka.http.caching.scaladsl.LfuCacheSettings "Permalink")  def withInitialCapacity(newInitialCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): LfuCacheSettingsDefinition ClassesLfuCacheSettings → [LfuCacheSettings](../javadsl/LfuCacheSettings.html)
30. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#withMaxCapacity(newMaxCapacity:Int):akka.http.caching.scaladsl.LfuCacheSettings "Permalink")  def withMaxCapacity(newMaxCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): LfuCacheSettingsDefinition ClassesLfuCacheSettings → [LfuCacheSettings](../javadsl/LfuCacheSettings.html)
31. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#withTimeToIdle(newTimeToIdle:scala.concurrent.duration.Duration):akka.http.caching.scaladsl.LfuCacheSettings "Permalink")  def withTimeToIdle(newTimeToIdle: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): LfuCacheSettingsDefinition ClassesLfuCacheSettings → [LfuCacheSettings](../javadsl/LfuCacheSettings.html)
32. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#withTimeToLive(newTimeToLive:scala.concurrent.duration.Duration):akka.http.caching.scaladsl.LfuCacheSettings "Permalink")  def withTimeToLive(newTimeToLive: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): LfuCacheSettingsDefinition ClassesLfuCacheSettings → [LfuCacheSettings](../javadsl/LfuCacheSettings.html)
### Deprecated Value Members

1. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LfuCacheSettings toStringFormat\[LfuCacheSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/caching/scaladsl/LfuCacheSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LfuCacheSettings, B)ImplicitThis member is added by an implicit conversion from LfuCacheSettings toArrowAssoc\[LfuCacheSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.LfuCacheSettings](../javadsl/LfuCacheSettings.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLfuCacheSettings to any2stringadd\[LfuCacheSettings]

### Inherited by implicit conversion StringFormat fromLfuCacheSettings to StringFormat\[LfuCacheSettings]

### Inherited by implicit conversion Ensuring fromLfuCacheSettings to Ensuring\[LfuCacheSettings]

### Inherited by implicit conversion ArrowAssoc fromLfuCacheSettings to ArrowAssoc\[LfuCacheSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/index.html
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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/LfuCacheSettings.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/LfuCacheSettings.html)*