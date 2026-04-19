---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:06Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/docs/akka/current/testing.html
title: Testing Classic Actors • Akka Documentation
---

# Testing Classic Actors • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Testing Classic Actors

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the new API see [testing](typed/testing.html).

## Module info

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/maven")

```
Maven
```
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>

```
Gradle
```
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}

```

To use Akka Testkit, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.8.9"
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % AkkaVersion % Test
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.8.9</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-testkit_${scala.binary.version}</artifactId>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.8.9")

  testImplementation "com.typesafe.akka:akka-testkit_${versions.ScalaBinary}"
}
```

| Project Info: Akka Actor Testkit (classic) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-testkit 2\.8\.9 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Adopt OpenJDK 8Adopt OpenJDK 11 |
| Scala versions | 2\.13\.11, 2\.12\.18, 3\.2\.2 |
| JPMS module name | akka.actor.testkit |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka/v2.8.9/LICENSE) |
| Readiness level | [Supported](https://developer.lightbend.com/docs/introduction/getting-help/support-terminology.html#supported), [Lightbend Subscription](https://www.lightbend.com/lightbend-subscription) provides support Since 2\.0, 2012\-03\-06 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka/2.8.9/akka/testkit/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka/2.8.9/akka/testkit/package-summary.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io) [akka/akka Gitter channel](https://gitter.im/akka/akka) |
| Release notes | [akka.io blog](https://akka.io/blog/news-archive.html) |
| Issues | [Github issues](https://github.com/akka/akka/issues) |
| Sources | <https://github.com/akka/akka> |

## Introduction

As with any piece of software, automated tests are a very important part of the development cycle. The actor model presents a different view on how units of code are delimited and how they interact, which influences how to perform tests.

Akka comes with a dedicated module `akka-testkit` for supporting tests.

## Asynchronous Testing: `TestKit`

Testkit allows you to test your actors in a controlled but realistic environment. The definition of the environment depends very much on the problem at hand and the level at which you intend to test, ranging from simple checks to full system tests.

The minimal setup consists of the test procedure, which provides the desired stimuli, the actor under test, and an actor receiving replies. Bigger systems replace the actor under test with a network of actors, apply stimuli at varying injection points and arrange results to be sent from different emission points, but the basic principle stays the same in that a single procedure drives the test.

The `TestKit` class contains a collection of tools which makes this common task easy.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/PlainWordSpec.scala#L8-L36 "Go to snippet source")import akka.actor.ActorSystem
import akka.testkit.{ ImplicitSender, TestActors, TestKit }
import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class MySpec()
    extends TestKit(ActorSystem("MySpec"))
    with ImplicitSender
    with AnyWordSpecLike
    with Matchers
    with BeforeAndAfterAll {

  override def afterAll(): Unit = {
    TestKit.shutdownActorSystem(system)
  }

  "An Echo actor" must {

    "send back messages unchanged" in {
      val echo = system.actorOf(TestActors.echoActorProps)
      echo ! "hello world"
      expectMsg("hello world")
    }

  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitSampleTest.java#L8-L99 "Go to snippet source")import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.testkit.javadsl.TestKit;
import java.time.Duration;
import jdocs.AbstractJavaTest;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestKitSampleTest extends AbstractJavaTest {

  public static class SomeActor extends AbstractActor {
    ActorRef target = null;

    @Override
    public Receive createReceive() {
      return receiveBuilder()
          .matchEquals(
              "hello",
              message -> {
                getSender().tell("world", getSelf());
                if (target != null) target.forward(message, getContext());
              })
          .match(
              ActorRef.class,
              actorRef -> {
                target = actorRef;
                getSender().tell("done", getSelf());
              })
          .build();
    }
  }

  static ActorSystem system;

  @BeforeClass
  public static void setup() {
    system = ActorSystem.create();
  }

  @AfterClass
  public static void teardown() {
    TestKit.shutdownActorSystem(system);
    system = null;
  }

  @Test
  public void testIt() {
    /*
     * Wrap the whole test procedure within a testkit constructor
     * if you want to receive actor replies or use Within(), etc.
     */
    new TestKit(system) {
      {
        final Props props = Props.create(SomeActor.class);
        final ActorRef subject = system.actorOf(props);

        // can also use JavaTestKit “from the outside”
        final TestKit probe = new TestKit(system);
        // “inject” the probe by passing it to the test subject
        // like a real resource would be passed in production
        subject.tell(probe.getRef(), getRef());
        // await the correct response
        expectMsg(Duration.ofSeconds(1), "done");

        // the run() method needs to finish within 3 seconds
        within(
            Duration.ofSeconds(3),
            () -> {
              subject.tell("hello", getRef());

              // This is a demo: would normally use expectMsgEquals().
              // Wait time is bounded by 3-second deadline above.
              awaitCond(probe::msgAvailable);

              // response must have been enqueued to us before probe
              expectMsg(Duration.ZERO, "world");
              // check that the probe we injected earlier got the msg
              probe.expectMsg(Duration.ZERO, "hello");
              Assert.assertEquals(getRef(), probe.getLastSender());

              // Will wait for the rest of the 3 seconds
              expectNoMessage();
              return null;
            });
      }
    };
  }
}
```

The `TestKit` contains an actor named `testActor` which is the entry point for messages to be examined with the various `expectMsg...` assertions detailed below. When mixing in the trait `ImplicitSender` this test actor is implicitly used as sender reference when dispatching messages from the test procedure. The test actor’s reference is obtained using the `getRef()` method as demonstrated above. The `testActor` may also be passed to other actors, as usual, usually subscribing it as notification listener. There is a whole set of examination methods, e.g. receiving all consecutive messages matching certain criteria, receiving a whole sequence of fixed messages or classes, receiving nothing for some time, etc.

The ActorSystem passed to the constructor of TestKit is accessible via the `system` member`getSystem()` method.

Note
Remember to shut down the actor system after the test is finished (also in case of failure) so that all actors—including the test actor—are stopped.

### Built\-In Assertions

The above\-mentioned `expectMsg``expectMsgEquals` is not the only method for formulating assertions concerning received messages, the full set is this:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L123-L132 "Go to snippet source")val hello: String = expectMsg("hello")
val any: String = expectMsgAnyOf("hello", "world")
val all: immutable.Seq[String] = expectMsgAllOf("hello", "world")
val i: Int = expectMsgType[Int]
expectNoMessage(200.millis)
val two: immutable.Seq[AnyRef] = receiveN(2)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L248-L258 "Go to snippet source")final String hello = expectMsgEquals("hello");
final String any = expectMsgAnyOf("hello", "world");
final List<String> all = expectMsgAllOf("hello", "world");
final int i = expectMsgClass(Integer.class);
final Number j = expectMsgAnyClassOf(Integer.class, Long.class);
expectNoMessage();
final List<Object> two = receiveN(2);
```

In these examples, the maximum durations you will find mentioned below are left out, in which case they use the default value from the configuration item `akka.test.single-expect-default` which itself defaults to 3 seconds (or they obey the innermost enclosing `Within` as detailed [below](testing.html#testkit-within)). The full signatures are:

- `expectMsg[T](d: Duration, msg: T): T``public <T> T expectMsgEquals(Duration max, T msg)` The given message object must be received within the specified time; the object will be returned.
- `expectMsgPF[T](d: Duration)(pf: PartialFunction[Any, T]): T``public <T> T expectMsgPF(Duration max, String hint, Function<Object, T> f)` Within the given time, a message must be received and the given partial function must be defined for that message; the result from applying the partial function to the received message is returned. The duration may be left unspecified (empty parentheses are required in this case) to use the deadline from the innermost enclosing [within](testing.html#testkit-within) block instead.
- `expectMsgClass[T](d: Duration, c: Class[T]): T``public <T> T expectMsgClass(Duration max, Class<T> c)` An object which is an instance of the given `Class` must be received within the allotted time frame; the object will be returned. Note that this does a conformance check; if you need the class to be equal, have a look at `expectMsgAllClassOf` with a single given class argumentyou need to verify that afterwards.

- `expectMsgType[T: Manifest](d: Duration)` An object which is an instance of the given type (after erasure) must be received within the allotted time frame; the object will be returned. This method is approximately equivalent to `expectMsgClass(implicitly[ClassTag[T]].runtimeClass)`.

- `expectMsgAnyOf[T](d: Duration, obj: T*): T``public Object expectMsgAnyOf(Duration max, Object... msg)` An object must be received within the given time, and it must be equal ( compared with `==``equals()`) to at least one of the passed reference objects; the received object will be returned.
- `expectMsgAnyClassOf[T](d: Duration, obj: Class[_ <: T]*): T``public <T> T expectMsgAnyClassOf(Duration max, Class<? extends T>... c)` An object must be received within the given time, and it must be an instance of at least one of the supplied `Class` objects; the received object will be returned. Note that this does a conformance check, if you need the class to be equal you need to verify that afterwards.
- `expectMsgAllOf[T](d: Duration, obj: T*): Seq[T]``public List<Object> expectMsgAllOf(Duration max, Object... msg)` Several objects matching the size of the supplied object array must be received within the given time, and for each of the given objects there must exist at least one among the received ones which equals (compared with `==``equals()`) it. The full sequence of received objects is returned in the order received.

- `expectMsgAllClassOf[T](d: Duration, c: Class[_ <: T]*): Seq[T]` Several objects matching the size of the supplied `Class` array must be received within the given time, and for each of the given classes there must exist at least one among the received objects whose class equals (compared with `==`) it (this is *not* a conformance check). The full sequence of received objects is returned.
- `expectMsgAllConformingOf[T](d: Duration, c: Class[_ <: T]*): Seq[T]` Several objects matching the size of the supplied `Class` array must be received within the given time, and for each of the given classes there must exist at least one among the received objects which is an instance of this class. The full sequence of received objects is returned.

- `expectNoMessage(d: Duration)``public void expectNoMessage(Duration max)` No message must be received within the given time. This also fails if a message has been received before calling this method which has not been removed from the queue using one of the other methods.
- `receiveN(n: Int, d: Duration): Seq[AnyRef]``List<Object> receiveN(int n, Duration max)` `n` messages must be received within the given time; the received messages are returned.

- `fishForMessage(max: Duration, hint: String)(pf: PartialFunction[Any, Boolean]): Any` Keep receiving messages as long as the time is not used up and the partial function matches and returns `false`. Returns the message received for which it returned `true` or throws an exception, which will include the provided hint for easier debugging.

In addition to message reception assertions there are also methods which help with message flows:

- `receiveOne(d: Duration): AnyRef` Tries to receive one message for at most the given time interval and returns `null` in case of failure. If the given Duration is zero, the call is non\-blocking (polling mode).

- `receiveWhile[T](max: Duration, idle: Duration, messages: Int)(pf: PartialFunction[Any, T]): Seq[T]``public <T> List<T> receiveWhile(Duration max, Duration idle, Int messages, Function<Object, T> f)` Collect messages as long as

	- they are matching the given partial function
	- the given time interval is not used up
	- the next message is received within the idle timeout
	- the number of messages has not yet reached the maximum All collected messages are returned. The maximum duration defaults to the time remaining in the innermost enclosing [within](testing.html#testkit-within) block and the idle duration defaults to infinity (thereby disabling the idle\-timeout feature). The number of expected messages defaults to `Int.MaxValue`, which effectively disables this limit.
- `awaitCond(p: => Boolean, max: Duration, interval: Duration)``public void awaitCond(Duration max, Duration interval, Supplier<Boolean> p)` Poll the given condition every `interval` until it returns `true` or the `max` duration is used up. The interval defaults to 100 ms and the maximum defaults to the time remaining in the innermost enclosing [within](#testkit-within) block.
- `awaitAssert(a: => Any, max: Duration, interval: Duration)``public void awaitAssert(Duration max, Duration interval, Supplier<Object> a)` Poll the given assert function every `interval` until it does not throw an exception or the `max` duration is used up. If the timeout expires the last exception is thrown. The interval defaults to 100 ms and the maximum defaults to the time remaining in the innermost enclosing [within](testing.html#testkit-within) block. The interval defaults to 100 ms and the maximum defaults to the time remaining in the innermost enclosing [within](testing.html#testkit-within) block. Return an arbitrary value that would be returned from awaitAssert if successful, if not interested in such value you can return null.
- `ignoreMsg(pf: PartialFunction[AnyRef, Boolean])``public void ignoreMsg(Function<Object, Boolean> f)` `ignoreMsg``public void ignoreMsg()` There are also cases where not all messages sent to the test kit are actually relevant to the test, but removing them would mean altering the actors under test. For this purpose it is possible to ignore certain messages. The internal `testActor` contains a partial function for ignoring messages: it will only enqueue messages which do not match the function or for which the function returns `false`. This function can be set and reset using the methods given above; each invocation replaces the previous function, they are not composed. This feature is useful e.g. when testing a logging system, where you want to ignore regular messages and are only interested in your specific ones.

### Expecting Log Messages

Since an integration test does not allow observing the internal processing of the participating actors, verifying expected exceptions cannot be done directly. Instead, use the logging system for this purpose: replacing the normal event handler with the `TestEventListener` and using an `EventFilter` allows assertions on log messages, including those which are generated by exceptions:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L322-L337 "Go to snippet source")import akka.testkit.EventFilter
import com.typesafe.config.ConfigFactory

implicit val system: ActorSystem = ActorSystem(
  "testsystem",
  ConfigFactory.parseString("""
  akka.loggers = ["akka.testkit.TestEventListener"]
  """))
try {
  val actor = system.actorOf(Props.empty)
  EventFilter[ActorKilledException](occurrences = 1).intercept {
    actor ! Kill
  }
} finally {
  shutdown(system)
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L500-L516 "Go to snippet source")new TestKit(system) {
  {
    assertEquals("TestKitDocTest", system.name());
    final ActorRef victim = system.actorOf(Props.empty(), "victim");

    final int result =
        new EventFilter(ActorKilledException.class, system)
            .from("akka://TestKitDocTest/user/victim")
            .occurrences(1)
            .intercept(
                () -> {
                  victim.tell(Kill.getInstance(), ActorRef.noSender());
                  return 42;
                });
    assertEquals(42, result);
  }
};
```

If the number of occurrences is specific—as demonstrated above—then `intercept` will block until that number of matching messages have been received or the timeout configured in `akka.test.filter-leeway` is used up (time starts counting after the passed\-in block of code returns). In case of a timeout the test fails.

Note
Be sure to exchange the default logger with the `TestEventListener` in your `application.conf` to enable this function:

```
akka.loggers = [akka.testkit.TestEventListener]

```

### Overriding behavior

Sometimes you want to ‘hook into’ your actor to be able to test some internals. Usually, it is better to test an actors’ external interface, but for example if you want to test timing\-sensitive behavior this can come in handy. Say for instance you want to test an actor that schedules a task:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L75-L87 "Go to snippet source")case class TriggerScheduling(foo: String)

object SchedKey
case class ScheduledMessage(foo: String)

class TestTimerActor extends Actor with Timers {
  override def receive = {
    case TriggerScheduling(foo) => triggerScheduling(ScheduledMessage(foo))
  }

  def triggerScheduling(msg: ScheduledMessage) =
    timers.startSingleTimer(SchedKey, msg, 500.millis)
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L80-L95 "Go to snippet source")static class TestTimerActor extends AbstractActorWithTimers {
  private static Object SCHED_KEY = "SchedKey";

  static final class TriggerScheduling {}

  static final class ScheduledMessage {}

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(TriggerScheduling.class, msg -> triggerScheduling()).build();
  }

  void triggerScheduling() {
    getTimers().startSingleTimer(SCHED_KEY, new ScheduledMessage(), Duration.ofMillis(500));
  }
}
```

You can override the method that does the scheduling in your test:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L299-L309 "Go to snippet source")import akka.testkit.TestProbe
import akka.actor.Props

val probe = TestProbe()
val actor = system.actorOf(Props(new TestTimerActor() {
  override def triggerScheduling(msg: ScheduledMessage) =
    probe.ref ! msg
}))

actor ! TriggerScheduling("abc")
probe.expectMsg(ScheduledMessage("abc"))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L428-L445 "Go to snippet source")new TestKit(system) {
  {
    final TestKit probe = new TestKit(system);
    final ActorRef target =
        system.actorOf(
            Props.create(
                TestTimerActor.class,
                () ->
                    new TestTimerActor() {
                      @Override
                      void triggerScheduling() {
                        probe.getRef().tell(new ScheduledMessage(), getSelf());
                      }
                    }));
    target.tell(new TestTimerActor.TriggerScheduling(), ActorRef.noSender());
    probe.expectMsgClass(TestTimerActor.ScheduledMessage.class);
  }
};
```

### Timing Assertions

Another important part of functional testing concerns timing: certain events must not happen immediately (like a timer), others need to happen before a deadline. Therefore, all examination methods accept an upper time limit within the positive or negative result must be obtained. Lower time limits need to be checked external to the examination, which is facilitated by a new construct for managing time constraints:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L204-L213 "Go to snippet source")import akka.actor.Props
import scala.concurrent.duration._

val worker = system.actorOf(Props[Worker]())
within(200 millis) {
  worker ! "some work"
  expectMsg("some result")
  expectNoMessage() // will block for the rest of the 200ms
  Thread.sleep(300) // will NOT make this block fail
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L127-L138 "Go to snippet source")new TestKit(system) {
  {
    getRef().tell(42, ActorRef.noSender());
    within(
        Duration.ZERO,
        Duration.ofSeconds(1),
        () -> {
          assertEquals((Integer) 42, expectMsgClass(Integer.class));
          return null;
        });
  }
};
```

The block given toin `within` must complete after a duration which is between `min` and `max`, where the former defaults to zero. The deadline calculated by adding the `max` parameter to the block’s start time is implicitly available within the block to all examination methods, if you do not specify it, it is inherited from the innermost enclosing `within` block.

It should be noted that if the last message\-receiving assertion of the block is `expectNoMessage` or `receiveWhile`, the final check of the `within` is skipped to avoid false positives due to wake\-up latencies. This means that while individual contained assertions still use the maximum time bound, the overall block may take arbitrarily longer in this case.

Note
All times are measured using `System.nanoTime`, meaning that they describe wall time, not CPU time or system time.

Ray Roestenburg has written a great article on using the TestKit: [https://web.archive.org/web/20180114133958/http://roestenburg.agilesquad.com/2011/02/unit\-testing\-akka\-actors\-with\-testkit\_12\.html](https://web.archive.org/web/20180114133958/http://roestenburg.agilesquad.com/2011/02/unit-testing-akka-actors-with-testkit_12.html). His full example is also available [here](testing.html#example).

#### Accounting for Slow Test Systems

The tight timeouts you use during testing on your lightning\-fast notebook will invariably lead to spurious test failures on the heavily loaded Jenkins server (or similar). To account for this situation, all maximum durations are internally scaled by a factor taken from the [Configuration](general/configuration-reference.html#config-akka-testkit), `akka.test.timefactor`, which defaults to 1\.

You can scale other durations with the same factor by using the implicit conversion in `akka.testkit` package object to add dilated function to `Duration``dilated` method in `TestKit`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L219-L221 "Go to snippet source")import scala.concurrent.duration._
import akka.testkit._
10.milliseconds.dilated
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L291-L297 "Go to snippet source")new TestKit(system) {
  {
    final Duration original = Duration.ofSeconds(1);
    final Duration stretched = dilated(original);
    assertTrue("dilated", stretched.compareTo(original) >= 0);
  }
};
```

### Resolving Conflicts with Implicit ActorRef

If you want the sender of messages inside your TestKit\-based tests to be the `testActor` mix in `ImplicitSender` into your test.

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/PlainWordSpec.scala#L15-L20 "Go to snippet source")class MySpec()
    extends TestKit(ActorSystem("MySpec"))
    with ImplicitSender
    with AnyWordSpecLike
    with Matchers
    with BeforeAndAfterAll {
```

### Using Multiple Probe Actors

When the actors under test are supposed to send various messages to different destinations, it may be difficult distinguishing the message streams arriving at the `testActor` when using the `TestKit` as a mixinshown until now. Another approach is to use it for the creation of simple probe actors to be inserted in the message flows. To make this more powerful and convenient, there is a concrete implementation called `TestProbe`. The functionality is best explained using a small example:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L12-L15 "Go to snippet source")import scala.concurrent.duration._
import akka.actor._
import akka.testkit.TestProbe

```

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L44-L56 "Go to snippet source")class MyDoubleEcho extends Actor {
  var dest1: ActorRef = _
  var dest2: ActorRef = _
  def receive = {
    case (d1: ActorRef, d2: ActorRef) =>
      dest1 = d1
      dest2 = d2
    case x =>
      dest1 ! x
      dest2 ! x
  }
}

```

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L227-L233 "Go to snippet source")val probe1 = TestProbe()
val probe2 = TestProbe()
val actor = system.actorOf(Props[MyDoubleEcho]())
actor ! ((probe1.ref, probe2.ref))
actor ! "hello"
probe1.expectMsg(500 millis, "hello")
probe2.expectMsg(500 millis, "hello")
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L304-L335 "Go to snippet source")new TestKit(system) {
  {
    // simple actor which only forwards messages
    class Forwarder extends AbstractActor {
      final ActorRef target;

      @SuppressWarnings("unused")
      public Forwarder(ActorRef target) {
        this.target = target;
      }

      @Override
      public Receive createReceive() {
        return receiveBuilder()
            .matchAny(message -> target.forward(message, getContext()))
            .build();
      }
    }

    // create a test probe
    final TestKit probe = new TestKit(system);

    // create a forwarder, injecting the probe’s testActor
    final Props props = Props.create(Forwarder.class, this, probe.getRef());
    final ActorRef forwarder = system.actorOf(props, "forwarder");

    // verify correct forwarding
    forwarder.tell(42, getRef());
    probe.expectMsgEquals(42);
    assertEquals(getRef(), probe.getLastSender());
  }
};
```

Here the system under test is simulated by `MyDoubleEcho`, which is supposed to mirror its input to two outputs. Attaching two test probes enables verification of the (simplistic) behaviorThis simple test verifies an equally simple Forwarder actor by injecting a probe as the forwarder’s target. Another example would be two actors A and B which collaborate by A sending messages to B. To verify this message flow, a `TestProbe` could be inserted as a target of A, using the forwarding capabilities or auto\-pilot described below to include a real B in the test setup.

If you have many test probes, you can name them to get meaningful actor names in test logs and assertions:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L252-L256 "Go to snippet source")val worker = TestProbe("worker")
val aggregator = TestProbe("aggregator")

worker.ref.path.name should startWith("worker")
aggregator.ref.path.name should startWith("aggregator")
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L342-L350 "Go to snippet source")new TestKit(system) {
  {
    final TestProbe worker = new TestProbe(system, "worker");
    final TestProbe aggregator = new TestProbe(system, "aggregator");

    assertTrue(worker.ref().path().name().startsWith("worker"));
    assertTrue(aggregator.ref().path().name().startsWith("aggregator"));
  }
};
```

Probes may also be equipped with custom assertions to make your test code even more concise and clear:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L237-L246 "Go to snippet source")final case class Update(id: Int, value: String)

val probe = new TestProbe(system) {
  def expectUpdate(x: Int) = {
    expectMsgPF() {
      case Update(id, _) if id == x => ()
    }
    sender() ! "ACK"
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L357-L373 "Go to snippet source")new TestKit(system) {
  {
    class MyProbe extends TestKit {
      public MyProbe() {
        super(system);
      }

      public void assertHello() {
        expectMsgEquals("hello");
      }
    }

    final MyProbe probe = new MyProbe();
    probe.getRef().tell("hello", ActorRef.noSender());
    probe.assertHello();
  }
};
```

You have complete flexibility here in mixing and matching the `TestKit` facilities with your checks and choosing an intuitive name for it. In real life your code will probably be a bit more complicated than the example given above; just use the power!

Warning
Any message sent from a `TestProbe` to another actor which runs on the CallingThreadDispatcher runs the risk of dead\-lock if that other actor might also send to this probe. The implementation of `TestProbe.watch` and `TestProbe.unwatch` will also send a message to the actor being watched, which means that it is dangerous to try watching e.g. `TestActorRef` from a `TestProbe`.

#### Watching Other Actors from Probes

A `TestProbe``TestKit` can register itself for DeathWatch of any other actor:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L264-L267 "Go to snippet source")val probe = TestProbe()
probe.watch(target)
target ! PoisonPill
probe.expectTerminated(target)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L381-L389 "Go to snippet source")new TestKit(system) {
  {
    final TestKit probe = new TestKit(system);
    probe.watch(target);
    target.tell(PoisonPill.getInstance(), ActorRef.noSender());
    final Terminated msg = probe.expectMsgClass(Terminated.class);
    assertEquals(msg.getActor(), target);
  }
};
```

#### Replying to Messages Received by Probes

The probes keep track of the communications channel for replies, if possible, so they can also replyThe probe stores the sender of the last dequeued message (i.e. after its `expectMsg*` reception), which may be retrieved using the `getLastSender()` method. This information can also implicitly be used for having the probe reply to the last received message:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L276-L280 "Go to snippet source")val probe = TestProbe()
val future = probe.ref ? "hello"
probe.expectMsg(0 millis, "hello") // TestActor runs on CallingThreadDispatcher
probe.reply("world")
assert(future.isCompleted && future.value.contains(Success("world")))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L396-L405 "Go to snippet source")new TestKit(system) {
  {
    final TestKit probe = new TestKit(system);
    probe.getRef().tell("hello", getRef());
    probe.expectMsgEquals("hello");
    probe.reply("world");
    expectMsgEquals("world");
    assertEquals(probe.getRef(), getLastSender());
  }
};
```

#### Forwarding Messages Received by Probes

Given a destination actor `dest` which in the nominal actor network would receive a message from actor `source`. If you arrange for the message to be sent to a `TestProbe` `probe` instead, you can make assertions concerning volume and timing of the message flow while still keeping the network functioningThe probe can also forward a received message (i.e. after its `expectMsg*` reception), retaining the original sender:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L60-L71 "Go to snippet source")class Source(target: ActorRef) extends Actor {
  def receive = {
    case "start" => target ! "work"
  }
}

class Destination extends Actor {
  def receive = {
    case x => // Do something..
  }
}

```

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L288-L293 "Go to snippet source")val probe = TestProbe()
val source = system.actorOf(Props(classOf[Source], probe.ref))
val dest = system.actorOf(Props[Destination]())
source ! "start"
probe.expectMsg("work")
probe.forward(dest)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L412-L421 "Go to snippet source")new TestKit(system) {
  {
    final TestKit probe = new TestKit(system);
    probe.getRef().tell("hello", getRef());
    probe.expectMsgEquals("hello");
    probe.forward(getRef());
    expectMsgEquals("hello");
    assertEquals(getRef(), getLastSender());
  }
};
```

The `dest` actor will receive the same message invocation as if no test probe had intervened.

#### Auto\-Pilot

Receiving messages in a queue for later inspection is nice, but to keep a test running and verify traces later you can also install an `AutoPilot` in the participating test probes (actually in any `TestKit`) which is invoked before enqueueing to the inspection queue. This code can be used to forward messages, e.g. in a chain `A --> Probe -->
B`, as long as a certain protocol is obeyed.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-testkit/src/test/scala/akka/testkit/TestProbeSpec.scala#L119-L126 "Go to snippet source")val probe = TestProbe()
probe.setAutoPilot(new TestActor.AutoPilot {
  def run(sender: ActorRef, msg: Any): TestActor.AutoPilot =
    msg match {
      case "stop" => TestActor.NoAutoPilot
      case x      => testActor.tell(x, sender); TestActor.KeepRunning
    }
})
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L468-L486 "Go to snippet source")new TestKit(system) {
  {
    final TestKit probe = new TestKit(system);
    // install auto-pilot
    probe.setAutoPilot(
        new TestActor.AutoPilot() {
          public AutoPilot run(ActorRef sender, Object msg) {
            sender.tell(msg, ActorRef.noSender());
            return noAutoPilot();
          }
        });
    // first one is replied to directly ...
    probe.getRef().tell("hello", getRef());
    expectMsgEquals("hello");
    // ... but then the auto-pilot switched itself off
    probe.getRef().tell("world", getRef());
    expectNoMessage();
  }
};
```

The `run` method must return the auto\-pilot for the next message, which can be `KeepRunning` to retain the current one or `NoAutoPilot` to switch it offwrapped in an `Option`; setting it to `None` terminates the auto\-pilot.

#### Caution about Timing Assertions

The behavior of `within` blocks when using test probes might be perceived as counter\-intuitive: you need to remember that the nicely scoped deadline as described [above](testing.html#testkit-within) is local to each probe. Hence, probes do not react to each other’s deadlines or the deadline set in an enclosing `TestKit` instance:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L363-L366 "Go to snippet source")val probe = TestProbe()
within(1 second) {
  probe.expectMsg("hello")
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L453-L458 "Go to snippet source")new TestKit(system) {
  {
    final TestKit probe = new TestKit(system);
    within(Duration.ofSeconds(1), () -> probe.expectMsgEquals("hello"));
  }
};
```

Here, the `expectMsg``expectMsgEquals` call will use the default timeout.

### Testing parent\-child relationships

The parent of an actor is always the actor that created it. At times this leads to a coupling between the two that may not be straightforward to test. There are several approaches to improve the testability of a child actor that needs to refer to its parent:

1. when creating a child, pass an explicit reference to its parent
2. create the child with a `TestProbe` as parent
3. create a fabricated parent when testing

Conversely, a parent’s binding to its child can be lessened as follows:

1. when creating a parent, tell the parent how to create its child

For example, the structure of the code you want to test may follow this pattern:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/ParentChildSpec.scala#L23-L37 "Go to snippet source")class Parent extends Actor {
  val child = context.actorOf(Props[Child](), "child")
  var ponged = false

  def receive = {
    case "pingit" => child ! "ping"
    case "pong"   => ponged = true
  }
}

class Child extends Actor {
  def receive = {
    case "ping" => context.parent ! "pong"
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/ParentChildTest.java#L29-L53 "Go to snippet source")static class Parent extends AbstractActor {
  final ActorRef child = getContext().actorOf(Props.create(Child.class), "child");
  boolean ponged = false;

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals("pingit", message -> child.tell("ping", getSelf()))
        .matchEquals("pong", message -> ponged = true)
        .build();
  }
}

static class Child extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals(
            "ping",
            message -> {
              getContext().getParent().tell("pong", getSelf());
            })
        .build();
  }
}
```

#### Introduce a child to its parent

The first option is to avoid the use of the `context.parent` function and create a child with a custom parent by passing an explicit reference to its parent instead.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/ParentChildSpec.scala#L41-L45 "Go to snippet source")class DependentChild(parent: ActorRef) extends Actor {
  def receive = {
    case "ping" => parent ! "pong"
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/ParentChildTest.java#L58-L71 "Go to snippet source")class DependentChild extends AbstractActor {
  private final ActorRef parent;

  public DependentChild(ActorRef parent) {
    this.parent = parent;
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals("ping", message -> parent.tell("pong", getSelf()))
        .build();
  }
}
```

#### Create the child using TestProbeTestKit

The `TestProbe``TestKit` class can create actors that will run with the test probe as a parent. This will cause any messages the child actor sends to *context.parent**getContext().getParent()* to end up in the test probe.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/ParentChildSpec.scala#L125-L132 "Go to snippet source")"A TestProbe serving as parent" should {
  "test its child responses" in {
    val parent = TestProbe()
    val child = parent.childActorOf(Props(new Child))
    parent.send(child, "ping")
    parent.expectMsg("pong")
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/ParentChildTest.java#L188-L192 "Go to snippet source")TestKit parent = new TestKit(system);
ActorRef child = parent.childActorOf(Props.create(Child.class));

parent.send(child, "ping");
parent.expectMsgEquals("pong");
```

#### Using a fabricated parent

If you prefer to avoid modifying the parent or child constructor you can create a fabricated parent in your test. This, however, does not enable you to test the parent actor in isolation.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/ParentChildSpec.scala#L136-L150 "Go to snippet source")"A fabricated parent" should {
  "test its child responses" in {
    val proxy = TestProbe()
    val parent = system.actorOf(Props(new Actor {
      val child = context.actorOf(Props(new Child), "child")
      def receive = {
        case x if sender() == child => proxy.ref.forward(x)
        case x                      => child.forward(x)
      }
    }))

    proxy.send(parent, "ping")
    proxy.expectMsg("pong")
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/ParentChildTest.java#L155-L182 "Go to snippet source")class FabricatedParentCreator implements Creator<Actor> {
  private final TestProbe proxy;

  public FabricatedParentCreator(TestProbe proxy) {
    this.proxy = proxy;
  }

  @Override
  public Actor create() throws Exception {
    return new AbstractActor() {
      final ActorRef child = getContext().actorOf(Props.create(Child.class), "child");

      @Override
      public Receive createReceive() {
        return receiveBuilder()
            .matchAny(
                message -> {
                  if (getSender().equals(child)) {
                    proxy.ref().forward(message, getContext());
                  } else {
                    child.forward(message, getContext());
                  }
                })
            .build();
      }
    };
  }
}
```

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/ParentChildTest.java#L200-L204 "Go to snippet source")TestProbe proxy = new TestProbe(system);
ActorRef parent = system.actorOf(Props.create(Actor.class, new FabricatedParentCreator(proxy)));

proxy.send(parent, "ping");
proxy.expectMsg("pong");
```

#### Externalize child making from the parent

Alternatively, you can tell the parent how to create its child. There are two ways to do this: by giving it a `Props` object or by giving it a function which takes care of creating the child actor:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/ParentChildSpec.scala#L49-L66 "Go to snippet source")class DependentParent(childProps: Props, probe: ActorRef) extends Actor {
  val child = context.actorOf(childProps, "child")

  def receive = {
    case "pingit" => child ! "ping"
    case "pong"   => probe ! "ponged"
  }
}

class GenericDependentParent(childMaker: ActorRefFactory => ActorRef) extends Actor {
  val child = childMaker(context)
  var ponged = false

  def receive = {
    case "pingit" => child ! "ping"
    case "pong"   => ponged = true
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/ParentChildTest.java#L76-L92 "Go to snippet source")class DependentParent extends AbstractActor {
  final ActorRef child;
  final ActorRef probe;

  public DependentParent(Props childProps, ActorRef probe) {
    child = getContext().actorOf(childProps, "child");
    this.probe = probe;
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals("pingit", message -> child.tell("ping", getSelf()))
        .matchEquals("pong", message -> probe.tell("ponged", getSelf()))
        .build();
  }
}
```

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/ParentChildTest.java#L97-L112 "Go to snippet source")class GenericDependentParent extends AbstractActor {
  final ActorRef child;
  boolean ponged = false;

  public GenericDependentParent(Function<ActorRefFactory, ActorRef> childMaker) throws Exception {
    child = childMaker.apply(getContext());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals("pingit", message -> child.tell("ping", getSelf()))
        .matchEquals("pong", message -> ponged = true)
        .build();
  }
}
```

Creating the `Props``Actor` is straightforward and the function may look like this in your test code:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/ParentChildSpec.scala#L109-L110 "Go to snippet source")val maker = (_: ActorRefFactory) => probe.ref
val parent = system.actorOf(Props(new GenericDependentParent(maker)))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/ParentChildTest.java#L139-L140 "Go to snippet source")Function<ActorRefFactory, ActorRef> maker = param -> probe.ref();
ActorRef parent = system.actorOf(Props.create(GenericDependentParent.class, maker));
```

And like this in your application code:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/ParentChildSpec.scala#L118-L119 "Go to snippet source")val maker = (f: ActorRefFactory) => f.actorOf(Props(new Child))
val parent = system.actorOf(Props(new GenericDependentParent(maker)))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/ParentChildTest.java#L148-L149 "Go to snippet source")Function<ActorRefFactory, ActorRef> maker = f -> f.actorOf(Props.create(Child.class));
ActorRef parent = system.actorOf(Props.create(GenericDependentParent.class, maker));
```

Which of these methods is the best depends on what is most important to test. The most generic option is to create the parent actor by passing it a function that is responsible for the Actor creation, but theusing `TestProbe` or having a fabricated parent is often sufficient.

## CallingThreadDispatcher

The `CallingThreadDispatcher` runs invocations on the current thread only. This dispatcher does not create any new threads.

It is possible to use the `CallingThreadDispatcher` in unit testing, as described above, but originally it was conceived to allow uninterrupted stack traces to be generated in case of an error. As this special dispatcher runs everything which would normally be queued directly on the current thread, the full history of a message’s processing chain is recorded on the call stack, so long as all intervening actors run on this dispatcher.

### How to use it

Just set the dispatcher as you normally would:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L315-L316 "Go to snippet source")import akka.testkit.CallingThreadDispatcher
val ref = system.actorOf(Props[MyActor]().withDispatcher(CallingThreadDispatcher.Id))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L493 "Go to snippet source")system.actorOf(Props.create(MyActor.class).withDispatcher(CallingThreadDispatcher.Id()));
```

### How it works

When receiving an invocation, the `CallingThreadDispatcher` checks whether the receiving actor is already active on the current thread. The simplest example of this situation is an actor which sends a message to itself. In this case, processing cannot continue immediately as that would violate the actor model, so the invocation is queued and will be processed when the active invocation on that actor finishes its processing; thus, it will be processed on the calling thread, but after the actor finishes its previous work. In the other case, the invocation is processed immediately on the current thread. Futures scheduled via this dispatcher are also executed immediately.

This scheme makes the `CallingThreadDispatcher` work like a general purpose dispatcher for any actors which never block on external events.

In the presence of multiple threads, it may happen that two invocations of an actor running on this dispatcher happen on two different threads at the same time. In this case, both will be processed directly on their respective threads, where both compete for the actor’s lock and the loser has to wait. Thus, the actor model is left intact, but the price is the loss of concurrency due to limited scheduling. In a sense, this is equivalent to traditional mutex style concurrency.

The other remaining difficulty is correct handling of suspend and resume: when an actor is suspended, subsequent invocations will be queued in thread\-local queues (the same ones used for queuing in the normal case). The call to `resume`, however, is done by one specific thread, and all other threads in the system will probably not be executing this specific actor, which leads to the problem that the thread\-local queues cannot be emptied by their native threads. Hence, the thread calling `resume` will collect all currently queued invocations from all threads into its queue and process them.

### Limitations

Warning
In case the CallingThreadDispatcher is used for top\-level actors, without going through TestActorRef, then there is a time window during which the actor is awaiting construction by the user guardian actor. Sending messages to the actor during this time will result in them being enqueued and then executed on the guardian’s thread instead of the caller’s thread. To avoid this, use TestActorRef.

If an actor’s behavior blocks on something which would normally be affected by the calling actor after having sent the message, this will dead\-lock when using this dispatcher. This is a common scenario in actor tests based on `CountDownLatch` for synchronization:

```
val latch = new CountDownLatch(1)
actor ! startWorkAfter(latch)   // actor will call latch.await() before proceeding
doSomeSetupStuff()
latch.countDown()

```

The example would hang indefinitely within the message processing initiated on the second line and never reach the fourth line, which would unblock it on a normal dispatcher.

Thus, keep in mind that the `CallingThreadDispatcher` is not a general\-purpose replacement for the normal dispatchers. If you are looking for a tool to help you debug dead\-locks, the `CallingThreadDispatcher` may help with some error scenarios, but keep in mind that it may give false negatives as well as false positives.

### Thread Interruptions

If the CallingThreadDispatcher sees that the current thread has its `isInterrupted()` flag set when message processing returns, it will throw an `InterruptedException` after finishing all its processing (i.e. all messages which need processing as described above are processed before this happens). As `tell` cannot throw exceptions due to its contract, this exception will then be caught and logged, and the thread’s interrupted status will be set again.

If during message processing an `InterruptedException` is thrown then it will be caught inside the CallingThreadDispatcher’s message handling loop, the thread’s interrupted flag will be set and processing continues normally.

Note
In summary, if the current thread is interrupted while doing work under the CallingThreadDispatcher, then that will result in the `isInterrupted` flag to be `true` when the message send returns and no `InterruptedException` will be thrown.

### Benefits

To summarize, these are the features that `CallingThreadDispatcher` has to offer:

- Deterministic execution of single\-threaded tests while retaining nearly full actor semantics
- Full message processing history leading up to the point of failure in exception stack traces
- Exclusion of certain classes of dead\-lock scenarios

## Tracing Actor Invocations

The testing facilities described up to this point were aiming at formulating assertions about a system’s behavior. If a test fails, it is usually your job to find the cause, fix it and verify the test again. This process is supported by debuggers as well as logging, where the Akka toolkit offers the following options:

- *Logging of exceptions thrown within Actor instances* It is always on; in contrast to the other logging mechanisms, this logs at `ERROR` level.

- *Logging of message invocations on certain actors* This is enabled by a setting in the [Configuration](general/configuration-reference.html#config-akka-actor) — namely `akka.actor.debug.receive` — which enables the `loggable` statement to be applied to an actor’s `receive` function:

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L92-L98 "Go to snippet source")import akka.event.LoggingReceive
def receive = LoggingReceive {
  case msg => // Do something ...
}
def otherState: Receive = LoggingReceive.withLabel("other") {
  case msg => // Do something else ...
}
```

If the aforementioned setting is not given in the [Configuration](general/configuration-reference.html#config-akka-actor), this method will pass through the given `Receive` function unmodified, meaning that there is no runtime cost unless enabled.

The logging feature is coupled to this specific local mark\-up because enabling it uniformly on all actors is not usually what you need, and it would lead to endless loops if it were applied to event bus logger listeners.

- *Logging of special messages* Actors handle certain special messages automatically, e.g. `Kill`, `PoisonPill`, etc. Tracing of these message invocations is enabled by the setting `akka.actor.debug.autoreceive`, which enables this on all actors.
- *Logging of the actor lifecycle* Actor creation, start, restart, monitor start, monitor stop and stop may be traced by enabling the setting `akka.actor.debug.lifecycle`; this, too, is enabled uniformly on all actors.

Logging of these messages is at `DEBUG` level. To summarize, you can enable full logging of actor activities using this configuration fragment:

```
akka {
  loglevel = "DEBUG"
  actor {
    debug {
      receive = on
      autoreceive = on
      lifecycle = on
    }
  }
}

```

## Different Testing Frameworks

Akka’s test suite is written using [ScalaTest](https://www.scalatest.org), which also shines through in documentation examples. However, the TestKit and its facilities do not depend on that framework, so you can essentially use whichever suits your development style best.

This section contains a collection of known gotchas with some other frameworks, which is by no means exhaustive and does not imply an endorsement or special support.

### When you need it to be a trait

If for some reason it is a problem to inherit from `TestKit` due to it being a concrete class instead of a trait, there’s `TestKitBase`:

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L343-L356 "Go to snippet source")import akka.testkit.TestKitBase

class MyTest extends TestKitBase {
  implicit lazy val system: ActorSystem = ActorSystem()

  val probe = TestProbe()
  probe.send(testActor, "hello")
  try expectMsg("hello")
  catch { case NonFatal(e) => system.terminate(); throw e }

  shutdown(system)
}
```

The `implicit lazy val system` must be declared exactly like that (you can of course pass arguments to the actor system factory as needed) because trait `TestKitBase` needs the system during its construction.

Warning: use of the trait is discouraged because of potential issues with binary backwards compatibility in the future, use at own risk.

### Specs2

Some [Specs2](https://etorreborre.github.io/specs2/) users have contributed examples of how to work around some clashes which may arise:

- Mixing TestKit into `org.specs2.mutable.Specification` results in a name clash involving the `end` method (which is a private variable in TestKit and an abstract method in Specification); if mixing in TestKit first, the code may compile but might then fail at runtime. The workaround—which is beneficial also for the third point—is to apply the TestKit together with `org.specs2.specification.Scope`.
- The Specification traits provide a `Duration` DSL which uses partly the same method names as `scala.concurrent.duration.Duration`, resulting in ambiguous implicits if `scala.concurrent.duration._` is imported. There are two workarounds:
	- either use the Specification variant of Duration and supply an implicit conversion to the Akka Duration. This conversion is not supplied with the Akka distribution because that would mean that our JAR files would depend on Specs2, which is not justified by this little feature.
	- or mix `org.specs2.time.NoTimeConversions` into the Specification.
- Specifications are by default executed concurrently, which requires some care when writing the tests or the `sequential` keyword.

## Configuration

There are several configuration properties for the TestKit module, please refer to the [reference configuration](general/configuration-reference.html#config-akka-testkit).

## Example

Ray Roestenburg’s example code from his blog, which unfortunately is only available on [web archive](https://web.archive.org/web/20180114133958/http://roestenburg.agilesquad.com/2011/02/unit-testing-akka-actors-with-testkit_12.html), adapted to work with Akka 2\.x.

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestKitUsageSpec.scala#L10-L150 "Go to snippet source")import scala.util.Random

import org.scalatest.BeforeAndAfterAll
import org.scalatest.wordspec.AnyWordSpecLike
import org.scalatest.matchers.should.Matchers

import com.typesafe.config.ConfigFactory

import akka.actor.Actor
import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.actor.Props
import akka.testkit.{ DefaultTimeout, ImplicitSender, TestActors, TestKit }
import scala.concurrent.duration._
import scala.collection.immutable

/**
 * a Test to show some TestKit examples
 */
class TestKitUsageSpec
    extends TestKit(ActorSystem("TestKitUsageSpec", ConfigFactory.parseString(TestKitUsageSpec.config)))
    with DefaultTimeout
    with ImplicitSender
    with AnyWordSpecLike
    with Matchers
    with BeforeAndAfterAll {
  import TestKitUsageSpec._

  val echoRef = system.actorOf(TestActors.echoActorProps)
  val forwardRef = system.actorOf(Props(classOf[ForwardingActor], testActor))
  val filterRef = system.actorOf(Props(classOf[FilteringActor], testActor))
  val randomHead = Random.nextInt(6)
  val randomTail = Random.nextInt(10)
  val headList = immutable.Seq().padTo(randomHead, "0")
  val tailList = immutable.Seq().padTo(randomTail, "1")
  val seqRef =
    system.actorOf(Props(classOf[SequencingActor], testActor, headList, tailList))

  override def afterAll(): Unit = {
    shutdown()
  }

  "An EchoActor" should {
    "Respond with the same message it receives" in {
      within(500 millis) {
        echoRef ! "test"
        expectMsg("test")
      }
    }
  }
  "A ForwardingActor" should {
    "Forward a message it receives" in {
      within(500 millis) {
        forwardRef ! "test"
        expectMsg("test")
      }
    }
  }
  "A FilteringActor" should {
    "Filter all messages, except expected messagetypes it receives" in {
      var messages = Seq[String]()
      within(500 millis) {
        filterRef ! "test"
        expectMsg("test")
        filterRef ! 1
        expectNoMessage()
        filterRef ! "some"
        filterRef ! "more"
        filterRef ! 1
        filterRef ! "text"
        filterRef ! 1

        receiveWhile(500 millis) {
          case msg: String => messages = msg +: messages
        }
      }
      messages.length should be(3)
      messages.reverse should be(Seq("some", "more", "text"))
    }
  }
  "A SequencingActor" should {
    "receive an interesting message at some point " in {
      within(500 millis) {
        ignoreMsg {
          case msg: String => msg != "something"
        }
        seqRef ! "something"
        expectMsg("something")
        ignoreMsg {
          case msg: String => msg == "1"
        }
        expectNoMessage()
        ignoreNoMsg()
      }
    }
  }
}

object TestKitUsageSpec {
  // Define your test specific configuration here
  val config = """
    akka {
      loglevel = "WARNING"
    }
    """

  /**
   * An Actor that forwards every message to a next Actor
   */
  class ForwardingActor(next: ActorRef) extends Actor {
    def receive = {
      case msg => next ! msg
    }
  }

  /**
   * An Actor that only forwards certain messages to a next Actor
   */
  class FilteringActor(next: ActorRef) extends Actor {
    def receive = {
      case msg: String => next ! msg
      case _           => None
    }
  }

  /**
   * An actor that sends a sequence of messages with a random head list, an
   * interesting value and a random tail list. The idea is that you would
   * like to test that the interesting value is received and that you cant
   * be bothered with the rest
   */
  class SequencingActor(next: ActorRef, head: immutable.Seq[String], tail: immutable.Seq[String]) extends Actor {
    def receive = {
      case msg => {
        head.foreach { next ! _ }
        next ! msg
        tail.foreach { next ! _ }
      }
    }
  }
}
```

## Synchronous Testing: `TestActorRef`

Testing the business logic inside `Actor` classes can be divided into two parts: first, each atomic operation must work in isolation, then sequences of incoming events must be processed correctly, even in the presence of some possible variability in the ordering of events. The former is the primary use case for single\-threaded unit testing, while the latter can only be verified in integration tests.

Normally, the `ActorRef` shields the underlying `Actor` instance from the outside, the only communications channel is the actor’s mailbox. This restriction impedes unit testing, which led to the inception of the `TestActorRef`. This special type of reference is designed specifically for test purposes and allows access to the actor in two ways: either by obtaining a reference to the underlying actor instance or by invoking or querying the actor’s behavior (`receive`). Each one warrants its section below.

Note
It is highly recommended to stick to traditional behavioral testing (using messaging to ask the Actor to reply with the state you want to run assertions against), instead of using `TestActorRef` whenever possible.

Warning
Due to the synchronous nature of `TestActorRef`, it will **not** work with some support traits that Akka provides as they require asynchronous behaviors to function properly. Examples of traits that do not mix well with test actor refs are [PersistentActor](persistence.html#example) and [AtLeastOnceDelivery](persistence.html#at-least-once-delivery) provided by [Akka Persistence](persistence.html).

### Obtaining a Reference to an `Actor`

Having access to the actual `Actor` object allows the application of all traditional unit testing techniques on the contained methods. Obtaining a reference is done like this:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L108-L111 "Go to snippet source")import akka.testkit.TestActorRef

val actorRef = TestActorRef[MyActor]
val actor = actorRef.underlyingActor
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L48-L76 "Go to snippet source")static class MyActor extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals(
            "say42",
            message -> {
              getSender().tell(42, getSelf());
            })
        .match(
            Exception.class,
            (Exception ex) -> {
              throw ex;
            })
        .build();
  }

  public boolean testMe() {
    return true;
  }
}

@Test
public void demonstrateTestActorRef() {
  final Props props = Props.create(MyActor.class);
  final TestActorRef<MyActor> ref = TestActorRef.create(system, props, "testA");
  final MyActor actor = ref.underlyingActor();
  assertTrue(actor.testMe());
}
```

Since `TestActorRef` is generic in the actor type it returns the underlying actor with its proper static type. From this point on you may bring any unit testing tool to bear on your actor as usual.

### Testing Finite State Machines

If your actor under test is an `FSM`, you may use the special `TestFSMRef` which offers all features of a normal `TestActorRef` and besides allows access to the internal state:

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L141-L161 "Go to snippet source")import akka.testkit.TestFSMRef
import scala.concurrent.duration._

val fsm = TestFSMRef(new TestFsmActor)

val mustBeTypedProperly: TestActorRef[TestFsmActor] = fsm

assert(fsm.stateName == 1)
assert(fsm.stateData == "")
fsm ! "go" // being a TestActorRef, this runs also on the CallingThreadDispatcher
assert(fsm.stateName == 2)
assert(fsm.stateData == "go")

fsm.setState(stateName = 1)
assert(fsm.stateName == 1)

assert(fsm.isTimerActive("test") == false)
fsm.startTimerWithFixedDelay("test", 12, 10 millis)
assert(fsm.isTimerActive("test") == true)
fsm.cancelTimer("test")
assert(fsm.isTimerActive("test") == false)
```

Due to a limitation in Scala’s type inference, there is only the factory method shown above, so you will probably write code like `TestFSMRef(new MyFSM)` instead of the hypothetical `ActorRef`\-inspired `TestFSMRef[MyFSM]`. All methods shown above directly access the FSM state without any synchronization; this is perfectly alright if the `CallingThreadDispatcher` is used and no other threads are involved, but it may lead to surprises if you were to exercise timer events, because those are executed on the `Scheduler` thread.

### Testing the Actor’s Behavior

When the dispatcher invokes the processing behavior of an actor on a message, it calls `apply` on the current behavior registered for the actor. This starts with the return value of the declared `receive` method, but it may also be changed using `become` and `unbecome` in response to external messages. All of this contributes to the overall actor behavior and it does not lend itself to easy testing on the `Actor` itself. Therefore the `TestActorRef` offers a different mode of operation to complement the `Actor` testing: it supports all operations also valid on normal `ActorRef`. Messages sent to the actor are processed synchronously on the current thread and answers may be sent back as usual. This trick is made possible by the `CallingThreadDispatcher` described below (see [CallingThreadDispatcher](testing.html#callingthreaddispatcher)); this dispatcher is set implicitly for any actor instantiated into a `TestActorRef`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L168-L174 "Go to snippet source")import akka.testkit.TestActorRef
import akka.pattern.ask

val actorRef = TestActorRef(new MyActor)
// hypothetical message stimulating a '42' answer
val future: Future[Any] = actorRef ? Say42
future.futureValue should be(42)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L101-L106 "Go to snippet source")final Props props = Props.create(MyActor.class);
final TestActorRef<MyActor> ref = TestActorRef.create(system, props, "testB");
final CompletableFuture<Object> future =
    Patterns.ask(ref, "say42", Duration.ofMillis(3000)).toCompletableFuture();
assertTrue(future.isDone());
assertEquals(42, future.get());
```

As the `TestActorRef` is a subclass of `LocalActorRef` with a few special extras, also aspects like supervision and restarting work properly, but beware that execution is only strictly synchronous as long as all actors involved use the `CallingThreadDispatcher`. As soon as you add elements which include more sophisticated scheduling you leave the realm of unit testing as you then need to think about asynchronicity again (in most cases the problem will be to wait until the desired effect had a chance to happen).

One more special aspect which is overridden for single\-threaded tests is the `receiveTimeout`, as including that would entail asynchronous queuing of `ReceiveTimeout` messages, violating the synchronous contract.

Note
To summarize: `TestActorRef` overwrites two fields: it sets the dispatcher to `CallingThreadDispatcher.global` and it sets the `receiveTimeout` to None.

### The Way In\-Between: Expecting Exceptions

If you want to test the actor behavior, including hot swapping, but without involving a dispatcher and without having the `TestActorRef` swallow any thrown exceptions, then there is another mode available for you: use the `receive` method on `TestActorRef`, which will be forwarded to the underlying actor:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/testkit/TestkitDocSpec.scala#L190-L197 "Go to snippet source")import akka.testkit.TestActorRef

val actorRef = TestActorRef(new Actor {
  def receive = {
    case "hello" => throw new IllegalArgumentException("boom")
  }
})
intercept[IllegalArgumentException] { actorRef.receive("hello") }
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/testkit/TestKitDocTest.java#L113-L120 "Go to snippet source")final Props props = Props.create(MyActor.class);
final TestActorRef<MyActor> ref = TestActorRef.create(system, props, "myActor");
try {
  ref.receive(new Exception("expected"));
  Assert.fail("expected an exception to be thrown");
} catch (Exception e) {
  assertEquals("expected", e.getMessage());
}
```

### Use Cases

You may mix and match both modi operandi of `TestActorRef` as suits your test needs:

- one common use case is setting up the actor into a specific internal state before sending the test message
- another is to verify correct internal state transitions after having sent the test message

Feel free to experiment with the possibilities, and if you find useful patterns, don’t hesitate to let the Akka forums know about them! Who knows, common operations might even be worked into nice DSLs.

## Code Examples

### Example 1: Module info

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 2: Module info

```xml
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>
```

### Example 3: Module info

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Module info

```scala
val AkkaVersion = "2.8.9"
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % AkkaVersion % Test
```

### Example 5: Module info

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.8.9</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-testkit_${scala.binary.version}</artifactId>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```

### Example 6: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.8.9")

  testImplementation "com.typesafe.akka:akka-testkit_${versions.ScalaBinary}"
}
```

### Example 7: Asynchronous Testing:TestKit

```scala
import akka.actor.ActorSystem
import akka.testkit.{ ImplicitSender, TestActors, TestKit }
import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class MySpec()
    extends TestKit(ActorSystem("MySpec"))
    with ImplicitSender
    with AnyWordSpecLike
    with Matchers
    with BeforeAndAfterAll {

  override def afterAll(): Unit = {
    TestKit.shutdownActorSystem(system)
  }

  "An Echo actor" must {

    "send back messages unchanged" in {
      val echo = system.actorOf(TestActors.echoActorProps)
      echo ! "hello world"
      expectMsg("hello world")
    }

  }
}
```

### Example 8: Asynchronous Testing:TestKit

```java
import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.testkit.javadsl.TestKit;
import java.time.Duration;
import jdocs.AbstractJavaTest;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestKitSampleTest extends AbstractJavaTest {

  public static class SomeActor extends AbstractActor {
    ActorRef target = null;

    @Override
    public Receive createReceive() {
      return receiveBuilder()
          .matchEquals(
              "hello",
              message -> {
                getSender().tell("world", getSelf());
                if (target != null) target.forward(message, getContext());
              })
          .match(
              ActorRef.class,
              actorRef -> {
                target = actorRef;
                getSender().tell("done", getSelf());
              })
          .build();
    }
  }

  static ActorSystem system;

  @BeforeClass
  public static void setup() {
    system = ActorSystem.create();
  }

  @AfterClass
  public static void teardown() {
    TestKit.shutdownActorSystem(system);
    system = null;
  }

  @Test
  public void testIt() {
    /*
     * Wrap the whole test procedure within a testkit constructor
     * if you want to receive actor replies or use Within(), etc.
     */
    new TestKit(system) {
      {
        final Props props = Props.create(SomeActor.class);
        final ActorRef subject = system.actorOf(props);

        // can also use JavaTestKit “from the outside”
        final TestKit probe = new TestKit(system);
        // “inject” the probe by passing it to the test subject
        // like a real resource would be passed in production
        subject.tell(probe.getRef(), getRef());
        // await the correct response
        expectMsg(Duration.ofSeconds(1), "done");

        // the run() method needs to finish within 3 seconds
        within(
            Duration.ofSeconds(3),
            () -> {
              subject.tell("hello", getRef());

              // This is a demo: would normally use expectMsgEquals().
              // Wait time is bounded by 3-second deadline above.
              awaitCond(probe::msgAvailable);

              // response must have been enqueued to us before probe
              expectMsg(Duration.ZERO, "world");
              // check that the probe we injected earlier got the msg
              probe.expectMsg(Duration.ZERO, "hello");
              Assert.assertEquals(getRef(), probe.getLastSender());

              // Will wait for the rest of the 3 seconds
              expectNoMessage();
              return null;
            });
      }
    };
  }
}
```

### Example 9: Built-In Assertions

```scala
val hello: String = expectMsg("hello")
val any: String = expectMsgAnyOf("hello", "world")
val all: immutable.Seq[String] = expectMsgAllOf("hello", "world")
val i: Int = expectMsgType[Int]
expectNoMessage(200.millis)
val two: immutable.Seq[AnyRef] = receiveN(2)
```

### Example 10: Built-In Assertions

```java
final String hello = expectMsgEquals("hello");
final String any = expectMsgAnyOf("hello", "world");
final List<String> all = expectMsgAllOf("hello", "world");
final int i = expectMsgClass(Integer.class);
final Number j = expectMsgAnyClassOf(Integer.class, Long.class);
expectNoMessage();
final List<Object> two = receiveN(2);
```

### Example 11: Expecting Log Messages

```scala
import akka.testkit.EventFilter
import com.typesafe.config.ConfigFactory

implicit val system: ActorSystem = ActorSystem(
  "testsystem",
  ConfigFactory.parseString("""
  akka.loggers = ["akka.testkit.TestEventListener"]
  """))
try {
  val actor = system.actorOf(Props.empty)
  EventFilter[ActorKilledException](occurrences = 1).intercept {
    actor ! Kill
  }
} finally {
  shutdown(system)
}
```

### Example 12: Expecting Log Messages

```java
new TestKit(system) {
  {
    assertEquals("TestKitDocTest", system.name());
    final ActorRef victim = system.actorOf(Props.empty(), "victim");

    final int result =
        new EventFilter(ActorKilledException.class, system)
            .from("akka://TestKitDocTest/user/victim")
            .occurrences(1)
            .intercept(
                () -> {
                  victim.tell(Kill.getInstance(), ActorRef.noSender());
                  return 42;
                });
    assertEquals(42, result);
  }
};
```

### Example 13: Expecting Log Messages

```text
akka.loggers = [akka.testkit.TestEventListener]
```

### Example 14: Overriding behavior

```scala
case class TriggerScheduling(foo: String)

object SchedKey
case class ScheduledMessage(foo: String)

class TestTimerActor extends Actor with Timers {
  override def receive = {
    case TriggerScheduling(foo) => triggerScheduling(ScheduledMessage(foo))
  }

  def triggerScheduling(msg: ScheduledMessage) =
    timers.startSingleTimer(SchedKey, msg, 500.millis)
}
```

### Example 15: Overriding behavior

```java
static class TestTimerActor extends AbstractActorWithTimers {
  private static Object SCHED_KEY = "SchedKey";

  static final class TriggerScheduling {}

  static final class ScheduledMessage {}

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(TriggerScheduling.class, msg -> triggerScheduling()).build();
  }

  void triggerScheduling() {
    getTimers().startSingleTimer(SCHED_KEY, new ScheduledMessage(), Duration.ofMillis(500));
  }
}
```

### Example 16: Overriding behavior

```scala
import akka.testkit.TestProbe
import akka.actor.Props

val probe = TestProbe()
val actor = system.actorOf(Props(new TestTimerActor() {
  override def triggerScheduling(msg: ScheduledMessage) =
    probe.ref ! msg
}))

actor ! TriggerScheduling("abc")
probe.expectMsg(ScheduledMessage("abc"))
```

### Example 17: Overriding behavior

```java
new TestKit(system) {
  {
    final TestKit probe = new TestKit(system);
    final ActorRef target =
        system.actorOf(
            Props.create(
                TestTimerActor.class,
                () ->
                    new TestTimerActor() {
                      @Override
                      void triggerScheduling() {
                        probe.getRef().tell(new ScheduledMessage(), getSelf());
                      }
                    }));
    target.tell(new TestTimerActor.TriggerScheduling(), ActorRef.noSender());
    probe.expectMsgClass(TestTimerActor.ScheduledMessage.class);
  }
};
```

### Example 18: Timing Assertions

```scala
import akka.actor.Props
import scala.concurrent.duration._

val worker = system.actorOf(Props[Worker]())
within(200 millis) {
  worker ! "some work"
  expectMsg("some result")
  expectNoMessage() // will block for the rest of the 200ms
  Thread.sleep(300) // will NOT make this block fail
}
```

### Example 19: Timing Assertions

```java
new TestKit(system) {
  {
    getRef().tell(42, ActorRef.noSender());
    within(
        Duration.ZERO,
        Duration.ofSeconds(1),
        () -> {
          assertEquals((Integer) 42, expectMsgClass(Integer.class));
          return null;
        });
  }
};
```

### Example 20: Accounting for Slow Test Systems

```scala
import scala.concurrent.duration._
import akka.testkit._
10.milliseconds.dilated
```

### Example 21: Accounting for Slow Test Systems

```java
new TestKit(system) {
  {
    final Duration original = Duration.ofSeconds(1);
    final Duration stretched = dilated(original);
    assertTrue("dilated", stretched.compareTo(original) >= 0);
  }
};
```

### Example 22: Resolving Conflicts with Implicit ActorRef

```scala
class MySpec()
    extends TestKit(ActorSystem("MySpec"))
    with ImplicitSender
    with AnyWordSpecLike
    with Matchers
    with BeforeAndAfterAll {
```

### Example 23: Using Multiple Probe Actors

```scala
import scala.concurrent.duration._
import akka.actor._
import akka.testkit.TestProbe
```

### Example 24: Using Multiple Probe Actors

```scala
class MyDoubleEcho extends Actor {
  var dest1: ActorRef = _
  var dest2: ActorRef = _
  def receive = {
    case (d1: ActorRef, d2: ActorRef) =>
      dest1 = d1
      dest2 = d2
    case x =>
      dest1 ! x
      dest2 ! x
  }
}
```

### Example 25: Using Multiple Probe Actors

```scala
val probe1 = TestProbe()
val probe2 = TestProbe()
val actor = system.actorOf(Props[MyDoubleEcho]())
actor ! ((probe1.ref, probe2.ref))
actor ! "hello"
probe1.expectMsg(500 millis, "hello")
probe2.expectMsg(500 millis, "hello")
```

### Example 26: Using Multiple Probe Actors

```java
new TestKit(system) {
  {
    // simple actor which only forwards messages
    class Forwarder extends AbstractActor {
      final ActorRef target;

      @SuppressWarnings("unused")
      public Forwarder(ActorRef target) {
        this.target = target;
      }

      @Override
      public Receive createReceive() {
        return receiveBuilder()
            .matchAny(message -> target.forward(message, getContext()))
            .build();
      }
    }

    // create a test probe
    final TestKit probe = new TestKit(system);

    // create a forwarder, injecting the probe’s testActor
    final Props props = Props.create(Forwarder.class, this, probe.getRef());
    final ActorRef forwarder = system.actorOf(props, "forwarder");

    // verify correct forwarding
    forwarder.tell(42, getRef());
    probe.expectMsgEquals(42);
    assertEquals(getRef(), probe.getLastSender());
  }
};
```

### Example 27: Using Multiple Probe Actors

```scala
val worker = TestProbe("worker")
val aggregator = TestProbe("aggregator")

worker.ref.path.name should startWith("worker")
aggregator.ref.path.name should startWith("aggregator")
```

### Example 28: Using Multiple Probe Actors

```java
new TestKit(system) {
  {
    final TestProbe worker = new TestProbe(system, "worker");
    final TestProbe aggregator = new TestProbe(system, "aggregator");

    assertTrue(worker.ref().path().name().startsWith("worker"));
    assertTrue(aggregator.ref().path().name().startsWith("aggregator"));
  }
};
```

### Example 29: Using Multiple Probe Actors

```scala
final case class Update(id: Int, value: String)

val probe = new TestProbe(system) {
  def expectUpdate(x: Int) = {
    expectMsgPF() {
      case Update(id, _) if id == x => ()
    }
    sender() ! "ACK"
  }
}
```

### Example 30: Using Multiple Probe Actors

```java
new TestKit(system) {
  {
    class MyProbe extends TestKit {
      public MyProbe() {
        super(system);
      }

      public void assertHello() {
        expectMsgEquals("hello");
      }
    }

    final MyProbe probe = new MyProbe();
    probe.getRef().tell("hello", ActorRef.noSender());
    probe.assertHello();
  }
};
```

### Example 31: Watching Other Actors from Probes

```scala
val probe = TestProbe()
probe.watch(target)
target ! PoisonPill
probe.expectTerminated(target)
```

### Example 32: Watching Other Actors from Probes

```java
new TestKit(system) {
  {
    final TestKit probe = new TestKit(system);
    probe.watch(target);
    target.tell(PoisonPill.getInstance(), ActorRef.noSender());
    final Terminated msg = probe.expectMsgClass(Terminated.class);
    assertEquals(msg.getActor(), target);
  }
};
```

### Example 33: Replying to Messages Received by Probes

```scala
val probe = TestProbe()
val future = probe.ref ? "hello"
probe.expectMsg(0 millis, "hello") // TestActor runs on CallingThreadDispatcher
probe.reply("world")
assert(future.isCompleted && future.value.contains(Success("world")))
```

### Example 34: Replying to Messages Received by Probes

```java
new TestKit(system) {
  {
    final TestKit probe = new TestKit(system);
    probe.getRef().tell("hello", getRef());
    probe.expectMsgEquals("hello");
    probe.reply("world");
    expectMsgEquals("world");
    assertEquals(probe.getRef(), getLastSender());
  }
};
```

### Example 35: Forwarding Messages Received by Probes

```scala
class Source(target: ActorRef) extends Actor {
  def receive = {
    case "start" => target ! "work"
  }
}

class Destination extends Actor {
  def receive = {
    case x => // Do something..
  }
}
```

### Example 36: Forwarding Messages Received by Probes

```scala
val probe = TestProbe()
val source = system.actorOf(Props(classOf[Source], probe.ref))
val dest = system.actorOf(Props[Destination]())
source ! "start"
probe.expectMsg("work")
probe.forward(dest)
```

### Example 37: Forwarding Messages Received by Probes

```java
new TestKit(system) {
  {
    final TestKit probe = new TestKit(system);
    probe.getRef().tell("hello", getRef());
    probe.expectMsgEquals("hello");
    probe.forward(getRef());
    expectMsgEquals("hello");
    assertEquals(getRef(), getLastSender());
  }
};
```

### Example 38: Auto-Pilot

```scala
val probe = TestProbe()
probe.setAutoPilot(new TestActor.AutoPilot {
  def run(sender: ActorRef, msg: Any): TestActor.AutoPilot =
    msg match {
      case "stop" => TestActor.NoAutoPilot
      case x      => testActor.tell(x, sender); TestActor.KeepRunning
    }
})
```

### Example 39: Auto-Pilot

```java
new TestKit(system) {
  {
    final TestKit probe = new TestKit(system);
    // install auto-pilot
    probe.setAutoPilot(
        new TestActor.AutoPilot() {
          public AutoPilot run(ActorRef sender, Object msg) {
            sender.tell(msg, ActorRef.noSender());
            return noAutoPilot();
          }
        });
    // first one is replied to directly ...
    probe.getRef().tell("hello", getRef());
    expectMsgEquals("hello");
    // ... but then the auto-pilot switched itself off
    probe.getRef().tell("world", getRef());
    expectNoMessage();
  }
};
```

### Example 40: Caution about Timing Assertions

```scala
val probe = TestProbe()
within(1 second) {
  probe.expectMsg("hello")
}
```

### Example 41: Caution about Timing Assertions

```java
new TestKit(system) {
  {
    final TestKit probe = new TestKit(system);
    within(Duration.ofSeconds(1), () -> probe.expectMsgEquals("hello"));
  }
};
```

### Example 42: Testing parent-child relationships

```scala
class Parent extends Actor {
  val child = context.actorOf(Props[Child](), "child")
  var ponged = false

  def receive = {
    case "pingit" => child ! "ping"
    case "pong"   => ponged = true
  }
}

class Child extends Actor {
  def receive = {
    case "ping" => context.parent ! "pong"
  }
}
```

### Example 43: Testing parent-child relationships

```java
static class Parent extends AbstractActor {
  final ActorRef child = getContext().actorOf(Props.create(Child.class), "child");
  boolean ponged = false;

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals("pingit", message -> child.tell("ping", getSelf()))
        .matchEquals("pong", message -> ponged = true)
        .build();
  }
}

static class Child extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals(
            "ping",
            message -> {
              getContext().getParent().tell("pong", getSelf());
            })
        .build();
  }
}
```

### Example 44: Introduce a child to its parent

```scala
class DependentChild(parent: ActorRef) extends Actor {
  def receive = {
    case "ping" => parent ! "pong"
  }
}
```

### Example 45: Introduce a child to its parent

```java
class DependentChild extends AbstractActor {
  private final ActorRef parent;

  public DependentChild(ActorRef parent) {
    this.parent = parent;
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals("ping", message -> parent.tell("pong", getSelf()))
        .build();
  }
}
```

### Example 46: Create the child usingTestProbeTestKit

```scala
"A TestProbe serving as parent" should {
  "test its child responses" in {
    val parent = TestProbe()
    val child = parent.childActorOf(Props(new Child))
    parent.send(child, "ping")
    parent.expectMsg("pong")
  }
}
```

### Example 47: Create the child usingTestProbeTestKit

```java
TestKit parent = new TestKit(system);
ActorRef child = parent.childActorOf(Props.create(Child.class));

parent.send(child, "ping");
parent.expectMsgEquals("pong");
```

### Example 48: Using a fabricated parent

```scala
"A fabricated parent" should {
  "test its child responses" in {
    val proxy = TestProbe()
    val parent = system.actorOf(Props(new Actor {
      val child = context.actorOf(Props(new Child), "child")
      def receive = {
        case x if sender() == child => proxy.ref.forward(x)
        case x                      => child.forward(x)
      }
    }))

    proxy.send(parent, "ping")
    proxy.expectMsg("pong")
  }
}
```

### Example 49: Using a fabricated parent

```java
class FabricatedParentCreator implements Creator<Actor> {
  private final TestProbe proxy;

  public FabricatedParentCreator(TestProbe proxy) {
    this.proxy = proxy;
  }

  @Override
  public Actor create() throws Exception {
    return new AbstractActor() {
      final ActorRef child = getContext().actorOf(Props.create(Child.class), "child");

      @Override
      public Receive createReceive() {
        return receiveBuilder()
            .matchAny(
                message -> {
                  if (getSender().equals(child)) {
                    proxy.ref().forward(message, getContext());
                  } else {
                    child.forward(message, getContext());
                  }
                })
            .build();
      }
    };
  }
}
```

### Example 50: Using a fabricated parent

```java
TestProbe proxy = new TestProbe(system);
ActorRef parent = system.actorOf(Props.create(Actor.class, new FabricatedParentCreator(proxy)));

proxy.send(parent, "ping");
proxy.expectMsg("pong");
```

### Example 51: Externalize child making from the parent

```scala
class DependentParent(childProps: Props, probe: ActorRef) extends Actor {
  val child = context.actorOf(childProps, "child")

  def receive = {
    case "pingit" => child ! "ping"
    case "pong"   => probe ! "ponged"
  }
}

class GenericDependentParent(childMaker: ActorRefFactory => ActorRef) extends Actor {
  val child = childMaker(context)
  var ponged = false

  def receive = {
    case "pingit" => child ! "ping"
    case "pong"   => ponged = true
  }
}
```

### Example 52: Externalize child making from the parent

```java
class DependentParent extends AbstractActor {
  final ActorRef child;
  final ActorRef probe;

  public DependentParent(Props childProps, ActorRef probe) {
    child = getContext().actorOf(childProps, "child");
    this.probe = probe;
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals("pingit", message -> child.tell("ping", getSelf()))
        .matchEquals("pong", message -> probe.tell("ponged", getSelf()))
        .build();
  }
}
```

### Example 53: Externalize child making from the parent

```java
class GenericDependentParent extends AbstractActor {
  final ActorRef child;
  boolean ponged = false;

  public GenericDependentParent(Function<ActorRefFactory, ActorRef> childMaker) throws Exception {
    child = childMaker.apply(getContext());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals("pingit", message -> child.tell("ping", getSelf()))
        .matchEquals("pong", message -> ponged = true)
        .build();
  }
}
```

### Example 54: Externalize child making from the parent

```scala
val maker = (_: ActorRefFactory) => probe.ref
val parent = system.actorOf(Props(new GenericDependentParent(maker)))
```

### Example 55: Externalize child making from the parent

```java
Function<ActorRefFactory, ActorRef> maker = param -> probe.ref();
ActorRef parent = system.actorOf(Props.create(GenericDependentParent.class, maker));
```

### Example 56: Externalize child making from the parent

```scala
val maker = (f: ActorRefFactory) => f.actorOf(Props(new Child))
val parent = system.actorOf(Props(new GenericDependentParent(maker)))
```

### Example 57: Externalize child making from the parent

```java
Function<ActorRefFactory, ActorRef> maker = f -> f.actorOf(Props.create(Child.class));
ActorRef parent = system.actorOf(Props.create(GenericDependentParent.class, maker));
```

### Example 58: How to use it

```scala
import akka.testkit.CallingThreadDispatcher
val ref = system.actorOf(Props[MyActor]().withDispatcher(CallingThreadDispatcher.Id))
```

### Example 59: How to use it

```java
system.actorOf(Props.create(MyActor.class).withDispatcher(CallingThreadDispatcher.Id()));
```

### Example 60: Limitations

```scala
val latch = new CountDownLatch(1)
actor ! startWorkAfter(latch)   // actor will call latch.await() before proceeding
doSomeSetupStuff()
latch.countDown()
```

### Example 61: Tracing Actor Invocations

```scala
import akka.event.LoggingReceive
def receive = LoggingReceive {
  case msg => // Do something ...
}
def otherState: Receive = LoggingReceive.withLabel("other") {
  case msg => // Do something else ...
}
```

### Example 62: Tracing Actor Invocations

```text
akka {
  loglevel = "DEBUG"
  actor {
    debug {
      receive = on
      autoreceive = on
      lifecycle = on
    }
  }
}
```

### Example 63: When you need it to be a trait

```scala
import akka.testkit.TestKitBase

class MyTest extends TestKitBase {
  implicit lazy val system: ActorSystem = ActorSystem()

  val probe = TestProbe()
  probe.send(testActor, "hello")
  try expectMsg("hello")
  catch { case NonFatal(e) => system.terminate(); throw e }

  shutdown(system)
}
```

### Example 64: Example

```scala
import scala.util.Random

import org.scalatest.BeforeAndAfterAll
import org.scalatest.wordspec.AnyWordSpecLike
import org.scalatest.matchers.should.Matchers

import com.typesafe.config.ConfigFactory

import akka.actor.Actor
import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.actor.Props
import akka.testkit.{ DefaultTimeout, ImplicitSender, TestActors, TestKit }
import scala.concurrent.duration._
import scala.collection.immutable

/**
 * a Test to show some TestKit examples
 */
class TestKitUsageSpec
    extends TestKit(ActorSystem("TestKitUsageSpec", ConfigFactory.parseString(TestKitUsageSpec.config)))
    with DefaultTimeout
    with ImplicitSender
    with AnyWordSpecLike
    with Matchers
    with BeforeAndAfterAll {
  import TestKitUsageSpec._

  val echoRef = system.actorOf(TestActors.echoActorProps)
  val forwardRef = system.actorOf(Props(classOf[ForwardingActor], testActor))
  val filterRef = system.actorOf(Props(classOf[FilteringActor], testActor))
  val randomHead = Random.nextInt(6)
  val randomTail = Random.nextInt(10)
  val headList = immutable.Seq().padTo(randomHead, "0")
  val tailList = immutable.Seq().padTo(randomTail, "1")
  val seqRef =
    system.actorOf(Props(classOf[SequencingActor], testActor, headList, tailList))

  override def afterAll(): Unit = {
    shutdown()
  }

  "An EchoActor" should {
    "Respond with the same message it receives" in {
      within(500 millis) {
        echoRef ! "test"
        expectMsg("test")
      }
    }
  }
  "A ForwardingActor" should {
    "Forward a message it receives" in {
      within(500 millis) {
        forwardRef ! "test"
        expectMsg("test")
      }
    }
  }
  "A FilteringActor" should {
    "Filter all messages, except expected messagetypes it receives" in {
      var messages = Seq[String]()
      within(500 millis) {
        filterRef ! "test"
        expectMsg("test")
        filterRef ! 1
        expectNoMessage()
        filterRef ! "some"
        filterRef ! "more"
        filterRef ! 1
        filterRef ! "text"
        filterRef ! 1

        receiveWhile(500 millis) {
          case msg: String => messages = msg +: messages
        }
      }
      messages.length should be(3)
      messages.reverse should be(Seq("some", "more", "text"))
    }
  }
  "A SequencingActor" should {
    "receive an interesting message at some point " in {
      within(500 millis) {
        ignoreMsg {
          case msg: String => msg != "something"
        }
        seqRef ! "something"
        expectMsg("something")
        ignoreMsg {
          case msg: String => msg == "1"
        }
        expectNoMessage()
        ignoreNoMsg()
      }
    }
  }
}

object TestKitUsageSpec {
  // Define your test specific configuration here
  val config = """
    akka {
      loglevel = "WARNING"
    }
    """

  /**
   * An Actor that forwards every message to a next Actor
   */
  class ForwardingActor(next: ActorRef) extends Actor {
    def receive = {
      case msg => next ! msg
    }
  }

  /**
   * An Actor that only forwards certain messages to a next Actor
   */
  class FilteringActor(next: ActorRef) extends Actor {
    def receive = {
      case msg: String => next ! msg
      case _           => None
    }
  }

  /**
   * An actor that sends a sequence of messages with a random head list, an
   * interesting value and a random tail list. The idea is that you would
   * like to test that the interesting value is received and that you cant
   * be bothered with the rest
   */
  class SequencingActor(next: ActorRef, head: immutable.Seq[String], tail: immutable.Seq[String]) extends Actor {
    def receive = {
      case msg => {
        head.foreach { next ! _ }
        next ! msg
        tail.foreach { next ! _ }
      }
    }
  }
}
```

### Example 65: Obtaining a Reference to anActor

```scala
import akka.testkit.TestActorRef

val actorRef = TestActorRef[MyActor]
val actor = actorRef.underlyingActor
```

### Example 66: Obtaining a Reference to anActor

```java
static class MyActor extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals(
            "say42",
            message -> {
              getSender().tell(42, getSelf());
            })
        .match(
            Exception.class,
            (Exception ex) -> {
              throw ex;
            })
        .build();
  }

  public boolean testMe() {
    return true;
  }
}

@Test
public void demonstrateTestActorRef() {
  final Props props = Props.create(MyActor.class);
  final TestActorRef<MyActor> ref = TestActorRef.create(system, props, "testA");
  final MyActor actor = ref.underlyingActor();
  assertTrue(actor.testMe());
}
```

### Example 67: Testing Finite State Machines

```scala
import akka.testkit.TestFSMRef
import scala.concurrent.duration._

val fsm = TestFSMRef(new TestFsmActor)

val mustBeTypedProperly: TestActorRef[TestFsmActor] = fsm

assert(fsm.stateName == 1)
assert(fsm.stateData == "")
fsm ! "go" // being a TestActorRef, this runs also on the CallingThreadDispatcher
assert(fsm.stateName == 2)
assert(fsm.stateData == "go")

fsm.setState(stateName = 1)
assert(fsm.stateName == 1)

assert(fsm.isTimerActive("test") == false)
fsm.startTimerWithFixedDelay("test", 12, 10 millis)
assert(fsm.isTimerActive("test") == true)
fsm.cancelTimer("test")
assert(fsm.isTimerActive("test") == false)
```

### Example 68: Testing the Actor’s Behavior

```scala
import akka.testkit.TestActorRef
import akka.pattern.ask

val actorRef = TestActorRef(new MyActor)
// hypothetical message stimulating a '42' answer
val future: Future[Any] = actorRef ? Say42
future.futureValue should be(42)
```

### Example 69: Testing the Actor’s Behavior

```java
final Props props = Props.create(MyActor.class);
final TestActorRef<MyActor> ref = TestActorRef.create(system, props, "testB");
final CompletableFuture<Object> future =
    Patterns.ask(ref, "say42", Duration.ofMillis(3000)).toCompletableFuture();
assertTrue(future.isDone());
assertEquals(42, future.get());
```

### Example 70: The Way In-Between: Expecting Exceptions

```scala
import akka.testkit.TestActorRef

val actorRef = TestActorRef(new Actor {
  def receive = {
    case "hello" => throw new IllegalArgumentException("boom")
  }
})
intercept[IllegalArgumentException] { actorRef.receive("hello") }
```

### Example 71: The Way In-Between: Expecting Exceptions

```java
final Props props = Props.create(MyActor.class);
final TestActorRef<MyActor> ref = TestActorRef.create(system, props, "myActor");
try {
  ref.receive(new Exception("expected"));
  Assert.fail("expected an exception to be thrown");
} catch (Exception e) {
  assertEquals("expected", e.getMessage());
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8.9/akka/testkit/index.html
- https://doc.akka.io/japi/akka/2.8.9/akka/testkit/package-summary.html
- https://doc.akka.io/libraries/akka-core/2.8/general/configuration-reference.html
- https://doc.akka.io/libraries/akka-core/2.8/index-cluster.html
- https://doc.akka.io/libraries/akka-core/2.8/persistence-fsm.html
- https://doc.akka.io/libraries/akka-core/2.8/persistence.html
- https://doc.akka.io/libraries/akka-core/2.8/project/links.html
- https://doc.akka.io/libraries/akka-core/2.8/testing.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/testing.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.8/testing.html](https://doc.akka.io/libraries/akka-core/2.8/testing.html)*