---
description: Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:22:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator$.html
title: Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator
---

# Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator

> **Summary:** Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[pubsub](index.html)
- [DistributedPubSub](DistributedPubSub.html "Extension that starts a DistributedPubSubMediator actor with settings defined in config section akka.cluster.pub-sub.")
- [DistributedPubSubMediator](DistributedPubSubMediator.html "This actor manages a registry of actor references and replicates the entries to peer actors among all cluster nodes or a group of nodes tagged with a specific role.")
- [DistributedPubSubMessage](DistributedPubSubMessage.html "Marker trait for remote messages with special serializer.")
- [DistributedPubSubSettings](DistributedPubSubSettings.html)
[o](DistributedPubSubMediator.html "See companion class")[akka](../../index.html).[cluster](../index.html).[pubsub](index.html)

# [DistributedPubSubMediator](DistributedPubSubMediator.html "See companion class")[**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html "Permalink")

### Companion [class DistributedPubSubMediator](DistributedPubSubMediator.html "See companion class")

#### object DistributedPubSubMediator

Source[DistributedPubSubMediator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/scala/akka/cluster/pubsub/DistributedPubSubMediator.scala#L156)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DistributedPubSubMediator
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Count.html "Permalink") sealed abstract  class [Count](DistributedPubSubMediator$$Count.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$CountSubscribers.html "Permalink") final  case class [CountSubscribers](DistributedPubSubMediator$$CountSubscribers.html)(topic: String) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
3. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$CurrentTopics.html "Permalink") final  case class [CurrentTopics](DistributedPubSubMediator$$CurrentTopics.html "Reply to GetTopics.")(topics: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[String]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableReply to `GetTopics`.

Reply to `GetTopics`.

Annotations@SerialVersionUID()
4. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html "Permalink") sealed abstract  class [GetTopics](DistributedPubSubMediator$$GetTopics.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
5. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish.html "Permalink") final  case class [Publish](DistributedPubSubMediator$$Publish.html)(topic: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), sendOneMessageToEachGroup: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)) extends [DistributedPubSubMessage](DistributedPubSubMessage.html) with [WrappedMessage](../../actor/WrappedMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
6. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Put.html "Permalink") final  case class [Put](DistributedPubSubMediator$$Put.html)(ref: [ActorRef](../../actor/ActorRef.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
7. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Remove.html "Permalink") final  case class [Remove](DistributedPubSubMediator$$Remove.html)(path: String) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
8. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Send.html "Permalink") final  case class [Send](DistributedPubSubMediator$$Send.html)(path: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), localAffinity: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)) extends [DistributedPubSubMessage](DistributedPubSubMessage.html) with [WrappedMessage](../../actor/WrappedMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
9. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html "Permalink") final  case class [SendToAll](DistributedPubSubMediator$$SendToAll.html)(path: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), allButSelf: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [DistributedPubSubMessage](DistributedPubSubMessage.html) with [WrappedMessage](../../actor/WrappedMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
10. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe.html "Permalink") final  case class [Subscribe](DistributedPubSubMediator$$Subscribe.html)(topic: String, group: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], ref: [ActorRef](../../actor/ActorRef.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
11. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SubscribeAck.html "Permalink") final  case class [SubscribeAck](DistributedPubSubMediator$$SubscribeAck.html)(subscribe: [Subscribe](DistributedPubSubMediator$$Subscribe.html)) extends [DeadLetterSuppression](../../actor/DeadLetterSuppression.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
12. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html "Permalink") final  case class [Unsubscribe](DistributedPubSubMediator$$Unsubscribe.html)(topic: String, group: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], ref: [ActorRef](../../actor/ActorRef.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
13. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$UnsubscribeAck.html "Permalink") final  case class [UnsubscribeAck](DistributedPubSubMediator$$UnsubscribeAck.html)(unsubscribe: [Unsubscribe](DistributedPubSubMediator$$Unsubscribe.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
### Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#getCountInstance:akka.cluster.pubsub.DistributedPubSubMediator.Count "Permalink")  def getCountInstance: [Count](DistributedPubSubMediator$$Count.html)Java API: Send this message to the mediator and it will reply with an `Integer` of
the number of subscribers.
10. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#getTopicsInstance:akka.cluster.pubsub.DistributedPubSubMediator.GetTopics "Permalink")  def getTopicsInstance: [GetTopics](DistributedPubSubMediator$$GetTopics.html)Java API: Send this message to the mediator and it will reply with
[DistributedPubSubMediator.CurrentTopics](DistributedPubSubMediator$$CurrentTopics.html) containing the names of the (currently known)
registered topic names.
11. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#props(settings:akka.cluster.pubsub.DistributedPubSubSettings):akka.actor.Props "Permalink")  def props(settings: [DistributedPubSubSettings](DistributedPubSubSettings.html)): [Props](../../actor/Props.html)Scala API: Factory method for `DistributedPubSubMediator` [akka.actor.Props](../../actor/Props.html).
17. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Count$.html "Permalink")  case object [Count](DistributedPubSubMediator$$Count$.html "Scala API: Send this message to the mediator and it will reply with an Int of the number of subscribers.") extends [Count](DistributedPubSubMediator$$Count.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableScala API: Send this message to the mediator and it will reply with an `Int` of
the number of subscribers.

Scala API: Send this message to the mediator and it will reply with an `Int` of
the number of subscribers.
Only for testing purposes, to poll/await replication.
23. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics$.html "Permalink")  case object [GetTopics](DistributedPubSubMediator$$GetTopics$.html "Send this message to the mediator and it will reply with CurrentTopics containing the names of the (currently known) registered topic names.") extends [GetTopics](DistributedPubSubMediator$$GetTopics.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the mediator and it will reply with
[CurrentTopics](DistributedPubSubMediator$$CurrentTopics.html) containing the names of the (currently known)
registered topic names.

Send this message to the mediator and it will reply with
[CurrentTopics](DistributedPubSubMediator$$CurrentTopics.html) containing the names of the (currently known)
registered topic names.

Annotations@SerialVersionUID()
24. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html "Permalink")  object [Publish](DistributedPubSubMediator$$Publish$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
25. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe$.html "Permalink")  object [Subscribe](DistributedPubSubMediator$$Subscribe$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
26. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe$.html "Permalink")  object [Unsubscribe](DistributedPubSubMediator$$Unsubscribe$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/WrappedMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSub$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Count$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Count.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$CountSubscribers.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$CurrentTopics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Publish.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Put.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Remove.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Send.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$SubscribeAck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$UnsubscribeAck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$.html)*