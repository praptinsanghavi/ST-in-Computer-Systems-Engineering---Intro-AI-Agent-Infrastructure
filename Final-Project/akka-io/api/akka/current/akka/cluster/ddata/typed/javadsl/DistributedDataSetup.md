---
description: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.DistributedDataSetup
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:52:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html
title: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.DistributedDataSetup
---

# Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.DistributedDataSetup

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.DistributedDataSetup

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[ddata](../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.")
- DistributedDataSetup
- [Replicator](Replicator$.html)
- [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "When interacting with the Replicator from an actor this class provides convenient methods that adapts the response messages to the requesting actor's message protocol.")
- [ReplicatorSettings](ReplicatorSettings$.html)
[c](DistributedDataSetup$.html "See companion object")[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html).[javadsl](index.html)

# [DistributedDataSetup](DistributedDataSetup$.html "See companion object")[**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html "Permalink")

### Companion [object DistributedDataSetup](DistributedDataSetup$.html "See companion object")

#### final  class DistributedDataSetup extends [ExtensionSetup](../../../../actor/typed/ExtensionSetup.html)\[[DistributedData](DistributedData.html)]

Can be used in [akka.actor.setup.ActorSystemSetup](../../../../actor/setup/ActorSystemSetup.html) when starting the ActorSystem
to replace the default implementation of the [DistributedData](DistributedData.html) extension. Intended
for tests that need to replace extension with stub/mock implementations.

Source[DistributedData.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/ddata/typed/javadsl/DistributedData.scala#L112)Linear Supertypes[ExtensionSetup](../../../../actor/typed/ExtensionSetup.html)\[[DistributedData](DistributedData.html)], [Setup](../../../../actor/setup/Setup.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DistributedDataSetup
2. ExtensionSetup
3. Setup
4. AnyRef
5. Any
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

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#<init>(createExtension:java.util.function.Function[akka.actor.typed.ActorSystem[_],akka.cluster.ddata.typed.javadsl.DistributedData]):akka.cluster.ddata.typed.javadsl.DistributedDataSetup "Permalink")  new DistributedDataSetup(createExtension: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_], [DistributedData](DistributedData.html)])
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DistributedDataSetup toany2stringadd\[DistributedDataSetup] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DistributedDataSetup, B)ImplicitThis member is added by an implicit conversion from DistributedDataSetup toArrowAssoc\[DistributedDataSetup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#and(other:akka.actor.setup.Setup):akka.actor.setup.ActorSystemSetup "Permalink") final  def and(other: [Setup](../../../../actor/setup/Setup.html)): [ActorSystemSetup](../../../../actor/setup/ActorSystemSetup.html)Construct an ActorSystemSetup with this setup combined with another one.

Construct an ActorSystemSetup with this setup combined with another one. Allows for
fluent creation of settings. If `other` is a setting of the same concrete Setup as this
it will replace this.

Definition Classes[Setup](../../../../actor/setup/Setup.html)
7. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#createExtension:java.util.function.Function[akka.actor.typed.ActorSystem[_],T] "Permalink")  val createExtension: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_], [DistributedData](DistributedData.html)]Definition Classes[ExtensionSetup](../../../../actor/typed/ExtensionSetup.html)
10. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DistributedDataSetup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DistributedDataSetupImplicitThis member is added by an implicit conversion from DistributedDataSetup toEnsuring\[DistributedDataSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DistributedDataSetup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DistributedDataSetupImplicitThis member is added by an implicit conversion from DistributedDataSetup toEnsuring\[DistributedDataSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DistributedDataSetupImplicitThis member is added by an implicit conversion from DistributedDataSetup toEnsuring\[DistributedDataSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DistributedDataSetupImplicitThis member is added by an implicit conversion from DistributedDataSetup toEnsuring\[DistributedDataSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#extId:akka.actor.typed.ExtensionId[T] "Permalink")  val extId: [ExtensionId](../../../../actor/typed/ExtensionId.html)\[[DistributedData](DistributedData.html)]Definition Classes[ExtensionSetup](../../../../actor/typed/ExtensionSetup.html)
17. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DistributedDataSetup toStringFormat\[DistributedDataSetup] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DistributedDataSetup, B)ImplicitThis member is added by an implicit conversion from DistributedDataSetup toArrowAssoc\[DistributedDataSetup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ExtensionSetup](../../../../actor/typed/ExtensionSetup.html)\[[DistributedData](DistributedData.html)]

### Inherited from [Setup](../../../../actor/setup/Setup.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDistributedDataSetup to any2stringadd\[DistributedDataSetup]

### Inherited by implicit conversion StringFormat fromDistributedDataSetup to StringFormat\[DistributedDataSetup]

### Inherited by implicit conversion Ensuring fromDistributedDataSetup to Ensuring\[DistributedDataSetup]

### Inherited by implicit conversion ArrowAssoc fromDistributedDataSetup to ArrowAssoc\[DistributedDataSetup]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/api/akka/current/akka/actor/setup/Setup.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/DistributedData$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/DistributedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/ReplicatorSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html](https://doc.akka.io/api/akka/current/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html)*