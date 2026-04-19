---
description: Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:48:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
title: Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior
---

# Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[testkit](../index.html)
- [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html)
- [PersistenceEffect](PersistenceEffect.html)
- [PersistenceInit](PersistenceInit$.html "Test utility to initialize persistence plugins.")
- [PersistenceProbe](PersistenceProbe.html "Not for user extension")
- [PersistenceTestKit](PersistenceTestKit.html "Class for testing events of persistent actors.")
- [SnapshotTestKit](SnapshotTestKit.html "Class for testing snapshots of persistent actors.")
- UnpersistentBehavior
[t](UnpersistentBehavior$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[scaladsl](index.html)

# [UnpersistentBehavior](UnpersistentBehavior$.html "See companion object")[**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html "Permalink")

### Companion [object UnpersistentBehavior](UnpersistentBehavior$.html "See companion object")

#### sealed  trait UnpersistentBehavior\[Command, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[UnpersistentBehavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/scaladsl/UnpersistentBehavior.scala#L14)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[DurableState](UnpersistentBehavior$$DurableState.html), [EventSourced](UnpersistentBehavior$$EventSourced.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UnpersistentBehavior
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

1. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#behavior:akka.actor.typed.Behavior[Command] "Permalink") abstract  val behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command]
2. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#stateProbe:akka.persistence.testkit.scaladsl.PersistenceProbe[State] "Permalink") abstract  def stateProbe: [PersistenceProbe](PersistenceProbe.html)\[State]
### Concrete Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, State] toany2stringadd\[UnpersistentBehavior\[Command, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (UnpersistentBehavior\[Command, State], B)ImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, State] toArrowAssoc\[UnpersistentBehavior\[Command, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#behaviorTestKit:akka.actor.testkit.typed.scaladsl.BehaviorTestKit[Command] "Permalink")  lazy val behaviorTestKit: [BehaviorTestKit](../../../actor/testkit/typed/scaladsl/BehaviorTestKit.html)\[Command]
8. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (UnpersistentBehavior\[Command, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnpersistentBehavior\[Command, State]ImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, State] toEnsuring\[UnpersistentBehavior\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (UnpersistentBehavior\[Command, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnpersistentBehavior\[Command, State]ImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, State] toEnsuring\[UnpersistentBehavior\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnpersistentBehavior\[Command, State]ImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, State] toEnsuring\[UnpersistentBehavior\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnpersistentBehavior\[Command, State]ImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, State] toEnsuring\[UnpersistentBehavior\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, State] toStringFormat\[UnpersistentBehavior\[Command, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (UnpersistentBehavior\[Command, State], B)ImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, State] toArrowAssoc\[UnpersistentBehavior\[Command, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUnpersistentBehavior\[Command, State] to any2stringadd\[UnpersistentBehavior\[Command, State]]

### Inherited by implicit conversion StringFormat fromUnpersistentBehavior\[Command, State] to StringFormat\[UnpersistentBehavior\[Command, State]]

### Inherited by implicit conversion Ensuring fromUnpersistentBehavior\[Command, State] to Ensuring\[UnpersistentBehavior\[Command, State]]

### Inherited by implicit conversion ArrowAssoc fromUnpersistentBehavior\[Command, State] to ArrowAssoc\[UnpersistentBehavior\[Command, State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/PersistenceEffect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/PersistenceInit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/PersistenceProbe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/PersistenceTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/SnapshotTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html)*