---
description: Akka 2.10.17 - akka.actor.testkit.typed.javadsl.TestProbe
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:53:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/javadsl/TestProbe.html
title: Akka 2.10.17 - akka.actor.testkit.typed.javadsl.TestProbe
---

# Akka 2.10.17 - akka.actor.testkit.typed.javadsl.TestProbe

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.javadsl.TestProbe

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
- TestProbe
[c](TestProbe$.html "See companion object")[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[javadsl](index.html)

# [TestProbe](TestProbe$.html "See companion object")[**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html "Permalink")

### Companion [object TestProbe](TestProbe$.html "See companion object")

#### abstract  class TestProbe\[M] extends [RecipientRef](../../../typed/RecipientRef.html)\[M]

Java API: \* Create instances through the `create` factories in the TestProbe companion
or via [ActorTestKit\#createTestProbe](ActorTestKit.html#createTestProbe[M](name:String,clazz:Class[M]):akka.actor.testkit.typed.javadsl.TestProbe[M]).

A test probe is essentially a queryable mailbox which can be used in place of an actor and the received
messages can then be asserted etc.

Not for user extension

Self TypeTestProbe\[M] with InternalRecipientRef\[M]Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() Source[TestProbe.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/javadsl/TestProbe.scala#L71)Linear Supertypes[RecipientRef](../../../typed/RecipientRef.html)\[M], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
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
### Instance Constructors

1. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#<init>():akka.actor.testkit.typed.javadsl.TestProbe[M] "Permalink")  new TestProbe()
### Abstract Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#awaitAssert[A](creator:akka.japi.function.Creator[A]):A "Permalink") abstract  def awaitAssert\[A](creator: [Creator](../../../../japi/function/Creator.html)\[A]): AEvaluate the given assert every 100 milliseconds until it does not throw an exception and return the
result.

Evaluate the given assert every 100 milliseconds until it does not throw an exception and return the
result. A max time is taken it from the innermost enclosing `within` block.
2. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#awaitAssert[A](max:java.time.Duration,creator:akka.japi.function.Creator[A]):A "Permalink") abstract  def awaitAssert\[A](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), creator: [Creator](../../../../japi/function/Creator.html)\[A]): AEvaluate the given assert every 100 milliseconds until it does not throw an exception and return the
result.

Evaluate the given assert every 100 milliseconds until it does not throw an exception and return the
result.

If the `max` timeout expires the last exception is thrown.

Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
3. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#awaitAssert[A](max:java.time.Duration,interval:java.time.Duration,creator:akka.japi.function.Creator[A]):A "Permalink") abstract  def awaitAssert\[A](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), creator: [Creator](../../../../japi/function/Creator.html)\[A]): AEvaluate the given assert every `interval` until it does not throw an exception and return the
result.

Evaluate the given assert every `interval` until it does not throw an exception and return the
result.

If the `max` timeout expires the last exception is thrown.

Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
4. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#expectMessage[T<:M](max:java.time.Duration,hint:String,obj:T):T "Permalink") abstract  def expectMessage\[T \<: M](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), hint: String, obj: T): TReceive one message from the test actor and assert that it equals the
given object.

Receive one message from the test actor and assert that it equals the
given object. Wait time is bounded by the given duration, with an
AssertionError being thrown in case of timeout.

returnsthe received object
5. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#expectMessage[T<:M](max:java.time.Duration,obj:T):T "Permalink") abstract  def expectMessage\[T \<: M](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), obj: T): TReceive one message from the test actor and assert that it equals the
given object.

Receive one message from the test actor and assert that it equals the
given object. Wait time is bounded by the given duration, with an
AssertionError being thrown in case of timeout.

returnsthe received object
6. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#expectMessage[T<:M](obj:T):T "Permalink") abstract  def expectMessage\[T \<: M](obj: T): TSame as `expectMessage(remainingOrDefault, obj)`, but using the
default timeout as deadline.
7. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#expectMessageClass[T<:M](clazz:Class[T],max:java.time.Duration):T "Permalink") abstract  def expectMessageClass\[T \<: M](clazz: Class\[T], max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): TWait for a message of type M and return it when it arrives, or fail if the `max` timeout is hit.

Wait for a message of type M and return it when it arrives, or fail if the `max` timeout is hit.

Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
8. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#expectMessageClass[T<:M](clazz:Class[T]):T "Permalink") abstract  def expectMessageClass\[T \<: M](clazz: Class\[T]): TSame as `expectMessageType(clazz, remainingOrDefault)`,but using the
default timeout as deadline.
9. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#expectNoMessage():Unit "Permalink") abstract  def expectNoMessage(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that no message is received.

Assert that no message is received. Waits for the default period configured as `akka.actor.testkit.typed.expect-no-message-default`.
That timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
10. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#expectNoMessage(max:java.time.Duration):Unit "Permalink") abstract  def expectNoMessage(max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that no message is received for the specified time.

Assert that no message is received for the specified time.
Supplied value is not dilated.
11. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#expectTerminated[U](actorRef:akka.actor.typed.ActorRef[U]):Unit "Permalink") abstract  def expectTerminated\[U](actorRef: [typed.ActorRef](../../../typed/ActorRef.html)\[U]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Expect the given actor to be stopped or stop within the default timeout.
12. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#expectTerminated[U](actorRef:akka.actor.typed.ActorRef[U],max:java.time.Duration):Unit "Permalink") abstract  def expectTerminated\[U](actorRef: [typed.ActorRef](../../../typed/ActorRef.html)\[U], max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Expect the given actor to be stopped or stop within the given timeout or
throw an AssertionError.

Expect the given actor to be stopped or stop within the given timeout or
throw an AssertionError.

Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
13. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#fishForMessage(max:java.time.Duration,hint:String,fisher:java.util.function.Function[M,akka.actor.testkit.typed.FishingOutcome]):java.util.List[M] "Permalink") abstract  def fishForMessage(max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), hint: String, fisher: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[M, [FishingOutcome](../FishingOutcome.html)]): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[M]Same as the other `fishForMessage` but includes the provided hint in all error messages
14. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#fishForMessage(max:java.time.Duration,fisher:java.util.function.Function[M,akka.actor.testkit.typed.FishingOutcome]):java.util.List[M] "Permalink") abstract  def fishForMessage(max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), fisher: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[M, [FishingOutcome](../FishingOutcome.html)]): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[M]Java API: Allows for flexible matching of multiple messages within a timeout, the fisher function is fed each incoming
message, and returns one of the following effects to decide on what happens next:

Java API: Allows for flexible matching of multiple messages within a timeout, the fisher function is fed each incoming
message, and returns one of the following effects to decide on what happens next:

 \* [FishingOutcomes.continueAndCollect](FishingOutcomes$.html#continueAndCollect():akka.actor.testkit.typed.FishingOutcome) \- continue with the next message given that the timeout has not been reached
 \* [FishingOutcomes.complete](FishingOutcomes$.html#complete():akka.actor.testkit.typed.FishingOutcome) \- successfully complete and return the message
 \* [FishingOutcomes.fail](FishingOutcomes$.html#fail(error:String):akka.actor.testkit.typed.FishingOutcome) \- fail the test with a custom message

Additionally failures includes the list of messages consumed. If a message of type `M` but not of type `T` is
received this will also fail the test, additionally if the `fisher` function throws a match error the error
is decorated with some fishing details and the test is failed (making it convenient to use this method with a
partial function).

maxMax total time without the fisher function returning `CompleteFishing` before failing.
 The timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".

returnsThe messages accepted in the order they arrived
15. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#getRemaining:java.time.Duration "Permalink") abstract  def getRemaining: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Obtain time remaining for execution of the innermost enclosing `within`
block or throw an AssertionError if no `within` block surrounds this
call.
16. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#getRemainingOr(duration:java.time.Duration):java.time.Duration "Permalink") abstract  def getRemainingOr(duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the given duration.
17. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#getRemainingOrDefault:java.time.Duration "Permalink") abstract  def getRemainingOrDefault: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the properly dilated default for this
case from settings (key "akka.actor.testkit.typed.single\-expect\-default").
18. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#receiveMessage(max:java.time.Duration):M "Permalink") abstract  def receiveMessage(max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): MReceive one message of type `M`.

Receive one message of type `M`. Wait time is bounded by the `max` duration,
with an AssertionError raised in case of timeout.
19. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#receiveMessage():M "Permalink") abstract  def receiveMessage(): MReceive one message of type `M` within the default timeout as deadline.
20. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#receiveSeveralMessages(n:Int,max:java.time.Duration):java.util.List[M] "Permalink") abstract  def receiveSeveralMessages(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[M]Receive `n` messages in a row before the given deadline.

Receive `n` messages in a row before the given deadline.

Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
21. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#receiveSeveralMessages(n:Int):java.util.List[M] "Permalink") abstract  def receiveSeveralMessages(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[M]Same as `receiveSeveralMessages(n, remaining)` but using the default timeout as deadline.
22. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#ref:akka.actor.typed.ActorRef[M] "Permalink") abstract  def ref: [typed.ActorRef](../../../typed/ActorRef.html)\[M]ActorRef for this TestProbe
23. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#settings:akka.actor.testkit.typed.TestKitSettings "Permalink") implicit abstract  def settings: [TestKitSettings](../TestKitSettings.html)Attributesprotected
24. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#stop():Unit "Permalink") abstract  def stop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Stops the [TestProbe.getRef](#getRef():akka.actor.typed.ActorRef[M]), which is useful when testing watch and termination.
25. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#tell(msg:T):Unit "Permalink") abstract  def tell(msg: M): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

Definition Classes[RecipientRef](../../../typed/RecipientRef.html)
26. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#within[T](max:java.time.Duration)(f:java.util.function.Supplier[T]):T "Permalink") abstract  def within\[T](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration))(f: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[T]): TSame as calling `within(0 seconds, max)(f)`.
27. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#within[T](min:java.time.Duration,max:java.time.Duration)(f:java.util.function.Supplier[T]):T "Permalink") abstract  def within\[T](min: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration))(f: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[T]): TExecute code block while bounding its execution time between `min` and
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

1. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#!(msg:T):Unit "Permalink")  def !(msg: M): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

ImplicitThis member is added by an implicit conversion from TestProbe\[M] to[RecipientRefOps](../../../typed/RecipientRef$$RecipientRefOps.html)\[M] performed by method RecipientRefOps in [akka.actor.typed.RecipientRef](../../../typed/RecipientRef$.html).Definition Classes[RecipientRefOps](../../../typed/RecipientRef$$RecipientRefOps.html)
2. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TestProbe\[M] toany2stringadd\[TestProbe\[M]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
5. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TestProbe\[M], B)ImplicitThis member is added by an implicit conversion from TestProbe\[M] toArrowAssoc\[TestProbe\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TestProbe\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestProbe\[M]ImplicitThis member is added by an implicit conversion from TestProbe\[M] toEnsuring\[TestProbe\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TestProbe\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestProbe\[M]ImplicitThis member is added by an implicit conversion from TestProbe\[M] toEnsuring\[TestProbe\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestProbe\[M]ImplicitThis member is added by an implicit conversion from TestProbe\[M] toEnsuring\[TestProbe\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestProbe\[M]ImplicitThis member is added by an implicit conversion from TestProbe\[M] toEnsuring\[TestProbe\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#getRef():akka.actor.typed.ActorRef[M] "Permalink")  def getRef(): [typed.ActorRef](../../../typed/ActorRef.html)\[M]ActorRef for this TestProbe
17. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#ref:akka.actor.typed.RecipientRef[T] "Permalink")  val ref: [RecipientRef](../../../typed/RecipientRef.html)\[M]ImplicitThis member is added by an implicit conversion from TestProbe\[M] to[RecipientRefOps](../../../typed/RecipientRef$$RecipientRefOps.html)\[M] performed by method RecipientRefOps in [akka.actor.typed.RecipientRef](../../../typed/RecipientRef$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(testProbe: RecipientRefOps[M]).ref
```
Definition Classes[RecipientRefOps](../../../typed/RecipientRef$$RecipientRefOps.html)
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TestProbe\[M] toStringFormat\[TestProbe\[M]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TestProbe\[M], B)ImplicitThis member is added by an implicit conversion from TestProbe\[M] toArrowAssoc\[TestProbe\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
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

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/FishingOutcome.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/ActorTestKit$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/ActorTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/BehaviorTestKit$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/Effects$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/FishingOutcomes$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/LogCapturing.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/ManualTime$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/ManualTime.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/ReplyInbox.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/SerializationTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/StatusReplyInbox.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/TestInbox$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/TestInbox.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/TestProbe$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/TestProbe.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/RecipientRef$$RecipientRefOps.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/RecipientRef$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Creator.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/TestProbe.html](https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/TestProbe.html)*