---
description: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.TestProbe
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:52:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/scaladsl/TestProbe.html
title: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.TestProbe
---

# Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.TestProbe

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.TestProbe

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
- TestProbe
[t](TestProbe$.html "See companion object")[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [TestProbe](TestProbe$.html "See companion object")[**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html "Permalink")

### Companion [object TestProbe](TestProbe$.html "See companion object")

#### trait TestProbe\[M] extends [RecipientRef](../../../typed/RecipientRef.html)\[M]

Create instances through the factories in the TestProbe companion.

A test probe is essentially a queryable mailbox which can be used in place of an actor and the received
messages can then be asserted

Not for user extension

Self TypeTestProbe\[M] with InternalRecipientRef\[M]Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() Source[TestProbe.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/scaladsl/TestProbe.scala#L61)Linear Supertypes[RecipientRef](../../../typed/RecipientRef.html)\[M], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestProbe
2. RecipientRef
3. AnyRef
4. Any
Implicitly  
1. by RecipientRefOps
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#awaitAssert[A](a:=>A):A "Permalink") abstract  def awaitAssert\[A](a: \=\> A): AEvaluate the given assert every 100 ms until it does not throw an exception and return the
result.

Evaluate the given assert every 100 ms until it does not throw an exception and return the
result.

If the default timeout expires the last exception is thrown.
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#awaitAssert[A](a:=>A,max:scala.concurrent.duration.FiniteDuration):A "Permalink") abstract  def awaitAssert\[A](a: \=\> A, max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): AEvaluate the given assert every 100 ms until it does not throw an exception and return the
result.

Evaluate the given assert every 100 ms until it does not throw an exception and return the
result.

If the `max` timeout expires the last exception is thrown.
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#awaitAssert[A](a:=>A,max:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration):A "Permalink") abstract  def awaitAssert\[A](a: \=\> A, max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): AEvaluate the given assert every `interval` until it does not throw an exception and return the
result.

Evaluate the given assert every `interval` until it does not throw an exception and return the
result.

If the `max` timeout expires the last exception is thrown.

Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#expectMessage[T<:M](max:scala.concurrent.duration.FiniteDuration,hint:String,obj:T):T "Permalink") abstract  def expectMessage\[T \<: M](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), hint: String, obj: T): TReceive one message from the test actor and assert that it equals the
given object.

Receive one message from the test actor and assert that it equals the
given object. Wait time is bounded by the given duration, with an
AssertionError being thrown in case of timeout.

returnsthe received object
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#expectMessage[T<:M](max:scala.concurrent.duration.FiniteDuration,obj:T):T "Permalink") abstract  def expectMessage\[T \<: M](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: T): TReceive one message from the test actor and assert that it equals the
given object.

Receive one message from the test actor and assert that it equals the
given object. Wait time is bounded by the given duration, with an
AssertionError being thrown in case of timeout.

returnsthe received object
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#expectMessage[T<:M](obj:T):T "Permalink") abstract  def expectMessage\[T \<: M](obj: T): TSame as `expectMessage(remainingOrDefault, obj)`, but using the default timeout as deadline.
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#expectMessageType[T<:M](max:scala.concurrent.duration.FiniteDuration)(implicitt:scala.reflect.ClassTag[T]):T "Permalink") abstract  def expectMessageType\[T \<: M](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): TExpect a message of type T to arrive within `max` or fail.

Expect a message of type T to arrive within `max` or fail. `max` is dilated.
8. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#expectMessageType[T<:M](implicitt:scala.reflect.ClassTag[T]):T "Permalink") abstract  def expectMessageType\[T \<: M](implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): TSame as `expectMessageType[T](remainingOrDefault)`, but using the default timeout as deadline.
9. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#expectNoMessage():Unit "Permalink") abstract  def expectNoMessage(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that no message is received.

Assert that no message is received. Waits for the default period configured as `akka.actor.testkit.typed.expect-no-message-default`.
That timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
10. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#expectNoMessage(max:scala.concurrent.duration.FiniteDuration):Unit "Permalink") abstract  def expectNoMessage(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that no message is received for the specified time.

Assert that no message is received for the specified time.
Supplied value is not dilated.
11. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#expectTerminated[U](actorRef:akka.actor.typed.ActorRef[U]):Unit "Permalink") abstract  def expectTerminated\[U](actorRef: [typed.ActorRef](../../../typed/ActorRef.html)\[U]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Expect the given actor to be stopped or stop within the default timeout.
12. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#expectTerminated[U](actorRef:akka.actor.typed.ActorRef[U],max:scala.concurrent.duration.FiniteDuration):Unit "Permalink") abstract  def expectTerminated\[U](actorRef: [typed.ActorRef](../../../typed/ActorRef.html)\[U], max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Expect the given actor to be stopped or stop within the given timeout or
throw an AssertionError.
13. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#fishForMessage(max:scala.concurrent.duration.FiniteDuration)(fisher:M=>akka.actor.testkit.typed.FishingOutcome):Seq[M] "Permalink") abstract  def fishForMessage(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(fisher: (M) \=\> [FishingOutcome](../FishingOutcome.html)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[M]Same as the other `fishForMessage` but with no hint
14. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#fishForMessage(max:scala.concurrent.duration.FiniteDuration,hint:String)(fisher:M=>akka.actor.testkit.typed.FishingOutcome):Seq[M] "Permalink") abstract  def fishForMessage(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), hint: String)(fisher: (M) \=\> [FishingOutcome](../FishingOutcome.html)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[M]Allows for flexible matching of multiple messages within a timeout, the fisher function is fed each incoming
message, and returns one of the following effects to decide on what happens next:

Allows for flexible matching of multiple messages within a timeout, the fisher function is fed each incoming
message, and returns one of the following effects to decide on what happens next:

 \* [FishingOutcomes.continue](FishingOutcomes$.html#continue:akka.actor.testkit.typed.FishingOutcome) \- continue with the next message given that the timeout has not been reached
 \* [FishingOutcomes.continueAndIgnore](FishingOutcomes$.html#continueAndIgnore:akka.actor.testkit.typed.FishingOutcome) \- continue and do not save the message in the returned list
 \* [FishingOutcomes.complete](FishingOutcomes$.html#complete:akka.actor.testkit.typed.FishingOutcome) \- successfully complete and return the message
 \* [FishingOutcomes.fail](FishingOutcomes$.html#fail(message:String):akka.actor.testkit.typed.FishingOutcome) \- fail the test with a custom message

Additionally failures includes the list of messages consumed.
If the `fisher` function throws a match error the error
is decorated with some fishing details and the test is failed (making it convenient to use this method with a
partial function).

maxMax total time without the fisher function returning `CompleteFishing` before failing.
 The timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".

returnsThe messages accepted in the order they arrived
15. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#fishForMessagePF(max:scala.concurrent.duration.FiniteDuration)(fisher:PartialFunction[M,akka.actor.testkit.typed.FishingOutcome]):Seq[M] "Permalink") abstract  def fishForMessagePF(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(fisher: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[M, [FishingOutcome](../FishingOutcome.html)]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[M]Same as `fishForMessage` but with no hint, accepting a partial function and failing for non\-matches
16. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#fishForMessagePF(max:scala.concurrent.duration.FiniteDuration,hint:String)(fisher:PartialFunction[M,akka.actor.testkit.typed.FishingOutcome]):Seq[M] "Permalink") abstract  def fishForMessagePF(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), hint: String)(fisher: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[M, [FishingOutcome](../FishingOutcome.html)]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[M]Same as `fishForMessage` but accepting a partial function and failing for non\-matches
17. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#receiveMessage(max:scala.concurrent.duration.FiniteDuration):M "Permalink") abstract  def receiveMessage(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): MReceive one message of type `M`.

Receive one message of type `M`. Wait time is bounded by the `max` duration,
with an AssertionError raised in case of timeout.
18. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#receiveMessage():M "Permalink") abstract  def receiveMessage(): MReceive one message of type `M` within the default timeout as deadline.
19. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#receiveMessages(n:Int,max:scala.concurrent.duration.FiniteDuration):Seq[M] "Permalink") abstract  def receiveMessages(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[M]Receive `n` messages in a row before the given deadline.

Receive `n` messages in a row before the given deadline.

Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
20. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#receiveMessages(n:Int):Seq[M] "Permalink") abstract  def receiveMessages(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[M]Same as `receiveMessages(n, remaining)` but using the default timeout as deadline.
21. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#ref:akka.actor.typed.ActorRef[M] "Permalink") abstract  def ref: [typed.ActorRef](../../../typed/ActorRef.html)\[M]ActorRef for this TestProbe
22. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#remaining:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def remaining: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain time remaining for execution of the innermost enclosing `within`
block or throw an AssertionError if no `within` block surrounds this
call.
23. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#remainingOr(duration:scala.concurrent.duration.FiniteDuration):scala.concurrent.duration.FiniteDuration "Permalink") abstract  def remainingOr(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the given duration.
24. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#remainingOrDefault:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def remainingOrDefault: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the properly dilated default for this
case from settings (key "akka.actor.testkit.typed.single\-expect\-default").
25. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#settings:akka.actor.testkit.typed.TestKitSettings "Permalink") implicit abstract  def settings: [TestKitSettings](../TestKitSettings.html)Attributesprotected
26. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#stop():Unit "Permalink") abstract  def stop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Stops the [TestProbe.ref](#ref:akka.actor.typed.ActorRef[M]), which is useful when testing watch and termination.
27. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#tell(msg:T):Unit "Permalink") abstract  def tell(msg: M): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

Definition Classes[RecipientRef](../../../typed/RecipientRef.html)
28. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#within[T](max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink") abstract  def within\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TSame as calling `within(0 seconds, max)(f)`.
29. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#within[T](min:scala.concurrent.duration.FiniteDuration,max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink") abstract  def within\[T](min: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TExecute code block while bounding its execution time between `min` and
`max`.

Execute code block while bounding its execution time between `min` and
`max`. `within` blocks may be nested. All methods in this trait which
take maximum wait times are available in a version which implicitly uses
the remaining time governed by the innermost enclosing `within` block.

Note that the max timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor",
while the min Duration is not.

```
val ret = within(50 millis) {
  test ! Ping
  expectMessageType[Pong]
}
```
### Concrete Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#!(msg:T):Unit "Permalink")  def !(msg: M): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

ImplicitThis member is added by an implicit conversion from TestProbe\[M] to[RecipientRefOps](../../../typed/RecipientRef$$RecipientRefOps.html)\[M] performed by method RecipientRefOps in [akka.actor.typed.RecipientRef](../../../typed/RecipientRef$.html).Definition Classes[RecipientRefOps](../../../typed/RecipientRef$$RecipientRefOps.html)
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TestProbe\[M] toany2stringadd\[TestProbe\[M]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TestProbe\[M], B)ImplicitThis member is added by an implicit conversion from TestProbe\[M] toArrowAssoc\[TestProbe\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TestProbe\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestProbe\[M]ImplicitThis member is added by an implicit conversion from TestProbe\[M] toEnsuring\[TestProbe\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TestProbe\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestProbe\[M]ImplicitThis member is added by an implicit conversion from TestProbe\[M] toEnsuring\[TestProbe\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestProbe\[M]ImplicitThis member is added by an implicit conversion from TestProbe\[M] toEnsuring\[TestProbe\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestProbe\[M]ImplicitThis member is added by an implicit conversion from TestProbe\[M] toEnsuring\[TestProbe\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#ref:akka.actor.typed.RecipientRef[T] "Permalink")  val ref: [RecipientRef](../../../typed/RecipientRef.html)\[M]ImplicitThis member is added by an implicit conversion from TestProbe\[M] to[RecipientRefOps](../../../typed/RecipientRef$$RecipientRefOps.html)\[M] performed by method RecipientRefOps in [akka.actor.typed.RecipientRef](../../../typed/RecipientRef$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(testProbe: RecipientRefOps[M]).ref
```
Definition Classes[RecipientRefOps](../../../typed/RecipientRef$$RecipientRefOps.html)
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TestProbe\[M] toStringFormat\[TestProbe\[M]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TestProbe\[M], B)ImplicitThis member is added by an implicit conversion from TestProbe\[M] toArrowAssoc\[TestProbe\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RecipientRef](../../../typed/RecipientRef.html)\[M]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion RecipientRefOps fromTestProbe\[M] to [RecipientRefOps](../../../typed/RecipientRef$$RecipientRefOps.html)\[M]

### Inherited by implicit conversion any2stringadd fromTestProbe\[M] to any2stringadd\[TestProbe\[M]]

### Inherited by implicit conversion StringFormat fromTestProbe\[M] to StringFormat\[TestProbe\[M]]

### Inherited by implicit conversion Ensuring fromTestProbe\[M] to Ensuring\[TestProbe\[M]]

### Inherited by implicit conversion ArrowAssoc fromTestProbe\[M] to ArrowAssoc\[TestProbe\[M]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome.html
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/RecipientRef$$RecipientRefOps.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/RecipientRef$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestProbe.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestProbe.html)*