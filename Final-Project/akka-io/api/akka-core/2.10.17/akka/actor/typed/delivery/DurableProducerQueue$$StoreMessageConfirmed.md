---
description: Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.StoreMessageConfirmed
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:21:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html
title: Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.StoreMessageConfirmed
---

# Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.StoreMessageConfirmed

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.DurableProducerQueue.StoreMessageConfirmed

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
- [State](DurableProducerQueue$$State.html)
- StoreMessageConfirmed
- [StoreMessageSent](DurableProducerQueue$$StoreMessageSent.html "Store the fact that a message is to be sent.")
- [StoreMessageSentAck](DurableProducerQueue$$StoreMessageSentAck.html)
c[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[delivery](index.html).[DurableProducerQueue](DurableProducerQueue$.html)

# StoreMessageConfirmed[**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html "Permalink")

### 

#### final  case class StoreMessageConfirmed\[A](seqNr: [SeqNr](DurableProducerQueue$.html#SeqNr=Long), confirmationQualifier: [ConfirmationQualifier](DurableProducerQueue$.html#ConfirmationQualifier=String), timestampMillis: [TimestampMillis](DurableProducerQueue$.html#TimestampMillis=Long)) extends [Command](DurableProducerQueue$$Command.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Store the fact that a message has been confirmed to be delivered and processed.

This command may be retied and the implementation should be idempotent, i.e. deduplicate
already processed sequence numbers.

Source[DurableProducerQueue.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/DurableProducerQueue.scala#L57)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Command](DurableProducerQueue$$Command.html)\[A], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StoreMessageConfirmed
2. Serializable
3. Product
4. Equals
5. Command
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

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#<init>(seqNr:akka.actor.typed.delivery.DurableProducerQueue.SeqNr,confirmationQualifier:akka.actor.typed.delivery.DurableProducerQueue.ConfirmationQualifier,timestampMillis:akka.actor.typed.delivery.DurableProducerQueue.TimestampMillis):akka.actor.typed.delivery.DurableProducerQueue.StoreMessageConfirmed[A] "Permalink")  new StoreMessageConfirmed(seqNr: [SeqNr](DurableProducerQueue$.html#SeqNr=Long), confirmationQualifier: [ConfirmationQualifier](DurableProducerQueue$.html#ConfirmationQualifier=String), timestampMillis: [TimestampMillis](DurableProducerQueue$.html#TimestampMillis=Long))
### Value Members

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StoreMessageConfirmed\[A] toany2stringadd\[StoreMessageConfirmed\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StoreMessageConfirmed\[A], B)ImplicitThis member is added by an implicit conversion from StoreMessageConfirmed\[A] toArrowAssoc\[StoreMessageConfirmed\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#confirmationQualifier:akka.actor.typed.delivery.DurableProducerQueue.ConfirmationQualifier "Permalink")  val confirmationQualifier: [ConfirmationQualifier](DurableProducerQueue$.html#ConfirmationQualifier=String)
9. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StoreMessageConfirmed\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StoreMessageConfirmed\[A]ImplicitThis member is added by an implicit conversion from StoreMessageConfirmed\[A] toEnsuring\[StoreMessageConfirmed\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StoreMessageConfirmed\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StoreMessageConfirmed\[A]ImplicitThis member is added by an implicit conversion from StoreMessageConfirmed\[A] toEnsuring\[StoreMessageConfirmed\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StoreMessageConfirmed\[A]ImplicitThis member is added by an implicit conversion from StoreMessageConfirmed\[A] toEnsuring\[StoreMessageConfirmed\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StoreMessageConfirmed\[A]ImplicitThis member is added by an implicit conversion from StoreMessageConfirmed\[A] toEnsuring\[StoreMessageConfirmed\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#seqNr:akka.actor.typed.delivery.DurableProducerQueue.SeqNr "Permalink")  val seqNr: [SeqNr](DurableProducerQueue$.html#SeqNr=Long)
21. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#timestampMillis:akka.actor.typed.delivery.DurableProducerQueue.TimestampMillis "Permalink")  val timestampMillis: [TimestampMillis](DurableProducerQueue$.html#TimestampMillis=Long)
23. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StoreMessageConfirmed\[A] toStringFormat\[StoreMessageConfirmed\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StoreMessageConfirmed\[A], B)ImplicitThis member is added by an implicit conversion from StoreMessageConfirmed\[A] toArrowAssoc\[StoreMessageConfirmed\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Command](DurableProducerQueue$$Command.html)\[A]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStoreMessageConfirmed\[A] to any2stringadd\[StoreMessageConfirmed\[A]]

### Inherited by implicit conversion StringFormat fromStoreMessageConfirmed\[A] to StringFormat\[StoreMessageConfirmed\[A]]

### Inherited by implicit conversion Ensuring fromStoreMessageConfirmed\[A] to Ensuring\[StoreMessageConfirmed\[A]]

### Inherited by implicit conversion ArrowAssoc fromStoreMessageConfirmed\[A] to ArrowAssoc\[StoreMessageConfirmed\[A]]

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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$StoreMessageConfirmed.html)*