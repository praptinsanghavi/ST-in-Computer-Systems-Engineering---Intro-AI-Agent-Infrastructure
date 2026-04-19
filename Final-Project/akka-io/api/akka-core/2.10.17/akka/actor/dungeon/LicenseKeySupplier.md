---
description: Akka 2.10.17 - akka.actor.dungeon.LicenseKeySupplier
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:50:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/dungeon/LicenseKeySupplier.html
title: Akka 2.10.17 - akka.actor.dungeon.LicenseKeySupplier
---

# Akka 2.10.17 - akka.actor.dungeon.LicenseKeySupplier

> **Summary:** Akka 2.10.17 - akka.actor.dungeon.LicenseKeySupplier

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/actor/index.html "Permalink")  package [actor](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/actor/dungeon/index.html "Permalink")  package [dungeon](index.html)Definition Classes[actor](../index.html)
- LicenseKeySupplier
- [SerializationCheckFailedException](SerializationCheckFailedException.html)
[t](LicenseKeySupplier$.html "See companion object")[akka](../../index.html).[actor](../index.html).[dungeon](index.html)

# [LicenseKeySupplier](LicenseKeySupplier$.html "See companion object")[**](../../../akka/actor/dungeon/LicenseKeySupplier.html "Permalink")

### Companion [object LicenseKeySupplier](LicenseKeySupplier$.html "See companion object")

#### trait LicenseKeySupplier extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

INTERNAL API: Supplies an Akka license key.

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)() Source[LicenseKeySupplier.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/dungeon/LicenseKeySupplier.scala#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LicenseKeySupplier
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

1. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#get(config:com.typesafe.config.Config):String "Permalink") abstract  def get(config: Config): String
2. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#implementing_this_is_a_violation_of_the_akka_license():Unit "Permalink") abstract  def implementing\_this\_is\_a\_violation\_of\_the\_akka\_license(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)This method exists to make clear to anyone that is trying to circumvent the Akka license check
that doing so is a violation of the Akka license.
### Concrete Value Members

1. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LicenseKeySupplier toany2stringadd\[LicenseKeySupplier] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LicenseKeySupplier, B)ImplicitThis member is added by an implicit conversion from LicenseKeySupplier toArrowAssoc\[LicenseKeySupplier] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LicenseKeySupplier) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LicenseKeySupplierImplicitThis member is added by an implicit conversion from LicenseKeySupplier toEnsuring\[LicenseKeySupplier] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LicenseKeySupplier) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LicenseKeySupplierImplicitThis member is added by an implicit conversion from LicenseKeySupplier toEnsuring\[LicenseKeySupplier] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LicenseKeySupplierImplicitThis member is added by an implicit conversion from LicenseKeySupplier toEnsuring\[LicenseKeySupplier] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LicenseKeySupplierImplicitThis member is added by an implicit conversion from LicenseKeySupplier toEnsuring\[LicenseKeySupplier] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LicenseKeySupplier toStringFormat\[LicenseKeySupplier] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/actor/dungeon/LicenseKeySupplier.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LicenseKeySupplier, B)ImplicitThis member is added by an implicit conversion from LicenseKeySupplier toArrowAssoc\[LicenseKeySupplier] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLicenseKeySupplier to any2stringadd\[LicenseKeySupplier]

### Inherited by implicit conversion StringFormat fromLicenseKeySupplier to StringFormat\[LicenseKeySupplier]

### Inherited by implicit conversion Ensuring fromLicenseKeySupplier to Ensuring\[LicenseKeySupplier]

### Inherited by implicit conversion ArrowAssoc fromLicenseKeySupplier to ArrowAssoc\[LicenseKeySupplier]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/dungeon/LicenseKeySupplier$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/dungeon/LicenseKeySupplier.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/dungeon/SerializationCheckFailedException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/dungeon/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/dungeon/LicenseKeySupplier.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/dungeon/LicenseKeySupplier.html)*