---
description: Akka 2.10.17 - akka.util.ManifestInfo.Version
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:09:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/ManifestInfo$$Version.html
title: Akka 2.10.17 - akka.util.ManifestInfo.Version
---

# Akka 2.10.17 - akka.util.ManifestInfo.Version

> **Summary:** Akka 2.10.17 - akka.util.ManifestInfo.Version

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/ManifestInfo$.html "Permalink")  object [ManifestInfo](ManifestInfo$.html "Akka extension that extracts ManifestInfo.Version information from META-INF/MANIFEST.MF in jar files on the classpath of the ClassLoader of the ActorSystem.") extends [ExtensionId](../actor/ExtensionId.html)\[[ManifestInfo](ManifestInfo.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)Akka extension that extracts ManifestInfo.Version information from META\-INF/MANIFEST.MF in jar files
on the classpath of the `ClassLoader` of the `ActorSystem`.

Akka extension that extracts ManifestInfo.Version information from META\-INF/MANIFEST.MF in jar files
on the classpath of the `ClassLoader` of the `ActorSystem`.

Definition Classes[util](index.html)
- Version
c[akka](../index.html).[util](index.html).[ManifestInfo](ManifestInfo$.html)

# Version[**](../../akka/util/ManifestInfo$$Version.html "Permalink")

### 

#### final  class Version extends [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[Version]

Comparable version information

Source[ManifestInfo.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/ManifestInfo.scala#L53)Linear Supertypes[Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[Version], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Version
2. Comparable
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

1. [**](../../akka/util/ManifestInfo$$Version.html#<init>(version:String):akka.util.ManifestInfo.Version "Permalink")  new Version(version: String)
### Value Members

1. [**](../../akka/util/ManifestInfo$$Version.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/ManifestInfo$$Version.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/ManifestInfo$$Version.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Version toany2stringadd\[Version] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/ManifestInfo$$Version.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Version, B)ImplicitThis member is added by an implicit conversion from Version toArrowAssoc\[Version] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/ManifestInfo$$Version.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/util/ManifestInfo$$Version.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/util/ManifestInfo$$Version.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/util/ManifestInfo$$Version.html#compareTo(other:akka.util.ManifestInfo.Version):Int "Permalink")  def compareTo(other: Version): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesVersion → Comparable
9. [**](../../akka/util/ManifestInfo$$Version.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Version) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): VersionImplicitThis member is added by an implicit conversion from Version toEnsuring\[Version] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/util/ManifestInfo$$Version.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Version) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): VersionImplicitThis member is added by an implicit conversion from Version toEnsuring\[Version] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/util/ManifestInfo$$Version.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): VersionImplicitThis member is added by an implicit conversion from Version toEnsuring\[Version] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/util/ManifestInfo$$Version.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): VersionImplicitThis member is added by an implicit conversion from Version toEnsuring\[Version] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/util/ManifestInfo$$Version.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/util/ManifestInfo$$Version.html#equals(o:Any):Boolean "Permalink")  def equals(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesVersion → AnyRef → Any
15. [**](../../akka/util/ManifestInfo$$Version.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/util/ManifestInfo$$Version.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesVersion → AnyRef → Any
17. [**](../../akka/util/ManifestInfo$$Version.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/util/ManifestInfo$$Version.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/util/ManifestInfo$$Version.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/util/ManifestInfo$$Version.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/util/ManifestInfo$$Version.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/util/ManifestInfo$$Version.html#toString():String "Permalink")  def toString(): StringDefinition ClassesVersion → AnyRef → Any
23. [**](../../akka/util/ManifestInfo$$Version.html#version:String "Permalink")  val version: String
24. [**](../../akka/util/ManifestInfo$$Version.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/util/ManifestInfo$$Version.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/util/ManifestInfo$$Version.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/ManifestInfo$$Version.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/ManifestInfo$$Version.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Version toStringFormat\[Version] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/ManifestInfo$$Version.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Version, B)ImplicitThis member is added by an implicit conversion from Version toArrowAssoc\[Version] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[Version]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromVersion to any2stringadd\[Version]

### Inherited by implicit conversion StringFormat fromVersion to StringFormat\[Version]

### Inherited by implicit conversion Ensuring fromVersion to Ensuring\[Version]

### Inherited by implicit conversion ArrowAssoc fromVersion to ArrowAssoc\[Version]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ManifestInfo$$Version.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ManifestInfo$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ManifestInfo.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/util/ManifestInfo$$Version.html](https://doc.akka.io/api/akka-core/2.10.17/akka/util/ManifestInfo$$Version.html)*