---
description: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/scaladsl/index.html
title: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl
---

# Akka 2.10.17 - akka.actor.testkit.typed.scaladsl

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.scaladsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[testkit](../../index.html)
- [**](../../../../../akka/actor/testkit/typed/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/actor/testkit/typed/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/actor/testkit/typed/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[typed](../index.html)
- [ActorTestKit](ActorTestKit.html "Testkit for asynchronous testing of typed actors, meant for mixing into the test class.")
- [ActorTestKitBase](ActorTestKitBase.html "A base class for the ActorTestKit, making it possible to have testing framework (e.g.")
- [BehaviorTestKit](BehaviorTestKit.html "Used for synchronous testing akka.actor.typed.Behaviors.")
- [Effects](Effects$.html "Factories for behavior effects for BehaviorTestKit, each effect has a suitable equals and can be used to compare actual effects to expected ones.")
- [FishingOutcomes](FishingOutcomes$.html)
- [LogCapturing](LogCapturing.html "Mixin this trait to a ScalaTest test to make log lines appear only when the test failed.")
- [LoggingTestKit](LoggingTestKit.html "Facilities for verifying logs.")
- [ManualTime](ManualTime.html "Not for user instantiation, see ManualTime#apply")
- [ReplyInbox](ReplyInbox.html "Similar to an akka.actor.testkit.typed.scaladsl.TestInbox, but can only ever give access to a single message (a reply).")
- [ScalaTestWithActorTestKit](ScalaTestWithActorTestKit.html "A ScalaTest base class for the ActorTestKit, making it possible to have ScalaTest manage the lifecycle of the testkit.")
- [SerializationTestKit](SerializationTestKit.html "Utilities to test serialization.")
- [StatusReplyInbox](StatusReplyInbox.html "A akka.actor.testkit.typed.scaladsl.ReplyInbox which specially handles akka.pattern.StatusReply.")
- [TestDuration](package$$TestDuration.html "Scala API.")
- [TestInbox](TestInbox.html "Utility for use as an ActorRef when *synchronously* testing akka.actor.typed.Behavior with akka.actor.testkit.typed.scaladsl.BehaviorTestKit.")
- [TestProbe](TestProbe.html "Create instances through the factories in the TestProbe companion.")
p[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html)

# scaladsl[**](../../../../../akka/actor/testkit/typed/scaladsl/index.html "Permalink")

#### package scaladsl

Source[package.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/scaladsl/package.scala#L9)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. scaladsl
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit.html "Permalink") final  class [ActorTestKit](ActorTestKit.html "Testkit for asynchronous testing of typed actors, meant for mixing into the test class.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Testkit for asynchronous testing of typed actors, meant for mixing into the test class.

Testkit for asynchronous testing of typed actors, meant for mixing into the test class.

Provides a typed actor system started on creation, used for all test cases and shut down when `shutdown` is called.

The actor system has a custom guardian that allows for spawning arbitrary actors using the `spawn` methods.

Designed to work with any test framework, but framework glue code that calls shutdown after all tests has
run needs to be provided by the user.

For synchronous testing of a `Behavior` see [BehaviorTestKit](BehaviorTestKit.html)
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html "Permalink") abstract  class [ActorTestKitBase](ActorTestKitBase.html "A base class for the ActorTestKit, making it possible to have testing framework (e.g.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A base class for the [ActorTestKit](ActorTestKit.html), making it possible to have testing framework (e.g.

A base class for the [ActorTestKit](ActorTestKit.html), making it possible to have testing framework (e.g. ScalaTest)
manage the lifecycle of the testkit.

An implementation for ScalaTest is [ScalaTestWithActorTestKit](ScalaTestWithActorTestKit.html).

Another abstract class that is testing framework specific should extend this class and
automatically shut down the `testKit` when the test completes or fails by implementing [ActorTestKitBase\#afterAll](ActorTestKitBase.html#afterAll():Unit).
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html "Permalink")  trait [BehaviorTestKit](BehaviorTestKit.html "Used for synchronous testing akka.actor.typed.Behaviors.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Used for synchronous testing [akka.actor.typed.Behavior](../../../typed/Behavior.html)s.

Used for synchronous testing [akka.actor.typed.Behavior](../../../typed/Behavior.html)s. Stores all effects e.g. Spawning of children,
watching and offers access to what effects have taken place.

For asynchronous testing of `Behavior`s running see [ActorTestKit](ActorTestKit.html)

Not for user extension. See `BehaviorTestKit.apply` factory methods

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() @[ApiMayChange](../../../../annotation/ApiMayChange.html)()
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/LogCapturing.html "Permalink")  trait [LogCapturing](LogCapturing.html "Mixin this trait to a ScalaTest test to make log lines appear only when the test failed.") extends BeforeAndAfterAllMixin this trait to a ScalaTest test to make log lines appear only when the test failed.

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
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/LoggingTestKit.html "Permalink")  trait [LoggingTestKit](LoggingTestKit.html "Facilities for verifying logs.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Facilities for verifying logs.

Facilities for verifying logs.

Requires Logback.

See the companion object for convenient factory methods.

Not for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime.html "Permalink") final  class [ManualTime](ManualTime.html "Not for user instantiation, see ManualTime#apply") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not for user instantiation, see [ManualTime\#apply](ManualTime$.html#apply()(implicitsystem:akka.actor.typed.ActorSystem[_]):akka.actor.testkit.typed.scaladsl.ManualTime)
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/ReplyInbox.html "Permalink")  trait [ReplyInbox](ReplyInbox.html "Similar to an akka.actor.testkit.typed.scaladsl.TestInbox, but can only ever give access to a single message (a reply).")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Similar to an [akka.actor.testkit.typed.scaladsl.TestInbox](TestInbox.html), but can only ever give access to a single message (a reply).

Similar to an [akka.actor.testkit.typed.scaladsl.TestInbox](TestInbox.html), but can only ever give access to a single message (a reply).

Not intended for user creation: the [akka.actor.testkit.typed.scaladsl.BehaviorTestKit](BehaviorTestKit.html) will provide these
to denote that at most a single reply is expected.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() @[ApiMayChange](../../../../annotation/ApiMayChange.html)()
8. [**](../../../../../akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html "Permalink") abstract  class [ScalaTestWithActorTestKit](ScalaTestWithActorTestKit.html "A ScalaTest base class for the ActorTestKit, making it possible to have ScalaTest manage the lifecycle of the testkit.") extends [ActorTestKitBase](ActorTestKitBase.html) with TestSuite with Matchers with BeforeAndAfterAll with ScalaFutures with EventuallyA ScalaTest base class for the [ActorTestKit](ActorTestKit.html), making it possible to have ScalaTest manage the lifecycle of the testkit.

A ScalaTest base class for the [ActorTestKit](ActorTestKit.html), making it possible to have ScalaTest manage the lifecycle of the testkit.
The testkit will be automatically shut down when the test completes or fails using ScalaTest's BeforeAndAfterAll trait. If
a spec overrides afterAll it must call super.afterAll.

Note that ScalaTest is not provided as a transitive dependency of the testkit module but must be added explicitly
to your project to use this.

By default config is loaded from `application-test.conf` if that exists, otherwise
using default configuration from the reference.conf resources that ship with the Akka libraries.
The application.conf of your project is not used in this case.
A specific configuration can be passed as constructor parameter.
9. [**](../../../../../akka/actor/testkit/typed/scaladsl/SerializationTestKit.html "Permalink")  class [SerializationTestKit](SerializationTestKit.html "Utilities to test serialization.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Utilities to test serialization.
10. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html "Permalink")  trait [StatusReplyInbox](StatusReplyInbox.html "A akka.actor.testkit.typed.scaladsl.ReplyInbox which specially handles akka.pattern.StatusReply.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A [akka.actor.testkit.typed.scaladsl.ReplyInbox](ReplyInbox.html) which specially handles [akka.pattern.StatusReply](../../../../pattern/StatusReply.html).

A [akka.actor.testkit.typed.scaladsl.ReplyInbox](ReplyInbox.html) which specially handles [akka.pattern.StatusReply](../../../../pattern/StatusReply.html).

Note that there is no provided ability to expect a specific `Throwable`, as it's recommended to prefer
a string error message or to enumerate failures with specific types.

Not intended for user creation: the [akka.actor.testkit.typed.scaladsl.BehaviorTestKit](BehaviorTestKit.html) will provide these
to denote that at most a single reply is expected.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() @[ApiMayChange](../../../../annotation/ApiMayChange.html)()
11. [**](../../../../../akka/actor/testkit/typed/scaladsl/package$$TestDuration.html "Permalink") implicit final  class [TestDuration](package$$TestDuration.html "Scala API.") extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Scala API.

Scala API. Scale timeouts (durations) during tests with the configured
'akka.actor.testkit.typed.timefactor'.
Implicit class providing `dilated` method.

```
import scala.concurrent.duration._
import akka.actor.testkit.typed.scaladsl._
10.milliseconds.dilated
```
Uses the scaling factor from the `TestTimeFactor` in the [TestKitSettings](../TestKitSettings.html)
(in implicit scope).
12. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestInbox.html "Permalink")  trait [TestInbox](TestInbox.html "Utility for use as an ActorRef when *synchronously* testing akka.actor.typed.Behavior with akka.actor.testkit.typed.scaladsl.BehaviorTestKit.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Utility for use as an [ActorRef](../../../ActorRef.html) when \*synchronously\* testing [akka.actor.typed.Behavior](../../../typed/Behavior.html)
with [akka.actor.testkit.typed.scaladsl.BehaviorTestKit](BehaviorTestKit.html).

Utility for use as an [ActorRef](../../../ActorRef.html) when \*synchronously\* testing [akka.actor.typed.Behavior](../../../typed/Behavior.html)
with [akka.actor.testkit.typed.scaladsl.BehaviorTestKit](BehaviorTestKit.html).

If you plan to use a real [akka.actor.typed.ActorSystem](../../../typed/ActorSystem.html) then use [akka.actor.testkit.typed.scaladsl.TestProbe](TestProbe.html)
for asynchronous testing.

Use factory `apply` in companion to create instances

Not for user extension

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() @[ApiMayChange](../../../../annotation/ApiMayChange.html)()
13. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe.html "Permalink")  trait [TestProbe](TestProbe.html "Create instances through the factories in the TestProbe companion.")\[M] extends [RecipientRef](../../../typed/RecipientRef.html)\[M]Create instances through the factories in the [TestProbe](TestProbe.html) companion.

Create instances through the factories in the [TestProbe](TestProbe.html) companion.

A test probe is essentially a queryable mailbox which can be used in place of an actor and the received
messages can then be asserted

Not for user extension

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKit$.html "Permalink")  object [ActorTestKit](ActorTestKit$.html)
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/ActorTestKitBase$.html "Permalink")  object [ActorTestKitBase](ActorTestKitBase$.html)
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html "Permalink")  object [BehaviorTestKit](BehaviorTestKit$.html)Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/Effects$.html "Permalink")  object [Effects](Effects$.html "Factories for behavior effects for BehaviorTestKit, each effect has a suitable equals and can be used to compare actual effects to expected ones.")Factories for behavior effects for [BehaviorTestKit](BehaviorTestKit.html), each effect has a suitable equals and can be used to compare
actual effects to expected ones.
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/FishingOutcomes$.html "Permalink")  object [FishingOutcomes](FishingOutcomes$.html)
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/LoggingTestKit$.html "Permalink")  object [LoggingTestKit](LoggingTestKit$.html "Facilities for selectively matching expected events from logging.")Facilities for selectively matching expected events from logging.

Facilities for selectively matching expected events from logging.

Requires Logback.
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/ManualTime$.html "Permalink")  object [ManualTime](ManualTime$.html "Manual time allows you to do async tests while controlling the scheduler of the system.")Manual time allows you to do async tests while controlling the scheduler of the system.

Manual time allows you to do async tests while controlling the scheduler of the system.

To use it you need to configure the `ActorSystem`/`ActorTestKit` with [ManualTime.config](ManualTime$.html#config:com.typesafe.config.Config) and access the
scheduler control through [ManualTime.apply](ManualTime$.html#apply()(implicitsystem:akka.actor.typed.ActorSystem[_]):akka.actor.testkit.typed.scaladsl.ManualTime)
8. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestInbox$.html "Permalink")  object [TestInbox](TestInbox$.html)Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
9. [**](../../../../../akka/actor/testkit/typed/scaladsl/TestProbe$.html "Permalink")  object [TestProbe](TestProbe$.html)
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ActorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ActorTestKitBase$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/Effects$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/FishingOutcomes$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/LogCapturing.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/LoggingTestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ManualTime$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ManualTime.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ReplyInbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/SerializationTestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestInbox$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestInbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestProbe$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestProbe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/package$$TestDuration.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/index.html)*