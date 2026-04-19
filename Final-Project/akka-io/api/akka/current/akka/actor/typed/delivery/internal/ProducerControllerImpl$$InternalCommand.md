---
description: Akka 2.10.17 - akka.actor.typed.delivery.internal.ProducerControllerImpl.InternalCommand
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:45:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html
title: Akka 2.10.17 - akka.actor.typed.delivery.internal.ProducerControllerImpl.InternalCommand
---

# Akka 2.10.17 - akka.actor.typed.delivery.internal.ProducerControllerImpl.InternalCommand

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.internal.ProducerControllerImpl.InternalCommand

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
- [Ack](ProducerControllerImpl$$Ack.html)
- InternalCommand
- [Request](ProducerControllerImpl$$Request.html)
- [Resend](ProducerControllerImpl$$Resend.html)
- [ResendFirstUnconfirmed](ProducerControllerImpl$$ResendFirstUnconfirmed$.html)
- [UnsealedInternalCommand](ProducerControllerImpl$$UnsealedInternalCommand.html "For commands defined in public ProducerController")
t[akka](../../../../index.html).[actor](../../../index.html).[typed](../../index.html).[delivery](../index.html).[internal](index.html).[ProducerControllerImpl](ProducerControllerImpl$.html)

# InternalCommand[**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html "Permalink")

### 

#### sealed  trait InternalCommand extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ProducerControllerImpl.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/internal/ProducerControllerImpl.scala#L85)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Command](../ProducerController$$Command.html), [MessageWithConfirmation](../ProducerController$$MessageWithConfirmation.html), [RegisterConsumer](../ProducerController$$RegisterConsumer.html), [Start](../ProducerController$$Start.html), [Ack](ProducerControllerImpl$$Ack.html), [Request](ProducerControllerImpl$$Request.html), [Resend](ProducerControllerImpl$$Resend.html), [ResendFirstUnconfirmed](ProducerControllerImpl$$ResendFirstUnconfirmed$.html), [UnsealedInternalCommand](ProducerControllerImpl$$UnsealedInternalCommand.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. InternalCommand
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

1. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from InternalCommand toany2stringadd\[InternalCommand] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (InternalCommand, B)ImplicitThis member is added by an implicit conversion from InternalCommand toArrowAssoc\[InternalCommand] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (InternalCommand) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): InternalCommandImplicitThis member is added by an implicit conversion from InternalCommand toEnsuring\[InternalCommand] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (InternalCommand) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): InternalCommandImplicitThis member is added by an implicit conversion from InternalCommand toEnsuring\[InternalCommand] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): InternalCommandImplicitThis member is added by an implicit conversion from InternalCommand toEnsuring\[InternalCommand] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): InternalCommandImplicitThis member is added by an implicit conversion from InternalCommand toEnsuring\[InternalCommand] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from InternalCommand toStringFormat\[InternalCommand] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (InternalCommand, B)ImplicitThis member is added by an implicit conversion from InternalCommand toArrowAssoc\[InternalCommand] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromInternalCommand to any2stringadd\[InternalCommand]

### Inherited by implicit conversion StringFormat fromInternalCommand to StringFormat\[InternalCommand]

### Inherited by implicit conversion Ensuring fromInternalCommand to Ensuring\[InternalCommand]

### Inherited by implicit conversion ArrowAssoc fromInternalCommand to ArrowAssoc\[InternalCommand]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$Command.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$MessageWithConfirmation.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$RegisterConsumer.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$RequestNext.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$Start.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$$Request.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$$Resend.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$$ResendFirstUnconfirmed$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$$UnsealedInternalCommand.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/internal/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html](https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html)*