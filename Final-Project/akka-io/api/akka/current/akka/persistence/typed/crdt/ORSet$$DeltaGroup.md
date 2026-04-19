---
description: Akka 2.10.17 - akka.persistence.typed.crdt.ORSet.DeltaGroup
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/ORSet$$DeltaGroup.html
title: Akka 2.10.17 - akka.persistence.typed.crdt.ORSet.DeltaGroup
---

# Akka 2.10.17 - akka.persistence.typed.crdt.ORSet.DeltaGroup

> **Summary:** Akka 2.10.17 - akka.persistence.typed.crdt.ORSet.DeltaGroup

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/crdt/index.html "Permalink")  package [crdt](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/crdt/ORSet$.html "Permalink")  object [ORSet](ORSet$.html)Definition Classes[crdt](index.html)
- [AddDeltaOp](ORSet$$AddDeltaOp.html)
- DeltaGroup
- [DeltaOp](ORSet$$DeltaOp.html)
- [FullStateDeltaOp](ORSet$$FullStateDeltaOp.html "Used for clear but could be used for other cases also")
- [RemoveDeltaOp](ORSet$$RemoveDeltaOp.html)
[c](ORSet$$DeltaGroup$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[crdt](index.html).[ORSet](ORSet$.html)

# [DeltaGroup](ORSet$$DeltaGroup$.html "See companion object")[**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html "Permalink")

### Companion [object DeltaGroup](ORSet$$DeltaGroup$.html "See companion object")

#### final  class DeltaGroup\[A] extends [DeltaOp](ORSet$$DeltaOp.html)

Source[ORSet.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/crdt/ORSet.scala#L146)Linear Supertypes[DeltaOp](ORSet$$DeltaOp.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DeltaGroup
2. DeltaOp
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

1. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#<init>(ops:IndexedSeq[akka.persistence.typed.crdt.ORSet.DeltaOp]):akka.persistence.typed.crdt.ORSet.DeltaGroup[A] "Permalink")  new DeltaGroup(ops: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[DeltaOp](ORSet$$DeltaOp.html)])
### Value Members

1. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DeltaGroup\[A] toany2stringadd\[DeltaGroup\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DeltaGroup\[A], B)ImplicitThis member is added by an implicit conversion from DeltaGroup\[A] toArrowAssoc\[DeltaGroup\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DeltaGroup\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DeltaGroup\[A]ImplicitThis member is added by an implicit conversion from DeltaGroup\[A] toEnsuring\[DeltaGroup\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DeltaGroup\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DeltaGroup\[A]ImplicitThis member is added by an implicit conversion from DeltaGroup\[A] toEnsuring\[DeltaGroup\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DeltaGroup\[A]ImplicitThis member is added by an implicit conversion from DeltaGroup\[A] toEnsuring\[DeltaGroup\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DeltaGroup\[A]ImplicitThis member is added by an implicit conversion from DeltaGroup\[A] toEnsuring\[DeltaGroup\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesDeltaGroup → AnyRef → Any
14. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesDeltaGroup → AnyRef → Any
16. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#merge(that:akka.persistence.typed.crdt.ORSet.DeltaOp):akka.persistence.typed.crdt.ORSet.DeltaOp "Permalink")  def merge(that: [DeltaOp](ORSet$$DeltaOp.html)): [DeltaOp](ORSet$$DeltaOp.html)Definition ClassesDeltaGroup → [DeltaOp](ORSet$$DeltaOp.html)
18. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#ops:IndexedSeq[akka.persistence.typed.crdt.ORSet.DeltaOp] "Permalink")  val ops: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[DeltaOp](ORSet$$DeltaOp.html)]
22. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#toString():String "Permalink")  def toString(): StringDefinition ClassesDeltaGroup → AnyRef → Any
24. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DeltaGroup\[A] toStringFormat\[DeltaGroup\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/crdt/ORSet$$DeltaGroup.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DeltaGroup\[A], B)ImplicitThis member is added by an implicit conversion from DeltaGroup\[A] toArrowAssoc\[DeltaGroup\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DeltaOp](ORSet$$DeltaOp.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDeltaGroup\[A] to any2stringadd\[DeltaGroup\[A]]

### Inherited by implicit conversion StringFormat fromDeltaGroup\[A] to StringFormat\[DeltaGroup\[A]]

### Inherited by implicit conversion Ensuring fromDeltaGroup\[A] to Ensuring\[DeltaGroup\[A]]

### Inherited by implicit conversion ArrowAssoc fromDeltaGroup\[A] to ArrowAssoc\[DeltaGroup\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$AddDeltaOp$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$AddDeltaOp.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$DeltaGroup$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$DeltaGroup.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$DeltaOp.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$FullStateDeltaOp$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$FullStateDeltaOp.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$DeltaGroup.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$DeltaGroup.html)*