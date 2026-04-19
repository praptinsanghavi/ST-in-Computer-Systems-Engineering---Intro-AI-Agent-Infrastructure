---
description: Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.SequencedMessage
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:58:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html
title: Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.SequencedMessage
---

# Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.SequencedMessage

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.SequencedMessage

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/delivery/ConsumerController$.html "Permalink")  object [ConsumerController](ConsumerController$.html "ConsumerController and ProducerController or WorkPullingProducerController are used together.")`ConsumerController` and [ProducerController](ProducerController$.html) or [WorkPullingProducerController](WorkPullingProducerController$.html) are used
together.

`ConsumerController` and [ProducerController](ProducerController$.html) or [WorkPullingProducerController](WorkPullingProducerController$.html) are used
together. See the descriptions in those classes or the Akka reference documentation for
how they are intended to be used.

The destination consumer actor will start the flow by sending an initial [ConsumerController.Start](ConsumerController$$Start.html)
message to the `ConsumerController`. The `ActorRef` in the `Start` message is typically constructed
as a message adapter to map the [ConsumerController.Delivery](ConsumerController$$Delivery.html) to the protocol of the consumer actor.

Received messages from the producer are wrapped in [ConsumerController.Delivery](ConsumerController$$Delivery.html) when sent to the consumer,
which is supposed to reply with [ConsumerController.Confirmed](ConsumerController$$Confirmed.html) when it has processed the message.
Next message is not delivered until the previous is confirmed.
More messages from the producer that arrive while waiting for the confirmation are stashed by
the `ConsumerController` and delivered when previous message was confirmed.

The consumer and the `ConsumerController` actors are supposed to be local so that these messages are fast
and not lost. This is enforced by a runtime check.

The `ConsumerController` is automatically stopped when the consumer that registered with the `Start`
message is terminated.

Definition Classes[delivery](index.html)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
- [Command](ConsumerController$$Command.html)
- [Confirmed](ConsumerController$$Confirmed.html)
- [DeliverThenStop](ConsumerController$$DeliverThenStop.html)
- [Delivery](ConsumerController$$Delivery.html "Received messages from the producer are wrapped in Delivery when sent to the consumer.")
- [RegisterToProducerController](ConsumerController$$RegisterToProducerController.html "Register the ConsumerController to the given producerController.")
- SequencedMessage
- [Settings](ConsumerController$$Settings.html)
- [Start](ConsumerController$$Start.html "Initial message from the consumer actor.")
[c](ConsumerController$$SequencedMessage$.html "See companion object")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[delivery](index.html).[ConsumerController](ConsumerController$.html)

# [SequencedMessage](ConsumerController$$SequencedMessage$.html "See companion object")[**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html "Permalink")

### Companion [object SequencedMessage](ConsumerController$$SequencedMessage$.html "See companion object")

#### final  case class SequencedMessage\[A](producerId: String, seqNr: [SeqNr](ConsumerController$.html#SeqNr=Long), message: [MessageOrChunk](ConsumerController$$SequencedMessage$.html#MessageOrChunk=Any), first: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), ack: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(producerController: [ActorRef](../ActorRef.html)\[[InternalCommand](internal/ProducerControllerImpl$$InternalCommand.html)]) extends [Command](ConsumerController$$Command.html)\[A] with DeliverySerializable with [DeadLetterSuppression](../../DeadLetterSuppression.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

This is used between the `ProducerController` and `ConsumerController`. Should rarely be used in
application code but is public because it's in the signature for the `EntityTypeKey` when using
`ShardingConsumerController`.

In the future we may also make the custom `send` in `ProducerController` public to make it possible to
wrap it or send it in other ways when building higher level abstractions that are using the `ProducerController`.
That is used by `ShardingProducerController`.

producerControllerINTERNAL API: construction of SequencedMessage is internal

Source[ConsumerController.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/ConsumerController.scala#L159)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [DeadLetterSuppression](../../DeadLetterSuppression.html), DeliverySerializable, [Command](ConsumerController$$Command.html)\[A], UnsealedInternalCommand, InternalCommand, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SequencedMessage
2. Serializable
3. Product
4. Equals
5. DeadLetterSuppression
6. DeliverySerializable
7. Command
8. UnsealedInternalCommand
9. InternalCommand
10. AnyRef
11. Any
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

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#<init>(producerId:String,seqNr:akka.actor.typed.delivery.ConsumerController.SeqNr,message:akka.actor.typed.delivery.ConsumerController.SequencedMessage.MessageOrChunk,first:Boolean,ack:Boolean)(producerController:akka.actor.typed.ActorRef[akka.actor.typed.delivery.internal.ProducerControllerImpl.InternalCommand]):akka.actor.typed.delivery.ConsumerController.SequencedMessage[A] "Permalink")  new SequencedMessage(producerId: String, seqNr: [SeqNr](ConsumerController$.html#SeqNr=Long), message: [MessageOrChunk](ConsumerController$$SequencedMessage$.html#MessageOrChunk=Any), first: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), ack: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(producerController: [ActorRef](../ActorRef.html)\[[InternalCommand](internal/ProducerControllerImpl$$InternalCommand.html)])producerControllerINTERNAL API: construction of SequencedMessage is internal
### Value Members

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SequencedMessage\[A] toany2stringadd\[SequencedMessage\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SequencedMessage\[A], B)ImplicitThis member is added by an implicit conversion from SequencedMessage\[A] toArrowAssoc\[SequencedMessage\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#ack:Boolean "Permalink")  val ack: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
7. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SequencedMessage\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SequencedMessage\[A]ImplicitThis member is added by an implicit conversion from SequencedMessage\[A] toEnsuring\[SequencedMessage\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SequencedMessage\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SequencedMessage\[A]ImplicitThis member is added by an implicit conversion from SequencedMessage\[A] toEnsuring\[SequencedMessage\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SequencedMessage\[A]ImplicitThis member is added by an implicit conversion from SequencedMessage\[A] toEnsuring\[SequencedMessage\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SequencedMessage\[A]ImplicitThis member is added by an implicit conversion from SequencedMessage\[A] toEnsuring\[SequencedMessage\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#first:Boolean "Permalink")  val first: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
15. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#message:akka.actor.typed.delivery.ConsumerController.SequencedMessage.MessageOrChunk "Permalink")  val message: [MessageOrChunk](ConsumerController$$SequencedMessage$.html#MessageOrChunk=Any)
18. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#producerId:String "Permalink")  val producerId: String
22. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
23. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#seqNr:akka.actor.typed.delivery.ConsumerController.SeqNr "Permalink")  val seqNr: [SeqNr](ConsumerController$.html#SeqNr=Long)
24. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SequencedMessage\[A] toStringFormat\[SequencedMessage\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SequencedMessage\[A], B)ImplicitThis member is added by an implicit conversion from SequencedMessage\[A] toArrowAssoc\[SequencedMessage\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [DeadLetterSuppression](../../DeadLetterSuppression.html)

### Inherited from DeliverySerializable

### Inherited from [Command](ConsumerController$$Command.html)\[A]

### Inherited from UnsealedInternalCommand

### Inherited from InternalCommand

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSequencedMessage\[A] to any2stringadd\[SequencedMessage\[A]]

### Inherited by implicit conversion StringFormat fromSequencedMessage\[A] to StringFormat\[SequencedMessage\[A]]

### Inherited by implicit conversion Ensuring fromSequencedMessage\[A] to Ensuring\[SequencedMessage\[A]]

### Inherited by implicit conversion ArrowAssoc fromSequencedMessage\[A] to ArrowAssoc\[SequencedMessage\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Confirmed$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Confirmed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$DeliverThenStop.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Delivery$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Delivery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$RegisterToProducerController.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$SequencedMessage$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Settings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Settings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Start.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html)*