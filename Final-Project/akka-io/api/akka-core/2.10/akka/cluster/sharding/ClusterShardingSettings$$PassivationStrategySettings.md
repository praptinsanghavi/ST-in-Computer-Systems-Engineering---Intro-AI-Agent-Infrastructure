---
description: Akka 2.10.17 - akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:39:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html
title: Akka 2.10.17 - akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings
---

# Akka 2.10.17 - akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/ClusterShardingSettings$.html "Permalink")  object [ClusterShardingSettings](ClusterShardingSettings$.html)Definition Classes[sharding](index.html)
- PassivationStrategySettings
- [TuningParameters](ClusterShardingSettings$$TuningParameters.html)
[c](ClusterShardingSettings$$PassivationStrategySettings$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[sharding](index.html).[ClusterShardingSettings](ClusterShardingSettings$.html)

# [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings$.html "See companion object")[**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html "Permalink")

### Companion [object PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings$.html "See companion object")

#### final  class PassivationStrategySettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.

Annotations@[ApiMayChange](../../annotation/ApiMayChange.html)() Source[ClusterShardingSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ClusterShardingSettings.scala#L145)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PassivationStrategySettings
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

1. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#<init>(idleEntitySettings:Option[akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings.IdleSettings],activeEntityLimit:Option[Int],replacementPolicySettings:Option[akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings.PolicySettings]):akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  new PassivationStrategySettings(idleEntitySettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[IdleSettings](ClusterShardingSettings$$PassivationStrategySettings$$IdleSettings.html)], activeEntityLimit: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], replacementPolicySettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[PolicySettings](ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html)])
2. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#<init>(idleEntitySettings:Option[akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings.IdleSettings],activeEntityLimit:Option[Int],replacementPolicySettings:Option[akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings.PolicySettings],admissionSettings:Option[akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings]):akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  new PassivationStrategySettings(idleEntitySettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[IdleSettings](ClusterShardingSettings$$PassivationStrategySettings$$IdleSettings.html)], activeEntityLimit: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], replacementPolicySettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[PolicySettings](ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html)], admissionSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[AdmissionSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html)])
### Value Members

1. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PassivationStrategySettings toany2stringadd\[PassivationStrategySettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PassivationStrategySettings, B)ImplicitThis member is added by an implicit conversion from PassivationStrategySettings toArrowAssoc\[PassivationStrategySettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#activeEntityLimit:Option[Int] "Permalink")  val activeEntityLimit: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
7. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#admissionSettings:Option[akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings] "Permalink")  val admissionSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[AdmissionSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html)]
8. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PassivationStrategySettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PassivationStrategySettingsImplicitThis member is added by an implicit conversion from PassivationStrategySettings toEnsuring\[PassivationStrategySettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PassivationStrategySettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PassivationStrategySettingsImplicitThis member is added by an implicit conversion from PassivationStrategySettings toEnsuring\[PassivationStrategySettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PassivationStrategySettingsImplicitThis member is added by an implicit conversion from PassivationStrategySettings toEnsuring\[PassivationStrategySettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PassivationStrategySettingsImplicitThis member is added by an implicit conversion from PassivationStrategySettings toEnsuring\[PassivationStrategySettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#idleEntitySettings:Option[akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings.IdleSettings] "Permalink")  val idleEntitySettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[IdleSettings](ClusterShardingSettings$$PassivationStrategySettings$$IdleSettings.html)]
19. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#replacementPolicySettings:Option[akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings.PolicySettings] "Permalink")  val replacementPolicySettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[PolicySettings](ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html)]
24. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#withActiveEntityLimit(limit:Int):akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  def withActiveEntityLimit(limit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): PassivationStrategySettings
30. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#withAdmission(settings:akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings):akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  def withAdmission(settings: [AdmissionSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html)): PassivationStrategySettings
31. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#withIdleEntityPassivation(timeout:java.time.Duration,interval:java.time.Duration):akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  def withIdleEntityPassivation(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): PassivationStrategySettings
32. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#withIdleEntityPassivation(timeout:java.time.Duration):akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  def withIdleEntityPassivation(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): PassivationStrategySettings
33. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#withIdleEntityPassivation(timeout:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration):akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  def withIdleEntityPassivation(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): PassivationStrategySettings
34. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#withIdleEntityPassivation(timeout:scala.concurrent.duration.FiniteDuration):akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  def withIdleEntityPassivation(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): PassivationStrategySettings
35. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#withIdleEntityPassivation(settings:akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings.IdleSettings):akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  def withIdleEntityPassivation(settings: [IdleSettings](ClusterShardingSettings$$PassivationStrategySettings$$IdleSettings.html)): PassivationStrategySettings
36. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#withLeastFrequentlyUsedReplacement():akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  def withLeastFrequentlyUsedReplacement(): PassivationStrategySettings
37. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#withLeastRecentlyUsedReplacement():akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  def withLeastRecentlyUsedReplacement(): PassivationStrategySettings
38. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#withMostRecentlyUsedReplacement():akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  def withMostRecentlyUsedReplacement(): PassivationStrategySettings
39. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#withReplacementPolicy(settings:akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings.PolicySettings):akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  def withReplacementPolicy(settings: [PolicySettings](ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html)): PassivationStrategySettings
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PassivationStrategySettings toStringFormat\[PassivationStrategySettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PassivationStrategySettings, B)ImplicitThis member is added by an implicit conversion from PassivationStrategySettings toArrowAssoc\[PassivationStrategySettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPassivationStrategySettings to any2stringadd\[PassivationStrategySettings]

### Inherited by implicit conversion StringFormat fromPassivationStrategySettings to StringFormat\[PassivationStrategySettings]

### Inherited by implicit conversion Ensuring fromPassivationStrategySettings to Ensuring\[PassivationStrategySettings]

### Inherited by implicit conversion ArrowAssoc fromPassivationStrategySettings to ArrowAssoc\[PassivationStrategySettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings$$IdleSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$$TuningParameters.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html)*