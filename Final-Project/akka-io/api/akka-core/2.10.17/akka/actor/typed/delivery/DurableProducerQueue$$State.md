---
description: Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.State
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:21:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue$$State.html
title: Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.State
---

# Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.State

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.State

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
- [Command](DurableProducerQueue$$Command.html)
- [LoadState](DurableProducerQueue$$LoadState.html "Request that is used at startup to retrieve the unconfirmed messages and current sequence number.")
- [MessageSent](DurableProducerQueue$$MessageSent.html "The fact (event) that a message has been sent.")
- State
- [StoreMessageConfirmed](DurableProducerQueue$$StoreMessageConfirmed.html "Store the fact that a message has been confirmed to be delivered and processed.")
- [StoreMessageSent](DurableProducerQueue$$StoreMessageSent.html "Store the fact that a message is to be sent.")
- [StoreMessageSentAck](DurableProducerQueue$$StoreMessageSentAck.html)
[c](DurableProducerQueue$$State$.html "See companion object")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[delivery](index.html).[DurableProducerQueue](DurableProducerQueue$.html)

# [State](DurableProducerQueue$$State$.html "See companion object")[**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html "Permalink")

### Companion [object State](DurableProducerQueue$$State$.html "See companion object")

#### final  case class State\[A](currentSeqNr: [SeqNr](DurableProducerQueue$.html#SeqNr=Long), highestConfirmedSeqNr: [SeqNr](DurableProducerQueue$.html#SeqNr=Long), confirmedSeqNr: Map\[[ConfirmationQualifier](DurableProducerQueue$.html#ConfirmationQualifier=String), ([SeqNr](DurableProducerQueue$.html#SeqNr=Long), [TimestampMillis](DurableProducerQueue$.html#TimestampMillis=Long))], unconfirmed: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[MessageSent](DurableProducerQueue$$MessageSent.html)\[A]]) extends DeliverySerializable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[DurableProducerQueue.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/DurableProducerQueue.scala#L66)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), DeliverySerializable, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. State
2. Serializable
3. Product
4. Equals
5. DeliverySerializable
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

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#<init>(currentSeqNr:akka.actor.typed.delivery.DurableProducerQueue.SeqNr,highestConfirmedSeqNr:akka.actor.typed.delivery.DurableProducerQueue.SeqNr,confirmedSeqNr:Map[akka.actor.typed.delivery.DurableProducerQueue.ConfirmationQualifier,(akka.actor.typed.delivery.DurableProducerQueue.SeqNr,akka.actor.typed.delivery.DurableProducerQueue.TimestampMillis)],unconfirmed:IndexedSeq[akka.actor.typed.delivery.DurableProducerQueue.MessageSent[A]]):akka.actor.typed.delivery.DurableProducerQueue.State[A] "Permalink")  new State(currentSeqNr: [SeqNr](DurableProducerQueue$.html#SeqNr=Long), highestConfirmedSeqNr: [SeqNr](DurableProducerQueue$.html#SeqNr=Long), confirmedSeqNr: Map\[[ConfirmationQualifier](DurableProducerQueue$.html#ConfirmationQualifier=String), ([SeqNr](DurableProducerQueue$.html#SeqNr=Long), [TimestampMillis](DurableProducerQueue$.html#TimestampMillis=Long))], unconfirmed: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[MessageSent](DurableProducerQueue$$MessageSent.html)\[A]])
### Value Members

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from State\[A] toany2stringadd\[State\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (State\[A], B)ImplicitThis member is added by an implicit conversion from State\[A] toArrowAssoc\[State\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#addMessageSent(sent:akka.actor.typed.delivery.DurableProducerQueue.MessageSent[A]):akka.actor.typed.delivery.DurableProducerQueue.State[A] "Permalink")  def addMessageSent(sent: [MessageSent](DurableProducerQueue$$MessageSent.html)\[A]): State\[A]
7. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#cleanup(confirmationQualifiers:Set[String]):akka.actor.typed.delivery.DurableProducerQueue.State[A] "Permalink")  def cleanup(confirmationQualifiers: Set\[String]): State\[A]
9. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#cleanupPartialChunkedMessages():akka.actor.typed.delivery.DurableProducerQueue.State[A] "Permalink")  def cleanupPartialChunkedMessages(): State\[A]If not all chunked messages were stored before crash those partial chunked messages should not be resent.
10. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#confirmed(seqNr:akka.actor.typed.delivery.DurableProducerQueue.SeqNr,confirmationQualifier:akka.actor.typed.delivery.DurableProducerQueue.ConfirmationQualifier,timestampMillis:akka.actor.typed.delivery.DurableProducerQueue.TimestampMillis):akka.actor.typed.delivery.DurableProducerQueue.State[A] "Permalink")  def confirmed(seqNr: [SeqNr](DurableProducerQueue$.html#SeqNr=Long), confirmationQualifier: [ConfirmationQualifier](DurableProducerQueue$.html#ConfirmationQualifier=String), timestampMillis: [TimestampMillis](DurableProducerQueue$.html#TimestampMillis=Long)): State\[A]
12. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#confirmedSeqNr:Map[akka.actor.typed.delivery.DurableProducerQueue.ConfirmationQualifier,(akka.actor.typed.delivery.DurableProducerQueue.SeqNr,akka.actor.typed.delivery.DurableProducerQueue.TimestampMillis)] "Permalink")  val confirmedSeqNr: Map\[[ConfirmationQualifier](DurableProducerQueue$.html#ConfirmationQualifier=String), ([SeqNr](DurableProducerQueue$.html#SeqNr=Long), [TimestampMillis](DurableProducerQueue$.html#TimestampMillis=Long))]
13. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#currentSeqNr:akka.actor.typed.delivery.DurableProducerQueue.SeqNr "Permalink")  val currentSeqNr: [SeqNr](DurableProducerQueue$.html#SeqNr=Long)
14. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (State\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): State\[A]ImplicitThis member is added by an implicit conversion from State\[A] toEnsuring\[State\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (State\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): State\[A]ImplicitThis member is added by an implicit conversion from State\[A] toEnsuring\[State\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): State\[A]ImplicitThis member is added by an implicit conversion from State\[A] toEnsuring\[State\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): State\[A]ImplicitThis member is added by an implicit conversion from State\[A] toEnsuring\[State\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#highestConfirmedSeqNr:akka.actor.typed.delivery.DurableProducerQueue.SeqNr "Permalink")  val highestConfirmedSeqNr: [SeqNr](DurableProducerQueue$.html#SeqNr=Long)
21. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
26. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#unconfirmed:IndexedSeq[akka.actor.typed.delivery.DurableProducerQueue.MessageSent[A]] "Permalink")  val unconfirmed: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[MessageSent](DurableProducerQueue$$MessageSent.html)\[A]]
28. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from State\[A] toStringFormat\[State\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$State.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (State\[A], B)ImplicitThis member is added by an implicit conversion from State\[A] toArrowAssoc\[State\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from DeliverySerializable

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromState\[A] to any2stringadd\[State\[A]]

### Inherited by implicit conversion StringFormat fromState\[A] to StringFormat\[State\[A]]

### Inherited by implicit conversion Ensuring fromState\[A] to Ensuring\[State\[A]]

### Inherited by implicit conversion ArrowAssoc fromState\[A] to ArrowAssoc\[State\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$LoadState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$MessageSent$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$MessageSent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$State$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$State.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageSent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageSentAck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$State.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$State.html)*