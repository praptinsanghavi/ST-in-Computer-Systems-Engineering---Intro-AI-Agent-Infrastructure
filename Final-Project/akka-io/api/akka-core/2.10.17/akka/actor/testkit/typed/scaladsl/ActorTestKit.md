---
description: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.ActorTestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:24:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
title: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.ActorTestKit
---

# Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.ActorTestKit

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.ActorTestKit

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[testkit](../../index.html)
- [**](../../../../../akka/actor/testkit/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- ActorTestKit
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
[c](ActorTestKit$.html "See companion object")[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [ActorTestKit](ActorTestKit$.html "See companion object")[**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html "Permalink")

### Companion [object ActorTestKit](ActorTestKit$.html "See companion object")

#### final  class ActorTestKit extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Testkit for asynchronous testing of typed actors, meant for mixing into the test class.

Provides a typed actor system started on creation, used for all test cases and shut down when `shutdown` is called.

The actor system has a custom guardian that allows for spawning arbitrary actors using the `spawn` methods.

Designed to work with any test framework, but framework glue code that calls shutdown after all tests has
run needs to be provided by the user.

For synchronous testing of a `Behavior` see [BehaviorTestKit](BehaviorTestKit.html)

Source[ActorTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/scaladsl/ActorTestKit.scala#L184)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorTestKit
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorTestKit toany2stringadd\[ActorTestKit] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorTestKit, B)ImplicitThis member is added by an implicit conversion from ActorTestKit toArrowAssoc\[ActorTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#config:com.typesafe.config.Config "Permalink")  val config: Config
9. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#createDeadLetterProbe():akka.actor.testkit.typed.scaladsl.TestProbe[akka.actor.DeadLetter] "Permalink")  def createDeadLetterProbe(): [TestProbe](TestProbe.html)\[[DeadLetter](../../../DeadLetter.html)]returnsA test probe that is subscribed to dead letters from the system event bus. Subscription
 will be completed and verified so any dead letter after it will be caught by the probe.
10. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#createDroppedMessageProbe():akka.actor.testkit.typed.scaladsl.TestProbe[akka.actor.Dropped] "Permalink")  def createDroppedMessageProbe(): [TestProbe](TestProbe.html)\[[Dropped](../../../Dropped.html)]returnsA test probe that is subscribed to dropped letters from the system event bus. Subscription
 will be completed and verified so any dropped letter after it will be caught by the probe.
11. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#createTestProbe[M](name:String):akka.actor.testkit.typed.scaladsl.TestProbe[M] "Permalink")  def createTestProbe\[M](name: String): [TestProbe](TestProbe.html)\[M]Shortcut for creating a new named test probe for the testkit actor system

Shortcut for creating a new named test probe for the testkit actor system

Mthe type of messages the probe should accept
12. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#createTestProbe[M]():akka.actor.testkit.typed.scaladsl.TestProbe[M] "Permalink")  def createTestProbe\[M](): [TestProbe](TestProbe.html)\[M]Shortcut for creating a new test probe for the testkit actor system

Shortcut for creating a new test probe for the testkit actor system

Mthe type of messages the probe should accept
13. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#createUnhandledMessageProbe():akka.actor.testkit.typed.scaladsl.TestProbe[akka.actor.UnhandledMessage] "Permalink")  def createUnhandledMessageProbe(): [TestProbe](TestProbe.html)\[[UnhandledMessage](../../../UnhandledMessage.html)]returnsA test probe that is subscribed to unhandled messages from the system event bus. Subscription
 will be completed and verified so any unhandled message after it will be caught by the probe.
14. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorTestKitImplicitThis member is added by an implicit conversion from ActorTestKit toEnsuring\[ActorTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorTestKitImplicitThis member is added by an implicit conversion from ActorTestKit toEnsuring\[ActorTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorTestKitImplicitThis member is added by an implicit conversion from ActorTestKit toEnsuring\[ActorTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorTestKitImplicitThis member is added by an implicit conversion from ActorTestKit toEnsuring\[ActorTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#internalSystem:akka.actor.typed.ActorSystem[_] "Permalink")  val internalSystem: [typed.ActorSystem](../../../typed/ActorSystem.html)\[\_]
23. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#name:String "Permalink")  val name: String
25. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#scheduler:akka.actor.typed.Scheduler "Permalink")  def scheduler: [typed.Scheduler](../../../typed/Scheduler.html)
29. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#serializationTestKit:akka.actor.testkit.typed.scaladsl.SerializationTestKit "Permalink")  val serializationTestKit: [SerializationTestKit](SerializationTestKit.html)Additional testing utilities for serialization.
30. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#shutdownTestKit():Unit "Permalink")  def shutdownTestKit(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
31. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#spawn[T](behavior:akka.actor.typed.Behavior[T],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], name: String, props: [typed.Props](../../../typed/Props.html)): [typed.ActorRef](../../../typed/ActorRef.html)\[T]Spawn the given behavior.

Spawn the given behavior. This is created as a child of the test kit
guardian
32. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#spawn[T](behavior:akka.actor.typed.Behavior[T],name:String):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], name: String): [typed.ActorRef](../../../typed/ActorRef.html)\[T]Spawn the given behavior.

Spawn the given behavior. This is created as a child of the test kit
guardian
33. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#spawn[T](behavior:akka.actor.typed.Behavior[T],props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], props: [typed.Props](../../../typed/Props.html)): [typed.ActorRef](../../../typed/ActorRef.html)\[T]Spawn the given behavior.

Spawn the given behavior. This is created as a child of the test kit
guardian
34. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#spawn[T](behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T]): [typed.ActorRef](../../../typed/ActorRef.html)\[T]Spawn the given behavior.

Spawn the given behavior. This is created as a child of the test kit
guardian
35. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#stop[T](ref:akka.actor.typed.ActorRef[T],max:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def stop\[T](ref: [typed.ActorRef](../../../typed/ActorRef.html)\[T], max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration) \= [timeout.duration](#timeout:akka.util.Timeout)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Stop the actor under test and wait until it terminates.

Stop the actor under test and wait until it terminates.
It can only be used for actors that were spawned by this `ActorTestKit`.
Other actors will not be stopped by this method.
36. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#system:akka.actor.typed.ActorSystem[Nothing] "Permalink") implicit  def system: [typed.ActorSystem](../../../typed/ActorSystem.html)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]INTERNAL API
38. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#testKitSettings:akka.actor.testkit.typed.TestKitSettings "Permalink") implicit  def testKitSettings: [TestKitSettings](../TestKitSettings.html)
39. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#timeout:akka.util.Timeout "Permalink") implicit  val timeout: [Timeout](../../../../util/Timeout.html)
40. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
41. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
42. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
43. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorTestKit toStringFormat\[ActorTestKit] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorTestKit, B)ImplicitThis member is added by an implicit conversion from ActorTestKit toArrowAssoc\[ActorTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromActorTestKit to any2stringadd\[ActorTestKit]

### Inherited by implicit conversion StringFormat fromActorTestKit to StringFormat\[ActorTestKit]

### Inherited by implicit conversion Ensuring fromActorTestKit to Ensuring\[ActorTestKit]

### Inherited by implicit conversion ArrowAssoc fromActorTestKit to ArrowAssoc\[ActorTestKit]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/DeadLetter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Dropped.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ActorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ActorTestKitBase$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/Effects$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/FishingOutcomes$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/LogCapturing.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/LoggingTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ManualTime$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ManualTime.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ReplyInbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/SerializationTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestInbox$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestInbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestProbe$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestProbe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/package$$TestDuration.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ActorTestKit.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ActorTestKit.html)*