---
description: Akka 2.10.17 - akka.stream.testkit.TestPublisher
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:18:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/testkit/TestPublisher$.html
title: Akka 2.10.17 - akka.stream.testkit.TestPublisher
---

# Akka 2.10.17 - akka.stream.testkit.TestPublisher

> **Summary:** Akka 2.10.17 - akka.stream.testkit.TestPublisher

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[testkit](index.html)
- [**](../../../akka/stream/testkit/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[testkit](index.html)
- [GraphStageMessages](GraphStageMessages$.html "Messages emitted after the corresponding stageUnderTest methods has been invoked.")
- TestPublisher
- [TestSinkStage](TestSinkStage$.html)
- [TestSourceStage](TestSourceStage$.html)
- [TestSubscriber](TestSubscriber$.html)
o[akka](../../index.html).[stream](../index.html).[testkit](index.html)

# TestPublisher[**](../../../akka/stream/testkit/TestPublisher$.html "Permalink")

### 

#### object TestPublisher

Provides factory methods for various Publishers.

Source[StreamTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-testkit/src/main/scala/akka/stream/testkit/StreamTestKit.scala#L29)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestPublisher
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/stream/testkit/TestPublisher$$CancelSubscription.html "Permalink") final  case class [CancelSubscription](TestPublisher$$CancelSubscription.html)(subscription: Subscription, cause: Throwable) extends [PublisherEvent](TestPublisher$$PublisherEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../../akka/stream/testkit/TestPublisher$$ManualProbe.html "Permalink")  class [ManualProbe](TestPublisher$$ManualProbe.html "Implementation of org.reactivestreams.Publisher that allows various assertions.")\[I] extends Publisher\[I]Implementation of org.reactivestreams.Publisher that allows various assertions.

Implementation of org.reactivestreams.Publisher that allows various assertions.
This probe does not track demand. Therefore you need to expect demand before sending
elements downstream.
3. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html "Permalink")  class [Probe](TestPublisher$$Probe.html "Single subscription and demand tracking for TestPublisher.ManualProbe.")\[T] extends [ManualProbe](TestPublisher$$ManualProbe.html)\[T]Single subscription and demand tracking for [TestPublisher.ManualProbe](TestPublisher$$ManualProbe.html).
4. [**](../../../akka/stream/testkit/TestPublisher$$PublisherEvent.html "Permalink")  trait [PublisherEvent](TestPublisher$$PublisherEvent.html) extends [DeadLetterSuppression](../../actor/DeadLetterSuppression.html) with [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)
5. [**](../../../akka/stream/testkit/TestPublisher$$RequestMore.html "Permalink") final  case class [RequestMore](TestPublisher$$RequestMore.html)(subscription: Subscription, elements: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [PublisherEvent](TestPublisher$$PublisherEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
6. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html "Permalink") final  case class [Subscribe](TestPublisher$$Subscribe.html)(subscription: Subscription) extends [PublisherEvent](TestPublisher$$PublisherEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../akka/stream/testkit/TestPublisher$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/testkit/TestPublisher$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/testkit/TestPublisher$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/testkit/TestPublisher$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/stream/testkit/TestPublisher$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/stream/testkit/TestPublisher$.html#empty[T]():org.reactivestreams.Publisher[T] "Permalink")  def empty\[T](): Publisher\[T]Publisher that signals complete to subscribers, after handing a void subscription.
7. [**](../../../akka/stream/testkit/TestPublisher$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/stream/testkit/TestPublisher$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/stream/testkit/TestPublisher$.html#error[T](cause:Throwable):org.reactivestreams.Publisher[T] "Permalink")  def error\[T](cause: Throwable): Publisher\[T]Publisher that signals error to subscribers immediately after handing out subscription.
10. [**](../../../akka/stream/testkit/TestPublisher$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/stream/testkit/TestPublisher$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/stream/testkit/TestPublisher$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../akka/stream/testkit/TestPublisher$.html#lazyEmpty[T]:org.reactivestreams.Publisher[T] "Permalink")  def lazyEmpty\[T]: Publisher\[T]Publisher that subscribes the subscriber and completes after the first request.
14. [**](../../../akka/stream/testkit/TestPublisher$.html#lazyError[T](cause:Throwable):org.reactivestreams.Publisher[T] "Permalink")  def lazyError\[T](cause: Throwable): Publisher\[T]Publisher that subscribes the subscriber and signals error after the first request.
15. [**](../../../akka/stream/testkit/TestPublisher$.html#manualProbe[T](autoOnSubscribe:Boolean)(implicitsystem:akka.actor.ActorSystem):akka.stream.testkit.TestPublisher.ManualProbe[T] "Permalink")  def manualProbe\[T](autoOnSubscribe: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= true)(implicit system: [ActorSystem](../../actor/ActorSystem.html)): [ManualProbe](TestPublisher$$ManualProbe.html)\[T]Probe that implements org.reactivestreams.Publisher interface.
16. [**](../../../akka/stream/testkit/TestPublisher$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/stream/testkit/TestPublisher$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/stream/testkit/TestPublisher$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/testkit/TestPublisher$.html#probe[T](initialPendingRequests:Long)(implicitsystem:akka.actor.ActorSystem):akka.stream.testkit.TestPublisher.Probe[T] "Permalink")  def probe\[T](initialPendingRequests: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= 0)(implicit system: [ActorSystem](../../actor/ActorSystem.html)): [Probe](TestPublisher$$Probe.html)\[T]Probe that implements org.reactivestreams.Publisher interface and tracks demand.
20. [**](../../../akka/stream/testkit/TestPublisher$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/stream/testkit/TestPublisher$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/stream/testkit/TestPublisher$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/stream/testkit/TestPublisher$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/stream/testkit/TestPublisher$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/stream/testkit/TestPublisher$$ManualProbe$.html "Permalink")  object [ManualProbe](TestPublisher$$ManualProbe$.html)
26. [**](../../../akka/stream/testkit/TestPublisher$$Probe$.html "Permalink")  object [Probe](TestPublisher$$Probe$.html)
27. [**](../../../akka/stream/testkit/TestPublisher$$SubscriptionDone$.html "Permalink")  object [SubscriptionDone](TestPublisher$$SubscriptionDone$.html) extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)
### Deprecated Value Members

1. [**](../../../akka/stream/testkit/TestPublisher$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/GraphStageMessages$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$CancelSubscription.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$ManualProbe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$ManualProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$Probe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$Probe.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$PublisherEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$RequestMore.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$Subscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$SubscriptionDone$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSinkStage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSourceStage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$.html)*