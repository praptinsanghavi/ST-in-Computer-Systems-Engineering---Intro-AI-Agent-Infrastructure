---
description: Akka 2.10.17 - akka.cluster.ddata.ORMap.DeltaOp
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:53:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/ORMap$$DeltaOp.html
title: Akka 2.10.17 - akka.cluster.ddata.ORMap.DeltaOp
---

# Akka 2.10.17 - akka.cluster.ddata.ORMap.DeltaOp

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.ORMap.DeltaOp

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/ddata/ORMap$.html "Permalink")  object [ORMap](ORMap$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[ddata](index.html)
- DeltaOp
t[akka](../../index.html).[cluster](../index.html).[ddata](index.html).[ORMap](ORMap$.html)

# DeltaOp[**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html "Permalink")

### 

#### sealed  trait DeltaOp extends [ReplicatedDelta](ReplicatedDelta.html) with [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html)

Source[ORMap.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/ORMap.scala#L30)Linear Supertypes[ReplicatedDataSerialization](ReplicatedDataSerialization.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html), [ReplicatedDelta](ReplicatedDelta.html), [ReplicatedData](ReplicatedData.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DeltaOp
2. ReplicatedDataSerialization
3. Serializable
4. RequiresCausalDeliveryOfDeltas
5. ReplicatedDelta
6. ReplicatedData
7. AnyRef
8. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#T=akka.cluster.ddata.ORMap.DeltaOp "Permalink")  type T \= DeltaOpThe type of the concrete implementation, e.g.

The type of the concrete implementation, e.g. `GSet[A]`.
To be specified by subclass.

Definition ClassesDeltaOp → [ReplicatedData](ReplicatedData.html)
### Abstract Value Members

1. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#merge(that:ReplicatedData.this.T):ReplicatedData.this.T "Permalink") abstract  def merge(that: [T](#T=akka.cluster.ddata.ORMap.DeltaOp)): [T](#T=akka.cluster.ddata.ORMap.DeltaOp)Monotonic merge function.

Monotonic merge function.

Definition Classes[ReplicatedData](ReplicatedData.html)
2. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#zero:akka.cluster.ddata.DeltaReplicatedData "Permalink") abstract  def zero: [DeltaReplicatedData](DeltaReplicatedData.html)The empty full state.

The empty full state. This is used when a delta is received
and no existing full state exists on the receiving side. Then
the delta is merged into the `zero` to create the initial full state.

Definition ClassesDeltaOp → [ReplicatedDelta](ReplicatedDelta.html)
### Concrete Value Members

1. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DeltaOp toany2stringadd\[DeltaOp] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DeltaOp, B)ImplicitThis member is added by an implicit conversion from DeltaOp toArrowAssoc\[DeltaOp] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DeltaOp) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DeltaOpImplicitThis member is added by an implicit conversion from DeltaOp toEnsuring\[DeltaOp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DeltaOp) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DeltaOpImplicitThis member is added by an implicit conversion from DeltaOp toEnsuring\[DeltaOp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DeltaOpImplicitThis member is added by an implicit conversion from DeltaOp toEnsuring\[DeltaOp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DeltaOpImplicitThis member is added by an implicit conversion from DeltaOp toEnsuring\[DeltaOp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DeltaOp toStringFormat\[DeltaOp] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/ORMap$$DeltaOp.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DeltaOp, B)ImplicitThis member is added by an implicit conversion from DeltaOp toArrowAssoc\[DeltaOp] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ReplicatedDataSerialization](ReplicatedDataSerialization.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html)

### Inherited from [ReplicatedDelta](ReplicatedDelta.html)

### Inherited from [ReplicatedData](ReplicatedData.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDeltaOp to any2stringadd\[DeltaOp]

### Inherited by implicit conversion StringFormat fromDeltaOp to StringFormat\[DeltaOp]

### Inherited by implicit conversion Ensuring fromDeltaOp to Ensuring\[DeltaOp]

### Inherited by implicit conversion ArrowAssoc fromDeltaOp to ArrowAssoc\[DeltaOp]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMap$$DeltaOp.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMap$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ReplicatedDataSerialization.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ReplicatedDelta.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/RequiresCausalDeliveryOfDeltas.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMap$$DeltaOp.html](https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMap$$DeltaOp.html)*