---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/testing-async.html
title: Asynchronous testing • Akka core
---

# Asynchronous testing • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

## Asynchronous testing

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Testing](../testing.html).

Asynchronous testing uses a real [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") that allows you to test your Actors in a more realistic environment.

The minimal setup consists of the test procedure, which provides the desired stimuli, the actor under test, and an actor receiving replies. Bigger systems replace the actor under test with a network of actors, apply stimuli at varying injection points and arrange results to be sent from different emission points, but the basic principle stays the same in that a single procedure drives the test.

### Basic example

Actor under test:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/AsyncTestingExampleSpec.scala#L31-L40 "Go to snippet source")object Echo {
  case class Ping(message: String, response: ActorRef[Pong])
  case class Pong(message: String)

  def apply(): Behavior[Ping] = Behaviors.receiveMessage {
    case Ping(m, replyTo) =>
      replyTo ! Pong(m)
      Behaviors.same
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/AsyncTestingExampleTest.java#L39-L81 "Go to snippet source")public static class Echo {
  public static class Ping {
    public final String message;
    public final ActorRef<Pong> replyTo;

    public Ping(String message, ActorRef<Pong> replyTo) {
      this.message = message;
      this.replyTo = replyTo;
    }
  }

  public static class Pong {
    public final String message;

    public Pong(String message) {
      this.message = message;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Pong)) return false;
      Pong pong = (Pong) o;
      return message.equals(pong.message);
    }

    @Override
    public int hashCode() {
      return Objects.hash(message);
    }
  }

  public static Behavior<Ping> create() {
    return Behaviors.receive(Ping.class)
        .onMessage(
            Ping.class,
            ping -> {
              ping.replyTo.tell(new Pong(ping.message));
              return Behaviors.same();
            })
        .build();
  }
}
```

Tests create an instance of [`ActorTestKit`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/ActorTestKit.html "akka.actor.testkit.typed.javadsl.ActorTestKit")[`ActorTestKit`](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ActorTestKit.html "akka.actor.testkit.typed.scaladsl.ActorTestKit"). This provides access to:

- An ActorSystem
- Methods for spawning Actors. These are created under the special testkit user guardian
- A method to shut down the ActorSystem from the test suite

This first example is using the “raw” `ActorTestKit` but if you are using ScalaTestJUnit you can simplify the tests by using the [Test framework integration](testing-async.html#test-framework-integration). It’s still good to read this section to understand how it works.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/AsyncTestingExampleSpec.scala#L10-L141 "Go to snippet source")import akka.actor.testkit.typed.scaladsl.ActorTestKit

import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class AsyncTestingExampleSpec
    extends AnyWordSpec
    with BeforeAndAfterAll
    with Matchers {
  val testKit = ActorTestKit()
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/AsyncTestingExampleTest.java#L13-L198 "Go to snippet source")import akka.actor.testkit.typed.javadsl.ActorTestKit;

public class AsyncTestingExampleTest
{
  static final ActorTestKit testKit = ActorTestKit.create();
}
```

Your test is responsible for shutting down the [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") e.g. using `BeforeAndAfterAll` when using ScalaTest`@AfterClass` when using JUnit.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/AsyncTestingExampleSpec.scala#L138 "Go to snippet source")override def afterAll(): Unit = testKit.shutdownTestKit()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/AsyncTestingExampleTest.java#L121-L124 "Go to snippet source")@AfterClass
public static void cleanup() {
  testKit.shutdownTestKit();
}
```

The following demonstrates:

- Creating an actor from the `TestKit`’s system using `spawn`
- Creating a `TestProbe`
- Verifying that the actor under test responds via the `TestProbe`

Note that it is possible to use a `TestProbe` directly as a [`RecipientRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/RecipientRef.html "akka.actor.typed.RecipientRef")[`RecipientRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RecipientRef.html "akka.actor.typed.RecipientRef") (a common supertype of `ActorRef` and [Cluster Sharding](cluster-sharding.html) `EntityRef`), in cases where a message protocol uses `RecipientRef` instead of specifying `ActorRef` or `EntityRef`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/AsyncTestingExampleSpec.scala#L77-L80 "Go to snippet source")val pinger = testKit.spawn(Echo(), "ping")
val probe = testKit.createTestProbe[Echo.Pong]()
pinger ! Echo.Ping("hello", probe.ref)
probe.expectMessage(Echo.Pong("hello"))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/AsyncTestingExampleTest.java#L130-L133 "Go to snippet source")ActorRef<Echo.Ping> pinger = testKit.spawn(Echo.create(), "ping");
TestProbe<Echo.Pong> probe = testKit.createTestProbe();
pinger.tell(new Echo.Ping("hello", probe.ref()));
probe.expectMessage(new Echo.Pong("hello"));
```

Actors can also be spawned anonymously:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/AsyncTestingExampleSpec.scala#L86 "Go to snippet source")val pinger = testKit.spawn(Echo())
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/AsyncTestingExampleTest.java#L140 "Go to snippet source")ActorRef<Echo.Ping> pinger = testKit.spawn(Echo.create());
```

Note that you can add `import testKit._` to get access to the `spawn` and `createTestProbe` methods at the top level without prefixing them with `testKit`.

#### Stopping actors

The method will wait until the actor stops or throw an assertion error in case of a timeout.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/AsyncTestingExampleSpec.scala#L97-L106 "Go to snippet source")val pinger1 = testKit.spawn(Echo(), "pinger")
pinger1 ! Echo.Ping("hello", probe.ref)
probe.expectMessage(Echo.Pong("hello"))
testKit.stop(pinger1) // Uses default timeout

// Immediately creating an actor with the same name
val pinger2 = testKit.spawn(Echo(), "pinger")
pinger2 ! Echo.Ping("hello", probe.ref)
probe.expectMessage(Echo.Pong("hello"))
testKit.stop(pinger2, 10.seconds) // Custom timeout
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/AsyncTestingExampleTest.java#L151-L160 "Go to snippet source")ActorRef<Echo.Ping> pinger1 = testKit.spawn(Echo.create(), "pinger");
pinger1.tell(new Echo.Ping("hello", probe.ref()));
probe.expectMessage(new Echo.Pong("hello"));
testKit.stop(pinger1);

// Immediately creating an actor with the same name
ActorRef<Echo.Ping> pinger2 = testKit.spawn(Echo.create(), "pinger");
pinger2.tell(new Echo.Ping("hello", probe.ref()));
probe.expectMessage(new Echo.Pong("hello"));
testKit.stop(pinger2, Duration.ofSeconds(10));
```

The `stop` method can only be used for actors that were spawned by the same [`ActorTestKit`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/ActorTestKit.html "akka.actor.testkit.typed.javadsl.ActorTestKit")[`ActorTestKit`](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ActorTestKit.html "akka.actor.testkit.typed.scaladsl.ActorTestKit"). Other actors will not be stopped by that method.

### Observing mocked behavior

When testing a component (which may be an actor or not) that interacts with other actors it can be useful to not have to run the other actors it depends on. Instead, you might want to create mock behaviors that accept and possibly respond to messages in the same way the other actor would do but without executing any actual logic. In addition to this it can also be useful to observe those interactions to assert that the component under test did send the expected messages. This allows the same kinds of tests as classic `TestActor`/`Autopilot`.

As an example, let’s assume we’d like to test the following component:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/AsyncTestingExampleSpec.scala#L44-L56 "Go to snippet source")case class Message(i: Int, replyTo: ActorRef[Try[Int]])

class Producer(publisher: ActorRef[Message])(implicit scheduler: Scheduler) {

  def produce(messages: Int)(implicit timeout: Timeout): Unit = {
    (0 until messages).foreach(publish)
  }

  private def publish(i: Int)(implicit timeout: Timeout): Future[Try[Int]] = {
    publisher.ask(ref => Message(i, ref))
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/AsyncTestingExampleTest.java#L85-L117 "Go to snippet source")  
static class Message {
  int i;
  ActorRef<Integer> replyTo;

  Message(int i, ActorRef<Integer> replyTo) {
    this.i = i;
    this.replyTo = replyTo;
  }
}

public static class Producer {

  private Scheduler scheduler;
  private ActorRef<Message> publisher;

  Producer(Scheduler scheduler, ActorRef<Message> publisher) {
    this.scheduler = scheduler;
    this.publisher = publisher;
  }

  public void produce(int messages) {
    IntStream.range(0, messages).forEach(this::publish);
  }

  private CompletionStage<Integer> publish(int i) {
    return AskPattern.ask(
        publisher,
        (ActorRef<Integer> ref) -> new Message(i, ref),
        Duration.ofSeconds(3),
        scheduler);
  }
}
```

In our test, we create a mocked `publisher` actor. Additionally we use `Behaviors.monitor` with a `TestProbe` in order to be able to verify the interaction of the `producer` with the `publisher`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/AsyncTestingExampleSpec.scala#L113-L132 "Go to snippet source")import testKit._

// simulate the happy path
val mockedBehavior = Behaviors.receiveMessage[Message] { msg =>
  msg.replyTo ! Success(msg.i)
  Behaviors.same
}
val probe = testKit.createTestProbe[Message]()
val mockedPublisher = testKit.spawn(Behaviors.monitor(probe.ref, mockedBehavior))

// test our component
val producer = new Producer(mockedPublisher)
val messages = 3
producer.produce(messages)

// verify expected behavior
for (i <- 0 until messages) {
  val msg = probe.expectMessageType[Message]
  msg.i shouldBe i
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/AsyncTestingExampleTest.java#L167-L189 "Go to snippet source")// simulate the happy path
Behavior<Message> mockedBehavior =
    Behaviors.receiveMessage(
        message -> {
          message.replyTo.tell(message.i);
          return Behaviors.same();
        });
TestProbe<Message> probe = testKit.createTestProbe();
ActorRef<Message> mockedPublisher =
    testKit.spawn(Behaviors.monitor(Message.class, probe.ref(), mockedBehavior));

// test our component
Producer producer = new Producer(testKit.scheduler(), mockedPublisher);
int messages = 3;
producer.produce(messages);

// verify expected behavior
IntStream.range(0, messages)
    .forEach(
        i -> {
          Message msg = probe.expectMessageClass(Message.class);
          assertEquals(i, msg.i);
        });
```

### Test framework integration

If you are using JUnit you can use [`TestKitJunitResource`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html "akka.actor.testkit.typed.javadsl.TestKitJunitResource") to have the async test kit automatically shutdown when the test is complete.

Note that the dependency on JUnit is marked as optional from the test kit module, so your project must explicitly include a dependency on JUnit to use this.

If you are using ScalaTest you can extend [`ScalaTestWithActorTestKit`](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html "akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit") to have the async test kit automatically shutdown when the test is complete. This is done in `afterAll` from the `BeforeAndAfterAll` trait. If you override that method you should call `super.afterAll` to shutdown the test kit.

Note that the dependency on ScalaTest is marked as optional from the test kit module, so your project must explicitly include a dependency on ScalaTest to use this.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/ScalaTestIntegrationExampleSpec.scala#L12-L29 "Go to snippet source")import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import org.scalatest.wordspec.AnyWordSpecLike

class ScalaTestIntegrationExampleSpec extends ScalaTestWithActorTestKit with AnyWordSpecLike {

  "Something" must {
    "behave correctly" in {
      val pinger = testKit.spawn(Echo(), "ping")
      val probe = testKit.createTestProbe[Echo.Pong]()
      pinger ! Echo.Ping("hello", probe.ref)
      probe.expectMessage(Echo.Pong("hello"))
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/JunitIntegrationExampleTest.java#L13-L35 "Go to snippet source")import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.testkit.typed.javadsl.TestProbe;
import akka.actor.typed.ActorRef;
import org.junit.ClassRule;
import org.junit.Test;

public class JunitIntegrationExampleTest {

  @ClassRule public static final TestKitJunitResource testKit = new TestKitJunitResource();

  @Test
  public void testSomething() {
    ActorRef<Echo.Ping> pinger = testKit.spawn(Echo.create(), "ping");
    TestProbe<Echo.Pong> probe = testKit.createTestProbe();
    pinger.tell(new Echo.Ping("hello", probe.ref()));
    probe.expectMessage(new Echo.Pong("hello"));
  }
}
```

### Configuration

By default the `ActorTestKit` loads configuration from `application-test.conf` if that exists, otherwise it is using default configuration from the reference.conf resources that ship with the Akka libraries. The application.conf of your project is not used in this case. A specific configuration can be given as parameter when creating the TestKit.

If you prefer to use `application.conf` you can pass that as the configuration parameter to the TestKit. It’s loaded with:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/TestConfigExample.scala#L12-L14 "Go to snippet source")import com.typesafe.config.ConfigFactory

ConfigFactory.load()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/TestConfigExample.java#L8-L17 "Go to snippet source")import com.typesafe.config.ConfigFactory;

ConfigFactory.load()
```

It’s often convenient to define configuration for a specific test as a `String` in the test itself and use that as the configuration parameter to the TestKit. `ConfigFactory.parseString` can be used for that:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/TestConfigExample.scala#L18-L21 "Go to snippet source")ConfigFactory.parseString("""
  akka.loglevel = DEBUG
  akka.log-config-on-start = on
  """)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/TestConfigExample.java#L22 "Go to snippet source")ConfigFactory.parseString("akka.loglevel = DEBUG \n" + "akka.log-config-on-start = on \n")
```

Combining those approaches using `withFallback`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/TestConfigExample.scala#L25-L28 "Go to snippet source")ConfigFactory.parseString("""
  akka.loglevel = DEBUG
  akka.log-config-on-start = on
  """).withFallback(ConfigFactory.load())
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/TestConfigExample.java#L27-L28 "Go to snippet source")ConfigFactory.parseString("akka.loglevel = DEBUG \n" + "akka.log-config-on-start = on \n")
    .withFallback(ConfigFactory.load())
```

More information can be found in the [documentation of the configuration library](https://github.com/lightbend/config#using-the-library).

Note
Note that `reference.conf` files are intended for libraries to define default values and shouldn’t be used in an application. It’s not supported to override a config property owned by one library in a `reference.conf` of another library.

### Controlling the scheduler

It can be hard to reliably unit test specific scenario’s when your actor relies on timing: especially when running many tests in parallel it can be hard to get the timing just right. Making such tests more reliable by using generous timeouts make the tests take a long time to run.

For such situations, we provide a scheduler where you can manually, explicitly advance the clock.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/ManualTimerExampleSpec.scala#L8-L118 "Go to snippet source")import scala.concurrent.duration._
import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.actor.testkit.typed.scaladsl.ManualTime
import akka.actor.testkit.typed.scaladsl.TestProbe
import akka.actor.testkit.typed.scaladsl.LogCapturing
import akka.actor.typed.scaladsl.Behaviors
import org.scalatest.wordspec.AnyWordSpecLike

class ManualTimerExampleSpec
    extends ScalaTestWithActorTestKit(ManualTime.config)
    with AnyWordSpecLike
    with LogCapturing {

  val manualTime: ManualTime = ManualTime()

  "A timer" must {
    "schedule non-repeated ticks" in {
      case object Tick
      case object Tock

      val probe = TestProbe[Tock.type]()
      val behavior = Behaviors.withTimers[Tick.type] { timer =>
        timer.startSingleTimer(Tick, 10.millis)
        Behaviors.receiveMessage { _ =>
          probe.ref ! Tock
          Behaviors.same
        }
      }

      spawn(behavior)

      manualTime.expectNoMessageFor(9.millis, probe)

      manualTime.timePasses(2.millis)
      probe.expectMessage(Tock)

      manualTime.expectNoMessageFor(10.seconds, probe)
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/ManualTimerExampleTest.java#L8-L61 "Go to snippet source")  
import akka.actor.testkit.typed.javadsl.LogCapturing;
import akka.actor.testkit.typed.javadsl.ManualTime;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.testkit.typed.javadsl.TestProbe;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.Behaviors;
import java.time.Duration;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.scalatestplus.junit.JUnitSuite;

public class ManualTimerExampleTest extends JUnitSuite {

  @ClassRule
  public static final TestKitJunitResource testKit = new TestKitJunitResource(ManualTime.config());

  @Rule public final LogCapturing logCapturing = new LogCapturing();

  private final ManualTime manualTime = ManualTime.get(testKit.system());

  static final class Tick {
    private Tick() {}

    static final Tick INSTANCE = new Tick();
  }

  static final class Tock {}

  @Test
  public void testScheduleNonRepeatedTicks() {
    TestProbe<Tock> probe = testKit.createTestProbe();
    Behavior<Tick> behavior =
        Behaviors.withTimers(
            timer -> {
              timer.startSingleTimer(Tick.INSTANCE, Duration.ofMillis(10));
              return Behaviors.receiveMessage(
                  tick -> {
                    probe.ref().tell(new Tock());
                    return Behaviors.same();
                  });
            });

    testKit.spawn(behavior);

    manualTime.expectNoMessageFor(Duration.ofMillis(9), probe);

    manualTime.timePasses(Duration.ofMillis(2));
    probe.expectMessageClass(Tock.class);

    manualTime.expectNoMessageFor(Duration.ofSeconds(10), probe);
  }
}
```

### Test of logging

To verify that certain [logging](logging.html) events are emitted there is a utility called [`LoggingTestKit`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/LoggingTestKit.html "akka.actor.testkit.typed.javadsl.LoggingTestKit")[`LoggingTestKit`](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html "akka.actor.testkit.typed.scaladsl.LoggingTestKit") . You define a criteria of the expected logging events and it will assert that the given number of occurrences of matching logging events are emitted within a block of code.

Note
The [`LoggingTestKit`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/LoggingTestKit.html "akka.actor.testkit.typed.javadsl.LoggingTestKit")[`LoggingTestKit`](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html "akka.actor.testkit.typed.scaladsl.LoggingTestKit") implementation [requires Logback dependency](logging.html#logback).

For example, a criteria that verifies that an `INFO` level event with a message containing “Received message” is logged:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/LoggingDocExamples.scala#L91-L98 "Go to snippet source")import akka.actor.testkit.typed.scaladsl.LoggingTestKit

// implicit ActorSystem is needed, but that is given by ScalaTestWithActorTestKit
//implicit val system: ActorSystem[_]

LoggingTestKit.info("Received message").expect {
  ref ! Message("hello")
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/LoggingDocExamples.java#L25-L167 "Go to snippet source")import akka.actor.testkit.typed.javadsl.LoggingTestKit;

LoggingTestKit.info("Received message")
    .expect(
        system,
        () -> {
          ref.tell(new Message("hello"));
          return null;
        });
```

More advanced criteria can be built by chaining conditions that all must be satisfied for a matching event.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/LoggingDocExamples.scala#L102-L115 "Go to snippet source")LoggingTestKit
  .error[IllegalArgumentException]
  .withMessageRegex(".*was rejected.*expecting ascii input.*")
  .withCustom { event =>
    event.marker match {
      case Some(m) => m.getName == "validation"
      case None    => false
    }
  }
  .withOccurrences(2)
  .expect {
    ref ! Message("hellö")
    ref ! Message("hejdå")
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/LoggingDocExamples.java#L171-L184 "Go to snippet source")LoggingTestKit.error(IllegalArgumentException.class)
    .withMessageRegex(".*was rejected.*expecting ascii input.*")
    .withCustom(
        event ->
            event.getMarker().isPresent()
                && event.getMarker().get().getName().equals("validation"))
    .withOccurrences(2)
    .expect(
        system,
        () -> {
          ref.tell(new Message("hellö"));
          ref.tell(new Message("hejdå"));
          return null;
        });
```

See [`LoggingTestKit`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/LoggingTestKit.html "akka.actor.testkit.typed.javadsl.LoggingTestKit")[`LoggingTestKit`](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html "akka.actor.testkit.typed.scaladsl.LoggingTestKit") for more details.

### Silence logging output from tests

When running tests, it’s typically preferred to have the output to standard out, together with the output from the testing framework (ScalaTestJUnit). On one hand you want the output to be clean without logging noise, but on the other hand you want as much information as possible if there is a test failure (for example in CI builds).

The Akka TestKit provides a `LogCapturing` utility to support this with ScalaTest or JUnit. It will buffer log events instead of emitting them to the `ConsoleAppender` immediately (or whatever Logback appender that is configured). When there is a test failure the buffered events are flushed to the target appenders, typically a `ConsoleAppender`.

Note
The `LogCapturing` utility [requires Logback dependency](logging.html#logback).

Mix `LogCapturing` trait into the ScalaTestAdd a `LogCapturing` `@Rule` in the JUnit test like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/ScalaTestIntegrationExampleSpec.scala#L10-L43 "Go to snippet source")import akka.actor.testkit.typed.scaladsl.LogCapturing
import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import org.scalatest.wordspec.AnyWordSpecLike

class LogCapturingExampleSpec extends ScalaTestWithActorTestKit with AnyWordSpecLike with LogCapturing {

  "Something" must {
    "behave correctly" in {
      val pinger = testKit.spawn(Echo(), "ping")
      val probe = testKit.createTestProbe[Echo.Pong]()
      pinger ! Echo.Ping("hello", probe.ref)
      probe.expectMessage(Echo.Pong("hello"))
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/LogCapturingExampleTest.java#L10-L31 "Go to snippet source")import akka.actor.testkit.typed.javadsl.LogCapturing;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.testkit.typed.javadsl.TestProbe;
import akka.actor.typed.ActorRef;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

public class LogCapturingExampleTest {

  @ClassRule public static final TestKitJunitResource testKit = new TestKitJunitResource();

  @Rule public final LogCapturing logCapturing = new LogCapturing();

  @Test
  public void testSomething() {
    ActorRef<Echo.Ping> pinger = testKit.spawn(Echo.create(), "ping");
    TestProbe<Echo.Pong> probe = testKit.createTestProbe();
    pinger.tell(new Echo.Ping("hello", probe.ref()));
    probe.expectMessage(new Echo.Pong("hello"));
  }
}
```

Then you also need to configure the `CapturingAppender` and `CapturingAppenderDelegate` in `src/test/resources/logback-test.xml`:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/resources/logback-doc-test.xml "Go to snippet source")<?xml version="1.0" encoding="UTF-8"?>
<configuration>

    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <filter class="ch.qos.logback.classic.filter.ThresholdFilter">
            <level>INFO</level>
        </filter>
        <encoder>
            <pattern>[%date{ISO8601}] [%level] [%logger] [%marker] [%thread] - %msg MDC: {%mdc}%n</pattern>
        </encoder>
    </appender>

    <!--
    Logging from tests are silenced by this appender. When there is a test failure
    the captured logging events are flushed to the appenders defined for the
    akka.actor.testkit.typed.internal.CapturingAppenderDelegate logger.
    -->
    <appender name="CapturingAppender" class="akka.actor.testkit.typed.internal.CapturingAppender" />

    <!--
    The appenders defined for this CapturingAppenderDelegate logger are used
    when there is a test failure and all logging events from the test are
    flushed to these appenders.
    -->
    <logger name="akka.actor.testkit.typed.internal.CapturingAppenderDelegate" >
      <appender-ref ref="STDOUT"/>
    </logger>

    <root level="DEBUG">
        <appender-ref ref="CapturingAppender"/>
    </root>
</configuration>
```

## Code Examples

### Example 1: Basic example

```scala
object Echo {
  case class Ping(message: String, response: ActorRef[Pong])
  case class Pong(message: String)

  def apply(): Behavior[Ping] = Behaviors.receiveMessage {
    case Ping(m, replyTo) =>
      replyTo ! Pong(m)
      Behaviors.same
  }
}
```

### Example 2: Basic example

```java
public static class Echo {
  public static class Ping {
    public final String message;
    public final ActorRef<Pong> replyTo;

    public Ping(String message, ActorRef<Pong> replyTo) {
      this.message = message;
      this.replyTo = replyTo;
    }
  }

  public static class Pong {
    public final String message;

    public Pong(String message) {
      this.message = message;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Pong)) return false;
      Pong pong = (Pong) o;
      return message.equals(pong.message);
    }

    @Override
    public int hashCode() {
      return Objects.hash(message);
    }
  }

  public static Behavior<Ping> create() {
    return Behaviors.receive(Ping.class)
        .onMessage(
            Ping.class,
            ping -> {
              ping.replyTo.tell(new Pong(ping.message));
              return Behaviors.same();
            })
        .build();
  }
}
```

### Example 3: Basic example

```scala
import akka.actor.testkit.typed.scaladsl.ActorTestKit

import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class AsyncTestingExampleSpec
    extends AnyWordSpec
    with BeforeAndAfterAll
    with Matchers {
  val testKit = ActorTestKit()
}
```

### Example 4: Basic example

```java
import akka.actor.testkit.typed.javadsl.ActorTestKit;

public class AsyncTestingExampleTest
{
  static final ActorTestKit testKit = ActorTestKit.create();
}
```

### Example 5: Basic example

```scala
override def afterAll(): Unit = testKit.shutdownTestKit()
```

### Example 6: Basic example

```java
@AfterClass
public static void cleanup() {
  testKit.shutdownTestKit();
}
```

### Example 7: Basic example

```scala
val pinger = testKit.spawn(Echo(), "ping")
val probe = testKit.createTestProbe[Echo.Pong]()
pinger ! Echo.Ping("hello", probe.ref)
probe.expectMessage(Echo.Pong("hello"))
```

### Example 8: Basic example

```java
ActorRef<Echo.Ping> pinger = testKit.spawn(Echo.create(), "ping");
TestProbe<Echo.Pong> probe = testKit.createTestProbe();
pinger.tell(new Echo.Ping("hello", probe.ref()));
probe.expectMessage(new Echo.Pong("hello"));
```

### Example 9: Basic example

```scala
val pinger = testKit.spawn(Echo())
```

### Example 10: Basic example

```java
ActorRef<Echo.Ping> pinger = testKit.spawn(Echo.create());
```

### Example 11: Stopping actors

```scala
val pinger1 = testKit.spawn(Echo(), "pinger")
pinger1 ! Echo.Ping("hello", probe.ref)
probe.expectMessage(Echo.Pong("hello"))
testKit.stop(pinger1) // Uses default timeout

// Immediately creating an actor with the same name
val pinger2 = testKit.spawn(Echo(), "pinger")
pinger2 ! Echo.Ping("hello", probe.ref)
probe.expectMessage(Echo.Pong("hello"))
testKit.stop(pinger2, 10.seconds) // Custom timeout
```

### Example 12: Stopping actors

```java
ActorRef<Echo.Ping> pinger1 = testKit.spawn(Echo.create(), "pinger");
pinger1.tell(new Echo.Ping("hello", probe.ref()));
probe.expectMessage(new Echo.Pong("hello"));
testKit.stop(pinger1);

// Immediately creating an actor with the same name
ActorRef<Echo.Ping> pinger2 = testKit.spawn(Echo.create(), "pinger");
pinger2.tell(new Echo.Ping("hello", probe.ref()));
probe.expectMessage(new Echo.Pong("hello"));
testKit.stop(pinger2, Duration.ofSeconds(10));
```

### Example 13: Observing mocked behavior

```scala
case class Message(i: Int, replyTo: ActorRef[Try[Int]])

class Producer(publisher: ActorRef[Message])(implicit scheduler: Scheduler) {

  def produce(messages: Int)(implicit timeout: Timeout): Unit = {
    (0 until messages).foreach(publish)
  }

  private def publish(i: Int)(implicit timeout: Timeout): Future[Try[Int]] = {
    publisher.ask(ref => Message(i, ref))
  }

}
```

### Example 14: Observing mocked behavior

```java
static class Message {
  int i;
  ActorRef<Integer> replyTo;

  Message(int i, ActorRef<Integer> replyTo) {
    this.i = i;
    this.replyTo = replyTo;
  }
}

public static class Producer {

  private Scheduler scheduler;
  private ActorRef<Message> publisher;

  Producer(Scheduler scheduler, ActorRef<Message> publisher) {
    this.scheduler = scheduler;
    this.publisher = publisher;
  }

  public void produce(int messages) {
    IntStream.range(0, messages).forEach(this::publish);
  }

  private CompletionStage<Integer> publish(int i) {
    return AskPattern.ask(
        publisher,
        (ActorRef<Integer> ref) -> new Message(i, ref),
        Duration.ofSeconds(3),
        scheduler);
  }
}
```

### Example 15: Observing mocked behavior

```scala
import testKit._

// simulate the happy path
val mockedBehavior = Behaviors.receiveMessage[Message] { msg =>
  msg.replyTo ! Success(msg.i)
  Behaviors.same
}
val probe = testKit.createTestProbe[Message]()
val mockedPublisher = testKit.spawn(Behaviors.monitor(probe.ref, mockedBehavior))

// test our component
val producer = new Producer(mockedPublisher)
val messages = 3
producer.produce(messages)

// verify expected behavior
for (i <- 0 until messages) {
  val msg = probe.expectMessageType[Message]
  msg.i shouldBe i
}
```

### Example 16: Observing mocked behavior

```java
// simulate the happy path
Behavior<Message> mockedBehavior =
    Behaviors.receiveMessage(
        message -> {
          message.replyTo.tell(message.i);
          return Behaviors.same();
        });
TestProbe<Message> probe = testKit.createTestProbe();
ActorRef<Message> mockedPublisher =
    testKit.spawn(Behaviors.monitor(Message.class, probe.ref(), mockedBehavior));

// test our component
Producer producer = new Producer(testKit.scheduler(), mockedPublisher);
int messages = 3;
producer.produce(messages);

// verify expected behavior
IntStream.range(0, messages)
    .forEach(
        i -> {
          Message msg = probe.expectMessageClass(Message.class);
          assertEquals(i, msg.i);
        });
```

### Example 17: Test framework integration

```scala
import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import org.scalatest.wordspec.AnyWordSpecLike

class ScalaTestIntegrationExampleSpec extends ScalaTestWithActorTestKit with AnyWordSpecLike {

  "Something" must {
    "behave correctly" in {
      val pinger = testKit.spawn(Echo(), "ping")
      val probe = testKit.createTestProbe[Echo.Pong]()
      pinger ! Echo.Ping("hello", probe.ref)
      probe.expectMessage(Echo.Pong("hello"))
    }
  }
}
```

### Example 18: Test framework integration

```java
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.testkit.typed.javadsl.TestProbe;
import akka.actor.typed.ActorRef;
import org.junit.ClassRule;
import org.junit.Test;

public class JunitIntegrationExampleTest {

  @ClassRule public static final TestKitJunitResource testKit = new TestKitJunitResource();


  @Test
  public void testSomething() {
    ActorRef<Echo.Ping> pinger = testKit.spawn(Echo.create(), "ping");
    TestProbe<Echo.Pong> probe = testKit.createTestProbe();
    pinger.tell(new Echo.Ping("hello", probe.ref()));
    probe.expectMessage(new Echo.Pong("hello"));
  }
}
```

### Example 19: Configuration

```scala
import com.typesafe.config.ConfigFactory

ConfigFactory.load()
```

### Example 20: Configuration

```java
import com.typesafe.config.ConfigFactory;

ConfigFactory.load()
```

### Example 21: Configuration

```scala
ConfigFactory.parseString("""
  akka.loglevel = DEBUG
  akka.log-config-on-start = on
  """)
```

### Example 22: Configuration

```java
ConfigFactory.parseString("akka.loglevel = DEBUG \n" + "akka.log-config-on-start = on \n")
```

### Example 23: Configuration

```scala
ConfigFactory.parseString("""
  akka.loglevel = DEBUG
  akka.log-config-on-start = on
  """).withFallback(ConfigFactory.load())
```

### Example 24: Configuration

```java
ConfigFactory.parseString("akka.loglevel = DEBUG \n" + "akka.log-config-on-start = on \n")
    .withFallback(ConfigFactory.load())
```

### Example 25: Controlling the scheduler

```scala
import scala.concurrent.duration._
import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.actor.testkit.typed.scaladsl.ManualTime
import akka.actor.testkit.typed.scaladsl.TestProbe
import akka.actor.testkit.typed.scaladsl.LogCapturing
import akka.actor.typed.scaladsl.Behaviors
import org.scalatest.wordspec.AnyWordSpecLike

class ManualTimerExampleSpec
    extends ScalaTestWithActorTestKit(ManualTime.config)
    with AnyWordSpecLike
    with LogCapturing {

  val manualTime: ManualTime = ManualTime()

  "A timer" must {
    "schedule non-repeated ticks" in {
      case object Tick
      case object Tock

      val probe = TestProbe[Tock.type]()
      val behavior = Behaviors.withTimers[Tick.type] { timer =>
        timer.startSingleTimer(Tick, 10.millis)
        Behaviors.receiveMessage { _ =>
          probe.ref ! Tock
          Behaviors.same
        }
      }

      spawn(behavior)

      manualTime.expectNoMessageFor(9.millis, probe)

      manualTime.timePasses(2.millis)
      probe.expectMessage(Tock)

      manualTime.expectNoMessageFor(10.seconds, probe)
    }
  }
}
```

### Example 26: Controlling the scheduler

```java
import akka.actor.testkit.typed.javadsl.LogCapturing;
import akka.actor.testkit.typed.javadsl.ManualTime;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.testkit.typed.javadsl.TestProbe;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.Behaviors;
import java.time.Duration;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.scalatestplus.junit.JUnitSuite;

public class ManualTimerExampleTest extends JUnitSuite {

  @ClassRule
  public static final TestKitJunitResource testKit = new TestKitJunitResource(ManualTime.config());

  @Rule public final LogCapturing logCapturing = new LogCapturing();

  private final ManualTime manualTime = ManualTime.get(testKit.system());

  static final class Tick {
    private Tick() {}

    static final Tick INSTANCE = new Tick();
  }

  static final class Tock {}

  @Test
  public void testScheduleNonRepeatedTicks() {
    TestProbe<Tock> probe = testKit.createTestProbe();
    Behavior<Tick> behavior =
        Behaviors.withTimers(
            timer -> {
              timer.startSingleTimer(Tick.INSTANCE, Duration.ofMillis(10));
              return Behaviors.receiveMessage(
                  tick -> {
                    probe.ref().tell(new Tock());
                    return Behaviors.same();
                  });
            });

    testKit.spawn(behavior);

    manualTime.expectNoMessageFor(Duration.ofMillis(9), probe);

    manualTime.timePasses(Duration.ofMillis(2));
    probe.expectMessageClass(Tock.class);

    manualTime.expectNoMessageFor(Duration.ofSeconds(10), probe);
  }
}
```

### Example 27: Test of logging

```scala
import akka.actor.testkit.typed.scaladsl.LoggingTestKit

// implicit ActorSystem is needed, but that is given by ScalaTestWithActorTestKit
//implicit val system: ActorSystem[_]

LoggingTestKit.info("Received message").expect {
  ref ! Message("hello")
}
```

### Example 28: Test of logging

```java
import akka.actor.testkit.typed.javadsl.LoggingTestKit;

LoggingTestKit.info("Received message")
    .expect(
        system,
        () -> {
          ref.tell(new Message("hello"));
          return null;
        });
```

### Example 29: Test of logging

```scala
LoggingTestKit
  .error[IllegalArgumentException]
  .withMessageRegex(".*was rejected.*expecting ascii input.*")
  .withCustom { event =>
    event.marker match {
      case Some(m) => m.getName == "validation"
      case None    => false
    }
  }
  .withOccurrences(2)
  .expect {
    ref ! Message("hellö")
    ref ! Message("hejdå")
  }
```

### Example 30: Test of logging

```java
LoggingTestKit.error(IllegalArgumentException.class)
    .withMessageRegex(".*was rejected.*expecting ascii input.*")
    .withCustom(
        event ->
            event.getMarker().isPresent()
                && event.getMarker().get().getName().equals("validation"))
    .withOccurrences(2)
    .expect(
        system,
        () -> {
          ref.tell(new Message("hellö"));
          ref.tell(new Message("hejdå"));
          return null;
        });
```

### Example 31: Silence logging output from tests

```scala
import akka.actor.testkit.typed.scaladsl.LogCapturing
import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import org.scalatest.wordspec.AnyWordSpecLike

class LogCapturingExampleSpec extends ScalaTestWithActorTestKit with AnyWordSpecLike with LogCapturing {

  "Something" must {
    "behave correctly" in {
      val pinger = testKit.spawn(Echo(), "ping")
      val probe = testKit.createTestProbe[Echo.Pong]()
      pinger ! Echo.Ping("hello", probe.ref)
      probe.expectMessage(Echo.Pong("hello"))
    }
  }
}
```

### Example 32: Silence logging output from tests

```java
import akka.actor.testkit.typed.javadsl.LogCapturing;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.testkit.typed.javadsl.TestProbe;
import akka.actor.typed.ActorRef;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

public class LogCapturingExampleTest {

  @ClassRule public static final TestKitJunitResource testKit = new TestKitJunitResource();

  @Rule public final LogCapturing logCapturing = new LogCapturing();

  @Test
  public void testSomething() {
    ActorRef<Echo.Ping> pinger = testKit.spawn(Echo.create(), "ping");
    TestProbe<Echo.Pong> probe = testKit.createTestProbe();
    pinger.tell(new Echo.Ping("hello", probe.ref()));
    probe.expectMessage(new Echo.Pong("hello"));
  }
}
```

### Example 33: Silence logging output from tests

```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>

    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <filter class="ch.qos.logback.classic.filter.ThresholdFilter">
            <level>INFO</level>
        </filter>
        <encoder>
            <pattern>[%date{ISO8601}] [%level] [%logger] [%marker] [%thread] - %msg MDC: {%mdc}%n</pattern>
        </encoder>
    </appender>

    <!--
    Logging from tests are silenced by this appender. When there is a test failure
    the captured logging events are flushed to the appenders defined for the
    akka.actor.testkit.typed.internal.CapturingAppenderDelegate logger.
    -->
    <appender name="CapturingAppender" class="akka.actor.testkit.typed.internal.CapturingAppender" />

    <!--
    The appenders defined for this CapturingAppenderDelegate logger are used
    when there is a test failure and all logging events from the test are
    flushed to these appenders.
    -->
    <logger name="akka.actor.testkit.typed.internal.CapturingAppenderDelegate" >
      <appender-ref ref="STDOUT"/>
    </logger>

    <root level="DEBUG">
        <appender-ref ref="CapturingAppender"/>
    </root>
</configuration>
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/ActorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/libraries/akka-core/current/testing.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/typed/logging.html
- https://doc.akka.io/libraries/akka-core/current/typed/testing-async.html
- https://doc.akka.io/libraries/akka-core/current/typed/testing-sync.html
- https://doc.akka.io/libraries/akka-core/current/typed/testing.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/testing-async.html](https://doc.akka.io/libraries/akka-core/current/typed/testing-async.html)*