---
description: Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior.EventSourced
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html
title: Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior.EventSourced
---

# Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior.EventSourced

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior.EventSourced

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html "Permalink")  object [UnpersistentBehavior](UnpersistentBehavior$.html)Definition Classes[scaladsl](index.html)
- [DurableState](UnpersistentBehavior$$DurableState.html)
- EventSourced
c[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[scaladsl](index.html).[UnpersistentBehavior](UnpersistentBehavior$.html)

# EventSourced[**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html "Permalink")

### 

#### final  case class EventSourced\[Command, Event, State](behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command], eventProbe: [PersistenceProbe](PersistenceProbe.html)\[Event], stateProbe: [PersistenceProbe](PersistenceProbe.html)\[State]) extends [UnpersistentBehavior](UnpersistentBehavior.html)\[Command, State] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[UnpersistentBehavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/scaladsl/UnpersistentBehavior.scala#L65)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [UnpersistentBehavior](UnpersistentBehavior.html)\[Command, State], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventSourced
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

1. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#<init>(behavior:akka.actor.typed.Behavior[Command],eventProbe:akka.persistence.testkit.scaladsl.PersistenceProbe[Event],stateProbe:akka.persistence.testkit.scaladsl.PersistenceProbe[State]):akka.persistence.testkit.scaladsl.UnpersistentBehavior.EventSourced[Command,Event,State] "Permalink")  new EventSourced(behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command], eventProbe: [PersistenceProbe](PersistenceProbe.html)\[Event], stateProbe: [PersistenceProbe](PersistenceProbe.html)\[State])
### Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventSourced\[Command, Event, State] toany2stringadd\[EventSourced\[Command, Event, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventSourced\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from EventSourced\[Command, Event, State] toArrowAssoc\[EventSourced\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#apply(f:(akka.actor.testkit.typed.scaladsl.BehaviorTestKit[Command],akka.persistence.testkit.scaladsl.PersistenceProbe[Event],akka.persistence.testkit.scaladsl.PersistenceProbe[State])=>Unit):Unit "Permalink")  def apply(f: ([BehaviorTestKit](../../../actor/testkit/typed/scaladsl/BehaviorTestKit.html)\[Command], [PersistenceProbe](PersistenceProbe.html)\[Event], [PersistenceProbe](PersistenceProbe.html)\[State]) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
7. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#behavior:akka.actor.typed.Behavior[Command] "Permalink")  val behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command]Definition ClassesEventSourced → [UnpersistentBehavior](UnpersistentBehavior.html)
9. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#behaviorTestKit:akka.actor.testkit.typed.scaladsl.BehaviorTestKit[Command] "Permalink")  lazy val behaviorTestKit: [BehaviorTestKit](../../../actor/testkit/typed/scaladsl/BehaviorTestKit.html)\[Command]Definition Classes[UnpersistentBehavior](UnpersistentBehavior.html)
10. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventSourced\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventSourced\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourced\[Command, Event, State] toEnsuring\[EventSourced\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventSourced\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventSourced\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourced\[Command, Event, State] toEnsuring\[EventSourced\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventSourced\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourced\[Command, Event, State] toEnsuring\[EventSourced\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventSourced\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourced\[Command, Event, State] toEnsuring\[EventSourced\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#eventProbe:akka.persistence.testkit.scaladsl.PersistenceProbe[Event] "Permalink")  val eventProbe: [PersistenceProbe](PersistenceProbe.html)\[Event]
17. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
23. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#snapshotProbe:akka.persistence.testkit.scaladsl.PersistenceProbe[State] "Permalink")  def snapshotProbe: [PersistenceProbe](PersistenceProbe.html)\[State]
24. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#stateProbe:akka.persistence.testkit.scaladsl.PersistenceProbe[State] "Permalink")  val stateProbe: [PersistenceProbe](PersistenceProbe.html)\[State]Definition ClassesEventSourced → [UnpersistentBehavior](UnpersistentBehavior.html)
25. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventSourced\[Command, Event, State] toStringFormat\[EventSourced\[Command, Event, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventSourced\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from EventSourced\[Command, Event, State] toArrowAssoc\[EventSourced\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [UnpersistentBehavior](UnpersistentBehavior.html)\[Command, State]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventSourced\[Command, Event, State] to any2stringadd\[EventSourced\[Command, Event, State]]

### Inherited by implicit conversion StringFormat fromEventSourced\[Command, Event, State] to StringFormat\[EventSourced\[Command, Event, State]]

### Inherited by implicit conversion Ensuring fromEventSourced\[Command, Event, State] to Ensuring\[EventSourced\[Command, Event, State]]

### Inherited by implicit conversion ArrowAssoc fromEventSourced\[Command, Event, State] to ArrowAssoc\[EventSourced\[Command, Event, State]]

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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html)*