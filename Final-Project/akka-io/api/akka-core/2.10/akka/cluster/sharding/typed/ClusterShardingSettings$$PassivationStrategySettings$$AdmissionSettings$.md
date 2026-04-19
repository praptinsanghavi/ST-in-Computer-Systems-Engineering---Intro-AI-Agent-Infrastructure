---
description: Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:41:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings
---

# Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings

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
- [AdmissionSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html)
- [IdleSettings](ClusterShardingSettings$$PassivationStrategySettings$$IdleSettings.html)
- [LeastFrequentlyUsedSettings](ClusterShardingSettings$$PassivationStrategySettings$$LeastFrequentlyUsedSettings.html)
- [LeastRecentlyUsedSettings](ClusterShardingSettings$$PassivationStrategySettings$$LeastRecentlyUsedSettings.html)
- [MostRecentlyUsedSettings](ClusterShardingSettings$$PassivationStrategySettings$$MostRecentlyUsedSettings.html)
- [PolicySettings](ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html)
[o](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html "See companion class")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[typed](index.html).[ClusterShardingSettings](ClusterShardingSettings$.html).[PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings$.html)

# [AdmissionSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html "See companion class")[**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html "Permalink")

### Companion [class AdmissionSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html "See companion class")

#### object AdmissionSettings

Source[ClusterShardingSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/ClusterShardingSettings.scala#L430)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AdmissionSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FilterSettings.html "Permalink") sealed  trait [FilterSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FilterSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FrequencySketchSettings.html "Permalink") final  class [FrequencySketchSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FrequencySketchSettings.html) extends [FilterSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FilterSettings.html)
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$HillClimbingSettings.html "Permalink") final  class [HillClimbingSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$HillClimbingSettings.html) extends [OptimizerSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$OptimizerSettings.html)
4. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$OptimizerSettings.html "Permalink") sealed  trait [OptimizerSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$OptimizerSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
5. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html "Permalink") final  class [WindowSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#apply(classic:akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings):akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings "Permalink")  def apply(classic: [ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings](../ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html)): [AdmissionSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html)
5. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#defaults:akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings "Permalink")  val defaults: [AdmissionSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html)
8. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#toClassic(settings:akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings):akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings "Permalink")  def toClassic(settings: [AdmissionSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html)): [ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings](../ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html)
18. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FilterSettings$.html "Permalink")  object [FilterSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FilterSettings$.html)
23. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FrequencySketchSettings$.html "Permalink")  object [FrequencySketchSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$FrequencySketchSettings$.html)
24. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$HillClimbingSettings$.html "Permalink")  object [HillClimbingSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$HillClimbingSettings$.html)
25. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$OptimizerSettings$.html "Permalink")  object [OptimizerSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$OptimizerSettings$.html)
26. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings$.html "Permalink")  object [WindowSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$$WindowSettings$.html)
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html
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
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$IdleSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$IdleSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$LeastFrequentlyUsedSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$LeastFrequentlyUsedSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$LeastRecentlyUsedSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$LeastRecentlyUsedSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$MostRecentlyUsedSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$MostRecentlyUsedSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html)*