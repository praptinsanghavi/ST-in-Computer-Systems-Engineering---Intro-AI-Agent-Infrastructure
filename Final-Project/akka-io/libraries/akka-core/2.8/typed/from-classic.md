---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:23:35Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/docs/akka/current/typed/from-classic.html
title: Learning Akka Typed from Classic • Akka Documentation
---

# Learning Akka Typed from Classic • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Learning Akka Typed from Classic

Akka Classic is the original Actor APIs, which have been improved by more type safe and guided Actor APIs, known as Akka Typed.

If you already know the classic Actor APIs and would like to learn Akka Typed, this reference is a good resource. Many concepts are the same and this page tries to highlight differences and how to do certain things in Typed compared to classic.

You should probably learn some of the basics of Akka Typed to see how it looks like before diving into the differences and details described here. A good starting point for that is the [IoT example](guide/tutorial_3.html) in the Getting Started Guide or the examples shown in [Introduction to Actors](actors.html).

Another good resource to learning Akka Typed is Manuel Bernhardt’s [Tour of Akka Typed](https://manuel.bernhardt.io/articles/#akka-typed).

Note that Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use Akka Typed together with classic actors within the same ActorSystem, see [coexistence](coexisting.html). For new projects we recommend using the new Actor APIs.

## Dependencies

The dependencies of the Typed modules are named by adding `-typed` suffix of the corresponding classic module, with a few exceptions.

For example `akka-cluster-typed`:

sbt
```
val AkkaVersion = "2.8.9"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-typed" % AkkaVersion
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
    <artifactId>akka-cluster-typed_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}"
}
```

Artifact names:

| Classic | Typed |
| --- | --- |
| akka\-actor | akka\-actor\-typed |
| akka\-cluster | akka\-cluster\-typed |
| akka\-cluster\-sharding | akka\-cluster\-sharding\-typed |
| akka\-cluster\-tools | akka\-cluster\-typed |
| akka\-distributed\-data | akka\-cluster\-typed |
| akka\-persistence | akka\-persistence\-typed |
| akka\-stream | akka\-stream\-typed |
| akka\-testkit | akka\-actor\-testkit\-typed |

Cluster Singleton and Distributed Data are included in `akka-cluster-typed`.

Artifacts not listed in above table don’t have a specific API for Akka Typed.

## Package names

The convention of the package names in Akka Typed is to add `typed.scaladsl` and `typed.javadsl` to the corresponding Akka classic package name. `scaladsl` and `javadsl` is the convention to separate Scala and Java APIs, which is familiar from Akka Streams.

Examples of a few package names:

| Classic | Typed for Scala | Typed for Java |
| --- | --- | --- |
| akka.actor | akka.actor.typed.scaladsl | akka.actor.typed.javadsl |
| akka.cluster | akka.cluster.typed | akka.cluster.typed |
| akka.cluster.sharding | akka.cluster.sharding.typed.scaladsl | akka.cluster.sharding.typed.javadsl |
| akka.persistence | akka.persistence.typed.scaladsl | akka.persistence.typed.javadsl |

## Actor definition

A classic actor is defined by a class extending `akka.actor.Actor``akka.actor.AbstractActor`.

An actor in Typed is defined by a class extending `akka.actor.typed.scaladsl.AbstractBehavior``akka.actor.typed.javadsl.AbstractBehavior`.

It’s also possible to define an actor in Typed from functions instead of extending a class. This is called the [functional style](style-guide.html#functional-versus-object-oriented-style).

Classic HelloWorld actor:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/fromclassic/ClassicSample.scala#L8-L33 "Go to snippet source")import akka.actor.Actor
import akka.actor.ActorLogging
import akka.actor.Props

object HelloWorld {
  final case class Greet(whom: String)
  final case class Greeted(whom: String)

  def props(): Props =
    Props(new HelloWorld)
}

class HelloWorld extends Actor with ActorLogging {
  import HelloWorld._

  override def receive: Receive = {
    case Greet(whom) =>
      log.info("Hello {}!", whom)
      sender() ! Greeted(whom)
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/fromclassic/ClassicSample.java#L8-L51 "Go to snippet source")import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class HelloWorld extends AbstractActor {

  public static final class Greet {
    public final String whom;

    public Greet(String whom) {
      this.whom = whom;
    }
  }

  public static final class Greeted {
    public final String whom;

    public Greeted(String whom) {
      this.whom = whom;
    }
  }

  public static Props props() {
    return Props.create(HelloWorld.class, HelloWorld::new);
  }

  private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(Greet.class, this::onGreet).build();
  }

  private void onGreet(Greet command) {
    log.info("Hello {}!", command.whom);
    getSender().tell(new Greeted(command.whom), getSelf());
  }
}
```

Typed HelloWorld actor:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/fromclassic/TypedSample.scala#L8-L35 "Go to snippet source")import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.AbstractBehavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors

object HelloWorld {
  final case class Greet(whom: String, replyTo: ActorRef[Greeted])
  final case class Greeted(whom: String, from: ActorRef[Greet])

  def apply(): Behavior[HelloWorld.Greet] =
    Behaviors.setup(context => new HelloWorld(context))
}

class HelloWorld(context: ActorContext[HelloWorld.Greet]) extends AbstractBehavior[HelloWorld.Greet](context) {
  import HelloWorld._

  override def onMessage(message: Greet): Behavior[Greet] = {
    context.log.info("Hello {}!", message.whom)
    message.replyTo ! Greeted(message.whom, context.self)
    this
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/fromclassic/TypedSample.java#L8-L62 "Go to snippet source")import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld extends AbstractBehavior<HelloWorld.Greet> {

  public static final class Greet {
    public final String whom;
    public final ActorRef<Greeted> replyTo;

    public Greet(String whom, ActorRef<Greeted> replyTo) {
      this.whom = whom;
      this.replyTo = replyTo;
    }
  }

  public static final class Greeted {
    public final String whom;
    public final ActorRef<Greet> from;

    public Greeted(String whom, ActorRef<Greet> from) {
      this.whom = whom;
      this.from = from;
    }
  }

  public static Behavior<Greet> create() {
    return Behaviors.setup(HelloWorld::new);
  }

  private HelloWorld(ActorContext<Greet> context) {
    super(context);
  }

  @Override
  public Receive<Greet> createReceive() {
    return newReceiveBuilder().onMessage(Greet.class, this::onGreet).build();
  }

  private Behavior<Greet> onGreet(Greet command) {
    getContext().getLog().info("Hello {}!", command.whom);
    command.replyTo.tell(new Greeted(command.whom, getContext().getSelf()));
    return this;
  }
}
```

Why is it called `Behavior` and not `Actor`?

In Typed, the `Behavior` defines how to handle incoming messages. After processing a message, a different `Behavior` may be returned for processing the next message. This means that an actor is started with an initial `Behavior` and may change `Behavior` over its lifecycle. This is described more in the section about [become](from-classic.html#become).

Note that the `Behavior` has a type parameter describing the type of messages that it can handle. This information is not defined explicitly for a classic actor.

Links to reference documentation:

- [Classic](../actors.html#defining-an-actor-class)
- [Typed](actors.html#first-example)

## actorOf and Props

A classic actor is started with the `actorOf` method of the `ActorContext` or `ActorSystem`.

Corresponding method in Typed is called `spawn` in the `akka.actor.typed.scaladsl.ActorContext``akka.actor.typed.javadsl.ActorContext`.

There is no `spawn` method in the `akka.actor.typed.scaladsl.ActorSystem``akka.actor.typed.javadsl.ActorSystem` for creating top level actors. Instead, there is a single top level actor defined by a user guardian `Behavior` that is given when starting the `ActorSystem`. Other actors are started as children of that user guardian actor or children of other actors in the actor hierarchy. This is explained more in [ActorSystem](from-classic.html#actorsystem).

Note that when mixing classic and typed and have a classic system, spawning top level actors from the side is possible, see [Coexistence](coexisting.html#top-level-typed-actor-classic-system).

The `actorOf` method takes an `akka.actor.Props` parameter, which is like a factory for creating the actor instance, and it’s also used when creating a new instance when the actor is restarted. The `Props` may also define additional properties such as which dispatcher to use for the actor.

In typed, the `spawn` method creates an actor directly from a given `Behavior` without using a `Props` factory. It does however accept an optional `akka.actor.typed.Props` for specifying Actor metadata. The factory aspect is instead defined via `Behaviors.setup` when using the object\-oriented style with a class extending `AbstractBehavior`. For the function style there is typically no need for the factory.

Additional properties such as which dispatcher to use for the actor can still be given via an optional `akka.actor.typed.Props` parameter of the `spawn` method.

The `name` parameter of `actorOf` is optional and if not defined the actor will have a generated name. Corresponding in Typed is achieved with the `spawnAnonymous` method.

Links to reference documentation:

- [Classic](../actors.html#creating-actors-with-props)
- [Typed](actor-lifecycle.html#creating-actors)

## ActorRef

`akka.actor.ActorRef` has its correspondence in `akka.actor.typed.ActorRef`. The difference being that the latter has a type parameter describing which messages the actor can handle. This information is not defined for a classic actor and you can send any type of message to a classic `ActorRef` even though the actor may not understand it.

## ActorSystem

`akka.actor.ActorSystem` has its correspondence in `akka.actor.typed.ActorSystem`. One difference is that when creating an `ActorSystem` in Typed you give it a `Behavior` that will be used as the top level actor, also known as the user guardian.

Additional actors for an application are created from the user guardian alongside performing the initialization of Akka components such as Cluster Sharding. In contrast, in a classic `ActorSystem`, such initialization is typically performed from the “outside”.

The `actorOf` method of the classic `ActorSystem` is typically used to create a few (or many) top level actors. The `ActorSystem` in Typed doesn’t have that capability. Instead, such actors are started as children of the user guardian actor or children of other actors in the actor hierarchy. The rationale for this is partly about consistency. In a typed system you can’t create children to an arbitrary actor from anywhere in your app without messaging it, so this will also hold true for the user guardian actor. That noted, in cases where you do need to spawn outside of this guardian then you can use the [`SpawnProtocol`](actor-lifecycle.html#spawnprotocol) to spawn as needed.

## become

A classic actor can change its message processing behavior by using `become` in `ActorContext`. In Typed this is done by returning a new `Behavior` after processing a message. The returned `Behavior` will be used for the next received message.

There is no correspondence to `unbecome` in Typed. Instead you must explicitly keep track of and return the “previous” `Behavior`.

Links to reference documentation:

- [Classic](../actors.html#actor-hotswap)

## sender

There is no `sender()``getSender()` in Typed. Instead you have to explicitly include an `ActorRef` representing the sender—or rather representing where to send a reply to—in the messages.

The reason for not having an implicit sender in Typed is that it wouldn’t be possible to know the type for the sender `ActorRef[T]``ActorRef<T>` at compile time. It’s also much better to define this explicitly in the messages as it becomes more clear what the message protocol expects.

Links to reference documentation:

- [Classic](../actors.html#actors-tell-sender)
- [Typed](interaction-patterns.html#request-response)

## parent

There is no `parent``getParent` in Typed. Instead you have to explicitly include the `ActorRef` of the parent as a parameter when constructing the `Behavior`.

The reason for not having a parent in Typed is that it wouldn’t be possible to know the type for the parent `ActorRef[T]``ActorRef<T>` at compile time without having an additional type parameter in the `Behavior`. For testing purposes it’s also better to pass in the `parent` since it can be replaced by a probe or being stubbed out in tests.

## Supervision

An important difference between classic and typed is that in typed, actors are stopped by default if an exception is thrown and no supervision strategy is defined. In contrast, in classic, by default, actors are restarted.

In classic actors the supervision strategy for child actors are defined by overriding the `supervisorStrategy` method in the parent actor.

In Typed the supervisor strategy is defined by wrapping the `Behavior` of the child actor with `Behaviors.supervise`.

The classic `BackoffSupervisor` is supported by `SupervisorStrategy.restartWithBackoff` as an ordinary `SupervisorStrategy` in Typed.

`SupervisorStrategy.Escalate` isn’t supported in Typed, but similar can be achieved as described in [Bubble failures up through the hierarchy](fault-tolerance.html#bubble-failures-up-through-the-hierarchy).

Links to reference documentation:

- [Classic](../fault-tolerance.html)
- [Typed](fault-tolerance.html)

## Lifecycle hooks

Classic actors have methods `preStart`, `preRestart`, `postRestart` and `postStop` that can be overridden to act on changes to the actor’s lifecycle.

This is supported with corresponding `PreRestart` and `PostStop` signal messages in Typed. There are no `PreStart` and `PostRestart` signals because such action can be done from `Behaviors.setup` or the constructor of the `AbstractBehavior` class.

Note that in classic, the `postStop` lifecycle hook is also called when the actor is restarted. That is not the case in Typed, only the `PreRestart` signal is emitted. If you need to do resource cleanup on both restart and stop, you have to do that for both `PreRestart` and `PostStop`.

Links to reference documentation:

- [Classic](../actors.html#start-hook)
- [Typed](fault-tolerance.html#the-prerestart-signal)

## watch

`watch` and the `Terminated` message are pretty much the same, with some additional capabilities in Typed.

`Terminated` is a signal in Typed since it is a different type than the declared message type of the `Behavior`.

The `watchWith` method of the `ActorContext` in Typed can be used to send a message instead of the `Terminated` signal.

When watching child actors it’s possible to see if the child terminated voluntarily or due to a failure via the `ChildFailed` signal, which is a subclass of `Terminated`.

Links to reference documentation:

- [Classic](../actors.html#deathwatch)
- [Typed](actor-lifecycle.html#watching-actors)

## Stopping

Classic actors can be stopped with the `stop` method of `ActorContext` or `ActorSystem`. In Typed an actor stops itself by returning `Behaviors.stopped`. There is also a `stop` method in the `ActorContext` but it can only be used for stopping direct child actors and not any arbitrary actor.

`PoisonPill` is not supported in Typed. Instead, if you need to request an actor to stop you should define a message that the actor understands and let it return `Behaviors.stopped` when receiving that message.

Links to reference documentation:

- [Classic](../actors.html#stopping-actors)
- [Typed](actor-lifecycle.html#stopping-actors)

## ActorSelection

`ActorSelection` isn’t supported in Typed. Instead the [Receptionist](actor-discovery.html) is supposed to be used for finding actors by a registered key.

`ActorSelection` can be used for sending messages to a path without having an `ActorRef` of the destination. Note that a [Group Router](routers.html#group-router) can be used for that.

Links to reference documentation:

- [Classic](../actors.html#actorselection)
- [Typed](actor-discovery.html)

## ask

The classic `ask` pattern returns a `Future``CompletionStage` for the response.

Corresponding `ask` exists in Typed and is good when the requester itself isn’t an actor. It is located in `akka.actor.typed.scaladsl.AskPattern``akka.actor.typed.javadsl.AskPattern`.

When the requester is an actor it is better to use the `ask` method of the `ActorContext` in Typed. It has the advantage of not having to mix `Future``CompletionStage` callbacks that are running on different threads with actor code.

Links to reference documentation:

- [Classic](../actors.html#actors-ask)
- [Typed](interaction-patterns.html#request-response-with-ask-between-two-actors)

## pipeTo

`pipeTo` is typically used together with `ask` in an actor. The `ask` method of the `ActorContext` in Typed removes the need for `pipeTo`. However, for interactions with other APIs that return `Future``CompletionStage` it is still useful to send the result as a message to the actor. For this purpose there is a `pipeToSelf` method in the `ActorContext` in Typed.

## ActorContext.children

The `ActorContext` has methods `children` and `child``getChildren` and `getChild` to retrieve the `ActorRef` of started child actors in both Typed and Classic.

The type of the returned `ActorRef` is unknown, since different types can be used for different children. Therefore, this is not a useful way to lookup children when the purpose is to send messages to them.

Instead of finding children via the `ActorContext`, it is recommended to use an application specific collection for bookkeeping of children, such as a `Map[String, ActorRef[Child.Command]]` `Map<String, ActorRef<Child.Command>>`. It can look like this:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/fromclassic/TypedSample.scala#L39-L68 "Go to snippet source")object Parent {
  sealed trait Command
  case class DelegateToChild(name: String, message: Child.Command) extends Command
  private case class ChildTerminated(name: String) extends Command

  def apply(): Behavior[Command] = {
    def updated(children: Map[String, ActorRef[Child.Command]]): Behavior[Command] = {
      Behaviors.receive { (context, command) =>
        command match {
          case DelegateToChild(name, childCommand) =>
            children.get(name) match {
              case Some(ref) =>
                ref ! childCommand
                Behaviors.same
              case None =>
                val ref = context.spawn(Child(), name)
                context.watchWith(ref, ChildTerminated(name))
                ref ! childCommand
                updated(children + (name -> ref))
            }

          case ChildTerminated(name) =>
            updated(children - name)
        }
      }
    }

    updated(Map.empty)
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/fromclassic/TypedSample.java#L66-L121 "Go to snippet source")public class Parent extends AbstractBehavior<Parent.Command> {

  public interface Command {}

  public static class DelegateToChild implements Command {
    public final String name;
    public final Child.Command message;

    public DelegateToChild(String name, Child.Command message) {
      this.name = name;
      this.message = message;
    }
  }

  private static class ChildTerminated implements Command {
    final String name;

    ChildTerminated(String name) {
      this.name = name;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(Parent::new);
  }

  private Map<String, ActorRef<Child.Command>> children = new HashMap<>();

  private Parent(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(DelegateToChild.class, this::onDelegateToChild)
        .onMessage(ChildTerminated.class, this::onChildTerminated)
        .build();
  }

  private Behavior<Command> onDelegateToChild(DelegateToChild command) {
    ActorRef<Child.Command> ref = children.get(command.name);
    if (ref == null) {
      ref = getContext().spawn(Child.create(), command.name);
      getContext().watchWith(ref, new ChildTerminated(command.name));
      children.put(command.name, ref);
    }
    ref.tell(command.message);
    return this;
  }

  private Behavior<Command> onChildTerminated(ChildTerminated command) {
    children.remove(command.name);
    return this;
  }
}
```

Remember to remove entries from the `Map` when the children are terminated. For that purpose it’s convenient to use `watchWith`, as illustrated in the example above, because then you can include the key to the `Map` in the termination message. In that way the name of the actor doesn’t have to be the same as identifier used for bookkeeping.

Retrieving the children from the `ActorContext` can still be useful for some use cases, such as:

- see if a child name is in use
- stopping children
- the type of the child is well known and `unsafeUpcast` of the `ActorRef` is considered “safe enough”

## Remote deployment

Starting an actor on a remote node—so called remote deployment—isn’t supported in Typed.

This feature would be discouraged because it often results in tight coupling between nodes and undesirable failure handling. For example if the node of the parent actor crashes, all remote deployed child actors are brought down with it. Sometimes that can be desired but many times it is used without realizing. This can be achieved by other means, such as using `watch`.

## Routers

Routers are provided in Typed, but in a much simplified form compared to the classic routers.

Destinations of group routers are registered in the `Receptionist`, which makes them Cluster aware and also more dynamic than classic group routers.

Pool routers are only for local actor destinations in Typed, since [remote deployment isn’t supported](from-classic.html#remote-deployment).

Links to reference documentation:

- [Classic](../routing.html)
- [Typed](routers.html)

## FSM

With classic actors there is explicit support for building Finite State Machines. No support is needed in Akka Typed as it is straightforward to represent FSMs with behaviors.

Links to reference documentation:

- [Classic](../fsm.html)
- [Typed](fsm.html)

## Timers

In classic actors you mixin `with Timers``extend AbstractActorWithTimers` to gain access to delayed and periodic scheduling of messages. In Typed you have access to similar capabilities via `Behaviors.withTimers`.

Links to reference documentation:

- [Classic](../actors.html#actors-timers)
- [Typed](interaction-patterns.html#scheduling-messages-to-self)

## Stash

In classic actors you mixin `with Stash``extend AbstractActorWithStash` to gain access to stashing of messages. In Typed you have access to similar capabilities via `Behaviors.withStash`.

Links to reference documentation:

- [Classic](../actors.html#stash)
- [Typed](stash.html)

## PersistentActor

The correspondence of the classic `PersistentActor` is `akka.persistence.typed.scaladsl.EventSourcedBehavior``akka.persistence.typed.javadsl.EventSourcedBehavior`.

The Typed API is much more guided to facilitate Event Sourcing best practices. It also has tighter integration with Cluster Sharding.

Links to reference documentation:

- [Classic](../persistence.html)
- [Typed](persistence.html)

## Asynchronous Testing

The Test Kits for asynchronous testing are rather similar.

Links to reference documentation:

- [Classic](../testing.html#async-integration-testing)
- [Typed](testing-async.html#asynchronous-testing)

## Synchronous Testing

Classic and typed have different Test Kits for synchronous testing.

Behaviors in Typed can be tested in isolation without having to be packaged into an actor. As a consequence, tests can run fully synchronously without having to worry about timeouts and spurious failures.

The `BehaviorTestKit` provides a nice way of unit testing a `Behavior` in a deterministic way, but it has some limitations to be aware of. Similar limitations exists for synchronous testing of classic actors.

Links to reference documentation:

- [Classic](../testing.html#sync-testing)
- [Typed](testing-sync.html#synchronous-behavior-testing)

## Code Examples

### Example 1: Dependencies

```scala
val AkkaVersion = "2.8.9"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-typed" % AkkaVersion
```

### Example 2: Dependencies

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
    <artifactId>akka-cluster-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.8.9")

  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}"
}
```

### Example 4: Actor definition

```scala
import akka.actor.Actor
import akka.actor.ActorLogging
import akka.actor.Props

object HelloWorld {
  final case class Greet(whom: String)
  final case class Greeted(whom: String)

  def props(): Props =
    Props(new HelloWorld)
}

class HelloWorld extends Actor with ActorLogging {
  import HelloWorld._

  override def receive: Receive = {
    case Greet(whom) =>
      log.info("Hello {}!", whom)
      sender() ! Greeted(whom)
  }
}
```

### Example 5: Actor definition

```java
import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class HelloWorld extends AbstractActor {

  public static final class Greet {
    public final String whom;

    public Greet(String whom) {
      this.whom = whom;
    }
  }

  public static final class Greeted {
    public final String whom;

    public Greeted(String whom) {
      this.whom = whom;
    }
  }

  public static Props props() {
    return Props.create(HelloWorld.class, HelloWorld::new);
  }

  private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(Greet.class, this::onGreet).build();
  }

  private void onGreet(Greet command) {
    log.info("Hello {}!", command.whom);
    getSender().tell(new Greeted(command.whom), getSelf());
  }
}
```

### Example 6: Actor definition

```scala
import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.AbstractBehavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors

object HelloWorld {
  final case class Greet(whom: String, replyTo: ActorRef[Greeted])
  final case class Greeted(whom: String, from: ActorRef[Greet])

  def apply(): Behavior[HelloWorld.Greet] =
    Behaviors.setup(context => new HelloWorld(context))
}

class HelloWorld(context: ActorContext[HelloWorld.Greet]) extends AbstractBehavior[HelloWorld.Greet](context) {
  import HelloWorld._

  override def onMessage(message: Greet): Behavior[Greet] = {
    context.log.info("Hello {}!", message.whom)
    message.replyTo ! Greeted(message.whom, context.self)
    this
  }
}
```

### Example 7: Actor definition

```java
import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld extends AbstractBehavior<HelloWorld.Greet> {

  public static final class Greet {
    public final String whom;
    public final ActorRef<Greeted> replyTo;

    public Greet(String whom, ActorRef<Greeted> replyTo) {
      this.whom = whom;
      this.replyTo = replyTo;
    }
  }

  public static final class Greeted {
    public final String whom;
    public final ActorRef<Greet> from;

    public Greeted(String whom, ActorRef<Greet> from) {
      this.whom = whom;
      this.from = from;
    }
  }

  public static Behavior<Greet> create() {
    return Behaviors.setup(HelloWorld::new);
  }

  private HelloWorld(ActorContext<Greet> context) {
    super(context);
  }

  @Override
  public Receive<Greet> createReceive() {
    return newReceiveBuilder().onMessage(Greet.class, this::onGreet).build();
  }

  private Behavior<Greet> onGreet(Greet command) {
    getContext().getLog().info("Hello {}!", command.whom);
    command.replyTo.tell(new Greeted(command.whom, getContext().getSelf()));
    return this;
  }
}
```

### Example 8: ActorContext.children

```scala
object Parent {
  sealed trait Command
  case class DelegateToChild(name: String, message: Child.Command) extends Command
  private case class ChildTerminated(name: String) extends Command

  def apply(): Behavior[Command] = {
    def updated(children: Map[String, ActorRef[Child.Command]]): Behavior[Command] = {
      Behaviors.receive { (context, command) =>
        command match {
          case DelegateToChild(name, childCommand) =>
            children.get(name) match {
              case Some(ref) =>
                ref ! childCommand
                Behaviors.same
              case None =>
                val ref = context.spawn(Child(), name)
                context.watchWith(ref, ChildTerminated(name))
                ref ! childCommand
                updated(children + (name -> ref))
            }

          case ChildTerminated(name) =>
            updated(children - name)
        }
      }
    }

    updated(Map.empty)
  }
}
```

### Example 9: ActorContext.children

```java
public class Parent extends AbstractBehavior<Parent.Command> {

  public interface Command {}

  public static class DelegateToChild implements Command {
    public final String name;
    public final Child.Command message;

    public DelegateToChild(String name, Child.Command message) {
      this.name = name;
      this.message = message;
    }
  }

  private static class ChildTerminated implements Command {
    final String name;

    ChildTerminated(String name) {
      this.name = name;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(Parent::new);
  }

  private Map<String, ActorRef<Child.Command>> children = new HashMap<>();

  private Parent(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(DelegateToChild.class, this::onDelegateToChild)
        .onMessage(ChildTerminated.class, this::onChildTerminated)
        .build();
  }

  private Behavior<Command> onDelegateToChild(DelegateToChild command) {
    ActorRef<Child.Command> ref = children.get(command.name);
    if (ref == null) {
      ref = getContext().spawn(Child.create(), command.name);
      getContext().watchWith(ref, new ChildTerminated(command.name));
      children.put(command.name, ref);
    }
    ref.tell(command.message);
    return this;
  }

  private Behavior<Command> onChildTerminated(ChildTerminated command) {
    children.remove(command.name);
    return this;
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.8/actors.html
- https://doc.akka.io/libraries/akka-core/2.8/fault-tolerance.html
- https://doc.akka.io/libraries/akka-core/2.8/fsm.html
- https://doc.akka.io/libraries/akka-core/2.8/persistence.html
- https://doc.akka.io/libraries/akka-core/2.8/routing.html
- https://doc.akka.io/libraries/akka-core/2.8/testing.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/actor-discovery.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/actor-lifecycle.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/fault-tolerance.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/from-classic.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/fsm.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/guide/tutorial_3.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/index-cluster.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/interaction-patterns.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/persistence.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/routers.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/stash.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/style-guide.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/testing-async.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/testing-sync.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.8/typed/from-classic.html](https://doc.akka.io/libraries/akka-core/2.8/typed/from-classic.html)*