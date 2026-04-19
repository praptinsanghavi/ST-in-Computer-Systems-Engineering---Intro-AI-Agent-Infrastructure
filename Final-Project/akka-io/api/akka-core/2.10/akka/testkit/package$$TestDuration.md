---
description: Akka 2.10.17 - akka.testkit.TestDuration
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:31:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/package$$TestDuration.html
title: Akka 2.10.17 - akka.testkit.TestDuration
---

# Akka 2.10.17 - akka.testkit.TestDuration

> **Summary:** Akka 2.10.17 - akka.testkit.TestDuration

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
- TestDuration
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
c[akka](../index.html).[testkit](index.html)

# TestDuration[**](../../akka/testkit/package$$TestDuration.html "Permalink")

### 

#### implicit final  class TestDuration extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Scala API. Scale timeouts (durations) during tests with the configured
'akka.test.timefactor'.
Implicit class providing `dilated` method.

```
import scala.concurrent.duration._
import akka.testkit._
10.milliseconds.dilated
```
Corresponding Java API is available in JavaTestKit.dilated()

Source[package.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/package.scala#L55)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestDuration
2. AnyVal
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

1. [**](../../akka/testkit/package$$TestDuration.html#<init>(duration:scala.concurrent.duration.FiniteDuration):akka.testkit.package.TestDuration "Permalink")  new TestDuration(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))
### Value Members

1. [**](../../akka/testkit/package$$TestDuration.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../akka/testkit/package$$TestDuration.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../akka/testkit/package$$TestDuration.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TestDuration toany2stringadd\[TestDuration] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/package$$TestDuration.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TestDuration, B)ImplicitThis member is added by an implicit conversion from TestDuration toArrowAssoc\[TestDuration] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/package$$TestDuration.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../akka/testkit/package$$TestDuration.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/testkit/package$$TestDuration.html#dilated(implicitsystem:akka.actor.ActorSystem):scala.concurrent.duration.FiniteDuration "Permalink")  def dilated(implicit system: [ActorSystem](../actor/ActorSystem.html)): [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
8. [**](../../akka/testkit/package$$TestDuration.html#duration:scala.concurrent.duration.FiniteDuration "Permalink")  val duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
9. [**](../../akka/testkit/package$$TestDuration.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TestDuration) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestDurationImplicitThis member is added by an implicit conversion from TestDuration toEnsuring\[TestDuration] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/testkit/package$$TestDuration.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TestDuration) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestDurationImplicitThis member is added by an implicit conversion from TestDuration toEnsuring\[TestDuration] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/testkit/package$$TestDuration.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestDurationImplicitThis member is added by an implicit conversion from TestDuration toEnsuring\[TestDuration] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/testkit/package$$TestDuration.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestDurationImplicitThis member is added by an implicit conversion from TestDuration toEnsuring\[TestDuration] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/testkit/package$$TestDuration.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
14. [**](../../akka/testkit/package$$TestDuration.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../akka/testkit/package$$TestDuration.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
### Deprecated Value Members

1. [**](../../akka/testkit/package$$TestDuration.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TestDuration toStringFormat\[TestDuration] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../akka/testkit/package$$TestDuration.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TestDuration, B)ImplicitThis member is added by an implicit conversion from TestDuration toArrowAssoc\[TestDuration] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTestDuration to any2stringadd\[TestDuration]

### Inherited by implicit conversion StringFormat fromTestDuration to StringFormat\[TestDuration]

### Inherited by implicit conversion Ensuring fromTestDuration to Ensuring\[TestDuration]

### Inherited by implicit conversion ArrowAssoc fromTestDuration to ArrowAssoc\[TestDuration]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
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
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/package$$TestDuration.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/testkit/package$$TestDuration.html](https://doc.akka.io/api/akka-core/2.10/akka/testkit/package$$TestDuration.html)*