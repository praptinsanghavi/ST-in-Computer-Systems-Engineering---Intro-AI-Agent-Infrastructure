---
description: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.ActorTestKitBase
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:49:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html
title: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.ActorTestKitBase
---

# Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.ActorTestKitBase

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.ActorTestKitBase

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[testkit](../../index.html)
- [**](../../../../../akka/actor/testkit/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [ActorTestKit](ActorTestKit.html "Testkit for asynchronous testing of typed actors, meant for mixing into the test class.")
- ActorTestKitBase
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
[c](ActorTestKitBase$.html "See companion object")[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [ActorTestKitBase](ActorTestKitBase$.html "See companion object")[**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html "Permalink")

### Companion [object ActorTestKitBase](ActorTestKitBase$.html "See companion object")

#### abstract  class ActorTestKitBase extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A base class for the [ActorTestKit](ActorTestKit.html), making it possible to have testing framework (e.g. ScalaTest)
manage the lifecycle of the testkit.

An implementation for ScalaTest is [ScalaTestWithActorTestKit](ScalaTestWithActorTestKit.html).

Another abstract class that is testing framework specific should extend this class and
automatically shut down the `testKit` when the test completes or fails by implementing [ActorTestKitBase\#afterAll](#afterAll():Unit).

Source[ActorTestKitBase.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.scala#L34)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ScalaTestWithActorTestKit](ScalaTestWithActorTestKit.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorTestKitBase
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
### Instance Constructors

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#<init>(config:com.typesafe.config.Config,settings:akka.actor.testkit.typed.TestKitSettings):akka.actor.testkit.typed.scaladsl.ActorTestKitBase "Permalink")  new ActorTestKitBase(config: Config, settings: [TestKitSettings](../TestKitSettings.html))Use a custom config for the actor system, and a custom [akka.actor.testkit.typed.TestKitSettings](../TestKitSettings.html).
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#<init>(config:com.typesafe.config.Config):akka.actor.testkit.typed.scaladsl.ActorTestKitBase "Permalink")  new ActorTestKitBase(config: Config)Use a custom config for the actor system.
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#<init>(config:String):akka.actor.testkit.typed.scaladsl.ActorTestKitBase "Permalink")  new ActorTestKitBase(config: String)Use a custom config for the actor system.
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#<init>():akka.actor.testkit.typed.scaladsl.ActorTestKitBase "Permalink")  new ActorTestKitBase()
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#<init>(testKit:akka.actor.testkit.typed.scaladsl.ActorTestKit):akka.actor.testkit.typed.scaladsl.ActorTestKitBase "Permalink")  new ActorTestKitBase(testKit: [ActorTestKit](ActorTestKit.html))
### Abstract Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#afterAll():Unit "Permalink") abstract  def afterAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)To be implemented by "more" concrete class that can mixin `BeforeAndAfterAll` or similar,
for example `FlatSpecLike with BeforeAndAfterAll`.

To be implemented by "more" concrete class that can mixin `BeforeAndAfterAll` or similar,
for example `FlatSpecLike with BeforeAndAfterAll`. Implement by calling
`testKit.shutdownTestKit()`.

Attributesprotected
### Concrete Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorTestKitBase toany2stringadd\[ActorTestKitBase] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorTestKitBase, B)ImplicitThis member is added by an implicit conversion from ActorTestKitBase toArrowAssoc\[ActorTestKitBase] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#createDeadLetterProbe():akka.actor.testkit.typed.scaladsl.TestProbe[akka.actor.DeadLetter] "Permalink")  def createDeadLetterProbe(): [TestProbe](TestProbe.html)\[[DeadLetter](../../../DeadLetter.html)]See corresponding method on [ActorTestKit](ActorTestKit.html)
9. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#createDroppedMessageProbe():akka.actor.testkit.typed.scaladsl.TestProbe[akka.actor.Dropped] "Permalink")  def createDroppedMessageProbe(): [TestProbe](TestProbe.html)\[[Dropped](../../../Dropped.html)]See corresponding method on [ActorTestKit](ActorTestKit.html)
10. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#createTestProbe[M](name:String):akka.actor.testkit.typed.scaladsl.TestProbe[M] "Permalink")  def createTestProbe\[M](name: String): [TestProbe](TestProbe.html)\[M]See corresponding method on [ActorTestKit](ActorTestKit.html)
11. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#createTestProbe[M]():akka.actor.testkit.typed.scaladsl.TestProbe[M] "Permalink")  def createTestProbe\[M](): [TestProbe](TestProbe.html)\[M]See corresponding method on [ActorTestKit](ActorTestKit.html)
12. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#createUnhandledMessageProbe():akka.actor.testkit.typed.scaladsl.TestProbe[akka.actor.UnhandledMessage] "Permalink")  def createUnhandledMessageProbe(): [TestProbe](TestProbe.html)\[[UnhandledMessage](../../../UnhandledMessage.html)]See corresponding method on [ActorTestKit](ActorTestKit.html)
13. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorTestKitBase) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorTestKitBaseImplicitThis member is added by an implicit conversion from ActorTestKitBase toEnsuring\[ActorTestKitBase] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorTestKitBase) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorTestKitBaseImplicitThis member is added by an implicit conversion from ActorTestKitBase toEnsuring\[ActorTestKitBase] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorTestKitBaseImplicitThis member is added by an implicit conversion from ActorTestKitBase toEnsuring\[ActorTestKitBase] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorTestKitBaseImplicitThis member is added by an implicit conversion from ActorTestKitBase toEnsuring\[ActorTestKitBase] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#serializationTestKit:akka.actor.testkit.typed.scaladsl.SerializationTestKit "Permalink")  def serializationTestKit: [SerializationTestKit](SerializationTestKit.html)Additional testing utilities for serialization.
26. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#spawn[T](behavior:akka.actor.typed.Behavior[T],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], name: String, props: [typed.Props](../../../typed/Props.html)): [typed.ActorRef](../../../typed/ActorRef.html)\[T]See corresponding method on [ActorTestKit](ActorTestKit.html)
27. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#spawn[T](behavior:akka.actor.typed.Behavior[T],props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], props: [typed.Props](../../../typed/Props.html)): [typed.ActorRef](../../../typed/ActorRef.html)\[T]See corresponding method on [ActorTestKit](ActorTestKit.html)
28. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#spawn[T](behavior:akka.actor.typed.Behavior[T],name:String):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], name: String): [typed.ActorRef](../../../typed/ActorRef.html)\[T]See corresponding method on [ActorTestKit](ActorTestKit.html)
29. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#spawn[T](behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T]): [typed.ActorRef](../../../typed/ActorRef.html)\[T]See corresponding method on [ActorTestKit](ActorTestKit.html)
30. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#system:akka.actor.typed.ActorSystem[Nothing] "Permalink") implicit  def system: [typed.ActorSystem](../../../typed/ActorSystem.html)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]See corresponding method on [ActorTestKit](ActorTestKit.html)
32. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#testKit:akka.actor.testkit.typed.scaladsl.ActorTestKit "Permalink")  val testKit: [ActorTestKit](ActorTestKit.html)
33. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#testKitSettings:akka.actor.testkit.typed.TestKitSettings "Permalink") implicit  def testKitSettings: [TestKitSettings](../TestKitSettings.html)See corresponding method on [ActorTestKit](ActorTestKit.html)
34. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#timeout:akka.util.Timeout "Permalink") implicit  def timeout: [Timeout](../../../../util/Timeout.html)See corresponding method on [ActorTestKit](ActorTestKit.html)
35. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
36. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
38. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorTestKitBase toStringFormat\[ActorTestKitBase] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorTestKitBase, B)ImplicitThis member is added by an implicit conversion from ActorTestKitBase toArrowAssoc\[ActorTestKitBase] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromActorTestKitBase to any2stringadd\[ActorTestKitBase]

### Inherited by implicit conversion StringFormat fromActorTestKitBase to StringFormat\[ActorTestKitBase]

### Inherited by implicit conversion Ensuring fromActorTestKitBase to Ensuring\[ActorTestKitBase]

### Inherited by implicit conversion ArrowAssoc fromActorTestKitBase to ArrowAssoc\[ActorTestKitBase]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/DeadLetter.html
- https://doc.akka.io/api/akka/current/akka/actor/Dropped.html
- https://doc.akka.io/api/akka/current/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/TestKitSettings.html
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
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/util/Timeout.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html](https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html)*