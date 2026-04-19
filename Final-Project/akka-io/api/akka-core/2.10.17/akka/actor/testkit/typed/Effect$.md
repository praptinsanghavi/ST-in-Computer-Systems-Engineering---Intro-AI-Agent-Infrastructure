---
description: Akka 2.10.17 - akka.actor.testkit.typed.Effect
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/Effect$.html
title: Akka 2.10.17 - akka.actor.testkit.typed.Effect
---

# Akka 2.10.17 - akka.actor.testkit.typed.Effect

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.Effect

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/actor/testkit/typed/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/actor/testkit/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/actor/testkit/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[typed](index.html)
- [CapturedLogEvent](CapturedLogEvent.html "Representation of a Log Event issued by a akka.actor.typed.Behavior when testing with akka.actor.testkit.typed.scaladsl.BehaviorTestKit or akka.actor.testkit.typed.javadsl.BehaviorTestKit.")
- [Effect](Effect.html "All tracked effects for the akka.actor.testkit.typed.scaladsl.BehaviorTestKit and akka.actor.testkit.typed.javadsl.BehaviorTestKit must extend this type.")
- [FishingOutcome](FishingOutcome.html "Not for user extension.")
- [LoggingEvent](LoggingEvent.html "Representation of logging event when testing with akka.actor.testkit.typed.scaladsl.LoggingTestKit or akka.actor.testkit.typed.javadsl.LoggingTestKit.")
- [TestException](TestException.html "A predefined exception that can be used in tests.")
- [TestKitSettings](TestKitSettings.html)
[o](Effect.html "See companion class")[akka](../../../index.html).[actor](../../index.html).[testkit](../index.html).[typed](index.html)

# [Effect](Effect.html "See companion class")[**](../../../../akka/actor/testkit/typed/Effect$.html "Permalink")

### Companion [class Effect](Effect.html "See companion class")

#### object Effect

Source[Effect.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/Effect.scala#L29)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Effect
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html "Permalink") final  case class [AskInitiated](Effect$$AskInitiated.html "The behavior initiated an ask via its context.")\[Req, Res, T](target: [RecipientRef](../../typed/RecipientRef.html)\[Req], responseTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), responseClass: Class\[Res])(askMessage: Req, forwardResponse: ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Res]) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit), mapResponse: ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Res]) \=\> T) extends [Effect](Effect.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe behavior initiated an ask via its context.

The behavior initiated an ask via its context. A response or timeout may be sent via this
effect to the asking behavior: this effect enforces that at most one response or timeout is
sent. Alternatively, one may, after obtaining the effect, test the response adaptation function
(without sending a message to the asking behavior) arbitrarily many times via the 'adaptResponse`and` adaptTimeout `methods.`

The 'replyToRef' is exposed so that the target inbox can expect the actual message sent to
initiate the ask.

Note that this requires the ask to be initiated via the [ActorContext](../../ActorContext.html). The Future returning
ask is not testable in the BehaviorTestKit.
2. [**](../../../../akka/actor/testkit/typed/Effect$$MessageAdapter.html "Permalink") final  case class [MessageAdapter](Effect$$MessageAdapter.html "The behavior create a message adapter for the messages of type clazz")\[A, T](messageClass: Class\[A], adapt: (A) \=\> T) extends [Effect](Effect.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe behavior create a message adapter for the messages of type clazz
3. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html "Permalink") sealed abstract  class [NoEffects](Effect$$NoEffects.html "Used for NoEffects expectations by type") extends [Effect](Effect.html)Used for NoEffects expectations by type
4. [**](../../../../akka/actor/testkit/typed/Effect$$ReceiveTimeoutCancelled.html "Permalink") sealed abstract  class [ReceiveTimeoutCancelled](Effect$$ReceiveTimeoutCancelled.html) extends [Effect](Effect.html)
5. [**](../../../../akka/actor/testkit/typed/Effect$$ReceiveTimeoutSet.html "Permalink") final  case class [ReceiveTimeoutSet](Effect$$ReceiveTimeoutSet.html "The behavior set a new receive timeout, with message as timeout notification")\[T](d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), message: T) extends [Effect](Effect.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe behavior set a new receive timeout, with `message` as timeout notification
6. [**](../../../../akka/actor/testkit/typed/Effect$$Scheduled.html "Permalink") final  case class [Scheduled](Effect$$Scheduled.html "The behavior used context.scheduleOnce to schedule message to be sent to target after delay FIXME what about events scheduled through the scheduler?")\[U](delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), target: [typed.ActorRef](../../typed/ActorRef.html)\[U], message: U) extends [Effect](Effect.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe behavior used `context.scheduleOnce` to schedule `message` to be sent to `target` after `delay`
FIXME what about events scheduled through the scheduler?
7. [**](../../../../akka/actor/testkit/typed/Effect$$Spawned.html "Permalink") final  class [Spawned](Effect$$Spawned.html "The behavior spawned a named child with the given behavior (and optionally specific props)")\[T] extends [Effect](Effect.html) with [Product3](https://www.scala-lang.org/api/2.13.17/scala/Product3.html#scala.Product3)\[[Behavior](../../typed/Behavior.html)\[T], String, [typed.Props](../../typed/Props.html)] with SerializableThe behavior spawned a named child with the given behavior (and optionally specific props)
8. [**](../../../../akka/actor/testkit/typed/Effect$$SpawnedAnonymous.html "Permalink") final  class [SpawnedAnonymous](Effect$$SpawnedAnonymous.html "The behavior spawned an anonymous child with the given behavior (and optionally specific props)")\[T] extends [Effect](Effect.html) with [Product2](https://www.scala-lang.org/api/2.13.17/scala/Product2.html#scala.Product2)\[[Behavior](../../typed/Behavior.html)\[T], [typed.Props](../../typed/Props.html)] with SerializableThe behavior spawned an anonymous child with the given behavior (and optionally specific props)
9. [**](../../../../akka/actor/testkit/typed/Effect$$Stopped.html "Permalink") final  case class [Stopped](Effect$$Stopped.html "The behavior stopped childName")(childName: String) extends [Effect](Effect.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe behavior stopped `childName`
10. [**](../../../../akka/actor/testkit/typed/Effect$$TimerCancelled.html "Permalink") final  case class [TimerCancelled](Effect$$TimerCancelled.html)(key: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [Effect](Effect.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
11. [**](../../../../akka/actor/testkit/typed/Effect$$TimerScheduled.html "Permalink") final  case class [TimerScheduled](Effect$$TimerScheduled.html)\[U](key: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), msg: U, delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), mode: [TimerMode](Effect$$TimerScheduled$$TimerMode.html), overriding: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(send: () \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)) extends [Effect](Effect.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
12. [**](../../../../akka/actor/testkit/typed/Effect$$Unwatched.html "Permalink") final  case class [Unwatched](Effect$$Unwatched.html "The behavior stopped watching other, through context.unwatch(other)")\[T](other: [typed.ActorRef](../../typed/ActorRef.html)\[T]) extends [Effect](Effect.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe behavior stopped watching `other`, through `context.unwatch(other)`
13. [**](../../../../akka/actor/testkit/typed/Effect$$Watched.html "Permalink") final  case class [Watched](Effect$$Watched.html "The behavior started watching other, through context.watch(other)")\[T](other: [typed.ActorRef](../../typed/ActorRef.html)\[T]) extends [Effect](Effect.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe behavior started watching `other`, through `context.watch(other)`
14. [**](../../../../akka/actor/testkit/typed/Effect$$WatchedWith.html "Permalink") final  case class [WatchedWith](Effect$$WatchedWith.html "The behavior started watching other, through context.watchWith(other, message)")\[U, T](other: [typed.ActorRef](../../typed/ActorRef.html)\[U], message: T) extends [Effect](Effect.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe behavior started watching `other`, through `context.watchWith(other, message)`
### Value Members

1. [**](../../../../akka/actor/testkit/typed/Effect$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/testkit/typed/Effect$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/testkit/typed/Effect$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/testkit/typed/Effect$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/actor/testkit/typed/Effect$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/actor/testkit/typed/Effect$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/actor/testkit/typed/Effect$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/actor/testkit/typed/Effect$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/actor/testkit/typed/Effect$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/actor/testkit/typed/Effect$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/actor/testkit/typed/Effect$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/actor/testkit/typed/Effect$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/actor/testkit/typed/Effect$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/testkit/typed/Effect$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../../akka/actor/testkit/typed/Effect$.html#timerScheduled:akka.actor.testkit.typed.Effect.TimerScheduled.type "Permalink")  def timerScheduled: [TimerScheduled](Effect$$TimerScheduled$.html)
16. [**](../../../../akka/actor/testkit/typed/Effect$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../akka/actor/testkit/typed/Effect$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../akka/actor/testkit/typed/Effect$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../akka/actor/testkit/typed/Effect$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects$.html "Permalink")  case object [NoEffects](Effect$$NoEffects$.html "Used to represent an empty list of effects - in other words, the behavior didn't do anything observable") extends [NoEffects](Effect$$NoEffects.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableUsed to represent an empty list of effects \- in other words, the behavior didn't do anything observable
21. [**](../../../../akka/actor/testkit/typed/Effect$$ReceiveTimeoutCancelled$.html "Permalink")  case object [ReceiveTimeoutCancelled](Effect$$ReceiveTimeoutCancelled$.html) extends [ReceiveTimeoutCancelled](Effect$$ReceiveTimeoutCancelled.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
22. [**](../../../../akka/actor/testkit/typed/Effect$$Spawned$.html "Permalink")  object [Spawned](Effect$$Spawned$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
23. [**](../../../../akka/actor/testkit/typed/Effect$$SpawnedAnonymous$.html "Permalink")  object [SpawnedAnonymous](Effect$$SpawnedAnonymous$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
24. [**](../../../../akka/actor/testkit/typed/Effect$$TimerScheduled$.html "Permalink")  object [TimerScheduled](Effect$$TimerScheduled$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../../../akka/actor/testkit/typed/Effect$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/CapturedLogEvent$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/CapturedLogEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$AskInitiated.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$MessageAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$NoEffects$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$NoEffects.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$ReceiveTimeoutCancelled$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$ReceiveTimeoutCancelled.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$ReceiveTimeoutSet.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$Scheduled.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$Spawned$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$Spawned.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$SpawnedAnonymous$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$SpawnedAnonymous.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$Stopped.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$TimerCancelled.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$TimerScheduled$$TimerMode.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$TimerScheduled$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$TimerScheduled.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$Unwatched.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$Watched.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$WatchedWith.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/LoggingEvent$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/LoggingEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/TestException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/TestKitSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$.html)*