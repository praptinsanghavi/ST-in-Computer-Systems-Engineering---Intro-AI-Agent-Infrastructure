---
description: Akka 2.10.17 - akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings
---

# Akka 2.10.17 - akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[sharding](../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$.html "Permalink")  object [ShardingProducerController](ShardingProducerController$.html "Reliable delivery between a producer actor sending messages to sharded consumer actors receiving the messages.")Reliable delivery between a producer actor sending messages to sharded consumer
actors receiving the messages.

Reliable delivery between a producer actor sending messages to sharded consumer
actors receiving the messages.

The `ShardingProducerController` should be used together with [ShardingConsumerController](ShardingConsumerController$.html).

A producer can send messages via a `ShardingProducerController` to any `ShardingConsumerController`
identified by an `entityId`. A single `ShardingProducerController` per `ActorSystem` (node) can be
shared for sending to all entities of a certain entity type. No explicit registration is needed
between the `ShardingConsumerController` and `ShardingProducerController`.

The producer actor will start the flow by sending a [ShardingProducerController.Start](ShardingProducerController$$Start.html)
message to the `ShardingProducerController`. The `ActorRef` in the `Start` message is
typically constructed as a message adapter to map the [ShardingProducerController.RequestNext](ShardingProducerController$$RequestNext.html)
to the protocol of the producer actor.

The `ShardingProducerController` sends `RequestNext` to the producer, which is then allowed
to send one message to the `ShardingProducerController` via the `sendNextTo` in the `RequestNext`.
Thereafter the producer will receive a new `RequestNext` when it's allowed to send one more message.

In the `RequestNext` message there is information about which entities that have demand. It is allowed
to send to a new `entityId` that is not included in the `RequestNext.entitiesWithDemand`. If sending to
an entity that doesn't have demand the message will be buffered. This support for buffering means that
it is even allowed to send several messages in response to one `RequestNext` but it's recommended to
only send one message and wait for next `RequestNext` before sending more messages.

The producer and `ShardingProducerController` actors are supposed to be local so that these messages are
fast and not lost. This is enforced by a runtime check.

There will be one `ShardingConsumerController` for each entity. Many unconfirmed messages can be in
flight between the `ShardingProducerController` and each `ShardingConsumerController`. The flow control
is driven by the consumer side, which means that the `ShardingProducerController` will not send faster
than the demand requested by the consumers.

Lost messages are detected, resent and deduplicated if needed. This is also driven by the consumer side,
which means that the `ShardingProducerController` will not push resends unless requested by the
`ShardingConsumerController`.

Until sent messages have been confirmed the `ShardingProducerController` keeps them in memory to be able to
resend them. If the JVM of the `ShardingProducerController` crashes those unconfirmed messages are lost.
To make sure the messages can be delivered also in that scenario the `ShardingProducerController` can be
used with a DurableProducerQueue. Then the unconfirmed messages are stored in a durable way so
that they can be redelivered when the producer is started again. An implementation of the
`DurableProducerQueue` is provided by `EventSourcedProducerQueue` in `akka-persistence-typed`.

Instead of using `tell` with the `sendNextTo` in the `RequestNext` the producer can use `context.ask`
with the `askNextTo` in the `RequestNext`. The difference is that a reply is sent back when the
message has been handled. If a `DurableProducerQueue` is used then the reply is sent when the message
has been stored successfully, but it might not have been processed by the consumer yet. Otherwise the
reply is sent after the consumer has processed and confirmed the message.

It's also possible to use the `ShardingProducerController` and `ShardingConsumerController` without resending
lost messages, but the flow control is still used. This can be more efficient since messages
don't have to be kept in memory in the `ProducerController` until they have been
confirmed, but the drawback is that lost messages will not be delivered. See configuration
`only-flow-control` of the `ShardingConsumerController`.

The `producerId` is used in logging and included as MDC entry with key `"producerId"`. It's propagated
to the `ConsumerController` and is useful for correlating log messages. It can be any `String` but it's
recommended to use a unique identifier of representing the producer.

If the `DurableProducerQueue` is defined it is created as a child actor of the `ShardingProducerController` actor.
`ProducerController` actors are created for each destination entity. Those child actors use the same dispatcher
as the parent `ShardingProducerController`.

Definition Classes[delivery](index.html)Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
- [Command](ShardingProducerController$$Command.html)
- [MessageWithConfirmation](ShardingProducerController$$MessageWithConfirmation.html "For sending confirmation message back to the producer when the message has been confirmed.")
- [RequestNext](ShardingProducerController$$RequestNext.html "The ProducerController sends RequestNext to the producer when it is allowed to send one message via the sendNextTo or askNextTo.")
- [Settings](ShardingProducerController$$Settings.html)
- [Start](ShardingProducerController$$Start.html "Initial message from the producer actor.")
[o](ShardingProducerController$$Settings.html "See companion class")[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html).[delivery](index.html).[ShardingProducerController](ShardingProducerController$.html)

# [Settings](ShardingProducerController$$Settings.html "See companion class")[**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html "Permalink")

### Companion [class Settings](ShardingProducerController$$Settings.html "See companion class")

#### object Settings

Source[ShardingProducerController.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/delivery/ShardingProducerController.scala#L162)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#apply(config:com.typesafe.config.Config):akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings "Permalink")  def apply(config: Config): [Settings](ShardingProducerController$$Settings.html)Scala API: Factory method from Config corresponding to
`akka.reliable-delivery.sharding.producer-controller`.
5. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#apply(system:akka.actor.typed.ActorSystem[_]):akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings "Permalink")  def apply(system: [ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_]): [Settings](ShardingProducerController$$Settings.html)Scala API: Factory method from config `akka.reliable-delivery.sharding.producer-controller`
of the `ActorSystem`.
6. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#create(config:com.typesafe.config.Config):akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings "Permalink")  def create(config: Config): [Settings](ShardingProducerController$$Settings.html)Java API: Factory method from Config corresponding to
`akka.reliable-delivery.sharding.producer-controller`.
9. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#create(system:akka.actor.typed.ActorSystem[_]):akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings "Permalink")  def create(system: [ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_]): [Settings](ShardingProducerController$$Settings.html)Java API: Factory method from config `akka.reliable-delivery.sharding.producer-controller`
of the `ActorSystem`.
10. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$$MessageWithConfirmation.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$$RequestNext.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$$Start.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$$Settings$.html)*