---
description: Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.Start
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:50:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/ConsumerController$$Start.html
title: Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.Start
---

# Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.Start

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.Start

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

The destination consumer actor will start the flow by sending an initial ConsumerController.Start
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
- [SequencedMessage](ConsumerController$$SequencedMessage.html "This is used between the ProducerController and ConsumerController.")
- [Settings](ConsumerController$$Settings.html)
- Start
c[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[delivery](index.html).[ConsumerController](ConsumerController$.html)

# Start[**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html "Permalink")

### 

#### final  case class Start\[A](deliverTo: [ActorRef](../ActorRef.html)\[[Delivery](ConsumerController$$Delivery.html)\[A]]) extends [Command](ConsumerController$$Command.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Initial message from the consumer actor. The `deliverTo` is typically constructed
as a message adapter to map the [Delivery](ConsumerController$$Delivery.html) to the protocol of the consumer actor.

If the consumer is restarted it should send a new `Start` message to the
`ConsumerController`.

Source[ConsumerController.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/ConsumerController.scala#L64)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Command](ConsumerController$$Command.html)\[A], UnsealedInternalCommand, InternalCommand, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Start
2. Serializable
3. Product
4. Equals
5. Command
6. UnsealedInternalCommand
7. InternalCommand
8. AnyRef
9. Any
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

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#<init>(deliverTo:akka.actor.typed.ActorRef[akka.actor.typed.delivery.ConsumerController.Delivery[A]]):akka.actor.typed.delivery.ConsumerController.Start[A] "Permalink")  new Start(deliverTo: [ActorRef](../ActorRef.html)\[[Delivery](ConsumerController$$Delivery.html)\[A]])
### Value Members

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Start\[A] toany2stringadd\[Start\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Start\[A], B)ImplicitThis member is added by an implicit conversion from Start\[A] toArrowAssoc\[Start\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#deliverTo:akka.actor.typed.ActorRef[akka.actor.typed.delivery.ConsumerController.Delivery[A]] "Permalink")  val deliverTo: [ActorRef](../ActorRef.html)\[[Delivery](ConsumerController$$Delivery.html)\[A]]
9. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Start\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Start\[A]ImplicitThis member is added by an implicit conversion from Start\[A] toEnsuring\[Start\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Start\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Start\[A]ImplicitThis member is added by an implicit conversion from Start\[A] toEnsuring\[Start\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Start\[A]ImplicitThis member is added by an implicit conversion from Start\[A] toEnsuring\[Start\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Start\[A]ImplicitThis member is added by an implicit conversion from Start\[A] toEnsuring\[Start\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Start\[A] toStringFormat\[Start\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Start\[A], B)ImplicitThis member is added by an implicit conversion from Start\[A] toArrowAssoc\[Start\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Command](ConsumerController$$Command.html)\[A]

### Inherited from UnsealedInternalCommand

### Inherited from InternalCommand

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStart\[A] to any2stringadd\[Start\[A]]

### Inherited by implicit conversion StringFormat fromStart\[A] to StringFormat\[Start\[A]]

### Inherited by implicit conversion Ensuring fromStart\[A] to Ensuring\[Start\[A]]

### Inherited by implicit conversion ArrowAssoc fromStart\[A] to ArrowAssoc\[Start\[A]]

### Ungrouped

## Related Pages (Internal Links)

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
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Start.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Start.html)*