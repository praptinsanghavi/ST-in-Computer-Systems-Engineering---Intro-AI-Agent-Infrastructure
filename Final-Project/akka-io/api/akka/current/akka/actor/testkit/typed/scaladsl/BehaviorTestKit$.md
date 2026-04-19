---
description: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.BehaviorTestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:49:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html
title: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.BehaviorTestKit
---

# Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.BehaviorTestKit

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.BehaviorTestKit

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[testkit](../../index.html)
- [**](../../../../../akka/actor/testkit/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [ActorTestKit](ActorTestKit.html "Testkit for asynchronous testing of typed actors, meant for mixing into the test class.")
- [ActorTestKitBase](ActorTestKitBase.html "A base class for the ActorTestKit, making it possible to have testing framework (e.g.")
- [BehaviorTestKit](BehaviorTestKit.html "Used for synchronous testing akka.actor.typed.Behaviors.")
- [Effects](Effects$.html "Factories for behavior effects for BehaviorTestKit, each effect has a suitable equals and can be used to compare actual effects to expected ones.")
- [FishingOutcomes](FishingOutcomes$.html)
- [LogCapturing](LogCapturing.html "Mixin this trait to a ScalaTest test to make log lines appear only when the test failed.")
- [LoggingTestKit](LoggingTestKit.html "Facilities for verifying logs.")
- [ManualTime](ManualTime.html "Not for user instantiation, see ManualTime#apply")
- [ReplyInbox](ReplyInbox.html "Similar to an akka.actor.testkit.typed.scaladsl.TestInbox, but can only ever give access to a single message (a reply).")
- [ScalaTestWithActorTestKit](ScalaTestWithActorTestKit.html "A ScalaTest base class for the ActorTestKit, making it possible to have ScalaTest manage the lifecycle of the testkit.")
- [SerializationTestKit](SerializationTestKit.html "Utilities to test serialization.")
- [StatusReplyInbox](StatusReplyInbox.html "A akka.actor.testkit.typed.scaladsl.ReplyInbox which specially handles akka.pattern.StatusReply.")
- [TestDuration](package$$TestDuration.html "Scala API.")
- [TestInbox](TestInbox.html "Utility for use as an ActorRef when *synchronously* testing akka.actor.typed.Behavior with akka.actor.testkit.typed.scaladsl.BehaviorTestKit.")
- [TestProbe](TestProbe.html "Create instances through the factories in the TestProbe companion.")
[o](BehaviorTestKit.html "See companion trait")[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [BehaviorTestKit](BehaviorTestKit.html "See companion trait")[**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html "Permalink")

### Companion [trait BehaviorTestKit](BehaviorTestKit.html "See companion trait")

#### object BehaviorTestKit

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)() Source[BehaviorTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.scala#L22)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BehaviorTestKit
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#ApplicationTestConfig:com.typesafe.config.Config "Permalink")  val ApplicationTestConfig: Config
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#apply[T](initialBehavior:akka.actor.typed.Behavior[T]):akka.actor.testkit.typed.scaladsl.BehaviorTestKit[T] "Permalink")  def apply\[T](initialBehavior: [Behavior](../../../typed/Behavior.html)\[T]): [BehaviorTestKit](BehaviorTestKit.html)\[T]
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#apply[T](initialBehavior:akka.actor.typed.Behavior[T],name:String):akka.actor.testkit.typed.scaladsl.BehaviorTestKit[T] "Permalink")  def apply\[T](initialBehavior: [Behavior](../../../typed/Behavior.html)\[T], name: String): [BehaviorTestKit](BehaviorTestKit.html)\[T]
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#apply[T](initialBehavior:akka.actor.typed.Behavior[T],name:String,config:com.typesafe.config.Config):akka.actor.testkit.typed.scaladsl.BehaviorTestKit[T] "Permalink")  def apply\[T](initialBehavior: [Behavior](../../../typed/Behavior.html)\[T], name: String, config: Config): [BehaviorTestKit](BehaviorTestKit.html)\[T]
8. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKitBase$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/Effects$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/FishingOutcomes$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/LogCapturing.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/LoggingTestKit$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ManualTime$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ManualTime.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ReplyInbox.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/SerializationTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/TestInbox$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/TestInbox.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/TestProbe$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/TestProbe.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/package$$TestDuration.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html](https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html)*