---
description: Akka 2.10.17 - akka.testkit.WarningFilter
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:31:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/WarningFilter.html
title: Akka 2.10.17 - akka.testkit.WarningFilter
---

# Akka 2.10.17 - akka.testkit.WarningFilter

> **Summary:** Akka 2.10.17 - akka.testkit.WarningFilter

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
- WarningFilter
c[akka](../index.html).[testkit](index.html)

# WarningFilter[**](../../akka/testkit/WarningFilter.html "Permalink")

### 

#### final  case class WarningFilter(source: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], message: Either\[String, [Regex](https://www.scala-lang.org/api/2.13.17/scala/util/matching/Regex.html#scala.util.matching.Regex)], complete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(occurrences: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [EventFilter](EventFilter.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Filter which matches Warning events, if they satisfy the given criteria:

- `source`, if given, applies a filter on the event’s origin
- `message` applies a filter on the event’s message (either with String.startsWith or Regex.findFirstIn().isDefined)

If you want to match all Warning events, the most efficient is to use `Left("")`.

Source[TestEventListener.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/TestEventListener.scala#L374)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [EventFilter](EventFilter.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. WarningFilter
2. Serializable
3. Product
4. Equals
5. EventFilter
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

1. [**](../../akka/testkit/WarningFilter.html#<init>(source:String,message:String,pattern:Boolean,complete:Boolean,occurrences:Int):akka.testkit.WarningFilter "Permalink")  new WarningFilter(source: String, message: String, pattern: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), complete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), occurrences: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))Java API: create a WarningFilter

Java API: create a WarningFilter

source
 apply this filter only to events from the given source; do not filter on source if this is given as `null`

message
 apply this filter only to events whose message matches; do not filter on message if this is given as `null`

pattern
 if `false`, the message string must start with the given
 string, otherwise the `message` argument is treated as
 regular expression which is matched against the message (may match only
 a substring to filter)

complete
 whether the event’s message must match the given message string or pattern completely
2. [**](../../akka/testkit/WarningFilter.html#<init>(source:Option[String],message:Either[String,scala.util.matching.Regex],complete:Boolean)(occurrences:Int):akka.testkit.WarningFilter "Permalink")  new WarningFilter(source: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], message: Either\[String, [Regex](https://www.scala-lang.org/api/2.13.17/scala/util/matching/Regex.html#scala.util.matching.Regex)], complete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(occurrences: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
### Value Members

1. [**](../../akka/testkit/WarningFilter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/WarningFilter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/WarningFilter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from WarningFilter toany2stringadd\[WarningFilter] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/WarningFilter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (WarningFilter, B)ImplicitThis member is added by an implicit conversion from WarningFilter toArrowAssoc\[WarningFilter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/WarningFilter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/WarningFilter.html#apply(event:akka.event.Logging.LogEvent):Boolean "Permalink") final  def apply(event: [LogEvent](../event/Logging$$LogEvent.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[EventFilter](EventFilter.html)
7. [**](../../akka/testkit/WarningFilter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/testkit/WarningFilter.html#assertDone(max:scala.concurrent.duration.Duration):Unit "Permalink")  def assertDone(max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that this filter has matched as often as requested by its
`occurrences` parameter specifies.

Assert that this filter has matched as often as requested by its
`occurrences` parameter specifies.

Definition Classes[EventFilter](EventFilter.html)
9. [**](../../akka/testkit/WarningFilter.html#awaitDone(max:scala.concurrent.duration.Duration):Boolean "Permalink")  def awaitDone(max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[EventFilter](EventFilter.html)
10. [**](../../akka/testkit/WarningFilter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/testkit/WarningFilter.html#complete:Boolean "Permalink")  val complete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesWarningFilter → [EventFilter](EventFilter.html)
12. [**](../../akka/testkit/WarningFilter.html#doMatch(src:String,msg:Any):Boolean "Permalink")  def doMatch(src: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)internal implementation helper, no guaranteed API

internal implementation helper, no guaranteed API

Attributesprotected Definition Classes[EventFilter](EventFilter.html)
13. [**](../../akka/testkit/WarningFilter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (WarningFilter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WarningFilterImplicitThis member is added by an implicit conversion from WarningFilter toEnsuring\[WarningFilter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/testkit/WarningFilter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (WarningFilter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WarningFilterImplicitThis member is added by an implicit conversion from WarningFilter toEnsuring\[WarningFilter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/testkit/WarningFilter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WarningFilterImplicitThis member is added by an implicit conversion from WarningFilter toEnsuring\[WarningFilter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/testkit/WarningFilter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WarningFilterImplicitThis member is added by an implicit conversion from WarningFilter toEnsuring\[WarningFilter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/testkit/WarningFilter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/testkit/WarningFilter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/testkit/WarningFilter.html#intercept[T](code:=>T)(implicitsystem:akka.actor.ActorSystem):T "Permalink")  def intercept\[T](code: \=\> T)(implicit system: [ActorSystem](../actor/ActorSystem.html)): TApply this filter while executing the given code block.

Apply this filter while executing the given code block. Care is taken to
remove the filter when the block is finished or aborted.

Definition Classes[EventFilter](EventFilter.html)
20. [**](../../akka/testkit/WarningFilter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../akka/testkit/WarningFilter.html#matches(event:akka.event.Logging.LogEvent):Boolean "Permalink")  def matches(event: [LogEvent](../event/Logging$$LogEvent.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)This method decides whether to filter the event (`true`) or not
(`false`).

This method decides whether to filter the event (`true`) or not
(`false`).

Definition ClassesWarningFilter → [EventFilter](EventFilter.html)
22. [**](../../akka/testkit/WarningFilter.html#message:Either[String,scala.util.matching.Regex] "Permalink")  val message: Either\[String, [Regex](https://www.scala-lang.org/api/2.13.17/scala/util/matching/Regex.html#scala.util.matching.Regex)]Definition ClassesWarningFilter → [EventFilter](EventFilter.html)
23. [**](../../akka/testkit/WarningFilter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/testkit/WarningFilter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/testkit/WarningFilter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/testkit/WarningFilter.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
27. [**](../../akka/testkit/WarningFilter.html#source:Option[String] "Permalink")  val source: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Definition ClassesWarningFilter → [EventFilter](EventFilter.html)
28. [**](../../akka/testkit/WarningFilter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../akka/testkit/WarningFilter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../akka/testkit/WarningFilter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../akka/testkit/WarningFilter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/WarningFilter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/WarningFilter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from WarningFilter toStringFormat\[WarningFilter] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/WarningFilter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (WarningFilter, B)ImplicitThis member is added by an implicit conversion from WarningFilter toArrowAssoc\[WarningFilter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [EventFilter](EventFilter.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromWarningFilter to any2stringadd\[WarningFilter]

### Inherited by implicit conversion StringFormat fromWarningFilter to StringFormat\[WarningFilter]

### Inherited by implicit conversion Ensuring fromWarningFilter to Ensuring\[WarningFilter]

### Inherited by implicit conversion ArrowAssoc fromWarningFilter to ArrowAssoc\[WarningFilter]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogEvent.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/testkit/WarningFilter.html](https://doc.akka.io/api/akka-core/2.10/akka/testkit/WarningFilter.html)*