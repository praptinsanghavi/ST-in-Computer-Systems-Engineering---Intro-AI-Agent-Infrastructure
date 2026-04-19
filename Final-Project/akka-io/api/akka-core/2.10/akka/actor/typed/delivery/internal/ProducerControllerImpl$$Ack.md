---
description: Akka 2.10.17 - akka.actor.typed.delivery.internal.ProducerControllerImpl.Ack
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:25:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html
title: Akka 2.10.17 - akka.actor.typed.delivery.internal.ProducerControllerImpl.Ack
---

# Akka 2.10.17 - akka.actor.typed.delivery.internal.ProducerControllerImpl.Ack

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.internal.ProducerControllerImpl.Ack

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/actor/typed/delivery/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[delivery](../index.html)
- [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html "Permalink")  object [ProducerControllerImpl](ProducerControllerImpl$.html "INTERNAL API")INTERNAL API

INTERNAL API

###### Design notes

The producer will start the flow by sending a [ProducerController.Start](../ProducerController$$Start.html) message to the `ProducerController` with
message adapter reference to convert [ProducerController.RequestNext](../ProducerController$$RequestNext.html) message.
The `ProducerController` sends `RequestNext` to the producer, which is then allowed to send one message to
the `ProducerController`.

The producer and `ProducerController` are supposed to be local so that these messages are fast and not lost.

The `ProducerController` sends the first message to the `ConsumerController` without waiting for
a `Request` from the `ConsumerController`. The main reason for this is that when used with
Cluster Sharding the first message will typically create the `ConsumerController`. It's
also a way to connect the ProducerController and ConsumerController in a dynamic way, for
example when the ProducerController is replaced.

When the first message is received by the `ConsumerController` it sends back the initial `Request`,
with demand of how many messages it can accept.

Apart from the first message the `ProducerController` will not send more messages than requested
by the `ConsumerController`.

When there is demand from the consumer side the `ProducerController` sends `RequestNext` to the
actual producer, which is then allowed to send one more message.

Each message is wrapped by the `ProducerController` in [ConsumerController.SequencedMessage](../ConsumerController$$SequencedMessage.html) with
a monotonically increasing sequence number without gaps, starting at 1\.

In other words, the "request" protocol to the application producer and consumer is one\-by\-one, but
between the `ProducerController` and `ConsumerController` it's window of messages in flight.

The `Request` message also contains a `confirmedSeqNr` that is the acknowledgement
from the consumer that it has received and processed all messages up to that sequence number.

The `ConsumerController` will send [ProducerControllerImpl.Resend](ProducerControllerImpl$$Resend.html) if a lost message is detected
and then the `ProducerController` will resend all messages from that sequence number. The producer keeps
unconfirmed messages in a buffer to be able to resend them. The buffer size is limited
by the request window size.

The resending is optional, and the `ConsumerController` can be started with `resendLost=false`
to ignore lost messages, and then the `ProducerController` will not buffer unconfirmed messages.
In that mode it provides only flow control but no reliable delivery.

Definition Classes[internal](index.html)
- Ack
- [InternalCommand](ProducerControllerImpl$$InternalCommand.html)
- [Request](ProducerControllerImpl$$Request.html)
- [Resend](ProducerControllerImpl$$Resend.html)
- [ResendFirstUnconfirmed](ProducerControllerImpl$$ResendFirstUnconfirmed$.html)
- [UnsealedInternalCommand](ProducerControllerImpl$$UnsealedInternalCommand.html "For commands defined in public ProducerController")
c[akka](../../../../index.html).[actor](../../../index.html).[typed](../../index.html).[delivery](../index.html).[internal](index.html).[ProducerControllerImpl](ProducerControllerImpl$.html)

# Ack[**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html "Permalink")

### 

#### final  case class Ack(confirmedSeqNr: [SeqNr](../ProducerController$.html#SeqNr=Long)) extends [InternalCommand](ProducerControllerImpl$$InternalCommand.html) with DeliverySerializable with [DeadLetterSuppression](../../../DeadLetterSuppression.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[ProducerControllerImpl.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/internal/ProducerControllerImpl.scala#L99)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [DeadLetterSuppression](../../../DeadLetterSuppression.html), DeliverySerializable, [InternalCommand](ProducerControllerImpl$$InternalCommand.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Ack
2. Serializable
3. Product
4. Equals
5. DeadLetterSuppression
6. DeliverySerializable
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

1. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#<init>(confirmedSeqNr:akka.actor.typed.delivery.ProducerController.SeqNr):akka.actor.typed.delivery.internal.ProducerControllerImpl.Ack "Permalink")  new Ack(confirmedSeqNr: [SeqNr](../ProducerController$.html#SeqNr=Long))
### Value Members

1. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Ack toany2stringadd\[Ack] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Ack, B)ImplicitThis member is added by an implicit conversion from Ack toArrowAssoc\[Ack] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#confirmedSeqNr:akka.actor.typed.delivery.ProducerController.SeqNr "Permalink")  val confirmedSeqNr: [SeqNr](../ProducerController$.html#SeqNr=Long)
9. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Ack) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AckImplicitThis member is added by an implicit conversion from Ack toEnsuring\[Ack] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Ack) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AckImplicitThis member is added by an implicit conversion from Ack toEnsuring\[Ack] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AckImplicitThis member is added by an implicit conversion from Ack toEnsuring\[Ack] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AckImplicitThis member is added by an implicit conversion from Ack toEnsuring\[Ack] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Ack toStringFormat\[Ack] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Ack, B)ImplicitThis member is added by an implicit conversion from Ack toArrowAssoc\[Ack] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [DeadLetterSuppression](../../../DeadLetterSuppression.html)

### Inherited from DeliverySerializable

### Inherited from [InternalCommand](ProducerControllerImpl$$InternalCommand.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAck to any2stringadd\[Ack]

### Inherited by implicit conversion StringFormat fromAck to StringFormat\[Ack]

### Inherited by implicit conversion Ensuring fromAck to Ensuring\[Ack]

### Inherited by implicit conversion ArrowAssoc fromAck to ArrowAssoc\[Ack]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$$RequestNext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$$Start.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl$$Request.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl$$Resend.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl$$ResendFirstUnconfirmed$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl$$UnsealedInternalCommand.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html)*