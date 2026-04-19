---
description: Akka 2.10.17 - akka.persistence.testkit.javadsl.UnpersistentBehavior
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/javadsl/UnpersistentBehavior.html
title: Akka 2.10.17 - akka.persistence.testkit.javadsl.UnpersistentBehavior
---

# Akka 2.10.17 - akka.persistence.testkit.javadsl.UnpersistentBehavior

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.javadsl.UnpersistentBehavior

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[testkit](../index.html)
- [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html)
- [PersistenceEffect](PersistenceEffect.html)
- [PersistenceInit](PersistenceInit$.html "Test utility to initialize persistence plugins.")
- [PersistenceProbe](PersistenceProbe.html "Not for user extension")
- [PersistenceTestKit](PersistenceTestKit.html "Class for testing persisted events in persistent actors.")
- [SnapshotTestKit](SnapshotTestKit.html "Class for testing persisted snapshots in persistent actors.")
- UnpersistentBehavior
[c](UnpersistentBehavior$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[javadsl](index.html)

# [UnpersistentBehavior](UnpersistentBehavior$.html "See companion object")[**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html "Permalink")

### Companion [object UnpersistentBehavior](UnpersistentBehavior$.html "See companion object")

#### final  class UnpersistentBehavior\[Command, Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[UnpersistentBehavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/javadsl/UnpersistentBehavior.scala#L88)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
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
### Value Members

1. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, Event, State] toany2stringadd\[UnpersistentBehavior\[Command, Event, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (UnpersistentBehavior\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, Event, State] toArrowAssoc\[UnpersistentBehavior\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (UnpersistentBehavior\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnpersistentBehavior\[Command, Event, State]ImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, Event, State] toEnsuring\[UnpersistentBehavior\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (UnpersistentBehavior\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnpersistentBehavior\[Command, Event, State]ImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, Event, State] toEnsuring\[UnpersistentBehavior\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnpersistentBehavior\[Command, Event, State]ImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, Event, State] toEnsuring\[UnpersistentBehavior\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnpersistentBehavior\[Command, Event, State]ImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, Event, State] toEnsuring\[UnpersistentBehavior\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#getBehavior():akka.actor.typed.Behavior[Command] "Permalink")  def getBehavior(): [Behavior](../../../actor/typed/Behavior.html)\[Command]
15. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#getBehaviorTestKit():akka.actor.testkit.typed.javadsl.BehaviorTestKit[Command] "Permalink")  def getBehaviorTestKit(): [BehaviorTestKit](../../../actor/testkit/typed/javadsl/BehaviorTestKit.html)\[Command]
16. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#getEventProbe():akka.persistence.testkit.javadsl.PersistenceProbe[Event] "Permalink")  def getEventProbe(): [PersistenceProbe](PersistenceProbe.html)\[Event]Note: durable state behaviors will not publish events to this probe
18. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#getSnapshotProbe():akka.persistence.testkit.javadsl.PersistenceProbe[State] "Permalink")  def getSnapshotProbe(): [PersistenceProbe](PersistenceProbe.html)\[State]
19. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#getStateProbe():akka.persistence.testkit.javadsl.PersistenceProbe[State] "Permalink")  def getStateProbe(): [PersistenceProbe](PersistenceProbe.html)\[State]
20. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, Event, State] toStringFormat\[UnpersistentBehavior\[Command, Event, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (UnpersistentBehavior\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from UnpersistentBehavior\[Command, Event, State] toArrowAssoc\[UnpersistentBehavior\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUnpersistentBehavior\[Command, Event, State] to any2stringadd\[UnpersistentBehavior\[Command, Event, State]]

### Inherited by implicit conversion StringFormat fromUnpersistentBehavior\[Command, Event, State] to StringFormat\[UnpersistentBehavior\[Command, Event, State]]

### Inherited by implicit conversion Ensuring fromUnpersistentBehavior\[Command, Event, State] to Ensuring\[UnpersistentBehavior\[Command, Event, State]]

### Inherited by implicit conversion ArrowAssoc fromUnpersistentBehavior\[Command, Event, State] to ArrowAssoc\[UnpersistentBehavior\[Command, Event, State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceEffect.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceInit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceProbe.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceTestKit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceTestKit.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/SnapshotTestKit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/SnapshotTestKit.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/UnpersistentBehavior$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/UnpersistentBehavior.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/UnpersistentBehavior.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/UnpersistentBehavior.html)*