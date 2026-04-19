---
description: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.BehaviorTestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
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
- BehaviorTestKit
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
[t](BehaviorTestKit$.html "See companion object")[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [BehaviorTestKit](BehaviorTestKit$.html "See companion object")[**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html "Permalink")

### Companion [object BehaviorTestKit](BehaviorTestKit$.html "See companion object")

#### trait BehaviorTestKit\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Used for synchronous testing [akka.actor.typed.Behavior](../../../typed/Behavior.html)s. Stores all effects e.g. Spawning of children,
watching and offers access to what effects have taken place.

For asynchronous testing of `Behavior`s running see [ActorTestKit](ActorTestKit.html)

Not for user extension. See `BehaviorTestKit.apply` factory methods

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() @[ApiMayChange](../../../../annotation/ApiMayChange.html)() Source[BehaviorTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.scala#L49)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BehaviorTestKit
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
### Abstract Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#childInbox[U](child:akka.actor.typed.ActorRef[U]):akka.actor.testkit.typed.scaladsl.TestInbox[U] "Permalink") abstract  def childInbox\[U](child: [typed.ActorRef](../../../typed/ActorRef.html)\[U]): [TestInbox](TestInbox.html)\[U]Get the child inbox for the child ActorRef, or fail if there is no such child.
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#childInbox[U](name:String):akka.actor.testkit.typed.scaladsl.TestInbox[U] "Permalink") abstract  def childInbox\[U](name: String): [TestInbox](TestInbox.html)\[U]Get the child inbox for the child with the given name, or fail if there is no child with the given name
spawned
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#childTestKit[U](child:akka.actor.typed.ActorRef[U]):akka.actor.testkit.typed.scaladsl.BehaviorTestKit[U] "Permalink") abstract  def childTestKit\[U](child: [typed.ActorRef](../../../typed/ActorRef.html)\[U]): BehaviorTestKit\[U]Get the [akka.actor.typed.Behavior](../../../typed/Behavior.html) testkit for the given child [akka.actor.typed.ActorRef](../../../typed/ActorRef.html).
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#clearLog():Unit "Permalink") abstract  def clearLog(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clear the log entries
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#currentBehavior:akka.actor.typed.Behavior[T] "Permalink") abstract  def currentBehavior: [Behavior](../../../typed/Behavior.html)\[T]The current behavior, can change any time `run` is called
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#expectEffect(expectedEffect:akka.actor.testkit.typed.Effect):Unit "Permalink") abstract  def expectEffect(expectedEffect: [Effect](../Effect.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Asserts that the oldest effect is the expectedEffect.

Asserts that the oldest effect is the expectedEffect. Removing it from
further assertions.
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#expectEffectPF[R](f:PartialFunction[akka.actor.testkit.typed.Effect,R]):R "Permalink") abstract  def expectEffectPF\[R](f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Effect](../Effect.html), R]): RAsserts that the oldest effect matches the given partial function.
8. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#expectEffectType[E<:akka.actor.testkit.typed.Effect](implicitclassTag:scala.reflect.ClassTag[E]):E "Permalink") abstract  def expectEffectType\[E \<: [Effect](../Effect.html)](implicit classTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[E]): EAsserts that the oldest effect is of type T.

Asserts that the oldest effect is of type T. Consumes and returns the concrete effect for
further direct assertions.
9. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#hasEffects():Boolean "Permalink") abstract  def hasEffects(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if there have been any effects.
10. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#isAlive:Boolean "Permalink") abstract  def isAlive: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is the current behavior alive or stopped
11. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#logEntries():Seq[akka.actor.testkit.typed.CapturedLogEvent] "Permalink") abstract  def logEntries(): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[CapturedLogEvent](../CapturedLogEvent.html)]Returns all the [CapturedLogEvent](../CapturedLogEvent.html) issued by this behavior(s)
12. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#receptionistInbox():akka.actor.testkit.typed.scaladsl.TestInbox[akka.actor.typed.receptionist.Receptionist.Command] "Permalink") abstract  def receptionistInbox(): [TestInbox](TestInbox.html)\[[Command](../../../typed/receptionist/Receptionist$$Command.html)]The receptionist inbox contains messages sent to `system.receptionist`
13. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#retrieveAllEffects():Seq[akka.actor.testkit.typed.Effect] "Permalink") abstract  def retrieveAllEffects(): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Effect](../Effect.html)]Requests all the effects.

Requests all the effects. The effects are consumed, subsequent calls will only
see new effects.
14. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#retrieveEffect():akka.actor.testkit.typed.Effect "Permalink") abstract  def retrieveEffect(): [Effect](../Effect.html)Requests the oldest [Effect](../Effect.html) or [akka.actor.testkit.typed.Effect.NoEffects](../Effect$$NoEffects.html) if no effects
have taken place.

Requests the oldest [Effect](../Effect.html) or [akka.actor.testkit.typed.Effect.NoEffects](../Effect$$NoEffects.html) if no effects
have taken place. The effect is consumed, subsequent calls won't
will not include this effect.
15. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#returnedBehavior:akka.actor.typed.Behavior[T] "Permalink") abstract  def returnedBehavior: [Behavior](../../../typed/Behavior.html)\[T]Returns the current behavior as it was returned from processing the previous message.

Returns the current behavior as it was returned from processing the previous message.
For example if Behaviors.unhandled is returned it will be kept here, but not in
[currentBehavior](#currentBehavior:akka.actor.typed.Behavior[T]).
16. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#run(message:T):Unit "Permalink") abstract  def run(message: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send the message to the behavior and record any [Effect](../Effect.html)s
17. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#runAsk[Res](f:akka.actor.typed.ActorRef[Res]=>T):akka.actor.testkit.typed.scaladsl.ReplyInbox[Res] "Permalink") abstract  def runAsk\[Res](f: ([typed.ActorRef](../../../typed/ActorRef.html)\[Res]) \=\> T): [ReplyInbox](ReplyInbox.html)\[Res]Constructs a message using the provided function to inject a single\-use "reply to" [akka.actor.typed.ActorRef](../../../typed/ActorRef.html),
and sends the constructed message to the behavior, recording any [Effect](../Effect.html)s.

Constructs a message using the provided function to inject a single\-use "reply to" [akka.actor.typed.ActorRef](../../../typed/ActorRef.html),
and sends the constructed message to the behavior, recording any [Effect](../Effect.html)s.

The returned [ReplyInbox](ReplyInbox.html) allows the message sent to the "reply to" `ActorRef` to be asserted on.
18. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#runAskWithStatus[Res](f:akka.actor.typed.ActorRef[akka.pattern.StatusReply[Res]]=>T):akka.actor.testkit.typed.scaladsl.StatusReplyInbox[Res] "Permalink") abstract  def runAskWithStatus\[Res](f: ([typed.ActorRef](../../../typed/ActorRef.html)\[[StatusReply](../../../../pattern/StatusReply.html)\[Res]]) \=\> T): [StatusReplyInbox](StatusReplyInbox.html)\[Res]The same as [runAsk](#runAsk[Res](f:akka.actor.typed.ActorRef[Res]=>T):akka.actor.testkit.typed.scaladsl.ReplyInbox[Res]) but only for requests that result in a response of type [akka.pattern.StatusReply](../../../../pattern/StatusReply.html).
19. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#runOne():Unit "Permalink") abstract  def runOne(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send the first message in the selfInbox to the behavior and run it, recording [Effect](../Effect.html)s.
20. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#selfInbox():akka.actor.testkit.typed.scaladsl.TestInbox[T] "Permalink") abstract  def selfInbox(): [TestInbox](TestInbox.html)\[T]The self inbox contains messages the behavior sent to `context.self`
21. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#signal(signal:akka.actor.typed.Signal):Unit "Permalink") abstract  def signal(signal: [Signal](../../../typed/Signal.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send the signal to the behavior and record any [Effect](../Effect.html)s
### Concrete Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from BehaviorTestKit\[T] toany2stringadd\[BehaviorTestKit\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (BehaviorTestKit\[T], B)ImplicitThis member is added by an implicit conversion from BehaviorTestKit\[T] toArrowAssoc\[BehaviorTestKit\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (BehaviorTestKit\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BehaviorTestKit\[T]ImplicitThis member is added by an implicit conversion from BehaviorTestKit\[T] toEnsuring\[BehaviorTestKit\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (BehaviorTestKit\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BehaviorTestKit\[T]ImplicitThis member is added by an implicit conversion from BehaviorTestKit\[T] toEnsuring\[BehaviorTestKit\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BehaviorTestKit\[T]ImplicitThis member is added by an implicit conversion from BehaviorTestKit\[T] toEnsuring\[BehaviorTestKit\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BehaviorTestKit\[T]ImplicitThis member is added by an implicit conversion from BehaviorTestKit\[T] toEnsuring\[BehaviorTestKit\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#ref:akka.actor.typed.ActorRef[T] "Permalink")  def ref: [typed.ActorRef](../../../typed/ActorRef.html)\[T]The self reference of the actor living inside this testkit.
21. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from BehaviorTestKit\[T] toStringFormat\[BehaviorTestKit\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (BehaviorTestKit\[T], B)ImplicitThis member is added by an implicit conversion from BehaviorTestKit\[T] toArrowAssoc\[BehaviorTestKit\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBehaviorTestKit\[T] to any2stringadd\[BehaviorTestKit\[T]]

### Inherited by implicit conversion StringFormat fromBehaviorTestKit\[T] to StringFormat\[BehaviorTestKit\[T]]

### Inherited by implicit conversion Ensuring fromBehaviorTestKit\[T] to Ensuring\[BehaviorTestKit\[T]]

### Inherited by implicit conversion ArrowAssoc fromBehaviorTestKit\[T] to ArrowAssoc\[BehaviorTestKit\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/CapturedLogEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect$$NoEffects.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/Effect.html
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html)*