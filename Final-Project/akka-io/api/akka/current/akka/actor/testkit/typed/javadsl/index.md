---
description: Akka 2.10.17 - akka.actor.testkit.typed.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:45:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/javadsl/index.html
title: Akka 2.10.17 - akka.actor.testkit.typed.javadsl
---

# Akka 2.10.17 - akka.actor.testkit.typed.javadsl

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.javadsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[testkit](../../index.html)
- [**](../../../../../akka/actor/testkit/typed/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/actor/testkit/typed/javadsl/index.html "Permalink")  package javadslDefinition Classes[typed](../index.html)
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
- [**](../../../../../akka/actor/testkit/typed/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[typed](../index.html)
p[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html)

# javadsl[**](../../../../../akka/actor/testkit/typed/javadsl/index.html "Permalink")

#### package javadsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit.html "Permalink") final  class [ActorTestKit](ActorTestKit.html "Java API: Test kit for asynchronous testing of typed actors.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: Test kit for asynchronous testing of typed actors.

Java API: Test kit for asynchronous testing of typed actors.
Provides a typed actor system started on creation, that can be used for multiple test cases and is
shut down when `shutdown` is called.

The actor system has a custom guardian that allows for spawning arbitrary actors using the `spawn` methods.

Designed to work with any test framework, but framework glue code that calls `shutdownTestKit` after all tests has
run needs to be provided by the user or with [TestKitJunitResource](TestKitJunitResource.html).

Use `TestKit.create` factories to construct manually or [TestKitJunitResource](TestKitJunitResource.html) to use together with JUnit tests

For synchronous testing of a `Behavior` see [BehaviorTestKit](BehaviorTestKit.html)
2. [**](../../../../../akka/actor/testkit/typed/javadsl/BehaviorTestKit.html "Permalink") abstract  class [BehaviorTestKit](BehaviorTestKit.html "Used for synchronous testing akka.actor.typed.Behaviors.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Used for synchronous testing [akka.actor.typed.Behavior](../../../typed/Behavior.html)s.

Used for synchronous testing [akka.actor.typed.Behavior](../../../typed/Behavior.html)s. Stores all effects e.g. Spawning of children,
watching and offers access to what effects have taken place.

Not for user extension or instantiation. See `BehaviorTestKit.create` factory methods

For asynchronous testing of `Behavior`s running see [ActorTestKit](ActorTestKit.html)

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() @[ApiMayChange](../../../../annotation/ApiMayChange.html)()
3. [**](../../../../../akka/actor/testkit/typed/javadsl/LogCapturing.html "Permalink") final  class [LogCapturing](LogCapturing.html "JUnit TestRule to make log lines appear only when the test failed.") extends TestRuleJUnit `TestRule` to make log lines appear only when the test failed.

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
4. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit.html "Permalink") abstract  class [LoggingTestKit](LoggingTestKit.html "Facilities for verifying logs.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Facilities for verifying logs.

Facilities for verifying logs.

Requires Logback.

See the static factory methods as starting point for creating `LoggingTestKit`.

Not for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
5. [**](../../../../../akka/actor/testkit/typed/javadsl/ManualTime.html "Permalink") final  class [ManualTime](ManualTime.html "Not for user instantiation, see ManualTime#get") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not for user instantiation, see [ManualTime\#get](ManualTime$.html#get[A](system:akka.actor.typed.ActorSystem[A]):akka.actor.testkit.typed.javadsl.ManualTime)
6. [**](../../../../../akka/actor/testkit/typed/javadsl/ReplyInbox.html "Permalink")  trait [ReplyInbox](ReplyInbox.html "Similar to an akka.actor.testkit.typed.javadsl.TestInbox, but can only ever give access to a single message (a reply).")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Similar to an [akka.actor.testkit.typed.javadsl.TestInbox](TestInbox.html), but can only ever give access to a single message (a reply).

Similar to an [akka.actor.testkit.typed.javadsl.TestInbox](TestInbox.html), but can only ever give access to a single message (a reply).

Not intended for user creation: the [akka.actor.testkit.typed.javadsl.BehaviorTestKit](BehaviorTestKit.html) will provide these to
denote that at most a single reply is expected.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() @[ApiMayChange](../../../../annotation/ApiMayChange.html)()
7. [**](../../../../../akka/actor/testkit/typed/javadsl/SerializationTestKit.html "Permalink")  class [SerializationTestKit](SerializationTestKit.html "Utilities to test serialization.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Utilities to test serialization.
8. [**](../../../../../akka/actor/testkit/typed/javadsl/StatusReplyInbox.html "Permalink")  trait [StatusReplyInbox](StatusReplyInbox.html "A akka.actor.testkit.typed.javadsl.ReplyInbox which specially handles akka.pattern.StatusReply.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A [akka.actor.testkit.typed.javadsl.ReplyInbox](ReplyInbox.html) which specially handles [akka.pattern.StatusReply](../../../../pattern/StatusReply.html).

A [akka.actor.testkit.typed.javadsl.ReplyInbox](ReplyInbox.html) which specially handles [akka.pattern.StatusReply](../../../../pattern/StatusReply.html).

Note that there is no provided ability to expect a specific `Throwable`, as it's recommended to prefer
a string error message or to enumerate failures with specific types.

Not intended for user creation: the [akka.actor.testkit.typed.javadsl.BehaviorTestKit](BehaviorTestKit.html) will provide these to
denote that at most a single reply is expected.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() @[ApiMayChange](../../../../annotation/ApiMayChange.html)()
9. [**](../../../../../akka/actor/testkit/typed/javadsl/TestInbox.html "Permalink") abstract  class [TestInbox](TestInbox.html "Utility for use as an ActorRef when *synchronously* testing akka.actor.typed.Behavior with akka.actor.testkit.typed.javadsl.BehaviorTestKit.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Utility for use as an [ActorRef](../../../ActorRef.html) when \*synchronously\* testing [akka.actor.typed.Behavior](../../../typed/Behavior.html)
with [akka.actor.testkit.typed.javadsl.BehaviorTestKit](BehaviorTestKit.html).

Utility for use as an [ActorRef](../../../ActorRef.html) when \*synchronously\* testing [akka.actor.typed.Behavior](../../../typed/Behavior.html)
with [akka.actor.testkit.typed.javadsl.BehaviorTestKit](BehaviorTestKit.html).

If you plan to use a real [akka.actor.typed.ActorSystem](../../../typed/ActorSystem.html) then use [akka.actor.testkit.typed.javadsl.TestProbe](TestProbe.html)
for asynchronous testing.

Use `TestInbox.create` factory methods to create instances

Not for user extension

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
10. [**](../../../../../akka/actor/testkit/typed/javadsl/TestKitJunitResource.html "Permalink") final  class [TestKitJunitResource](TestKitJunitResource.html "A Junit external resource for the ActorTestKit, making it possible to have Junit manage the lifecycle of the testkit.") extends ExternalResourceA Junit external resource for the [ActorTestKit](ActorTestKit.html), making it possible to have Junit manage the lifecycle of the testkit.

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
11. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe.html "Permalink") abstract  class [TestProbe](TestProbe.html "Java API: * Create instances through the create factories in the TestProbe companion or via ActorTestKit#createTestProbe.")\[M] extends [RecipientRef](../../../typed/RecipientRef.html)\[M]Java API: \* Create instances through the `create` factories in the [TestProbe](TestProbe.html) companion
or via [ActorTestKit\#createTestProbe](ActorTestKit.html#createTestProbe[M](name:String,clazz:Class[M]):akka.actor.testkit.typed.javadsl.TestProbe[M]).

Java API: \* Create instances through the `create` factories in the [TestProbe](TestProbe.html) companion
or via [ActorTestKit\#createTestProbe](ActorTestKit.html#createTestProbe[M](name:String,clazz:Class[M]):akka.actor.testkit.typed.javadsl.TestProbe[M]).

A test probe is essentially a queryable mailbox which can be used in place of an actor and the received
messages can then be asserted etc.

Not for user extension

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../../akka/actor/testkit/typed/javadsl/ActorTestKit$.html "Permalink")  object [ActorTestKit](ActorTestKit$.html)
2. [**](../../../../../akka/actor/testkit/typed/javadsl/BehaviorTestKit$.html "Permalink")  object [BehaviorTestKit](BehaviorTestKit$.html)
3. [**](../../../../../akka/actor/testkit/typed/javadsl/Effects$.html "Permalink")  object [Effects](Effects$.html "Factories for behavior effects for BehaviorTestKit, each effect has a suitable equals and can be used to compare actual effects to expected ones.")Factories for behavior effects for [BehaviorTestKit](BehaviorTestKit.html), each effect has a suitable equals and can be used to compare
actual effects to expected ones.
4. [**](../../../../../akka/actor/testkit/typed/javadsl/FishingOutcomes$.html "Permalink")  object [FishingOutcomes](FishingOutcomes$.html)
5. [**](../../../../../akka/actor/testkit/typed/javadsl/LoggingTestKit$.html "Permalink")  object [LoggingTestKit](LoggingTestKit$.html "Facilities for selectively matching log messages.")Facilities for selectively matching log messages.

Facilities for selectively matching log messages.

Requires Logback.
6. [**](../../../../../akka/actor/testkit/typed/javadsl/ManualTime$.html "Permalink")  object [ManualTime](ManualTime$.html "Manual time allows you to do async tests while controlling the scheduler of the system.")Manual time allows you to do async tests while controlling the scheduler of the system.

Manual time allows you to do async tests while controlling the scheduler of the system.

To use it you need to configure the `ActorSystem`/`ActorTestKit` with [ManualTime.config](ManualTime$.html#config():com.typesafe.config.Config) and access the
scheduler control through [ManualTime.get](ManualTime$.html#get[A](system:akka.actor.typed.ActorSystem[A]):akka.actor.testkit.typed.javadsl.ManualTime)
7. [**](../../../../../akka/actor/testkit/typed/javadsl/TestInbox$.html "Permalink")  object [TestInbox](TestInbox$.html)
8. [**](../../../../../akka/actor/testkit/typed/javadsl/TestProbe$.html "Permalink")  object [TestProbe](TestProbe$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/internal/index.html
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
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/index.html](https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/index.html)*