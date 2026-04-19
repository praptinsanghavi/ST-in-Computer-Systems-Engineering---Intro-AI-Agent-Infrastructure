---
description: Akka 2.10.17 - akka.coordination.lease.LeaseSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:26:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/coordination/lease/LeaseSettings.html
title: Akka 2.10.17 - akka.coordination.lease.LeaseSettings
---

# Akka 2.10.17 - akka.coordination.lease.LeaseSettings

> **Summary:** Akka 2.10.17 - akka.coordination.lease.LeaseSettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/coordination/index.html "Permalink")  package [coordination](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/coordination/lease/index.html "Permalink")  package [lease](index.html)Definition Classes[coordination](../index.html)
- [**](../../../akka/coordination/lease/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[lease](index.html)
- [**](../../../akka/coordination/lease/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[lease](index.html)
- [LeaseException](LeaseException.html)
- LeaseSettings
- [LeaseTimeoutException](LeaseTimeoutException.html)
- [LeaseUsageSettings](LeaseUsageSettings.html)
- [TimeoutSettings](TimeoutSettings.html)
[c](LeaseSettings$.html "See companion object")[akka](../../index.html).[coordination](../index.html).[lease](index.html)

# [LeaseSettings](LeaseSettings$.html "See companion object")[**](../../../akka/coordination/lease/LeaseSettings.html "Permalink")

### Companion [object LeaseSettings](LeaseSettings$.html "See companion object")

#### final  class LeaseSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[LeaseSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-coordination/src/main/scala/akka/coordination/lease/LeaseSettings.scala#L15)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LeaseSettings
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
### Instance Constructors

1. [**](../../../akka/coordination/lease/LeaseSettings.html#<init>(leaseName:String,ownerName:String,timeoutSettings:akka.coordination.lease.TimeoutSettings,leaseConfig:com.typesafe.config.Config):akka.coordination.lease.LeaseSettings "Permalink")  new LeaseSettings(leaseName: String, ownerName: String, timeoutSettings: [TimeoutSettings](TimeoutSettings.html), leaseConfig: Config)
### Value Members

1. [**](../../../akka/coordination/lease/LeaseSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/coordination/lease/LeaseSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/coordination/lease/LeaseSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LeaseSettings toany2stringadd\[LeaseSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/coordination/lease/LeaseSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LeaseSettings, B)ImplicitThis member is added by an implicit conversion from LeaseSettings toArrowAssoc\[LeaseSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/coordination/lease/LeaseSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/coordination/lease/LeaseSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/coordination/lease/LeaseSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/coordination/lease/LeaseSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LeaseSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeaseSettingsImplicitThis member is added by an implicit conversion from LeaseSettings toEnsuring\[LeaseSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/coordination/lease/LeaseSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LeaseSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeaseSettingsImplicitThis member is added by an implicit conversion from LeaseSettings toEnsuring\[LeaseSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/coordination/lease/LeaseSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeaseSettingsImplicitThis member is added by an implicit conversion from LeaseSettings toEnsuring\[LeaseSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/coordination/lease/LeaseSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeaseSettingsImplicitThis member is added by an implicit conversion from LeaseSettings toEnsuring\[LeaseSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/coordination/lease/LeaseSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/coordination/lease/LeaseSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/coordination/lease/LeaseSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/coordination/lease/LeaseSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/coordination/lease/LeaseSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/coordination/lease/LeaseSettings.html#leaseConfig:com.typesafe.config.Config "Permalink")  val leaseConfig: Config
18. [**](../../../akka/coordination/lease/LeaseSettings.html#leaseName:String "Permalink")  val leaseName: String
19. [**](../../../akka/coordination/lease/LeaseSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/coordination/lease/LeaseSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/coordination/lease/LeaseSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/coordination/lease/LeaseSettings.html#ownerName:String "Permalink")  val ownerName: String
23. [**](../../../akka/coordination/lease/LeaseSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/coordination/lease/LeaseSettings.html#timeoutSettings:akka.coordination.lease.TimeoutSettings "Permalink")  val timeoutSettings: [TimeoutSettings](TimeoutSettings.html)
25. [**](../../../akka/coordination/lease/LeaseSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesLeaseSettings → AnyRef → Any
26. [**](../../../akka/coordination/lease/LeaseSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/coordination/lease/LeaseSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/coordination/lease/LeaseSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/coordination/lease/LeaseSettings.html#withTimeoutSettings(timeoutSettings:akka.coordination.lease.TimeoutSettings):akka.coordination.lease.LeaseSettings "Permalink")  def withTimeoutSettings(timeoutSettings: [TimeoutSettings](TimeoutSettings.html)): LeaseSettings
### Deprecated Value Members

1. [**](../../../akka/coordination/lease/LeaseSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/coordination/lease/LeaseSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LeaseSettings toStringFormat\[LeaseSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/coordination/lease/LeaseSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LeaseSettings, B)ImplicitThis member is added by an implicit conversion from LeaseSettings toArrowAssoc\[LeaseSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLeaseSettings to any2stringadd\[LeaseSettings]

### Inherited by implicit conversion StringFormat fromLeaseSettings to StringFormat\[LeaseSettings]

### Inherited by implicit conversion Ensuring fromLeaseSettings to Ensuring\[LeaseSettings]

### Inherited by implicit conversion ArrowAssoc fromLeaseSettings to ArrowAssoc\[LeaseSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseException.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseUsageSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/TimeoutSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/TimeoutSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseSettings.html](https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseSettings.html)*