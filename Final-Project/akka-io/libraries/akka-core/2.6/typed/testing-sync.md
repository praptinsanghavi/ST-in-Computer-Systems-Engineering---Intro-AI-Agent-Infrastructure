---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:04:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/testing-sync.html
title: Synchronous behavior testing • Akka Documentation
---

# Synchronous behavior testing • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

## Synchronous behavior testing

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Testing](../testing.html).

The `BehaviorTestKit` provides a very nice way of unit testing a `Behavior` in a deterministic way, but it has some limitations to be aware of.

Certain [`Behavior`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")s will be hard to test synchronously and the `BehaviorTestKit` doesn’t support testing of all features. In those cases the [asynchronous ActorTestKit](testing-async.html#asynchronous-testing) is recommended. Example of limitations:

- Spawning of `Future``CompletionStage` or other asynchronous task and you rely on a callback to complete before observing the effect you want to test.
- Usage of scheduler is not supported.
- `EventSourcedBehavior` can’t be tested.
- Interactions with other actors must be stubbed.
- Blackbox testing style.
- Supervision is not supported.

The `BehaviorTestKit` will be improved and some of these problems will be removed but it will always have limitations.

The following demonstrates how to test:

- Spawning child actors
- Spawning child actors anonymously
- Sending a message either as a reply or to another actor
- Sending a message to a child actor

The examples below require the following imports:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/SyncTestingExampleSpec.scala#L8-L16 "Go to snippet source")import akka.actor.testkit.typed.CapturedLogEvent
import akka.actor.testkit.typed.Effect._
import akka.actor.testkit.typed.scaladsl.BehaviorTestKit
import akka.actor.testkit.typed.scaladsl.TestInbox
import akka.actor.typed._
import akka.actor.typed.scaladsl._
import com.typesafe.config.ConfigFactory
import org.slf4j.event.Level

```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/SyncTestingExampleTest.java#L8-L19 "Go to snippet source")import akka.actor.testkit.typed.CapturedLogEvent;
import akka.actor.testkit.typed.Effect;
import akka.actor.testkit.typed.javadsl.BehaviorTestKit;
import akka.actor.testkit.typed.javadsl.TestInbox;
import akka.actor.typed.*;
import akka.actor.typed.javadsl.*;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.typesafe.config.Config;
import org.slf4j.event.Level;
```

Each of the tests are testing an actor that based on the message executes a different effect to be tested:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/SyncTestingExampleSpec.scala#L29-L60 "Go to snippet source")object Hello {
  sealed trait Command
  case object CreateAnonymousChild extends Command
  case class CreateChild(childName: String) extends Command
  case class SayHelloToChild(childName: String) extends Command
  case object SayHelloToAnonymousChild extends Command
  case class SayHello(who: ActorRef[String]) extends Command
  case class LogAndSayHello(who: ActorRef[String]) extends Command

  def apply(): Behaviors.Receive[Command] = Behaviors.receivePartial {
    case (context, CreateChild(name)) =>
      context.spawn(childActor, name)
      Behaviors.same
    case (context, CreateAnonymousChild) =>
      context.spawnAnonymous(childActor)
      Behaviors.same
    case (context, SayHelloToChild(childName)) =>
      val child: ActorRef[String] = context.spawn(childActor, childName)
      child ! "hello"
      Behaviors.same
    case (context, SayHelloToAnonymousChild) =>
      val child: ActorRef[String] = context.spawnAnonymous(childActor)
      child ! "hello stranger"
      Behaviors.same
    case (_, SayHello(who)) =>
      who ! "hello"
      Behaviors.same
    case (context, LogAndSayHello(who)) =>
      context.log.info("Saying hello to {}", who.path.name)
      who ! "hello"
      Behaviors.same
  }
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/SyncTestingExampleTest.java#L36-L132 "Go to snippet source")public static class Hello extends AbstractBehavior<Hello.Command> {

  public interface Command {}

  public static class CreateAChild implements Command {
    public final String childName;

    public CreateAChild(String childName) {
      this.childName = childName;
    }
  }

  public enum CreateAnAnonymousChild implements Command {
    INSTANCE
  }

  public static class SayHelloToChild implements Command {
    public final String childName;

    public SayHelloToChild(String childName) {
      this.childName = childName;
    }
  }

  public enum SayHelloToAnonymousChild implements Command {
    INSTANCE
  }

  public static class SayHello implements Command {
    public final ActorRef<String> who;

    public SayHello(ActorRef<String> who) {
      this.who = who;
    }
  }

  public static class LogAndSayHello implements Command {
    public final ActorRef<String> who;

    public LogAndSayHello(ActorRef<String> who) {
      this.who = who;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(Hello::new);
  }

  private Hello(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(CreateAChild.class, this::onCreateAChild)
        .onMessage(CreateAnAnonymousChild.class, this::onCreateAnonymousChild)
        .onMessage(SayHelloToChild.class, this::onSayHelloToChild)
        .onMessage(SayHelloToAnonymousChild.class, this::onSayHelloToAnonymousChild)
        .onMessage(SayHello.class, this::onSayHello)
        .onMessage(LogAndSayHello.class, this::onLogAndSayHello)
        .build();
  }

  private Behavior<Command> onCreateAChild(CreateAChild message) {
    getContext().spawn(Child.create(), message.childName);
    return Behaviors.same();
  }

  private Behavior<Command> onCreateAnonymousChild(CreateAnAnonymousChild message) {
    getContext().spawnAnonymous(Child.create());
    return Behaviors.same();
  }

  private Behavior<Command> onSayHelloToChild(SayHelloToChild message) {
    ActorRef<String> child = getContext().spawn(Child.create(), message.childName);
    child.tell("hello");
    return Behaviors.same();
  }

  private Behavior<Command> onSayHelloToAnonymousChild(SayHelloToAnonymousChild message) {
    ActorRef<String> child = getContext().spawnAnonymous(Child.create());
    child.tell("hello stranger");
    return Behaviors.same();
  }

  private Behavior<Command> onSayHello(SayHello message) {
    message.who.tell("hello");
    return Behaviors.same();
  }

  private Behavior<Command> onLogAndSayHello(LogAndSayHello message) {
    getContext().getLog().info("Saying hello to {}", message.who.path().name());
    message.who.tell("hello");
    return Behaviors.same();
  }
}
```

For creating a child actor a noop actor is created:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/SyncTestingExampleSpec.scala#L23-L25 "Go to snippet source")val childActor = Behaviors.receiveMessage[String] { _ =>
  Behaviors.same[String]
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/SyncTestingExampleTest.java#L28-L32 "Go to snippet source")public static class Child {
  public static Behavior<String> create() {
    return Behaviors.receive((context, message) -> Behaviors.same());
  }
}
```

All of the tests make use of the [`BehaviorTestKit`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html "akka.actor.testkit.typed.javadsl.BehaviorTestKit")[`BehaviorTestKit`](https://doc.akka.io/api/akka-core/2.6/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html "akka.actor.testkit.typed.scaladsl.BehaviorTestKit") to avoid the need for a real `ActorContext`. Some of the tests make use of the [`TestInbox`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/testkit/typed/javadsl/TestInbox.html "akka.actor.testkit.typed.javadsl.TestInbox")[`TestInbox`](https://doc.akka.io/api/akka-core/2.6/akka/actor/testkit/typed/scaladsl/TestInbox.html "akka.actor.testkit.typed.scaladsl.TestInbox") which allows the creation of an [`ActorRef`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") that can be used for synchronous testing, similar to the `TestProbe` used for asynchronous testing.

### Spawning children

With a name:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/SyncTestingExampleSpec.scala#L93-L95 "Go to snippet source")val testKit = BehaviorTestKit(Hello())
testKit.run(Hello.CreateChild("child"))
testKit.expectEffect(Spawned(childActor, "child"))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/SyncTestingExampleTest.java#L138-L140 "Go to snippet source")BehaviorTestKit<Hello.Command> test = BehaviorTestKit.create(Hello.create());
test.run(new Hello.CreateAChild("child"));
assertEquals("child", test.expectEffectClass(Effect.Spawned.class).childName());
```

Anonymously:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/SyncTestingExampleSpec.scala#L101-L103 "Go to snippet source")val testKit = BehaviorTestKit(Hello())
testKit.run(Hello.CreateAnonymousChild)
testKit.expectEffect(SpawnedAnonymous(childActor))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/SyncTestingExampleTest.java#L147-L149 "Go to snippet source")BehaviorTestKit<Hello.Command> test = BehaviorTestKit.create(Hello.create());
test.run(Hello.CreateAnAnonymousChild.INSTANCE);
test.expectEffectClass(Effect.SpawnedAnonymous.class);
```

### Sending messages

For testing sending a message a [`TestInbox`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/testkit/typed/javadsl/TestInbox.html "akka.actor.testkit.typed.javadsl.TestInbox")[`TestInbox`](https://doc.akka.io/api/akka-core/2.6/akka/actor/testkit/typed/scaladsl/TestInbox.html "akka.actor.testkit.typed.scaladsl.TestInbox") is created that provides an [`ActorRef`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") and methods to assert against the messages that have been sent to it.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/SyncTestingExampleSpec.scala#L109-L112 "Go to snippet source")val testKit = BehaviorTestKit(Hello())
val inbox = TestInbox[String]()
testKit.run(Hello.SayHello(inbox.ref))
inbox.expectMessage("hello")
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/SyncTestingExampleTest.java#L156-L159 "Go to snippet source")BehaviorTestKit<Hello.Command> test = BehaviorTestKit.create(Hello.create());
TestInbox<String> inbox = TestInbox.create();
test.run(new Hello.SayHello(inbox.getRef()));
inbox.expectMessage("hello");
```

Another use case is sending a message to a child actor you can do this by looking up the [`TestInbox`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/testkit/typed/javadsl/TestInbox.html "akka.actor.testkit.typed.javadsl.TestInbox")[`TestInbox`](https://doc.akka.io/api/akka-core/2.6/akka/actor/testkit/typed/scaladsl/TestInbox.html "akka.actor.testkit.typed.scaladsl.TestInbox") for a child actor from the [`BehaviorTestKit`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html "akka.actor.testkit.typed.javadsl.BehaviorTestKit")[`BehaviorTestKit`](https://doc.akka.io/api/akka-core/2.6/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html "akka.actor.testkit.typed.scaladsl.BehaviorTestKit"):

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/SyncTestingExampleSpec.scala#L118-L121 "Go to snippet source")val testKit = BehaviorTestKit(Hello())
testKit.run(Hello.SayHelloToChild("child"))
val childInbox = testKit.childInbox[String]("child")
childInbox.expectMessage("hello")
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/SyncTestingExampleTest.java#L166-L169 "Go to snippet source")BehaviorTestKit<Hello.Command> testKit = BehaviorTestKit.create(Hello.create());
testKit.run(new Hello.SayHelloToChild("child"));
TestInbox<String> childInbox = testKit.childInbox("child");
childInbox.expectMessage("hello");
```

For anonymous children the actor names are generated in a deterministic way:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/SyncTestingExampleSpec.scala#L127-L132 "Go to snippet source")val testKit = BehaviorTestKit(Hello())
testKit.run(Hello.SayHelloToAnonymousChild)
val child = testKit.expectEffectType[SpawnedAnonymous[String]]

val childInbox = testKit.childInbox(child.ref)
childInbox.expectMessage("hello stranger")
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/SyncTestingExampleTest.java#L176-L180 "Go to snippet source")BehaviorTestKit<Hello.Command> testKit = BehaviorTestKit.create(Hello.create());
testKit.run(Hello.SayHelloToAnonymousChild.INSTANCE);
// Anonymous actors are created as: $a $b etc
TestInbox<String> childInbox = testKit.childInbox("$a");
childInbox.expectMessage("hello stranger");
```

### Testing other effects

The [`BehaviorTestKit`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html "akka.actor.testkit.typed.javadsl.BehaviorTestKit")[`BehaviorTestKit`](https://doc.akka.io/api/akka-core/2.6/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html "akka.actor.testkit.typed.scaladsl.BehaviorTestKit") keeps track other effects you can verify, look at the sub\-classes of [`Effect`](https://doc.akka.io/api/akka-core/2.6/akka/actor/testkit/typed/Effect.html "akka.actor.testkit.typed.Effect")[`Effect`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/testkit/typed/Effect.html "akka.actor.testkit.typed.Effect")

- SpawnedAdapter
- Stopped
- Watched
- WatchedWith
- Unwatched
- Scheduled
- TimerScheduled
- TimerCancelled

### Checking for Log Messages

The [`BehaviorTestKit`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html "akka.actor.testkit.typed.javadsl.BehaviorTestKit")[`BehaviorTestKit`](https://doc.akka.io/api/akka-core/2.6/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html "akka.actor.testkit.typed.scaladsl.BehaviorTestKit") also keeps track of everything that is being logged. Here, you can see an example on how to check if the behavior logged certain messages:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/scala/docs/akka/actor/testkit/typed/scaladsl/SyncTestingExampleSpec.scala#L138-L141 "Go to snippet source")val testKit = BehaviorTestKit(Hello())
val inbox = TestInbox[String]("Inboxer")
testKit.run(Hello.LogAndSayHello(inbox.ref))
testKit.logEntries() shouldBe Seq(CapturedLogEvent(Level.INFO, "Saying hello to Inboxer"))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-testkit-typed/src/test/java/jdocs/akka/actor/testkit/typed/javadsl/SyncTestingExampleTest.java#L187-L200 "Go to snippet source")BehaviorTestKit<Hello.Command> test = BehaviorTestKit.create(Hello.create());
TestInbox<String> inbox = TestInbox.create("Inboxer");
test.run(new Hello.LogAndSayHello(inbox.getRef()));

List<CapturedLogEvent> allLogEntries = test.getAllLogEntries();
assertEquals(1, allLogEntries.size());
CapturedLogEvent expectedLogEvent =
    new CapturedLogEvent(
        Level.INFO,
        "Saying hello to Inboxer",
        Optional.empty(),
        Optional.empty(),
        new HashMap<>());
assertEquals(expectedLogEvent, allLogEntries.get(0));
```

See the other public methods and API documentation on [`BehaviorTestKit`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html "akka.actor.testkit.typed.javadsl.BehaviorTestKit")[`BehaviorTestKit`](https://doc.akka.io/api/akka-core/2.6/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html "akka.actor.testkit.typed.scaladsl.BehaviorTestKit") for other types of verification.

## Code Examples

### Example 1: Synchronous behavior testing

```scala
import akka.actor.testkit.typed.CapturedLogEvent
import akka.actor.testkit.typed.Effect._
import akka.actor.testkit.typed.scaladsl.BehaviorTestKit
import akka.actor.testkit.typed.scaladsl.TestInbox
import akka.actor.typed._
import akka.actor.typed.scaladsl._
import com.typesafe.config.ConfigFactory
import org.slf4j.event.Level
```

### Example 2: Synchronous behavior testing

```java
import akka.actor.testkit.typed.CapturedLogEvent;
import akka.actor.testkit.typed.Effect;
import akka.actor.testkit.typed.javadsl.BehaviorTestKit;
import akka.actor.testkit.typed.javadsl.TestInbox;
import akka.actor.typed.*;
import akka.actor.typed.javadsl.*;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.typesafe.config.Config;
import org.slf4j.event.Level;
```

### Example 3: Synchronous behavior testing

```scala
object Hello {
  sealed trait Command
  case object CreateAnonymousChild extends Command
  case class CreateChild(childName: String) extends Command
  case class SayHelloToChild(childName: String) extends Command
  case object SayHelloToAnonymousChild extends Command
  case class SayHello(who: ActorRef[String]) extends Command
  case class LogAndSayHello(who: ActorRef[String]) extends Command

  def apply(): Behaviors.Receive[Command] = Behaviors.receivePartial {
    case (context, CreateChild(name)) =>
      context.spawn(childActor, name)
      Behaviors.same
    case (context, CreateAnonymousChild) =>
      context.spawnAnonymous(childActor)
      Behaviors.same
    case (context, SayHelloToChild(childName)) =>
      val child: ActorRef[String] = context.spawn(childActor, childName)
      child ! "hello"
      Behaviors.same
    case (context, SayHelloToAnonymousChild) =>
      val child: ActorRef[String] = context.spawnAnonymous(childActor)
      child ! "hello stranger"
      Behaviors.same
    case (_, SayHello(who)) =>
      who ! "hello"
      Behaviors.same
    case (context, LogAndSayHello(who)) =>
      context.log.info("Saying hello to {}", who.path.name)
      who ! "hello"
      Behaviors.same
  }
```

### Example 4: Synchronous behavior testing

```java
public static class Hello extends AbstractBehavior<Hello.Command> {

  public interface Command {}

  public static class CreateAChild implements Command {
    public final String childName;

    public CreateAChild(String childName) {
      this.childName = childName;
    }
  }

  public enum CreateAnAnonymousChild implements Command {
    INSTANCE
  }

  public static class SayHelloToChild implements Command {
    public final String childName;

    public SayHelloToChild(String childName) {
      this.childName = childName;
    }
  }

  public enum SayHelloToAnonymousChild implements Command {
    INSTANCE
  }

  public static class SayHello implements Command {
    public final ActorRef<String> who;

    public SayHello(ActorRef<String> who) {
      this.who = who;
    }
  }

  public static class LogAndSayHello implements Command {
    public final ActorRef<String> who;

    public LogAndSayHello(ActorRef<String> who) {
      this.who = who;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(Hello::new);
  }

  private Hello(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(CreateAChild.class, this::onCreateAChild)
        .onMessage(CreateAnAnonymousChild.class, this::onCreateAnonymousChild)
        .onMessage(SayHelloToChild.class, this::onSayHelloToChild)
        .onMessage(SayHelloToAnonymousChild.class, this::onSayHelloToAnonymousChild)
        .onMessage(SayHello.class, this::onSayHello)
        .onMessage(LogAndSayHello.class, this::onLogAndSayHello)
        .build();
  }

  private Behavior<Command> onCreateAChild(CreateAChild message) {
    getContext().spawn(Child.create(), message.childName);
    return Behaviors.same();
  }

  private Behavior<Command> onCreateAnonymousChild(CreateAnAnonymousChild message) {
    getContext().spawnAnonymous(Child.create());
    return Behaviors.same();
  }

  private Behavior<Command> onSayHelloToChild(SayHelloToChild message) {
    ActorRef<String> child = getContext().spawn(Child.create(), message.childName);
    child.tell("hello");
    return Behaviors.same();
  }

  private Behavior<Command> onSayHelloToAnonymousChild(SayHelloToAnonymousChild message) {
    ActorRef<String> child = getContext().spawnAnonymous(Child.create());
    child.tell("hello stranger");
    return Behaviors.same();
  }

  private Behavior<Command> onSayHello(SayHello message) {
    message.who.tell("hello");
    return Behaviors.same();
  }

  private Behavior<Command> onLogAndSayHello(LogAndSayHello message) {
    getContext().getLog().info("Saying hello to {}", message.who.path().name());
    message.who.tell("hello");
    return Behaviors.same();
  }
}
```

### Example 5: Synchronous behavior testing

```scala
val childActor = Behaviors.receiveMessage[String] { _ =>
  Behaviors.same[String]
}
```

### Example 6: Synchronous behavior testing

```java
public static class Child {
  public static Behavior<String> create() {
    return Behaviors.receive((context, message) -> Behaviors.same());
  }
}
```

### Example 7: Spawning children

```scala
val testKit = BehaviorTestKit(Hello())
testKit.run(Hello.CreateChild("child"))
testKit.expectEffect(Spawned(childActor, "child"))
```

### Example 8: Spawning children

```java
BehaviorTestKit<Hello.Command> test = BehaviorTestKit.create(Hello.create());
test.run(new Hello.CreateAChild("child"));
assertEquals("child", test.expectEffectClass(Effect.Spawned.class).childName());
```

### Example 9: Spawning children

```scala
val testKit = BehaviorTestKit(Hello())
testKit.run(Hello.CreateAnonymousChild)
testKit.expectEffect(SpawnedAnonymous(childActor))
```

### Example 10: Spawning children

```java
BehaviorTestKit<Hello.Command> test = BehaviorTestKit.create(Hello.create());
test.run(Hello.CreateAnAnonymousChild.INSTANCE);
test.expectEffectClass(Effect.SpawnedAnonymous.class);
```

### Example 11: Sending messages

```scala
val testKit = BehaviorTestKit(Hello())
val inbox = TestInbox[String]()
testKit.run(Hello.SayHello(inbox.ref))
inbox.expectMessage("hello")
```

### Example 12: Sending messages

```java
BehaviorTestKit<Hello.Command> test = BehaviorTestKit.create(Hello.create());
TestInbox<String> inbox = TestInbox.create();
test.run(new Hello.SayHello(inbox.getRef()));
inbox.expectMessage("hello");
```

### Example 13: Sending messages

```scala
val testKit = BehaviorTestKit(Hello())
testKit.run(Hello.SayHelloToChild("child"))
val childInbox = testKit.childInbox[String]("child")
childInbox.expectMessage("hello")
```

### Example 14: Sending messages

```java
BehaviorTestKit<Hello.Command> testKit = BehaviorTestKit.create(Hello.create());
testKit.run(new Hello.SayHelloToChild("child"));
TestInbox<String> childInbox = testKit.childInbox("child");
childInbox.expectMessage("hello");
```

### Example 15: Sending messages

```scala
val testKit = BehaviorTestKit(Hello())
testKit.run(Hello.SayHelloToAnonymousChild)
val child = testKit.expectEffectType[SpawnedAnonymous[String]]

val childInbox = testKit.childInbox(child.ref)
childInbox.expectMessage("hello stranger")
```

### Example 16: Sending messages

```java
BehaviorTestKit<Hello.Command> testKit = BehaviorTestKit.create(Hello.create());
testKit.run(Hello.SayHelloToAnonymousChild.INSTANCE);
// Anonymous actors are created as: $a $b etc
TestInbox<String> childInbox = testKit.childInbox("$a");
childInbox.expectMessage("hello stranger");
```

### Example 17: Checking for Log Messages

```scala
val testKit = BehaviorTestKit(Hello())
val inbox = TestInbox[String]("Inboxer")
testKit.run(Hello.LogAndSayHello(inbox.ref))
testKit.logEntries() shouldBe Seq(CapturedLogEvent(Level.INFO, "Saying hello to Inboxer"))
```

### Example 18: Checking for Log Messages

```java
BehaviorTestKit<Hello.Command> test = BehaviorTestKit.create(Hello.create());
TestInbox<String> inbox = TestInbox.create("Inboxer");
test.run(new Hello.LogAndSayHello(inbox.getRef()));

List<CapturedLogEvent> allLogEntries = test.getAllLogEntries();
assertEquals(1, allLogEntries.size());
CapturedLogEvent expectedLogEvent =
    new CapturedLogEvent(
        Level.INFO,
        "Saying hello to Inboxer",
        Optional.empty(),
        Optional.empty(),
        new HashMap<>());
assertEquals(expectedLogEvent, allLogEntries.get(0));
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/testkit/typed/Effect.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/testkit/typed/scaladsl/TestInbox.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/testkit/typed/Effect.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/testkit/typed/javadsl/TestInbox.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/Behavior.html
- https://doc.akka.io/libraries/akka-core/2.6/testing.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/testing-async.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/typed/testing-sync.html](https://doc.akka.io/libraries/akka-core/2.6/typed/testing-sync.html)*