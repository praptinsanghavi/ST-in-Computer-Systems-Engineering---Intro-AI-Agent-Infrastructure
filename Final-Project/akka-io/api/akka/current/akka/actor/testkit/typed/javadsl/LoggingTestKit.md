---
description: Akka 2.10.17 - akka.actor.testkit.typed.javadsl.LoggingTestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:46:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
title: Akka 2.10.17 - akka.actor.testkit.typed.javadsl.LoggingTestKit
---

# Akka 2.10.17 - akka.actor.testkit.typed.javadsl.LoggingTestKit

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.javadsl.LoggingTestKit

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
- LoggingTestKit
- [ManualTime](ManualTime.html "Not for user instantiation, see ManualTime#get")
- [ReplyInbox](ReplyInbox.html "Similar to an akka.actor.testkit.typed.javadsl.TestInbox, but can only ever give access to a single message (a reply).")
- [SerializationTestKit](SerializationTestKit.html "Utilities to test serialization.")
- [StatusReplyInbox](StatusReplyInbox.html "A akka.actor.testkit.typed.javadsl.ReplyInbox which specially handles akka.pattern.StatusReply.")
- [TestInbox](TestInbox.html "Utility for use as an ActorRef when *synchronously* testing akka.actor.typed.Behavior with akka.actor.testkit.typed.javadsl.BehaviorTestKit.")
- [TestKitJunitResource](TestKitJunitResource.html "A Junit external resource for the ActorTestKit, making it possible to have Junit manage the lifecycle of the testkit.")
- [TestProbe](TestProbe.html "Java API: * Create instances through the create factories in the TestProbe companion or via ActorTestKit#createTestProbe.")
[c](LoggingTestKit$.html "See companion object")[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[javadsl](index.html)

# [LoggingTestKit](LoggingTestKit$.html "See companion object")[**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html "Permalink")

### Companion [object LoggingTestKit](LoggingTestKit$.html "See companion object")

#### abstract  class LoggingTestKit extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Facilities for verifying logs.

Requires Logback.

See the static factory methods as starting point for creating `LoggingTestKit`.

Not for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() Source[LoggingTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/javadsl/LoggingTestKit.scala#L25)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LoggingTestKit
2. AnyRef
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

1. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#<init>():akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink")  new LoggingTestKit()
### Abstract Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#expect[T](system:akka.actor.typed.ActorSystem[_],code:java.util.function.Supplier[T]):T "Permalink") abstract  def expect\[T](system: [typed.ActorSystem](../../../typed/ActorSystem.html)\[\_], code: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[T]): TRun the given code block and assert that the criteria of this `LoggingTestKit` has
matched within the configured `akka.actor.testkit.typed.filter-leeway`
as often as requested by its `occurrences` parameter specifies.

Run the given code block and assert that the criteria of this `LoggingTestKit` has
matched within the configured `akka.actor.testkit.typed.filter-leeway`
as often as requested by its `occurrences` parameter specifies.

Care is taken to remove the testkit when the block is finished or aborted.
2. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#matches(event:akka.actor.testkit.typed.LoggingEvent):Boolean "Permalink") abstract  def matches(event: [LoggingEvent](../LoggingEvent.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)returns`true` if the event matches the conditions of the filter.
3. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#withCause(newCause:Class[_<:Throwable]):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink") abstract  def withCause(newCause: Class\[\_ \<: Throwable]): LoggingTestKitMatching events with an included `throwable` that is a class or subclass of the given
`Throwable` class.
4. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#withCheckExcess(check:Boolean):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink") abstract  def withCheckExcess(check: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LoggingTestKitAfter matching the expected number of hits, check for excess messages
5. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#withCustom(newCustom:Function[akka.actor.testkit.typed.LoggingEvent,Boolean]):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink") abstract  def withCustom(newCustom: Function\[[LoggingEvent](../LoggingEvent.html), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): LoggingTestKitMatching events for which the supplied function returns `true`.
6. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#withLogLevel(newLogLevel:org.slf4j.event.Level):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink") abstract  def withLogLevel(newLogLevel: Level): LoggingTestKitMatching events with the given log level.
7. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#withLoggerName(newLoggerName:String):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink") abstract  def withLoggerName(newLoggerName: String): LoggingTestKitMatching events with the given logger name or sub\-names in the same way
as configuration loggers are configured in logback.xml.

Matching events with the given logger name or sub\-names in the same way
as configuration loggers are configured in logback.xml.
By default the root logger is used.
8. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#withMdc(newMdc:java.util.Map[String,String]):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink") abstract  def withMdc(newMdc: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String]): LoggingTestKitMatching events with MDC containing all entries of the given `Map`.

Matching events with MDC containing all entries of the given `Map`.
The event MDC may have more entries than the given `Map`.
9. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#withMessageContains(newMessageContains:String):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink") abstract  def withMessageContains(newMessageContains: String): LoggingTestKitMatching events with a message that contains the given value.
10. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#withMessageRegex(newMessageRegex:String):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink") abstract  def withMessageRegex(newMessageRegex: String): LoggingTestKitMatching events with a message that matches the given regular expression.
11. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#withOccurrences(newOccurrences:Int):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink") abstract  def withOccurrences(newOccurrences: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): LoggingTestKitNumber of events the testkit is supposed to match.

Number of events the testkit is supposed to match. By default 1\.

When occurrences \> 0 it will not look for excess messages that are logged asynchronously
outside (after) the `intercept` thunk and it has already found expected number.

When occurrences is 0 it will look for unexpected matching events, and then it will
also look for excess messages during the configured `akka.actor.testkit.typed.expect-no-message-default`
duration.
12. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#withSource(newSource:String):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink") abstract  def withSource(newSource: String): LoggingTestKitMatching events that have "akkaSource" MDC value equal to the given value.

Matching events that have "akkaSource" MDC value equal to the given value.
"akkaSource" is typically the actor path.
### Concrete Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LoggingTestKit toany2stringadd\[LoggingTestKit] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LoggingTestKit, B)ImplicitThis member is added by an implicit conversion from LoggingTestKit toArrowAssoc\[LoggingTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LoggingTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LoggingTestKitImplicitThis member is added by an implicit conversion from LoggingTestKit toEnsuring\[LoggingTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LoggingTestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LoggingTestKitImplicitThis member is added by an implicit conversion from LoggingTestKit toEnsuring\[LoggingTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LoggingTestKitImplicitThis member is added by an implicit conversion from LoggingTestKit toEnsuring\[LoggingTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LoggingTestKitImplicitThis member is added by an implicit conversion from LoggingTestKit toEnsuring\[LoggingTestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LoggingTestKit toStringFormat\[LoggingTestKit] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LoggingTestKit, B)ImplicitThis member is added by an implicit conversion from LoggingTestKit toArrowAssoc\[LoggingTestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLoggingTestKit to any2stringadd\[LoggingTestKit]

### Inherited by implicit conversion StringFormat fromLoggingTestKit to StringFormat\[LoggingTestKit]

### Inherited by implicit conversion Ensuring fromLoggingTestKit to Ensuring\[LoggingTestKit]

### Inherited by implicit conversion ArrowAssoc fromLoggingTestKit to ArrowAssoc\[LoggingTestKit]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/LoggingEvent.html
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
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit.html](https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit.html)*