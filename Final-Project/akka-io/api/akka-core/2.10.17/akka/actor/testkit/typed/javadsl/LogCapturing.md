---
description: Akka 2.10.17 - akka.actor.testkit.typed.javadsl.LogCapturing
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:24:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/javadsl/LogCapturing.html
title: Akka 2.10.17 - akka.actor.testkit.typed.javadsl.LogCapturing
---

# Akka 2.10.17 - akka.actor.testkit.typed.javadsl.LogCapturing

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.javadsl.LogCapturing

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
- LogCapturing
- [LoggingTestKit](LoggingTestKit.html "Facilities for verifying logs.")
- [ManualTime](ManualTime.html "Not for user instantiation, see ManualTime#get")
- [ReplyInbox](ReplyInbox.html "Similar to an akka.actor.testkit.typed.javadsl.TestInbox, but can only ever give access to a single message (a reply).")
- [SerializationTestKit](SerializationTestKit.html "Utilities to test serialization.")
- [StatusReplyInbox](StatusReplyInbox.html "A akka.actor.testkit.typed.javadsl.ReplyInbox which specially handles akka.pattern.StatusReply.")
- [TestInbox](TestInbox.html "Utility for use as an ActorRef when *synchronously* testing akka.actor.typed.Behavior with akka.actor.testkit.typed.javadsl.BehaviorTestKit.")
- [TestKitJunitResource](TestKitJunitResource.html "A Junit external resource for the ActorTestKit, making it possible to have Junit manage the lifecycle of the testkit.")
- [TestProbe](TestProbe.html "Java API: * Create instances through the create factories in the TestProbe companion or via ActorTestKit#createTestProbe.")
c[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[javadsl](index.html)

# LogCapturing[**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html "Permalink")

### 

#### final  class LogCapturing extends TestRule

JUnit `TestRule` to make log lines appear only when the test failed.

Use this in test by adding a public field annotated with `@TestRule`:

```
@Rule public final LogCapturing logCapturing = new LogCapturing();
```
Requires Logback and configuration like the following the logback\-test.xml:

```
<appender name="CapturingAppender" class="akka.actor.testkit.typed.internal.CapturingAppender" />

<logger name="akka.actor.testkit.typed.internal.CapturingAppenderDelegate" >
  <appender-ref ref="STDOUT"/>
</logger>

<root level="DEBUG">
    <appender-ref ref="CapturingAppender"/>
</root>
```
Source[LogCapturing.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/javadsl/LogCapturing.scala#L38)Linear SupertypesTestRule, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LogCapturing
2. TestRule
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

1. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#<init>():akka.actor.testkit.typed.javadsl.LogCapturing "Permalink")  new LogCapturing()
### Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LogCapturing toany2stringadd\[LogCapturing] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LogCapturing, B)ImplicitThis member is added by an implicit conversion from LogCapturing toArrowAssoc\[LogCapturing] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#apply(base:org.junit.runners.model.Statement,description:org.junit.runner.Description):org.junit.runners.model.Statement "Permalink")  def apply(base: Statement, description: Description): StatementDefinition ClassesLogCapturing → TestRule
7. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LogCapturing) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LogCapturingImplicitThis member is added by an implicit conversion from LogCapturing toEnsuring\[LogCapturing] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LogCapturing) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LogCapturingImplicitThis member is added by an implicit conversion from LogCapturing toEnsuring\[LogCapturing] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LogCapturingImplicitThis member is added by an implicit conversion from LogCapturing toEnsuring\[LogCapturing] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LogCapturingImplicitThis member is added by an implicit conversion from LogCapturing toEnsuring\[LogCapturing] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LogCapturing toStringFormat\[LogCapturing] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LogCapturing, B)ImplicitThis member is added by an implicit conversion from LogCapturing toArrowAssoc\[LogCapturing] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from TestRule

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLogCapturing to any2stringadd\[LogCapturing]

### Inherited by implicit conversion StringFormat fromLogCapturing to StringFormat\[LogCapturing]

### Inherited by implicit conversion Ensuring fromLogCapturing to Ensuring\[LogCapturing]

### Inherited by implicit conversion ArrowAssoc fromLogCapturing to ArrowAssoc\[LogCapturing]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/index.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/LogCapturing.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/LogCapturing.html)*