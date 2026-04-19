---
description: Akka 2.10.17 - akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html
title: Akka 2.10.17 - akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings
---

# Akka 2.10.17 - akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings

> **Summary:** Akka 2.10.17 - akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html "Permalink")  object [EventSourcedProducerQueue](EventSourcedProducerQueue$.html "DurableProducerQueue that can be used with akka.actor.typed.delivery.ProducerController for reliable delivery of messages.")DurableProducerQueue that can be used with [akka.actor.typed.delivery.ProducerController](../../../actor/typed/delivery/ProducerController$.html)
for reliable delivery of messages.

DurableProducerQueue that can be used with [akka.actor.typed.delivery.ProducerController](../../../actor/typed/delivery/ProducerController$.html)
for reliable delivery of messages. It is implemented with Event Sourcing and stores one
event before sending the message to the destination and one event for the confirmation
that the message has been delivered and processed.

The DurableProducerQueue.LoadState request is used at startup to retrieve the unconfirmed messages.

Definition Classes[delivery](index.html)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
- [Settings](EventSourcedProducerQueue$$Settings.html)
[o](EventSourcedProducerQueue$$Settings.html "See companion class")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[delivery](index.html).[EventSourcedProducerQueue](EventSourcedProducerQueue$.html)

# [Settings](EventSourcedProducerQueue$$Settings.html "See companion class")[**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html "Permalink")

### Companion [class Settings](EventSourcedProducerQueue$$Settings.html "See companion class")

#### object Settings

Source[EventSourcedProducerQueue.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/delivery/EventSourcedProducerQueue.scala#L39)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#apply(config:com.typesafe.config.Config):akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings "Permalink")  def apply(config: Config): [Settings](EventSourcedProducerQueue$$Settings.html)Scala API: Factory method from Config corresponding to
`akka.reliable-delivery.producer-controller.event-sourced-durable-queue`.
5. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#apply(system:akka.actor.typed.ActorSystem[_]):akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings "Permalink")  def apply(system: [ActorSystem](../../../actor/typed/ActorSystem.html)\[\_]): [Settings](EventSourcedProducerQueue$$Settings.html)Scala API: Factory method from config `akka.reliable-delivery.producer-controller.event-sourced-durable-queue`
of the `ActorSystem`.
6. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#create(config:com.typesafe.config.Config):akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings "Permalink")  def create(config: Config): [Settings](EventSourcedProducerQueue$$Settings.html)Java API: Factory method from Config corresponding to
`akka.reliable-delivery.producer-controller.event-sourced-durable-queue`.
9. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#create(system:akka.actor.typed.ActorSystem[_]):akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings "Permalink")  def create(system: [ActorSystem](../../../actor/typed/ActorSystem.html)\[\_]): [Settings](EventSourcedProducerQueue$$Settings.html)Java API: Factory method from config `akka.reliable-delivery.producer-controller.event-sourced-durable-queue`
of the `ActorSystem`.
10. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html)*