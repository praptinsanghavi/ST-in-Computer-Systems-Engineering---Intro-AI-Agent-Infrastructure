---
description: Akka 2.10.17 - akka.testkit.TestActors
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:31:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/TestActors$.html
title: Akka 2.10.17 - akka.testkit.TestActors
---

# Akka 2.10.17 - akka.testkit.TestActors

> **Summary:** Akka 2.10.17 - akka.testkit.TestActors

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
- TestActors
- [TestBarrier](TestBarrier.html)
- [TestBarrierTimeoutException](TestBarrierTimeoutException.html)
- [TestDuration](package$$TestDuration.html "Scala API.")
- [TestEvent](TestEvent.html "Implementation helpers of the EventFilter facilities: send Mute to the TestEventListener to install a filter, and UnMute to uninstall it.")
- [TestEventListener](TestEventListener.html "EventListener for running tests, which allows selectively filtering out expected messages.")
- [TestException](TestException.html "A predefined exception that can be used in tests.")
- [TestFSMRef](TestFSMRef.html "This is a specialized form of the TestActorRef with support for querying and setting the state of a FSM.")
- [TestJavaSerializer](TestJavaSerializer.html "This Serializer uses standard Java Serialization and is useful for tests where ad-hoc messages are created and sent between actor systems.")
- [TestKit](TestKit.html "Test kit for testing actors.")
- [TestKitBase](TestKitBase.html "Implementation trait behind the akka.testkit.TestKit class: you may use this if inheriting from a concrete class is not possible.")
- [TestKitExtension](TestKitExtension$.html)
- [TestKitSettings](TestKitSettings.html)
- [TestLatch](TestLatch.html)
- [TestProbe](TestProbe.html "TestKit-based probe which allows sending, reception and reply.")
- [WarningFilter](WarningFilter.html "Filter which matches Warning events, if they satisfy the given criteria:")
o[akka](../index.html).[testkit](index.html)

# TestActors[**](../../akka/testkit/TestActors$.html "Permalink")

### 

#### object TestActors

A collection of common actor patterns used in tests.

Source[TestActors.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/TestActors.scala#L12)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestActors
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/testkit/TestActors$$BlackholeActor.html "Permalink")  class [BlackholeActor](TestActors$$BlackholeActor.html "BlackholeActor does nothing for incoming messages, its like a blackhole.") extends [Actor](../actor/Actor.html)BlackholeActor does nothing for incoming messages, its like a blackhole.
2. [**](../../akka/testkit/TestActors$$EchoActor.html "Permalink")  class [EchoActor](TestActors$$EchoActor.html "EchoActor sends back received messages (unmodified).") extends [Actor](../actor/Actor.html)EchoActor sends back received messages (unmodified).
3. [**](../../akka/testkit/TestActors$$ForwardActor.html "Permalink")  class [ForwardActor](TestActors$$ForwardActor.html "ForwardActor forwards all messages as-is to specified ActorRef.") extends [Actor](../actor/Actor.html)ForwardActor forwards all messages as\-is to specified ActorRef.
### Value Members

1. [**](../../akka/testkit/TestActors$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/TestActors$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/TestActors$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/testkit/TestActors$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/testkit/TestActors$.html#blackholeProps:akka.actor.Props "Permalink")  val blackholeProps: [Props](../actor/Props.html)
6. [**](../../akka/testkit/TestActors$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../akka/testkit/TestActors$.html#echoActorProps:akka.actor.Props "Permalink")  val echoActorProps: [Props](../actor/Props.html)
8. [**](../../akka/testkit/TestActors$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../akka/testkit/TestActors$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../akka/testkit/TestActors$.html#forwardActorProps(ref:akka.actor.ActorRef):akka.actor.Props "Permalink")  def forwardActorProps(ref: [ActorRef](../actor/ActorRef.html)): [Props](../actor/Props.html)
11. [**](../../akka/testkit/TestActors$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/testkit/TestActors$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/testkit/TestActors$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../akka/testkit/TestActors$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/testkit/TestActors$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/testkit/TestActors$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/testkit/TestActors$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../akka/testkit/TestActors$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../akka/testkit/TestActors$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../akka/testkit/TestActors$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../akka/testkit/TestActors$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/TestActors$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/CallingThreadDispatcher$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/CallingThreadDispatcher.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/CallingThreadDispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/CallingThreadMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/CustomEventFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/DeadLettersFilter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/DeadLettersFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/DebugFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/DefaultTimeout.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/ErrorFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/EventFilter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/EventFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/ExplicitlyTriggeredScheduler.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/ImplicitSender.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/InfoFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/JavaSerializable.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/SocketUtil$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActorRef$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActors$$BlackholeActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActors$$EchoActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActors$$ForwardActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActors$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestBarrier$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestBarrier.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestBarrierTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestEvent$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestEventListener.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestException.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestFSMRef$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestFSMRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestJavaSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKitBase.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKitExtension$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKitSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestLatch$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestLatch.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestProbe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/WarningFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActors$.html](https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActors$.html)*