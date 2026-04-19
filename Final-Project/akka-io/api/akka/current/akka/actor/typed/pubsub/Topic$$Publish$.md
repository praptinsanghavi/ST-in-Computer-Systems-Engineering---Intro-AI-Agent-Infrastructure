---
description: Akka 2.10.17 - akka.actor.typed.pubsub.Topic.Publish
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:47:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/pubsub/Topic$$Publish$.html
title: Akka 2.10.17 - akka.actor.typed.pubsub.Topic.Publish
---

# Akka 2.10.17 - akka.actor.typed.pubsub.Topic.Publish

> **Summary:** Akka 2.10.17 - akka.actor.typed.pubsub.Topic.Publish

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/pubsub/Topic$.html "Permalink")  object [Topic](Topic$.html "A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.")A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.

A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.

It is mostly useful in a clustered setting, where it is intended to be started once on every node that want to
house subscribers or publish messages to the topic, but it also works in a local setting without cluster.

In a clustered context messages are deduplicated so that there is at most one message sent to each node for
each publish and if there are no subscribers on a node, no message is sent to it. Note that the list of subscribers
is eventually consistent and there are no delivery guarantees built in.

Each topic results in a [akka.actor.typed.receptionist.ServiceKey](../receptionist/ServiceKey.html) in the [akka.actor.typed.receptionist.Receptionist](../receptionist/Receptionist.html)
so the same scaling recommendation holds for topics, see docs:
https://doc.akka.io/libraries/akka\-core/current/typed/actor\-discovery.html\#receptionist\-scalability

Definition Classes[pubsub](index.html)
- [Command](Topic$$Command.html "Not for user extension")
- [GetTopicStats](Topic$$GetTopicStats$.html "Scala API: Get a summary of the state for a local topic actor.")
- Publish
- [Subscribe](Topic$$Subscribe$.html "Scala API: Subscribe to this topic.")
- [TopicStats](Topic$$TopicStats.html "Response to the GetTopicStats query.")
- [Unsubscribe](Topic$$Unsubscribe$.html "Scala API: Unsubscribe a previously subscribed actor from this topic.")
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[pubsub](index.html).[Topic](Topic$.html)

# Publish[**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html "Permalink")

### 

#### object Publish

Scala API: Publish the message to all currently known subscribers.

Source[Topic.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/pubsub/Topic.scala#L41)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Publish
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#apply[T](message:T):akka.actor.typed.pubsub.Topic.Command[T] "Permalink")  def apply\[T](message: T): [Command](Topic$$Command.html)\[T]
5. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/pubsub/Topic$$Publish$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
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
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$Publish$.html](https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$Publish$.html)*