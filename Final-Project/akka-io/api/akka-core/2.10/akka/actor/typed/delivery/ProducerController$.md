---
description: Akka 2.10.17 - akka.actor.typed.delivery.ProducerController
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/ProducerController$.html
title: Akka 2.10.17 - akka.actor.typed.delivery.ProducerController
---

# Akka 2.10.17 - akka.actor.typed.delivery.ProducerController

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.ProducerController

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/delivery/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[delivery](index.html)
- [ConsumerController](ConsumerController$.html "ConsumerController and ProducerController or WorkPullingProducerController are used together.")
- [DurableProducerQueue](DurableProducerQueue$.html "Actor message protocol for storing and confirming reliable delivery of messages.")
- ProducerController
- [WorkPullingProducerController](WorkPullingProducerController$.html "Work pulling is a pattern where several worker actors pull tasks in their own pace from a shared work manager instead of that the manager pushes work to the workers blindly without knowing their individual capacity and current availability.")
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[delivery](index.html)

# ProducerController[**](../../../../akka/actor/typed/delivery/ProducerController$.html "Permalink")

### 

#### object ProducerController

Point\-to\-point reliable delivery between a single producer actor sending messages and a single consumer
actor receiving the messages. Used together with [ConsumerController](ConsumerController$.html).

The producer actor will start the flow by sending a [ProducerController.Start](ProducerController$$Start.html) message to
the `ProducerController`. The `ActorRef` in the `Start` message is typically constructed
as a message adapter to map the [ProducerController.RequestNext](ProducerController$$RequestNext.html) to the protocol of the
producer actor.

For the `ProducerController` to know where to send the messages it must be connected with the
`ConsumerController`. You do this is with [ProducerController.RegisterConsumer](ProducerController$$RegisterConsumer.html) or
[ConsumerController.RegisterToProducerController](ConsumerController$$RegisterToProducerController.html) messages.

The `ProducerController` sends `RequestNext` to the producer, which is then allowed to send one
message to the `ProducerController` via the `sendNextTo` in the `RequestNext`. Thereafter the
producer will receive a new `RequestNext` when it's allowed to send one more message.

The producer and `ProducerController` actors are supposed to be local so that these messages are
fast and not lost. This is enforced by a runtime check.

Many unconfirmed messages can be in flight between the `ProducerController` and `ConsumerController`.
The flow control is driven by the consumer side, which means that the `ProducerController` will
not send faster than the demand requested by the `ConsumerController`.

Lost messages are detected, resent and deduplicated if needed. This is also driven by the consumer side,
which means that the `ProducerController` will not push resends unless requested by the
`ConsumerController`.

Until sent messages have been confirmed the `ProducerController` keeps them in memory to be able to
resend them. If the JVM of the `ProducerController` crashes those unconfirmed messages are lost.
To make sure the messages can be delivered also in that scenario the `ProducerController` can be
used with a [DurableProducerQueue](DurableProducerQueue$.html). Then the unconfirmed messages are stored in a durable way so
that they can be redelivered when the producer is started again. An implementation of the
`DurableProducerQueue` is provided by `EventSourcedProducerQueue` in `akka-persistence-typed`.

Instead of using `tell` with the `sendNextTo` in the `RequestNext` the producer can use `context.ask`
with the `askNextTo` in the `RequestNext`. The difference is that a reply is sent back when the
message has been handled. If a `DurableProducerQueue` is used then the reply is sent when the message
has been stored successfully, but it might not have been processed by the consumer yet. Otherwise the
reply is sent after the consumer has processed and confirmed the message.

If the consumer crashes a new `ConsumerController` can be connected to the original `ProducerConsumer`
without restarting it. The `ProducerConsumer` will then redeliver all unconfirmed messages.

It's also possible to use the `ProducerController` and `ConsumerController` without resending
lost messages, but the flow control is still used. This can for example be useful when both consumer and
producer are know to be located in the same local `ActorSystem`. This can be more efficient since messages
don't have to be kept in memory in the `ProducerController` until they have been
confirmed, but the drawback is that lost messages will not be delivered. See configuration
`only-flow-control` of the `ConsumerController`.

The `producerId` is used in logging and included as MDC entry with key `"producerId"`. It's propagated
to the `ConsumerController` and is useful for correlating log messages. It can be any `String` but it's
recommended to use a unique identifier of representing the producer.

If the `DurableProducerQueue` is defined it is created as a child actor of the `ProducerController` actor.
It will use the same dispatcher as the parent `ProducerController`.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() Source[ProducerController.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/ProducerController.scala#L87)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ProducerController
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/actor/typed/delivery/ProducerController$$Command.html "Permalink") sealed  trait [Command](ProducerController$$Command.html)\[A] extends [UnsealedInternalCommand](internal/ProducerControllerImpl$$UnsealedInternalCommand.html)
2. [**](../../../../akka/actor/typed/delivery/ProducerController$$MessageWithConfirmation.html "Permalink") final  case class [MessageWithConfirmation](ProducerController$$MessageWithConfirmation.html "For sending confirmation message back to the producer when the message has been confirmed.")\[A](message: A, replyTo: [ActorRef](../ActorRef.html)\[[SeqNr](#SeqNr=Long)]) extends [UnsealedInternalCommand](internal/ProducerControllerImpl$$UnsealedInternalCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor sending confirmation message back to the producer when the message has been confirmed.

For sending confirmation message back to the producer when the message has been confirmed.
Typically used with `context.ask` from the producer.

If `DurableProducerQueue` is used the confirmation reply is sent when the message has been
successfully stored, meaning that the actual delivery to the consumer may happen later.
If `DurableProducerQueue` is not used the confirmation reply is sent when the message has been
fully delivered, processed, and confirmed by the consumer.
3. [**](../../../../akka/actor/typed/delivery/ProducerController$$RegisterConsumer.html "Permalink") final  case class [RegisterConsumer](ProducerController$$RegisterConsumer.html "Register the given consumerController to the ProducerController.")\[A](consumerController: [ActorRef](../ActorRef.html)\[[ConsumerController.Command](ConsumerController$$Command.html)\[A]]) extends [Command](ProducerController$$Command.html)\[A] with DeliverySerializable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRegister the given `consumerController` to the `ProducerController`.

Register the given `consumerController` to the `ProducerController`.

Alternatively, this registration can be done on the consumer side with the
[ConsumerController.RegisterToProducerController](ConsumerController$$RegisterToProducerController.html) message.

When using a custom `send` function for the `ProducerController` this should not be used.
4. [**](../../../../akka/actor/typed/delivery/ProducerController$$RequestNext.html "Permalink") final  case class [RequestNext](ProducerController$$RequestNext.html "The ProducerController sends RequestNext to the producer when it is allowed to send one message via the sendNextTo or askNextTo.")\[A](producerId: String, currentSeqNr: [SeqNr](#SeqNr=Long), confirmedSeqNr: [SeqNr](#SeqNr=Long), sendNextTo: [ActorRef](../ActorRef.html)\[A], askNextTo: [ActorRef](../ActorRef.html)\[[MessageWithConfirmation](ProducerController$$MessageWithConfirmation.html)\[A]]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe `ProducerController` sends `RequestNext` to the producer when it is allowed to send one
message via the `sendNextTo` or `askNextTo`.

The `ProducerController` sends `RequestNext` to the producer when it is allowed to send one
message via the `sendNextTo` or `askNextTo`. Note that only one message is allowed, and then
it must wait for next `RequestNext` before sending one more message.
5. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#SeqNr=Long "Permalink")  type SeqNr \= [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
6. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings.html "Permalink") final  class [Settings](ProducerController$$Settings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
7. [**](../../../../akka/actor/typed/delivery/ProducerController$$Start.html "Permalink") final  case class [Start](ProducerController$$Start.html "Initial message from the producer actor.")\[A](producer: [ActorRef](../ActorRef.html)\[[RequestNext](ProducerController$$RequestNext.html)\[A]]) extends [Command](ProducerController$$Command.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableInitial message from the producer actor.

Initial message from the producer actor. The `producer` is typically constructed
as a message adapter to map the [RequestNext](ProducerController$$RequestNext.html) to the protocol of the producer actor.

If the producer is restarted it should send a new `Start` message to the
`ProducerController`.
### Value Members

1. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/delivery/ProducerController$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#apply[A](producerId:String,durableQueueBehavior:Option[akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]]],settings:akka.actor.typed.delivery.ProducerController.Settings)(implicitevidence$2:scala.reflect.ClassTag[A]):akka.actor.typed.Behavior[akka.actor.typed.delivery.ProducerController.Command[A]] "Permalink")  def apply\[A](producerId: String, durableQueueBehavior: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Behavior](../Behavior.html)\[[DurableProducerQueue.Command](DurableProducerQueue$$Command.html)\[A]]], settings: [Settings](ProducerController$$Settings.html))(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): [Behavior](../Behavior.html)\[[Command](ProducerController$$Command.html)\[A]]
5. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#apply[A](producerId:String,durableQueueBehavior:Option[akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]]])(implicitevidence$1:scala.reflect.ClassTag[A]):akka.actor.typed.Behavior[akka.actor.typed.delivery.ProducerController.Command[A]] "Permalink")  def apply\[A](producerId: String, durableQueueBehavior: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Behavior](../Behavior.html)\[[DurableProducerQueue.Command](DurableProducerQueue$$Command.html)\[A]]])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): [Behavior](../Behavior.html)\[[Command](ProducerController$$Command.html)\[A]]
6. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#create[A](messageClass:Class[A],producerId:String,durableQueueBehavior:java.util.Optional[akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]]],settings:akka.actor.typed.delivery.ProducerController.Settings):akka.actor.typed.Behavior[akka.actor.typed.delivery.ProducerController.Command[A]] "Permalink")  def create\[A](messageClass: Class\[A], producerId: String, durableQueueBehavior: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Behavior](../Behavior.html)\[[DurableProducerQueue.Command](DurableProducerQueue$$Command.html)\[A]]], settings: [Settings](ProducerController$$Settings.html)): [Behavior](../Behavior.html)\[[Command](ProducerController$$Command.html)\[A]]Java API
9. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#create[A](messageClass:Class[A],producerId:String,durableQueueBehavior:java.util.Optional[akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]]]):akka.actor.typed.Behavior[akka.actor.typed.delivery.ProducerController.Command[A]] "Permalink")  def create\[A](messageClass: Class\[A], producerId: String, durableQueueBehavior: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Behavior](../Behavior.html)\[[DurableProducerQueue.Command](DurableProducerQueue$$Command.html)\[A]]]): [Behavior](../Behavior.html)\[[Command](ProducerController$$Command.html)\[A]]Java API
10. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#requestNextClass[A]():Class[akka.actor.typed.delivery.ProducerController.RequestNext[A]] "Permalink")  def requestNextClass\[A](): Class\[[RequestNext](ProducerController$$RequestNext.html)\[A]]Java API: The generic `Class` type for `ProducerController.RequestNext` that can be used when creating a
`messageAdapter` for `Class<RequestNext<MessageType>>`.
19. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html "Permalink")  object [Settings](ProducerController$$Settings$.html)
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/delivery/ProducerController$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$RegisterToProducerController.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$$MessageWithConfirmation.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$$RegisterConsumer.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$$RequestNext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$$Settings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$$Settings.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$$Start.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/WorkPullingProducerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl$$UnsealedInternalCommand.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$.html)*