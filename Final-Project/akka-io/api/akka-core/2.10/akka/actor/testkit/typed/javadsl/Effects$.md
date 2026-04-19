---
description: Akka 2.10.17 - akka.actor.testkit.typed.javadsl.Effects
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:58:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/javadsl/Effects$.html
title: Akka 2.10.17 - akka.actor.testkit.typed.javadsl.Effects
---

# Akka 2.10.17 - akka.actor.testkit.typed.javadsl.Effects

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.javadsl.Effects

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[testkit](../../index.html)
- [**](../../../../../akka/actor/testkit/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [ActorTestKit](ActorTestKit.html "Java API: Test kit for asynchronous testing of typed actors.")
- [BehaviorTestKit](BehaviorTestKit.html "Used for synchronous testing akka.actor.typed.Behaviors.")
- Effects
- [FishingOutcomes](FishingOutcomes$.html)
- [LogCapturing](LogCapturing.html "JUnit TestRule to make log lines appear only when the test failed.")
- [LoggingTestKit](LoggingTestKit.html "Facilities for verifying logs.")
- [ManualTime](ManualTime.html "Not for user instantiation, see ManualTime#get")
- [ReplyInbox](ReplyInbox.html "Similar to an akka.actor.testkit.typed.javadsl.TestInbox, but can only ever give access to a single message (a reply).")
- [SerializationTestKit](SerializationTestKit.html "Utilities to test serialization.")
- [StatusReplyInbox](StatusReplyInbox.html "A akka.actor.testkit.typed.javadsl.ReplyInbox which specially handles akka.pattern.StatusReply.")
- [TestInbox](TestInbox.html "Utility for use as an ActorRef when *synchronously* testing akka.actor.typed.Behavior with akka.actor.testkit.typed.javadsl.BehaviorTestKit.")
- [TestKitJunitResource](TestKitJunitResource.html "A Junit external resource for the ActorTestKit, making it possible to have Junit manage the lifecycle of the testkit.")
- [TestProbe](TestProbe.html "Java API: * Create instances through the create factories in the TestProbe companion or via ActorTestKit#createTestProbe.")
o[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[javadsl](index.html)

# Effects[**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html "Permalink")

### 

#### object Effects

Factories for behavior effects for [BehaviorTestKit](BehaviorTestKit.html), each effect has a suitable equals and can be used to compare
actual effects to expected ones.

Source[Effects.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/javadsl/Effects.scala#L17)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Effects
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#askInitiated[Req,Res,T](target:akka.actor.typed.RecipientRef[Req],responseTimeout:java.time.Duration,responseClass:Class[Res],messageClass:Class[T]):akka.actor.testkit.typed.Effect.AskInitiated[Req,Res,T] "Permalink")  def askInitiated\[Req, Res, T](target: [RecipientRef](../../../typed/RecipientRef.html)\[Req], responseTimeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), responseClass: Class\[Res], messageClass: Class\[T]): [AskInitiated](../Effect$$AskInitiated.html)\[Req, Res, T]The behavior initiated an ask via its context.

The behavior initiated an ask via its context. Note that the effect returned from this method should only
be used to compare with an actual effect.

Annotations@nowarn()
6. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#noEffects():akka.actor.testkit.typed.Effect.NoEffects "Permalink")  def noEffects(): [NoEffects](../Effect$$NoEffects.html)Used to represent an empty list of effects \- in other words, the behavior didn't do anything observable
14. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#receiveTimeoutSet[T](d:java.time.Duration,message:T):akka.actor.testkit.typed.Effect.ReceiveTimeoutSet[T] "Permalink")  def receiveTimeoutSet\[T](d: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), message: T): [ReceiveTimeoutSet](../Effect$$ReceiveTimeoutSet.html)\[T]The behavior set a new receive timeout, with `message` as timeout notification
17. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#scheduled[U](delay:java.time.Duration,target:akka.actor.typed.ActorRef[U],message:U):akka.actor.testkit.typed.Effect.Scheduled[U] "Permalink")  def scheduled\[U](delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), target: [typed.ActorRef](../../../typed/ActorRef.html)\[U], message: U): [Scheduled](../Effect$$Scheduled.html)\[U]The behavior used `context.schedule` to schedule `message` to be sent to `target` after `delay`
FIXME what about events scheduled through the scheduler?
18. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#spawned[T](behavior:akka.actor.typed.Behavior[T],childName:String,props:akka.actor.typed.Props,ref:akka.actor.typed.ActorRef[T]):akka.actor.testkit.typed.Effect.Spawned[T] "Permalink")  def spawned\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], childName: String, props: [typed.Props](../../../typed/Props.html), ref: [typed.ActorRef](../../../typed/ActorRef.html)\[T]): [Spawned](../Effect$$Spawned.html)\[T]The behavior spawned a named child with the given behavior and specific props
19. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#spawned[T](behavior:akka.actor.typed.Behavior[T],childName:String,props:akka.actor.typed.Props):akka.actor.testkit.typed.Effect.Spawned[T] "Permalink")  def spawned\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], childName: String, props: [typed.Props](../../../typed/Props.html)): [Spawned](../Effect$$Spawned.html)\[T]The behavior spawned a named child with the given behavior and specific props
20. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#spawned[T](behavior:akka.actor.typed.Behavior[T],childName:String,ref:akka.actor.typed.ActorRef[T]):akka.actor.testkit.typed.Effect.Spawned[T] "Permalink")  def spawned\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], childName: String, ref: [typed.ActorRef](../../../typed/ActorRef.html)\[T]): [Spawned](../Effect$$Spawned.html)\[T]The behavior spawned a named child with the given behavior with no specific props
21. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#spawned[T](behavior:akka.actor.typed.Behavior[T],childName:String):akka.actor.testkit.typed.Effect.Spawned[T] "Permalink")  def spawned\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], childName: String): [Spawned](../Effect$$Spawned.html)\[T]The behavior spawned a named child with the given behavior with no specific props
22. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#spawnedAnonymous[T](behavior:akka.actor.typed.Behavior[T],props:akka.actor.typed.Props,ref:akka.actor.typed.ActorRef[T]):akka.actor.testkit.typed.Effect.SpawnedAnonymous[T] "Permalink")  def spawnedAnonymous\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], props: [typed.Props](../../../typed/Props.html), ref: [typed.ActorRef](../../../typed/ActorRef.html)\[T]): [SpawnedAnonymous](../Effect$$SpawnedAnonymous.html)\[T]The behavior spawned an anonymous child with the given behavior with specific props
23. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#spawnedAnonymous[T](behavior:akka.actor.typed.Behavior[T],props:akka.actor.typed.Props):akka.actor.testkit.typed.Effect.SpawnedAnonymous[T] "Permalink")  def spawnedAnonymous\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], props: [typed.Props](../../../typed/Props.html)): [SpawnedAnonymous](../Effect$$SpawnedAnonymous.html)\[T]The behavior spawned an anonymous child with the given behavior with specific props
24. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#spawnedAnonymous[T](behavior:akka.actor.typed.Behavior[T],ref:akka.actor.typed.ActorRef[T]):akka.actor.testkit.typed.Effect.SpawnedAnonymous[T] "Permalink")  def spawnedAnonymous\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], ref: [typed.ActorRef](../../../typed/ActorRef.html)\[T]): [SpawnedAnonymous](../Effect$$SpawnedAnonymous.html)\[T]The behavior spawned an anonymous child with the given behavior with no specific props
25. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#spawnedAnonymous[T](behavior:akka.actor.typed.Behavior[T]):akka.actor.testkit.typed.Effect.SpawnedAnonymous[T] "Permalink")  def spawnedAnonymous\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T]): [SpawnedAnonymous](../Effect$$SpawnedAnonymous.html)\[T]The behavior spawned an anonymous child with the given behavior with no specific props
26. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#stopped(childName:String):akka.actor.testkit.typed.Effect.Stopped "Permalink")  def stopped(childName: String): [Stopped](../Effect$$Stopped.html)The behavior stopped `childName`
27. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#timerScheduled[U](key:Any,msg:U,delay:java.time.Duration,mode:akka.actor.testkit.typed.Effect.TimerScheduled.TimerMode,overriding:Boolean,send:akka.japi.function.Effect):akka.actor.testkit.typed.Effect.TimerScheduled[U] "Permalink")  def timerScheduled\[U](key: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), msg: U, delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), mode: [TimerMode](../Effect$$TimerScheduled$$TimerMode.html), overriding: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), send: [japi.function.Effect](../../../../japi/function/Effect.html)): [TimerScheduled](../Effect$$TimerScheduled.html)\[U]
29. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#unwatched[T](other:akka.actor.typed.ActorRef[T]):akka.actor.testkit.typed.Effect.Unwatched[T] "Permalink")  def unwatched\[T](other: [typed.ActorRef](../../../typed/ActorRef.html)\[T]): [Unwatched](../Effect$$Unwatched.html)\[T]The behavior stopped watching `other`, through `context.unwatch(other)`
31. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#watched[T](other:akka.actor.typed.ActorRef[T]):akka.actor.testkit.typed.Effect.Watched[T] "Permalink")  def watched\[T](other: [typed.ActorRef](../../../typed/ActorRef.html)\[T]): [Watched](../Effect$$Watched.html)\[T]The behavior started watching `other`, through `context.watch(other)`
35. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#watchedWith[U,T](other:akka.actor.typed.ActorRef[U],message:T):akka.actor.testkit.typed.Effect.WatchedWith[U,T] "Permalink")  def watchedWith\[U, T](other: [typed.ActorRef](../../../typed/ActorRef.html)\[U], message: T): [WatchedWith](../Effect$$WatchedWith.html)\[U, T]The behavior started watching `other`, through `context.watchWith(other, message)`
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$AskInitiated.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$NoEffects.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$ReceiveTimeoutSet.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Scheduled.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Spawned.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$SpawnedAnonymous.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Stopped.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$TimerScheduled$$TimerMode.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$TimerScheduled.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Unwatched.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Watched.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$WatchedWith.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/ActorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/ActorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/Effects$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/FishingOutcomes$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/LogCapturing.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/LoggingTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/ManualTime$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/ManualTime.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/ReplyInbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/SerializationTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/StatusReplyInbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestInbox$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestInbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestProbe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Effect.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/Effects$.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/Effects$.html)*