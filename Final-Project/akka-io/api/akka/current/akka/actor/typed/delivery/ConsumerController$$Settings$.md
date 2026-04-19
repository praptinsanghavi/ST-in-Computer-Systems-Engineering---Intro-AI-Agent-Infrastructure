---
description: Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.Settings
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:45:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/ConsumerController$$Settings$.html
title: Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.Settings
---

# Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.Settings

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.Settings

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
- [SequencedMessage](ConsumerController$$SequencedMessage.html "This is used between the ProducerController and ConsumerController.")
- [Settings](ConsumerController$$Settings.html)
- [Start](ConsumerController$$Start.html "Initial message from the consumer actor.")
[o](ConsumerController$$Settings.html "See companion class")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[delivery](index.html).[ConsumerController](ConsumerController$.html)

# [Settings](ConsumerController$$Settings.html "See companion class")[**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html "Permalink")

### Companion [class Settings](ConsumerController$$Settings.html "See companion class")

#### object Settings

Source[ConsumerController.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/ConsumerController.scala#L190)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#apply(config:com.typesafe.config.Config):akka.actor.typed.delivery.ConsumerController.Settings "Permalink")  def apply(config: Config): [Settings](ConsumerController$$Settings.html)Scala API: Factory method from Config corresponding to
`akka.reliable-delivery.consumer-controller`.
5. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#apply(system:akka.actor.typed.ActorSystem[_]):akka.actor.typed.delivery.ConsumerController.Settings "Permalink")  def apply(system: [ActorSystem](../ActorSystem.html)\[\_]): [Settings](ConsumerController$$Settings.html)Scala API: Factory method from config `akka.reliable-delivery.consumer-controller`
of the `ActorSystem`.
6. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#create(config:com.typesafe.config.Config):akka.actor.typed.delivery.ConsumerController.Settings "Permalink")  def create(config: Config): [Settings](ConsumerController$$Settings.html)Java API: Factory method from Config corresponding to
`akka.reliable-delivery.producer-controller`.
9. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#create(system:akka.actor.typed.ActorSystem[_]):akka.actor.typed.delivery.ConsumerController.Settings "Permalink")  def create(system: [ActorSystem](../ActorSystem.html)\[\_]): [Settings](ConsumerController$$Settings.html)Java API: Factory method from config `akka.reliable-delivery.producer-controller`
of the `ActorSystem`.
10. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$Command.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$Confirmed$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$Confirmed.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$DeliverThenStop.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$Delivery$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$Delivery.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$RegisterToProducerController.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$SequencedMessage$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$Settings$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$Settings.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$Start.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/WorkPullingProducerController$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$Settings$.html](https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ConsumerController$$Settings$.html)*