---
description: Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.Publish
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html
title: Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.Publish
---

# Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.Publish

> **Summary:** Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.Publish

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html "Permalink")  object [DistributedPubSubMediator](DistributedPubSubMediator$.html)Definition Classes[pubsub](index.html)
- [Count](DistributedPubSubMediator$$Count.html)
- [CountSubscribers](DistributedPubSubMediator$$CountSubscribers.html)
- [CurrentTopics](DistributedPubSubMediator$$CurrentTopics.html "Reply to GetTopics.")
- [GetTopics](DistributedPubSubMediator$$GetTopics.html)
- [Publish](DistributedPubSubMediator$$Publish.html)
- [Put](DistributedPubSubMediator$$Put.html)
- [Remove](DistributedPubSubMediator$$Remove.html)
- [Send](DistributedPubSubMediator$$Send.html)
- [SendToAll](DistributedPubSubMediator$$SendToAll.html)
- [Subscribe](DistributedPubSubMediator$$Subscribe.html)
- [SubscribeAck](DistributedPubSubMediator$$SubscribeAck.html)
- [Unsubscribe](DistributedPubSubMediator$$Unsubscribe.html)
- [UnsubscribeAck](DistributedPubSubMediator$$UnsubscribeAck.html)
[o](DistributedPubSubMediator$$Publish.html "See companion class")[akka](../../index.html).[cluster](../index.html).[pubsub](index.html).[DistributedPubSubMediator](DistributedPubSubMediator$.html)

# [Publish](DistributedPubSubMediator$$Publish.html "See companion class")[**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html "Permalink")

### Companion [class Publish](DistributedPubSubMediator$$Publish.html "See companion class")

#### object Publish extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[DistributedPubSubMediator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/scala/akka/cluster/pubsub/DistributedPubSubMediator.scala#L199)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Publish
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#apply(topic:String,msg:Any):akka.cluster.pubsub.DistributedPubSubMediator.Publish "Permalink")  def apply(topic: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Publish](DistributedPubSubMediator$$Publish.html)
5. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Count$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Count.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$CountSubscribers.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$CurrentTopics.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Publish.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Put.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Remove.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Send.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$SubscribeAck.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$UnsubscribeAck.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html](https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html)*