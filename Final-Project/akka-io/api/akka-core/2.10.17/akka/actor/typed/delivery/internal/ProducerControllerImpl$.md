---
description: Akka 2.10.17 - akka.actor.typed.delivery.internal.ProducerControllerImpl
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:21:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$.html
title: Akka 2.10.17 - akka.actor.typed.delivery.internal.ProducerControllerImpl
---

# Akka 2.10.17 - akka.actor.typed.delivery.internal.ProducerControllerImpl

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.internal.ProducerControllerImpl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/actor/typed/delivery/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[delivery](../index.html)
- ProducerControllerImpl
o[akka](../../../../index.html).[actor](../../../index.html).[typed](../../index.html).[delivery](../index.html).[internal](index.html)

# ProducerControllerImpl[**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html "Permalink")

### 

#### object ProducerControllerImpl

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

Source[ProducerControllerImpl.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/internal/ProducerControllerImpl.scala#L77)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ProducerControllerImpl
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html "Permalink") final  case class [Ack](ProducerControllerImpl$$Ack.html)(confirmedSeqNr: [SeqNr](../ProducerController$.html#SeqNr=Long)) extends [InternalCommand](ProducerControllerImpl$$InternalCommand.html) with DeliverySerializable with [DeadLetterSuppression](../../../DeadLetterSuppression.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html "Permalink") sealed  trait [InternalCommand](ProducerControllerImpl$$InternalCommand.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Request.html "Permalink") final  case class [Request](ProducerControllerImpl$$Request.html)(confirmedSeqNr: [SeqNr](../ProducerController$.html#SeqNr=Long), requestUpToSeqNr: [SeqNr](../ProducerController$.html#SeqNr=Long), supportResend: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), viaTimeout: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)) extends [InternalCommand](ProducerControllerImpl$$InternalCommand.html) with DeliverySerializable with [DeadLetterSuppression](../../../DeadLetterSuppression.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
4. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$Resend.html "Permalink") final  case class [Resend](ProducerControllerImpl$$Resend.html)(fromSeqNr: [SeqNr](../ProducerController$.html#SeqNr=Long)) extends [InternalCommand](ProducerControllerImpl$$InternalCommand.html) with DeliverySerializable with [DeadLetterSuppression](../../../DeadLetterSuppression.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
5. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$UnsealedInternalCommand.html "Permalink")  trait [UnsealedInternalCommand](ProducerControllerImpl$$UnsealedInternalCommand.html "For commands defined in public ProducerController") extends [InternalCommand](ProducerControllerImpl$$InternalCommand.html)For commands defined in public ProducerController
### Value Members

1. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#apply[A](producerId:String,durableQueueBehavior:Option[akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]]],settings:akka.actor.typed.delivery.ProducerController.Settings,send:akka.actor.typed.delivery.ConsumerController.SequencedMessage[A]=>Unit)(implicitevidence$2:scala.reflect.ClassTag[A]):akka.actor.typed.Behavior[akka.actor.typed.delivery.ProducerController.Command[A]] "Permalink")  def apply\[A](producerId: String, durableQueueBehavior: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Behavior](../../Behavior.html)\[[Command](../DurableProducerQueue$$Command.html)\[A]]], settings: [ProducerController.Settings](../ProducerController$$Settings.html), send: ([SequencedMessage](../ConsumerController$$SequencedMessage.html)\[A]) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit))(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): [Behavior](../../Behavior.html)\[[Command](../ProducerController$$Command.html)\[A]]For custom `send` function.

For custom `send` function. For example used with Sharding where the message must be wrapped in
`ShardingEnvelope(SequencedMessage(msg))`.
5. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#apply[A](producerId:String,durableQueueBehavior:Option[akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]]],settings:akka.actor.typed.delivery.ProducerController.Settings)(implicitevidence$1:scala.reflect.ClassTag[A]):akka.actor.typed.Behavior[akka.actor.typed.delivery.ProducerController.Command[A]] "Permalink")  def apply\[A](producerId: String, durableQueueBehavior: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Behavior](../../Behavior.html)\[[Command](../DurableProducerQueue$$Command.html)\[A]]], settings: [ProducerController.Settings](../ProducerController$$Settings.html))(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): [Behavior](../../Behavior.html)\[[Command](../ProducerController$$Command.html)\[A]]
6. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#createChunks[A](m:A,chunkSize:Int,serialization:akka.serialization.Serialization):Seq[akka.actor.typed.delivery.internal.ChunkedMessage] "Permalink")  def createChunks\[A](m: A, chunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), serialization: [Serialization](../../../../serialization/Serialization.html)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[ChunkedMessage]
9. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#enforceLocalProducer(ref:akka.actor.typed.ActorRef[_]):Unit "Permalink")  def enforceLocalProducer(ref: [ActorRef](../../ActorRef.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
10. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$$ResendFirstUnconfirmed$.html "Permalink")  case object [ResendFirstUnconfirmed](ProducerControllerImpl$$ResendFirstUnconfirmed$.html) extends [InternalCommand](ProducerControllerImpl$$InternalCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../../../../akka/actor/typed/delivery/internal/ProducerControllerImpl$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController$$RequestNext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController$$Settings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController$$Start.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl$$Ack.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl$$Request.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl$$Resend.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl$$ResendFirstUnconfirmed$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl$$UnsealedInternalCommand.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/Serialization.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl$.html)*