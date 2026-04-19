---
description: Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/ConsumerController$.html
title: Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController
---

# Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/delivery/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[delivery](index.html)
- ConsumerController
- [DurableProducerQueue](DurableProducerQueue$.html "Actor message protocol for storing and confirming reliable delivery of messages.")
- [ProducerController](ProducerController$.html "Point-to-point reliable delivery between a single producer actor sending messages and a single consumer actor receiving the messages.")
- [WorkPullingProducerController](WorkPullingProducerController$.html "Work pulling is a pattern where several worker actors pull tasks in their own pace from a shared work manager instead of that the manager pushes work to the workers blindly without knowing their individual capacity and current availability.")
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[delivery](index.html)

# ConsumerController[**](../../../../akka/actor/typed/delivery/ConsumerController$.html "Permalink")

### 

#### object ConsumerController

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

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() Source[ConsumerController.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/ConsumerController.scala#L50)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConsumerController
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Command.html "Permalink") sealed  trait [Command](ConsumerController$$Command.html)\[\+A] extends UnsealedInternalCommand
2. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Confirmed.html "Permalink")  trait [Confirmed](ConsumerController$$Confirmed.html) extends UnsealedInternalCommandAnnotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
3. [**](../../../../akka/actor/typed/delivery/ConsumerController$$DeliverThenStop.html "Permalink") final  case class [DeliverThenStop](ConsumerController$$DeliverThenStop.html)\[A]() extends [Command](ConsumerController$$Command.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
4. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Delivery.html "Permalink") final  class [Delivery](ConsumerController$$Delivery.html "Received messages from the producer are wrapped in Delivery when sent to the consumer.")\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Received messages from the producer are wrapped in `Delivery` when sent to the consumer.

Received messages from the producer are wrapped in `Delivery` when sent to the consumer.
When the message has been processed the consumer is supposed to send [Confirmed](ConsumerController$$Confirmed.html) back
to the `ConsumerController` via the `confirmTo`.
5. [**](../../../../akka/actor/typed/delivery/ConsumerController$$RegisterToProducerController.html "Permalink") final  case class [RegisterToProducerController](ConsumerController$$RegisterToProducerController.html "Register the ConsumerController to the given producerController.")\[A](producerController: [ActorRef](../ActorRef.html)\[[ProducerController.Command](ProducerController$$Command.html)\[A]]) extends [Command](ConsumerController$$Command.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRegister the `ConsumerController` to the given `producerController`.

Register the `ConsumerController` to the given `producerController`. It will
retry the registration until the `ProducerController` has acknowledged by sending its
first message.

Alternatively, this registration can be done on the producer side with the
[ProducerController.RegisterConsumer](ProducerController$$RegisterConsumer.html) message.
6. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#SeqNr=Long "Permalink")  type SeqNr \= [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
7. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html "Permalink") final  case class [SequencedMessage](ConsumerController$$SequencedMessage.html "This is used between the ProducerController and ConsumerController.")\[A](producerId: String, seqNr: [SeqNr](#SeqNr=Long), message: [MessageOrChunk](ConsumerController$$SequencedMessage$.html#MessageOrChunk=Any), first: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), ack: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(producerController: [ActorRef](../ActorRef.html)\[[InternalCommand](internal/ProducerControllerImpl$$InternalCommand.html)]) extends [Command](ConsumerController$$Command.html)\[A] with DeliverySerializable with [DeadLetterSuppression](../../DeadLetterSuppression.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis is used between the `ProducerController` and `ConsumerController`.

This is used between the `ProducerController` and `ConsumerController`. Should rarely be used in
application code but is public because it's in the signature for the `EntityTypeKey` when using
`ShardingConsumerController`.

In the future we may also make the custom `send` in `ProducerController` public to make it possible to
wrap it or send it in other ways when building higher level abstractions that are using the `ProducerController`.
That is used by `ShardingProducerController`.

producerControllerINTERNAL API: construction of SequencedMessage is internal
8. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html "Permalink") final  class [Settings](ConsumerController$$Settings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
9. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Start.html "Permalink") final  case class [Start](ConsumerController$$Start.html "Initial message from the consumer actor.")\[A](deliverTo: [ActorRef](../ActorRef.html)\[[Delivery](ConsumerController$$Delivery.html)\[A]]) extends [Command](ConsumerController$$Command.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableInitial message from the consumer actor.

Initial message from the consumer actor. The `deliverTo` is typically constructed
as a message adapter to map the [Delivery](ConsumerController$$Delivery.html) to the protocol of the consumer actor.

If the consumer is restarted it should send a new `Start` message to the
`ConsumerController`.
### Value Members

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#apply[A](serviceKey:akka.actor.typed.receptionist.ServiceKey[akka.actor.typed.delivery.ConsumerController.Command[A]],settings:akka.actor.typed.delivery.ConsumerController.Settings):akka.actor.typed.Behavior[akka.actor.typed.delivery.ConsumerController.Command[A]] "Permalink")  def apply\[A](serviceKey: [ServiceKey](../receptionist/ServiceKey.html)\[[Command](ConsumerController$$Command.html)\[A]], settings: [Settings](ConsumerController$$Settings.html)): [Behavior](../Behavior.html)\[[Command](ConsumerController$$Command.html)\[A]]
5. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#apply[A](serviceKey:akka.actor.typed.receptionist.ServiceKey[akka.actor.typed.delivery.ConsumerController.Command[A]]):akka.actor.typed.Behavior[akka.actor.typed.delivery.ConsumerController.Command[A]] "Permalink")  def apply\[A](serviceKey: [ServiceKey](../receptionist/ServiceKey.html)\[[Command](ConsumerController$$Command.html)\[A]]): [Behavior](../Behavior.html)\[[Command](ConsumerController$$Command.html)\[A]]To be used with [WorkPullingProducerController](WorkPullingProducerController$.html).

To be used with [WorkPullingProducerController](WorkPullingProducerController$.html). It will register itself to the
[akka.actor.typed.receptionist.Receptionist](../receptionist/Receptionist.html) with the given `serviceKey`, and the
`WorkPullingProducerController` subscribes to the same key to find active workers.
6. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#apply[A](settings:akka.actor.typed.delivery.ConsumerController.Settings):akka.actor.typed.Behavior[akka.actor.typed.delivery.ConsumerController.Command[A]] "Permalink")  def apply\[A](settings: [Settings](ConsumerController$$Settings.html)): [Behavior](../Behavior.html)\[[Command](ConsumerController$$Command.html)\[A]]
7. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#apply[A]():akka.actor.typed.Behavior[akka.actor.typed.delivery.ConsumerController.Command[A]] "Permalink")  def apply\[A](): [Behavior](../Behavior.html)\[[Command](ConsumerController$$Command.html)\[A]]
8. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#confirmed():akka.actor.typed.delivery.ConsumerController.Confirmed "Permalink")  def confirmed(): [Confirmed](ConsumerController$$Confirmed.html)Java API: the singleton instance of the Confirmed message.

Java API: the singleton instance of the Confirmed message.
When the message has been processed the consumer is supposed to send `Confirmed` back
to the `ConsumerController` via the `confirmTo` in the [Delivery](ConsumerController$$Delivery.html) message.
11. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#create[A](serviceKey:akka.actor.typed.receptionist.ServiceKey[akka.actor.typed.delivery.ConsumerController.Command[A]],settings:akka.actor.typed.delivery.ConsumerController.Settings):akka.actor.typed.Behavior[akka.actor.typed.delivery.ConsumerController.Command[A]] "Permalink")  def create\[A](serviceKey: [ServiceKey](../receptionist/ServiceKey.html)\[[Command](ConsumerController$$Command.html)\[A]], settings: [Settings](ConsumerController$$Settings.html)): [Behavior](../Behavior.html)\[[Command](ConsumerController$$Command.html)\[A]]Java API
12. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#create[A](serviceKey:akka.actor.typed.receptionist.ServiceKey[akka.actor.typed.delivery.ConsumerController.Command[A]]):akka.actor.typed.Behavior[akka.actor.typed.delivery.ConsumerController.Command[A]] "Permalink")  def create\[A](serviceKey: [ServiceKey](../receptionist/ServiceKey.html)\[[Command](ConsumerController$$Command.html)\[A]]): [Behavior](../Behavior.html)\[[Command](ConsumerController$$Command.html)\[A]]Java API: To be used with [WorkPullingProducerController](WorkPullingProducerController$.html).

Java API: To be used with [WorkPullingProducerController](WorkPullingProducerController$.html). It will register itself to the
[akka.actor.typed.receptionist.Receptionist](../receptionist/Receptionist.html) with the given `serviceKey`, and the
`WorkPullingProducerController` subscribes to the same key to find active workers.
13. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#create[A](settings:akka.actor.typed.delivery.ConsumerController.Settings):akka.actor.typed.Behavior[akka.actor.typed.delivery.ConsumerController.Command[A]] "Permalink")  def create\[A](settings: [Settings](ConsumerController$$Settings.html)): [Behavior](../Behavior.html)\[[Command](ConsumerController$$Command.html)\[A]]Java API
14. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#create[A]():akka.actor.typed.Behavior[akka.actor.typed.delivery.ConsumerController.Command[A]] "Permalink")  def create\[A](): [Behavior](../Behavior.html)\[[Command](ConsumerController$$Command.html)\[A]]Java API
15. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#deliveryClass[A]():Class[akka.actor.typed.delivery.ConsumerController.Delivery[A]] "Permalink")  def deliveryClass\[A](): Class\[[Delivery](ConsumerController$$Delivery.html)\[A]]Java API: The generic `Class` type for `ConsumerController.Delivery` that can be used when creating a
`messageAdapter` for `Class<Delivery<MessageType>>`.
16. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#serviceKeyClass[A]:Class[akka.actor.typed.delivery.ConsumerController.Command[A]] "Permalink")  def serviceKeyClass\[A]: Class\[[Command](ConsumerController$$Command.html)\[A]]Java API: The generic `Class` type for `ConsumerController.Command` that can be used when creating a `ServiceKey`
for `Class<Command<MessageType>>`.
25. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Confirmed$.html "Permalink")  case object [Confirmed](ConsumerController$$Confirmed$.html "When the message has been processed the consumer is supposed to send Confirmed back to the ConsumerController via the confirmTo in the Delivery message.") extends [Confirmed](ConsumerController$$Confirmed.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhen the message has been processed the consumer is supposed to send `Confirmed` back
to the `ConsumerController` via the `confirmTo` in the [Delivery](ConsumerController$$Delivery.html) message.
31. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Delivery$.html "Permalink")  object [Delivery](ConsumerController$$Delivery$.html)
32. [**](../../../../akka/actor/typed/delivery/ConsumerController$$SequencedMessage$.html "Permalink")  object [SequencedMessage](ConsumerController$$SequencedMessage$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
33. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html "Permalink")  object [Settings](ConsumerController$$Settings$.html)
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$Confirmed$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$Confirmed.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$DeliverThenStop.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$Delivery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$Delivery.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$RegisterToProducerController.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$SequencedMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$Settings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$Settings.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$$Start.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$$RegisterConsumer.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/WorkPullingProducerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl$$InternalCommand.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ConsumerController$.html)*