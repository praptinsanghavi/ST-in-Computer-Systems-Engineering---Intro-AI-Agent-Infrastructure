---
description: The Actor model, managing internal state and changing behavior in Akka
  Actors.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:52Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/docs/akka/current/typed/actors.html
title: Introduction to Actors • Akka Documentation
---

# Introduction to Actors • Akka Documentation

> **Summary:** The Actor model, managing internal state and changing behavior in Akka Actors.

## Content

# Introduction to Actors

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Actors](../actors.html).

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

To use Akka Actors, add the following dependency in your project:

sbt
```
val AkkaVersion = "2.8.9"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test
)
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
    <artifactId>akka-actor-typed_${scala.binary.version}</artifactId>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor-testkit-typed_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-actor-typed_${versions.ScalaBinary}"
  testImplementation "com.typesafe.akka:akka-actor-testkit-typed_${versions.ScalaBinary}"
}
```

Both the Java and Scala DSLs of Akka modules are bundled in the same JAR. For a smooth development experience, when using an IDE such as Eclipse or IntelliJ, you can disable the auto\-importer from suggesting `javadsl` imports when working in Scala, or viceversa. See [IDE Tips](../additional/ide.html). 

| Project Info: Akka Actors (typed) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-actor\-typed 2\.8\.9 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Adopt OpenJDK 8Adopt OpenJDK 11 |
| Scala versions | 2\.13\.11, 2\.12\.18, 3\.2\.2 |
| JPMS module name | akka.actor.typed |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka/v2.8.9/LICENSE) |
| Readiness level | [Supported](https://developer.lightbend.com/docs/introduction/getting-help/support-terminology.html#supported), [Lightbend Subscription](https://www.lightbend.com/lightbend-subscription) provides support Since 2\.6\.0, 2019\-11\-06 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka/2.8.9/akka/actor/typed/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka/2.8.9/akka/actor/typed/package-summary.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io) [akka/akka Gitter channel](https://gitter.im/akka/akka) |
| Release notes | [akka.io blog](https://akka.io/blog/news-archive.html) |
| Issues | [Github issues](https://github.com/akka/akka/issues) |
| Sources | <https://github.com/akka/akka> |

## Akka Actors

The [Actor Model](https://en.wikipedia.org/wiki/Actor_model) provides a higher level of abstraction for writing concurrent and distributed systems. It alleviates the developer from having to deal with explicit locking and thread management, making it easier to write correct concurrent and parallel systems. Actors were defined in the 1973 paper by Carl Hewitt but have been popularized by the Erlang language, and used for example at Ericsson with great success to build highly concurrent and reliable telecom systems. The API of Akka’s Actors has borrowed some of its syntax from Erlang.

## First example

If you are new to Akka we recommend that you start with reading the [Getting Started Guide](guide/introduction.html) to get you started with a Mavensbt project with the needed dependencies and then come back here to learn more. We also recommend watching the short [introduction video to Akka actors](https://akka.io/blog/news/2019/12/03/akka-typed-actor-intro-video). 

It is helpful to become familiar with the foundational, external and internal ecosystem of your Actors, to see what you can leverage and customize as needed, see [Actor Systems](../general/actor-systems.html) and [Actor References, Paths and Addresses](../general/addressing.html).

As discussed in [Actor Systems](../general/actor-systems.html) Actors are about sending messages between independent units of computation, but what does that look like?

In all of the following these imports are assumed:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/IntroSpec.scala#L8-L10 "Go to snippet source")import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.LoggerOps
import akka.actor.typed.{ ActorRef, ActorSystem, Behavior }
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/IntroTest.java#L8-L15 "Go to snippet source")import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

```

With these in place we can define our first Actor, and it will say hello!

![hello-world1.png](./images/hello-world1.png)

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/IntroSpec.scala#L27-L39 "Go to snippet source")object HelloWorld {
  final case class Greet(whom: String, replyTo: ActorRef[Greeted])
  final case class Greeted(whom: String, from: ActorRef[Greet])

  def apply(): Behavior[Greet] = Behaviors.receive { (context, message) =>
    context.log.info("Hello {}!", message.whom)
    message.replyTo ! Greeted(message.whom, context.self)
    Behaviors.same
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/IntroTest.java#L31-L71 "Go to snippet source")public class HelloWorld extends AbstractBehavior<HelloWorld.Greet> {

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

This small piece of code defines two message types, one for commanding the Actor to greet someone and one that the Actor will use to confirm that it has done so. The `Greet` type contains not only the information of whom to greet, it also holds an [`ActorRef`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") that the sender of the message supplies so that the `HelloWorld` Actor can send back the confirmation message.

The behavior of the Actor is defined as the `Greeter` with the help of the [`receive`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/Behaviors.html#receive(akka.japi.function.Function2,akka.japi.function.Function2) "akka.actor.typed.javadsl.Behaviors")[`receive`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html#receive[T](onMessage:(akka.actor.typed.scaladsl.ActorContext[T],T)=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Receive[T] "akka.actor.typed.scaladsl.Behaviors") behavior factory. Processing the next message then results in a new behavior that can potentially be different from this one. State is updated by returning a new behavior that holds the new immutable state. In this case we don’t need to update any state, so we return [`same`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/Behaviors.html#same() "akka.actor.typed.javadsl.Behaviors")[`same`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html#same[T]:akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors"), which means the next behavior is “the same as the current one”.

The type of the messages handled by this behavior is declared to be of class `Greet`., meaning that `message` argument is also typed as such. This is why we can access the `whom` and `replyTo` members without needing to use a pattern match. Typically, an actor handles more than one specific message type where all of them directly or indirectly `extend``implement` a common `trait``interface`.

On the last line we see the `HelloWorld` Actor send a message to another Actor, which is done using the [`!`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRef.html#tell(msg:T):Unit "akka.actor.typed.ActorRef") operator (pronounced “bang” or “tell”)[`tell`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorRef.html#tell(T) "akka.actor.typed.ActorRef") method. It is an asynchronous operation that doesn’t block the caller’s thread.

Since the `replyTo` address is declared to be of type `ActorRef[Greeted]``ActorRef<Greeted>`, the compiler will only permit us to send messages of this type, other usage will be a compiler error.

The accepted message types of an Actor together with all reply types defines the protocol spoken by this Actor; in this case it is a simple request–reply protocol but Actors can model arbitrarily complex protocols when needed. The protocol is bundled together with the behavior that implements it in a nicely wrapped scope—the `HelloWorld` objectclass.

As Carl Hewitt said, one Actor is no Actor — it would be quite lonely with nobody to talk to. We need another Actor that interacts with the `Greeter`. Let’s make a `HelloWorldBot` that receives the reply from the `Greeter` and sends a number of additional greeting messages and collect the replies until a given max number of messages have been reached.

![hello-world2.png](./images/hello-world2.png)

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/IntroSpec.scala#L43-L63 "Go to snippet source")object HelloWorldBot {

  def apply(max: Int): Behavior[HelloWorld.Greeted] = {
    bot(0, max)
  }

  private def bot(greetingCounter: Int, max: Int): Behavior[HelloWorld.Greeted] =
    Behaviors.receive { (context, message) =>
      val n = greetingCounter + 1
      context.log.info2("Greeting {} for {}", n, message.whom)
      if (n == max) {
        Behaviors.stopped
      } else {
        message.from ! HelloWorld.Greet(message.whom, context.self)
        bot(n, max)
      }
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/IntroTest.java#L75-L104 "Go to snippet source")public class HelloWorldBot extends AbstractBehavior<HelloWorld.Greeted> {

  public static Behavior<HelloWorld.Greeted> create(int max) {
    return Behaviors.setup(context -> new HelloWorldBot(context, max));
  }

  private final int max;
  private int greetingCounter;

  private HelloWorldBot(ActorContext<HelloWorld.Greeted> context, int max) {
    super(context);
    this.max = max;
  }

  @Override
  public Receive<HelloWorld.Greeted> createReceive() {
    return newReceiveBuilder().onMessage(HelloWorld.Greeted.class, this::onGreeted).build();
  }

  private Behavior<HelloWorld.Greeted> onGreeted(HelloWorld.Greeted message) {
    greetingCounter++;
    getContext().getLog().info("Greeting {} for {}", greetingCounter, message.whom);
    if (greetingCounter == max) {
      return Behaviors.stopped();
    } else {
      message.from.tell(new HelloWorld.Greet(message.whom, getContext().getSelf()));
      return this;
    }
  }
}
```

Note how this Actor manages the counter by changing the behavior for each `Greeted` reply rather than using any variables.Note how this Actor manages the counter with an instance variable. No concurrency guards such as `synchronized` or [`AtomicInteger`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/atomic/AtomicInteger.html "java.util.concurrent.atomic.AtomicInteger") are needed since an actor instance processes one message at a time.

A third actor spawns the `Greeter` and the `HelloWorldBot` and starts the interaction between those.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/IntroSpec.scala#L67-L91 "Go to snippet source")object HelloWorldMain {

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
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/IntroTest.java#L109-L145 "Go to snippet source")public class HelloWorldMain extends AbstractBehavior<HelloWorldMain.SayHello> {

  public static class SayHello {
    public final String name;

    public SayHello(String name) {
      this.name = name;
    }
  }

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
    return newReceiveBuilder().onMessage(SayHello.class, this::onStart).build();
  }

  private Behavior<SayHello> onStart(SayHello command) {
    ActorRef<HelloWorld.Greeted> replyTo =
        getContext().spawn(HelloWorldBot.create(3), command.name);
    greeter.tell(new HelloWorld.Greet(command.name, replyTo));
    return this;
  }
}
```

Now we want to try out this Actor, so we must start an ActorSystem to host it:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/IntroSpec.scala#L235-L241 "Go to snippet source")  
val system: ActorSystem[HelloWorldMain.SayHello] =
  ActorSystem(HelloWorldMain(), "hello")

system ! HelloWorldMain.SayHello("World")
system ! HelloWorldMain.SayHello("Akka")

```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/IntroTest.java#L191-L195 "Go to snippet source")final ActorSystem<HelloWorldMain.SayHello> system =
    ActorSystem.create(HelloWorldMain.create(), "hello");

system.tell(new HelloWorldMain.SayHello("World"));
system.tell(new HelloWorldMain.SayHello("Akka"));
```

We start an Actor system from the defined `HelloWorldMain` behavior and send two `SayHello` messages that will kick\-off the interaction between two separate `HelloWorldBot` actors and the single `Greeter` actor.

An application normally consists of a single [`ActorSystem`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem"), running many actors, per JVM. 

The console output may look like this:

```
[INFO] [03/13/2018 15:50:05.814] [hello-akka.actor.default-dispatcher-4] [akka://hello/user/greeter] Hello World!
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-4] [akka://hello/user/greeter] Hello Akka!
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-2] [akka://hello/user/World] Greeting 1 for World
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-4] [akka://hello/user/Akka] Greeting 1 for Akka
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-5] [akka://hello/user/greeter] Hello World!
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-5] [akka://hello/user/greeter] Hello Akka!
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-4] [akka://hello/user/World] Greeting 2 for World
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-5] [akka://hello/user/greeter] Hello World!
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-4] [akka://hello/user/Akka] Greeting 2 for Akka
[INFO] [03/13/2018 15:50:05.816] [hello-akka.actor.default-dispatcher-5] [akka://hello/user/greeter] Hello Akka!
[INFO] [03/13/2018 15:50:05.816] [hello-akka.actor.default-dispatcher-4] [akka://hello/user/World] Greeting 3 for World
[INFO] [03/13/2018 15:50:05.816] [hello-akka.actor.default-dispatcher-6] [akka://hello/user/Akka] Greeting 3 for Akka

```

You will also need to add a [logging dependency](logging.html) to see that output when running.

## A More Complex Example

The next example is more realistic and demonstrates some important patterns:

- Using a sealed trait and case class/objectsan interface and classes implementing that interface to represent multiple messages an actor can receive
- Handle sessions by using child actors
- Handling state by changing behavior
- Using multiple actors to represent different parts of a protocol in a type safe way

![chat-room.png](./images/chat-room.png)

### Functional Style

First we will show this example in a functional style, and then the same example is shown with an [Object\-oriented style](actors.html#object-oriented-style). Which style you choose to use is a matter of taste and both styles can be mixed depending on which is best for a specific actor. Considerations for the choice is provided in the [Style Guide](style-guide.html#functional-versus-object-oriented-style).

Consider an Actor that runs a chat room: client Actors may connect by sending a message that contains their screen name and then they can post messages. The chat room Actor will disseminate all posted messages to all currently connected client Actors. The protocol definition could look like the following:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/IntroSpec.scala#L120-L176 "Go to snippet source")object ChatRoom {
  sealed trait RoomCommand
  final case class GetSession(screenName: String, replyTo: ActorRef[SessionEvent]) extends RoomCommand

  sealed trait SessionEvent
  final case class SessionGranted(handle: ActorRef[PostMessage]) extends SessionEvent
  final case class SessionDenied(reason: String) extends SessionEvent
  final case class MessagePosted(screenName: String, message: String) extends SessionEvent

  sealed trait SessionCommand
  final case class PostMessage(message: String) extends SessionCommand
  private final case class NotifyClient(message: MessagePosted) extends SessionCommand
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/IntroTest.java#L207-L276 "Go to snippet source")static interface RoomCommand {}

public static final class GetSession implements RoomCommand {
  public final String screenName;
  public final ActorRef<SessionEvent> replyTo;

  public GetSession(String screenName, ActorRef<SessionEvent> replyTo) {
    this.screenName = screenName;
    this.replyTo = replyTo;
  }
}

interface SessionEvent {}

public static final class SessionGranted implements SessionEvent {
  public final ActorRef<PostMessage> handle;

  public SessionGranted(ActorRef<PostMessage> handle) {
    this.handle = handle;
  }
}

public static final class SessionDenied implements SessionEvent {
  public final String reason;

  public SessionDenied(String reason) {
    this.reason = reason;
  }
}

public static final class MessagePosted implements SessionEvent {
  public final String screenName;
  public final String message;

  public MessagePosted(String screenName, String message) {
    this.screenName = screenName;
    this.message = message;
  }
}

interface SessionCommand {}

public static final class PostMessage implements SessionCommand {
  public final String message;

  public PostMessage(String message) {
    this.message = message;
  }
}

private static final class NotifyClient implements SessionCommand {
  final MessagePosted message;

  NotifyClient(MessagePosted message) {
    this.message = message;
  }
}
```

Initially the client Actors only get access to an [`ActorRef[GetSession]`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef<GetSession>`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") which allows them to make the first step. Once a client’s session has been established it gets a `SessionGranted` message that contains a `handle` to unlock the next protocol step, posting messages. The `PostMessage` command will need to be sent to this particular address that represents the session that has been added to the chat room. The other aspect of a session is that the client has revealed its own address, via the `replyTo` argument, so that subsequent `MessagePosted` events can be sent to it.

This illustrates how Actors can express more than just the equivalent of method calls on Java objects. The declared message types and their contents describe a full protocol that can involve multiple Actors and that can evolve over multiple steps. Here’s the implementation of the chat room protocol:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/IntroSpec.scala#L120-L176 "Go to snippet source")object ChatRoom {
  private final case class PublishSessionMessage(screenName: String, message: String) extends RoomCommand

  def apply(): Behavior[RoomCommand] =
    chatRoom(List.empty)

  private def chatRoom(sessions: List[ActorRef[SessionCommand]]): Behavior[RoomCommand] =
    Behaviors.receive { (context, message) =>
      message match {
        case GetSession(screenName, client) =>
          // create a child actor for further interaction with the client
          val ses = context.spawn(
            session(context.self, screenName, client),
            name = URLEncoder.encode(screenName, StandardCharsets.UTF_8.name))
          client ! SessionGranted(ses)
          chatRoom(ses :: sessions)
        case PublishSessionMessage(screenName, message) =>
          val notification = NotifyClient(MessagePosted(screenName, message))
          sessions.foreach(_ ! notification)
          Behaviors.same
      }
    }

  private def session(
      room: ActorRef[PublishSessionMessage],
      screenName: String,
      client: ActorRef[SessionEvent]): Behavior[SessionCommand] =
    Behaviors.receiveMessage {
      case PostMessage(message) =>
        // from client, publish to others via the room
        room ! PublishSessionMessage(screenName, message)
        Behaviors.same
      case NotifyClient(message) =>
        // published from the room
        client ! message
        Behaviors.same
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/IntroTest.java#L203-L344 "Go to snippet source")public class ChatRoom {
  private static final class PublishSessionMessage implements RoomCommand {
    public final String screenName;
    public final String message;

    public PublishSessionMessage(String screenName, String message) {
      this.screenName = screenName;
      this.message = message;
    }
  }

  public static Behavior<RoomCommand> create() {
    return Behaviors.setup(
        ctx -> new ChatRoom(ctx).chatRoom(new ArrayList<ActorRef<SessionCommand>>()));
  }

  private final ActorContext<RoomCommand> context;

  private ChatRoom(ActorContext<RoomCommand> context) {
    this.context = context;
  }

  private Behavior<RoomCommand> chatRoom(List<ActorRef<SessionCommand>> sessions) {
    return Behaviors.receive(RoomCommand.class)
        .onMessage(GetSession.class, getSession -> onGetSession(sessions, getSession))
        .onMessage(PublishSessionMessage.class, pub -> onPublishSessionMessage(sessions, pub))
        .build();
  }

  private Behavior<RoomCommand> onGetSession(
      List<ActorRef<SessionCommand>> sessions, GetSession getSession)
      throws UnsupportedEncodingException {
    ActorRef<SessionEvent> client = getSession.replyTo;
    ActorRef<SessionCommand> ses =
        context.spawn(
            Session.create(context.getSelf(), getSession.screenName, client),
            URLEncoder.encode(getSession.screenName, StandardCharsets.UTF_8.name()));
    // narrow to only expose PostMessage
    client.tell(new SessionGranted(ses.narrow()));
    List<ActorRef<SessionCommand>> newSessions = new ArrayList<>(sessions);
    newSessions.add(ses);
    return chatRoom(newSessions);
  }

  private Behavior<RoomCommand> onPublishSessionMessage(
      List<ActorRef<SessionCommand>> sessions, PublishSessionMessage pub) {
    NotifyClient notification =
        new NotifyClient((new MessagePosted(pub.screenName, pub.message)));
    sessions.forEach(s -> s.tell(notification));
    return Behaviors.same();
  }

  static class Session {
    static Behavior<ChatRoom.SessionCommand> create(
        ActorRef<RoomCommand> room, String screenName, ActorRef<SessionEvent> client) {
      return Behaviors.receive(ChatRoom.SessionCommand.class)
          .onMessage(PostMessage.class, post -> onPostMessage(room, screenName, post))
          .onMessage(NotifyClient.class, notification -> onNotifyClient(client, notification))
          .build();
    }

    private static Behavior<SessionCommand> onPostMessage(
        ActorRef<RoomCommand> room, String screenName, PostMessage post) {
      // from client, publish to others via the room
      room.tell(new PublishSessionMessage(screenName, post.message));
      return Behaviors.same();
    }

    private static Behavior<SessionCommand> onNotifyClient(
        ActorRef<SessionEvent> client, NotifyClient notification) {
      // published from the room
      client.tell(notification.message);
      return Behaviors.same();
    }
  }
}
```

The state is managed by changing behavior rather than using any variables.

When a new `GetSession` command comes in we add that client to the list that is in the returned behavior. Then we also need to create the session’s [`ActorRef`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") that will be used to post messages. In this case we want to create a very simple Actor that repackages the `PostMessage` command into a `PublishSessionMessage` command which also includes the screen name.

The behavior that we declare here can handle both subtypes of `RoomCommand`. `GetSession` has been explained already and the `PublishSessionMessage` commands coming from the session Actors will trigger the dissemination of the contained chat room message to all connected clients. But we do not want to give the ability to send `PublishSessionMessage` commands to arbitrary clients, we reserve that right to the internal session actors we create—otherwise clients could pose as completely different screen names (imagine the `GetSession` protocol to include authentication information to further secure this). Therefore `PublishSessionMessage` has `private` visibility and can’t be created outside the `ChatRoom` objectclass.

If we did not care about securing the correspondence between a session and a screen name then we could change the protocol such that `PostMessage` is removed and all clients just get an `ActorRef[PublishSessionMessage]``ActorRef<PublishSessionMessage>` to send to. In this case no session actor would be needed and we could use `context.self``context.getSelf()`. The type\-checks work out in that case because [`ActorRef[-T]`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef<-T>`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef<T>`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef<T>`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") is contravariant in its type parameter, meaning that we can use a `ActorRef[RoomCommand]``ActorRef<RoomCommand>` wherever an `ActorRef[PublishSessionMessage]``ActorRef<PublishSessionMessage>` is needed—this makes sense because the former simply speaks more languages than the latter. The opposite would be problematic, so passing an `ActorRef[PublishSessionMessage]``ActorRef<PublishSessionMessage>` where `ActorRef[RoomCommand]``ActorRef<RoomCommand>` is required will lead to a type error.

#### Trying it out

In order to see this chat room in action we need to write a client Actor that can use it:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/IntroSpec.scala#L181-L201 "Go to snippet source")object Gabbler {
  import ChatRoom._

  def apply(): Behavior[SessionEvent] =
    Behaviors.setup { context =>
      Behaviors.receiveMessage {
        case SessionGranted(handle) =>
          handle ! PostMessage("Hello World!")
          Behaviors.same
        case MessagePosted(screenName, message) =>
          context.log.info2("message has been posted by '{}': {}", screenName, message)
          Behaviors.stopped
      }
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/IntroTest.java#L348-L383 "Go to snippet source")public class Gabbler {
  public static Behavior<ChatRoom.SessionEvent> create() {
    return Behaviors.setup(ctx -> new Gabbler(ctx).behavior());
  }

  private final ActorContext<ChatRoom.SessionEvent> context;

  private Gabbler(ActorContext<ChatRoom.SessionEvent> context) {
    this.context = context;
  }

  private Behavior<ChatRoom.SessionEvent> behavior() {
    return Behaviors.receive(ChatRoom.SessionEvent.class)
        .onMessage(ChatRoom.SessionDenied.class, this::onSessionDenied)
        .onMessage(ChatRoom.SessionGranted.class, this::onSessionGranted)
        .onMessage(ChatRoom.MessagePosted.class, this::onMessagePosted)
        .build();
  }

  private Behavior<ChatRoom.SessionEvent> onSessionDenied(ChatRoom.SessionDenied message) {
    context.getLog().info("cannot start chat room session: {}", message.reason);
    return Behaviors.stopped();
  }

  private Behavior<ChatRoom.SessionEvent> onSessionGranted(ChatRoom.SessionGranted message) {
    message.handle.tell(new ChatRoom.PostMessage("Hello World!"));
    return Behaviors.same();
  }

  private Behavior<ChatRoom.SessionEvent> onMessagePosted(ChatRoom.MessagePosted message) {
    context
        .getLog()
        .info("message has been posted by '{}': {}", message.screenName, message.message);
    return Behaviors.stopped();
  }
}
```

From this behavior we can create an Actor that will accept a chat room session, post a message, wait to see it published, and then terminate. The last step requires the ability to change behavior, we need to transition from the normal running behavior into the terminated state. This is why here we do not return [`same`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/Behaviors.html#same() "akka.actor.typed.javadsl.Behaviors")[`same`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html#same[T]:akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors"), as above, but another special value [`stopped`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/Behaviors.html#stopped() "akka.actor.typed.javadsl.Behaviors")[`stopped`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html#stopped[T]:akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors").

Since `SessionEvent` is a sealed trait the Scala compiler will warn us if we forget to handle one of the subtypes; in this case it reminded us that alternatively to `SessionGranted` we may also receive a `SessionDenied` event.

Now to try things out we must start both a chat room and a gabbler and of course we do this inside an Actor system. Since there can be only one user guardian we could either start the chat room from the gabbler (which we don’t want—it complicates its logic) or the gabbler from the chat room (which is nonsensical) or we start both of them from a third Actor—our only sensible choice:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/IntroSpec.scala#L205-L223 "Go to snippet source")object Main {
  def apply(): Behavior[NotUsed] =
    Behaviors.setup { context =>
      val chatRoom = context.spawn(ChatRoom(), "chatroom")
      val gabblerRef = context.spawn(Gabbler(), "gabbler")
      context.watch(gabblerRef)
      chatRoom ! ChatRoom.GetSession("ol’ Gabbler", gabblerRef)

      Behaviors.receiveSignal {
        case (_, Terminated(_)) =>
          Behaviors.stopped
      }
    }

  def main(args: Array[String]): Unit = {
    ActorSystem(Main(), "ChatRoomDemo")
  }

}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/IntroTest.java#L387-L405 "Go to snippet source")public class Main {
  public static Behavior<Void> create() {
    return Behaviors.setup(
        context -> {
          ActorRef<ChatRoom.RoomCommand> chatRoom = context.spawn(ChatRoom.create(), "chatRoom");
          ActorRef<ChatRoom.SessionEvent> gabbler = context.spawn(Gabbler.create(), "gabbler");
          context.watch(gabbler);
          chatRoom.tell(new ChatRoom.GetSession("ol’ Gabbler", gabbler));

          return Behaviors.receive(Void.class)
              .onSignal(Terminated.class, sig -> Behaviors.stopped())
              .build();
        });
  }

  public static void main(String[] args) {
    ActorSystem.create(Main.create(), "ChatRoomDemo");
  }
}
```

In good tradition we call the `Main` Actor what it is, it directly corresponds to the `main` method in a traditional Java application. This Actor will perform its job on its own accord, we do not need to send messages from the outside, so we declare it to be of type [`NotUsed`](https://doc.akka.io/api/akka/2.8/akka/NotUsed.html "akka.NotUsed")[`Void`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Void.html "java.lang.Void"). Actors receive not only external messages, they also are notified of certain system events, so\-called Signals. In order to get access to those we choose to implement this particular one using the [`receive`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/Behaviors.html#receive(akka.japi.function.Function2) "akka.actor.typed.javadsl.Behaviors")[`receive`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html#receive[T](onMessage:(akka.actor.typed.scaladsl.ActorContext[T],T)=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Receive[T] "akka.actor.typed.scaladsl.Behaviors") behavior decorator. The provided `onSignal` function will be invoked for signals (subclasses of [`Signal`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/Signal.html "akka.actor.typed.Signal")[`Signal`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Signal.html "akka.actor.typed.Signal")) or the `onMessage` function for user messages.

This particular `Main` Actor is created using [`Behaviors.setup`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/Behaviors.html#setup(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.setup`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors"), which is like a factory for a behavior. Creation of the behavior instance is deferred until the actor is started, as opposed to [`Behaviors.receive`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/Behaviors.html#receive(akka.japi.function.Function2) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.receive`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html#receive[T](onMessage:(akka.actor.typed.scaladsl.ActorContext[T],T)=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Receive[T] "akka.actor.typed.scaladsl.Behaviors") that creates the behavior instance immediately before the actor is running. The factory function in `setup` is passed the [`ActorContext`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/ActorContext.html "akka.actor.typed.javadsl.ActorContext")[`ActorContext`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/ActorContext.html "akka.actor.typed.scaladsl.ActorContext") as parameter and that can for example be used for spawning child actors. This `Main` Actor creates the chat room and the gabbler and the session between them is initiated, and when the gabbler is finished we will receive the [`Terminated`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated")[`Terminated`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated") event due to having called [`context.watch`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/ActorContext.html#watch(akka.actor.typed.ActorRef) "akka.actor.typed.javadsl.ActorContext")[`context.watch`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/ActorContext.html#watch[U](other:akka.actor.typed.ActorRef[U]):Unit "akka.actor.typed.scaladsl.ActorContext") for it. This allows us to shut down the Actor system: when the `Main` Actor terminates there is nothing more to do.

Therefore after creating the Actor system with the `Main` Actor’s [`Behavior`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") we can let the `main` method return, the [`ActorSystem`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") will continue running and the JVM alive until the root actor stops.

### Object\-oriented style

The above sample used the functional programming style where you pass a function to a factory which then constructs a behavior, for stateful actors this means passing immutable state around as parameters and switching to a new behavior whenever you need to act on a changed state. An alternative way to express the same is a more object oriented style where a concrete class for the actor behavior is defined and mutable state is kept inside of it as fields.

Which style you choose to use is a matter of taste and both styles can be mixed depending on which is best for a specific actor. Considerations for the choice is provided in the [Style Guide](style-guide.html#functional-versus-object-oriented-style).

#### AbstractBehavior API

Defining a class based actor behavior starts with extending [`AbstractBehavior`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/AbstractBehavior.html "akka.actor.typed.javadsl.AbstractBehavior")[`AbstractBehavior`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/AbstractBehavior.html "akka.actor.typed.scaladsl.AbstractBehavior")`<T>``[T]` where `T` is the type of messages the behavior will accept.

Let’s repeat the chat room sample from [A more complex example above](actors.html#a-more-complex-example) but implemented using `AbstractBehavior`. The protocol for interacting with the actor looks the same:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/OOIntroSpec.scala#L27-L100 "Go to snippet source")object ChatRoom {
  sealed trait RoomCommand
  final case class GetSession(screenName: String, replyTo: ActorRef[SessionEvent]) extends RoomCommand

  sealed trait SessionEvent
  final case class SessionGranted(handle: ActorRef[PostMessage]) extends SessionEvent
  final case class SessionDenied(reason: String) extends SessionEvent
  final case class MessagePosted(screenName: String, message: String) extends SessionEvent

  sealed trait SessionCommand
  final case class PostMessage(message: String) extends SessionCommand
  private final case class NotifyClient(message: MessagePosted) extends SessionCommand
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/OOIntroTest.java#L33-L102 "Go to snippet source")static interface RoomCommand {}

public static final class GetSession implements RoomCommand {
  public final String screenName;
  public final ActorRef<SessionEvent> replyTo;

  public GetSession(String screenName, ActorRef<SessionEvent> replyTo) {
    this.screenName = screenName;
    this.replyTo = replyTo;
  }
}

static interface SessionEvent {}

public static final class SessionGranted implements SessionEvent {
  public final ActorRef<PostMessage> handle;

  public SessionGranted(ActorRef<PostMessage> handle) {
    this.handle = handle;
  }
}

public static final class SessionDenied implements SessionEvent {
  public final String reason;

  public SessionDenied(String reason) {
    this.reason = reason;
  }
}

public static final class MessagePosted implements SessionEvent {
  public final String screenName;
  public final String message;

  public MessagePosted(String screenName, String message) {
    this.screenName = screenName;
    this.message = message;
  }
}

static interface SessionCommand {}

public static final class PostMessage implements SessionCommand {
  public final String message;

  public PostMessage(String message) {
    this.message = message;
  }
}

private static final class NotifyClient implements SessionCommand {
  final MessagePosted message;

  NotifyClient(MessagePosted message) {
    this.message = message;
  }
}
```

Initially the client Actors only get access to an `ActorRef[GetSession]``ActorRef<GetSession>` which allows them to make the first step. Once a client’s session has been established it gets a `SessionGranted` message that contains a `handle` to unlock the next protocol step, posting messages. The `PostMessage` command will need to be sent to this particular address that represents the session that has been added to the chat room. The other aspect of a session is that the client has revealed its own address, via the `replyTo` argument, so that subsequent `MessagePosted` events can be sent to it.

This illustrates how Actors can express more than just the equivalent of method calls on Java objects. The declared message types and their contents describe a full protocol that can involve multiple Actors and that can evolve over multiple steps. Here’s the `AbstractBehavior` implementation of the chat room protocol:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/OOIntroSpec.scala#L27-L100 "Go to snippet source")object ChatRoom {
  private final case class PublishSessionMessage(screenName: String, message: String) extends RoomCommand

  def apply(): Behavior[RoomCommand] =
    Behaviors.setup(context => new ChatRoomBehavior(context))

  class ChatRoomBehavior(context: ActorContext[RoomCommand]) extends AbstractBehavior[RoomCommand](context) {
    private var sessions: List[ActorRef[SessionCommand]] = List.empty

    override def onMessage(message: RoomCommand): Behavior[RoomCommand] = {
      message match {
        case GetSession(screenName, client) =>
          // create a child actor for further interaction with the client
          val ses = context.spawn(
            SessionBehavior(context.self, screenName, client),
            name = URLEncoder.encode(screenName, StandardCharsets.UTF_8.name))
          client ! SessionGranted(ses)
          sessions = ses :: sessions
          this
        case PublishSessionMessage(screenName, message) =>
          val notification = NotifyClient(MessagePosted(screenName, message))
          sessions.foreach(_ ! notification)
          this
      }
    }
  }

  private object SessionBehavior {
    def apply(
        room: ActorRef[PublishSessionMessage],
        screenName: String,
        client: ActorRef[SessionEvent]): Behavior[SessionCommand] =
      Behaviors.setup(ctx => new SessionBehavior(ctx, room, screenName, client))
  }

  private class SessionBehavior(
      context: ActorContext[SessionCommand],
      room: ActorRef[PublishSessionMessage],
      screenName: String,
      client: ActorRef[SessionEvent])
      extends AbstractBehavior[SessionCommand](context) {

    override def onMessage(msg: SessionCommand): Behavior[SessionCommand] =
      msg match {
        case PostMessage(message) =>
          // from client, publish to others via the room
          room ! PublishSessionMessage(screenName, message)
          Behaviors.same
        case NotifyClient(message) =>
          // published from the room
          client ! message
          Behaviors.same
      }
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/OOIntroTest.java#L30-L190 "Go to snippet source")public class ChatRoom {
  private static final class PublishSessionMessage implements RoomCommand {
    public final String screenName;
    public final String message;

    public PublishSessionMessage(String screenName, String message) {
      this.screenName = screenName;
      this.message = message;
    }
  }

  public static Behavior<RoomCommand> create() {
    return Behaviors.setup(ChatRoomBehavior::new);
  }

  public static class ChatRoomBehavior extends AbstractBehavior<RoomCommand> {
    final List<ActorRef<SessionCommand>> sessions = new ArrayList<>();

    private ChatRoomBehavior(ActorContext<RoomCommand> context) {
      super(context);
    }

    @Override
    public Receive<RoomCommand> createReceive() {
      ReceiveBuilder<RoomCommand> builder = newReceiveBuilder();

      builder.onMessage(GetSession.class, this::onGetSession);
      builder.onMessage(PublishSessionMessage.class, this::onPublishSessionMessage);

      return builder.build();
    }

    private Behavior<RoomCommand> onGetSession(GetSession getSession)
        throws UnsupportedEncodingException {
      ActorRef<SessionEvent> client = getSession.replyTo;
      ActorRef<SessionCommand> ses =
          getContext()
              .spawn(
                  SessionBehavior.create(getContext().getSelf(), getSession.screenName, client),
                  URLEncoder.encode(getSession.screenName, StandardCharsets.UTF_8.name()));
      // narrow to only expose PostMessage
      client.tell(new SessionGranted(ses.narrow()));
      sessions.add(ses);
      return this;
    }

    private Behavior<RoomCommand> onPublishSessionMessage(PublishSessionMessage pub) {
      NotifyClient notification =
          new NotifyClient((new MessagePosted(pub.screenName, pub.message)));
      sessions.forEach(s -> s.tell(notification));
      return this;
    }
  }

  static class SessionBehavior extends AbstractBehavior<ChatRoom.SessionCommand> {
    private final ActorRef<RoomCommand> room;
    private final String screenName;
    private final ActorRef<SessionEvent> client;

    public static Behavior<ChatRoom.SessionCommand> create(
        ActorRef<RoomCommand> room, String screenName, ActorRef<SessionEvent> client) {
      return Behaviors.setup(context -> new SessionBehavior(context, room, screenName, client));
    }

    private SessionBehavior(
        ActorContext<ChatRoom.SessionCommand> context,
        ActorRef<RoomCommand> room,
        String screenName,
        ActorRef<SessionEvent> client) {
      super(context);
      this.room = room;
      this.screenName = screenName;
      this.client = client;
    }

    @Override
    public Receive<SessionCommand> createReceive() {
      return newReceiveBuilder()
          .onMessage(PostMessage.class, this::onPostMessage)
          .onMessage(NotifyClient.class, this::onNotifyClient)
          .build();
    }

    private Behavior<SessionCommand> onPostMessage(PostMessage post) {
      // from client, publish to others via the room
      room.tell(new PublishSessionMessage(screenName, post.message));
      return Behaviors.same();
    }

    private Behavior<SessionCommand> onNotifyClient(NotifyClient notification) {
      // published from the room
      client.tell(notification.message);
      return Behaviors.same();
    }
  }
}
```

The state is managed through fields in the class, just like with a regular object oriented class. As the state is mutable, we never return a different behavior from the message logic, but can return the `AbstractBehavior` instance itself (`this`) as a behavior to use for processing the next message coming in. We could also return [`Behaviors.same`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/Behaviors.html#same() "akka.actor.typed.javadsl.Behaviors")[`Behaviors.same`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html#same[T]:akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") to achieve the same.

In this sample we make separate statements for creating the behavior builder, but it also returns the builder itself from each step so a more fluent behavior definition style is also possible. What you should prefer depends on how big the set of messages the actor accepts is.

It is also possible to return a new different `AbstractBehavior`, for example to represent a different state in a finite state machine (FSM), or use one of the functional behavior factories to combine the object oriented with the functional style for different parts of the lifecycle of the same Actor behavior.

When a new `GetSession` command comes in we add that client to the list of current sessions. Then we also need to create the session’s [`ActorRef`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") that will be used to post messages. In this case we want to create a very simple Actor that repackages the `PostMessage` command into a `PublishSessionMessage` command which also includes the screen name.

To implement the logic where we spawn a child for the session we need access to the [`ActorContext`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/ActorContext.html "akka.actor.typed.javadsl.ActorContext")[`ActorContext`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/ActorContext.html "akka.actor.typed.scaladsl.ActorContext"). This is injected as a constructor parameter upon creation of the behavior, note how we combine the [`AbstractBehavior`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/AbstractBehavior.html "akka.actor.typed.javadsl.AbstractBehavior")[`AbstractBehavior`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/AbstractBehavior.html "akka.actor.typed.scaladsl.AbstractBehavior") with [`Behaviors.setup`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/Behaviors.html#setup(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.setup`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") to do this in the `apply``create` factory method.

The behavior that we declare here can handle both subtypes of `RoomCommand`. `GetSession` has been explained already and the `PublishSessionMessage` commands coming from the session Actors will trigger the dissemination of the contained chat room message to all connected clients. But we do not want to give the ability to send `PublishSessionMessage` commands to arbitrary clients, we reserve that right to the internal session actors we create—otherwise clients could pose as completely different screen names (imagine the `GetSession` protocol to include authentication information to further secure this). Therefore `PublishSessionMessage` has `private` visibility and can’t be created outside the `ChatRoom` objectclass.

If we did not care about securing the correspondence between a session and a screen name then we could change the protocol such that `PostMessage` is removed and all clients just get an `ActorRef[PublishSessionMessage]``ActorRef<PublishSessionMessage>` to send to. In this case no session actor would be needed and we could use [`context.self`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/ActorContext.html#self:akka.actor.typed.ActorRef[T] "akka.actor.typed.scaladsl.ActorContext")[`context.getSelf()`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/ActorContext.html#getSelf() "akka.actor.typed.javadsl.ActorContext"). The type\-checks work out in that case because `ActorRef[-T]``ActorRef<T>` is contravariant in its type parameter, meaning that we can use a `ActorRef[RoomCommand]``ActorRef<RoomCommand>` wherever an `ActorRef[PublishSessionMessage]``ActorRef<PublishSessionMessage>` is needed—this makes sense because the former simply speaks more languages than the latter. The opposite would be problematic, so passing an `ActorRef[PublishSessionMessage]``ActorRef<PublishSessionMessage>` where `ActorRef[RoomCommand]``ActorRef<RoomCommand>` is required will lead to a type error.

#### AbstractOnMessageBehavior API

The `AbstractBehavior` API makes use of a builder on receipt of the first message by the actor. The `Receive` built by this builder performs `instanceof` checks and casts “behind the scenes”. Pattern\-matching features introduced in Java 17 and refined in subsequent versions improve the ergonomics of expressing this logic directly in code. Users of other JVM languages (such as Kotlin) may also prefer to not use a builder while using the Java DSL (note that the Scala DSL’s `AbstractBehavior` does not make use of builders).

To support this “direct” style, an alternative API for defining behavior in an object\-oriented style is available by extending [`AbstractOnMessageBehavior`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html "akka.actor.typed.javadsl.AbstractOnMessageBehavior") and implementing the [`onMessage`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#onMessage(T) "akka.actor.typed.javadsl.AbstractOnMessageBehavior") method.

Here’s the `AbstractOnMessageBehavior`\-based implementation of the chat room protocol:

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/OnMessageIntroTest.java#L31-L245 "Go to snippet source")public class ChatRoom {

  public static Behavior<RoomCommand> create() {
    return Behaviors.setup(ChatRoomBehavior::new);
  }

  public static class ChatRoomBehavior extends AbstractOnMessageBehavior<RoomCommand> {
    final List<ActorRef<SessionCommand>> sessions = new ArrayList<>();

    private ChatRoomBehavior(ActorContext<RoomCommand> context) {
      super(context);
    }

    @Override
    public Behavior<RoomCommand> onMessage(RoomCommand msg) throws UnsupportedEncodingException {
      // uses Java 17-onward features
      switch(msg) {
        // NB: JEP 409 (https://openjdk.org/jeps/409) may allow not including a default clause
        case GetSession gs:
          return onGetSession(gs);

        case PublishSessionMessage psm:
          return onPublishSessionMessage(psm);

        default:
          // for completeness, should never happen
      }
      return Behaviors.unhandled();
    }

    private Behavior<RoomCommand> onGetSession(GetSession gs)
        throws UnsupportedEncodingException {
      ActorRef<SessionEvent> client = gs.replyTo;
      ActorRef<SessionCommand> ses =
          getContext()
              .spawn(
                  SessionBehavior.create(getContext().getSelf(), gs.screenName, client),
                  URLEncoder.encode(gs.screenName, StandardCharsets.UTF_8.name()));

      // narrow to only expose PostMessage
      client.tell(new SessionGranted(ses.narrow()));
      sessions.add(ses);

      return this;
    }

    private Behavior<RoomCommand> onPublishSessionMessage(PublishSessionMessage pub) {
      NotifyClient notification =
          new NotifyClient(new MessagePosted(pub.screenName, pub.message));

      sessions.forEach(s -> s.tell(notification));
      return this;
    }
  }

  static class SessionBehavior extends AbstractOnMessageBehavior<SessionCommand> {
    private final ActorRef<RoomCommand> room;
    private final String screenName;
    private final ActorRef<SessionEvent> client;

    public static Behavior<SessionCommand> create(
        ActorRef<RoomCommand> room, String screenName, ActorRef<SessionEvent> client) {
      return Behaviors.setup(context -> new SessionBehavior(context, room, screenName, client));
    }

    private SessionBehavior(
        ActorContext<SessionCommand> context,
        ActorRef<RoomCommand> room,
        String screenName,
        ActorRef<SessionEvent> client) {
      super(context);
      this.room = room;
      this.screenName = screenName;
      this.client = client;
    }

    @Override
    public Behavior<SessionCommand> onMessage(SessionCommand msg) {
      switch (msg) {
        case PostMessage pm:
          // from client, publish to others via the room
          room.tell(new PublishSessionMessage(screenName, pm.message);
          return Behaviors.same();

        case NotifyClient nc:
          // published from the room
          client.tell(nc.message);
          return Behaviors.same();

        default:
          // for completeness, should never happen
      }

      return Behaviors.unhandled();
    }
  }
}
```

#### Try it out

In order to see this chat room in action we need to write a client Actor that can use it , for this stateless actor it doesn’t make much sense to use the `AbstractBehavior` so let’s just reuse the functional style gabbler from the sample above:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/OOIntroSpec.scala#L105-L121 "Go to snippet source")object Gabbler {
  import ChatRoom._

  def apply(): Behavior[SessionEvent] =
    Behaviors.setup { context =>
      Behaviors.receiveMessage {
        case SessionDenied(reason) =>
          context.log.info("cannot start chat room session: {}", reason)
          Behaviors.stopped
        case SessionGranted(handle) =>
          handle ! PostMessage("Hello World!")
          Behaviors.same
        case MessagePosted(screenName, message) =>
          context.log.info2("message has been posted by '{}': {}", screenName, message)
          Behaviors.stopped
      }
    }
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/OOIntroTest.java#L194-L229 "Go to snippet source")public class Gabbler extends AbstractBehavior<ChatRoom.SessionEvent> {
  public static Behavior<ChatRoom.SessionEvent> create() {
    return Behaviors.setup(Gabbler::new);
  }

  private Gabbler(ActorContext<ChatRoom.SessionEvent> context) {
    super(context);
  }

  @Override
  public Receive<ChatRoom.SessionEvent> createReceive() {
    ReceiveBuilder<ChatRoom.SessionEvent> builder = newReceiveBuilder();
    return builder
        .onMessage(ChatRoom.SessionDenied.class, this::onSessionDenied)
        .onMessage(ChatRoom.SessionGranted.class, this::onSessionGranted)
        .onMessage(ChatRoom.MessagePosted.class, this::onMessagePosted)
        .build();
  }

  private Behavior<ChatRoom.SessionEvent> onSessionDenied(ChatRoom.SessionDenied message) {
    getContext().getLog().info("cannot start chat room session: {}", message.reason);
    return Behaviors.stopped();
  }

  private Behavior<ChatRoom.SessionEvent> onSessionGranted(ChatRoom.SessionGranted message) {
    message.handle.tell(new ChatRoom.PostMessage("Hello World!"));
    return Behaviors.same();
  }

  private Behavior<ChatRoom.SessionEvent> onMessagePosted(ChatRoom.MessagePosted message) {
    getContext()
        .getLog()
        .info("message has been posted by '{}': {}", message.screenName, message.message);
    return Behaviors.stopped();
  }
}
```

Now to try things out we must start both a chat room and a gabbler and of course we do this inside an Actor system. Since there can be only one user guardian we could either start the chat room from the gabbler (which we don’t want—it complicates its logic) or the gabbler from the chat room (which is nonsensical) or we start both of them from a third Actor—our only sensible choice:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/scala/docs/akka/typed/OOIntroSpec.scala#L126-L144 "Go to snippet source")object Main {
  def apply(): Behavior[NotUsed] =
    Behaviors.setup { context =>
      val chatRoom = context.spawn(ChatRoom(), "chatroom")
      val gabblerRef = context.spawn(Gabbler(), "gabbler")
      context.watch(gabblerRef)
      chatRoom ! ChatRoom.GetSession("ol’ Gabbler", gabblerRef)

      Behaviors.receiveSignal {
        case (_, Terminated(_)) =>
          Behaviors.stopped
      }
    }

  def main(args: Array[String]): Unit = {
    ActorSystem(Main(), "ChatRoomDemo")
  }

}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/OOIntroTest.java#L233-L251 "Go to snippet source")public class Main {
  public static Behavior<Void> create() {
    return Behaviors.setup(
        context -> {
          ActorRef<ChatRoom.RoomCommand> chatRoom = context.spawn(ChatRoom.create(), "chatRoom");
          ActorRef<ChatRoom.SessionEvent> gabbler = context.spawn(Gabbler.create(), "gabbler");
          context.watch(gabbler);
          chatRoom.tell(new ChatRoom.GetSession("ol’ Gabbler", gabbler));

          return Behaviors.receive(Void.class)
              .onSignal(Terminated.class, sig -> Behaviors.stopped())
              .build();
        });
  }

  public static void main(String[] args) {
    ActorSystem.create(Main.create(), "ChatRoomDemo");
  }
}
```

In good tradition we call the `Main` Actor what it is, it directly corresponds to the `main` method in a traditional Java application. This Actor will perform its job on its own accord, we do not need to send messages from the outside, so we declare it to be of type [`NotUsed`](https://doc.akka.io/api/akka/2.8/akka/NotUsed.html "akka.NotUsed")[`Void`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Void.html "java.lang.Void"). Actors receive not only external messages, they also are notified of certain system events, so\-called Signals. In order to get access to those we choose to implement this particular one using the [`receive`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/Behaviors.html#receive(akka.japi.function.Function2) "akka.actor.typed.javadsl.Behaviors")[`receive`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html#receive[T](onMessage:(akka.actor.typed.scaladsl.ActorContext[T],T)=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Receive[T] "akka.actor.typed.scaladsl.Behaviors") behavior decorator. The provided `onSignal` function will be invoked for signals (subclasses of [`Signal`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/Signal.html "akka.actor.typed.Signal")[`Signal`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Signal.html "akka.actor.typed.Signal")) or the `onMessage` function for user messages.

This particular `Main` Actor is created using [`Behaviors.setup`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/Behaviors.html#setup(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.setup`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors"), which is like a factory for a behavior. Creation of the behavior instance is deferred until the actor is started, as opposed to [`Behaviors.receive`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/Behaviors.html#receive(akka.japi.function.Function2) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.receive`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html#receive[T](onMessage:(akka.actor.typed.scaladsl.ActorContext[T],T)=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Receive[T] "akka.actor.typed.scaladsl.Behaviors") that creates the behavior instance immediately before the actor is running. The factory function in `setup` is passed the [`ActorContext`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/ActorContext.html "akka.actor.typed.javadsl.ActorContext")[`ActorContext`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/ActorContext.html "akka.actor.typed.scaladsl.ActorContext") as parameter and that can for example be used for spawning child actors. This `Main` Actor creates the chat room and the gabbler and the session between them is initiated, and when the gabbler is finished we will receive the [`Terminated`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated")[`Terminated`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated") event due to having called [`context.watch`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/ActorContext.html#watch(akka.actor.typed.ActorRef) "akka.actor.typed.javadsl.ActorContext")[`context.watch`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/ActorContext.html#watch[U](other:akka.actor.typed.ActorRef[U]):Unit "akka.actor.typed.scaladsl.ActorContext") for it. This allows us to shut down the Actor system: when the `Main` Actor terminates there is nothing more to do.

Therefore after creating the Actor system with the `Main` Actor’s [`Behavior`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") we can let the `main` method return, the [`ActorSystem`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") will continue running and the JVM alive until the root actor stops.

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
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test
)
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
    <artifactId>akka-actor-typed_${scala.binary.version}</artifactId>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor-testkit-typed_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-actor-typed_${versions.ScalaBinary}"
  testImplementation "com.typesafe.akka:akka-actor-testkit-typed_${versions.ScalaBinary}"
}
```

### Example 7: First example

```scala
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.LoggerOps
import akka.actor.typed.{ ActorRef, ActorSystem, Behavior }
```

### Example 8: First example

```java
import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
```

### Example 9: First example

```scala
object HelloWorld {
  final case class Greet(whom: String, replyTo: ActorRef[Greeted])
  final case class Greeted(whom: String, from: ActorRef[Greet])

  def apply(): Behavior[Greet] = Behaviors.receive { (context, message) =>
    context.log.info("Hello {}!", message.whom)
    message.replyTo ! Greeted(message.whom, context.self)
    Behaviors.same
  }
}
```

### Example 10: First example

```java
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

### Example 11: First example

```scala
object HelloWorldBot {

  def apply(max: Int): Behavior[HelloWorld.Greeted] = {
    bot(0, max)
  }

  private def bot(greetingCounter: Int, max: Int): Behavior[HelloWorld.Greeted] =
    Behaviors.receive { (context, message) =>
      val n = greetingCounter + 1
      context.log.info2("Greeting {} for {}", n, message.whom)
      if (n == max) {
        Behaviors.stopped
      } else {
        message.from ! HelloWorld.Greet(message.whom, context.self)
        bot(n, max)
      }
    }
}
```

### Example 12: First example

```java
public class HelloWorldBot extends AbstractBehavior<HelloWorld.Greeted> {

  public static Behavior<HelloWorld.Greeted> create(int max) {
    return Behaviors.setup(context -> new HelloWorldBot(context, max));
  }

  private final int max;
  private int greetingCounter;

  private HelloWorldBot(ActorContext<HelloWorld.Greeted> context, int max) {
    super(context);
    this.max = max;
  }

  @Override
  public Receive<HelloWorld.Greeted> createReceive() {
    return newReceiveBuilder().onMessage(HelloWorld.Greeted.class, this::onGreeted).build();
  }

  private Behavior<HelloWorld.Greeted> onGreeted(HelloWorld.Greeted message) {
    greetingCounter++;
    getContext().getLog().info("Greeting {} for {}", greetingCounter, message.whom);
    if (greetingCounter == max) {
      return Behaviors.stopped();
    } else {
      message.from.tell(new HelloWorld.Greet(message.whom, getContext().getSelf()));
      return this;
    }
  }
}
```

### Example 13: First example

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

### Example 14: First example

```java
public class HelloWorldMain extends AbstractBehavior<HelloWorldMain.SayHello> {

  public static class SayHello {
    public final String name;

    public SayHello(String name) {
      this.name = name;
    }
  }

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
    return newReceiveBuilder().onMessage(SayHello.class, this::onStart).build();
  }

  private Behavior<SayHello> onStart(SayHello command) {
    ActorRef<HelloWorld.Greeted> replyTo =
        getContext().spawn(HelloWorldBot.create(3), command.name);
    greeter.tell(new HelloWorld.Greet(command.name, replyTo));
    return this;
  }
}
```

### Example 15: First example

```scala
val system: ActorSystem[HelloWorldMain.SayHello] =
  ActorSystem(HelloWorldMain(), "hello")

system ! HelloWorldMain.SayHello("World")
system ! HelloWorldMain.SayHello("Akka")
```

### Example 16: First example

```java
final ActorSystem<HelloWorldMain.SayHello> system =
    ActorSystem.create(HelloWorldMain.create(), "hello");

system.tell(new HelloWorldMain.SayHello("World"));
system.tell(new HelloWorldMain.SayHello("Akka"));
```

### Example 17: First example

```text
[INFO] [03/13/2018 15:50:05.814] [hello-akka.actor.default-dispatcher-4] [akka://hello/user/greeter] Hello World!
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-4] [akka://hello/user/greeter] Hello Akka!
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-2] [akka://hello/user/World] Greeting 1 for World
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-4] [akka://hello/user/Akka] Greeting 1 for Akka
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-5] [akka://hello/user/greeter] Hello World!
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-5] [akka://hello/user/greeter] Hello Akka!
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-4] [akka://hello/user/World] Greeting 2 for World
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-5] [akka://hello/user/greeter] Hello World!
[INFO] [03/13/2018 15:50:05.815] [hello-akka.actor.default-dispatcher-4] [akka://hello/user/Akka] Greeting 2 for Akka
[INFO] [03/13/2018 15:50:05.816] [hello-akka.actor.default-dispatcher-5] [akka://hello/user/greeter] Hello Akka!
[INFO] [03/13/2018 15:50:05.816] [hello-akka.actor.default-dispatcher-4] [akka://hello/user/World] Greeting 3 for World
[INFO] [03/13/2018 15:50:05.816] [hello-akka.actor.default-dispatcher-6] [akka://hello/user/Akka] Greeting 3 for Akka
```

### Example 18: Functional Style

```scala
object ChatRoom {
  sealed trait RoomCommand
  final case class GetSession(screenName: String, replyTo: ActorRef[SessionEvent]) extends RoomCommand

  sealed trait SessionEvent
  final case class SessionGranted(handle: ActorRef[PostMessage]) extends SessionEvent
  final case class SessionDenied(reason: String) extends SessionEvent
  final case class MessagePosted(screenName: String, message: String) extends SessionEvent

  sealed trait SessionCommand
  final case class PostMessage(message: String) extends SessionCommand
  private final case class NotifyClient(message: MessagePosted) extends SessionCommand
}
```

### Example 19: Functional Style

```java
static interface RoomCommand {}

public static final class GetSession implements RoomCommand {
  public final String screenName;
  public final ActorRef<SessionEvent> replyTo;

  public GetSession(String screenName, ActorRef<SessionEvent> replyTo) {
    this.screenName = screenName;
    this.replyTo = replyTo;
  }
}

interface SessionEvent {}

public static final class SessionGranted implements SessionEvent {
  public final ActorRef<PostMessage> handle;

  public SessionGranted(ActorRef<PostMessage> handle) {
    this.handle = handle;
  }
}

public static final class SessionDenied implements SessionEvent {
  public final String reason;

  public SessionDenied(String reason) {
    this.reason = reason;
  }
}

public static final class MessagePosted implements SessionEvent {
  public final String screenName;
  public final String message;

  public MessagePosted(String screenName, String message) {
    this.screenName = screenName;
    this.message = message;
  }
}

interface SessionCommand {}

public static final class PostMessage implements SessionCommand {
  public final String message;

  public PostMessage(String message) {
    this.message = message;
  }
}

private static final class NotifyClient implements SessionCommand {
  final MessagePosted message;

  NotifyClient(MessagePosted message) {
    this.message = message;
  }
}
```

### Example 20: Functional Style

```scala
object ChatRoom {
  private final case class PublishSessionMessage(screenName: String, message: String) extends RoomCommand

  def apply(): Behavior[RoomCommand] =
    chatRoom(List.empty)

  private def chatRoom(sessions: List[ActorRef[SessionCommand]]): Behavior[RoomCommand] =
    Behaviors.receive { (context, message) =>
      message match {
        case GetSession(screenName, client) =>
          // create a child actor for further interaction with the client
          val ses = context.spawn(
            session(context.self, screenName, client),
            name = URLEncoder.encode(screenName, StandardCharsets.UTF_8.name))
          client ! SessionGranted(ses)
          chatRoom(ses :: sessions)
        case PublishSessionMessage(screenName, message) =>
          val notification = NotifyClient(MessagePosted(screenName, message))
          sessions.foreach(_ ! notification)
          Behaviors.same
      }
    }

  private def session(
      room: ActorRef[PublishSessionMessage],
      screenName: String,
      client: ActorRef[SessionEvent]): Behavior[SessionCommand] =
    Behaviors.receiveMessage {
      case PostMessage(message) =>
        // from client, publish to others via the room
        room ! PublishSessionMessage(screenName, message)
        Behaviors.same
      case NotifyClient(message) =>
        // published from the room
        client ! message
        Behaviors.same
    }
}
```

### Example 21: Functional Style

```java
public class ChatRoom {
  private static final class PublishSessionMessage implements RoomCommand {
    public final String screenName;
    public final String message;

    public PublishSessionMessage(String screenName, String message) {
      this.screenName = screenName;
      this.message = message;
    }
  }

  public static Behavior<RoomCommand> create() {
    return Behaviors.setup(
        ctx -> new ChatRoom(ctx).chatRoom(new ArrayList<ActorRef<SessionCommand>>()));
  }

  private final ActorContext<RoomCommand> context;

  private ChatRoom(ActorContext<RoomCommand> context) {
    this.context = context;
  }

  private Behavior<RoomCommand> chatRoom(List<ActorRef<SessionCommand>> sessions) {
    return Behaviors.receive(RoomCommand.class)
        .onMessage(GetSession.class, getSession -> onGetSession(sessions, getSession))
        .onMessage(PublishSessionMessage.class, pub -> onPublishSessionMessage(sessions, pub))
        .build();
  }

  private Behavior<RoomCommand> onGetSession(
      List<ActorRef<SessionCommand>> sessions, GetSession getSession)
      throws UnsupportedEncodingException {
    ActorRef<SessionEvent> client = getSession.replyTo;
    ActorRef<SessionCommand> ses =
        context.spawn(
            Session.create(context.getSelf(), getSession.screenName, client),
            URLEncoder.encode(getSession.screenName, StandardCharsets.UTF_8.name()));
    // narrow to only expose PostMessage
    client.tell(new SessionGranted(ses.narrow()));
    List<ActorRef<SessionCommand>> newSessions = new ArrayList<>(sessions);
    newSessions.add(ses);
    return chatRoom(newSessions);
  }

  private Behavior<RoomCommand> onPublishSessionMessage(
      List<ActorRef<SessionCommand>> sessions, PublishSessionMessage pub) {
    NotifyClient notification =
        new NotifyClient((new MessagePosted(pub.screenName, pub.message)));
    sessions.forEach(s -> s.tell(notification));
    return Behaviors.same();
  }

  static class Session {
    static Behavior<ChatRoom.SessionCommand> create(
        ActorRef<RoomCommand> room, String screenName, ActorRef<SessionEvent> client) {
      return Behaviors.receive(ChatRoom.SessionCommand.class)
          .onMessage(PostMessage.class, post -> onPostMessage(room, screenName, post))
          .onMessage(NotifyClient.class, notification -> onNotifyClient(client, notification))
          .build();
    }

    private static Behavior<SessionCommand> onPostMessage(
        ActorRef<RoomCommand> room, String screenName, PostMessage post) {
      // from client, publish to others via the room
      room.tell(new PublishSessionMessage(screenName, post.message));
      return Behaviors.same();
    }

    private static Behavior<SessionCommand> onNotifyClient(
        ActorRef<SessionEvent> client, NotifyClient notification) {
      // published from the room
      client.tell(notification.message);
      return Behaviors.same();
    }
  }
}
```

### Example 22: Trying it out

```scala
object Gabbler {
  import ChatRoom._

  def apply(): Behavior[SessionEvent] =
    Behaviors.setup { context =>
      Behaviors.receiveMessage {
        case SessionGranted(handle) =>
          handle ! PostMessage("Hello World!")
          Behaviors.same
        case MessagePosted(screenName, message) =>
          context.log.info2("message has been posted by '{}': {}", screenName, message)
          Behaviors.stopped
      }
    }
}
```

### Example 23: Trying it out

```java
public class Gabbler {
  public static Behavior<ChatRoom.SessionEvent> create() {
    return Behaviors.setup(ctx -> new Gabbler(ctx).behavior());
  }

  private final ActorContext<ChatRoom.SessionEvent> context;

  private Gabbler(ActorContext<ChatRoom.SessionEvent> context) {
    this.context = context;
  }

  private Behavior<ChatRoom.SessionEvent> behavior() {
    return Behaviors.receive(ChatRoom.SessionEvent.class)
        .onMessage(ChatRoom.SessionDenied.class, this::onSessionDenied)
        .onMessage(ChatRoom.SessionGranted.class, this::onSessionGranted)
        .onMessage(ChatRoom.MessagePosted.class, this::onMessagePosted)
        .build();
  }

  private Behavior<ChatRoom.SessionEvent> onSessionDenied(ChatRoom.SessionDenied message) {
    context.getLog().info("cannot start chat room session: {}", message.reason);
    return Behaviors.stopped();
  }

  private Behavior<ChatRoom.SessionEvent> onSessionGranted(ChatRoom.SessionGranted message) {
    message.handle.tell(new ChatRoom.PostMessage("Hello World!"));
    return Behaviors.same();
  }

  private Behavior<ChatRoom.SessionEvent> onMessagePosted(ChatRoom.MessagePosted message) {
    context
        .getLog()
        .info("message has been posted by '{}': {}", message.screenName, message.message);
    return Behaviors.stopped();
  }
}
```

### Example 24: Trying it out

```scala
object Main {
  def apply(): Behavior[NotUsed] =
    Behaviors.setup { context =>
      val chatRoom = context.spawn(ChatRoom(), "chatroom")
      val gabblerRef = context.spawn(Gabbler(), "gabbler")
      context.watch(gabblerRef)
      chatRoom ! ChatRoom.GetSession("ol’ Gabbler", gabblerRef)

      Behaviors.receiveSignal {
        case (_, Terminated(_)) =>
          Behaviors.stopped
      }
    }

  def main(args: Array[String]): Unit = {
    ActorSystem(Main(), "ChatRoomDemo")
  }

}
```

### Example 25: Trying it out

```java
public class Main {
  public static Behavior<Void> create() {
    return Behaviors.setup(
        context -> {
          ActorRef<ChatRoom.RoomCommand> chatRoom = context.spawn(ChatRoom.create(), "chatRoom");
          ActorRef<ChatRoom.SessionEvent> gabbler = context.spawn(Gabbler.create(), "gabbler");
          context.watch(gabbler);
          chatRoom.tell(new ChatRoom.GetSession("ol’ Gabbler", gabbler));

          return Behaviors.receive(Void.class)
              .onSignal(Terminated.class, sig -> Behaviors.stopped())
              .build();
        });
  }

  public static void main(String[] args) {
    ActorSystem.create(Main.create(), "ChatRoomDemo");
  }
}
```

### Example 26: AbstractBehavior API

```scala
object ChatRoom {
  sealed trait RoomCommand
  final case class GetSession(screenName: String, replyTo: ActorRef[SessionEvent]) extends RoomCommand

  sealed trait SessionEvent
  final case class SessionGranted(handle: ActorRef[PostMessage]) extends SessionEvent
  final case class SessionDenied(reason: String) extends SessionEvent
  final case class MessagePosted(screenName: String, message: String) extends SessionEvent

  sealed trait SessionCommand
  final case class PostMessage(message: String) extends SessionCommand
  private final case class NotifyClient(message: MessagePosted) extends SessionCommand
}
```

### Example 27: AbstractBehavior API

```java
static interface RoomCommand {}

public static final class GetSession implements RoomCommand {
  public final String screenName;
  public final ActorRef<SessionEvent> replyTo;

  public GetSession(String screenName, ActorRef<SessionEvent> replyTo) {
    this.screenName = screenName;
    this.replyTo = replyTo;
  }
}

static interface SessionEvent {}

public static final class SessionGranted implements SessionEvent {
  public final ActorRef<PostMessage> handle;

  public SessionGranted(ActorRef<PostMessage> handle) {
    this.handle = handle;
  }
}

public static final class SessionDenied implements SessionEvent {
  public final String reason;

  public SessionDenied(String reason) {
    this.reason = reason;
  }
}

public static final class MessagePosted implements SessionEvent {
  public final String screenName;
  public final String message;

  public MessagePosted(String screenName, String message) {
    this.screenName = screenName;
    this.message = message;
  }
}

static interface SessionCommand {}

public static final class PostMessage implements SessionCommand {
  public final String message;

  public PostMessage(String message) {
    this.message = message;
  }
}

private static final class NotifyClient implements SessionCommand {
  final MessagePosted message;

  NotifyClient(MessagePosted message) {
    this.message = message;
  }
}
```

### Example 28: AbstractBehavior API

```scala
object ChatRoom {
  private final case class PublishSessionMessage(screenName: String, message: String) extends RoomCommand

  def apply(): Behavior[RoomCommand] =
    Behaviors.setup(context => new ChatRoomBehavior(context))

  class ChatRoomBehavior(context: ActorContext[RoomCommand]) extends AbstractBehavior[RoomCommand](context) {
    private var sessions: List[ActorRef[SessionCommand]] = List.empty

    override def onMessage(message: RoomCommand): Behavior[RoomCommand] = {
      message match {
        case GetSession(screenName, client) =>
          // create a child actor for further interaction with the client
          val ses = context.spawn(
            SessionBehavior(context.self, screenName, client),
            name = URLEncoder.encode(screenName, StandardCharsets.UTF_8.name))
          client ! SessionGranted(ses)
          sessions = ses :: sessions
          this
        case PublishSessionMessage(screenName, message) =>
          val notification = NotifyClient(MessagePosted(screenName, message))
          sessions.foreach(_ ! notification)
          this
      }
    }
  }

  private object SessionBehavior {
    def apply(
        room: ActorRef[PublishSessionMessage],
        screenName: String,
        client: ActorRef[SessionEvent]): Behavior[SessionCommand] =
      Behaviors.setup(ctx => new SessionBehavior(ctx, room, screenName, client))
  }

  private class SessionBehavior(
      context: ActorContext[SessionCommand],
      room: ActorRef[PublishSessionMessage],
      screenName: String,
      client: ActorRef[SessionEvent])
      extends AbstractBehavior[SessionCommand](context) {

    override def onMessage(msg: SessionCommand): Behavior[SessionCommand] =
      msg match {
        case PostMessage(message) =>
          // from client, publish to others via the room
          room ! PublishSessionMessage(screenName, message)
          Behaviors.same
        case NotifyClient(message) =>
          // published from the room
          client ! message
          Behaviors.same
      }
  }
}
```

### Example 29: AbstractBehavior API

```java
public class ChatRoom {
  private static final class PublishSessionMessage implements RoomCommand {
    public final String screenName;
    public final String message;

    public PublishSessionMessage(String screenName, String message) {
      this.screenName = screenName;
      this.message = message;
    }
  }

  public static Behavior<RoomCommand> create() {
    return Behaviors.setup(ChatRoomBehavior::new);
  }

  public static class ChatRoomBehavior extends AbstractBehavior<RoomCommand> {
    final List<ActorRef<SessionCommand>> sessions = new ArrayList<>();

    private ChatRoomBehavior(ActorContext<RoomCommand> context) {
      super(context);
    }

    @Override
    public Receive<RoomCommand> createReceive() {
      ReceiveBuilder<RoomCommand> builder = newReceiveBuilder();

      builder.onMessage(GetSession.class, this::onGetSession);
      builder.onMessage(PublishSessionMessage.class, this::onPublishSessionMessage);

      return builder.build();
    }

    private Behavior<RoomCommand> onGetSession(GetSession getSession)
        throws UnsupportedEncodingException {
      ActorRef<SessionEvent> client = getSession.replyTo;
      ActorRef<SessionCommand> ses =
          getContext()
              .spawn(
                  SessionBehavior.create(getContext().getSelf(), getSession.screenName, client),
                  URLEncoder.encode(getSession.screenName, StandardCharsets.UTF_8.name()));
      // narrow to only expose PostMessage
      client.tell(new SessionGranted(ses.narrow()));
      sessions.add(ses);
      return this;
    }

    private Behavior<RoomCommand> onPublishSessionMessage(PublishSessionMessage pub) {
      NotifyClient notification =
          new NotifyClient((new MessagePosted(pub.screenName, pub.message)));
      sessions.forEach(s -> s.tell(notification));
      return this;
    }
  }

  static class SessionBehavior extends AbstractBehavior<ChatRoom.SessionCommand> {
    private final ActorRef<RoomCommand> room;
    private final String screenName;
    private final ActorRef<SessionEvent> client;

    public static Behavior<ChatRoom.SessionCommand> create(
        ActorRef<RoomCommand> room, String screenName, ActorRef<SessionEvent> client) {
      return Behaviors.setup(context -> new SessionBehavior(context, room, screenName, client));
    }

    private SessionBehavior(
        ActorContext<ChatRoom.SessionCommand> context,
        ActorRef<RoomCommand> room,
        String screenName,
        ActorRef<SessionEvent> client) {
      super(context);
      this.room = room;
      this.screenName = screenName;
      this.client = client;
    }

    @Override
    public Receive<SessionCommand> createReceive() {
      return newReceiveBuilder()
          .onMessage(PostMessage.class, this::onPostMessage)
          .onMessage(NotifyClient.class, this::onNotifyClient)
          .build();
    }

    private Behavior<SessionCommand> onPostMessage(PostMessage post) {
      // from client, publish to others via the room
      room.tell(new PublishSessionMessage(screenName, post.message));
      return Behaviors.same();
    }

    private Behavior<SessionCommand> onNotifyClient(NotifyClient notification) {
      // published from the room
      client.tell(notification.message);
      return Behaviors.same();
    }
  }
}
```

### Example 30: AbstractOnMessageBehavior API

```java
public class ChatRoom {

  public static Behavior<RoomCommand> create() {
    return Behaviors.setup(ChatRoomBehavior::new);
  }

  public static class ChatRoomBehavior extends AbstractOnMessageBehavior<RoomCommand> {
    final List<ActorRef<SessionCommand>> sessions = new ArrayList<>();

    private ChatRoomBehavior(ActorContext<RoomCommand> context) {
      super(context);
    }

    @Override
    public Behavior<RoomCommand> onMessage(RoomCommand msg) throws UnsupportedEncodingException {
      // uses Java 17-onward features
      switch(msg) {
        // NB: JEP 409 (https://openjdk.org/jeps/409) may allow not including a default clause
        case GetSession gs:
          return onGetSession(gs);

        case PublishSessionMessage psm:
          return onPublishSessionMessage(psm);

        default:
          // for completeness, should never happen
      }
      return Behaviors.unhandled();
    }

    private Behavior<RoomCommand> onGetSession(GetSession gs)
        throws UnsupportedEncodingException {
      ActorRef<SessionEvent> client = gs.replyTo;
      ActorRef<SessionCommand> ses =
          getContext()
              .spawn(
                  SessionBehavior.create(getContext().getSelf(), gs.screenName, client),
                  URLEncoder.encode(gs.screenName, StandardCharsets.UTF_8.name()));

      // narrow to only expose PostMessage
      client.tell(new SessionGranted(ses.narrow()));
      sessions.add(ses);

      return this;
    }

    private Behavior<RoomCommand> onPublishSessionMessage(PublishSessionMessage pub) {
      NotifyClient notification =
          new NotifyClient(new MessagePosted(pub.screenName, pub.message));

      sessions.forEach(s -> s.tell(notification));
      return this;
    }
  }

  static class SessionBehavior extends AbstractOnMessageBehavior<SessionCommand> {
    private final ActorRef<RoomCommand> room;
    private final String screenName;
    private final ActorRef<SessionEvent> client;

    public static Behavior<SessionCommand> create(
        ActorRef<RoomCommand> room, String screenName, ActorRef<SessionEvent> client) {
      return Behaviors.setup(context -> new SessionBehavior(context, room, screenName, client));
    }

    private SessionBehavior(
        ActorContext<SessionCommand> context,
        ActorRef<RoomCommand> room,
        String screenName,
        ActorRef<SessionEvent> client) {
      super(context);
      this.room = room;
      this.screenName = screenName;
      this.client = client;
    }

    @Override
    public Behavior<SessionCommand> onMessage(SessionCommand msg) {
      switch (msg) {
        case PostMessage pm:
          // from client, publish to others via the room
          room.tell(new PublishSessionMessage(screenName, pm.message);
          return Behaviors.same();

        case NotifyClient nc:
          // published from the room
          client.tell(nc.message);
          return Behaviors.same();

        default:
          // for completeness, should never happen
      }

      return Behaviors.unhandled();
    }
  }
}
```

### Example 31: Try it out

```scala
object Gabbler {
  import ChatRoom._

  def apply(): Behavior[SessionEvent] =
    Behaviors.setup { context =>
      Behaviors.receiveMessage {
        case SessionDenied(reason) =>
          context.log.info("cannot start chat room session: {}", reason)
          Behaviors.stopped
        case SessionGranted(handle) =>
          handle ! PostMessage("Hello World!")
          Behaviors.same
        case MessagePosted(screenName, message) =>
          context.log.info2("message has been posted by '{}': {}", screenName, message)
          Behaviors.stopped
      }
    }
```

### Example 32: Try it out

```java
public class Gabbler extends AbstractBehavior<ChatRoom.SessionEvent> {
  public static Behavior<ChatRoom.SessionEvent> create() {
    return Behaviors.setup(Gabbler::new);
  }

  private Gabbler(ActorContext<ChatRoom.SessionEvent> context) {
    super(context);
  }

  @Override
  public Receive<ChatRoom.SessionEvent> createReceive() {
    ReceiveBuilder<ChatRoom.SessionEvent> builder = newReceiveBuilder();
    return builder
        .onMessage(ChatRoom.SessionDenied.class, this::onSessionDenied)
        .onMessage(ChatRoom.SessionGranted.class, this::onSessionGranted)
        .onMessage(ChatRoom.MessagePosted.class, this::onMessagePosted)
        .build();
  }

  private Behavior<ChatRoom.SessionEvent> onSessionDenied(ChatRoom.SessionDenied message) {
    getContext().getLog().info("cannot start chat room session: {}", message.reason);
    return Behaviors.stopped();
  }

  private Behavior<ChatRoom.SessionEvent> onSessionGranted(ChatRoom.SessionGranted message) {
    message.handle.tell(new ChatRoom.PostMessage("Hello World!"));
    return Behaviors.same();
  }

  private Behavior<ChatRoom.SessionEvent> onMessagePosted(ChatRoom.MessagePosted message) {
    getContext()
        .getLog()
        .info("message has been posted by '{}': {}", message.screenName, message.message);
    return Behaviors.stopped();
  }
}
```

### Example 33: Try it out

```scala
object Main {
  def apply(): Behavior[NotUsed] =
    Behaviors.setup { context =>
      val chatRoom = context.spawn(ChatRoom(), "chatroom")
      val gabblerRef = context.spawn(Gabbler(), "gabbler")
      context.watch(gabblerRef)
      chatRoom ! ChatRoom.GetSession("ol’ Gabbler", gabblerRef)

      Behaviors.receiveSignal {
        case (_, Terminated(_)) =>
          Behaviors.stopped
      }
    }

  def main(args: Array[String]): Unit = {
    ActorSystem(Main(), "ChatRoomDemo")
  }

}
```

### Example 34: Try it out

```java
public class Main {
  public static Behavior<Void> create() {
    return Behaviors.setup(
        context -> {
          ActorRef<ChatRoom.RoomCommand> chatRoom = context.spawn(ChatRoom.create(), "chatRoom");
          ActorRef<ChatRoom.SessionEvent> gabbler = context.spawn(Gabbler.create(), "gabbler");
          context.watch(gabbler);
          chatRoom.tell(new ChatRoom.GetSession("ol’ Gabbler", gabbler));

          return Behaviors.receive(Void.class)
              .onSignal(Terminated.class, sig -> Behaviors.stopped())
              .build();
        });
  }

  public static void main(String[] args) {
    ActorSystem.create(Main.create(), "ChatRoomDemo");
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8.9/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/2.8/akka/NotUsed.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Terminated.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/japi/akka/2.8.9/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Terminated.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/libraries/akka-core/2.8/actors.html
- https://doc.akka.io/libraries/akka-core/2.8/additional/ide.html
- https://doc.akka.io/libraries/akka-core/2.8/general/actor-systems.html
- https://doc.akka.io/libraries/akka-core/2.8/general/addressing.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/actor-lifecycle.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/guide/introduction.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/index.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/logging.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/project/links.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/style-guide.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.8/typed/actors.html](https://doc.akka.io/libraries/akka-core/2.8/typed/actors.html)*