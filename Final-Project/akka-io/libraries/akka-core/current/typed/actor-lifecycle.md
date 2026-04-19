---
description: The Akka Actor lifecycle.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:46Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/actor-lifecycle.html
title: Actor lifecycle • Akka core
---

# Actor lifecycle • Akka core

> **Summary:** The Akka Actor lifecycle.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Actor lifecycle

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Actors](../actors.html).

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

An actor is a stateful resource that has to be explicitly started and stopped.

It is important to note that actors do not stop automatically when no longer referenced, every Actor that is created must also explicitly be destroyed. The only simplification is that stopping a parent Actor will also recursively stop all the child Actors that this parent has created. All actors are also stopped automatically when the [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") is shut down.

Note
An `ActorSystem` is a heavyweight structure that will allocate threads, so create one per logical application. Typically one `ActorSystem` per JVM process.

## Creating Actors

An actor can create, or *spawn*, an arbitrary number of child actors, which in turn can spawn children of their own, thus forming an actor hierarchy. [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") hosts the hierarchy and there can be only one *root actor*, an actor at the top of the hierarchy of the `ActorSystem`. The lifecycle of a child actor is tied to the parent – a child can stop itself or be stopped at any time but it can never outlive its parent.

### The ActorContext

The [`ActorContext`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html "akka.actor.typed.javadsl.ActorContext")[`ActorContext`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html "akka.actor.typed.scaladsl.ActorContext") can be accessed for many purposes such as:

- Spawning child actors and supervision
- Watching other actors to receive a [`Terminated(otherActor)`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated")[`Terminated(otherActor)`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated") event should the watched actor stop permanently
- Logging
- Creating message adapters
- Request\-response interactions (ask) with another actor
- Access to the [`self`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html#self:akka.actor.typed.ActorRef[T] "akka.actor.typed.scaladsl.ActorContext")[`getSelf()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html#getSelf() "akka.actor.typed.javadsl.ActorContext") ActorRef

If a behavior needs to use the `ActorContext`, for example to spawn child actors, or use `context.self``context.getSelf()`, it can be obtained by wrapping construction with [`Behaviors.setup`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#setup(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.setup`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors"):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/samples/akka-quickstart-scala/src/main/scala/com/example/HelloWorld.scala#L45-L74 "Go to snippet source")object HelloWorldMain {

  final case class SayHello(name: String)

  def apply(): Behavior[SayHello] =
    Behaviors.setup { context =>
      val greeter = context.spawn(HelloWorld(), "greeter")

      Behaviors.receiveMessage { message =>
        val replyTo = context.spawn(HelloWorldBot(max = 3), message.name)
        greeter ! HelloWorld.Greet(message.name, replyTo)
        Behaviors.same
      }
    }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/samples/akka-quickstart-java/src/main/java/com/example/HelloWorldMain.java#L12-L53 "Go to snippet source")public class HelloWorldMain extends AbstractBehavior<HelloWorldMain.SayHello> {

  public static record SayHello(String name) {}

  public static Behavior<SayHello> create() {
    return Behaviors.setup(HelloWorldMain::new);
  }

  private final ActorRef<HelloWorld.Greet> greeter;

  private HelloWorldMain(ActorContext<SayHello> context) {
    super(context);
    greeter = context.spawn(HelloWorld.create(), "greeter");
  }

  @Override
  public Receive<SayHello> createReceive() {
    return newReceiveBuilder().onMessage(SayHello.class, this::onSayHello).build();
  }

  private Behavior<SayHello> onSayHello(SayHello command) {
    ActorRef<HelloWorld.Greeted> replyTo =
        getContext().spawn(HelloWorldBot.create(3), command.name);
    greeter.tell(new HelloWorld.Greet(command.name, replyTo));
    return this;
  }
}
```

#### ActorContext Thread Safety

Many of the methods in [`ActorContext`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html "akka.actor.typed.javadsl.ActorContext")[`ActorContext`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html "akka.actor.typed.scaladsl.ActorContext") are not thread\-safe and

- Must not be accessed by threads from [`scala.concurrent.Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")[`java.util.concurrent.CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage") callbacks
- Must not be shared between several actor instances
- Must only be used in the ordinary actor message processing thread

### The Guardian Actor

The top level actor, also called the user guardian actor, is created along with the [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem"). Messages sent to the actor system are directed to the root actor. The root actor is defined by the behavior used to create the `ActorSystem`, named `HelloWorldMain` in the example below:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/samples/akka-quickstart-scala/src/main/scala/com/example/HelloWorld.scala#L63-L67 "Go to snippet source")val system: ActorSystem[HelloWorldMain.SayHello] =
  ActorSystem(HelloWorldMain(), "hello")

system ! HelloWorldMain.SayHello("World")
system ! HelloWorldMain.SayHello("Akka")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/samples/akka-quickstart-java/src/main/java/com/example/HelloWorldMain.java#L17-L21 "Go to snippet source")final ActorSystem<SayHello> system =
    ActorSystem.create(HelloWorldMain.create(), "hello");

system.tell(new HelloWorldMain.SayHello("World"));
system.tell(new HelloWorldMain.SayHello("Akka"));
```

For very simple applications the guardian may contain the actual application logic and handle messages. As soon as the application handles more than one concern the guardian should instead just bootstrap the application, spawn the various subsystems as children and monitor their lifecycles.

When the guardian actor stops this will stop the `ActorSystem`.

When [`ActorSystem.terminate`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html#terminate():Unit "akka.actor.typed.ActorSystem")[`ActorSystem.terminate`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html#terminate() "akka.actor.typed.ActorSystem") is invoked the [Coordinated Shutdown](../coordinated-shutdown.html) process will stop actors and services in a specific order.

### Spawning Children

Child actors are created and started with `ActorContext`’s [`spawn`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html#spawn(akka.actor.typed.Behavior,java.lang.String) "akka.actor.typed.javadsl.ActorContext")[`spawn`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html#spawn[U](behavior:akka.actor.typed.Behavior[U],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[U] "akka.actor.typed.scaladsl.ActorContext"). In the example below, when the root actor is started, it spawns a child actor described by the `HelloWorld` behavior. Additionally, when the root actor receives a `SayHello` message, it creates a child actor defined by the behavior `HelloWorldBot`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/samples/akka-quickstart-scala/src/main/scala/com/example/HelloWorld.scala#L45-L74 "Go to snippet source")object HelloWorldMain {

  final case class SayHello(name: String)

  def apply(): Behavior[SayHello] =
    Behaviors.setup { context =>
      val greeter = context.spawn(HelloWorld(), "greeter")

      Behaviors.receiveMessage { message =>
        val replyTo = context.spawn(HelloWorldBot(max = 3), message.name)
        greeter ! HelloWorld.Greet(message.name, replyTo)
        Behaviors.same
      }
    }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/samples/akka-quickstart-java/src/main/java/com/example/HelloWorldMain.java#L12-L53 "Go to snippet source")public class HelloWorldMain extends AbstractBehavior<HelloWorldMain.SayHello> {

  public static record SayHello(String name) {}

  public static Behavior<SayHello> create() {
    return Behaviors.setup(HelloWorldMain::new);
  }

  private final ActorRef<HelloWorld.Greet> greeter;

  private HelloWorldMain(ActorContext<SayHello> context) {
    super(context);
    greeter = context.spawn(HelloWorld.create(), "greeter");
  }

  @Override
  public Receive<SayHello> createReceive() {
    return newReceiveBuilder().onMessage(SayHello.class, this::onSayHello).build();
  }

  private Behavior<SayHello> onSayHello(SayHello command) {
    ActorRef<HelloWorld.Greeted> replyTo =
        getContext().spawn(HelloWorldBot.create(3), command.name);
    greeter.tell(new HelloWorld.Greet(command.name, replyTo));
    return this;
  }
}
```

To specify a dispatcher when spawning an actor use [`DispatcherSelector`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/DispatcherSelector.html "akka.actor.typed.DispatcherSelector")[`DispatcherSelector`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/DispatcherSelector.html "akka.actor.typed.DispatcherSelector"). If not specified, the actor will use the default dispatcher, see [Default dispatcher](dispatchers.html#default-dispatcher) for details.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/IntroSpec.scala#L41-L52 "Go to snippet source")def apply(): Behavior[SayHello] =
  Behaviors.setup { context =>
    val dispatcherPath = "akka.actor.default-blocking-io-dispatcher"

    val props = DispatcherSelector.fromConfig(dispatcherPath)
    val greeter = context.spawn(HelloWorld(), "greeter", props)

    Behaviors.receiveMessage { message =>
      // ...
      Behaviors.same
    }
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/IntroTest.java#L74-L108 "Go to snippet source")public class HelloWorldMain extends AbstractBehavior<HelloWorldMain.SayHello> {

  // Start message...

  public static Behavior<SayHello> create() {
    return Behaviors.setup(HelloWorldMain::new);
  }

  private final ActorRef<HelloWorld.Greet> greeter;

  private HelloWorldMain(ActorContext<SayHello> context) {
    super(context);

    final String dispatcherPath = "akka.actor.default-blocking-io-dispatcher";
    Props greeterProps = DispatcherSelector.fromConfig(dispatcherPath);
    greeter = getContext().spawn(HelloWorld.create(), "greeter", greeterProps);
  }

  // createReceive ...
}
```

Refer to [Actors](actors.html#first-example) for a walk\-through of the above examples.

### SpawnProtocol

The guardian actor should be responsible for initialization of tasks and create the initial actors of the application, but sometimes you might want to spawn new actors from the outside of the guardian actor. For example creating one actor per HTTP request.

That is not difficult to implement in your behavior, but since this is a common pattern there is a predefined message protocol and implementation of a behavior for this. It can be used as the guardian actor of the [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem"), possibly combined with [`Behaviors.setup`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#setup(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.setup`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") to start some initial tasks or actors. Child actors can then be started from the outside by [`tell`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html#tell(msg:T):Unit "akka.actor.typed.ActorRef")[`tell`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html#tell(T) "akka.actor.typed.ActorRef")ing or [`ask`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern$$Askable.html#ask[Res](replyTo:akka.actor.typed.ActorRef[Res]=%3EReq)(implicittimeout:akka.util.Timeout,implicitscheduler:akka.actor.typed.Scheduler):scala.concurrent.Future[Res] "akka.actor.typed.scaladsl.AskPattern.Askable")[`ask`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AskPattern.html#ask(akka.actor.typed.RecipientRef,akka.japi.function.Function,java.time.Duration,akka.actor.typed.Scheduler) "akka.actor.typed.javadsl.AskPattern")ing [`SpawnProtocol.Spawn`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/SpawnProtocol$$Spawn.html "akka.actor.typed.SpawnProtocol.Spawn")[`SpawnProtocol.Spawn`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SpawnProtocol.Spawn.html "akka.actor.typed.SpawnProtocol.Spawn") to the actor reference of the system. Using `ask` is similar to how `ActorSystem.actorOf` can be used in classic actors with the difference that a [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")[`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage") of the [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") is returned.

The guardian behavior can be defined as:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/SpawnProtocolDocSpec.scala#L18-L21 "Go to snippet source")import akka.actor.typed.Behavior
import akka.actor.typed.SpawnProtocol
import akka.actor.typed.scaladsl.Behaviors

object HelloWorldMain {
  def apply(): Behavior[SpawnProtocol.Command] =
    Behaviors.setup { context =>
      // Start initial tasks
      // context.spawn(...)

      SpawnProtocol()
    }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/SpawnProtocolDocTest.java#L13-L16 "Go to snippet source")import akka.actor.typed.Behavior;
import akka.actor.typed.SpawnProtocol;
import akka.actor.typed.javadsl.Behaviors;

public abstract class HelloWorldMain {
  private HelloWorldMain() {}

  public static Behavior<SpawnProtocol.Command> create() {
    return Behaviors.setup(
        context -> {
          // Start initial tasks
          // context.spawn(...)

          return SpawnProtocol.create();
        });
  }
}
```

and the [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") can be created with that `main` behavior and asked to spawn other actors:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/SpawnProtocolDocSpec.scala#L25-L29 "Go to snippet source")import akka.actor.typed.ActorRef
import akka.actor.typed.ActorSystem
import akka.actor.typed.Props
import akka.util.Timeout

implicit val system: ActorSystem[SpawnProtocol.Command] =
  ActorSystem(HelloWorldMain(), "hello")

// needed in implicit scope for ask (?)
import akka.actor.typed.scaladsl.AskPattern._
implicit val ec: ExecutionContext = system.executionContext
implicit val timeout: Timeout = Timeout(3.seconds)

val greeter: Future[ActorRef[HelloWorld.Greet]] =
  system.ask(SpawnProtocol.Spawn(behavior = HelloWorld(), name = "greeter", props = Props.empty, _))

val greetedBehavior = Behaviors.receive[HelloWorld.Greeted] { (context, message) =>
  context.log.info("Greeting for {} from {}", message.whom, message.from)
  Behaviors.stopped
}

val greetedReplyTo: Future[ActorRef[HelloWorld.Greeted]] =
  system.ask(SpawnProtocol.Spawn(greetedBehavior, name = "", props = Props.empty, _))

for (greeterRef <- greeter; replyToRef <- greetedReplyTo) {
  greeterRef ! HelloWorld.Greet("Akka", replyToRef)
}

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/SpawnProtocolDocTest.java#L20-L24 "Go to snippet source")import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Props;
import akka.actor.typed.javadsl.AskPattern;

final ActorSystem<SpawnProtocol.Command> system =
    ActorSystem.create(HelloWorldMain.create(), "hello");
final Duration timeout = Duration.ofSeconds(3);

CompletionStage<ActorRef<HelloWorld.Greet>> greeter =
    AskPattern.ask(
        system,
        replyTo ->
            new SpawnProtocol.Spawn<>(HelloWorld.create(), "greeter", Props.empty(), replyTo),
        timeout,
        system.scheduler());

Behavior<HelloWorld.Greeted> greetedBehavior =
    Behaviors.receive(
        (context, message) -> {
          context.getLog().info("Greeting for {} from {}", message.whom, message.from);
          return Behaviors.stopped();
        });

CompletionStage<ActorRef<HelloWorld.Greeted>> greetedReplyTo =
    AskPattern.ask(
        system,
        replyTo -> new SpawnProtocol.Spawn<>(greetedBehavior, "", Props.empty(), replyTo),
        timeout,
        system.scheduler());

greeter.whenComplete(
    (greeterRef, exc) -> {
      if (exc == null) {
        greetedReplyTo.whenComplete(
            (greetedReplyToRef, exc2) -> {
              if (exc2 == null) {
                greeterRef.tell(new HelloWorld.Greet("Akka", greetedReplyToRef));
              }
            });
      }
    });

```

The [`SpawnProtocol`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/SpawnProtocol$.html "akka.actor.typed.SpawnProtocol")[`SpawnProtocol`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SpawnProtocol.html "akka.actor.typed.SpawnProtocol") can also be used at other places in the actor hierarchy. It doesn’t have to be the root guardian actor.

A way to find running actors is described in [Actor discovery](actor-discovery.html).

## Stopping Actors

An actor can stop itself by returning [`Behaviors.stopped`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#stopped() "akka.actor.typed.javadsl.Behaviors")[`Behaviors.stopped`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#stopped[T]:akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") as the next behavior.

A child actor can be forced to stop after it finishes processing its current message by using the [`stop`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html#stop(akka.actor.typed.ActorRef) "akka.actor.typed.javadsl.ActorContext")[`stop`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html#stop[U](child:akka.actor.typed.ActorRef[U]):Unit "akka.actor.typed.scaladsl.ActorContext") method of the `ActorContext` from the parent actor. Only child actors can be stopped in that way.

All child actors will be stopped when their parent is stopped.

When an actor is stopped, it receives the [`PostStop`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop.html "akka.actor.typed.PostStop")[`PostStop`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html "akka.actor.typed.PostStop") signal that can be used for cleaning up resources.

Here is an illustrating example:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/GracefulStopDocSpec.scala#L8-L11 "Go to snippet source")import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ ActorSystem, PostStop }

object MasterControlProgram {
  sealed trait Command
  final case class SpawnJob(name: String) extends Command
  case object GracefulShutdown extends Command

  def apply(): Behavior[Command] = {
    Behaviors
      .receive[Command] { (context, message) =>
        message match {
          case SpawnJob(jobName) =>
            context.log.info("Spawning job {}!", jobName)
            context.spawn(Job(jobName), name = jobName)
            Behaviors.same
          case GracefulShutdown =>
            context.log.info("Initiating graceful shutdown...")
            // Here it can perform graceful stop (possibly asynchronous) and when completed
            // return `Behaviors.stopped` here or after receiving another message.
            Behaviors.stopped
        }
      }
      .receiveSignal {
        case (context, PostStop) =>
          context.log.info("Master Control Program stopped")
          Behaviors.same
      }
  }
}

object Job {
  sealed trait Command

  def apply(name: String): Behavior[Command] = {
    Behaviors.receiveSignal[Command] {
      case (context, PostStop) =>
        context.log.info("Worker {} stopped", name)
        Behaviors.same
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/GracefulStopDocTest.java#L8-L18 "Go to snippet source")  
import java.util.concurrent.TimeUnit;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.PostStop;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

public class MasterControlProgram extends AbstractBehavior<MasterControlProgram.Command> {

  interface Command {}

  public static final class SpawnJob implements Command {
    public final String name;

    public SpawnJob(String name) {
      this.name = name;
    }
  }

  public enum GracefulShutdown implements Command {
    INSTANCE
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(MasterControlProgram::new);
  }

  public MasterControlProgram(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(SpawnJob.class, this::onSpawnJob)
        .onMessage(GracefulShutdown.class, message -> onGracefulShutdown())
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private Behavior<Command> onSpawnJob(SpawnJob message) {
    getContext().getSystem().log().info("Spawning job {}!", message.name);
    getContext().spawn(Job.create(message.name), message.name);
    return this;
  }

  private Behavior<Command> onGracefulShutdown() {
    getContext().getSystem().log().info("Initiating graceful shutdown...");

    // Here it can perform graceful stop (possibly asynchronous) and when completed
    // return `Behaviors.stopped()` here or after receiving another message.
    return Behaviors.stopped();
  }

  private Behavior<Command> onPostStop() {
    getContext().getSystem().log().info("Master Control Program stopped");
    return this;
  }
}

public class Job extends AbstractBehavior<Job.Command> {

  interface Command {}

  public static Behavior<Command> create(String name) {
    return Behaviors.setup(context -> new Job(context, name));
  }

  private final String name;

  public Job(ActorContext<Command> context, String name) {
    super(context);
    this.name = name;
  }

  @Override
  public Receive<Job.Command> createReceive() {
    return newReceiveBuilder().onSignal(PostStop.class, postStop -> onPostStop()).build();
  }

  private Behavior<Command> onPostStop() {
    getContext().getSystem().log().info("Worker {} stopped", name);
    return this;
  }
}
```

When cleaning up resources from `PostStop` you should also consider doing the same for the [`PreRestart`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PreRestart.html "akka.actor.typed.PreRestart")[`PreRestart`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PreRestart.html "akka.actor.typed.PreRestart") signal, which is emitted when the [actor is restarted](fault-tolerance.html#the-prerestart-signal). Note that `PostStop` is not emitted for a restart. 

## Watching Actors

In order to be notified when another actor terminates (i.e. stops permanently, not temporary failure and restart), an actor can [`watch`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html#watch(akka.actor.typed.ActorRef) "akka.actor.typed.javadsl.ActorContext")[`watch`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html#watch[U](other:akka.actor.typed.ActorRef[U]):Unit "akka.actor.typed.scaladsl.ActorContext") another actor. It will receive the [`Terminated`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated")[`Terminated`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated") signal upon termination (see [Stopping Actors](actor-lifecycle.html#stopping-actors)) of the watched actor.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/GracefulStopDocSpec.scala#L73-L95 "Go to snippet source")  
object MasterControlProgram {
  sealed trait Command
  final case class SpawnJob(name: String) extends Command

  def apply(): Behavior[Command] = {
    Behaviors
      .receive[Command] { (context, message) =>
        message match {
          case SpawnJob(jobName) =>
            context.log.info("Spawning job {}!", jobName)
            val job = context.spawn(Job(jobName), name = jobName)
            context.watch(job)
            Behaviors.same
        }
      }
      .receiveSignal {
        case (context, Terminated(ref)) =>
          context.log.info("Job stopped: {}", ref.path.name)
          Behaviors.same
      }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/GracefulStopDocTest.java#L128-L167 "Go to snippet source")public class MasterControlProgram extends AbstractBehavior<MasterControlProgram.Command> {

  interface Command {}

  public static final class SpawnJob implements Command {
    public final String name;

    public SpawnJob(String name) {
      this.name = name;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(MasterControlProgram::new);
  }

  public MasterControlProgram(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(SpawnJob.class, this::onSpawnJob)
        .onSignal(Terminated.class, this::onTerminated)
        .build();
  }

  private Behavior<Command> onSpawnJob(SpawnJob message) {
    getContext().getSystem().log().info("Spawning job {}!", message.name);
    ActorRef<Job.Command> job = getContext().spawn(Job.create(message.name), message.name);
    getContext().watch(job);
    return this;
  }

  private Behavior<Command> onTerminated(Terminated terminated) {
    getContext().getSystem().log().info("Job stopped: {}", terminated.getRef().path().name());
    return this;
  }
}
```

An alternative to [`watch`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html#watch(akka.actor.typed.ActorRef) "akka.actor.typed.javadsl.ActorContext")[`watch`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html#watch[U](other:akka.actor.typed.ActorRef[U]):Unit "akka.actor.typed.scaladsl.ActorContext") is [`watchWith`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html#watchWith(akka.actor.typed.ActorRef,T) "akka.actor.typed.javadsl.ActorContext")[`watchWith`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html#watchWith[U](other:akka.actor.typed.ActorRef[U],msg:T):Unit "akka.actor.typed.scaladsl.ActorContext"), which allows specifying a custom message instead of the `Terminated`. This is often preferred over using `watch` and the `Terminated` signal because additional information can be included in the message that can be used later when receiving it.

Similar example as above, but using `watchWith` and replies to the original requestor when the job has finished.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/GracefulStopDocSpec.scala#L101-L123 "Go to snippet source")  
object MasterControlProgram {
  sealed trait Command
  final case class SpawnJob(name: String, replyToWhenDone: ActorRef[JobDone]) extends Command
  final case class JobDone(name: String)
  private final case class JobTerminated(name: String, replyToWhenDone: ActorRef[JobDone]) extends Command

  def apply(): Behavior[Command] = {
    Behaviors.receive { (context, message) =>
      message match {
        case SpawnJob(jobName, replyToWhenDone) =>
          context.log.info("Spawning job {}!", jobName)
          val job = context.spawn(Job(jobName), name = jobName)
          context.watchWith(job, JobTerminated(jobName, replyToWhenDone))
          Behaviors.same
        case JobTerminated(jobName, replyToWhenDone) =>
          context.log.info("Job stopped: {}", jobName)
          replyToWhenDone ! JobDone(jobName)
          Behaviors.same
      }
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/GracefulStopDocTest.java#L173-L233 "Go to snippet source")public class MasterControlProgram extends AbstractBehavior<MasterControlProgram.Command> {

  interface Command {}

  public static final class SpawnJob implements Command {
    public final String name;
    public final ActorRef<JobDone> replyToWhenDone;

    public SpawnJob(String name, ActorRef<JobDone> replyToWhenDone) {
      this.name = name;
      this.replyToWhenDone = replyToWhenDone;
    }
  }

  public static final class JobDone {
    public final String name;

    public JobDone(String name) {
      this.name = name;
    }
  }

  private static final class JobTerminated implements Command {
    final String name;
    final ActorRef<JobDone> replyToWhenDone;

    JobTerminated(String name, ActorRef<JobDone> replyToWhenDone) {
      this.name = name;
      this.replyToWhenDone = replyToWhenDone;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(MasterControlProgram::new);
  }

  public MasterControlProgram(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(SpawnJob.class, this::onSpawnJob)
        .onMessage(JobTerminated.class, this::onJobTerminated)
        .build();
  }

  private Behavior<Command> onSpawnJob(SpawnJob message) {
    getContext().getSystem().log().info("Spawning job {}!", message.name);
    ActorRef<Job.Command> job = getContext().spawn(Job.create(message.name), message.name);
    getContext().watchWith(job, new JobTerminated(message.name, message.replyToWhenDone));
    return this;
  }

  private Behavior<Command> onJobTerminated(JobTerminated terminated) {
    getContext().getSystem().log().info("Job stopped: {}", terminated.name);
    terminated.replyToWhenDone.tell(new JobDone(terminated.name));
    return this;
  }
}
```

Note how the `replyToWhenDone` is included in the `watchWith` message and then used later when receiving the `JobTerminated` message. 

The watched actor can be any [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef"), it doesn’t have to be a child actor as in the above example.

It should be noted that the terminated message is generated independent of the order in which registration and termination occur. In particular, the watching actor will receive a terminated message even if the watched actor has already been terminated at the time of registration.

Registering multiple times does not necessarily lead to multiple messages being generated, but there is no guarantee that only exactly one such message is received: if termination of the watched actor has generated and queued the message, and another registration is done before this message has been processed, then a second message will be queued, because registering for monitoring of an already terminated actor leads to the immediate generation of the terminated message.

It is also possible to deregister from watching another actor’s liveliness using [`context.unwatch(target)`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html#unwatch(akka.actor.typed.ActorRef) "akka.actor.typed.javadsl.ActorContext")[`context.unwatch(target)`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html#unwatch[U](other:akka.actor.typed.ActorRef[U]):Unit "akka.actor.typed.scaladsl.ActorContext"). This works even if the terminated message has already been enqueued in the mailbox; after calling `unwatch` no terminated message for that actor will be processed anymore.

The terminated message is also sent when the watched actor is on a node that has been removed from the [Cluster](cluster.html).

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

### Example 4: The ActorContext

```scala
object HelloWorldMain {

  final case class SayHello(name: String)

  def apply(): Behavior[SayHello] =
    Behaviors.setup { context =>
      val greeter = context.spawn(HelloWorld(), "greeter")

      Behaviors.receiveMessage { message =>
        val replyTo = context.spawn(HelloWorldBot(max = 3), message.name)
        greeter ! HelloWorld.Greet(message.name, replyTo)
        Behaviors.same
      }
    }

}
```

### Example 5: The ActorContext

```java
public class HelloWorldMain extends AbstractBehavior<HelloWorldMain.SayHello> {

  public static record SayHello(String name) {}

  public static Behavior<SayHello> create() {
    return Behaviors.setup(HelloWorldMain::new);
  }

  private final ActorRef<HelloWorld.Greet> greeter;

  private HelloWorldMain(ActorContext<SayHello> context) {
    super(context);
    greeter = context.spawn(HelloWorld.create(), "greeter");
  }

  @Override
  public Receive<SayHello> createReceive() {
    return newReceiveBuilder().onMessage(SayHello.class, this::onSayHello).build();
  }

  private Behavior<SayHello> onSayHello(SayHello command) {
    ActorRef<HelloWorld.Greeted> replyTo =
        getContext().spawn(HelloWorldBot.create(3), command.name);
    greeter.tell(new HelloWorld.Greet(command.name, replyTo));
    return this;
  }
}
```

### Example 6: The Guardian Actor

```scala
val system: ActorSystem[HelloWorldMain.SayHello] =
  ActorSystem(HelloWorldMain(), "hello")

system ! HelloWorldMain.SayHello("World")
system ! HelloWorldMain.SayHello("Akka")
```

### Example 7: The Guardian Actor

```java
final ActorSystem<SayHello> system =
    ActorSystem.create(HelloWorldMain.create(), "hello");

system.tell(new HelloWorldMain.SayHello("World"));
system.tell(new HelloWorldMain.SayHello("Akka"));
```

### Example 8: Spawning Children

```scala
object HelloWorldMain {

  final case class SayHello(name: String)

  def apply(): Behavior[SayHello] =
    Behaviors.setup { context =>
      val greeter = context.spawn(HelloWorld(), "greeter")

      Behaviors.receiveMessage { message =>
        val replyTo = context.spawn(HelloWorldBot(max = 3), message.name)
        greeter ! HelloWorld.Greet(message.name, replyTo)
        Behaviors.same
      }
    }

}
```

### Example 9: Spawning Children

```java
public class HelloWorldMain extends AbstractBehavior<HelloWorldMain.SayHello> {

  public static record SayHello(String name) {}

  public static Behavior<SayHello> create() {
    return Behaviors.setup(HelloWorldMain::new);
  }

  private final ActorRef<HelloWorld.Greet> greeter;

  private HelloWorldMain(ActorContext<SayHello> context) {
    super(context);
    greeter = context.spawn(HelloWorld.create(), "greeter");
  }

  @Override
  public Receive<SayHello> createReceive() {
    return newReceiveBuilder().onMessage(SayHello.class, this::onSayHello).build();
  }

  private Behavior<SayHello> onSayHello(SayHello command) {
    ActorRef<HelloWorld.Greeted> replyTo =
        getContext().spawn(HelloWorldBot.create(3), command.name);
    greeter.tell(new HelloWorld.Greet(command.name, replyTo));
    return this;
  }
}
```

### Example 10: Spawning Children

```scala
def apply(): Behavior[SayHello] =
  Behaviors.setup { context =>
    val dispatcherPath = "akka.actor.default-blocking-io-dispatcher"

    val props = DispatcherSelector.fromConfig(dispatcherPath)
    val greeter = context.spawn(HelloWorld(), "greeter", props)

    Behaviors.receiveMessage { message =>
      // ...
      Behaviors.same
    }
  }
```

### Example 11: Spawning Children

```java
public class HelloWorldMain extends AbstractBehavior<HelloWorldMain.SayHello> {

  // Start message...

  public static Behavior<SayHello> create() {
    return Behaviors.setup(HelloWorldMain::new);
  }

  private final ActorRef<HelloWorld.Greet> greeter;

  private HelloWorldMain(ActorContext<SayHello> context) {
    super(context);

    final String dispatcherPath = "akka.actor.default-blocking-io-dispatcher";
    Props greeterProps = DispatcherSelector.fromConfig(dispatcherPath);
    greeter = getContext().spawn(HelloWorld.create(), "greeter", greeterProps);
  }

  // createReceive ...
}
```

### Example 12: SpawnProtocol

```scala
import akka.actor.typed.Behavior
import akka.actor.typed.SpawnProtocol
import akka.actor.typed.scaladsl.Behaviors

object HelloWorldMain {
  def apply(): Behavior[SpawnProtocol.Command] =
    Behaviors.setup { context =>
      // Start initial tasks
      // context.spawn(...)

      SpawnProtocol()
    }
}
```

### Example 13: SpawnProtocol

```java
import akka.actor.typed.Behavior;
import akka.actor.typed.SpawnProtocol;
import akka.actor.typed.javadsl.Behaviors;

public abstract class HelloWorldMain {
  private HelloWorldMain() {}

  public static Behavior<SpawnProtocol.Command> create() {
    return Behaviors.setup(
        context -> {
          // Start initial tasks
          // context.spawn(...)

          return SpawnProtocol.create();
        });
  }
}
```

### Example 14: SpawnProtocol

```scala
import akka.actor.typed.ActorRef
import akka.actor.typed.ActorSystem
import akka.actor.typed.Props
import akka.util.Timeout


implicit val system: ActorSystem[SpawnProtocol.Command] =
  ActorSystem(HelloWorldMain(), "hello")

// needed in implicit scope for ask (?)
import akka.actor.typed.scaladsl.AskPattern._
implicit val ec: ExecutionContext = system.executionContext
implicit val timeout: Timeout = Timeout(3.seconds)

val greeter: Future[ActorRef[HelloWorld.Greet]] =
  system.ask(SpawnProtocol.Spawn(behavior = HelloWorld(), name = "greeter", props = Props.empty, _))

val greetedBehavior = Behaviors.receive[HelloWorld.Greeted] { (context, message) =>
  context.log.info("Greeting for {} from {}", message.whom, message.from)
  Behaviors.stopped
}

val greetedReplyTo: Future[ActorRef[HelloWorld.Greeted]] =
  system.ask(SpawnProtocol.Spawn(greetedBehavior, name = "", props = Props.empty, _))

for (greeterRef <- greeter; replyToRef <- greetedReplyTo) {
  greeterRef ! HelloWorld.Greet("Akka", replyToRef)
}
```

### Example 15: SpawnProtocol

```java
import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Props;
import akka.actor.typed.javadsl.AskPattern;

final ActorSystem<SpawnProtocol.Command> system =
    ActorSystem.create(HelloWorldMain.create(), "hello");
final Duration timeout = Duration.ofSeconds(3);

CompletionStage<ActorRef<HelloWorld.Greet>> greeter =
    AskPattern.ask(
        system,
        replyTo ->
            new SpawnProtocol.Spawn<>(HelloWorld.create(), "greeter", Props.empty(), replyTo),
        timeout,
        system.scheduler());

Behavior<HelloWorld.Greeted> greetedBehavior =
    Behaviors.receive(
        (context, message) -> {
          context.getLog().info("Greeting for {} from {}", message.whom, message.from);
          return Behaviors.stopped();
        });

CompletionStage<ActorRef<HelloWorld.Greeted>> greetedReplyTo =
    AskPattern.ask(
        system,
        replyTo -> new SpawnProtocol.Spawn<>(greetedBehavior, "", Props.empty(), replyTo),
        timeout,
        system.scheduler());

greeter.whenComplete(
    (greeterRef, exc) -> {
      if (exc == null) {
        greetedReplyTo.whenComplete(
            (greetedReplyToRef, exc2) -> {
              if (exc2 == null) {
                greeterRef.tell(new HelloWorld.Greet("Akka", greetedReplyToRef));
              }
            });
      }
    });
```

### Example 16: Stopping Actors

```scala
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ ActorSystem, PostStop }


object MasterControlProgram {
  sealed trait Command
  final case class SpawnJob(name: String) extends Command
  case object GracefulShutdown extends Command

  def apply(): Behavior[Command] = {
    Behaviors
      .receive[Command] { (context, message) =>
        message match {
          case SpawnJob(jobName) =>
            context.log.info("Spawning job {}!", jobName)
            context.spawn(Job(jobName), name = jobName)
            Behaviors.same
          case GracefulShutdown =>
            context.log.info("Initiating graceful shutdown...")
            // Here it can perform graceful stop (possibly asynchronous) and when completed
            // return `Behaviors.stopped` here or after receiving another message.
            Behaviors.stopped
        }
      }
      .receiveSignal {
        case (context, PostStop) =>
          context.log.info("Master Control Program stopped")
          Behaviors.same
      }
  }
}

object Job {
  sealed trait Command

  def apply(name: String): Behavior[Command] = {
    Behaviors.receiveSignal[Command] {
      case (context, PostStop) =>
        context.log.info("Worker {} stopped", name)
        Behaviors.same
    }
  }
}
```

### Example 17: Stopping Actors

```java
import java.util.concurrent.TimeUnit;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.PostStop;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;


public class MasterControlProgram extends AbstractBehavior<MasterControlProgram.Command> {

  interface Command {}

  public static final class SpawnJob implements Command {
    public final String name;

    public SpawnJob(String name) {
      this.name = name;
    }
  }

  public enum GracefulShutdown implements Command {
    INSTANCE
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(MasterControlProgram::new);
  }

  public MasterControlProgram(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(SpawnJob.class, this::onSpawnJob)
        .onMessage(GracefulShutdown.class, message -> onGracefulShutdown())
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private Behavior<Command> onSpawnJob(SpawnJob message) {
    getContext().getSystem().log().info("Spawning job {}!", message.name);
    getContext().spawn(Job.create(message.name), message.name);
    return this;
  }

  private Behavior<Command> onGracefulShutdown() {
    getContext().getSystem().log().info("Initiating graceful shutdown...");

    // Here it can perform graceful stop (possibly asynchronous) and when completed
    // return `Behaviors.stopped()` here or after receiving another message.
    return Behaviors.stopped();
  }

  private Behavior<Command> onPostStop() {
    getContext().getSystem().log().info("Master Control Program stopped");
    return this;
  }
}

public class Job extends AbstractBehavior<Job.Command> {

  interface Command {}

  public static Behavior<Command> create(String name) {
    return Behaviors.setup(context -> new Job(context, name));
  }

  private final String name;

  public Job(ActorContext<Command> context, String name) {
    super(context);
    this.name = name;
  }

  @Override
  public Receive<Job.Command> createReceive() {
    return newReceiveBuilder().onSignal(PostStop.class, postStop -> onPostStop()).build();
  }

  private Behavior<Command> onPostStop() {
    getContext().getSystem().log().info("Worker {} stopped", name);
    return this;
  }
}
```

### Example 18: Watching Actors

```scala
object MasterControlProgram {
  sealed trait Command
  final case class SpawnJob(name: String) extends Command

  def apply(): Behavior[Command] = {
    Behaviors
      .receive[Command] { (context, message) =>
        message match {
          case SpawnJob(jobName) =>
            context.log.info("Spawning job {}!", jobName)
            val job = context.spawn(Job(jobName), name = jobName)
            context.watch(job)
            Behaviors.same
        }
      }
      .receiveSignal {
        case (context, Terminated(ref)) =>
          context.log.info("Job stopped: {}", ref.path.name)
          Behaviors.same
      }
  }
}
```

### Example 19: Watching Actors

```java
public class MasterControlProgram extends AbstractBehavior<MasterControlProgram.Command> {

  interface Command {}

  public static final class SpawnJob implements Command {
    public final String name;

    public SpawnJob(String name) {
      this.name = name;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(MasterControlProgram::new);
  }

  public MasterControlProgram(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(SpawnJob.class, this::onSpawnJob)
        .onSignal(Terminated.class, this::onTerminated)
        .build();
  }

  private Behavior<Command> onSpawnJob(SpawnJob message) {
    getContext().getSystem().log().info("Spawning job {}!", message.name);
    ActorRef<Job.Command> job = getContext().spawn(Job.create(message.name), message.name);
    getContext().watch(job);
    return this;
  }

  private Behavior<Command> onTerminated(Terminated terminated) {
    getContext().getSystem().log().info("Job stopped: {}", terminated.getRef().path().name());
    return this;
  }
}
```

### Example 20: Watching Actors

```scala
object MasterControlProgram {
  sealed trait Command
  final case class SpawnJob(name: String, replyToWhenDone: ActorRef[JobDone]) extends Command
  final case class JobDone(name: String)
  private final case class JobTerminated(name: String, replyToWhenDone: ActorRef[JobDone]) extends Command

  def apply(): Behavior[Command] = {
    Behaviors.receive { (context, message) =>
      message match {
        case SpawnJob(jobName, replyToWhenDone) =>
          context.log.info("Spawning job {}!", jobName)
          val job = context.spawn(Job(jobName), name = jobName)
          context.watchWith(job, JobTerminated(jobName, replyToWhenDone))
          Behaviors.same
        case JobTerminated(jobName, replyToWhenDone) =>
          context.log.info("Job stopped: {}", jobName)
          replyToWhenDone ! JobDone(jobName)
          Behaviors.same
      }
    }
  }
}
```

### Example 21: Watching Actors

```java
public class MasterControlProgram extends AbstractBehavior<MasterControlProgram.Command> {

  interface Command {}

  public static final class SpawnJob implements Command {
    public final String name;
    public final ActorRef<JobDone> replyToWhenDone;

    public SpawnJob(String name, ActorRef<JobDone> replyToWhenDone) {
      this.name = name;
      this.replyToWhenDone = replyToWhenDone;
    }
  }

  public static final class JobDone {
    public final String name;

    public JobDone(String name) {
      this.name = name;
    }
  }

  private static final class JobTerminated implements Command {
    final String name;
    final ActorRef<JobDone> replyToWhenDone;

    JobTerminated(String name, ActorRef<JobDone> replyToWhenDone) {
      this.name = name;
      this.replyToWhenDone = replyToWhenDone;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(MasterControlProgram::new);
  }

  public MasterControlProgram(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(SpawnJob.class, this::onSpawnJob)
        .onMessage(JobTerminated.class, this::onJobTerminated)
        .build();
  }

  private Behavior<Command> onSpawnJob(SpawnJob message) {
    getContext().getSystem().log().info("Spawning job {}!", message.name);
    ActorRef<Job.Command> job = getContext().spawn(Job.create(message.name), message.name);
    getContext().watchWith(job, new JobTerminated(message.name, message.replyToWhenDone));
    return this;
  }

  private Behavior<Command> onJobTerminated(JobTerminated terminated) {
    getContext().getSystem().log().info("Job stopped: {}", terminated.name);
    terminated.replyToWhenDone.tell(new JobDone(terminated.name));
    return this;
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PreRestart.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/SpawnProtocol$$Spawn.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/SpawnProtocol$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Terminated.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern$$Askable.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PreRestart.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SpawnProtocol.Spawn.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SpawnProtocol.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AskPattern.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/libraries/akka-core/current/actors.html
- https://doc.akka.io/libraries/akka-core/current/coordinated-shutdown.html
- https://doc.akka.io/libraries/akka-core/current/typed/actor-discovery.html
- https://doc.akka.io/libraries/akka-core/current/typed/actor-lifecycle.html
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster.html
- https://doc.akka.io/libraries/akka-core/current/typed/dispatchers.html
- https://doc.akka.io/libraries/akka-core/current/typed/fault-tolerance.html
- https://doc.akka.io/libraries/akka-core/current/typed/interaction-patterns.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/actor-lifecycle.html](https://doc.akka.io/libraries/akka-core/current/typed/actor-lifecycle.html)*