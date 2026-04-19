---
description: Akka 2.10.17 - akka.actor.testkit.typed.javadsl.ActorTestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:24:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/javadsl/ActorTestKit.html
title: Akka 2.10.17 - akka.actor.testkit.typed.javadsl.ActorTestKit
---

# Akka 2.10.17 - akka.actor.testkit.typed.javadsl.ActorTestKit

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.javadsl.ActorTestKit

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[testkit](../../index.html)
- [**](../../../../../akka/actor/testkit/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- ActorTestKit
- [BehaviorTestKit](BehaviorTestKit.html "Used for synchronous testing akka.actor.typed.Behaviors.")
- [Effects](Effects$.html "Factories for behavior effects for BehaviorTestKit, each effect has a suitable equals and can be used to compare actual effects to expected ones.")
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
[c](ActorTestKit$.html "See companion object")[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[javadsl](index.html)

# [ActorTestKit](ActorTestKit$.html "See companion object")[**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html "Permalink")

### Companion [object ActorTestKit](ActorTestKit$.html "See companion object")

#### final  class ActorTestKit extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Java API: Test kit for asynchronous testing of typed actors.
Provides a typed actor system started on creation, that can be used for multiple test cases and is
shut down when `shutdown` is called.

The actor system has a custom guardian that allows for spawning arbitrary actors using the `spawn` methods.

Designed to work with any test framework, but framework glue code that calls `shutdownTestKit` after all tests has
run needs to be provided by the user or with [TestKitJunitResource](TestKitJunitResource.html).

Use `TestKit.create` factories to construct manually or [TestKitJunitResource](TestKitJunitResource.html) to use together with JUnit tests

For synchronous testing of a `Behavior` see [BehaviorTestKit](BehaviorTestKit.html)

Source[ActorTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/javadsl/ActorTestKit.scala#L161)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
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

1. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorTestKit toany2stringadd\[ActorTestKit] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorTestKit, B)ImplicitThis member is added by an implicit conversion from ActorTestKit toArrowAssoc\[ActorTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#createDeadLetterProbe():akka.actor.testkit.typed.javadsl.TestProbe[akka.actor.DeadLetter] "Permalink")  def createDeadLetterProbe(): [TestProbe](TestProbe.html)\[[DeadLetter](../../../DeadLetter.html)]returnsA test probe that is subscribed to dead letters from the system event bus. Subscription
 will be completed and verified so any dead letter after it will be caught by the probe.
9. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#createDroppedMessageProbe():akka.actor.testkit.typed.javadsl.TestProbe[akka.actor.Dropped] "Permalink")  def createDroppedMessageProbe(): [TestProbe](TestProbe.html)\[[Dropped](../../../Dropped.html)]returnsA test probe that is subscribed to dropped letters from the system event bus. Subscription
 will be completed and verified so any dropped letter after it will be caught by the probe.
10. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#createTestProbe[M](name:String,clazz:Class[M]):akka.actor.testkit.typed.javadsl.TestProbe[M] "Permalink")  def createTestProbe\[M](name: String, clazz: Class\[M]): [TestProbe](TestProbe.html)\[M]Shortcut for creating a new named test probe for the testkit actor system

Shortcut for creating a new named test probe for the testkit actor system

Mthe type of messages the probe should accept
11. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#createTestProbe[M](name:String):akka.actor.testkit.typed.javadsl.TestProbe[M] "Permalink")  def createTestProbe\[M](name: String): [TestProbe](TestProbe.html)\[M]Shortcut for creating a new named test probe for the testkit actor system

Shortcut for creating a new named test probe for the testkit actor system

Mthe type of messages the probe should accept
12. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#createTestProbe[M](clazz:Class[M]):akka.actor.testkit.typed.javadsl.TestProbe[M] "Permalink")  def createTestProbe\[M](clazz: Class\[M]): [TestProbe](TestProbe.html)\[M]Shortcut for creating a new test probe for the testkit actor system

Shortcut for creating a new test probe for the testkit actor system

Mthe type of messages the probe should accept
13. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#createTestProbe[M]():akka.actor.testkit.typed.javadsl.TestProbe[M] "Permalink")  def createTestProbe\[M](): [TestProbe](TestProbe.html)\[M]Shortcut for creating a new test probe for the testkit actor system

Shortcut for creating a new test probe for the testkit actor system

Mthe type of messages the probe should accept
14. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#createUnhandledMessageProbe():akka.actor.testkit.typed.javadsl.TestProbe[akka.actor.UnhandledMessage] "Permalink")  def createUnhandledMessageProbe(): [TestProbe](TestProbe.html)\[[UnhandledMessage](../../../UnhandledMessage.html)]returnsA test probe that is subscribed to unhandled messages from the system event bus. Subscription
 will be completed and verified so any unhandled message after it will be caught by the probe.
15. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorTestKitImplicitThis member is added by an implicit conversion from ActorTestKit toEnsuring\[ActorTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorTestKitImplicitThis member is added by an implicit conversion from ActorTestKit toEnsuring\[ActorTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorTestKitImplicitThis member is added by an implicit conversion from ActorTestKit toEnsuring\[ActorTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorTestKitImplicitThis member is added by an implicit conversion from ActorTestKit toEnsuring\[ActorTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#scheduler:akka.actor.typed.Scheduler "Permalink")  def scheduler: [typed.Scheduler](../../../typed/Scheduler.html)The scheduler of the testkit actor system
28. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#serializationTestKit:akka.actor.testkit.typed.javadsl.SerializationTestKit "Permalink")  val serializationTestKit: [SerializationTestKit](SerializationTestKit.html)Additional testing utilities for serialization.
29. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#shutdownTestKit():Unit "Permalink")  def shutdownTestKit(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Terminate the actor system and the testkit
30. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#spawn[T](behavior:akka.actor.typed.Behavior[T],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], name: String, props: [typed.Props](../../../typed/Props.html)): [typed.ActorRef](../../../typed/ActorRef.html)\[T]Spawn a new named actor under the testkit user guardian with the given props and return the ActorRef
for the spawned actor, note that spawning actors with the same name in multiple test cases will cause failures.
31. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#spawn[T](behavior:akka.actor.typed.Behavior[T],props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], props: [typed.Props](../../../typed/Props.html)): [typed.ActorRef](../../../typed/ActorRef.html)\[T]Spawn a new auto\-named actor under the testkit user guardian with the given props
and return the ActorRef for the spawned actor
32. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#spawn[T](behavior:akka.actor.typed.Behavior[T],name:String):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], name: String): [typed.ActorRef](../../../typed/ActorRef.html)\[T]Spawn a new named actor under the testkit user guardian and return the ActorRef for the spawned actor,
note that spawning actors with the same name in multiple test cases will cause failures.
33. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#spawn[T](behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T]): [typed.ActorRef](../../../typed/ActorRef.html)\[T]Spawn a new auto\-named actor under the testkit user guardian and return the ActorRef for the spawned actor
34. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#stop[T](ref:akka.actor.typed.ActorRef[T],max:java.time.Duration):Unit "Permalink")  def stop\[T](ref: [typed.ActorRef](../../../typed/ActorRef.html)\[T], max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Stop the actor under test and wait `max` until it terminates.

Stop the actor under test and wait `max` until it terminates.
It can only be used for actors that were spawned by this `ActorTestKit`.
Other actors will not be stopped by this method.
35. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#stop[T](ref:akka.actor.typed.ActorRef[T]):Unit "Permalink")  def stop\[T](ref: [typed.ActorRef](../../../typed/ActorRef.html)\[T]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Stop the actor under test and wait until it terminates.

Stop the actor under test and wait until it terminates.
It can only be used for actors that were spawned by this `ActorTestKit`.
Other actors will not be stopped by this method.
36. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#system:akka.actor.typed.ActorSystem[Void] "Permalink")  def system: [typed.ActorSystem](../../../typed/ActorSystem.html)\[[Void](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Void.html#java.lang.Void)]The actor system running for this testkit.

The actor system running for this testkit. Interaction with the user guardian is done through methods on the testkit
which is why it is typed to `Void`.
38. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#testKitSettings:akka.actor.testkit.typed.TestKitSettings "Permalink")  def testKitSettings: [TestKitSettings](../TestKitSettings.html)
39. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#timeout:akka.util.Timeout "Permalink")  def timeout: [Timeout](../../../../util/Timeout.html)The default timeout as specified with the config/[akka.actor.testkit.typed.TestKitSettings](../TestKitSettings.html)
40. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
41. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
42. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
43. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorTestKit toStringFormat\[ActorTestKit] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorTestKit, B)ImplicitThis member is added by an implicit conversion from ActorTestKit toArrowAssoc\[ActorTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/ActorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/ActorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/BehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/Effects$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/FishingOutcomes$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/LogCapturing.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/LoggingTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/ManualTime$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/ManualTime.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/ReplyInbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/SerializationTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/StatusReplyInbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestInbox$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestInbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestProbe$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestProbe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/ActorTestKit.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/ActorTestKit.html)*