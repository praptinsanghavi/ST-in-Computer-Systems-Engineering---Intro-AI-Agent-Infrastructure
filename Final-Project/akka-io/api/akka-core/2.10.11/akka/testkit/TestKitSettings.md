---
description: Akka 2.10.11 - akka.testkit.TestKitSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:17:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/TestKitSettings.html
title: Akka 2.10.11 - akka.testkit.TestKitSettings
---

# Akka 2.10.11 - akka.testkit.TestKitSettings

> **Summary:** Akka 2.10.11 - akka.testkit.TestKitSettings

## Content

Akka2\.10\.11 \< Back****# Packages

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
- TestKitSettings
- [TestLatch](TestLatch.html)
- [TestProbe](TestProbe.html "TestKit-based probe which allows sending, reception and reply.")
- [WarningFilter](WarningFilter.html "Filter which matches Warning events, if they satisfy the given criteria:")
c[akka](../index.html).[testkit](index.html)

# TestKitSettings[**](../../akka/testkit/TestKitSettings.html "Permalink")

### 

#### class TestKitSettings extends [Extension](../actor/Extension.html)

Source[TestKitExtension.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-testkit/src/main/scala/akka/testkit/TestKitExtension.scala#L21)Linear Supertypes[Extension](../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestKitSettings
2. Extension
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

1. [**](../../akka/testkit/TestKitSettings.html#<init>(config:com.typesafe.config.Config):akka.testkit.TestKitSettings "Permalink")  new TestKitSettings(config: Config)
### Value Members

1. [**](../../akka/testkit/TestKitSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/TestKitSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/TestKitSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TestKitSettings toany2stringadd\[TestKitSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/TestKitSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TestKitSettings, B)ImplicitThis member is added by an implicit conversion from TestKitSettings toArrowAssoc\[TestKitSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/TestKitSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/TestKitSettings.html#DefaultTimeout:akka.util.Timeout "Permalink")  val DefaultTimeout: [Timeout](../util/Timeout.html)
7. [**](../../akka/testkit/TestKitSettings.html#ExpectNoMessageDefaultTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val ExpectNoMessageDefaultTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
8. [**](../../akka/testkit/TestKitSettings.html#SingleExpectDefaultTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val SingleExpectDefaultTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
9. [**](../../akka/testkit/TestKitSettings.html#TestEventFilterLeeway:scala.concurrent.duration.FiniteDuration "Permalink")  val TestEventFilterLeeway: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
10. [**](../../akka/testkit/TestKitSettings.html#TestTimeFactor:Double "Permalink")  val TestTimeFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
11. [**](../../akka/testkit/TestKitSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../akka/testkit/TestKitSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/testkit/TestKitSettings.html#config:com.typesafe.config.Config "Permalink")  val config: Config
14. [**](../../akka/testkit/TestKitSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TestKitSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestKitSettingsImplicitThis member is added by an implicit conversion from TestKitSettings toEnsuring\[TestKitSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/testkit/TestKitSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TestKitSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestKitSettingsImplicitThis member is added by an implicit conversion from TestKitSettings toEnsuring\[TestKitSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/testkit/TestKitSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestKitSettingsImplicitThis member is added by an implicit conversion from TestKitSettings toEnsuring\[TestKitSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/testkit/TestKitSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestKitSettingsImplicitThis member is added by an implicit conversion from TestKitSettings toEnsuring\[TestKitSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/testkit/TestKitSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/testkit/TestKitSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../akka/testkit/TestKitSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/testkit/TestKitSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/testkit/TestKitSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../akka/testkit/TestKitSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/testkit/TestKitSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/testkit/TestKitSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/testkit/TestKitSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../akka/testkit/TestKitSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../akka/testkit/TestKitSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../akka/testkit/TestKitSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../akka/testkit/TestKitSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/TestKitSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/TestKitSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TestKitSettings toStringFormat\[TestKitSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/TestKitSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TestKitSettings, B)ImplicitThis member is added by an implicit conversion from TestKitSettings toArrowAssoc\[TestKitSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTestKitSettings to any2stringadd\[TestKitSettings]

### Inherited by implicit conversion StringFormat fromTestKitSettings to StringFormat\[TestKitSettings]

### Inherited by implicit conversion Ensuring fromTestKitSettings to Ensuring\[TestKitSettings]

### Inherited by implicit conversion ArrowAssoc fromTestKitSettings to ArrowAssoc\[TestKitSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/CallingThreadDispatcher$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/CallingThreadDispatcher.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/CallingThreadDispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/CallingThreadMailbox.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/CustomEventFilter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/DeadLettersFilter$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/DeadLettersFilter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/DebugFilter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/DefaultTimeout.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/ErrorFilter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/EventFilter$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/EventFilter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/ExplicitlyTriggeredScheduler.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/ImplicitSender.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/InfoFilter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/JavaSerializable.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/SocketUtil$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestActor$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestActor.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestActorRef$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestActors$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestBarrier$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestBarrier.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestBarrierTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestEvent$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestEvent.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestEventListener.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestFSMRef$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestFSMRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestJavaSerializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestKit$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestKit.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestKitBase.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestKitExtension$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestKitSettings.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestLatch$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestLatch.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestProbe$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestProbe.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/WarningFilter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/package$$TestDuration.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10.11/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestKitSettings.html](https://doc.akka.io/api/akka-core/2.10.11/akka/testkit/TestKitSettings.html)*