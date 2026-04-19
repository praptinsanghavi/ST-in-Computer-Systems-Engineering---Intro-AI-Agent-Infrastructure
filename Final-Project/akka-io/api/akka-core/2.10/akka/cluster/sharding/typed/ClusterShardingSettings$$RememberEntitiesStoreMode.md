---
description: Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreMode
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:24:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreMode
---

# Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreMode

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreMode

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html "Permalink")  object [ClusterShardingSettings](ClusterShardingSettings$.html)Definition Classes[typed](index.html)
- [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html "API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.")
- RememberEntitiesStoreMode
- [RememberEntitiesStoreModeDData](ClusterShardingSettings$$RememberEntitiesStoreModeDData$.html)
- [RememberEntitiesStoreModeEventSourced](ClusterShardingSettings$$RememberEntitiesStoreModeEventSourced$.html)
- [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html)
- [StateStoreModeDData](ClusterShardingSettings$$StateStoreModeDData$.html)
- [StateStoreModePersistence](ClusterShardingSettings$$StateStoreModePersistence$.html)
- [TuningParameters](ClusterShardingSettings$$TuningParameters.html)
[t](ClusterShardingSettings$$RememberEntitiesStoreMode$.html "See companion object")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[typed](index.html).[ClusterShardingSettings](ClusterShardingSettings$.html)

# [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode$.html "See companion object")[**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html "Permalink")

### Companion [object RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode$.html "See companion object")

#### sealed  trait RememberEntitiesStoreMode extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ClusterShardingSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/ClusterShardingSettings.scala#L154)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[RememberEntitiesStoreModeDData](ClusterShardingSettings$$RememberEntitiesStoreModeDData$.html), [RememberEntitiesStoreModeEventSourced](ClusterShardingSettings$$RememberEntitiesStoreModeEventSourced$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RememberEntitiesStoreMode
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

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#name:String "Permalink") abstract  def name: String
### Concrete Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RememberEntitiesStoreMode toany2stringadd\[RememberEntitiesStoreMode] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RememberEntitiesStoreMode, B)ImplicitThis member is added by an implicit conversion from RememberEntitiesStoreMode toArrowAssoc\[RememberEntitiesStoreMode] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RememberEntitiesStoreMode) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RememberEntitiesStoreModeImplicitThis member is added by an implicit conversion from RememberEntitiesStoreMode toEnsuring\[RememberEntitiesStoreMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RememberEntitiesStoreMode) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RememberEntitiesStoreModeImplicitThis member is added by an implicit conversion from RememberEntitiesStoreMode toEnsuring\[RememberEntitiesStoreMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RememberEntitiesStoreModeImplicitThis member is added by an implicit conversion from RememberEntitiesStoreMode toEnsuring\[RememberEntitiesStoreMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RememberEntitiesStoreModeImplicitThis member is added by an implicit conversion from RememberEntitiesStoreMode toEnsuring\[RememberEntitiesStoreMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RememberEntitiesStoreMode toStringFormat\[RememberEntitiesStoreMode] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RememberEntitiesStoreMode, B)ImplicitThis member is added by an implicit conversion from RememberEntitiesStoreMode toArrowAssoc\[RememberEntitiesStoreMode] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRememberEntitiesStoreMode to any2stringadd\[RememberEntitiesStoreMode]

### Inherited by implicit conversion StringFormat fromRememberEntitiesStoreMode to StringFormat\[RememberEntitiesStoreMode]

### Inherited by implicit conversion Ensuring fromRememberEntitiesStoreMode to Ensuring\[RememberEntitiesStoreMode]

### Inherited by implicit conversion ArrowAssoc fromRememberEntitiesStoreMode to ArrowAssoc\[RememberEntitiesStoreMode]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html)*