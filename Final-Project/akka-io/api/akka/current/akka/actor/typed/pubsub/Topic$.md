---
description: Akka 2.10.17 - akka.actor.typed.pubsub.Topic
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:52:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/pubsub/Topic$.html
title: Akka 2.10.17 - akka.actor.typed.pubsub.Topic
---

# Akka 2.10.17 - akka.actor.typed.pubsub.Topic

> **Summary:** Akka 2.10.17 - akka.actor.typed.pubsub.Topic

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](index.html)Definition Classes[typed](../index.html)
- [PubSub](PubSub.html)
- Topic
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[pubsub](index.html)

# Topic[**](../../../../akka/actor/typed/pubsub/Topic$.html "Permalink")

### 

#### object Topic

A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.

It is mostly useful in a clustered setting, where it is intended to be started once on every node that want to
house subscribers or publish messages to the topic, but it also works in a local setting without cluster.

In a clustered context messages are deduplicated so that there is at most one message sent to each node for
each publish and if there are no subscribers on a node, no message is sent to it. Note that the list of subscribers
is eventually consistent and there are no delivery guarantees built in.

Each topic results in a [akka.actor.typed.receptionist.ServiceKey](../receptionist/ServiceKey.html) in the [akka.actor.typed.receptionist.Receptionist](../receptionist/Receptionist.html)
so the same scaling recommendation holds for topics, see docs:
https://doc.akka.io/libraries/akka\-core/current/typed/actor\-discovery.html\#receptionist\-scalability

Source[Topic.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/pubsub/Topic.scala#L30)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Topic
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/actor/typed/pubsub/Topic$$Command.html "Permalink")  trait [Command](Topic$$Command.html "Not for user extension")\[T] extends internal.pubsub.TopicImpl.Command\[T]Not for user extension

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
2. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html "Permalink")  trait [TopicStats](Topic$$TopicStats.html "Response to the GetTopicStats query.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Response to the `GetTopicStats` query.

Response to the `GetTopicStats` query.

Note that this is a snapshot of the state at one point in time, that there was subscribers at that
time does not guarantee there is once this response arrives. The information cannot be used to
achieve delivery guarantees, but can be useful in for example tests, to observe a subscription
completed before publishing messages.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../akka/actor/typed/pubsub/Topic$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/pubsub/Topic$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/pubsub/Topic$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/pubsub/Topic$.html#apply[T](topicName:String,ttl:scala.concurrent.duration.FiniteDuration)(implicitclassTag:scala.reflect.ClassTag[T]):akka.actor.typed.Behavior[akka.actor.typed.pubsub.Topic.Command[T]] "Permalink")  def apply\[T](topicName: String, ttl: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit classTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Behavior](../Behavior.html)\[[Command](Topic$$Command.html)\[T]]Scala API: Create a topic actor behavior for the given topic name and message type with a TTL
making it terminate itself after a time period with no local subscribers and no locally published messages.

Scala API: Create a topic actor behavior for the given topic name and message type with a TTL
making it terminate itself after a time period with no local subscribers and no locally published messages.

Note: for many use cases it is more convenient to use the [PubSub](PubSub.html) registry to have an ActorSystem global
set of re\-usable topics instead of manually creating and managing the topic actors.
5. [**](../../../../akka/actor/typed/pubsub/Topic$.html#apply[T](topicName:String)(implicitclassTag:scala.reflect.ClassTag[T]):akka.actor.typed.Behavior[akka.actor.typed.pubsub.Topic.Command[T]] "Permalink")  def apply\[T](topicName: String)(implicit classTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Behavior](../Behavior.html)\[[Command](Topic$$Command.html)\[T]]Scala API: Create a topic actor behavior for the given topic name and message type.

Scala API: Create a topic actor behavior for the given topic name and message type.

Note: for many use cases it is more convenient to use the [PubSub](PubSub.html) registry to have an ActorSystem global
set of re\-usable topics instead of manually creating and managing the topic actors.
6. [**](../../../../akka/actor/typed/pubsub/Topic$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/pubsub/Topic$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/pubsub/Topic$.html#create[T](messageClass:Class[T],topicName:String,ttl:java.time.Duration):akka.actor.typed.Behavior[akka.actor.typed.pubsub.Topic.Command[T]] "Permalink")  def create\[T](messageClass: Class\[T], topicName: String, ttl: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Behavior](../Behavior.html)\[[Command](Topic$$Command.html)\[T]]Java API: Create a topic actor behavior for the given topic name and message class with a TTL
making it terminate itself after a time period with no local subscribers and no locally published messages.

Java API: Create a topic actor behavior for the given topic name and message class with a TTL
making it terminate itself after a time period with no local subscribers and no locally published messages.

Note: for many use cases it is more convenient to use the [PubSub](PubSub.html) registry to have an ActorSystem global
set of re\-usable topics instead of manually creating and managing the topic actors.
9. [**](../../../../akka/actor/typed/pubsub/Topic$.html#create[T](messageClass:Class[T],topicName:String):akka.actor.typed.Behavior[akka.actor.typed.pubsub.Topic.Command[T]] "Permalink")  def create\[T](messageClass: Class\[T], topicName: String): [Behavior](../Behavior.html)\[[Command](Topic$$Command.html)\[T]]Java API: Create a topic actor behavior for the given topic name and message class

Java API: Create a topic actor behavior for the given topic name and message class

Note: for many use cases it is more convenient to use the [PubSub](PubSub.html) registry to have an ActorSystem global
set of re\-usable topics instead of manually creating and managing the topic actors.
10. [**](../../../../akka/actor/typed/pubsub/Topic$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/actor/typed/pubsub/Topic$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/actor/typed/pubsub/Topic$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/actor/typed/pubsub/Topic$.html#getTopicStats[T](replyTo:akka.actor.typed.ActorRef[akka.actor.typed.pubsub.Topic.TopicStats]):akka.actor.typed.pubsub.Topic.Command[T] "Permalink")  def getTopicStats\[T](replyTo: [ActorRef](../ActorRef.html)\[[TopicStats](Topic$$TopicStats.html)]): [Command](Topic$$Command.html)\[T]Java API: Get a summary of the state for a local topic actor.

Java API: Get a summary of the state for a local topic actor.

See [TopicStats](Topic$$TopicStats.html) for caveats
14. [**](../../../../akka/actor/typed/pubsub/Topic$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/pubsub/Topic$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/actor/typed/pubsub/Topic$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/actor/typed/pubsub/Topic$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/pubsub/Topic$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/typed/pubsub/Topic$.html#publish[T](message:T):akka.actor.typed.pubsub.Topic.Command[T] "Permalink")  def publish\[T](message: T): [Command](Topic$$Command.html)\[T]Java API: Publish the message to all currently known subscribers.
20. [**](../../../../akka/actor/typed/pubsub/Topic$.html#subscribe[T](subscriber:akka.actor.typed.ActorRef[T]):akka.actor.typed.pubsub.Topic.Command[T] "Permalink")  def subscribe\[T](subscriber: [ActorRef](../ActorRef.html)\[T]): [Command](Topic$$Command.html)\[T]Java API: Subscribe to this topic.

Java API: Subscribe to this topic. Should only be used for local subscribers.
21. [**](../../../../akka/actor/typed/pubsub/Topic$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/actor/typed/pubsub/Topic$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/actor/typed/pubsub/Topic$.html#unsubscribe[T](subscriber:akka.actor.typed.ActorRef[T]):akka.actor.typed.pubsub.Topic.Command[T] "Permalink")  def unsubscribe\[T](subscriber: [ActorRef](../ActorRef.html)\[T]): [Command](Topic$$Command.html)\[T]Java API: Unsubscribe a previously subscribed actor from this topic.
24. [**](../../../../akka/actor/typed/pubsub/Topic$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/actor/typed/pubsub/Topic$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/actor/typed/pubsub/Topic$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../akka/actor/typed/pubsub/Topic$$GetTopicStats$.html "Permalink")  object [GetTopicStats](Topic$$GetTopicStats$.html "Scala API: Get a summary of the state for a local topic actor.")Scala API: Get a summary of the state for a local topic actor.

Scala API: Get a summary of the state for a local topic actor.

See [TopicStats](Topic$$TopicStats.html) for caveats
28. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html "Permalink")  object [Publish](Topic$$Publish$.html "Scala API: Publish the message to all currently known subscribers.")Scala API: Publish the message to all currently known subscribers.
29. [**](../../../../akka/actor/typed/pubsub/Topic$$Subscribe$.html "Permalink")  object [Subscribe](Topic$$Subscribe$.html "Scala API: Subscribe to this topic.")Scala API: Subscribe to this topic.

Scala API: Subscribe to this topic. Should only be used for local subscribers.
30. [**](../../../../akka/actor/typed/pubsub/Topic$$Unsubscribe$.html "Permalink")  object [Unsubscribe](Topic$$Unsubscribe$.html "Scala API: Unsubscribe a previously subscribed actor from this topic.")Scala API: Unsubscribe a previously subscribed actor from this topic.
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/pubsub/Topic$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/PubSub$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/PubSub.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$Command.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$GetTopicStats$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$Publish$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$Subscribe$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$TopicStats.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$Unsubscribe$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$.html](https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$.html)*