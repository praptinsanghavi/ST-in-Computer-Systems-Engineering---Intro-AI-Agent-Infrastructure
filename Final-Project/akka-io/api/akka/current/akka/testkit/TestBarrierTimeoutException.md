---
description: Akka 2.10.17 - akka.testkit.TestBarrierTimeoutException
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:46:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/TestBarrierTimeoutException.html
title: Akka 2.10.17 - akka.testkit.TestBarrierTimeoutException
---

# Akka 2.10.17 - akka.testkit.TestBarrierTimeoutException

> **Summary:** Akka 2.10.17 - akka.testkit.TestBarrierTimeoutException

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
- TestBarrierTimeoutException
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
c[akka](../index.html).[testkit](index.html)

# TestBarrierTimeoutException[**](../../akka/testkit/TestBarrierTimeoutException.html "Permalink")

### 

#### class TestBarrierTimeoutException extends RuntimeException

Source[TestBarrier.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/TestBarrier.scala#L14)Linear Supertypes[RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestBarrierTimeoutException
2. RuntimeException
3. Exception
4. Throwable
5. Serializable
6. AnyRef
7. Any
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

1. [**](../../akka/testkit/TestBarrierTimeoutException.html#<init>(message:String):akka.testkit.TestBarrierTimeoutException "Permalink")  new TestBarrierTimeoutException(message: String)
### Value Members

1. [**](../../akka/testkit/TestBarrierTimeoutException.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/TestBarrierTimeoutException.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/TestBarrierTimeoutException.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TestBarrierTimeoutException toany2stringadd\[TestBarrierTimeoutException] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/TestBarrierTimeoutException.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TestBarrierTimeoutException, B)ImplicitThis member is added by an implicit conversion from TestBarrierTimeoutException toArrowAssoc\[TestBarrierTimeoutException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/TestBarrierTimeoutException.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/TestBarrierTimeoutException.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
7. [**](../../akka/testkit/TestBarrierTimeoutException.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/testkit/TestBarrierTimeoutException.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/testkit/TestBarrierTimeoutException.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TestBarrierTimeoutException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestBarrierTimeoutExceptionImplicitThis member is added by an implicit conversion from TestBarrierTimeoutException toEnsuring\[TestBarrierTimeoutException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/testkit/TestBarrierTimeoutException.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TestBarrierTimeoutException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestBarrierTimeoutExceptionImplicitThis member is added by an implicit conversion from TestBarrierTimeoutException toEnsuring\[TestBarrierTimeoutException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/testkit/TestBarrierTimeoutException.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestBarrierTimeoutExceptionImplicitThis member is added by an implicit conversion from TestBarrierTimeoutException toEnsuring\[TestBarrierTimeoutException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/testkit/TestBarrierTimeoutException.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestBarrierTimeoutExceptionImplicitThis member is added by an implicit conversion from TestBarrierTimeoutException toEnsuring\[TestBarrierTimeoutException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/testkit/TestBarrierTimeoutException.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/testkit/TestBarrierTimeoutException.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/testkit/TestBarrierTimeoutException.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
16. [**](../../akka/testkit/TestBarrierTimeoutException.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
17. [**](../../akka/testkit/TestBarrierTimeoutException.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/testkit/TestBarrierTimeoutException.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
19. [**](../../akka/testkit/TestBarrierTimeoutException.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
20. [**](../../akka/testkit/TestBarrierTimeoutException.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
21. [**](../../akka/testkit/TestBarrierTimeoutException.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
22. [**](../../akka/testkit/TestBarrierTimeoutException.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/testkit/TestBarrierTimeoutException.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
24. [**](../../akka/testkit/TestBarrierTimeoutException.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../akka/testkit/TestBarrierTimeoutException.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../akka/testkit/TestBarrierTimeoutException.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/testkit/TestBarrierTimeoutException.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/testkit/TestBarrierTimeoutException.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
29. [**](../../akka/testkit/TestBarrierTimeoutException.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
30. [**](../../akka/testkit/TestBarrierTimeoutException.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
31. [**](../../akka/testkit/TestBarrierTimeoutException.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
32. [**](../../akka/testkit/TestBarrierTimeoutException.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../akka/testkit/TestBarrierTimeoutException.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
34. [**](../../akka/testkit/TestBarrierTimeoutException.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../akka/testkit/TestBarrierTimeoutException.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../akka/testkit/TestBarrierTimeoutException.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/TestBarrierTimeoutException.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/TestBarrierTimeoutException.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TestBarrierTimeoutException toStringFormat\[TestBarrierTimeoutException] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/TestBarrierTimeoutException.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TestBarrierTimeoutException, B)ImplicitThis member is added by an implicit conversion from TestBarrierTimeoutException toArrowAssoc\[TestBarrierTimeoutException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTestBarrierTimeoutException to any2stringadd\[TestBarrierTimeoutException]

### Inherited by implicit conversion StringFormat fromTestBarrierTimeoutException to StringFormat\[TestBarrierTimeoutException]

### Inherited by implicit conversion Ensuring fromTestBarrierTimeoutException to Ensuring\[TestBarrierTimeoutException]

### Inherited by implicit conversion ArrowAssoc fromTestBarrierTimeoutException to ArrowAssoc\[TestBarrierTimeoutException]

### Ungrouped

## Related Pages (Internal Links)

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
- https://doc.akka.io/api/akka/current/akka/testkit/package$$TestDuration.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/testkit/TestBarrierTimeoutException.html](https://doc.akka.io/api/akka/current/akka/testkit/TestBarrierTimeoutException.html)*