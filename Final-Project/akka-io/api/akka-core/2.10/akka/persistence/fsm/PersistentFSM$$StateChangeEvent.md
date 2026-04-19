---
description: Akka 2.10.17 - akka.persistence.fsm.PersistentFSM.StateChangeEvent
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:17:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html
title: Akka 2.10.17 - akka.persistence.fsm.PersistentFSM.StateChangeEvent
---

# Akka 2.10.17 - akka.persistence.fsm.PersistentFSM.StateChangeEvent

> **Summary:** Akka 2.10.17 - akka.persistence.fsm.PersistentFSM.StateChangeEvent

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/fsm/index.html "Permalink")  package [fsm](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/fsm/PersistentFSM$.html "Permalink")  object [PersistentFSM](PersistentFSM$.html "Note: Deprecated and removed except for the event and snapshot types which are needed for migrating existing PersistentFSM actors to EventSourcedBehavior using the akka.persistence.typed.scaladsl.PersistentFSMMigration and akka.persistence.typed.javadsl.PersistentFSMMigration")Note: Deprecated and removed except for the event and snapshot types which are needed for migrating existing
PersistentFSM actors to EventSourcedBehavior using the `akka.persistence.typed.scaladsl.PersistentFSMMigration`
and `akka.persistence.typed.javadsl.PersistentFSMMigration`

Note: Deprecated and removed except for the event and snapshot types which are needed for migrating existing
PersistentFSM actors to EventSourcedBehavior using the `akka.persistence.typed.scaladsl.PersistentFSMMigration`
and `akka.persistence.typed.javadsl.PersistentFSMMigration`

Definition Classes[fsm](index.html)
- [PersistentFsmEvent](PersistentFSM$$PersistentFsmEvent.html)
- StateChangeEvent
c[akka](../../index.html).[persistence](../index.html).[fsm](index.html).[PersistentFSM](PersistentFSM$.html)

# StateChangeEvent[**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html "Permalink")

### 

#### case class StateChangeEvent(stateIdentifier: String, timeout: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)]) extends [PersistentFsmEvent](PersistentFSM$$PersistentFsmEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Persisted on state change
Not deprecated as used for users migrating from PersistentFSM to EventSourcedBehavior

stateIdentifierFSM state identifier

timeoutFSM state timeout

Source[PersistentFSM.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/fsm/PersistentFSM.scala#L28)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [PersistentFsmEvent](PersistentFSM$$PersistentFsmEvent.html), [Message](../serialization/Message.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StateChangeEvent
2. Product
3. Equals
4. PersistentFsmEvent
5. Message
6. Serializable
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
### Instance Constructors

1. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#<init>(stateIdentifier:String,timeout:Option[scala.concurrent.duration.FiniteDuration]):akka.persistence.fsm.PersistentFSM.StateChangeEvent "Permalink")  new StateChangeEvent(stateIdentifier: String, timeout: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)])stateIdentifierFSM state identifier

timeoutFSM state timeout
### Value Members

1. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StateChangeEvent toany2stringadd\[StateChangeEvent] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StateChangeEvent, B)ImplicitThis member is added by an implicit conversion from StateChangeEvent toArrowAssoc\[StateChangeEvent] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StateChangeEvent) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StateChangeEventImplicitThis member is added by an implicit conversion from StateChangeEvent toEnsuring\[StateChangeEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StateChangeEvent) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StateChangeEventImplicitThis member is added by an implicit conversion from StateChangeEvent toEnsuring\[StateChangeEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StateChangeEventImplicitThis member is added by an implicit conversion from StateChangeEvent toEnsuring\[StateChangeEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StateChangeEventImplicitThis member is added by an implicit conversion from StateChangeEvent toEnsuring\[StateChangeEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
19. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#stateIdentifier:String "Permalink")  val stateIdentifier: String
20. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#timeout:Option[scala.concurrent.duration.FiniteDuration] "Permalink")  val timeout: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)]
22. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StateChangeEvent toStringFormat\[StateChangeEvent] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StateChangeEvent, B)ImplicitThis member is added by an implicit conversion from StateChangeEvent toArrowAssoc\[StateChangeEvent] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [PersistentFsmEvent](PersistentFSM$$PersistentFsmEvent.html)

### Inherited from [Message](../serialization/Message.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStateChangeEvent to any2stringadd\[StateChangeEvent]

### Inherited by implicit conversion StringFormat fromStateChangeEvent to StringFormat\[StateChangeEvent]

### Inherited by implicit conversion Ensuring fromStateChangeEvent to Ensuring\[StateChangeEvent]

### Inherited by implicit conversion ArrowAssoc fromStateChangeEvent to ArrowAssoc\[StateChangeEvent]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/fsm/PersistentFSM$$PersistentFsmEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/fsm/PersistentFSM$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/fsm/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/serialization/Message.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html)*