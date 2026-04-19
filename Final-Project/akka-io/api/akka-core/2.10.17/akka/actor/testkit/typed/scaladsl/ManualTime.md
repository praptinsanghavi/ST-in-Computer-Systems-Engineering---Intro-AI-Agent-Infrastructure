---
description: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.ManualTime
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:25:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/scaladsl/ManualTime.html
title: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.ManualTime
---

# Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.ManualTime

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.ManualTime

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
- ManualTime
- [ReplyInbox](ReplyInbox.html "Similar to an akka.actor.testkit.typed.scaladsl.TestInbox, but can only ever give access to a single message (a reply).")
- [ScalaTestWithActorTestKit](ScalaTestWithActorTestKit.html "A ScalaTest base class for the ActorTestKit, making it possible to have ScalaTest manage the lifecycle of the testkit.")
- [SerializationTestKit](SerializationTestKit.html "Utilities to test serialization.")
- [StatusReplyInbox](StatusReplyInbox.html "A akka.actor.testkit.typed.scaladsl.ReplyInbox which specially handles akka.pattern.StatusReply.")
- [TestDuration](package$$TestDuration.html "Scala API.")
- [TestInbox](TestInbox.html "Utility for use as an ActorRef when *synchronously* testing akka.actor.typed.Behavior with akka.actor.testkit.typed.scaladsl.BehaviorTestKit.")
- [TestProbe](TestProbe.html "Create instances through the factories in the TestProbe companion.")
[c](ManualTime$.html "See companion object")[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [ManualTime](ManualTime$.html "See companion object")[**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html "Permalink")

### Companion [object ManualTime](ManualTime$.html "See companion object")

#### final  class ManualTime extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Not for user instantiation, see [ManualTime\#apply](ManualTime$.html#apply()(implicitsystem:akka.actor.typed.ActorSystem[_]):akka.actor.testkit.typed.scaladsl.ManualTime)

Source[ManualTime.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/scaladsl/ManualTime.scala#L53)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ManualTime
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

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#<init>(delegate:akka.testkit.ExplicitlyTriggeredScheduler):akka.actor.testkit.typed.scaladsl.ManualTime "Permalink")  new ManualTime(delegate: [ExplicitlyTriggeredScheduler](../../../../testkit/ExplicitlyTriggeredScheduler.html))
### Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ManualTime toany2stringadd\[ManualTime] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ManualTime, B)ImplicitThis member is added by an implicit conversion from ManualTime toArrowAssoc\[ManualTime] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ManualTime) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ManualTimeImplicitThis member is added by an implicit conversion from ManualTime toEnsuring\[ManualTime] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ManualTime) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ManualTimeImplicitThis member is added by an implicit conversion from ManualTime toEnsuring\[ManualTime] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ManualTimeImplicitThis member is added by an implicit conversion from ManualTime toEnsuring\[ManualTime] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ManualTimeImplicitThis member is added by an implicit conversion from ManualTime toEnsuring\[ManualTime] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#expectNoMessageFor(duration:scala.concurrent.duration.FiniteDuration,on:akka.actor.testkit.typed.scaladsl.TestProbe[_]*):Unit "Permalink")  def expectNoMessageFor(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), on: [TestProbe](TestProbe.html)\[\_]\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Annotations@varargs()
15. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#timePasses(amount:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def timePasses(amount: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning.

Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning.

We will not add a dilation factor to this amount, since the scheduler API also does not apply dilation.
If you want the amount of time passed to be dilated, apply the dilation before passing the delay to
this method.
23. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ManualTime toStringFormat\[ManualTime] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ManualTime, B)ImplicitThis member is added by an implicit conversion from ManualTime toArrowAssoc\[ManualTime] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromManualTime to any2stringadd\[ManualTime]

### Inherited by implicit conversion StringFormat fromManualTime to StringFormat\[ManualTime]

### Inherited by implicit conversion Ensuring fromManualTime to Ensuring\[ManualTime]

### Inherited by implicit conversion ArrowAssoc fromManualTime to ArrowAssoc\[ManualTime]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/index.html
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/ExplicitlyTriggeredScheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ManualTime.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ManualTime.html)*