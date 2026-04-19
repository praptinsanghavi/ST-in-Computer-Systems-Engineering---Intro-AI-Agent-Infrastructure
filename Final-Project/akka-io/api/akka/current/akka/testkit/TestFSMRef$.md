---
description: Akka 2.10.17 - akka.testkit.TestFSMRef
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:46:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/TestFSMRef$.html
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
- [TestFSMRef](TestFSMRef.html "This is a specialized form of the TestActorRef with support for querying and setting the state of a FSM.")
- [TestJavaSerializer](TestJavaSerializer.html "This Serializer uses standard Java Serialization and is useful for tests where ad-hoc messages are created and sent between actor systems.")
- [TestKit](TestKit.html "Test kit for testing actors.")
- [TestKitBase](TestKitBase.html "Implementation trait behind the akka.testkit.TestKit class: you may use this if inheriting from a concrete class is not possible.")
- [TestKitExtension](TestKitExtension$.html)
- [TestKitSettings](TestKitSettings.html)
- [TestLatch](TestLatch.html)
- [TestProbe](TestProbe.html "TestKit-based probe which allows sending, reception and reply.")
- [WarningFilter](WarningFilter.html "Filter which matches Warning events, if they satisfy the given criteria:")
[o](TestFSMRef.html "See companion class")[akka](../index.html).[testkit](index.html)

# [TestFSMRef](TestFSMRef.html "See companion class")[**](../../akka/testkit/TestFSMRef$.html "Permalink")

### Companion [class TestFSMRef](TestFSMRef.html "See companion class")

#### object TestFSMRef extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[TestFSMRef.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/TestFSMRef.scala#L111)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestFSMRef
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/testkit/TestFSMRef$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/TestFSMRef$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/TestFSMRef$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/testkit/TestFSMRef$.html#apply[S,D,T<:akka.actor.Actor](factory:=>T,supervisor:akka.actor.ActorRef)(implicitevidence$4:scala.reflect.ClassTag[T],implicitev:T<:<akka.actor.FSM[S,D],implicitsystem:akka.actor.ActorSystem):akka.testkit.TestFSMRef[S,D,T] "Permalink")  def apply\[S, D, T \<: [Actor](../actor/Actor.html)](factory: \=\> T, supervisor: [ActorRef](../actor/ActorRef.html))(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T], ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[T, [FSM](../actor/FSM.html)\[S, D]], system: [ActorSystem](../actor/ActorSystem.html)): [TestFSMRef](TestFSMRef.html)\[S, D, T]
5. [**](../../akka/testkit/TestFSMRef$.html#apply[S,D,T<:akka.actor.Actor](factory:=>T,supervisor:akka.actor.ActorRef,name:String)(implicitevidence$3:scala.reflect.ClassTag[T],implicitev:T<:<akka.actor.FSM[S,D],implicitsystem:akka.actor.ActorSystem):akka.testkit.TestFSMRef[S,D,T] "Permalink")  def apply\[S, D, T \<: [Actor](../actor/Actor.html)](factory: \=\> T, supervisor: [ActorRef](../actor/ActorRef.html), name: String)(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T], ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[T, [FSM](../actor/FSM.html)\[S, D]], system: [ActorSystem](../actor/ActorSystem.html)): [TestFSMRef](TestFSMRef.html)\[S, D, T]
6. [**](../../akka/testkit/TestFSMRef$.html#apply[S,D,T<:akka.actor.Actor](factory:=>T,name:String)(implicitevidence$2:scala.reflect.ClassTag[T],implicitev:T<:<akka.actor.FSM[S,D],implicitsystem:akka.actor.ActorSystem):akka.testkit.TestFSMRef[S,D,T] "Permalink")  def apply\[S, D, T \<: [Actor](../actor/Actor.html)](factory: \=\> T, name: String)(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T], ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[T, [FSM](../actor/FSM.html)\[S, D]], system: [ActorSystem](../actor/ActorSystem.html)): [TestFSMRef](TestFSMRef.html)\[S, D, T]
7. [**](../../akka/testkit/TestFSMRef$.html#apply[S,D,T<:akka.actor.Actor](factory:=>T)(implicitevidence$1:scala.reflect.ClassTag[T],implicitev:T<:<akka.actor.FSM[S,D],implicitsystem:akka.actor.ActorSystem):akka.testkit.TestFSMRef[S,D,T] "Permalink")  def apply\[S, D, T \<: [Actor](../actor/Actor.html)](factory: \=\> T)(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T], ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[T, [FSM](../actor/FSM.html)\[S, D]], system: [ActorSystem](../actor/ActorSystem.html)): [TestFSMRef](TestFSMRef.html)\[S, D, T]
8. [**](../../akka/testkit/TestFSMRef$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/testkit/TestFSMRef$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/testkit/TestFSMRef$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../akka/testkit/TestFSMRef$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../akka/testkit/TestFSMRef$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/testkit/TestFSMRef$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/testkit/TestFSMRef$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../akka/testkit/TestFSMRef$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/testkit/TestFSMRef$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/testkit/TestFSMRef$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/testkit/TestFSMRef$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../akka/testkit/TestFSMRef$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../akka/testkit/TestFSMRef$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../akka/testkit/TestFSMRef$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../akka/testkit/TestFSMRef$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/TestFSMRef$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM.html
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
- https://doc.akka.io/api/akka/current/akka/testkit/TestKitSettings.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestLatch$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestLatch.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestProbe$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestProbe.html
- https://doc.akka.io/api/akka/current/akka/testkit/WarningFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/internal/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/testkit/TestFSMRef$.html](https://doc.akka.io/api/akka/current/akka/testkit/TestFSMRef$.html)*