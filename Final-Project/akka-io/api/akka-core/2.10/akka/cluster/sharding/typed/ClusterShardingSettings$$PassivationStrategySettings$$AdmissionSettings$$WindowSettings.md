---
description: Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:41:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings
---

# Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html "Permalink")  object [ClusterShardingSettings](ClusterShardingSettings$.html)Definition Classes[typed](index.html)
- [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html "Permalink")  object [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings$.html "API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.")API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.

API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.

Definition Classes[ClusterShardingSettings](ClusterShardingSettings$.html)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
- [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html "Permalink")  object [AdmissionSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html)Definition Classes[PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings$.html)
- [FilterSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FilterSettings.html)
- [FrequencySketchSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FrequencySketchSettings.html)
- [HillClimbingSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$HillClimbingSettings.html)
- [OptimizerSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$OptimizerSettings.html)
- WindowSettings
[c](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings$.html "See companion object")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[typed](index.html).[ClusterShardingSettings](ClusterShardingSettings$.html).[PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings$.html).[AdmissionSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html)

# [WindowSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings$.html "See companion object")[**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html "Permalink")

### Companion [object WindowSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings$.html "See companion object")

#### final  class WindowSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ClusterShardingSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/ClusterShardingSettings.scala#L522)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. WindowSettings
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

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#<init>(initialProportion:Double,minimumProportion:Double,maximumProportion:Double,optimizer:Option[akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.OptimizerSettings],policy:Option[akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.PolicySettings]):akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings "Permalink")  new WindowSettings(initialProportion: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), minimumProportion: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), maximumProportion: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), optimizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[OptimizerSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$OptimizerSettings.html)], policy: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[PolicySettings](ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html)])
### Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from WindowSettings toany2stringadd\[WindowSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (WindowSettings, B)ImplicitThis member is added by an implicit conversion from WindowSettings toArrowAssoc\[WindowSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (WindowSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WindowSettingsImplicitThis member is added by an implicit conversion from WindowSettings toEnsuring\[WindowSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (WindowSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WindowSettingsImplicitThis member is added by an implicit conversion from WindowSettings toEnsuring\[WindowSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WindowSettingsImplicitThis member is added by an implicit conversion from WindowSettings toEnsuring\[WindowSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WindowSettingsImplicitThis member is added by an implicit conversion from WindowSettings toEnsuring\[WindowSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#initialProportion:Double "Permalink")  val initialProportion: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
17. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#maximumProportion:Double "Permalink")  val maximumProportion: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
19. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#minimumProportion:Double "Permalink")  val minimumProportion: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
20. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#optimizer:Option[akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.OptimizerSettings] "Permalink")  val optimizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[OptimizerSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$OptimizerSettings.html)]
24. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#policy:Option[akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.PolicySettings] "Permalink")  val policy: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[PolicySettings](ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html)]
25. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#withInitialProportion(proportion:Double):akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings "Permalink")  def withInitialProportion(proportion: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): WindowSettings
31. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#withMaximumProportion(proportion:Double):akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings "Permalink")  def withMaximumProportion(proportion: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): WindowSettings
32. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#withMinimumProportion(proportion:Double):akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings "Permalink")  def withMinimumProportion(proportion: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): WindowSettings
33. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#withOptimizer(settings:akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.OptimizerSettings):akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings "Permalink")  def withOptimizer(settings: [OptimizerSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$OptimizerSettings.html)): WindowSettings
34. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#withPolicy(settings:akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.PolicySettings):akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings "Permalink")  def withPolicy(settings: [PolicySettings](ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html)): WindowSettings
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from WindowSettings toStringFormat\[WindowSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (WindowSettings, B)ImplicitThis member is added by an implicit conversion from WindowSettings toArrowAssoc\[WindowSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromWindowSettings to any2stringadd\[WindowSettings]

### Inherited by implicit conversion StringFormat fromWindowSettings to StringFormat\[WindowSettings]

### Inherited by implicit conversion Ensuring fromWindowSettings to Ensuring\[WindowSettings]

### Inherited by implicit conversion ArrowAssoc fromWindowSettings to ArrowAssoc\[WindowSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FilterSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FilterSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FrequencySketchSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FrequencySketchSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$HillClimbingSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$HillClimbingSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$OptimizerSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$OptimizerSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html)*