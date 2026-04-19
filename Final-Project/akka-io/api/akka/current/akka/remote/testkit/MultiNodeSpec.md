---
description: Akka 2.10.17 - akka.remote.testkit.MultiNodeSpec
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:36:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testkit/MultiNodeSpec.html
title: Akka 2.10.17 - akka.remote.testkit.MultiNodeSpec
---

# Akka 2.10.17 - akka.remote.testkit.MultiNodeSpec

> **Summary:** Akka 2.10.17 - akka.remote.testkit.MultiNodeSpec

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[remote](../index.html)
- [Blackhole](Blackhole$.html)
- [Direction](Direction.html)
- [ForceDisassociate](ForceDisassociate.html "Management Command to force disassociation of an address.")
- [ForceDisassociateAck](ForceDisassociateAck$.html)
- [MultiNodeConfig](MultiNodeConfig.html "Configure the role names and participants of the test, including configuration settings.")
- MultiNodeSpec
- [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html "Use this to hook MultiNodeSpec into your test framework lifecycle, either by having your test extend MultiNodeSpec and call these methods or by creating a trait that calls them and then mixing that trait with your test together with MultiNodeSpec.")
- [SetThrottle](SetThrottle.html)
- [SetThrottleAck](SetThrottleAck$.html)
- [ThrottleMode](ThrottleMode.html)
- [TokenBucket](TokenBucket.html)
- [Unthrottled](Unthrottled$.html)
[c](MultiNodeSpec$.html "See companion object")[akka](../../index.html).[remote](../index.html).[testkit](index.html)

# [MultiNodeSpec](MultiNodeSpec$.html "See companion object")[**](../../../akka/remote/testkit/MultiNodeSpec.html "Permalink")

### Companion [object MultiNodeSpec](MultiNodeSpec$.html "See companion object")

#### abstract  class MultiNodeSpec extends [TestKit](../../testkit/TestKit.html) with [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html)

Note: To be able to run tests with everything ignored or excluded by tags
you must not use `testconductor`, or helper methods that use `testconductor`,
from the constructor of your test class. Otherwise the controller node might
be shutdown before other nodes have completed and you will see errors like:
`AskTimeoutException: sending to terminated ref breaks promises`. Using lazy
val is fine.

Source[MultiNodeSpec.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-multi-node-testkit/src/main/scala/akka/remote/testkit/MultiNodeSpec.scala#L299)Linear Supertypes[MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html), [TestKit](../../testkit/TestKit.html), [TestKitBase](../../testkit/TestKitBase.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MultiNodeSpec
2. MultiNodeSpecCallbacks
3. TestKit
4. TestKitBase
5. AnyRef
6. Any
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

1. [**](../../../akka/remote/testkit/MultiNodeSpec.html#<init>(config:akka.remote.testkit.MultiNodeConfig):akka.remote.testkit.MultiNodeSpec "Permalink")  new MultiNodeSpec(config: [MultiNodeConfig](MultiNodeConfig.html))
2. [**](../../../akka/remote/testkit/MultiNodeSpec.html#<init>(config:akka.remote.testkit.MultiNodeConfig,actorSystemCreator:com.typesafe.config.Config=>akka.actor.ActorSystem):akka.remote.testkit.MultiNodeSpec "Permalink")  new MultiNodeSpec(config: [MultiNodeConfig](MultiNodeConfig.html), actorSystemCreator: (Config) \=\> [ActorSystem](../../actor/ActorSystem.html))Constructor for using arbitrary logic to create the actor system used in
the multi node spec (the `Config` passed to the creator must be used in
the created actor system for the multi node tests to work)
3. [**](../../../akka/remote/testkit/MultiNodeSpec.html#<init>(myself:akka.remote.testconductor.RoleName,_system:akka.actor.ActorSystem,_roles:Seq[akka.remote.testconductor.RoleName],deployments:akka.remote.testconductor.RoleName=>Seq[String]):akka.remote.testkit.MultiNodeSpec "Permalink")  new MultiNodeSpec(myself: [RoleName](../testconductor/RoleName.html), \_system: [ActorSystem](../../actor/ActorSystem.html), \_roles: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[RoleName](../testconductor/RoleName.html)], deployments: ([RoleName](../testconductor/RoleName.html)) \=\> Seq\[String])
### Type Members

1. [**](../../../akka/remote/testkit/MultiNodeSpec$AwaitHelper.html "Permalink")  class [AwaitHelper](MultiNodeSpec$AwaitHelper.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Abstract Value Members

1. [**](../../../akka/remote/testkit/MultiNodeSpec.html#initialParticipants:Int "Permalink") abstract  def initialParticipants: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)TO BE DEFINED BY USER: Defines the number of participants required for starting the test.

TO BE DEFINED BY USER: Defines the number of participants required for starting the test. This
might not be equals to the number of nodes available to the test.

Must be a `def`:

```
def initialParticipants = 5
```
### Concrete Value Members

1. [**](../../../akka/remote/testkit/MultiNodeSpec.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testkit/MultiNodeSpec.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testkit/MultiNodeSpec.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MultiNodeSpec toany2stringadd\[MultiNodeSpec] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/testkit/MultiNodeSpec.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MultiNodeSpec, B)ImplicitThis member is added by an implicit conversion from MultiNodeSpec toArrowAssoc\[MultiNodeSpec] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/testkit/MultiNodeSpec.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/testkit/MultiNodeSpec.html#afterTermination():Unit "Permalink")  def afterTermination(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Override this method to do something when the whole test is terminating.

Override this method to do something when the whole test is terminating.

Attributesprotected
7. [**](../../../akka/remote/testkit/MultiNodeSpec.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/remote/testkit/MultiNodeSpec.html#assertForDuration[A](a:=>A,max:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.Duration):A "Permalink")  def assertForDuration\[A](a: \=\> A, max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 100\.millis): AEvaluate the given assert every `interval` until exception is thrown or `max` timeout is expired.

Evaluate the given assert every `interval` until exception is thrown or `max` timeout is expired.

Returns the result of last evaluation of the assertion.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
9. [**](../../../akka/remote/testkit/MultiNodeSpec.html#atStartup():Unit "Permalink")  def atStartup(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Override this method to do something when the whole test is starting up.

Override this method to do something when the whole test is starting up.

Attributesprotected
10. [**](../../../akka/remote/testkit/MultiNodeSpec.html#attachConductor(tc:akka.remote.testconductor.TestConductorExt):Unit "Permalink")  def attachConductor(tc: [TestConductorExt](../testconductor/TestConductorExt.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected
11. [**](../../../akka/remote/testkit/MultiNodeSpec.html#awaitAssert[A](a:=>A,max:scala.concurrent.duration.Duration,interval:scala.concurrent.duration.Duration):A "Permalink")  def awaitAssert\[A](a: \=\> A, max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, interval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 100\.millis): AEvaluate the given assert every `interval` until it does not throw an exception and return the
result.

Evaluate the given assert every `interval` until it does not throw an exception and return the
result.

If the `max` timeout expires the last exception is thrown.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
12. [**](../../../akka/remote/testkit/MultiNodeSpec.html#awaitCond(p:=>Boolean,max:scala.concurrent.duration.Duration,interval:scala.concurrent.duration.Duration,message:String):Unit "Permalink")  def awaitCond(p: \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, interval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 100\.millis, message: String \= ""): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
13. [**](../../../akka/remote/testkit/MultiNodeSpec.html#awaitHelper[T](w:scala.concurrent.Awaitable[T]):MultiNodeSpec.this.AwaitHelper[T] "Permalink") implicit  def awaitHelper\[T](w: [Awaitable](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Awaitable.html#scala.concurrent.Awaitable)\[T]): [AwaitHelper](MultiNodeSpec$AwaitHelper.html)\[T]Enrich `.await()` onto all Awaitables, using remaining duration from the innermost
enclosing `within` block or QueryTimeout.
14. [**](../../../akka/remote/testkit/MultiNodeSpec.html#childActorOf(props:akka.actor.Props):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../../actor/Props.html)): [ActorRef](../../actor/ActorRef.html)Spawns an actor as a child of this test actor with an auto\-generated name and stopping supervisor strategy, returning the child's ActorRef.

Spawns an actor as a child of this test actor with an auto\-generated name and stopping supervisor strategy, returning the child's ActorRef.

propsProps to create the child actor

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
15. [**](../../../akka/remote/testkit/MultiNodeSpec.html#childActorOf(props:akka.actor.Props,name:String):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../../actor/Props.html), name: String): [ActorRef](../../actor/ActorRef.html)Spawns an actor as a child of this test actor with a stopping supervisor strategy, and returns the child's ActorRef.

Spawns an actor as a child of this test actor with a stopping supervisor strategy, and returns the child's ActorRef.

propsProps to create the child actor

nameActor name for the child actor

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
16. [**](../../../akka/remote/testkit/MultiNodeSpec.html#childActorOf(props:akka.actor.Props,supervisorStrategy:akka.actor.SupervisorStrategy):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../../actor/Props.html), supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)): [ActorRef](../../actor/ActorRef.html)Spawns an actor as a child of this test actor with an auto\-generated name, and returns the child's ActorRef.

Spawns an actor as a child of this test actor with an auto\-generated name, and returns the child's ActorRef.

propsProps to create the child actor

supervisorStrategyStrategy should decide what to do with failures in the actor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
17. [**](../../../akka/remote/testkit/MultiNodeSpec.html#childActorOf(props:akka.actor.Props,name:String,supervisorStrategy:akka.actor.SupervisorStrategy):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../../actor/Props.html), name: String, supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)): [ActorRef](../../actor/ActorRef.html)Spawns an actor as a child of this test actor, and returns the child's ActorRef.

Spawns an actor as a child of this test actor, and returns the child's ActorRef.

propsProps to create the child actor

nameActor name for the child actor

supervisorStrategyStrategy should decide what to do with failures in the actor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
18. [**](../../../akka/remote/testkit/MultiNodeSpec.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/remote/testkit/MultiNodeSpec.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MultiNodeSpec) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MultiNodeSpecImplicitThis member is added by an implicit conversion from MultiNodeSpec toEnsuring\[MultiNodeSpec] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../akka/remote/testkit/MultiNodeSpec.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MultiNodeSpec) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MultiNodeSpecImplicitThis member is added by an implicit conversion from MultiNodeSpec toEnsuring\[MultiNodeSpec] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../akka/remote/testkit/MultiNodeSpec.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MultiNodeSpecImplicitThis member is added by an implicit conversion from MultiNodeSpec toEnsuring\[MultiNodeSpec] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../../akka/remote/testkit/MultiNodeSpec.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MultiNodeSpecImplicitThis member is added by an implicit conversion from MultiNodeSpec toEnsuring\[MultiNodeSpec] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../../akka/remote/testkit/MultiNodeSpec.html#enterBarrier(max:scala.concurrent.duration.FiniteDuration,name:String*):Unit "Permalink")  def enterBarrier(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), name: String\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Enter the named barriers in the order given.

Enter the named barriers in the order given. Use the remaining duration from
the innermost enclosing `within` block or the passed `max` timeout.

Note that the `max` timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".
24. [**](../../../akka/remote/testkit/MultiNodeSpec.html#enterBarrier(name:String*):Unit "Permalink")  def enterBarrier(name: String\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Enter the named barriers in the order given.

Enter the named barriers in the order given. Use the remaining duration from
the innermost enclosing `within` block or the default `BarrierTimeout`.
25. [**](../../../akka/remote/testkit/MultiNodeSpec.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../akka/remote/testkit/MultiNodeSpec.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
27. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsg[T](max:scala.concurrent.duration.FiniteDuration,hint:String,obj:T):T "Permalink")  def expectMsg\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), hint: String, obj: T): TReceive one message from the test actor and assert that it equals the
given object.

Receive one message from the test actor and assert that it equals the
given object. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
28. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsg[T](max:scala.concurrent.duration.FiniteDuration,obj:T):T "Permalink")  def expectMsg\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: T): TReceive one message from the test actor and assert that it equals the
given object.

Receive one message from the test actor and assert that it equals the
given object. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
29. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsg[T](obj:T):T "Permalink")  def expectMsg\[T](obj: T): TSame as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor.

Same as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
30. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgAllClassOf[T](max:scala.concurrent.duration.FiniteDuration,obj:Class[_<:T]*):Seq[T] "Permalink")  def expectMsgAllClassOf\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: Class\[\_ \<: T]\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive a number of messages from the test actor matching the given
number of classes and assert that for each given class one is received
which is of that class (equality, not conformance).

Receive a number of messages from the test actor matching the given
number of classes and assert that for each given class one is received
which is of that class (equality, not conformance). This construct is
useful when the order in which the objects are received is not fixed.
Wait time is bounded by the given duration, with an AssertionFailure
being thrown in case of timeout.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
31. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgAllClassOf[T](obj:Class[_<:T]*):Seq[T] "Permalink")  def expectMsgAllClassOf\[T](obj: Class\[\_ \<: T]\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Same as `expectMsgAllClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAllClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
32. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgAllConformingOf[T](max:scala.concurrent.duration.FiniteDuration,obj:Class[_<:T]*):Seq[T] "Permalink")  def expectMsgAllConformingOf\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: Class\[\_ \<: T]\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive a number of messages from the test actor matching the given
number of classes and assert that for each given class one is received
which conforms to that class (and vice versa).

Receive a number of messages from the test actor matching the given
number of classes and assert that for each given class one is received
which conforms to that class (and vice versa). This construct is useful
when the order in which the objects are received is not fixed. Wait time
is bounded by the given duration, with an AssertionFailure being thrown in
case of timeout.

Beware that one object may satisfy all given class constraints, which
may be counter\-intuitive.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
33. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgAllConformingOf[T](obj:Class[_<:T]*):Seq[T] "Permalink")  def expectMsgAllConformingOf\[T](obj: Class\[\_ \<: T]\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Same as `expectMsgAllConformingOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAllConformingOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
34. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgAllOf[T](max:scala.concurrent.duration.FiniteDuration,obj:T*):Seq[T] "Permalink")  def expectMsgAllOf\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: T\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive a number of messages from the test actor matching the given
number of objects and assert that for each given object one is received
which equals it and vice versa.

Receive a number of messages from the test actor matching the given
number of objects and assert that for each given object one is received
which equals it and vice versa. This construct is useful when the order in
which the objects are received is not fixed. Wait time is bounded by the
given duration, with an AssertionFailure being thrown in case of timeout.

```

  dispatcher ! SomeWork1()
  dispatcher ! SomeWork2()
  expectMsgAllOf(1 second, Result1(), Result2())

```

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
35. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgAllOf[T](obj:T*):Seq[T] "Permalink")  def expectMsgAllOf\[T](obj: T\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
36. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgAnyClassOf[C](max:scala.concurrent.duration.FiniteDuration,obj:Class[_<:C]*):C "Permalink")  def expectMsgAnyClassOf\[C](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: Class\[\_ \<: C]\*): CReceive one message from the test actor and assert that it conforms to
one of the given classes.

Receive one message from the test actor and assert that it conforms to
one of the given classes. Wait time is bounded by the given duration,
with an AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
37. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgAnyClassOf[C](obj:Class[_<:C]*):C "Permalink")  def expectMsgAnyClassOf\[C](obj: Class\[\_ \<: C]\*): CSame as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
38. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgAnyOf[T](max:scala.concurrent.duration.FiniteDuration,obj:T*):T "Permalink")  def expectMsgAnyOf\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: T\*): TReceive one message from the test actor and assert that it equals one of
the given objects.

Receive one message from the test actor and assert that it equals one of
the given objects. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
39. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgAnyOf[T](obj:T*):T "Permalink")  def expectMsgAnyOf\[T](obj: T\*): TSame as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
40. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgClass[C](max:scala.concurrent.duration.FiniteDuration,c:Class[C]):C "Permalink")  def expectMsgClass\[C](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), c: Class\[C]): CReceive one message from the test actor and assert that it conforms to
the given class.

Receive one message from the test actor and assert that it conforms to
the given class. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
41. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgClass[C](c:Class[C]):C "Permalink")  def expectMsgClass\[C](c: Class\[C]): CSame as `expectMsgClass(remainingOrDefault, c)`, but correctly treating the timeFactor.

Same as `expectMsgClass(remainingOrDefault, c)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
42. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgPF[T](max:scala.concurrent.duration.Duration,hint:String)(f:PartialFunction[Any,T]):T "Permalink")  def expectMsgPF\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, hint: String \= "")(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TReceive one message from the test actor and assert that the given
partial function accepts it.

Receive one message from the test actor and assert that the given
partial function accepts it. Wait time is bounded by the given duration,
with an AssertionFailure being thrown in case of timeout.

Use this variant to implement more complicated or conditional
processing.

returnsthe received object as transformed by the partial function

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
43. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgType[T](max:scala.concurrent.duration.FiniteDuration)(implicitt:scala.reflect.ClassTag[T]):T "Permalink")  def expectMsgType\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): TReceive one message from the test actor and assert that it conforms to the
given type (after erasure).

Receive one message from the test actor and assert that it conforms to the
given type (after erasure). Wait time is bounded by the given duration,
with an AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
44. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectMsgType[T](implicitt:scala.reflect.ClassTag[T]):T "Permalink")  def expectMsgType\[T](implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): TSame as `expectMsgType[T](remainingOrDefault)`, but correctly treating the timeFactor.

Same as `expectMsgType[T](remainingOrDefault)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
45. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectNoMessage():Unit "Permalink")  def expectNoMessage(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that no message is received.

Assert that no message is received. Waits for the default period configured as
`akka.test.expect-no-message-default`.
That timeout is scaled using the configuration entry "akka.test.timefactor".

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
46. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectNoMessage(max:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def expectNoMessage(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that no message is received for the specified time.

Assert that no message is received for the specified time.
Supplied value is not dilated.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
47. [**](../../../akka/remote/testkit/MultiNodeSpec.html#expectTerminated(target:akka.actor.ActorRef,max:scala.concurrent.duration.Duration):akka.actor.Terminated "Permalink")  def expectTerminated(target: [ActorRef](../../actor/ActorRef.html), max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined): [Terminated](../../actor/Terminated.html)Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.

Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.
Before calling this method, you have to `watch` the target actor ref.
Wait time is bounded by the given duration, with an AssertionFailure being thrown in case of timeout.

targetthe actor ref expected to be Terminated

maxwait no more than max time, otherwise throw AssertionFailure

returnsthe received Terminated message

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
48. [**](../../../akka/remote/testkit/MultiNodeSpec.html#fishForMessage(max:scala.concurrent.duration.Duration,hint:String)(f:PartialFunction[Any,Boolean]):Any "Permalink")  def fishForMessage(max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, hint: String \= "")(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Hybrid of expectMsgPF and receiveWhile: receive messages while the
partial function matches and returns false.

Hybrid of expectMsgPF and receiveWhile: receive messages while the
partial function matches and returns false. Use it to ignore certain
messages while waiting for a specific message.

returnsthe last received message, i.e. the first one for which the
 partial function returned true

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
49. [**](../../../akka/remote/testkit/MultiNodeSpec.html#fishForSpecificMessage[T](max:scala.concurrent.duration.Duration,hint:String)(f:PartialFunction[Any,T]):T "Permalink")  def fishForSpecificMessage\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, hint: String \= "")(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TWaits for specific message that partial function matches while ignoring all other messages coming in the meantime.

Waits for specific message that partial function matches while ignoring all other messages coming in the meantime.
Use it to ignore any number of messages while waiting for a specific one.

returnsresult of applying partial function to the last received message,
 i.e. the first one for which the partial function is defined

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
50. [**](../../../akka/remote/testkit/MultiNodeSpec.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
51. [**](../../../akka/remote/testkit/MultiNodeSpec.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
52. [**](../../../akka/remote/testkit/MultiNodeSpec.html#ignoreMsg(f:PartialFunction[Any,Boolean]):Unit "Permalink")  def ignoreMsg(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Ignore all messages in the test actor for which the given partial
function returns true.

Ignore all messages in the test actor for which the given partial
function returns true.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
53. [**](../../../akka/remote/testkit/MultiNodeSpec.html#ignoreNoMsg():Unit "Permalink")  def ignoreNoMsg(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Stop ignoring messages in the test actor.

Stop ignoring messages in the test actor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
54. [**](../../../akka/remote/testkit/MultiNodeSpec.html#injectDeployments(sys:akka.actor.ActorSystem,role:akka.remote.testconductor.RoleName):Unit "Permalink")  def injectDeployments(sys: [ActorSystem](../../actor/ActorSystem.html), role: [RoleName](../testconductor/RoleName.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected
55. [**](../../../akka/remote/testkit/MultiNodeSpec.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
56. [**](../../../akka/remote/testkit/MultiNodeSpec.html#isNode(nodes:akka.remote.testconductor.RoleName*):Boolean "Permalink")  def isNode(nodes: [RoleName](../testconductor/RoleName.html)\*): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Verify that the running node matches one of the given nodes
57. [**](../../../akka/remote/testkit/MultiNodeSpec.html#lastSender:akka.actor.ActorRef "Permalink")  def lastSender: [ActorRef](../../actor/ActorRef.html)Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
58. [**](../../../akka/remote/testkit/MultiNodeSpec.html#log:akka.event.LoggingAdapter "Permalink")  val log: [LoggingAdapter](../../event/LoggingAdapter.html)
59. [**](../../../akka/remote/testkit/MultiNodeSpec.html#msgAvailable:Boolean "Permalink")  def msgAvailable: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Query queue status.

Query queue status.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
60. [**](../../../akka/remote/testkit/MultiNodeSpec.html#multiNodeSpecAfterAll():Unit "Permalink") final  def multiNodeSpecAfterAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Call this after the all test cases have run.

Call this after the all test cases have run. NOT after every test case.

Definition ClassesMultiNodeSpec → [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html)
61. [**](../../../akka/remote/testkit/MultiNodeSpec.html#multiNodeSpecBeforeAll():Unit "Permalink") final  def multiNodeSpecBeforeAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Call this before the start of the test run.

Call this before the start of the test run. NOT before every test case.

Definition ClassesMultiNodeSpec → [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html)
62. [**](../../../akka/remote/testkit/MultiNodeSpec.html#muteDeadLetters(messageClasses:Class[_]*)(sys:akka.actor.ActorSystem):Unit "Permalink")  def muteDeadLetters(messageClasses: Class\[\_]\*)(sys: [ActorSystem](../../actor/ActorSystem.html) \= [system](../../testkit/TestKit.html#system:akka.actor.ActorSystem)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
63. [**](../../../akka/remote/testkit/MultiNodeSpec.html#myAddress:akka.actor.Address "Permalink")  val myAddress: [Address](../../actor/Address.html)Attributesprotected
64. [**](../../../akka/remote/testkit/MultiNodeSpec.html#myself:akka.remote.testconductor.RoleName "Permalink")  val myself: [RoleName](../testconductor/RoleName.html)
65. [**](../../../akka/remote/testkit/MultiNodeSpec.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
66. [**](../../../akka/remote/testkit/MultiNodeSpec.html#node(role:akka.remote.testconductor.RoleName):akka.actor.ActorPath "Permalink")  def node(role: [RoleName](../testconductor/RoleName.html)): [ActorPath](../../actor/ActorPath.html)Query the controller for the transport address of the given node (by role name) and
return that as an ActorPath for easy composition:

Query the controller for the transport address of the given node (by role name) and
return that as an ActorPath for easy composition:

```
val serviceA = system.actorSelection(node("master") / "user" / "serviceA")
```
67. [**](../../../akka/remote/testkit/MultiNodeSpec.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
68. [**](../../../akka/remote/testkit/MultiNodeSpec.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
69. [**](../../../akka/remote/testkit/MultiNodeSpec.html#now:scala.concurrent.duration.FiniteDuration "Permalink")  def now: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain current time (`System.nanoTime`) as Duration.

Obtain current time (`System.nanoTime`) as Duration.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
70. [**](../../../akka/remote/testkit/MultiNodeSpec.html#receiveN(n:Int,max:scala.concurrent.duration.FiniteDuration):Seq[AnyRef] "Permalink")  def receiveN(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Receive N messages in a row before the given deadline.

Receive N messages in a row before the given deadline.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
71. [**](../../../akka/remote/testkit/MultiNodeSpec.html#receiveN(n:Int):Seq[AnyRef] "Permalink")  def receiveN(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Same as `receiveN(n, remaining)` but correctly taking into account
Duration.timeFactor.

Same as `receiveN(n, remaining)` but correctly taking into account
Duration.timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
72. [**](../../../akka/remote/testkit/MultiNodeSpec.html#receiveOne(max:scala.concurrent.duration.Duration):AnyRef "Permalink")  def receiveOne(max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Receive one message from the internal queue of the TestActor.

Receive one message from the internal queue of the TestActor. If the given
duration is zero, the queue is polled (non\-blocking).

This method does NOT automatically scale its Duration parameter!

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
73. [**](../../../akka/remote/testkit/MultiNodeSpec.html#receiveWhile[T](max:scala.concurrent.duration.Duration,idle:scala.concurrent.duration.Duration,messages:Int)(f:PartialFunction[AnyRef,T]):Seq[T] "Permalink")  def receiveWhile\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, idle: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf, messages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= Int.MaxValue)(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), T]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive a series of messages until one does not match the given partial
function or the idle timeout is met (disabled by default) or the overall
maximum duration is elapsed or expected messages count is reached.

Receive a series of messages until one does not match the given partial
function or the idle timeout is met (disabled by default) or the overall
maximum duration is elapsed or expected messages count is reached.
Returns the sequence of messages.

Note that it is not an error to hit the `max` duration in this case.

One possible use of this method is for testing whether messages of
certain characteristics are generated at a certain rate:

```
test ! ScheduleTicks(100 millis)
val series = receiveWhile(750 millis) {
    case Tick(count) => count
}
assert(series == (1 to 7).toList)
```
Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
74. [**](../../../akka/remote/testkit/MultiNodeSpec.html#remaining:scala.concurrent.duration.FiniteDuration "Permalink")  def remaining: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain time remaining for execution of the innermost enclosing `within`
block or throw an AssertionError if no `within` block surrounds this
call.

Obtain time remaining for execution of the innermost enclosing `within`
block or throw an AssertionError if no `within` block surrounds this
call.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
75. [**](../../../akka/remote/testkit/MultiNodeSpec.html#remainingOr(duration:scala.concurrent.duration.FiniteDuration):scala.concurrent.duration.FiniteDuration "Permalink")  def remainingOr(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the given duration.

Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the given duration.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
76. [**](../../../akka/remote/testkit/MultiNodeSpec.html#remainingOrDefault:scala.concurrent.duration.FiniteDuration "Permalink")  def remainingOrDefault: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the properly dilated default for this
case from settings (key "akka.test.single\-expect\-default").

Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the properly dilated default for this
case from settings (key "akka.test.single\-expect\-default").

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
77. [**](../../../akka/remote/testkit/MultiNodeSpec.html#roles:Seq[akka.remote.testconductor.RoleName] "Permalink")  def roles: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[RoleName](../testconductor/RoleName.html)]All registered roles
78. [**](../../../akka/remote/testkit/MultiNodeSpec.html#runOn(nodes:akka.remote.testconductor.RoleName*)(thunk:=>Unit):Unit "Permalink")  def runOn(nodes: [RoleName](../testconductor/RoleName.html)\*)(thunk: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Execute the given block of code only on the given nodes (names according
to the `roleMap`).
79. [**](../../../akka/remote/testkit/MultiNodeSpec.html#setAutoPilot(pilot:akka.testkit.TestActor.AutoPilot):Unit "Permalink")  def setAutoPilot(pilot: [AutoPilot](../../testkit/TestActor$$AutoPilot.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Install an AutoPilot to drive the testActor: the AutoPilot will be run
for each received message and can be used to send or forward messages,
etc.

Install an AutoPilot to drive the testActor: the AutoPilot will be run
for each received message and can be used to send or forward messages,
etc. Each invocation must return the AutoPilot for the next round.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
80. [**](../../../akka/remote/testkit/MultiNodeSpec.html#shutdown(actorSystem:akka.actor.ActorSystem,duration:scala.concurrent.duration.Duration,verifySystemShutdown:Boolean):Unit "Permalink")  def shutdown(actorSystem: [ActorSystem](../../actor/ActorSystem.html) \= [system](../../testkit/TestKitBase.html#system:akka.actor.ActorSystem), duration: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, verifySystemShutdown: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Shut down an actor system and wait for termination.

Shut down an actor system and wait for termination.
On failure debug output will be logged about the remaining actors in the system.

If verifySystemShutdown is true, then an exception will be thrown on failure.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
81. [**](../../../akka/remote/testkit/MultiNodeSpec.html#shutdownTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  def shutdownTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
82. [**](../../../akka/remote/testkit/MultiNodeSpec.html#startNewSystem():akka.actor.ActorSystem "Permalink")  def startNewSystem(): [ActorSystem](../../actor/ActorSystem.html)This method starts a new ActorSystem with the same configuration as the
previous one on the current node, including deployments.

This method starts a new ActorSystem with the same configuration as the
previous one on the current node, including deployments. It also creates
a new TestConductor client and registers itself with the conductor so
that it is possible to use barriers etc. normally after this method has
been called.

NOTICE: you MUST start a new system before trying to enter a barrier or
otherwise using the TestConductor after having terminated this node’s
system.

Attributesprotected
83. [**](../../../akka/remote/testkit/MultiNodeSpec.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
84. [**](../../../akka/remote/testkit/MultiNodeSpec.html#system:akka.actor.ActorSystem "Permalink") implicit  val system: [ActorSystem](../../actor/ActorSystem.html)Definition Classes[TestKit](../../testkit/TestKit.html) → [TestKitBase](../../testkit/TestKitBase.html)
85. [**](../../../akka/remote/testkit/MultiNodeSpec.html#testActor:akka.actor.ActorRef "Permalink")  lazy val testActor: [ActorRef](../../actor/ActorRef.html)ActorRef of the test actor.

ActorRef of the test actor. Access is provided to enable e.g.
registration as message target.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
86. [**](../../../akka/remote/testkit/MultiNodeSpec.html#testActorName:String "Permalink")  def testActorName: StringDefines the testActor name.

Defines the testActor name.

Attributesprotected Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
87. [**](../../../akka/remote/testkit/MultiNodeSpec.html#testConductor:akka.remote.testconductor.TestConductorExt "Permalink")  var testConductor: [TestConductorExt](../testconductor/TestConductorExt.html)Access to the barriers, failure injection, etc.

Access to the barriers, failure injection, etc. The extension will have
been started either in Conductor or Player mode when the constructor of
MultiNodeSpec finishes, i.e. do not call the start\*() methods yourself!
88. [**](../../../akka/remote/testkit/MultiNodeSpec.html#testKitSettings:akka.testkit.TestKitSettings "Permalink")  def testKitSettings: [TestKitSettings](../../testkit/TestKitSettings.html)Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
89. [**](../../../akka/remote/testkit/MultiNodeSpec.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
90. [**](../../../akka/remote/testkit/MultiNodeSpec.html#unwatch(ref:akka.actor.ActorRef):akka.actor.ActorRef "Permalink")  def unwatch(ref: [ActorRef](../../actor/ActorRef.html)): [ActorRef](../../actor/ActorRef.html)Have the testActor stop watching someone (i.e.

Have the testActor stop watching someone (i.e. `context.unwatch(...)`).

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
91. [**](../../../akka/remote/testkit/MultiNodeSpec.html#verifySystemShutdown:Boolean "Permalink")  def verifySystemShutdown: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Override this and return `true` to assert that the
shutdown of the `ActorSystem` was done properly.
92. [**](../../../akka/remote/testkit/MultiNodeSpec.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
93. [**](../../../akka/remote/testkit/MultiNodeSpec.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
94. [**](../../../akka/remote/testkit/MultiNodeSpec.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
95. [**](../../../akka/remote/testkit/MultiNodeSpec.html#watch(ref:akka.actor.ActorRef):akka.actor.ActorRef "Permalink")  def watch(ref: [ActorRef](../../actor/ActorRef.html)): [ActorRef](../../actor/ActorRef.html)Have the testActor watch someone (i.e.

Have the testActor watch someone (i.e. `context.watch(...)`).

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
96. [**](../../../akka/remote/testkit/MultiNodeSpec.html#within[T](max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink")  def within\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TSame as calling `within(0 seconds, max)(f)`.

Same as calling `within(0 seconds, max)(f)`.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
97. [**](../../../akka/remote/testkit/MultiNodeSpec.html#within[T](min:scala.concurrent.duration.FiniteDuration,max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink")  def within\[T](min: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TExecute code block while bounding its execution time between `min` and
`max`.

Execute code block while bounding its execution time between `min` and
`max`. `within` blocks may be nested. All methods in this trait which
take maximum wait times are available in a version which implicitly uses
the remaining time governed by the innermost enclosing `within` block.

Note that the timeout is scaled using Duration.dilated, which uses the
configuration entry "akka.test.timefactor", while the min Duration is not.

```
val ret = within(50 millis) {
  test ! "ping"
  expectMsgClass(classOf[String])
}
```
Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
### Deprecated Value Members

1. [**](../../../akka/remote/testkit/MultiNodeSpec.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/testkit/MultiNodeSpec.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MultiNodeSpec toStringFormat\[MultiNodeSpec] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/testkit/MultiNodeSpec.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MultiNodeSpec, B)ImplicitThis member is added by an implicit conversion from MultiNodeSpec toArrowAssoc\[MultiNodeSpec] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html)

### Inherited from [TestKit](../../testkit/TestKit.html)

### Inherited from [TestKitBase](../../testkit/TestKitBase.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMultiNodeSpec to any2stringadd\[MultiNodeSpec]

### Inherited by implicit conversion StringFormat fromMultiNodeSpec to StringFormat\[MultiNodeSpec]

### Inherited by implicit conversion Ensuring fromMultiNodeSpec to Ensuring\[MultiNodeSpec]

### Inherited by implicit conversion ArrowAssoc fromMultiNodeSpec to ArrowAssoc\[MultiNodeSpec]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/actor/Props.html
- https://doc.akka.io/api/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka/current/akka/actor/Terminated.html
- https://doc.akka.io/api/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Blackhole$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ForceDisassociate.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ForceDisassociateAck$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeConfig.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpec$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpec$AwaitHelper.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpecCallbacks.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/SetThrottle.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/SetThrottleAck$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ThrottleMode$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/TokenBucket.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Unthrottled$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$AutoPilot.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKit.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKitBase.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKitSettings.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpec.html](https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpec.html)*