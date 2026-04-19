---
description: Akka 2.10.17 - akka.testkit.TestFSMRef
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:46:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/TestFSMRef.html
title: Akka 2.10.17 - akka.testkit.TestFSMRef
---

# Akka 2.10.17 - akka.testkit.TestFSMRef

> **Summary:** Akka 2.10.17 - akka.testkit.TestFSMRef

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
- TestFSMRef
- [TestJavaSerializer](TestJavaSerializer.html "This Serializer uses standard Java Serialization and is useful for tests where ad-hoc messages are created and sent between actor systems.")
- [TestKit](TestKit.html "Test kit for testing actors.")
- [TestKitBase](TestKitBase.html "Implementation trait behind the akka.testkit.TestKit class: you may use this if inheriting from a concrete class is not possible.")
- [TestKitExtension](TestKitExtension$.html)
- [TestKitSettings](TestKitSettings.html)
- [TestLatch](TestLatch.html)
- [TestProbe](TestProbe.html "TestKit-based probe which allows sending, reception and reply.")
- [WarningFilter](WarningFilter.html "Filter which matches Warning events, if they satisfy the given criteria:")
[c](TestFSMRef$.html "See companion object")[akka](../index.html).[testkit](index.html)

# [TestFSMRef](TestFSMRef$.html "See companion object")[**](../../akka/testkit/TestFSMRef.html "Permalink")

### Companion [object TestFSMRef](TestFSMRef$.html "See companion object")

#### class TestFSMRef\[S, D, T \<: [Actor](../actor/Actor.html)] extends [TestActorRef](TestActorRef.html)\[T]

This is a specialized form of the TestActorRef with support for querying and
setting the state of a FSM. Use a LoggingFSM with this class if you also
need to inspect event traces.

```

val fsm = TestFSMRef(new Actor with LoggingFSM[Int, Null] {
    override def logDepth = 12
    startWith(1, null)
    when(1) {
      case Event("hello", _) => goto(2)
    }
    when(2) {
      case Event("world", _) => goto(1)
    }
  })
assert (fsm.stateName == 1)
fsm ! "hallo"
assert (fsm.stateName == 2)
assert (fsm.underlyingActor.getLog == IndexedSeq(FSMLogEntry(1, null, "hallo")))

```

Source[TestFSMRef.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/TestFSMRef.scala#L36)Since1\.2

Linear Supertypes[TestActorRef](TestActorRef.html)\[T], LocalActorRef, LocalRef, ActorRefScope, ActorRefWithCell, InternalActorRef, [ScalaActorRef](../actor/ScalaActorRef.html), [ActorRef](../actor/ActorRef.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[[ActorRef](../actor/ActorRef.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestFSMRef
2. TestActorRef
3. LocalActorRef
4. LocalRef
5. ActorRefScope
6. ActorRefWithCell
7. InternalActorRef
8. ScalaActorRef
9. ActorRef
10. Serializable
11. Comparable
12. AnyRef
13. Any
Implicitly  
1. by scala2ActorRef
2. by actorRef2Scala
3. by any2stringadd
4. by StringFormat
5. by Ensuring
6. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/testkit/TestFSMRef.html#<init>(system:akka.actor.ActorSystem,props:akka.actor.Props,supervisor:akka.actor.ActorRef,name:String)(implicitev:T<:<akka.actor.FSM[S,D]):akka.testkit.TestFSMRef[S,D,T] "Permalink")  new TestFSMRef(system: [ActorSystem](../actor/ActorSystem.html), props: [Props](../actor/Props.html), supervisor: [ActorRef](../actor/ActorRef.html), name: String)(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[T, [FSM](../actor/FSM.html)\[S, D]])
### Value Members

1. [**](../../akka/testkit/TestFSMRef.html#!(message:Any)(implicitsender:akka.actor.ActorRef):Unit "Permalink")  def !(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../actor/Actor$.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sends a one\-way asynchronous message.

Sends a one\-way asynchronous message. E.g. fire\-and\-forget semantics.

If invoked from within an actor then the actor reference is implicitly passed on as the implicit 'sender' argument.

This actor 'sender' reference is then available in the receiving actor in the 'sender()' member variable,
if invoked from within an Actor. If not then no sender is available.

```

  actor ! message

```
Definition ClassesLocalActorRef → [ScalaActorRef](../actor/ScalaActorRef.html) → [ActorRef](../actor/ActorRef.html)
2. [**](../../akka/testkit/TestFSMRef.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/TestFSMRef.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
4. [**](../../akka/testkit/TestFSMRef.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] toany2stringadd\[TestFSMRef\[S, D, T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
5. [**](../../akka/testkit/TestFSMRef.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TestFSMRef\[S, D, T], B)ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] toArrowAssoc\[TestFSMRef\[S, D, T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../akka/testkit/TestFSMRef.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../akka/testkit/TestFSMRef.html#actorContext:akka.actor.ActorContext "Permalink")  def actorContext: [ActorContext](../actor/ActorContext.html)Attributesprotected Definition ClassesLocalActorRef
8. [**](../../akka/testkit/TestFSMRef.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/testkit/TestFSMRef.html#cancelTimer(name:String):Unit "Permalink")  def cancelTimer(name: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Proxy for [akka.actor.FSM\#cancelTimer](../actor/FSM.html#cancelTimer(name:String):Unit).
10. [**](../../akka/testkit/TestFSMRef.html#children:scala.collection.immutable.Iterable[akka.actor.ActorRef] "Permalink")  def children: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[[ActorRef](../actor/ActorRef.html)]Definition ClassesLocalActorRef → ActorRefWithCell
11. [**](../../akka/testkit/TestFSMRef.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/testkit/TestFSMRef.html#compareTo(other:akka.actor.ActorRef):Int "Permalink") final  def compareTo(other: [ActorRef](../actor/ActorRef.html)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Comparison takes path and the unique id of the actor cell into account.

Comparison takes path and the unique id of the actor cell into account.

Definition Classes[ActorRef](../actor/ActorRef.html) → Comparable
13. [**](../../akka/testkit/TestFSMRef.html#dispatcher:akka.dispatch.MessageDispatcher "Permalink")  val dispatcher: [MessageDispatcher](../dispatch/MessageDispatcher.html)Definition Classes[TestActorRef](TestActorRef.html)
14. [**](../../akka/testkit/TestFSMRef.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TestFSMRef\[S, D, T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestFSMRef\[S, D, T]ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] toEnsuring\[TestFSMRef\[S, D, T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/testkit/TestFSMRef.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TestFSMRef\[S, D, T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestFSMRef\[S, D, T]ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] toEnsuring\[TestFSMRef\[S, D, T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/testkit/TestFSMRef.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestFSMRef\[S, D, T]ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] toEnsuring\[TestFSMRef\[S, D, T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/testkit/TestFSMRef.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestFSMRef\[S, D, T]ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] toEnsuring\[TestFSMRef\[S, D, T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/testkit/TestFSMRef.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/testkit/TestFSMRef.html#equals(that:Any):Boolean "Permalink") final  def equals(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Equals takes path and the unique id of the actor cell into account.

Equals takes path and the unique id of the actor cell into account.

Definition Classes[ActorRef](../actor/ActorRef.html) → AnyRef → Any
20. [**](../../akka/testkit/TestFSMRef.html#forward(message:Any)(implicitcontext:akka.actor.ActorContext):Unit "Permalink")  def forward(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit context: [ActorContext](../actor/ActorContext.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Forwards the message and passes the original sender actor as the sender.

Forwards the message and passes the original sender actor as the sender.

Works, no matter whether originally sent with tell/'!' or ask/'?'.

Definition Classes[ActorRef](../actor/ActorRef.html)
21. [**](../../akka/testkit/TestFSMRef.html#getChild(names:Iterator[String]):akka.actor.InternalActorRef "Permalink")  def getChild(names: Iterator\[String]): InternalActorRefObtain ActorRef by possibly traversing the actor tree or looking it up at
some provider\-specific location.

Obtain ActorRef by possibly traversing the actor tree or looking it up at
some provider\-specific location. This method shall return the end result,
i.e. not only the next step in the look\-up; this will typically involve
recursive invocation. A path element of ".." signifies the parent, a
trailing "" element must be disregarded. If the requested path does not
exist, return Nobody.

Definition ClassesLocalActorRef → InternalActorRef
22. [**](../../akka/testkit/TestFSMRef.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/testkit/TestFSMRef.html#getParent:akka.actor.InternalActorRef "Permalink")  def getParent: InternalActorRefObtain parent of this ref; used by getChild for ".." paths.

Obtain parent of this ref; used by getChild for ".." paths.

Definition ClassesLocalActorRef → InternalActorRef
24. [**](../../akka/testkit/TestFSMRef.html#getSingleChild(name:String):akka.actor.InternalActorRef "Permalink")  def getSingleChild(name: String): InternalActorRefMethod for looking up a single child beneath this actor.

Method for looking up a single child beneath this actor. Override in order
to inject “synthetic” actor paths like “/temp”.
It is racy if called from the outside.

Definition ClassesLocalActorRef → ActorRefWithCell
25. [**](../../akka/testkit/TestFSMRef.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ActorRef](../actor/ActorRef.html) → AnyRef → Any
26. [**](../../akka/testkit/TestFSMRef.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
27. [**](../../akka/testkit/TestFSMRef.html#isLocal:Boolean "Permalink") final  def isLocal: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLocalRef → ActorRefScope
28. [**](../../akka/testkit/TestFSMRef.html#isStateTimerActive:Boolean "Permalink")  def isStateTimerActive: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Proxy for akka.actor.FSM\#isStateTimerActive.
29. [**](../../akka/testkit/TestFSMRef.html#isTimerActive(name:String):Boolean "Permalink")  def isTimerActive(name: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Proxy for akka.actor.FSM\#isStateTimerActive.
30. [**](../../akka/testkit/TestFSMRef.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
31. [**](../../akka/testkit/TestFSMRef.html#newActorCell(system:akka.actor.ActorSystemImpl,ref:akka.actor.InternalActorRef,props:akka.actor.Props,dispatcher:akka.dispatch.MessageDispatcher,supervisor:akka.actor.InternalActorRef):akka.actor.ActorCell "Permalink")  def newActorCell(system: ActorSystemImpl, ref: InternalActorRef, props: [Props](../actor/Props.html), dispatcher: [MessageDispatcher](../dispatch/MessageDispatcher.html), supervisor: InternalActorRef): ActorCellAttributesprotected Definition Classes[TestActorRef](TestActorRef.html) → LocalActorRef
32. [**](../../akka/testkit/TestFSMRef.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../akka/testkit/TestFSMRef.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../akka/testkit/TestFSMRef.html#path:akka.actor.ActorPath "Permalink")  val path: [ActorPath](../actor/ActorPath.html)Returns the path for this actor (from this actor up to the root actor).

Returns the path for this actor (from this actor up to the root actor).

Definition ClassesLocalActorRef → [ActorRef](../actor/ActorRef.html)
35. [**](../../akka/testkit/TestFSMRef.html#props:akka.actor.Props "Permalink")  val props: [Props](../actor/Props.html)Definition Classes[TestActorRef](TestActorRef.html)
36. [**](../../akka/testkit/TestFSMRef.html#provider:akka.actor.ActorRefProvider "Permalink")  def provider: [ActorRefProvider](../actor/ActorRefProvider.html)Get a reference to the actor ref provider which created this ref.

Get a reference to the actor ref provider which created this ref.

Definition ClassesLocalActorRef → InternalActorRef
37. [**](../../akka/testkit/TestFSMRef.html#receive(o:Any,sender:akka.actor.ActorRef):Unit "Permalink")  def receive(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), sender: [ActorRef](../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Directly inject messages into actor receive behavior.

Directly inject messages into actor receive behavior. Any exceptions
thrown will be available to you, while still being able to use
become/unbecome.

Definition Classes[TestActorRef](TestActorRef.html)
38. [**](../../akka/testkit/TestFSMRef.html#receive(o:Any):Unit "Permalink")  def receive(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Directly inject messages into actor receive behavior.

Directly inject messages into actor receive behavior. Any exceptions
thrown will be available to you, while still being able to use
become/unbecome.

Definition Classes[TestActorRef](TestActorRef.html)
39. [**](../../akka/testkit/TestFSMRef.html#restart(cause:Throwable):Unit "Permalink")  def restart(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLocalActorRef → InternalActorRef
40. [**](../../akka/testkit/TestFSMRef.html#resume(causedByFailure:Throwable):Unit "Permalink")  def resume(causedByFailure: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Resumes a suspended actor.

Resumes a suspended actor.

Definition ClassesLocalActorRef → InternalActorRef
41. [**](../../akka/testkit/TestFSMRef.html#sendSystemMessage(message:akka.dispatch.sysmsg.SystemMessage):Unit "Permalink")  def sendSystemMessage(message: SystemMessage): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLocalActorRef → InternalActorRef
42. [**](../../akka/testkit/TestFSMRef.html#setState(stateName:S,stateData:D,timeout:scala.concurrent.duration.FiniteDuration,stopReason:Option[akka.actor.FSM.Reason]):Unit "Permalink")  def setState(stateName: S \= [fsm.stateName](../actor/FSM.html#stateName:S), stateData: D \= [fsm.stateData](../actor/FSM.html#stateData:D), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration) \= null, stopReason: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Reason](../actor/FSM$$Reason.html)] \= None): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Change FSM state; any value left out defaults to the current FSM state
(timeout defaults to None).

Change FSM state; any value left out defaults to the current FSM state
(timeout defaults to None). This method is directly equivalent to a
corresponding transition initiated from within the FSM, including timeout
and stop handling.
43. [**](../../akka/testkit/TestFSMRef.html#start():Unit "Permalink")  def start(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Starts the actor after initialization.

Starts the actor after initialization.

Definition ClassesLocalActorRef → InternalActorRef
44. [**](../../akka/testkit/TestFSMRef.html#startSingleTimer(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startSingleTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Proxy for [akka.actor.FSM\#startSingleTimer](../actor/FSM.html#startSingleTimer(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit).
45. [**](../../akka/testkit/TestFSMRef.html#startTimerAtFixedRate(name:String,msg:Any,interval:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerAtFixedRate(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Proxy for [akka.actor.FSM\#startTimerAtFixedRate](../actor/FSM.html#startTimerAtFixedRate(name:String,msg:Any,interval:scala.concurrent.duration.FiniteDuration):Unit).
46. [**](../../akka/testkit/TestFSMRef.html#startTimerWithFixedDelay(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerWithFixedDelay(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Proxy for [akka.actor.FSM\#startTimerWithFixedDelay](../actor/FSM.html#startTimerWithFixedDelay(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit).
47. [**](../../akka/testkit/TestFSMRef.html#stateData:D "Permalink")  def stateData: DGet current state data of this FSM.
48. [**](../../akka/testkit/TestFSMRef.html#stateName:S "Permalink")  def stateName: SGet current state name of this FSM.
49. [**](../../akka/testkit/TestFSMRef.html#stop():Unit "Permalink")  def stop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Shuts down the actor and its message queue

Shuts down the actor and its message queue

Definition ClassesLocalActorRef → InternalActorRef
50. [**](../../akka/testkit/TestFSMRef.html#suspend():Unit "Permalink")  def suspend(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Suspends the actor so that it will not process messages until resumed.

Suspends the actor so that it will not process messages until resumed. The
suspend request is processed asynchronously to the caller of this method
as well as to normal message sends: the only ordering guarantee is that
message sends done from the same thread after calling this method will not
be processed until resumed.

Definition ClassesLocalActorRef → InternalActorRef
51. [**](../../akka/testkit/TestFSMRef.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
52. [**](../../akka/testkit/TestFSMRef.html#tell(msg:Any,sender:akka.actor.ActorRef):Unit "Permalink") final  def tell(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), sender: [ActorRef](../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sends the specified message to this ActorRef, i.e.

Sends the specified message to this ActorRef, i.e. fire\-and\-forget
semantics, including the sender reference if possible.

Pass [akka.actor.ActorRef](../actor/ActorRef.html) `noSender` or `null` as sender if there is nobody to reply to

Definition Classes[ActorRef](../actor/ActorRef.html)
53. [**](../../akka/testkit/TestFSMRef.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition Classes[TestActorRef](TestActorRef.html) → [ActorRef](../actor/ActorRef.html) → AnyRef → Any
54. [**](../../akka/testkit/TestFSMRef.html#underlying:akka.actor.ActorCell "Permalink")  def underlying: ActorCellDefinition ClassesLocalActorRef → ActorRefWithCell
55. [**](../../akka/testkit/TestFSMRef.html#underlyingActor:T "Permalink")  def underlyingActor: TRetrieve reference to the underlying actor, where the static type matches the factory used inside the
constructor.

Retrieve reference to the underlying actor, where the static type matches the factory used inside the
constructor. Beware that this reference is discarded by the ActorRef upon restarting the actor (should this
reference be linked to a supervisor). The old Actor may of course still be used in post\-mortem assertions.

Definition Classes[TestActorRef](TestActorRef.html)
56. [**](../../akka/testkit/TestFSMRef.html#unwatch(subject:akka.actor.ActorRef):akka.actor.ActorRef "Permalink")  def unwatch(subject: [ActorRef](../actor/ActorRef.html)): [ActorRef](../actor/ActorRef.html)Unregisters this actor from being a death monitor of the provided ActorRef
This means that this actor will not get a Terminated()\-message when the provided actor
is permanently terminated.

Unregisters this actor from being a death monitor of the provided ActorRef
This means that this actor will not get a Terminated()\-message when the provided actor
is permanently terminated.

returnsthe same ActorRef that is provided to it, to allow for cleaner invocations

Definition Classes[TestActorRef](TestActorRef.html)
57. [**](../../akka/testkit/TestFSMRef.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
58. [**](../../akka/testkit/TestFSMRef.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
59. [**](../../akka/testkit/TestFSMRef.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
60. [**](../../akka/testkit/TestFSMRef.html#watch(subject:akka.actor.ActorRef):akka.actor.ActorRef "Permalink")  def watch(subject: [ActorRef](../actor/ActorRef.html)): [ActorRef](../actor/ActorRef.html)Registers this actor to be a death monitor of the provided ActorRef
This means that this actor will get a Terminated()\-message when the provided actor
is permanently terminated.

Registers this actor to be a death monitor of the provided ActorRef
This means that this actor will get a Terminated()\-message when the provided actor
is permanently terminated.

returnsthe same ActorRef that is provided to it, to allow for cleaner invocations

Definition Classes[TestActorRef](TestActorRef.html)
61. [**](../../akka/testkit/TestFSMRef.html#writeReplace():AnyRef "Permalink")  def writeReplace(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected Definition ClassesLocalActorRefAnnotations@throws(classOf\[java.io.ObjectStreamException])
### Shadowed Implicit Value Members

1. [**](../../akka/testkit/TestFSMRef.html#!(message:Any)(implicitsender:akka.actor.ActorRef):Unit "Permalink")  def !(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../actor/Actor$.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API: Sends a one\-way asynchronous message.

Scala API: Sends a one\-way asynchronous message. E.g. fire\-and\-forget semantics.

If invoked from within an actor then the actor reference is implicitly passed on as the implicit 'sender' argument.

This actor 'sender' reference is then available in the receiving actor in the 'sender()' member variable,
if invoked from within an Actor. If not then no sender is available.

```

  actor ! message

```
ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(testFSMRef: ActorRef).!(message)(sender)
```
Definition Classes[ActorRef](../actor/ActorRef.html)
2. [**](../../akka/testkit/TestFSMRef.html#!(message:Any)(implicitsender:akka.actor.ActorRef):Unit "Permalink")  def !(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../actor/Actor$.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sends a one\-way asynchronous message.

Sends a one\-way asynchronous message. E.g. fire\-and\-forget semantics.

If invoked from within an actor then the actor reference is implicitly passed on as the implicit 'sender' argument.

This actor 'sender' reference is then available in the receiving actor in the 'sender()' member variable,
if invoked from within an Actor. If not then no sender is available.

```

  actor ! message

```
ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] to[ScalaActorRef](../actor/ScalaActorRef.html) performed by method actorRef2Scala in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(testFSMRef: ScalaActorRef).!(message)(sender)
```
Definition Classes[ScalaActorRef](../actor/ScalaActorRef.html)
3. [**](../../akka/testkit/TestFSMRef.html#compareTo(other:akka.actor.ActorRef):Int "Permalink") final  def compareTo(other: [ActorRef](../actor/ActorRef.html)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Comparison takes path and the unique id of the actor cell into account.

Comparison takes path and the unique id of the actor cell into account.

ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(testFSMRef: ActorRef).compareTo(other)
```
Definition Classes[ActorRef](../actor/ActorRef.html) → Comparable
4. [**](../../akka/testkit/TestFSMRef.html#equals(that:Any):Boolean "Permalink") final  def equals(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Equals takes path and the unique id of the actor cell into account.

Equals takes path and the unique id of the actor cell into account.

ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(testFSMRef: ActorRef).equals(that)
```
Definition Classes[ActorRef](../actor/ActorRef.html) → AnyRef → Any
5. [**](../../akka/testkit/TestFSMRef.html#forward(message:Any)(implicitcontext:akka.actor.ActorContext):Unit "Permalink")  def forward(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit context: [ActorContext](../actor/ActorContext.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Forwards the message and passes the original sender actor as the sender.

Forwards the message and passes the original sender actor as the sender.

Works, no matter whether originally sent with tell/'!' or ask/'?'.

ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(testFSMRef: ActorRef).forward(message)(context)
```
Definition Classes[ActorRef](../actor/ActorRef.html)
6. [**](../../akka/testkit/TestFSMRef.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(testFSMRef: ActorRef).hashCode()
```
Definition Classes[ActorRef](../actor/ActorRef.html) → AnyRef → Any
7. [**](../../akka/testkit/TestFSMRef.html#path:akka.actor.ActorPath "Permalink")  def path: [ActorPath](../actor/ActorPath.html)Returns the path for this actor (from this actor up to the root actor).

Returns the path for this actor (from this actor up to the root actor).

ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(testFSMRef: ActorRef).path
```
Definition Classes[ActorRef](../actor/ActorRef.html)
8. [**](../../akka/testkit/TestFSMRef.html#tell(msg:Any,sender:akka.actor.ActorRef):Unit "Permalink") final  def tell(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), sender: [ActorRef](../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sends the specified message to this ActorRef, i.e.

Sends the specified message to this ActorRef, i.e. fire\-and\-forget
semantics, including the sender reference if possible.

Pass [akka.actor.ActorRef](../actor/ActorRef.html) `noSender` or `null` as sender if there is nobody to reply to

ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(testFSMRef: ActorRef).tell(msg, sender)
```
Definition Classes[ActorRef](../actor/ActorRef.html)
9. [**](../../akka/testkit/TestFSMRef.html#toString():String "Permalink")  def toString(): StringImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(testFSMRef: ActorRef).toString()
```
Definition Classes[ActorRef](../actor/ActorRef.html) → AnyRef → Any
### Deprecated Value Members

1. [**](../../akka/testkit/TestFSMRef.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/TestFSMRef.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] toStringFormat\[TestFSMRef\[S, D, T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/TestFSMRef.html#setTimer(name:String,msg:Any,timeout:scala.concurrent.duration.FiniteDuration,repeat:Boolean):Unit "Permalink")  def setTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), repeat: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Proxy for [akka.actor.FSM\#setTimer](../actor/FSM.html#setTimer(name:String,msg:Any,timeout:scala.concurrent.duration.FiniteDuration,repeat:Boolean):Unit).

Proxy for [akka.actor.FSM\#setTimer](../actor/FSM.html#setTimer(name:String,msg:Any,timeout:scala.concurrent.duration.FiniteDuration,repeat:Boolean):Unit).

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use startTimerWithFixedDelay or startTimerAtFixedRate instead. This has the same semantics as startTimerAtFixedRate, but startTimerWithFixedDelay is often preferred.
4. [**](../../akka/testkit/TestFSMRef.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TestFSMRef\[S, D, T], B)ImplicitThis member is added by an implicit conversion from TestFSMRef\[S, D, T] toArrowAssoc\[TestFSMRef\[S, D, T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [TestActorRef](TestActorRef.html)\[T]

### Inherited from LocalActorRef

### Inherited from LocalRef

### Inherited from ActorRefScope

### Inherited from ActorRefWithCell

### Inherited from InternalActorRef

### Inherited from [ScalaActorRef](../actor/ScalaActorRef.html)

### Inherited from [ActorRef](../actor/ActorRef.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[[ActorRef](../actor/ActorRef.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion scala2ActorRef fromTestFSMRef\[S, D, T] to [ActorRef](../actor/ActorRef.html)

### Inherited by implicit conversion actorRef2Scala fromTestFSMRef\[S, D, T] to [ScalaActorRef](../actor/ScalaActorRef.html)

### Inherited by implicit conversion any2stringadd fromTestFSMRef\[S, D, T] to any2stringadd\[TestFSMRef\[S, D, T]]

### Inherited by implicit conversion StringFormat fromTestFSMRef\[S, D, T] to StringFormat\[TestFSMRef\[S, D, T]]

### Inherited by implicit conversion Ensuring fromTestFSMRef\[S, D, T] to Ensuring\[TestFSMRef\[S, D, T]]

### Inherited by implicit conversion ArrowAssoc fromTestFSMRef\[S, D, T] to ArrowAssoc\[TestFSMRef\[S, D, T]]

### Ungrouped

## Code Examples

### Example 1: classTestFSMRef[S,D,T <:Actor]extendsTestActorRef[T]

```text
val fsm = TestFSMRef(new Actor with LoggingFSM[Int, Null] {
    override def logDepth = 12
    startWith(1, null)
    when(1) {
      case Event("hello", _) => goto(2)
    }
    when(2) {
      case Event("world", _) => goto(1)
    }
  })
assert (fsm.stateName == 1)
fsm ! "hallo"
assert (fsm.stateName == 2)
assert (fsm.underlyingActor.getLog == IndexedSeq(FSMLogEntry(1, null, "hallo")))
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Actor$.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRefProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$Reason.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM.html
- https://doc.akka.io/api/akka/current/akka/actor/Props.html
- https://doc.akka.io/api/akka/current/akka/actor/ScalaActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/CallingThreadDispatcher$.html
- https://doc.akka.io/api/akka/current/akka/testkit/CallingThreadDispatcher.html
- https://doc.akka.io/api/akka/current/akka/testkit/CallingThreadDispatcherConfigurator.html
- https://doc.akka.io/api/akka/current/akka/testkit/CallingThreadMailbox.html
- https://doc.akka.io/api/akka/current/akka/testkit/CustomEventFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/DeadLettersFilter$.html
- https://doc.akka.io/api/akka/current/akka/testkit/DeadLettersFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/DebugFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/DefaultTimeout.html
- https://doc.akka.io/api/akka/current/akka/testkit/ErrorFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/EventFilter$.html
- https://doc.akka.io/api/akka/current/akka/testkit/EventFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/ExplicitlyTriggeredScheduler.html
- https://doc.akka.io/api/akka/current/akka/testkit/ImplicitSender.html
- https://doc.akka.io/api/akka/current/akka/testkit/InfoFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/JavaSerializable.html
- https://doc.akka.io/api/akka/current/akka/testkit/SocketUtil$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActorRef$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActorRef.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActors$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestBarrier$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestBarrier.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestBarrierTimeoutException.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestEvent$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestEvent.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestEventListener.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestException.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestFSMRef$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestFSMRef.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestJavaSerializer.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKit$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKit.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKitBase.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKitExtension$.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/testkit/TestFSMRef.html](https://doc.akka.io/api/akka/current/akka/testkit/TestFSMRef.html)*