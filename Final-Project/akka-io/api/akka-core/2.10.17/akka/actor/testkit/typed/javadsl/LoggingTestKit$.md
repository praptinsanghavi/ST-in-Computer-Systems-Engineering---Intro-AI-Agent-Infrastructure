---
description: Akka 2.10.17 - akka.actor.testkit.typed.javadsl.LoggingTestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:24:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/javadsl/LoggingTestKit$.html
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
- [LoggingTestKit](LoggingTestKit.html "Facilities for verifying logs.")
- [ManualTime](ManualTime.html "Not for user instantiation, see ManualTime#get")
- [ReplyInbox](ReplyInbox.html "Similar to an akka.actor.testkit.typed.javadsl.TestInbox, but can only ever give access to a single message (a reply).")
- [SerializationTestKit](SerializationTestKit.html "Utilities to test serialization.")
- [StatusReplyInbox](StatusReplyInbox.html "A akka.actor.testkit.typed.javadsl.ReplyInbox which specially handles akka.pattern.StatusReply.")
- [TestInbox](TestInbox.html "Utility for use as an ActorRef when *synchronously* testing akka.actor.typed.Behavior with akka.actor.testkit.typed.javadsl.BehaviorTestKit.")
- [TestKitJunitResource](TestKitJunitResource.html "A Junit external resource for the ActorTestKit, making it possible to have Junit manage the lifecycle of the testkit.")
- [TestProbe](TestProbe.html "Java API: * Create instances through the create factories in the TestProbe companion or via ActorTestKit#createTestProbe.")
[o](LoggingTestKit.html "See companion class")[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[javadsl](index.html)

# [LoggingTestKit](LoggingTestKit.html "See companion class")[**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html "Permalink")

### Companion [class LoggingTestKit](LoggingTestKit.html "See companion class")

#### object LoggingTestKit

Facilities for selectively matching log messages.

Requires Logback.

Source[LoggingTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/javadsl/LoggingTestKit.scala#L111)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LoggingTestKit
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#custom(test:Function[akka.actor.testkit.typed.LoggingEvent,Boolean]):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink")  def custom(test: Function\[[LoggingEvent](../LoggingEvent.html), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [LoggingTestKit](LoggingTestKit.html)Create a custom event filter.

Create a custom event filter. The filter will match those events for
which for which the supplied function returns `true`.
7. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#deadLetters():akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink")  def deadLetters(): [LoggingTestKit](LoggingTestKit.html)Filter for the logging of dead letters.
8. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#debug(messageIncludes:String):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink")  def debug(messageIncludes: String): [LoggingTestKit](LoggingTestKit.html)Create a filter for DEBUG level events with a log message
that contains the given `messageIncludes`.

Create a filter for DEBUG level events with a log message
that contains the given `messageIncludes`.

More conditions can be added to the returned \[LoggingEventFilter].
9. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#empty:akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink")  def empty: [LoggingTestKit](LoggingTestKit.html)An empty filter that doesn't match any events.

An empty filter that doesn't match any events.

More conditions can be added to the returned \[LoggingEventFilter].
10. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#error(causeClass:Class[_<:Throwable]):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink")  def error(causeClass: Class\[\_ \<: Throwable]): [LoggingTestKit](LoggingTestKit.html)Create a filter for ERROR level events with a an included
`throwable` that is a class or subclass of the given
\* `Throwable` class.

Create a filter for ERROR level events with a an included
`throwable` that is a class or subclass of the given
\* `Throwable` class.

More conditions can be added to the returned \[LoggingEventFilter].
13. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#error(messageIncludes:String):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink")  def error(messageIncludes: String): [LoggingTestKit](LoggingTestKit.html)Create a filter for ERROR level events with a log message
that contains the given `messageIncludes`.

Create a filter for ERROR level events with a log message
that contains the given `messageIncludes`.

More conditions can be added to the returned \[LoggingEventFilter].
14. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#info(messageIncludes:String):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink")  def info(messageIncludes: String): [LoggingTestKit](LoggingTestKit.html)Create a filter for INFO level events with a log message
that contains the given `messageIncludes`.

Create a filter for INFO level events with a log message
that contains the given `messageIncludes`.

More conditions can be added to the returned \[LoggingEventFilter].
17. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#messageContains(str:String):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink")  def messageContains(str: String): [LoggingTestKit](LoggingTestKit.html)Create a filter for events with a log message
that contains the given `messageIncludes`.

Create a filter for events with a log message
that contains the given `messageIncludes`.

More conditions can be added to the returned \[LoggingEventFilter].
19. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#trace(messageIncludes:String):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink")  def trace(messageIncludes: String): [LoggingTestKit](LoggingTestKit.html)Create a filter for TRACE level events with a log message
that contains the given `messageIncludes`.

Create a filter for TRACE level events with a log message
that contains the given `messageIncludes`.

More conditions can be added to the returned \[LoggingEventFilter].
25. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#warn(causeClass:Class[Throwable]):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink")  def warn(causeClass: Class\[Throwable]): [LoggingTestKit](LoggingTestKit.html)Create a filter for WARN level events with a an included
`throwable` that is a class or subclass of the given
\* `Throwable` class.

Create a filter for WARN level events with a an included
`throwable` that is a class or subclass of the given
\* `Throwable` class.

More conditions can be added to the returned \[LoggingEventFilter].
29. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#warn(messageIncludes:String):akka.actor.testkit.typed.javadsl.LoggingTestKit "Permalink")  def warn(messageIncludes: String): [LoggingTestKit](LoggingTestKit.html)Create a filter for WARN level events with a log message
that contains the given `messageIncludes`.

Create a filter for WARN level events with a log message
that contains the given `messageIncludes`.

More conditions can be added to the returned \[LoggingEventFilter].
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/LoggingEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/ActorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/ActorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/BehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/Effects$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/FishingOutcomes$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/LogCapturing.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/LoggingTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/ManualTime$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/ManualTime.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/ReplyInbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/SerializationTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/StatusReplyInbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestInbox$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestInbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestProbe$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestProbe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/LoggingTestKit$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/LoggingTestKit$.html)*