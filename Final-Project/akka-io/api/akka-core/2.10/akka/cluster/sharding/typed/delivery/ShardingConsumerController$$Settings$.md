---
description: Akka 2.10.17 - akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings
---

# Akka 2.10.17 - akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[sharding](../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html "Permalink")  object [ShardingConsumerController](ShardingConsumerController$.html "ShardingConsumerController is used together with ShardingProducerController.")`ShardingConsumerController` is used together with [ShardingProducerController](ShardingProducerController$.html).

`ShardingConsumerController` is used together with [ShardingProducerController](ShardingProducerController$.html). See the description
in that class or the Akka reference documentation for how they are intended to be used.

`ShardingConsumerController` is the entity that is initialized in `ClusterSharding`. It will manage
the lifecycle and message delivery to the destination consumer actor.

The destination consumer actor will start the flow by sending an initial ConsumerController.Start
message via the `ActorRef` provided in the factory function of the consumer `Behavior`.
The `ActorRef` in the `Start` message is typically constructed as a message adapter to map the
ConsumerController.Delivery to the protocol of the consumer actor.

Received messages from the producer are wrapped in ConsumerController.Delivery when sent to the consumer,
which is supposed to reply with ConsumerController.Confirmed when it has processed the message.
Next message from a specific producer is not delivered until the previous is confirmed. However, since
there can be several producers, e.g. one per node, sending to the same destination entity there can be
several `Delivery` in flight at the same time.
More messages from a specific producer that arrive while waiting for the confirmation are stashed by
the `ConsumerController` and delivered when previous message was confirmed.

Definition Classes[delivery](index.html)Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
- [Settings](ShardingConsumerController$$Settings.html)
[o](ShardingConsumerController$$Settings.html "See companion class")[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html).[delivery](index.html).[ShardingConsumerController](ShardingConsumerController$.html)

# [Settings](ShardingConsumerController$$Settings.html "See companion class")[**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html "Permalink")

### Companion [class Settings](ShardingConsumerController$$Settings.html "See companion class")

#### object Settings

Source[ShardingConsumerController.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/delivery/ShardingConsumerController.scala#L42)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#apply(config:com.typesafe.config.Config):akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings "Permalink")  def apply(config: Config): [Settings](ShardingConsumerController$$Settings.html)Scala API: Factory method from Config corresponding to
`akka.reliable-delivery.sharding.consumer-controller`.
5. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#apply(system:akka.actor.typed.ActorSystem[_]):akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings "Permalink")  def apply(system: [ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_]): [Settings](ShardingConsumerController$$Settings.html)Scala API: Factory method from config `akka.reliable-delivery.sharding.consumer-controller`
of the `ActorSystem`.
6. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#create(config:com.typesafe.config.Config):akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings "Permalink")  def create(config: Config): [Settings](ShardingConsumerController$$Settings.html)Java API: Factory method from Config corresponding to
`akka.reliable-delivery.sharding.consumer-controller`.
9. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#create(system:akka.actor.typed.ActorSystem[_]):akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings "Permalink")  def create(system: [ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_]): [Settings](ShardingConsumerController$$Settings.html)Java API: Factory method from config `akka.reliable-delivery.sharding.consumer-controller`
of the `ActorSystem`.
10. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html)*