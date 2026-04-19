---
description: Akka 2.10.17 - akka.coordination.lease.LeaseUsageSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:23:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/coordination/lease/LeaseUsageSettings.html
title: Akka 2.10.17 - akka.coordination.lease.LeaseUsageSettings
---

# Akka 2.10.17 - akka.coordination.lease.LeaseUsageSettings

> **Summary:** Akka 2.10.17 - akka.coordination.lease.LeaseUsageSettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/coordination/index.html "Permalink")  package [coordination](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/coordination/lease/index.html "Permalink")  package [lease](index.html)Definition Classes[coordination](../index.html)
- [**](../../../akka/coordination/lease/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[lease](index.html)
- [**](../../../akka/coordination/lease/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[lease](index.html)
- [LeaseException](LeaseException.html)
- [LeaseSettings](LeaseSettings.html)
- [LeaseTimeoutException](LeaseTimeoutException.html)
- LeaseUsageSettings
- [TimeoutSettings](TimeoutSettings.html)
[c](LeaseUsageSettings$.html "See companion object")[akka](../../index.html).[coordination](../index.html).[lease](index.html)

# [LeaseUsageSettings](LeaseUsageSettings$.html "See companion object")[**](../../../akka/coordination/lease/LeaseUsageSettings.html "Permalink")

### Companion [object LeaseUsageSettings](LeaseUsageSettings$.html "See companion object")

#### final  class LeaseUsageSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[LeaseUsageSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-coordination/src/main/scala/akka/coordination/lease/LeaseUsageSettings.scala#L70)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LeaseUsageSettings
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

1. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#<init>(leaseImplementation:String,leaseRetryInterval:scala.concurrent.duration.FiniteDuration):akka.coordination.lease.LeaseUsageSettings "Permalink")  new LeaseUsageSettings(leaseImplementation: String, leaseRetryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))
### Value Members

1. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/coordination/lease/LeaseUsageSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LeaseUsageSettings toany2stringadd\[LeaseUsageSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LeaseUsageSettings, B)ImplicitThis member is added by an implicit conversion from LeaseUsageSettings toArrowAssoc\[LeaseUsageSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LeaseUsageSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeaseUsageSettingsImplicitThis member is added by an implicit conversion from LeaseUsageSettings toEnsuring\[LeaseUsageSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LeaseUsageSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeaseUsageSettingsImplicitThis member is added by an implicit conversion from LeaseUsageSettings toEnsuring\[LeaseUsageSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeaseUsageSettingsImplicitThis member is added by an implicit conversion from LeaseUsageSettings toEnsuring\[LeaseUsageSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeaseUsageSettingsImplicitThis member is added by an implicit conversion from LeaseUsageSettings toEnsuring\[LeaseUsageSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#getLeaseRetryInterval():java.time.Duration "Permalink")  def getLeaseRetryInterval(): [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)
16. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#leaseImplementation:String "Permalink")  val leaseImplementation: String
19. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#leaseName:String "Permalink")  val leaseName: String
20. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#leaseRetryInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val leaseRetryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
21. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesLeaseUsageSettings → AnyRef → Any
26. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#withLeaseName(name:String):akka.coordination.lease.LeaseUsageSettings "Permalink")  def withLeaseName(name: String): LeaseUsageSettingsNote that if you have several Cluster Singletons or Cluster Sharding entity types using lease each one must have
a unique lease name
30. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#withLeaseRetryInterval(leaseRetryInterval:java.time.Duration):akka.coordination.lease.LeaseUsageSettings "Permalink")  def withLeaseRetryInterval(leaseRetryInterval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): LeaseUsageSettingsJava API:
31. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#withLeaseRetryInterval(leaseRetryInterval:scala.concurrent.duration.FiniteDuration):akka.coordination.lease.LeaseUsageSettings "Permalink")  def withLeaseRetryInterval(leaseRetryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): LeaseUsageSettingsScala API:
### Deprecated Value Members

1. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LeaseUsageSettings toStringFormat\[LeaseUsageSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/coordination/lease/LeaseUsageSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LeaseUsageSettings, B)ImplicitThis member is added by an implicit conversion from LeaseUsageSettings toArrowAssoc\[LeaseUsageSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLeaseUsageSettings to any2stringadd\[LeaseUsageSettings]

### Inherited by implicit conversion StringFormat fromLeaseUsageSettings to StringFormat\[LeaseUsageSettings]

### Inherited by implicit conversion Ensuring fromLeaseUsageSettings to Ensuring\[LeaseUsageSettings]

### Inherited by implicit conversion ArrowAssoc fromLeaseUsageSettings to ArrowAssoc\[LeaseUsageSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/LeaseException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/LeaseSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/LeaseSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/LeaseTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/TimeoutSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/TimeoutSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings.html](https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings.html)*