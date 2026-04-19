---
description: Akka 2.10.17 - akka.stream.testkit.TestSubscriber
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:33:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/testkit/TestSubscriber$.html
title: Akka 2.10.17 - akka.stream.testkit.TestSubscriber
---

# Akka 2.10.17 - akka.stream.testkit.TestSubscriber

> **Summary:** Akka 2.10.17 - akka.stream.testkit.TestSubscriber

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[testkit](index.html)
- [**](../../../akka/stream/testkit/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[testkit](index.html)
- [GraphStageMessages](GraphStageMessages$.html "Messages emitted after the corresponding stageUnderTest methods has been invoked.")
- [TestPublisher](TestPublisher$.html "Provides factory methods for various Publishers.")
- [TestSinkStage](TestSinkStage$.html)
- [TestSourceStage](TestSourceStage$.html)
- TestSubscriber
o[akka](../../index.html).[stream](../index.html).[testkit](index.html)

# TestSubscriber[**](../../../akka/stream/testkit/TestSubscriber$.html "Permalink")

### 

#### object TestSubscriber

Source[StreamTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-testkit/src/main/scala/akka/stream/testkit/StreamTestKit.scala#L278)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestSubscriber
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html "Permalink")  class [ManualProbe](TestSubscriber$$ManualProbe.html "Implementation of org.reactivestreams.Subscriber that allows various assertions.")\[I] extends Subscriber\[I]Implementation of org.reactivestreams.Subscriber that allows various assertions.

Implementation of org.reactivestreams.Subscriber that allows various assertions.

All timeouts are dilated automatically, for more details about time dilation refer to [akka.testkit.TestKit](../../testkit/TestKit.html).
2. [**](../../../akka/stream/testkit/TestSubscriber$$OnError.html "Permalink") final  case class [OnError](TestSubscriber$$OnError.html)(cause: Throwable) extends [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
3. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html "Permalink") final  case class [OnNext](TestSubscriber$$OnNext.html)\[I](element: I) extends [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
4. [**](../../../akka/stream/testkit/TestSubscriber$$OnSubscribe.html "Permalink") final  case class [OnSubscribe](TestSubscriber$$OnSubscribe.html)(subscription: Subscription) extends [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
5. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html "Permalink")  class [Probe](TestSubscriber$$Probe.html "Single subscription tracking for ManualProbe.")\[T] extends [ManualProbe](TestSubscriber$$ManualProbe.html)\[T]Single subscription tracking for [ManualProbe](TestSubscriber$$ManualProbe.html).
6. [**](../../../akka/stream/testkit/TestSubscriber$$SubscriberEvent.html "Permalink")  trait [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) extends [DeadLetterSuppression](../../actor/DeadLetterSuppression.html) with [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)
### Value Members

1. [**](../../../akka/stream/testkit/TestSubscriber$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/testkit/TestSubscriber$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/testkit/TestSubscriber$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/testkit/TestSubscriber$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/stream/testkit/TestSubscriber$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/stream/testkit/TestSubscriber$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/stream/testkit/TestSubscriber$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/stream/testkit/TestSubscriber$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/stream/testkit/TestSubscriber$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/stream/testkit/TestSubscriber$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/stream/testkit/TestSubscriber$.html#manualProbe[T]()(implicitsystem:akka.actor.ActorSystem):akka.stream.testkit.TestSubscriber.ManualProbe[T] "Permalink")  def manualProbe\[T]()(implicit system: [ActorSystem](../../actor/ActorSystem.html)): [ManualProbe](TestSubscriber$$ManualProbe.html)\[T]Probe that implements org.reactivestreams.Subscriber interface.
12. [**](../../../akka/stream/testkit/TestSubscriber$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/testkit/TestSubscriber$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/stream/testkit/TestSubscriber$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/testkit/TestSubscriber$.html#probe[T]()(implicitsystem:akka.actor.ActorSystem):akka.stream.testkit.TestSubscriber.Probe[T] "Permalink")  def probe\[T]()(implicit system: [ActorSystem](../../actor/ActorSystem.html)): [Probe](TestSubscriber$$Probe.html)\[T]
16. [**](../../../akka/stream/testkit/TestSubscriber$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../akka/stream/testkit/TestSubscriber$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../akka/stream/testkit/TestSubscriber$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/stream/testkit/TestSubscriber$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../akka/stream/testkit/TestSubscriber$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe$.html "Permalink")  object [ManualProbe](TestSubscriber$$ManualProbe$.html)
22. [**](../../../akka/stream/testkit/TestSubscriber$$OnComplete$.html "Permalink")  case object [OnComplete](TestSubscriber$$OnComplete$.html) extends [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
23. [**](../../../akka/stream/testkit/TestSubscriber$$Probe$.html "Permalink")  object [Probe](TestSubscriber$$Probe$.html)
### Deprecated Value Members

1. [**](../../../akka/stream/testkit/TestSubscriber$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/GraphStageMessages$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSinkStage$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSourceStage$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$ManualProbe$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$ManualProbe.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$OnComplete$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$OnError.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$OnNext.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$OnSubscribe.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$Probe$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$Probe.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$SubscriberEvent.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKit.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$.html](https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$.html)*