---
description: Akka 2.10.17 - akka.testkit.TestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:11:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/TestKit.html
title: Akka 2.10.17 - akka.testkit.TestKit
---

# Akka 2.10.17 - akka.testkit.TestKit

> **Summary:** Akka 2.10.17 - akka.testkit.TestKit

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[testkit](index.html)
- [**](../../akka/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[testkit](index.html)
- [CallingThreadDispatcher](CallingThreadDispatcher.html "Dispatcher which runs invocations on the current thread only.")
- [CallingThreadDispatcherConfigurator](CallingThreadDispatcherConfigurator.html)
- [CallingThreadMailbox](CallingThreadMailbox.html)
- [CustomEventFilter](CustomEventFilter.html "Custom event filter when the others do not fit the bill.")
- [DeadLettersFilter](DeadLettersFilter.html "Filter which matches DeadLetter events, if the wrapped message conforms to the given type.")
- [DebugFilter](DebugFilter.html "Filter which matches Debug events, if they satisfy the given criteria:")
- [DefaultTimeout](DefaultTimeout.html)
- [ErrorFilter](ErrorFilter.html "Filter which matches Error events, if they satisfy the given criteria:")
- [EventFilter](EventFilter.html "Facilities for selectively filtering out expected events from logging so that you can keep your test run’s console output clean and do not miss real error messages.")
- [ExplicitlyTriggeredScheduler](ExplicitlyTriggeredScheduler.html "For testing: scheduler that does not look at the clock, but must be progressed manually by calling timePasses.")
- [ImplicitSender](ImplicitSender.html)
- [InfoFilter](InfoFilter.html "Filter which matches Info events, if they satisfy the given criteria:")
- [JavaSerializable](JavaSerializable.html "Marker trait for test messages that will use Java serialization via akka.testkit.TestJavaSerializer")
- [SocketUtil](SocketUtil$.html "Utilities to get free socket address.")
- [TestActor](TestActor.html)
- [TestActorRef](TestActorRef.html "This special ActorRef is exclusively for use during unit testing in a single-threaded environment.")
- [TestActors](TestActors$.html "A collection of common actor patterns used in tests.")
- [TestBarrier](TestBarrier.html)
- [TestBarrierTimeoutException](TestBarrierTimeoutException.html)
- [TestDuration](package$$TestDuration.html "Scala API.")
- [TestEvent](TestEvent.html "Implementation helpers of the EventFilter facilities: send Mute to the TestEventListener to install a filter, and UnMute to uninstall it.")
- [TestEventListener](TestEventListener.html "EventListener for running tests, which allows selectively filtering out expected messages.")
- [TestException](TestException.html "A predefined exception that can be used in tests.")
- [TestFSMRef](TestFSMRef.html "This is a specialized form of the TestActorRef with support for querying and setting the state of a FSM.")
- [TestJavaSerializer](TestJavaSerializer.html "This Serializer uses standard Java Serialization and is useful for tests where ad-hoc messages are created and sent between actor systems.")
- TestKit
- [TestKitBase](TestKitBase.html "Implementation trait behind the akka.testkit.TestKit class: you may use this if inheriting from a concrete class is not possible.")
- [TestKitExtension](TestKitExtension$.html)
- [TestKitSettings](TestKitSettings.html)
- [TestLatch](TestLatch.html)
- [TestProbe](TestProbe.html "TestKit-based probe which allows sending, reception and reply.")
- [WarningFilter](WarningFilter.html "Filter which matches Warning events, if they satisfy the given criteria:")
[c](TestKit$.html "See companion object")[akka](../index.html).[testkit](index.html)

# [TestKit](TestKit$.html "See companion object")[**](../../akka/testkit/TestKit.html "Permalink")

### Companion [object TestKit](TestKit$.html "See companion object")

#### class TestKit extends [TestKitBase](TestKitBase.html)

Test kit for testing actors. Inheriting from this class enables reception of
replies from actors, which are queued by an internal actor and can be
examined using the `expectMsg...` methods. Assertions and bounds concerning
timing are available in the form of `within` blocks.

```
class Test extends TestKit(ActorSystem()) {
  try {

    val test = system.actorOf(Props[SomeActor])

      within (1.second) {
        test ! SomeWork
        expectMsg(Result1) // bounded to 1 second
        expectMsg(Result2) // bounded to the remainder of the 1 second
      }

    } finally {
      system.terminate()
    }

  } finally {
    system.terminate()
  }
}
```
Beware of two points:

- the ActorSystem passed into the constructor needs to be shutdown,
 otherwise thread pools and memory will be leaked
- this class is not thread\-safe (only one actor with one queue, one stack
 of `within` blocks); it is expected that the code is executed from a
 constructor as shown above, which makes this a non\-issue, otherwise take
 care not to run tests within a single test class instance in parallel.

It should be noted that for CI servers and the like all maximum Durations
are scaled using their Duration.dilated method, which uses the
TestKitExtension.Settings.TestTimeFactor settable via akka.conf entry "akka.test.timefactor".

Source[TestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/TestKit.scala#L953)Since1\.1

Linear Supertypes[TestKitBase](TestKitBase.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[MultiNodeSpec](../remote/testkit/MultiNodeSpec.html), [TestProbe](TestProbe.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestKit
2. TestKitBase
3. AnyRef
4. Any
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

1. [**](../../akka/testkit/TestKit.html#<init>(_system:akka.actor.ActorSystem):akka.testkit.TestKit "Permalink")  new TestKit(\_system: [ActorSystem](../actor/ActorSystem.html))
### Value Members

1. [**](../../akka/testkit/TestKit.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/TestKit.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/TestKit.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TestKit toany2stringadd\[TestKit] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/TestKit.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TestKit, B)ImplicitThis member is added by an implicit conversion from TestKit toArrowAssoc\[TestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/TestKit.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/TestKit.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/testkit/TestKit.html#assertForDuration[A](a:=>A,max:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.Duration):A "Permalink")  def assertForDuration\[A](a: \=\> A, max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 100\.millis): AEvaluate the given assert every `interval` until exception is thrown or `max` timeout is expired.

Evaluate the given assert every `interval` until exception is thrown or `max` timeout is expired.

Returns the result of last evaluation of the assertion.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".

Definition Classes[TestKitBase](TestKitBase.html)
8. [**](../../akka/testkit/TestKit.html#awaitAssert[A](a:=>A,max:scala.concurrent.duration.Duration,interval:scala.concurrent.duration.Duration):A "Permalink")  def awaitAssert\[A](a: \=\> A, max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, interval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 100\.millis): AEvaluate the given assert every `interval` until it does not throw an exception and return the
result.

Evaluate the given assert every `interval` until it does not throw an exception and return the
result.

If the `max` timeout expires the last exception is thrown.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".

Definition Classes[TestKitBase](TestKitBase.html)
9. [**](../../akka/testkit/TestKit.html#awaitCond(p:=>Boolean,max:scala.concurrent.duration.Duration,interval:scala.concurrent.duration.Duration,message:String):Unit "Permalink")  def awaitCond(p: \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, interval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 100\.millis, message: String \= ""): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".

Definition Classes[TestKitBase](TestKitBase.html)
10. [**](../../akka/testkit/TestKit.html#childActorOf(props:akka.actor.Props):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../actor/Props.html)): [ActorRef](../actor/ActorRef.html)Spawns an actor as a child of this test actor with an auto\-generated name and stopping supervisor strategy, returning the child's ActorRef.

Spawns an actor as a child of this test actor with an auto\-generated name and stopping supervisor strategy, returning the child's ActorRef.

propsProps to create the child actor

Definition Classes[TestKitBase](TestKitBase.html)
11. [**](../../akka/testkit/TestKit.html#childActorOf(props:akka.actor.Props,name:String):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../actor/Props.html), name: String): [ActorRef](../actor/ActorRef.html)Spawns an actor as a child of this test actor with a stopping supervisor strategy, and returns the child's ActorRef.

Spawns an actor as a child of this test actor with a stopping supervisor strategy, and returns the child's ActorRef.

propsProps to create the child actor

nameActor name for the child actor

Definition Classes[TestKitBase](TestKitBase.html)
12. [**](../../akka/testkit/TestKit.html#childActorOf(props:akka.actor.Props,supervisorStrategy:akka.actor.SupervisorStrategy):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../actor/Props.html), supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html)): [ActorRef](../actor/ActorRef.html)Spawns an actor as a child of this test actor with an auto\-generated name, and returns the child's ActorRef.

Spawns an actor as a child of this test actor with an auto\-generated name, and returns the child's ActorRef.

propsProps to create the child actor

supervisorStrategyStrategy should decide what to do with failures in the actor.

Definition Classes[TestKitBase](TestKitBase.html)
13. [**](../../akka/testkit/TestKit.html#childActorOf(props:akka.actor.Props,name:String,supervisorStrategy:akka.actor.SupervisorStrategy):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../actor/Props.html), name: String, supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html)): [ActorRef](../actor/ActorRef.html)Spawns an actor as a child of this test actor, and returns the child's ActorRef.

Spawns an actor as a child of this test actor, and returns the child's ActorRef.

propsProps to create the child actor

nameActor name for the child actor

supervisorStrategyStrategy should decide what to do with failures in the actor.

Definition Classes[TestKitBase](TestKitBase.html)
14. [**](../../akka/testkit/TestKit.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/testkit/TestKit.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestKitImplicitThis member is added by an implicit conversion from TestKit toEnsuring\[TestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/testkit/TestKit.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestKitImplicitThis member is added by an implicit conversion from TestKit toEnsuring\[TestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/testkit/TestKit.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestKitImplicitThis member is added by an implicit conversion from TestKit toEnsuring\[TestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/testkit/TestKit.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestKitImplicitThis member is added by an implicit conversion from TestKit toEnsuring\[TestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/testkit/TestKit.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/testkit/TestKit.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../akka/testkit/TestKit.html#expectMsg[T](max:scala.concurrent.duration.FiniteDuration,hint:String,obj:T):T "Permalink")  def expectMsg\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), hint: String, obj: T): TReceive one message from the test actor and assert that it equals the
given object.

Receive one message from the test actor and assert that it equals the
given object. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](TestKitBase.html)
22. [**](../../akka/testkit/TestKit.html#expectMsg[T](max:scala.concurrent.duration.FiniteDuration,obj:T):T "Permalink")  def expectMsg\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: T): TReceive one message from the test actor and assert that it equals the
given object.

Receive one message from the test actor and assert that it equals the
given object. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](TestKitBase.html)
23. [**](../../akka/testkit/TestKit.html#expectMsg[T](obj:T):T "Permalink")  def expectMsg\[T](obj: T): TSame as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor.

Same as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](TestKitBase.html)
24. [**](../../akka/testkit/TestKit.html#expectMsgAllClassOf[T](max:scala.concurrent.duration.FiniteDuration,obj:Class[_<:T]*):Seq[T] "Permalink")  def expectMsgAllClassOf\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: Class\[\_ \<: T]\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive a number of messages from the test actor matching the given
number of classes and assert that for each given class one is received
which is of that class (equality, not conformance).

Receive a number of messages from the test actor matching the given
number of classes and assert that for each given class one is received
which is of that class (equality, not conformance). This construct is
useful when the order in which the objects are received is not fixed.
Wait time is bounded by the given duration, with an AssertionFailure
being thrown in case of timeout.

Definition Classes[TestKitBase](TestKitBase.html)
25. [**](../../akka/testkit/TestKit.html#expectMsgAllClassOf[T](obj:Class[_<:T]*):Seq[T] "Permalink")  def expectMsgAllClassOf\[T](obj: Class\[\_ \<: T]\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Same as `expectMsgAllClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAllClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](TestKitBase.html)
26. [**](../../akka/testkit/TestKit.html#expectMsgAllConformingOf[T](max:scala.concurrent.duration.FiniteDuration,obj:Class[_<:T]*):Seq[T] "Permalink")  def expectMsgAllConformingOf\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: Class\[\_ \<: T]\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive a number of messages from the test actor matching the given
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

Definition Classes[TestKitBase](TestKitBase.html)
27. [**](../../akka/testkit/TestKit.html#expectMsgAllConformingOf[T](obj:Class[_<:T]*):Seq[T] "Permalink")  def expectMsgAllConformingOf\[T](obj: Class\[\_ \<: T]\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Same as `expectMsgAllConformingOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAllConformingOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](TestKitBase.html)
28. [**](../../akka/testkit/TestKit.html#expectMsgAllOf[T](max:scala.concurrent.duration.FiniteDuration,obj:T*):Seq[T] "Permalink")  def expectMsgAllOf\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: T\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive a number of messages from the test actor matching the given
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

Definition Classes[TestKitBase](TestKitBase.html)
29. [**](../../akka/testkit/TestKit.html#expectMsgAllOf[T](obj:T*):Seq[T] "Permalink")  def expectMsgAllOf\[T](obj: T\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](TestKitBase.html)
30. [**](../../akka/testkit/TestKit.html#expectMsgAnyClassOf[C](max:scala.concurrent.duration.FiniteDuration,obj:Class[_<:C]*):C "Permalink")  def expectMsgAnyClassOf\[C](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: Class\[\_ \<: C]\*): CReceive one message from the test actor and assert that it conforms to
one of the given classes.

Receive one message from the test actor and assert that it conforms to
one of the given classes. Wait time is bounded by the given duration,
with an AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](TestKitBase.html)
31. [**](../../akka/testkit/TestKit.html#expectMsgAnyClassOf[C](obj:Class[_<:C]*):C "Permalink")  def expectMsgAnyClassOf\[C](obj: Class\[\_ \<: C]\*): CSame as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](TestKitBase.html)
32. [**](../../akka/testkit/TestKit.html#expectMsgAnyOf[T](max:scala.concurrent.duration.FiniteDuration,obj:T*):T "Permalink")  def expectMsgAnyOf\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: T\*): TReceive one message from the test actor and assert that it equals one of
the given objects.

Receive one message from the test actor and assert that it equals one of
the given objects. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](TestKitBase.html)
33. [**](../../akka/testkit/TestKit.html#expectMsgAnyOf[T](obj:T*):T "Permalink")  def expectMsgAnyOf\[T](obj: T\*): TSame as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](TestKitBase.html)
34. [**](../../akka/testkit/TestKit.html#expectMsgClass[C](max:scala.concurrent.duration.FiniteDuration,c:Class[C]):C "Permalink")  def expectMsgClass\[C](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), c: Class\[C]): CReceive one message from the test actor and assert that it conforms to
the given class.

Receive one message from the test actor and assert that it conforms to
the given class. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](TestKitBase.html)
35. [**](../../akka/testkit/TestKit.html#expectMsgClass[C](c:Class[C]):C "Permalink")  def expectMsgClass\[C](c: Class\[C]): CSame as `expectMsgClass(remainingOrDefault, c)`, but correctly treating the timeFactor.

Same as `expectMsgClass(remainingOrDefault, c)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](TestKitBase.html)
36. [**](../../akka/testkit/TestKit.html#expectMsgPF[T](max:scala.concurrent.duration.Duration,hint:String)(f:PartialFunction[Any,T]):T "Permalink")  def expectMsgPF\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, hint: String \= "")(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TReceive one message from the test actor and assert that the given
partial function accepts it.

Receive one message from the test actor and assert that the given
partial function accepts it. Wait time is bounded by the given duration,
with an AssertionFailure being thrown in case of timeout.

Use this variant to implement more complicated or conditional
processing.

returnsthe received object as transformed by the partial function

Definition Classes[TestKitBase](TestKitBase.html)
37. [**](../../akka/testkit/TestKit.html#expectMsgType[T](max:scala.concurrent.duration.FiniteDuration)(implicitt:scala.reflect.ClassTag[T]):T "Permalink")  def expectMsgType\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): TReceive one message from the test actor and assert that it conforms to the
given type (after erasure).

Receive one message from the test actor and assert that it conforms to the
given type (after erasure). Wait time is bounded by the given duration,
with an AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](TestKitBase.html)
38. [**](../../akka/testkit/TestKit.html#expectMsgType[T](implicitt:scala.reflect.ClassTag[T]):T "Permalink")  def expectMsgType\[T](implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): TSame as `expectMsgType[T](remainingOrDefault)`, but correctly treating the timeFactor.

Same as `expectMsgType[T](remainingOrDefault)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](TestKitBase.html)
39. [**](../../akka/testkit/TestKit.html#expectNoMessage():Unit "Permalink")  def expectNoMessage(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that no message is received.

Assert that no message is received. Waits for the default period configured as
`akka.test.expect-no-message-default`.
That timeout is scaled using the configuration entry "akka.test.timefactor".

Definition Classes[TestKitBase](TestKitBase.html)
40. [**](../../akka/testkit/TestKit.html#expectNoMessage(max:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def expectNoMessage(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that no message is received for the specified time.

Assert that no message is received for the specified time.
Supplied value is not dilated.

Definition Classes[TestKitBase](TestKitBase.html)
41. [**](../../akka/testkit/TestKit.html#expectTerminated(target:akka.actor.ActorRef,max:scala.concurrent.duration.Duration):akka.actor.Terminated "Permalink")  def expectTerminated(target: [ActorRef](../actor/ActorRef.html), max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined): [Terminated](../actor/Terminated.html)Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.

Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.
Before calling this method, you have to `watch` the target actor ref.
Wait time is bounded by the given duration, with an AssertionFailure being thrown in case of timeout.

targetthe actor ref expected to be Terminated

maxwait no more than max time, otherwise throw AssertionFailure

returnsthe received Terminated message

Definition Classes[TestKitBase](TestKitBase.html)
42. [**](../../akka/testkit/TestKit.html#fishForMessage(max:scala.concurrent.duration.Duration,hint:String)(f:PartialFunction[Any,Boolean]):Any "Permalink")  def fishForMessage(max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, hint: String \= "")(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Hybrid of expectMsgPF and receiveWhile: receive messages while the
partial function matches and returns false.

Hybrid of expectMsgPF and receiveWhile: receive messages while the
partial function matches and returns false. Use it to ignore certain
messages while waiting for a specific message.

returnsthe last received message, i.e. the first one for which the
 partial function returned true

Definition Classes[TestKitBase](TestKitBase.html)
43. [**](../../akka/testkit/TestKit.html#fishForSpecificMessage[T](max:scala.concurrent.duration.Duration,hint:String)(f:PartialFunction[Any,T]):T "Permalink")  def fishForSpecificMessage\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, hint: String \= "")(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TWaits for specific message that partial function matches while ignoring all other messages coming in the meantime.

Waits for specific message that partial function matches while ignoring all other messages coming in the meantime.
Use it to ignore any number of messages while waiting for a specific one.

returnsresult of applying partial function to the last received message,
 i.e. the first one for which the partial function is defined

Definition Classes[TestKitBase](TestKitBase.html)
44. [**](../../akka/testkit/TestKit.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
45. [**](../../akka/testkit/TestKit.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
46. [**](../../akka/testkit/TestKit.html#ignoreMsg(f:PartialFunction[Any,Boolean]):Unit "Permalink")  def ignoreMsg(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Ignore all messages in the test actor for which the given partial
function returns true.

Ignore all messages in the test actor for which the given partial
function returns true.

Definition Classes[TestKitBase](TestKitBase.html)
47. [**](../../akka/testkit/TestKit.html#ignoreNoMsg():Unit "Permalink")  def ignoreNoMsg(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Stop ignoring messages in the test actor.

Stop ignoring messages in the test actor.

Definition Classes[TestKitBase](TestKitBase.html)
48. [**](../../akka/testkit/TestKit.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
49. [**](../../akka/testkit/TestKit.html#lastSender:akka.actor.ActorRef "Permalink")  def lastSender: [ActorRef](../actor/ActorRef.html)Definition Classes[TestKitBase](TestKitBase.html)
50. [**](../../akka/testkit/TestKit.html#msgAvailable:Boolean "Permalink")  def msgAvailable: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Query queue status.

Query queue status.

Definition Classes[TestKitBase](TestKitBase.html)
51. [**](../../akka/testkit/TestKit.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
52. [**](../../akka/testkit/TestKit.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
53. [**](../../akka/testkit/TestKit.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
54. [**](../../akka/testkit/TestKit.html#now:scala.concurrent.duration.FiniteDuration "Permalink")  def now: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain current time (`System.nanoTime`) as Duration.

Obtain current time (`System.nanoTime`) as Duration.

Definition Classes[TestKitBase](TestKitBase.html)
55. [**](../../akka/testkit/TestKit.html#receiveN(n:Int,max:scala.concurrent.duration.FiniteDuration):Seq[AnyRef] "Permalink")  def receiveN(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Receive N messages in a row before the given deadline.

Receive N messages in a row before the given deadline.

Definition Classes[TestKitBase](TestKitBase.html)
56. [**](../../akka/testkit/TestKit.html#receiveN(n:Int):Seq[AnyRef] "Permalink")  def receiveN(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Same as `receiveN(n, remaining)` but correctly taking into account
Duration.timeFactor.

Same as `receiveN(n, remaining)` but correctly taking into account
Duration.timeFactor.

Definition Classes[TestKitBase](TestKitBase.html)
57. [**](../../akka/testkit/TestKit.html#receiveOne(max:scala.concurrent.duration.Duration):AnyRef "Permalink")  def receiveOne(max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Receive one message from the internal queue of the TestActor.

Receive one message from the internal queue of the TestActor. If the given
duration is zero, the queue is polled (non\-blocking).

This method does NOT automatically scale its Duration parameter!

Definition Classes[TestKitBase](TestKitBase.html)
58. [**](../../akka/testkit/TestKit.html#receiveWhile[T](max:scala.concurrent.duration.Duration,idle:scala.concurrent.duration.Duration,messages:Int)(f:PartialFunction[AnyRef,T]):Seq[T] "Permalink")  def receiveWhile\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, idle: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf, messages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= Int.MaxValue)(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), T]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive a series of messages until one does not match the given partial
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
Definition Classes[TestKitBase](TestKitBase.html)
59. [**](../../akka/testkit/TestKit.html#remaining:scala.concurrent.duration.FiniteDuration "Permalink")  def remaining: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain time remaining for execution of the innermost enclosing `within`
block or throw an AssertionError if no `within` block surrounds this
call.

Obtain time remaining for execution of the innermost enclosing `within`
block or throw an AssertionError if no `within` block surrounds this
call.

Definition Classes[TestKitBase](TestKitBase.html)
60. [**](../../akka/testkit/TestKit.html#remainingOr(duration:scala.concurrent.duration.FiniteDuration):scala.concurrent.duration.FiniteDuration "Permalink")  def remainingOr(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the given duration.

Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the given duration.

Definition Classes[TestKitBase](TestKitBase.html)
61. [**](../../akka/testkit/TestKit.html#remainingOrDefault:scala.concurrent.duration.FiniteDuration "Permalink")  def remainingOrDefault: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the properly dilated default for this
case from settings (key "akka.test.single\-expect\-default").

Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the properly dilated default for this
case from settings (key "akka.test.single\-expect\-default").

Definition Classes[TestKitBase](TestKitBase.html)
62. [**](../../akka/testkit/TestKit.html#setAutoPilot(pilot:akka.testkit.TestActor.AutoPilot):Unit "Permalink")  def setAutoPilot(pilot: [AutoPilot](TestActor$$AutoPilot.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Install an AutoPilot to drive the testActor: the AutoPilot will be run
for each received message and can be used to send or forward messages,
etc.

Install an AutoPilot to drive the testActor: the AutoPilot will be run
for each received message and can be used to send or forward messages,
etc. Each invocation must return the AutoPilot for the next round.

Definition Classes[TestKitBase](TestKitBase.html)
63. [**](../../akka/testkit/TestKit.html#shutdown(actorSystem:akka.actor.ActorSystem,duration:scala.concurrent.duration.Duration,verifySystemShutdown:Boolean):Unit "Permalink")  def shutdown(actorSystem: [ActorSystem](../actor/ActorSystem.html) \= [system](TestKitBase.html#system:akka.actor.ActorSystem), duration: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, verifySystemShutdown: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Shut down an actor system and wait for termination.

Shut down an actor system and wait for termination.
On failure debug output will be logged about the remaining actors in the system.

If verifySystemShutdown is true, then an exception will be thrown on failure.

Definition Classes[TestKitBase](TestKitBase.html)
64. [**](../../akka/testkit/TestKit.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
65. [**](../../akka/testkit/TestKit.html#system:akka.actor.ActorSystem "Permalink") implicit  val system: [ActorSystem](../actor/ActorSystem.html)Definition ClassesTestKit → [TestKitBase](TestKitBase.html)
66. [**](../../akka/testkit/TestKit.html#testActor:akka.actor.ActorRef "Permalink")  lazy val testActor: [ActorRef](../actor/ActorRef.html)ActorRef of the test actor.

ActorRef of the test actor. Access is provided to enable e.g.
registration as message target.

Definition Classes[TestKitBase](TestKitBase.html)
67. [**](../../akka/testkit/TestKit.html#testActorName:String "Permalink")  def testActorName: StringDefines the testActor name.

Defines the testActor name.

Attributesprotected Definition Classes[TestKitBase](TestKitBase.html)
68. [**](../../akka/testkit/TestKit.html#testKitSettings:akka.testkit.TestKitSettings "Permalink")  def testKitSettings: [TestKitSettings](TestKitSettings.html)Definition Classes[TestKitBase](TestKitBase.html)
69. [**](../../akka/testkit/TestKit.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
70. [**](../../akka/testkit/TestKit.html#unwatch(ref:akka.actor.ActorRef):akka.actor.ActorRef "Permalink")  def unwatch(ref: [ActorRef](../actor/ActorRef.html)): [ActorRef](../actor/ActorRef.html)Have the testActor stop watching someone (i.e.

Have the testActor stop watching someone (i.e. `context.unwatch(...)`).

Definition Classes[TestKitBase](TestKitBase.html)
71. [**](../../akka/testkit/TestKit.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
72. [**](../../akka/testkit/TestKit.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
73. [**](../../akka/testkit/TestKit.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
74. [**](../../akka/testkit/TestKit.html#watch(ref:akka.actor.ActorRef):akka.actor.ActorRef "Permalink")  def watch(ref: [ActorRef](../actor/ActorRef.html)): [ActorRef](../actor/ActorRef.html)Have the testActor watch someone (i.e.

Have the testActor watch someone (i.e. `context.watch(...)`).

Definition Classes[TestKitBase](TestKitBase.html)
75. [**](../../akka/testkit/TestKit.html#within[T](max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink")  def within\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TSame as calling `within(0 seconds, max)(f)`.

Same as calling `within(0 seconds, max)(f)`.

Definition Classes[TestKitBase](TestKitBase.html)
76. [**](../../akka/testkit/TestKit.html#within[T](min:scala.concurrent.duration.FiniteDuration,max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink")  def within\[T](min: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TExecute code block while bounding its execution time between `min` and
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
Definition Classes[TestKitBase](TestKitBase.html)
### Deprecated Value Members

1. [**](../../akka/testkit/TestKit.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/TestKit.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TestKit toStringFormat\[TestKit] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/TestKit.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TestKit, B)ImplicitThis member is added by an implicit conversion from TestKit toArrowAssoc\[TestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [TestKitBase](TestKitBase.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTestKit to any2stringadd\[TestKit]

### Inherited by implicit conversion StringFormat fromTestKit to StringFormat\[TestKit]

### Inherited by implicit conversion Ensuring fromTestKit to Ensuring\[TestKit]

### Inherited by implicit conversion ArrowAssoc fromTestKit to ArrowAssoc\[TestKit]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/CallingThreadDispatcher$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/CallingThreadDispatcher.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/CallingThreadDispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/CallingThreadMailbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/CustomEventFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/DeadLettersFilter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/DeadLettersFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/DebugFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/DefaultTimeout.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/ErrorFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/EventFilter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/EventFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/ExplicitlyTriggeredScheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/ImplicitSender.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/InfoFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/JavaSerializable.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/SocketUtil$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestActor$$AutoPilot.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestActor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestActor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestActorRef$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestActors$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestBarrier$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestBarrier.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestBarrierTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestEvent$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestEventListener.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestFSMRef$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestFSMRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestJavaSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKitBase.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKitExtension$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKitSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestLatch$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestLatch.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestProbe$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestProbe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/WarningFilter.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKit.html](https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKit.html)*