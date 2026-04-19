---
description: Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.DistributedData
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:52:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/scaladsl/DistributedData.html
title: Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.DistributedData
---

# Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.DistributedData

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.DistributedData

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[ddata](../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- DistributedData
- [Replicator](Replicator$.html)
- [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "When interacting with the Replicator from an actor this class provides convenient methods that adapts the response messages to the requesting actor's message protocol.")
- [ReplicatorSettings](ReplicatorSettings$.html)
[c](DistributedData$.html "See companion object")[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [DistributedData](DistributedData$.html "See companion object")[**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html "Permalink")

### Companion [object DistributedData](DistributedData$.html "See companion object")

#### class DistributedData extends [Extension](../../../../actor/typed/Extension.html)

Akka extension for convenient configuration and use of the
[Replicator](Replicator$.html). Configuration settings are defined in the
`akka.cluster.ddata` section, see `reference.conf`.

This is using the same underlying `Replicator` instance as
[akka.cluster.ddata.DistributedData](../../DistributedData.html) and that means that typed
and classic actors can share the same data.

Source[DistributedData.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/ddata/typed/scaladsl/DistributedData.scala#L68)Linear Supertypes[Extension](../../../../actor/typed/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DistributedData
2. Extension
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

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#<init>(system:akka.actor.typed.ActorSystem[_]):akka.cluster.ddata.typed.scaladsl.DistributedData "Permalink")  new DistributedData(system: [ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_])
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DistributedData toany2stringadd\[DistributedData] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DistributedData, B)ImplicitThis member is added by an implicit conversion from DistributedData toArrowAssoc\[DistributedData] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DistributedData) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DistributedDataImplicitThis member is added by an implicit conversion from DistributedData toEnsuring\[DistributedData] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DistributedData) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DistributedDataImplicitThis member is added by an implicit conversion from DistributedData toEnsuring\[DistributedData] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DistributedDataImplicitThis member is added by an implicit conversion from DistributedData toEnsuring\[DistributedData] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DistributedDataImplicitThis member is added by an implicit conversion from DistributedData toEnsuring\[DistributedData] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#replicator:akka.actor.typed.ActorRef[akka.cluster.ddata.typed.scaladsl.Replicator.Command] "Permalink")  val replicator: [ActorRef](../../../../actor/typed/ActorRef.html)\[[Command](Replicator$$Command.html)]`ActorRef` of the [Replicator](Replicator$.html).

`ActorRef` of the [Replicator](Replicator$.html).

See also[DistributedData.withReplicatorMessageAdapter](DistributedData$.html#withReplicatorMessageAdapter[A,B<:akka.cluster.ddata.ReplicatedData](factory:akka.cluster.ddata.typed.scaladsl.ReplicatorMessageAdapter[A,B]=>akka.actor.typed.Behavior[A]):akka.actor.typed.Behavior[A])
21. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#selfUniqueAddress:akka.cluster.ddata.SelfUniqueAddress "Permalink") implicit  val selfUniqueAddress: [SelfUniqueAddress](../../SelfUniqueAddress.html)
22. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DistributedData toStringFormat\[DistributedData] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DistributedData, B)ImplicitThis member is added by an implicit conversion from DistributedData toArrowAssoc\[DistributedData] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../../../actor/typed/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDistributedData to any2stringadd\[DistributedData]

### Inherited by implicit conversion StringFormat fromDistributedData to StringFormat\[DistributedData]

### Inherited by implicit conversion Ensuring fromDistributedData to Ensuring\[DistributedData]

### Inherited by implicit conversion ArrowAssoc fromDistributedData to ArrowAssoc\[DistributedData]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/SelfUniqueAddress.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/DistributedData$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/DistributedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$$Command.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/ReplicatorSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/DistributedData.html](https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/scaladsl/DistributedData.html)*