---
description: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.LogCapturing
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:49:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/scaladsl/LogCapturing.html
title: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.LogCapturing
---

# Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.LogCapturing

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.LogCapturing

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[testkit](../../index.html)
- [**](../../../../../akka/actor/testkit/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [ActorTestKit](ActorTestKit.html "Testkit for asynchronous testing of typed actors, meant for mixing into the test class.")
- [ActorTestKitBase](ActorTestKitBase.html "A base class for the ActorTestKit, making it possible to have testing framework (e.g.")
- [BehaviorTestKit](BehaviorTestKit.html "Used for synchronous testing akka.actor.typed.Behaviors.")
- [Effects](Effects$.html "Factories for behavior effects for BehaviorTestKit, each effect has a suitable equals and can be used to compare actual effects to expected ones.")
- [FishingOutcomes](FishingOutcomes$.html)
- LogCapturing
- [LoggingTestKit](LoggingTestKit.html "Facilities for verifying logs.")
- [ManualTime](ManualTime.html "Not for user instantiation, see ManualTime#apply")
- [ReplyInbox](ReplyInbox.html "Similar to an akka.actor.testkit.typed.scaladsl.TestInbox, but can only ever give access to a single message (a reply).")
- [ScalaTestWithActorTestKit](ScalaTestWithActorTestKit.html "A ScalaTest base class for the ActorTestKit, making it possible to have ScalaTest manage the lifecycle of the testkit.")
- [SerializationTestKit](SerializationTestKit.html "Utilities to test serialization.")
- [StatusReplyInbox](StatusReplyInbox.html "A akka.actor.testkit.typed.scaladsl.ReplyInbox which specially handles akka.pattern.StatusReply.")
- [TestDuration](package$$TestDuration.html "Scala API.")
- [TestInbox](TestInbox.html "Utility for use as an ActorRef when *synchronously* testing akka.actor.typed.Behavior with akka.actor.testkit.typed.scaladsl.BehaviorTestKit.")
- [TestProbe](TestProbe.html "Create instances through the factories in the TestProbe companion.")
t[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[scaladsl](index.html)

# LogCapturing[**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html "Permalink")

### 

#### trait LogCapturing extends BeforeAndAfterAll

Mixin this trait to a ScalaTest test to make log lines appear only when the test failed.

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
Self TypeLogCapturing with TestSuiteSource[LogCapturing.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/scaladsl/LogCapturing.scala#L33)Linear SupertypesBeforeAndAfterAll, SuiteMixin, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LogCapturing
2. BeforeAndAfterAll
3. SuiteMixin
4. AnyRef
5. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#expectedTestCount(filter:org.scalatest.Filter):Int "Permalink") abstract  def expectedTestCount(filter: Filter): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSuiteMixin
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#nestedSuites:IndexedSeq[org.scalatest.Suite] "Permalink") abstract  def nestedSuites: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[Suite]Definition ClassesSuiteMixin
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#rerunner:Option[String] "Permalink") abstract  def rerunner: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Definition ClassesSuiteMixin
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#runNestedSuites(args:org.scalatest.Args):org.scalatest.Status "Permalink") abstract  def runNestedSuites(args: Args): org.scalatest.StatusAttributesprotected Definition ClassesSuiteMixin
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#runTest(testName:String,args:org.scalatest.Args):org.scalatest.Status "Permalink") abstract  def runTest(testName: String, args: Args): org.scalatest.StatusAttributesprotected Definition ClassesSuiteMixin
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#runTests(testName:Option[String],args:org.scalatest.Args):org.scalatest.Status "Permalink") abstract  def runTests(testName: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], args: Args): org.scalatest.StatusAttributesprotected Definition ClassesSuiteMixin
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#suiteId:String "Permalink") abstract  def suiteId: StringDefinition ClassesSuiteMixin
8. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#suiteName:String "Permalink") abstract  def suiteName: StringDefinition ClassesSuiteMixin
9. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#tags:Map[String,Set[String]] "Permalink") abstract  def tags: Map\[String, Set\[String]]Definition ClassesSuiteMixin
10. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#testDataFor(testName:String,theConfigMap:org.scalatest.ConfigMap):org.scalatest.TestData "Permalink") abstract  def testDataFor(testName: String, theConfigMap: ConfigMap): TestDataDefinition ClassesSuiteMixin
11. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#testNames:Set[String] "Permalink") abstract  def testNames: Set\[String]Definition ClassesSuiteMixin
12. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#styleName:String "Permalink") abstract  val styleName: StringDefinition ClassesSuiteMixinAnnotations@deprecated Deprecated*(Since version 3\.1\.0\)* The styleName lifecycle method has been deprecated and will be removed in a future version of ScalaTest with no replacement.
### Concrete Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LogCapturing toany2stringadd\[LogCapturing] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LogCapturing, B)ImplicitThis member is added by an implicit conversion from LogCapturing toArrowAssoc\[LogCapturing] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#afterAll():Unit "Permalink")  def afterAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesLogCapturing → BeforeAndAfterAll
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#beforeAll():Unit "Permalink")  def beforeAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesBeforeAndAfterAll
9. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#clearCapturedLogs():Unit "Permalink")  def clearCapturedLogs(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)May be called to explicitly clear the captured logs.

May be called to explicitly clear the captured logs.

Useful for when logs are not cleared after each test. If clearing after every test
is desirable, overriding [clearLogsAfterEachTest](#clearLogsAfterEachTest:Boolean) is preferable.
10. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#clearLogsAfterEachTest:Boolean "Permalink")  def clearLogsAfterEachTest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)If true, the logs will be cleared after each test.

If true, the logs will be cleared after each test.

This is not enabled by default for Scala tests, since state may be shared between
sequential tests, and logs from earlier tests may be important.

Attributesprotected
11. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LogCapturing) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LogCapturingImplicitThis member is added by an implicit conversion from LogCapturing toEnsuring\[LogCapturing] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LogCapturing) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LogCapturingImplicitThis member is added by an implicit conversion from LogCapturing toEnsuring\[LogCapturing] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LogCapturingImplicitThis member is added by an implicit conversion from LogCapturing toEnsuring\[LogCapturing] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LogCapturingImplicitThis member is added by an implicit conversion from LogCapturing toEnsuring\[LogCapturing] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected:Boolean "Permalink")  val invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesBeforeAndAfterAll
21. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#run(testName:Option[String],args:org.scalatest.Args):org.scalatest.Status "Permalink")  def run(testName: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], args: Args): org.scalatest.StatusDefinition ClassesBeforeAndAfterAll → SuiteMixin
26. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#withFixture(test:LogCapturing.this.NoArgTest):org.scalatest.Outcome "Permalink")  def withFixture(test: (LogCapturing.this)\#NoArgTest): Outcome
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LogCapturing toStringFormat\[LogCapturing] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LogCapturing, B)ImplicitThis member is added by an implicit conversion from LogCapturing toArrowAssoc\[LogCapturing] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from BeforeAndAfterAll

### Inherited from SuiteMixin

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLogCapturing to any2stringadd\[LogCapturing]

### Inherited by implicit conversion StringFormat fromLogCapturing to StringFormat\[LogCapturing]

### Inherited by implicit conversion Ensuring fromLogCapturing to Ensuring\[LogCapturing]

### Inherited by implicit conversion ArrowAssoc fromLogCapturing to ArrowAssoc\[LogCapturing]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKitBase$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/Effects$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/FishingOutcomes$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/LogCapturing.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/LoggingTestKit$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ManualTime$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ManualTime.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ReplyInbox.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/SerializationTestKit.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/TestInbox$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/TestInbox.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/TestProbe$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/TestProbe.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/package$$TestDuration.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/LogCapturing.html](https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/LogCapturing.html)*