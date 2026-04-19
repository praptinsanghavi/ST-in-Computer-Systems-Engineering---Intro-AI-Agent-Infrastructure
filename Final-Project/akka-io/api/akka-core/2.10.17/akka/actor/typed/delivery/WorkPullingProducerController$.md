---
description: Akka 2.10.17 - akka.actor.typed.delivery.WorkPullingProducerController
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:50:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/WorkPullingProducerController$.html
title: Akka 2.10.17 - akka.actor.typed.delivery.WorkPullingProducerController
---

# Akka 2.10.17 - akka.actor.typed.delivery.WorkPullingProducerController

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.WorkPullingProducerController

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
- [ProducerController](ProducerController$.html "Point-to-point reliable delivery between a single producer actor sending messages and a single consumer actor receiving the messages.")
- WorkPullingProducerController
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[delivery](index.html)

# WorkPullingProducerController[**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html "Permalink")

### 

#### object WorkPullingProducerController

Work pulling is a pattern where several worker actors pull tasks in their own pace from
a shared work manager instead of that the manager pushes work to the workers blindly
without knowing their individual capacity and current availability.

The `WorkPullingProducerController` can be used together with [ConsumerController](ConsumerController$.html) to
implement the work pulling pattern.

One important property is that the order of the messages should not matter, because each
message is routed randomly to one of the workers with demand. In other words, two subsequent
messages may be routed to two different workers and processed independent of each other.

A worker actor (consumer) and its `ConsumerController` is dynamically registered to the
`WorkPullingProducerController` via a ServiceKey. It will register itself to the
\* [akka.actor.typed.receptionist.Receptionist](../receptionist/Receptionist.html), and the `WorkPullingProducerController`
subscribes to the same key to find active workers. In this way workers can be dynamically
added or removed from any node in the cluster.

The work manager (producer) actor will start the flow by sending a [WorkPullingProducerController.Start](WorkPullingProducerController$$Start.html)
message to the `WorkPullingProducerController`. The `ActorRef` in the `Start` message is
typically constructed as a message adapter to map the [WorkPullingProducerController.RequestNext](WorkPullingProducerController$$RequestNext.html)
to the protocol of the producer actor.

The `WorkPullingProducerController` sends `RequestNext` to the producer, which is then allowed
to send one message to the `WorkPullingProducerController` via the `sendNextTo` in the `RequestNext`.
Thereafter the producer will receive a new `RequestNext` when it's allowed to send one more message.
It will send a new `RequestNext` when there are demand from any worker.
It's possible that all workers with demand are deregistered after the `RequestNext` is sent and before
the actual messages is sent to the `WorkPullingProducerController`. In that case the message is
buffered and will be delivered when a new worker is registered or when there is new demand.

The producer and `WorkPullingProducerController` actors are supposed to be local so that these messages are
fast and not lost. This is enforced by a runtime check.

Many unconfirmed messages can be in flight between the `WorkPullingProducerController` and each
`ConsumerController`. The flow control is driven by the consumer side, which means that the
`WorkPullingProducerController` will not send faster than the demand requested by the workers.

Lost messages are detected, resent and deduplicated if needed. This is also driven by the consumer side,
which means that the `WorkPullingProducerController` will not push resends unless requested by the
`ConsumerController`.

If a worker crashes or is stopped gracefully the unconfirmed messages for that worker will be
routed to other workers by the `WorkPullingProducerController`. This may result in that some messages
may be processed more than once, by different workers.

Until sent messages have been confirmed the `WorkPullingProducerController` keeps them in memory to be able to
resend them. If the JVM of the `WorkPullingProducerController` crashes those unconfirmed messages are lost.
To make sure the messages can be delivered also in that scenario the `WorkPullingProducerController` can be
used with a [DurableProducerQueue](DurableProducerQueue$.html). Then the unconfirmed messages are stored in a durable way so
that they can be redelivered when the producer is started again. An implementation of the
`DurableProducerQueue` is provided by `EventSourcedProducerQueue` in `akka-persistence-typed`.

Instead of using `tell` with the `sendNextTo` in the `RequestNext` the producer can use `context.ask`
with the `askNextTo` in the `RequestNext`. The difference is that a reply is sent back when the
message has been handled. If a `DurableProducerQueue` is used then the reply is sent when the message
has been stored successfully, but it might not have been processed by the consumer yet. Otherwise the
reply is sent after the consumer has processed and confirmed the message.

It's also possible to use the `WorkPullingProducerController` and `ConsumerController` without resending
lost messages, but the flow control is still used. This can for example be useful when both consumer and
producer are know to be located in the same local `ActorSystem`. This can be more efficient since messages
don't have to be kept in memory in the `ProducerController` until they have been
confirmed, but the drawback is that lost messages will not be delivered. See configuration
`only-flow-control` of the `ConsumerController`.

The `producerId` is used in logging and included as MDC entry with key `"producerId"`. It's propagated
to the `ConsumerController` and is useful for correlating log messages. It can be any `String` but it's
recommended to use a unique identifier of representing the producer.

If the `DurableProducerQueue` is defined it is created as a child actor of the `WorkPullingProducerController` actor.
`ProducerController` actors are created for each registered worker. Those child actors use the same dispatcher
as the parent `WorkPullingProducerController`.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() Source[WorkPullingProducerController.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/WorkPullingProducerController.scala#L100)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. WorkPullingProducerController
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$$Command.html "Permalink") sealed  trait [Command](WorkPullingProducerController$$Command.html)\[A] extends UnsealedInternalCommand
2. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$$GetWorkerStats.html "Permalink") final  case class [GetWorkerStats](WorkPullingProducerController$$GetWorkerStats.html "Retrieve information about registered workers.")\[A](replyTo: [ActorRef](../ActorRef.html)\[[WorkerStats](WorkPullingProducerController$$WorkerStats.html)]) extends [Command](WorkPullingProducerController$$Command.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRetrieve information about registered workers.
3. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$$MessageWithConfirmation.html "Permalink") final  case class [MessageWithConfirmation](WorkPullingProducerController$$MessageWithConfirmation.html "For sending confirmation message back to the producer when the message has been fully delivered, processed, and confirmed by the consumer.")\[A](message: A, replyTo: [ActorRef](../ActorRef.html)\[[Done](../../../Done.html)]) extends UnsealedInternalCommand with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor sending confirmation message back to the producer when the message has been fully delivered, processed,
and confirmed by the consumer.

For sending confirmation message back to the producer when the message has been fully delivered, processed,
and confirmed by the consumer. Typically used with `context.ask` from the producer.
4. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$$RequestNext.html "Permalink") final  case class [RequestNext](WorkPullingProducerController$$RequestNext.html "The WorkPullingProducerController sends RequestNext to the producer when it is allowed to send one message via the sendNextTo or askNextTo.")\[A](sendNextTo: [ActorRef](../ActorRef.html)\[A], askNextTo: [ActorRef](../ActorRef.html)\[[MessageWithConfirmation](WorkPullingProducerController$$MessageWithConfirmation.html)\[A]]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe `WorkPullingProducerController` sends `RequestNext` to the producer when it is allowed to send one
message via the `sendNextTo` or `askNextTo`.

The `WorkPullingProducerController` sends `RequestNext` to the producer when it is allowed to send one
message via the `sendNextTo` or `askNextTo`. Note that only one message is allowed, and then
it must wait for next `RequestNext` before sending one more message.
5. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$$Settings.html "Permalink") final  class [Settings](WorkPullingProducerController$$Settings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
6. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$$Start.html "Permalink") final  case class [Start](WorkPullingProducerController$$Start.html "Initial message from the producer actor.")\[A](producer: [ActorRef](../ActorRef.html)\[[RequestNext](WorkPullingProducerController$$RequestNext.html)\[A]]) extends [Command](WorkPullingProducerController$$Command.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableInitial message from the producer actor.

Initial message from the producer actor. The `producer` is typically constructed
as a message adapter to map the [RequestNext](WorkPullingProducerController$$RequestNext.html) to the protocol of the producer actor.

If the producer is restarted it should send a new `Start` message to the
`WorkPullingProducerController`.
7. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$$WorkerStats.html "Permalink") final  case class [WorkerStats](WorkPullingProducerController$$WorkerStats.html)(numberOfWorkers: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#apply[A](messageClass:Class[A],producerId:String,workerServiceKey:akka.actor.typed.receptionist.ServiceKey[akka.actor.typed.delivery.ConsumerController.Command[A]],durableQueueBehavior:java.util.Optional[akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]]],settings:akka.actor.typed.delivery.WorkPullingProducerController.Settings):akka.actor.typed.Behavior[akka.actor.typed.delivery.WorkPullingProducerController.Command[A]] "Permalink")  def apply\[A](messageClass: Class\[A], producerId: String, workerServiceKey: [ServiceKey](../receptionist/ServiceKey.html)\[[ConsumerController.Command](ConsumerController$$Command.html)\[A]], durableQueueBehavior: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Behavior](../Behavior.html)\[[DurableProducerQueue.Command](DurableProducerQueue$$Command.html)\[A]]], settings: [Settings](WorkPullingProducerController$$Settings.html)): [Behavior](../Behavior.html)\[[Command](WorkPullingProducerController$$Command.html)\[A]]Java API
5. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#apply[A](producerId:String,workerServiceKey:akka.actor.typed.receptionist.ServiceKey[akka.actor.typed.delivery.ConsumerController.Command[A]],durableQueueBehavior:Option[akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]]],settings:akka.actor.typed.delivery.WorkPullingProducerController.Settings)(implicitevidence$2:scala.reflect.ClassTag[A]):akka.actor.typed.Behavior[akka.actor.typed.delivery.WorkPullingProducerController.Command[A]] "Permalink")  def apply\[A](producerId: String, workerServiceKey: [ServiceKey](../receptionist/ServiceKey.html)\[[ConsumerController.Command](ConsumerController$$Command.html)\[A]], durableQueueBehavior: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Behavior](../Behavior.html)\[[DurableProducerQueue.Command](DurableProducerQueue$$Command.html)\[A]]], settings: [Settings](WorkPullingProducerController$$Settings.html))(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): [Behavior](../Behavior.html)\[[Command](WorkPullingProducerController$$Command.html)\[A]]
6. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#apply[A](producerId:String,workerServiceKey:akka.actor.typed.receptionist.ServiceKey[akka.actor.typed.delivery.ConsumerController.Command[A]],durableQueueBehavior:Option[akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]]])(implicitevidence$1:scala.reflect.ClassTag[A]):akka.actor.typed.Behavior[akka.actor.typed.delivery.WorkPullingProducerController.Command[A]] "Permalink")  def apply\[A](producerId: String, workerServiceKey: [ServiceKey](../receptionist/ServiceKey.html)\[[ConsumerController.Command](ConsumerController$$Command.html)\[A]], durableQueueBehavior: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Behavior](../Behavior.html)\[[DurableProducerQueue.Command](DurableProducerQueue$$Command.html)\[A]]])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[A]): [Behavior](../Behavior.html)\[[Command](WorkPullingProducerController$$Command.html)\[A]]
7. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#create[A](messageClass:Class[A],producerId:String,workerServiceKey:akka.actor.typed.receptionist.ServiceKey[akka.actor.typed.delivery.ConsumerController.Command[A]],durableQueueBehavior:java.util.Optional[akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]]]):akka.actor.typed.Behavior[akka.actor.typed.delivery.WorkPullingProducerController.Command[A]] "Permalink")  def create\[A](messageClass: Class\[A], producerId: String, workerServiceKey: [ServiceKey](../receptionist/ServiceKey.html)\[[ConsumerController.Command](ConsumerController$$Command.html)\[A]], durableQueueBehavior: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Behavior](../Behavior.html)\[[DurableProducerQueue.Command](DurableProducerQueue$$Command.html)\[A]]]): [Behavior](../Behavior.html)\[[Command](WorkPullingProducerController$$Command.html)\[A]]Java API
10. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#requestNextClass[A]():Class[akka.actor.typed.delivery.WorkPullingProducerController.RequestNext[A]] "Permalink")  def requestNextClass\[A](): Class\[[RequestNext](WorkPullingProducerController$$RequestNext.html)\[A]]Java API: The generic `Class` type for `WorkPullingProducerController.RequestNext` that can be used when
creating a `messageAdapter` for `Class<RequestNext<MessageType>>`.
19. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$$Settings$.html "Permalink")  object [Settings](WorkPullingProducerController$$Settings$.html)
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/delivery/WorkPullingProducerController$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController$$GetWorkerStats.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController$$MessageWithConfirmation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController$$RequestNext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController$$Settings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController$$Settings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController$$Start.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController$$WorkerStats.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController$.html)*