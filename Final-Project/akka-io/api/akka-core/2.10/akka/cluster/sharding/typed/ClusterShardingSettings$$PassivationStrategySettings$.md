---
description: Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:24:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings
---

# Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html "Permalink")  object [ClusterShardingSettings](ClusterShardingSettings$.html)Definition Classes[typed](index.html)
- [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html "API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.")
- [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode.html)
- [RememberEntitiesStoreModeDData](ClusterShardingSettings$$RememberEntitiesStoreModeDData$.html)
- [RememberEntitiesStoreModeEventSourced](ClusterShardingSettings$$RememberEntitiesStoreModeEventSourced$.html)
- [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html)
- [StateStoreModeDData](ClusterShardingSettings$$StateStoreModeDData$.html)
- [StateStoreModePersistence](ClusterShardingSettings$$StateStoreModePersistence$.html)
- [TuningParameters](ClusterShardingSettings$$TuningParameters.html)
[o](ClusterShardingSettings$$PassivationStrategySettings.html "See companion class")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[typed](index.html).[ClusterShardingSettings](ClusterShardingSettings$.html)

# [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html "See companion class")[**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html "Permalink")

### Companion [class PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html "See companion class")

#### object PassivationStrategySettings

API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() Source[ClusterShardingSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/ClusterShardingSettings.scala#L269)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PassivationStrategySettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html "Permalink") final  class [AdmissionSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$IdleSettings.html "Permalink") final  class [IdleSettings](ClusterShardingSettings$$PassivationStrategySettings$$IdleSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$LeastFrequentlyUsedSettings.html "Permalink") final  class [LeastFrequentlyUsedSettings](ClusterShardingSettings$$PassivationStrategySettings$$LeastFrequentlyUsedSettings.html) extends [PolicySettings](ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html)
4. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$LeastRecentlyUsedSettings.html "Permalink") final  class [LeastRecentlyUsedSettings](ClusterShardingSettings$$PassivationStrategySettings$$LeastRecentlyUsedSettings.html) extends [PolicySettings](ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html)
5. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$MostRecentlyUsedSettings.html "Permalink") final  class [MostRecentlyUsedSettings](ClusterShardingSettings$$PassivationStrategySettings$$MostRecentlyUsedSettings.html) extends [PolicySettings](ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html)
6. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html "Permalink") sealed  trait [PolicySettings](ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#apply(classic:akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings):akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings "Permalink")  def apply(classic: [ClusterShardingSettings.PassivationStrategySettings](../ClusterShardingSettings$$PassivationStrategySettings.html)): [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html)
5. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#defaults:akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings "Permalink")  val defaults: [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html)
8. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#disabled:akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings "Permalink")  val disabled: [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html)
9. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#toClassic(settings:akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings):akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  def toClassic(settings: [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html)): [ClusterShardingSettings.PassivationStrategySettings](../ClusterShardingSettings$$PassivationStrategySettings.html)
19. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html "Permalink")  object [AdmissionSettings](ClusterShardingSettings$$PassivationStrategySettings$$AdmissionSettings$.html)
24. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$IdleSettings$.html "Permalink")  object [IdleSettings](ClusterShardingSettings$$PassivationStrategySettings$$IdleSettings$.html)
25. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$LeastFrequentlyUsedSettings$.html "Permalink")  object [LeastFrequentlyUsedSettings](ClusterShardingSettings$$PassivationStrategySettings$$LeastFrequentlyUsedSettings$.html)
26. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$LeastRecentlyUsedSettings$.html "Permalink")  object [LeastRecentlyUsedSettings](ClusterShardingSettings$$PassivationStrategySettings$$LeastRecentlyUsedSettings$.html)
27. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$MostRecentlyUsedSettings$.html "Permalink")  object [MostRecentlyUsedSettings](ClusterShardingSettings$$PassivationStrategySettings$$MostRecentlyUsedSettings$.html)
28. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings$.html "Permalink")  object [PolicySettings](ClusterShardingSettings$$PassivationStrategySettings$$PolicySettings$.html)
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
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
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreModeDData$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreModeEventSourced$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreModeDData$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreModePersistence$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$TuningParameters.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html)*