---
description: Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.Command
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue$$Command.html
title: Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.Command
---

# Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.Command

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.Command

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$.html "Permalink")  object [DurableProducerQueue](DurableProducerQueue$.html "Actor message protocol for storing and confirming reliable delivery of messages.")Actor message protocol for storing and confirming reliable delivery of messages.

Actor message protocol for storing and confirming reliable delivery of messages. A [akka.actor.typed.Behavior](../Behavior.html)
implementation of this protocol can optionally be used with [ProducerController](ProducerController$.html) when messages shall survive
a crash of the producer side.

An implementation of this exists in `akka.persistence.typed.delivery.EventSourcedProducerQueue`.

Definition Classes[delivery](index.html)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
- Command
- [LoadState](DurableProducerQueue$$LoadState.html "Request that is used at startup to retrieve the unconfirmed messages and current sequence number.")
- [MessageSent](DurableProducerQueue$$MessageSent.html "The fact (event) that a message has been sent.")
- [State](DurableProducerQueue$$State.html)
- [StoreMessageConfirmed](DurableProducerQueue$$StoreMessageConfirmed.html "Store the fact that a message has been confirmed to be delivered and processed.")
- [StoreMessageSent](DurableProducerQueue$$StoreMessageSent.html "Store the fact that a message is to be sent.")
- [StoreMessageSentAck](DurableProducerQueue$$StoreMessageSentAck.html)
t[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[delivery](index.html).[DurableProducerQueue](DurableProducerQueue$.html)

# Command[**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html "Permalink")

### 

#### trait Command\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[DurableProducerQueue.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/DurableProducerQueue.scala#L33)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[LoadState](DurableProducerQueue$$LoadState.html), [StoreMessageConfirmed](DurableProducerQueue$$StoreMessageConfirmed.html), [StoreMessageSent](DurableProducerQueue$$StoreMessageSent.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Command
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

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Command\[A] toany2stringadd\[Command\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Command\[A], B)ImplicitThis member is added by an implicit conversion from Command\[A] toArrowAssoc\[Command\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Command\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Command\[A]ImplicitThis member is added by an implicit conversion from Command\[A] toEnsuring\[Command\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Command\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Command\[A]ImplicitThis member is added by an implicit conversion from Command\[A] toEnsuring\[Command\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Command\[A]ImplicitThis member is added by an implicit conversion from Command\[A] toEnsuring\[Command\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Command\[A]ImplicitThis member is added by an implicit conversion from Command\[A] toEnsuring\[Command\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Command\[A] toStringFormat\[Command\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$Command.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Command\[A], B)ImplicitThis member is added by an implicit conversion from Command\[A] toArrowAssoc\[Command\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCommand\[A] to any2stringadd\[Command\[A]]

### Inherited by implicit conversion StringFormat fromCommand\[A] to StringFormat\[Command\[A]]

### Inherited by implicit conversion Ensuring fromCommand\[A] to Ensuring\[Command\[A]]

### Inherited by implicit conversion ArrowAssoc fromCommand\[A] to ArrowAssoc\[Command\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$$LoadState.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$$MessageSent.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$$State$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$$State.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageSent.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageSentAck.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$$Command.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$$Command.html)*