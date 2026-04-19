---
description: Akka 2.10.17 - akka.cluster.sharding.typed.delivery.ShardingConsumerController
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.delivery.ShardingConsumerController
---

# Akka 2.10.17 - akka.cluster.sharding.typed.delivery.ShardingConsumerController

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.delivery.ShardingConsumerController

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[sharding](../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- ShardingConsumerController
- [ShardingProducerController](ShardingProducerController$.html "Reliable delivery between a producer actor sending messages to sharded consumer actors receiving the messages.")
o[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html).[delivery](index.html)

# ShardingConsumerController[**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html "Permalink")

### 

#### object ShardingConsumerController

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

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)() Source[ShardingConsumerController.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/delivery/ShardingConsumerController.scala#L40)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardingConsumerController
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings.html "Permalink") final  class [Settings](ShardingConsumerController$$Settings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#apply[A,B](consumerBehavior:akka.actor.typed.ActorRef[akka.actor.typed.delivery.ConsumerController.Start[A]]=>akka.actor.typed.Behavior[B]):akka.actor.typed.Behavior[akka.actor.typed.delivery.ConsumerController.SequencedMessage[A]] "Permalink")  def apply\[A, B](consumerBehavior: ([ActorRef](../../../../actor/typed/ActorRef.html)\[[Start](../../../../actor/typed/delivery/ConsumerController$$Start.html)\[A]]) \=\> [Behavior](../../../../actor/typed/Behavior.html)\[B]): [Behavior](../../../../actor/typed/Behavior.html)\[[SequencedMessage](../../../../actor/typed/delivery/ConsumerController$$SequencedMessage.html)\[A]]The `Behavior` of the entity that is to be initialized in `ClusterSharding`.

The `Behavior` of the entity that is to be initialized in `ClusterSharding`. It will manage
the lifecycle and message delivery to the destination consumer actor.
5. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#create[A,B](consumerBehavior:java.util.function.Function[akka.actor.typed.ActorRef[akka.actor.typed.delivery.ConsumerController.Start[A]],akka.actor.typed.Behavior[B]],settings:akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings):akka.actor.typed.Behavior[akka.actor.typed.delivery.ConsumerController.SequencedMessage[A]] "Permalink")  def create\[A, B](consumerBehavior: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorRef](../../../../actor/typed/ActorRef.html)\[[Start](../../../../actor/typed/delivery/ConsumerController$$Start.html)\[A]], [Behavior](../../../../actor/typed/Behavior.html)\[B]], settings: [Settings](ShardingConsumerController$$Settings.html)): [Behavior](../../../../actor/typed/Behavior.html)\[[SequencedMessage](../../../../actor/typed/delivery/ConsumerController$$SequencedMessage.html)\[A]]Java API: The `Behavior` of the entity that is to be initialized in `ClusterSharding`.

Java API: The `Behavior` of the entity that is to be initialized in `ClusterSharding`. It will manage
the lifecycle and message delivery to the destination consumer actor.
8. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#create[A,B](consumerBehavior:java.util.function.Function[akka.actor.typed.ActorRef[akka.actor.typed.delivery.ConsumerController.Start[A]],akka.actor.typed.Behavior[B]]):akka.actor.typed.Behavior[akka.actor.typed.delivery.ConsumerController.SequencedMessage[A]] "Permalink")  def create\[A, B](consumerBehavior: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorRef](../../../../actor/typed/ActorRef.html)\[[Start](../../../../actor/typed/delivery/ConsumerController$$Start.html)\[A]], [Behavior](../../../../actor/typed/Behavior.html)\[B]]): [Behavior](../../../../actor/typed/Behavior.html)\[[SequencedMessage](../../../../actor/typed/delivery/ConsumerController$$SequencedMessage.html)\[A]]Java API: The `Behavior` of the entity that is to be initialized in `ClusterSharding`.

Java API: The `Behavior` of the entity that is to be initialized in `ClusterSharding`. It will manage
the lifecycle and message delivery to the destination consumer actor.
9. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#entityTypeKeyClass[A]:Class[akka.actor.typed.delivery.ConsumerController.SequencedMessage[A]] "Permalink")  def entityTypeKeyClass\[A]: Class\[[SequencedMessage](../../../../actor/typed/delivery/ConsumerController$$SequencedMessage.html)\[A]]Java API: The generic `Class` type for `ConsumerController.SequencedMessage` that can be used when creating
an `EntityTypeKey` for the `ShardedConsumerController` with
`Class<EntityTypeKey<ConsumerController.SequencedMessage<MessageType>>>`.
10. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#withSettings[A,B](settings:akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings)(consumerBehavior:akka.actor.typed.ActorRef[akka.actor.typed.delivery.ConsumerController.Start[A]]=>akka.actor.typed.Behavior[B]):akka.actor.typed.Behavior[akka.actor.typed.delivery.ConsumerController.SequencedMessage[A]] "Permalink")  def withSettings\[A, B](settings: [Settings](ShardingConsumerController$$Settings.html))(consumerBehavior: ([ActorRef](../../../../actor/typed/ActorRef.html)\[[Start](../../../../actor/typed/delivery/ConsumerController$$Start.html)\[A]]) \=\> [Behavior](../../../../actor/typed/Behavior.html)\[B]): [Behavior](../../../../actor/typed/Behavior.html)\[[SequencedMessage](../../../../actor/typed/delivery/ConsumerController$$SequencedMessage.html)\[A]]The `Behavior` of the entity that is to be initialized in `ClusterSharding`.

The `Behavior` of the entity that is to be initialized in `ClusterSharding`. It will manage
the lifecycle and message delivery to the destination consumer actor.
24. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html "Permalink")  object [Settings](ShardingConsumerController$$Settings$.html)
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Start.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/ShardingConsumerController$$Settings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/ShardingProducerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html)*