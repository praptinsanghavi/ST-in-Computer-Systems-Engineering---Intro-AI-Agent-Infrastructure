---
description: Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreMode
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:32:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreMode
---

# Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreMode

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreMode

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
- StateStoreMode
- [StateStoreModeDData](ClusterShardingSettings$$StateStoreModeDData$.html)
- [StateStoreModePersistence](ClusterShardingSettings$$StateStoreModePersistence$.html)
- [TuningParameters](ClusterShardingSettings$$TuningParameters.html)
[t](ClusterShardingSettings$$StateStoreMode$.html "See companion object")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[typed](index.html).[ClusterShardingSettings](ClusterShardingSettings$.html)

# [StateStoreMode](ClusterShardingSettings$$StateStoreMode$.html "See companion object")[**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html "Permalink")

### Companion [object StateStoreMode](ClusterShardingSettings$$StateStoreMode$.html "See companion object")

#### sealed  trait StateStoreMode extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ClusterShardingSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/ClusterShardingSettings.scala#L118)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[StateStoreModeDData](ClusterShardingSettings$$StateStoreModeDData$.html), [StateStoreModePersistence](ClusterShardingSettings$$StateStoreModePersistence$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StateStoreMode
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

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#name:String "Permalink") abstract  def name: String
### Concrete Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StateStoreMode toany2stringadd\[StateStoreMode] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StateStoreMode, B)ImplicitThis member is added by an implicit conversion from StateStoreMode toArrowAssoc\[StateStoreMode] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StateStoreMode) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StateStoreModeImplicitThis member is added by an implicit conversion from StateStoreMode toEnsuring\[StateStoreMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StateStoreMode) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StateStoreModeImplicitThis member is added by an implicit conversion from StateStoreMode toEnsuring\[StateStoreMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StateStoreModeImplicitThis member is added by an implicit conversion from StateStoreMode toEnsuring\[StateStoreMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StateStoreModeImplicitThis member is added by an implicit conversion from StateStoreMode toEnsuring\[StateStoreMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StateStoreMode toStringFormat\[StateStoreMode] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StateStoreMode, B)ImplicitThis member is added by an implicit conversion from StateStoreMode toArrowAssoc\[StateStoreMode] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStateStoreMode to any2stringadd\[StateStoreMode]

### Inherited by implicit conversion StringFormat fromStateStoreMode to StringFormat\[StateStoreMode]

### Inherited by implicit conversion Ensuring fromStateStoreMode to Ensuring\[StateStoreMode]

### Inherited by implicit conversion ArrowAssoc fromStateStoreMode to ArrowAssoc\[StateStoreMode]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreModeDData$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreModeEventSourced$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreModeDData$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreModePersistence$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$TuningParameters.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html)*