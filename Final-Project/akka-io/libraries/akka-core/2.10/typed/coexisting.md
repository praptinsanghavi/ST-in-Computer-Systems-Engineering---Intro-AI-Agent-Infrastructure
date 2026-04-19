---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:42Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/coexisting.html
title: Coexistence • Akka core
---

# Coexistence • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Coexistence

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Actor Typed, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
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
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-actor-typed_${versions.ScalaBinary}"
}
```

## Introduction

We believe Akka Typed will be adopted in existing systems gradually and therefore it’s important to be able to use typed and classic actors together, within the same `ActorSystem`. Also, we will not be able to integrate with all existing modules in one big bang release and that is another reason for why these two ways of writing actors must be able to coexist.

There are two different `ActorSystem`s: [`akka.actor.ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`akka.actor.ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") and [`akka.actor.typed.ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`akka.actor.typed.ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem"). 

Currently the typed actor system is implemented using the classic actor system under the hood. This may change in the future.

Typed and classic can interact the following ways:

- classic actor systems can create typed actors
- typed actors can send messages to classic actors, and opposite
- spawn and supervise typed child from classic parent, and opposite
- watch typed from classic, and opposite
- classic actor system can be converted to a typed actor system

In the examples the `akka.actor` package is aliased to `classic`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/coexistence/ClassicWatchingTypedSpec.scala#L18 "Go to snippet source")import akka.{ actor => classic }
```

The examples use fully qualified class names for the classic classes to distinguish between typed and classic classes with the same name.

## Classic to typed

While coexisting your application will likely still have a classic ActorSystem. This can be converted to a typed ActorSystem so that new code and migrated parts don’t rely on the classic system:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/coexistence/ClassicWatchingTypedSpec.scala#L13-L14 "Go to snippet source")// adds support for actors to a classic actor system and context
import akka.actor.typed.scaladsl.adapter._

val system = akka.actor.ActorSystem("ClassicToTypedSystem")
val typedSystem: ActorSystem[Nothing] = system.toTyped
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/coexistence/ClassicWatchingTypedTest.java#L13-L14 "Go to snippet source")// In java use the static methods on Adapter to convert from typed to classic
import akka.actor.typed.javadsl.Adapter;
akka.actor.ActorSystem classicActorSystem = akka.actor.ActorSystem.create();
ActorSystem<Void> typedActorSystem = Adapter.toTyped(classicActorSystem);
```

Then for new typed actors here’s how you create, watch and send messages to it from a classic actor.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/coexistence/ClassicWatchingTypedSpec.scala#L57-L72 "Go to snippet source")object Typed {
  sealed trait Command
  final case class Ping(replyTo: ActorRef[Pong.type]) extends Command
  case object Pong

  def apply(): Behavior[Command] =
    Behaviors.receive { (context, message) =>
      message match {
        case Ping(replyTo) =>
          context.log.info(s"${context.self} got Ping from $replyTo")
          // replyTo is a classic actor that has been converted for coexistence
          replyTo ! Pong
          Behaviors.same
      }
    }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/coexistence/ClassicWatchingTypedTest.java#L60-L83 "Go to snippet source")public abstract static class Typed {
  interface Command {}

  public static class Ping implements Command {
    public final akka.actor.typed.ActorRef<Pong> replyTo;

    public Ping(ActorRef<Pong> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Pong {}

  public static Behavior<Command> behavior() {
    return Behaviors.receive(Typed.Command.class)
        .onMessage(
            Typed.Ping.class,
            message -> {
              message.replyTo.tell(new Pong());
              return same();
            })
        .build();
  }
}
```

The top level classic actor is created in the usual way:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/coexistence/ClassicWatchingTypedSpec.scala#L84 "Go to snippet source")val classicActor = system.actorOf(Classic.props())
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/coexistence/ClassicWatchingTypedTest.java#L89-L90 "Go to snippet source")akka.actor.ActorSystem as = akka.actor.ActorSystem.create();
akka.actor.ActorRef classic = as.actorOf(Classic.props());
```

Then it can create a typed actor, watch it, and send a message to it:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/coexistence/ClassicWatchingTypedSpec.scala#L30-L53 "Go to snippet source")class Classic extends classic.Actor with ActorLogging {
  // context.spawn is an implicit extension method
  val second: ActorRef[Typed.Command] =
    context.spawn(Typed(), "second")

  // context.watch is an implicit extension method
  context.watch(second)

  // self can be used as the `replyTo` parameter here because
  // there is an implicit conversion from akka.actor.ActorRef to
  // akka.actor.typed.ActorRef
  // An equal alternative would be `self.toTyped`
  second ! Typed.Ping(self)

  override def receive = {
    case Typed.Pong =>
      log.info(s"$self got Pong from ${sender()}")
      // context.stop is an implicit extension method
      context.stop(second)
    case classic.Terminated(ref) =>
      log.info(s"$self observed termination of $ref")
      context.stop(self)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/coexistence/ClassicWatchingTypedTest.java#L27-L56 "Go to snippet source")public static class Classic extends AbstractActor {
  public static akka.actor.Props props() {
    return akka.actor.Props.create(Classic.class);
  }

  private final akka.actor.typed.ActorRef<Typed.Command> second =
      Adapter.spawn(getContext(), Typed.behavior(), "second");

  @Override
  public void preStart() {
    Adapter.watch(getContext(), second);
    second.tell(new Typed.Ping(Adapter.toTyped(getSelf())));
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Typed.Pong.class,
            message -> {
              Adapter.stop(getContext(), second);
            })
        .match(
            akka.actor.Terminated.class,
            t -> {
              getContext().stop(getSelf());
            })
        .build();
  }
}
```

There is one `import` that is needed to make that work. We import the Adapter class and call static methods for conversion.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/coexistence/ClassicWatchingTypedSpec.scala#L13-L14 "Go to snippet source")// adds support for actors to a classic actor system and context
import akka.actor.typed.scaladsl.adapter._
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/coexistence/ClassicWatchingTypedTest.java#L13-L14 "Go to snippet source")// In java use the static methods on Adapter to convert from typed to classic
import akka.actor.typed.javadsl.Adapter;
```

That adds some implicit extension methods that are added to classic and typed `ActorSystem`, `ActorContext` and `ActorRef` in both directions. To convert between typed and classic `ActorSystem`, `ActorContext` and `ActorRef` in both directions there are adapter methods in [`akka.actor.typed.javadsl.Adapter`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Adapter.html "akka.actor.typed.javadsl.Adapter"). Note the inline comments in the example above. 

This method of using a top level classic actor is the suggested path for this type of co\-existence. However, if you prefer to start with a typed top level actor then you can use the implicit [`spawn`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/package$$ClassicActorSystemOps.html#spawn[T](behavior:akka.actor.typed.Behavior[T],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "akka.actor.typed.scaladsl.adapter.package.ClassicActorSystemOps") \-method[`Adapter.spawn`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Adapter.html#spawn(akka.actor.ActorSystem,akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props) "akka.actor.typed.javadsl.Adapter") directly from the typed system:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/coexistence/TypedWatchingClassicSpec.scala#L77-L78 "Go to snippet source")val system = classic.ActorSystem("TypedWatchingClassic")
val typed = system.spawn(Typed.behavior, "Typed")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/coexistence/TypedWatchingClassicTest.java#L98-L99 "Go to snippet source")ActorSystem as = ActorSystem.create();
ActorRef<Typed.Command> typed = Adapter.spawn(as, Typed.create(), "Typed");
```

The above classic\-typed difference is further elaborated in [the `ActorSystem` section](from-classic.html#actorsystem) of “Learning Akka Typed from Classic”. 

## Typed to classic

Let’s turn the example upside down and first start the typed actor and then the classic as a child.

The following will show how to create, watch and send messages back and forth from a typed actor to this classic actor:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/coexistence/TypedWatchingClassicSpec.scala#L58-L66 "Go to snippet source")object Classic {
  def props(): classic.Props = classic.Props(new Classic)
}
class Classic extends classic.Actor {
  override def receive = {
    case Typed.Ping(replyTo) =>
      replyTo ! Typed.Pong
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/coexistence/TypedWatchingClassicTest.java#L79-L92 "Go to snippet source")public static class Classic extends AbstractActor {
  public static akka.actor.Props props() {
    return akka.actor.Props.create(Classic.class);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(Typed.Ping.class, this::onPing).build();
  }

  private void onPing(Typed.Ping message) {
    message.replyTo.tell(Typed.Pong.INSTANCE);
  }
}
```

Creating the actor system and the typed actor:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/coexistence/TypedWatchingClassicSpec.scala#L77-L78 "Go to snippet source")val system = classic.ActorSystem("TypedWatchingClassic")
val typed = system.spawn(Typed.behavior, "Typed")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/coexistence/TypedWatchingClassicTest.java#L98-L99 "Go to snippet source")ActorSystem as = ActorSystem.create();
ActorRef<Typed.Command> typed = Adapter.spawn(as, Typed.create(), "Typed");
```

Then the typed actor creates the classic actor, watches it and sends and receives a response:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/coexistence/TypedWatchingClassicSpec.scala#L25-L54 "Go to snippet source")object Typed {
  final case class Ping(replyTo: akka.actor.typed.ActorRef[Pong.type])
  sealed trait Command
  case object Pong extends Command

  val behavior: Behavior[Command] =
    Behaviors.setup { context =>
      // context.actorOf is an implicit extension method
      val classic = context.actorOf(Classic.props(), "second")

      // context.watch is an implicit extension method
      context.watch(classic)

      // illustrating how to pass sender, toClassic is an implicit extension method
      classic.tell(Typed.Ping(context.self), context.self.toClassic)

      Behaviors
        .receiveMessagePartial[Command] {
          case Pong =>
            // it's not possible to get the sender, that must be sent in message
            // context.stop is an implicit extension method
            context.stop(classic)
            Behaviors.same
        }
        .receiveSignal {
          case (_, akka.actor.typed.Terminated(_)) =>
            Behaviors.stopped
        }
    }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/coexistence/TypedWatchingClassicTest.java#L26-L75 "Go to snippet source")public static class Typed extends AbstractBehavior<Typed.Command> {

  public static class Ping {
    public final akka.actor.typed.ActorRef<Pong> replyTo;

    public Ping(ActorRef<Pong> replyTo) {
      this.replyTo = replyTo;
    }
  }

  interface Command {}

  public enum Pong implements Command {
    INSTANCE
  }

  private final akka.actor.ActorRef second;

  private Typed(ActorContext<Command> context, akka.actor.ActorRef second) {
    super(context);
    this.second = second;
  }

  public static Behavior<Command> create() {
    return akka.actor.typed.javadsl.Behaviors.setup(
        context -> {
          akka.actor.ActorRef second = Adapter.actorOf(context, Classic.props(), "second");

          Adapter.watch(context, second);

          second.tell(
              new Typed.Ping(context.getSelf().narrow()), Adapter.toClassic(context.getSelf()));

          return new Typed(context, second);
        });
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Typed.Pong.class, message -> onPong())
        .onSignal(akka.actor.typed.Terminated.class, sig -> Behaviors.stopped())
        .build();
  }

  private Behavior<Command> onPong() {
    Adapter.stop(getContext(), second);
    return this;
  }
}
```

Note that when sending from a typed actor to a classic [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef") there is no sender in scope as in classic. The typed sender should use its own [`ActorContext[T].self`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html#self:akka.actor.typed.ActorRef[T] "akka.actor.typed.scaladsl.ActorContext") explicitly, as shown in the snippet.

## Supervision

The default supervision for classic actors is to restart whereas for typed it is to stop. When combining classic and typed actors the default supervision is based on the default behavior of the child, for example if a classic actor creates a typed child, its default supervision will be to stop. If a typed actor creates a classic child, its default supervision will be to restart.

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
```

### Example 2: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-actor-typed_${versions.ScalaBinary}"
}
```

### Example 4: Introduction

```scala
import akka.{ actor => classic }
```

### Example 5: Classic to typed

```scala
// adds support for actors to a classic actor system and context
import akka.actor.typed.scaladsl.adapter._

val system = akka.actor.ActorSystem("ClassicToTypedSystem")
val typedSystem: ActorSystem[Nothing] = system.toTyped
```

### Example 6: Classic to typed

```java
// In java use the static methods on Adapter to convert from typed to classic
import akka.actor.typed.javadsl.Adapter;
akka.actor.ActorSystem classicActorSystem = akka.actor.ActorSystem.create();
ActorSystem<Void> typedActorSystem = Adapter.toTyped(classicActorSystem);
```

### Example 7: Classic to typed

```scala
object Typed {
  sealed trait Command
  final case class Ping(replyTo: ActorRef[Pong.type]) extends Command
  case object Pong

  def apply(): Behavior[Command] =
    Behaviors.receive { (context, message) =>
      message match {
        case Ping(replyTo) =>
          context.log.info(s"${context.self} got Ping from $replyTo")
          // replyTo is a classic actor that has been converted for coexistence
          replyTo ! Pong
          Behaviors.same
      }
    }
}
```

### Example 8: Classic to typed

```java
public abstract static class Typed {
  interface Command {}

  public static class Ping implements Command {
    public final akka.actor.typed.ActorRef<Pong> replyTo;

    public Ping(ActorRef<Pong> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Pong {}

  public static Behavior<Command> behavior() {
    return Behaviors.receive(Typed.Command.class)
        .onMessage(
            Typed.Ping.class,
            message -> {
              message.replyTo.tell(new Pong());
              return same();
            })
        .build();
  }
}
```

### Example 9: Classic to typed

```scala
val classicActor = system.actorOf(Classic.props())
```

### Example 10: Classic to typed

```java
akka.actor.ActorSystem as = akka.actor.ActorSystem.create();
akka.actor.ActorRef classic = as.actorOf(Classic.props());
```

### Example 11: Classic to typed

```scala
class Classic extends classic.Actor with ActorLogging {
  // context.spawn is an implicit extension method
  val second: ActorRef[Typed.Command] =
    context.spawn(Typed(), "second")

  // context.watch is an implicit extension method
  context.watch(second)

  // self can be used as the `replyTo` parameter here because
  // there is an implicit conversion from akka.actor.ActorRef to
  // akka.actor.typed.ActorRef
  // An equal alternative would be `self.toTyped`
  second ! Typed.Ping(self)

  override def receive = {
    case Typed.Pong =>
      log.info(s"$self got Pong from ${sender()}")
      // context.stop is an implicit extension method
      context.stop(second)
    case classic.Terminated(ref) =>
      log.info(s"$self observed termination of $ref")
      context.stop(self)
  }
}
```

### Example 12: Classic to typed

```java
public static class Classic extends AbstractActor {
  public static akka.actor.Props props() {
    return akka.actor.Props.create(Classic.class);
  }

  private final akka.actor.typed.ActorRef<Typed.Command> second =
      Adapter.spawn(getContext(), Typed.behavior(), "second");

  @Override
  public void preStart() {
    Adapter.watch(getContext(), second);
    second.tell(new Typed.Ping(Adapter.toTyped(getSelf())));
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Typed.Pong.class,
            message -> {
              Adapter.stop(getContext(), second);
            })
        .match(
            akka.actor.Terminated.class,
            t -> {
              getContext().stop(getSelf());
            })
        .build();
  }
}
```

### Example 13: Classic to typed

```scala
// adds support for actors to a classic actor system and context
import akka.actor.typed.scaladsl.adapter._
```

### Example 14: Classic to typed

```java
// In java use the static methods on Adapter to convert from typed to classic
import akka.actor.typed.javadsl.Adapter;
```

### Example 15: Classic to typed

```scala
val system = classic.ActorSystem("TypedWatchingClassic")
val typed = system.spawn(Typed.behavior, "Typed")
```

### Example 16: Classic to typed

```java
ActorSystem as = ActorSystem.create();
ActorRef<Typed.Command> typed = Adapter.spawn(as, Typed.create(), "Typed");
```

### Example 17: Typed to classic

```scala
object Classic {
  def props(): classic.Props = classic.Props(new Classic)
}
class Classic extends classic.Actor {
  override def receive = {
    case Typed.Ping(replyTo) =>
      replyTo ! Typed.Pong
  }
}
```

### Example 18: Typed to classic

```java
public static class Classic extends AbstractActor {
  public static akka.actor.Props props() {
    return akka.actor.Props.create(Classic.class);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(Typed.Ping.class, this::onPing).build();
  }

  private void onPing(Typed.Ping message) {
    message.replyTo.tell(Typed.Pong.INSTANCE);
  }
}
```

### Example 19: Typed to classic

```scala
val system = classic.ActorSystem("TypedWatchingClassic")
val typed = system.spawn(Typed.behavior, "Typed")
```

### Example 20: Typed to classic

```java
ActorSystem as = ActorSystem.create();
ActorRef<Typed.Command> typed = Adapter.spawn(as, Typed.create(), "Typed");
```

### Example 21: Typed to classic

```scala
object Typed {
  final case class Ping(replyTo: akka.actor.typed.ActorRef[Pong.type])
  sealed trait Command
  case object Pong extends Command

  val behavior: Behavior[Command] =
    Behaviors.setup { context =>
      // context.actorOf is an implicit extension method
      val classic = context.actorOf(Classic.props(), "second")

      // context.watch is an implicit extension method
      context.watch(classic)

      // illustrating how to pass sender, toClassic is an implicit extension method
      classic.tell(Typed.Ping(context.self), context.self.toClassic)

      Behaviors
        .receiveMessagePartial[Command] {
          case Pong =>
            // it's not possible to get the sender, that must be sent in message
            // context.stop is an implicit extension method
            context.stop(classic)
            Behaviors.same
        }
        .receiveSignal {
          case (_, akka.actor.typed.Terminated(_)) =>
            Behaviors.stopped
        }
    }
}
```

### Example 22: Typed to classic

```java
public static class Typed extends AbstractBehavior<Typed.Command> {

  public static class Ping {
    public final akka.actor.typed.ActorRef<Pong> replyTo;

    public Ping(ActorRef<Pong> replyTo) {
      this.replyTo = replyTo;
    }
  }

  interface Command {}

  public enum Pong implements Command {
    INSTANCE
  }

  private final akka.actor.ActorRef second;

  private Typed(ActorContext<Command> context, akka.actor.ActorRef second) {
    super(context);
    this.second = second;
  }

  public static Behavior<Command> create() {
    return akka.actor.typed.javadsl.Behaviors.setup(
        context -> {
          akka.actor.ActorRef second = Adapter.actorOf(context, Classic.props(), "second");

          Adapter.watch(context, second);

          second.tell(
              new Typed.Ping(context.getSelf().narrow()), Adapter.toClassic(context.getSelf()));

          return new Typed(context, second);
        });
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Typed.Pong.class, message -> onPong())
        .onSignal(akka.actor.typed.Terminated.class, sig -> Behaviors.stopped())
        .build();
  }

  private Behavior<Command> onPong() {
    Adapter.stop(getContext(), second);
    return this;
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/package$$ClassicActorSystemOps.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Adapter.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/from-classic.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/style-guide.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/testing-sync.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/typed/coexisting.html](https://doc.akka.io/libraries/akka-core/2.10/typed/coexisting.html)*