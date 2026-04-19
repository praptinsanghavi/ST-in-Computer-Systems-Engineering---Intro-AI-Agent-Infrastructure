---
description: Akka 2.10.17 - akka.persistence.typed.crdt.ORSet.RemoveDeltaOp
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html
title: Akka 2.10.17 - akka.persistence.typed.crdt.ORSet.RemoveDeltaOp
---

# Akka 2.10.17 - akka.persistence.typed.crdt.ORSet.RemoveDeltaOp

> **Summary:** Akka 2.10.17 - akka.persistence.typed.crdt.ORSet.RemoveDeltaOp

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/crdt/index.html "Permalink")  package [crdt](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/crdt/ORSet$.html "Permalink")  object [ORSet](ORSet$.html)Definition Classes[crdt](index.html)
- [AddDeltaOp](ORSet$$AddDeltaOp.html)
- [DeltaGroup](ORSet$$DeltaGroup.html)
- [DeltaOp](ORSet$$DeltaOp.html)
- [FullStateDeltaOp](ORSet$$FullStateDeltaOp.html "Used for clear but could be used for other cases also")
- RemoveDeltaOp
[c](ORSet$$RemoveDeltaOp$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[crdt](index.html).[ORSet](ORSet$.html)

# [RemoveDeltaOp](ORSet$$RemoveDeltaOp$.html "See companion object")[**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html "Permalink")

### Companion [object RemoveDeltaOp](ORSet$$RemoveDeltaOp$.html "See companion object")

#### final  class RemoveDeltaOp\[A] extends AtomicDeltaOp\[A]

Source[ORSet.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/crdt/ORSet.scala#L94)Linear SupertypesAtomicDeltaOp\[A], [DeltaOp](ORSet$$DeltaOp.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RemoveDeltaOp
2. AtomicDeltaOp
3. DeltaOp
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

1. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#<init>(underlying:akka.persistence.typed.crdt.ORSet[A]):akka.persistence.typed.crdt.ORSet.RemoveDeltaOp[A] "Permalink")  new RemoveDeltaOp(underlying: [ORSet](ORSet.html)\[A])
### Value Members

1. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RemoveDeltaOp\[A] toany2stringadd\[RemoveDeltaOp\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RemoveDeltaOp\[A], B)ImplicitThis member is added by an implicit conversion from RemoveDeltaOp\[A] toArrowAssoc\[RemoveDeltaOp\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RemoveDeltaOp\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RemoveDeltaOp\[A]ImplicitThis member is added by an implicit conversion from RemoveDeltaOp\[A] toEnsuring\[RemoveDeltaOp\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RemoveDeltaOp\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RemoveDeltaOp\[A]ImplicitThis member is added by an implicit conversion from RemoveDeltaOp\[A] toEnsuring\[RemoveDeltaOp\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RemoveDeltaOp\[A]ImplicitThis member is added by an implicit conversion from RemoveDeltaOp\[A] toEnsuring\[RemoveDeltaOp\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RemoveDeltaOp\[A]ImplicitThis member is added by an implicit conversion from RemoveDeltaOp\[A] toEnsuring\[RemoveDeltaOp\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesRemoveDeltaOp → AnyRef → Any
14. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesRemoveDeltaOp → AnyRef → Any
16. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#merge(that:akka.persistence.typed.crdt.ORSet.DeltaOp):akka.persistence.typed.crdt.ORSet.DeltaOp "Permalink")  def merge(that: [DeltaOp](ORSet$$DeltaOp.html)): [DeltaOp](ORSet$$DeltaOp.html)Definition ClassesRemoveDeltaOp → [DeltaOp](ORSet$$DeltaOp.html)
18. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#toString():String "Permalink")  def toString(): StringDefinition ClassesRemoveDeltaOp → AnyRef → Any
23. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#underlying:akka.persistence.typed.crdt.ORSet[A] "Permalink")  val underlying: [ORSet](ORSet.html)\[A]Definition ClassesRemoveDeltaOp → AtomicDeltaOp
24. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RemoveDeltaOp\[A] toStringFormat\[RemoveDeltaOp\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RemoveDeltaOp\[A], B)ImplicitThis member is added by an implicit conversion from RemoveDeltaOp\[A] toArrowAssoc\[RemoveDeltaOp\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from AtomicDeltaOp\[A]

### Inherited from [DeltaOp](ORSet$$DeltaOp.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRemoveDeltaOp\[A] to any2stringadd\[RemoveDeltaOp\[A]]

### Inherited by implicit conversion StringFormat fromRemoveDeltaOp\[A] to StringFormat\[RemoveDeltaOp\[A]]

### Inherited by implicit conversion Ensuring fromRemoveDeltaOp\[A] to Ensuring\[RemoveDeltaOp\[A]]

### Inherited by implicit conversion ArrowAssoc fromRemoveDeltaOp\[A] to ArrowAssoc\[RemoveDeltaOp\[A]]

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
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$RemoveDeltaOp.html)*