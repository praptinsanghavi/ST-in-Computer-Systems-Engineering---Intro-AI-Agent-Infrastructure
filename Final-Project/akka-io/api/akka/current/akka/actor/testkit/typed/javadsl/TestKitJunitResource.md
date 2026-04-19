---
description: Akka 2.10.17 - akka.actor.testkit.typed.javadsl.TestKitJunitResource
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:49:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html
title: Akka 2.10.17 - akka.actor.testkit.typed.javadsl.TestKitJunitResource
---

# Akka 2.10.17 - akka.actor.testkit.typed.javadsl.TestKitJunitResource

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.javadsl.TestKitJunitResource

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
- TestKitJunitResource
- [TestProbe](TestProbe.html "Java API: * Create instances through the create factories in the TestProbe companion or via ActorTestKit#createTestProbe.")
c[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[javadsl](index.html)

# TestKitJunitResource[**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html "Permalink")

### 

#### final  class TestKitJunitResource extends ExternalResource

A Junit external resource for the [ActorTestKit](ActorTestKit.html), making it possible to have Junit manage the lifecycle of the testkit.
The testkit will be automatically shut down when the test completes or fails.

Note that Junit is not provided as a transitive dependency of the testkit module but must be added explicitly
to your project to use this.

Example:

```
public class MyActorTest {
  @ClassRule
  public static final TestKitResource testKit = new TestKitResource();

  @Test
  public void testBlah() throws Exception {
	   // spawn actors etc using the testKit
	   ActorRef<Message> ref = testKit.spawn(behavior);
  }
}
```
By default config is loaded from `application-test.conf` if that exists, otherwise
using default configuration from the reference.conf resources that ship with the Akka libraries.
The application.conf of your project is not used in this case.
A specific configuration can be passed as constructor parameter.

Source[TestKitJunitResource.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/javadsl/TestKitJunitResource.scala#L52)Linear SupertypesExternalResource, TestRule, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestKitJunitResource
2. ExternalResource
3. TestRule
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
### Instance Constructors

1. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#<init>(customConfig:com.typesafe.config.Config,settings:akka.actor.testkit.typed.TestKitSettings):akka.actor.testkit.typed.javadsl.TestKitJunitResource "Permalink")  new TestKitJunitResource(customConfig: Config, settings: [TestKitSettings](../TestKitSettings.html))Use a custom config for the actor system, and a custom [akka.actor.testkit.typed.TestKitSettings](../TestKitSettings.html).
2. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#<init>(customConfig:com.typesafe.config.Config):akka.actor.testkit.typed.javadsl.TestKitJunitResource "Permalink")  new TestKitJunitResource(customConfig: Config)Use a custom config for the actor system.
3. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#<init>(customConfig:String):akka.actor.testkit.typed.javadsl.TestKitJunitResource "Permalink")  new TestKitJunitResource(customConfig: String)Use a custom config for the actor system.
4. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#<init>(system:akka.actor.typed.ActorSystem[_]):akka.actor.testkit.typed.javadsl.TestKitJunitResource "Permalink")  new TestKitJunitResource(system: [typed.ActorSystem](../../../typed/ActorSystem.html)\[\_])Use a custom [akka.actor.typed.ActorSystem](../../../typed/ActorSystem.html) for the actor system.
5. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#<init>():akka.actor.testkit.typed.javadsl.TestKitJunitResource "Permalink")  new TestKitJunitResource()Config loaded from `application-test.conf` if that exists, otherwise
using default configuration from the reference.conf resources that ship with the Akka libraries.

Config loaded from `application-test.conf` if that exists, otherwise
using default configuration from the reference.conf resources that ship with the Akka libraries.
The application.conf of your project is not used in this case.
6. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#<init>(_kit:akka.actor.testkit.typed.javadsl.ActorTestKit):akka.actor.testkit.typed.javadsl.TestKitJunitResource "Permalink")  new TestKitJunitResource(\_kit: [ActorTestKit](ActorTestKit.html))
### Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TestKitJunitResource toany2stringadd\[TestKitJunitResource] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TestKitJunitResource, B)ImplicitThis member is added by an implicit conversion from TestKitJunitResource toArrowAssoc\[TestKitJunitResource] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#after():Unit "Permalink")  def after(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesTestKitJunitResource → ExternalResource
7. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#apply(x$1:org.junit.runners.model.Statement,x$2:org.junit.runner.Description):org.junit.runners.model.Statement "Permalink")  def apply(arg0: Statement, arg1: Description): StatementDefinition ClassesExternalResource → TestRule
8. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#before():Unit "Permalink")  def before(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[rules] Definition ClassesExternalResourceAnnotations@throws(classOf\[java.lang.Throwable])
10. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#createDeadLetterProbe():akka.actor.testkit.typed.javadsl.TestProbe[akka.actor.DeadLetter] "Permalink")  def createDeadLetterProbe(): [TestProbe](TestProbe.html)\[[DeadLetter](../../../DeadLetter.html)]See corresponding method on [ActorTestKit](ActorTestKit.html)
12. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#createDroppedMessageProbe():akka.actor.testkit.typed.javadsl.TestProbe[akka.actor.Dropped] "Permalink")  def createDroppedMessageProbe(): [TestProbe](TestProbe.html)\[[Dropped](../../../Dropped.html)]See corresponding method on [ActorTestKit](ActorTestKit.html)
13. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#createTestProbe[M](name:String):akka.actor.testkit.typed.javadsl.TestProbe[M] "Permalink")  def createTestProbe\[M](name: String): [TestProbe](TestProbe.html)\[M]See corresponding method on [ActorTestKit](ActorTestKit.html)
14. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#createTestProbe[M](name:String,clazz:Class[M]):akka.actor.testkit.typed.javadsl.TestProbe[M] "Permalink")  def createTestProbe\[M](name: String, clazz: Class\[M]): [TestProbe](TestProbe.html)\[M]See corresponding method on [ActorTestKit](ActorTestKit.html)
15. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#createTestProbe[M](clazz:Class[M]):akka.actor.testkit.typed.javadsl.TestProbe[M] "Permalink")  def createTestProbe\[M](clazz: Class\[M]): [TestProbe](TestProbe.html)\[M]See corresponding method on [ActorTestKit](ActorTestKit.html)
16. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#createTestProbe[M]():akka.actor.testkit.typed.javadsl.TestProbe[M] "Permalink")  def createTestProbe\[M](): [TestProbe](TestProbe.html)\[M]See corresponding method on [ActorTestKit](ActorTestKit.html)
17. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#createUnhandledMessageProbe():akka.actor.testkit.typed.javadsl.TestProbe[akka.actor.UnhandledMessage] "Permalink")  def createUnhandledMessageProbe(): [TestProbe](TestProbe.html)\[[UnhandledMessage](../../../UnhandledMessage.html)]See corresponding method on [ActorTestKit](ActorTestKit.html)
18. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TestKitJunitResource) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestKitJunitResourceImplicitThis member is added by an implicit conversion from TestKitJunitResource toEnsuring\[TestKitJunitResource] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TestKitJunitResource) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestKitJunitResourceImplicitThis member is added by an implicit conversion from TestKitJunitResource toEnsuring\[TestKitJunitResource] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestKitJunitResourceImplicitThis member is added by an implicit conversion from TestKitJunitResource toEnsuring\[TestKitJunitResource] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestKitJunitResourceImplicitThis member is added by an implicit conversion from TestKitJunitResource toEnsuring\[TestKitJunitResource] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
24. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
27. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#scheduler:akka.actor.typed.Scheduler "Permalink")  def scheduler: [typed.Scheduler](../../../typed/Scheduler.html)See corresponding method on [ActorTestKit](ActorTestKit.html)
31. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#serializationTestKit:akka.actor.testkit.typed.javadsl.SerializationTestKit "Permalink")  def serializationTestKit: [SerializationTestKit](SerializationTestKit.html)Additional testing utilities for serialization.
32. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#spawn[T](behavior:akka.actor.typed.Behavior[T],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], name: String, props: [typed.Props](../../../typed/Props.html)): [typed.ActorRef](../../../typed/ActorRef.html)\[T]See corresponding method on [ActorTestKit](ActorTestKit.html)
33. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#spawn[T](behavior:akka.actor.typed.Behavior[T],props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], props: [typed.Props](../../../typed/Props.html)): [typed.ActorRef](../../../typed/ActorRef.html)\[T]See corresponding method on [ActorTestKit](ActorTestKit.html)
34. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#spawn[T](behavior:akka.actor.typed.Behavior[T],name:String):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T], name: String): [typed.ActorRef](../../../typed/ActorRef.html)\[T]See corresponding method on [ActorTestKit](ActorTestKit.html)
35. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#spawn[T](behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../../typed/Behavior.html)\[T]): [typed.ActorRef](../../../typed/ActorRef.html)\[T]See corresponding method on [ActorTestKit](ActorTestKit.html)
36. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#stop[T](ref:akka.actor.typed.ActorRef[T]):Unit "Permalink")  def stop\[T](ref: [typed.ActorRef](../../../typed/ActorRef.html)\[T]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)See corresponding method on [ActorTestKit](ActorTestKit.html)
37. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#stop[T](ref:akka.actor.typed.ActorRef[T],max:java.time.Duration):Unit "Permalink")  def stop\[T](ref: [typed.ActorRef](../../../typed/ActorRef.html)\[T], max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)See corresponding method on [ActorTestKit](ActorTestKit.html)
38. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
39. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#system:akka.actor.typed.ActorSystem[Void] "Permalink")  def system: [typed.ActorSystem](../../../typed/ActorSystem.html)\[[Void](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Void.html#java.lang.Void)]See corresponding method on [ActorTestKit](ActorTestKit.html)
40. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#testKit:akka.actor.testkit.typed.javadsl.ActorTestKit "Permalink")  val testKit: [ActorTestKit](ActorTestKit.html)
41. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#testKitSettings:akka.actor.testkit.typed.TestKitSettings "Permalink")  def testKitSettings: [TestKitSettings](../TestKitSettings.html)See corresponding method on [ActorTestKit](ActorTestKit.html)
42. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#timeout:akka.util.Timeout "Permalink")  def timeout: [Timeout](../../../../util/Timeout.html)See corresponding method on [ActorTestKit](ActorTestKit.html)
43. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
44. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
45. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
46. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TestKitJunitResource toStringFormat\[TestKitJunitResource] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TestKitJunitResource, B)ImplicitThis member is added by an implicit conversion from TestKitJunitResource toArrowAssoc\[TestKitJunitResource] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from ExternalResource

### Inherited from TestRule

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTestKitJunitResource to any2stringadd\[TestKitJunitResource]

### Inherited by implicit conversion StringFormat fromTestKitJunitResource to StringFormat\[TestKitJunitResource]

### Inherited by implicit conversion Ensuring fromTestKitJunitResource to Ensuring\[TestKitJunitResource]

### Inherited by implicit conversion ArrowAssoc fromTestKitJunitResource to ArrowAssoc\[TestKitJunitResource]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/DeadLetter.html
- https://doc.akka.io/api/akka/current/akka/actor/Dropped.html
- https://doc.akka.io/api/akka/current/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/TestKitSettings.html
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
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Scheduler.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/util/Timeout.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html](https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html)*