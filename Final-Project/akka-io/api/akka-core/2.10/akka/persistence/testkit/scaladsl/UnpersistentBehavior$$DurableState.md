---
description: Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior.DurableState
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html
title: Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior.DurableState
---

# Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior.DurableState

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior.DurableState

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html "Permalink")  object [UnpersistentBehavior](UnpersistentBehavior$.html)Definition Classes[scaladsl](index.html)
- DurableState
- [EventSourced](UnpersistentBehavior$$EventSourced.html)
c[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[scaladsl](index.html).[UnpersistentBehavior](UnpersistentBehavior$.html)

# DurableState[**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html "Permalink")

### 

#### final  case class DurableState\[Command, State](behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command], stateProbe: [PersistenceProbe](PersistenceProbe.html)\[State]) extends [UnpersistentBehavior](UnpersistentBehavior.html)\[Command, State] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[UnpersistentBehavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/scaladsl/UnpersistentBehavior.scala#L76)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [UnpersistentBehavior](UnpersistentBehavior.html)\[Command, State], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableState
2. Serializable
3. Product
4. Equals
5. UnpersistentBehavior
6. AnyRef
7. Any
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

1. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#<init>(behavior:akka.actor.typed.Behavior[Command],stateProbe:akka.persistence.testkit.scaladsl.PersistenceProbe[State]):akka.persistence.testkit.scaladsl.UnpersistentBehavior.DurableState[Command,State] "Permalink")  new DurableState(behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command], stateProbe: [PersistenceProbe](PersistenceProbe.html)\[State])
### Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DurableState\[Command, State] toany2stringadd\[DurableState\[Command, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DurableState\[Command, State], B)ImplicitThis member is added by an implicit conversion from DurableState\[Command, State] toArrowAssoc\[DurableState\[Command, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#apply(f:(akka.actor.testkit.typed.scaladsl.BehaviorTestKit[Command],akka.persistence.testkit.scaladsl.PersistenceProbe[State])=>Unit):Unit "Permalink")  def apply(f: ([BehaviorTestKit](../../../actor/testkit/typed/scaladsl/BehaviorTestKit.html)\[Command], [PersistenceProbe](PersistenceProbe.html)\[State]) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
7. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#behavior:akka.actor.typed.Behavior[Command] "Permalink")  val behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command]Definition ClassesDurableState → [UnpersistentBehavior](UnpersistentBehavior.html)
9. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#behaviorTestKit:akka.actor.testkit.typed.scaladsl.BehaviorTestKit[Command] "Permalink")  lazy val behaviorTestKit: [BehaviorTestKit](../../../actor/testkit/typed/scaladsl/BehaviorTestKit.html)\[Command]Definition Classes[UnpersistentBehavior](UnpersistentBehavior.html)
10. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DurableState\[Command, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableState\[Command, State]ImplicitThis member is added by an implicit conversion from DurableState\[Command, State] toEnsuring\[DurableState\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DurableState\[Command, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableState\[Command, State]ImplicitThis member is added by an implicit conversion from DurableState\[Command, State] toEnsuring\[DurableState\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableState\[Command, State]ImplicitThis member is added by an implicit conversion from DurableState\[Command, State] toEnsuring\[DurableState\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableState\[Command, State]ImplicitThis member is added by an implicit conversion from DurableState\[Command, State] toEnsuring\[DurableState\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#stateProbe:akka.persistence.testkit.scaladsl.PersistenceProbe[State] "Permalink")  val stateProbe: [PersistenceProbe](PersistenceProbe.html)\[State]Definition ClassesDurableState → [UnpersistentBehavior](UnpersistentBehavior.html)
23. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DurableState\[Command, State] toStringFormat\[DurableState\[Command, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DurableState\[Command, State], B)ImplicitThis member is added by an implicit conversion from DurableState\[Command, State] toArrowAssoc\[DurableState\[Command, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [UnpersistentBehavior](UnpersistentBehavior.html)\[Command, State]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDurableState\[Command, State] to any2stringadd\[DurableState\[Command, State]]

### Inherited by implicit conversion StringFormat fromDurableState\[Command, State] to StringFormat\[DurableState\[Command, State]]

### Inherited by implicit conversion Ensuring fromDurableState\[Command, State] to Ensuring\[DurableState\[Command, State]]

### Inherited by implicit conversion ArrowAssoc fromDurableState\[Command, State] to ArrowAssoc\[DurableState\[Command, State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html)*