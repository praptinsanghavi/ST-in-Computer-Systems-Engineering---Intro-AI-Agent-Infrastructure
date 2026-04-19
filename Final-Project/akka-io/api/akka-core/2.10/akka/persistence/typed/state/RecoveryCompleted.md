---
description: Akka 2.10.17 - akka.persistence.typed.state.RecoveryCompleted
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:36:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/RecoveryCompleted.html
title: Akka 2.10.17 - akka.persistence.typed.state.RecoveryCompleted
---

# Akka 2.10.17 - akka.persistence.typed.state.RecoveryCompleted

> **Summary:** Akka 2.10.17 - akka.persistence.typed.state.RecoveryCompleted

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/state/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[state](index.html)
- [**](../../../../akka/persistence/typed/state/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[state](index.html)
- [DurableStateSignal](DurableStateSignal.html "Supertype for all DurableStateBehavior specific signals")
- RecoveryCompleted
- [RecoveryFailed](RecoveryFailed.html)
[c](RecoveryCompleted$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[state](index.html)

# [RecoveryCompleted](RecoveryCompleted$.html "See companion object")[**](../../../../akka/persistence/typed/state/RecoveryCompleted.html "Permalink")

### Companion [object RecoveryCompleted](RecoveryCompleted$.html "See companion object")

#### sealed abstract  class RecoveryCompleted extends [DurableStateSignal](DurableStateSignal.html)

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[DurableStateSignal.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/state/DurableStateSignal.scala#L18)Linear Supertypes[DurableStateSignal](DurableStateSignal.html), [Signal](../../../actor/typed/Signal.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[RecoveryCompleted](RecoveryCompleted$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RecoveryCompleted
2. DurableStateSignal
3. Signal
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
### Value Members

1. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RecoveryCompleted toany2stringadd\[RecoveryCompleted] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RecoveryCompleted, B)ImplicitThis member is added by an implicit conversion from RecoveryCompleted toArrowAssoc\[RecoveryCompleted] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RecoveryCompleted) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RecoveryCompletedImplicitThis member is added by an implicit conversion from RecoveryCompleted toEnsuring\[RecoveryCompleted] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RecoveryCompleted) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RecoveryCompletedImplicitThis member is added by an implicit conversion from RecoveryCompleted toEnsuring\[RecoveryCompleted] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RecoveryCompletedImplicitThis member is added by an implicit conversion from RecoveryCompleted toEnsuring\[RecoveryCompleted] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RecoveryCompletedImplicitThis member is added by an implicit conversion from RecoveryCompleted toEnsuring\[RecoveryCompleted] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RecoveryCompleted toStringFormat\[RecoveryCompleted] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RecoveryCompleted, B)ImplicitThis member is added by an implicit conversion from RecoveryCompleted toArrowAssoc\[RecoveryCompleted] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DurableStateSignal](DurableStateSignal.html)

### Inherited from [Signal](../../../actor/typed/Signal.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRecoveryCompleted to any2stringadd\[RecoveryCompleted]

### Inherited by implicit conversion StringFormat fromRecoveryCompleted to StringFormat\[RecoveryCompleted]

### Inherited by implicit conversion Ensuring fromRecoveryCompleted to Ensuring\[RecoveryCompleted]

### Inherited by implicit conversion ArrowAssoc fromRecoveryCompleted to ArrowAssoc\[RecoveryCompleted]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/DurableStateSignal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/RecoveryCompleted$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/RecoveryCompleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/RecoveryFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/RecoveryCompleted.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/RecoveryCompleted.html)*