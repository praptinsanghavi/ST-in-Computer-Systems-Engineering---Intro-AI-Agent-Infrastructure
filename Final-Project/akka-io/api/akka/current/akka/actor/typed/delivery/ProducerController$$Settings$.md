---
description: Akka 2.10.17 - akka.actor.typed.delivery.ProducerController.Settings
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:46:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/ProducerController$$Settings$.html
title: Akka 2.10.17 - akka.actor.typed.delivery.ProducerController.Settings
---

# Akka 2.10.17 - akka.actor.typed.delivery.ProducerController.Settings

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.ProducerController.Settings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/delivery/ProducerController$.html "Permalink")  object [ProducerController](ProducerController$.html "Point-to-point reliable delivery between a single producer actor sending messages and a single consumer actor receiving the messages.")Point\-to\-point reliable delivery between a single producer actor sending messages and a single consumer
actor receiving the messages.

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

Definition Classes[delivery](index.html)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
- [Command](ProducerController$$Command.html)
- [MessageWithConfirmation](ProducerController$$MessageWithConfirmation.html "For sending confirmation message back to the producer when the message has been confirmed.")
- [RegisterConsumer](ProducerController$$RegisterConsumer.html "Register the given consumerController to the ProducerController.")
- [RequestNext](ProducerController$$RequestNext.html "The ProducerController sends RequestNext to the producer when it is allowed to send one message via the sendNextTo or askNextTo.")
- [Settings](ProducerController$$Settings.html)
- [Start](ProducerController$$Start.html "Initial message from the producer actor.")
[o](ProducerController$$Settings.html "See companion class")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[delivery](index.html).[ProducerController](ProducerController$.html)

# [Settings](ProducerController$$Settings.html "See companion class")[**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html "Permalink")

### Companion [class Settings](ProducerController$$Settings.html "See companion class")

#### object Settings

Source[ProducerController.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/ProducerController.scala#L144)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Settings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#apply(config:com.typesafe.config.Config):akka.actor.typed.delivery.ProducerController.Settings "Permalink")  def apply(config: Config): [Settings](ProducerController$$Settings.html)Scala API: Factory method from Config corresponding to
`akka.reliable-delivery.producer-controller`.
5. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#apply(system:akka.actor.typed.ActorSystem[_]):akka.actor.typed.delivery.ProducerController.Settings "Permalink")  def apply(system: [ActorSystem](../ActorSystem.html)\[\_]): [Settings](ProducerController$$Settings.html)Scala API: Factory method from config `akka.reliable-delivery.producer-controller`
of the `ActorSystem`.
6. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#create(config:com.typesafe.config.Config):akka.actor.typed.delivery.ProducerController.Settings "Permalink")  def create(config: Config): [Settings](ProducerController$$Settings.html)Java API: Factory method from Config corresponding to
`akka.reliable-delivery.producer-controller`.
9. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#create(system:akka.actor.typed.ActorSystem[_]):akka.actor.typed.delivery.ProducerController.Settings "Permalink")  def create(system: [ActorSystem](../ActorSystem.html)\[\_]): [Settings](ProducerController$$Settings.html)Java API: Factory method from config `akka.reliable-delivery.producer-controller`
of the `ActorSystem`.
10. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/delivery/ProducerController$$Settings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$RegisterToProducerController.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/DurableProducerQueue$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$Command.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$MessageWithConfirmation.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$RegisterConsumer.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$RequestNext.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$Settings$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$Settings.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$Start.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$Settings$.html](https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$$Settings$.html)*