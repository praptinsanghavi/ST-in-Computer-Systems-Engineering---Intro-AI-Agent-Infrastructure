---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:31:52Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/actor-discovery.html
title: Actor discovery • Akka core
---

# Actor discovery • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Actor discovery

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Actors](../actors.html#actorselection).

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

## Obtaining Actor references

There are two general ways to obtain [Actor references](../general/addressing.html#what-is-an-actor-reference): by [creating actors](actor-lifecycle.html#creating-actors) and by discovery using the [Receptionist](actor-discovery.html#receptionist).

You can pass actor references between actors as constructor parameters or part of messages.

Sometimes you need something to bootstrap the interaction, for example when actors are running on different nodes in the Cluster or when “dependency injection” with constructor parameters is not applicable.

## Receptionist

When an actor needs to be discovered by another actor but you are unable to put a reference to it in an incoming message, you can use the [`Receptionist`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.html "akka.actor.typed.receptionist.Receptionist")[`Receptionist`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.html "akka.actor.typed.receptionist.Receptionist"). It supports both local and cluster (see [cluster](actor-discovery.html#cluster-receptionist)). You register the specific actors that should be discoverable from each node in the local `Receptionist` instance. The API of the receptionist is also based on actor messages. This registry of actor references is then automatically distributed to all other nodes in the case of a cluster. You can lookup such actors with the key that was used when they were registered. The reply to such a `Find` request is a `Listing`, which contains a `Set` of actor references that are registered for the key. Note that several actors can be registered to the same key.

The registry is dynamic. New actors can be registered during the lifecycle of the system. Entries are removed when registered actors are stopped, manually deregistered or the node they live on is removed from the [Cluster](cluster.html). To facilitate this dynamic aspect you can also subscribe to changes with the `Receptionist.Subscribe` message. It will send `Listing` messages to the subscriber, first with the set of entries upon subscription, then whenever the entries for a key are changed.

These imports are used in the following example:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/ReceptionistExample.scala#L8-L12 "Go to snippet source")import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.receptionist.Receptionist
import akka.actor.typed.receptionist.ServiceKey
import akka.actor.typed.scaladsl.Behaviors
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/ReceptionistExample.java#L8-L13 "Go to snippet source")import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.receptionist.Receptionist;
import akka.actor.typed.receptionist.ServiceKey;
```

First we create a `PingService` actor and register it with the `Receptionist` against a [`ServiceKey`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html "akka.actor.typed.receptionist.ServiceKey")[`ServiceKey`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html "akka.actor.typed.receptionist.ServiceKey") that will later be used to lookup the reference:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/ReceptionistExample.scala#L17-L35 "Go to snippet source")object PingService {
  val PingServiceKey = ServiceKey[Ping]("pingService")

  final case class Ping(replyTo: ActorRef[Pong.type])
  case object Pong

  def apply(): Behavior[Ping] = {
    Behaviors.setup { context =>
      context.system.receptionist ! Receptionist.Register(PingServiceKey, context.self)

      Behaviors.receiveMessage {
        case Ping(replyTo) =>
          context.log.info("Pinged by {}", replyTo)
          replyTo ! Pong
          Behaviors.same
      }
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/ReceptionistExample.java#L20-L62 "Go to snippet source")public class PingService {

  public static final ServiceKey<Ping> pingServiceKey =
      ServiceKey.create(Ping.class, "pingService");

  public static class Pong {}

  public static class Ping {
    private final ActorRef<Pong> replyTo;

    public Ping(ActorRef<Pong> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static Behavior<Ping> create() {
    return Behaviors.setup(
        context -> {
          context
              .getSystem()
              .receptionist()
              .tell(Receptionist.register(pingServiceKey, context.getSelf()));

          return new PingService(context).behavior();
        });
  }

  private final ActorContext<Ping> context;

  private PingService(ActorContext<Ping> context) {
    this.context = context;
  }

  private Behavior<Ping> behavior() {
    return Behaviors.receive(Ping.class).onMessage(Ping.class, this::onPing).build();
  }

  private Behavior<Ping> onPing(Ping msg) {
    context.getLog().info("Pinged by {}", msg.replyTo);
    msg.replyTo.tell(new Pong());
    return Behaviors.same();
  }
}
```

Then we have another actor that requires a `PingService` to be constructed:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/ReceptionistExample.scala#L39-L50 "Go to snippet source")object Pinger {
  def apply(pingService: ActorRef[PingService.Ping]): Behavior[PingService.Pong.type] = {
    Behaviors.setup { context =>
      pingService ! PingService.Ping(context.self)

      Behaviors.receiveMessage { _ =>
        context.log.info("{} was ponged!!", context.self)
        Behaviors.stopped
      }
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/ReceptionistExample.java#L66-L93 "Go to snippet source")public class Pinger {
  private final ActorContext<PingService.Pong> context;
  private final ActorRef<PingService.Ping> pingService;

  private Pinger(ActorContext<PingService.Pong> context, ActorRef<PingService.Ping> pingService) {
    this.context = context;
    this.pingService = pingService;
  }

  public static Behavior<PingService.Pong> create(ActorRef<PingService.Ping> pingService) {
    return Behaviors.setup(
        ctx -> {
          pingService.tell(new PingService.Ping(ctx.getSelf()));
          return new Pinger(ctx, pingService).behavior();
        });
  }

  private Behavior<PingService.Pong> behavior() {
    return Behaviors.receive(PingService.Pong.class)
        .onMessage(PingService.Pong.class, this::onPong)
        .build();
  }

  private Behavior<PingService.Pong> onPong(PingService.Pong msg) {
    context.getLog().info("{} was ponged!!", context.getSelf());
    return Behaviors.stopped();
  }
}
```

Finally in the guardian actor we spawn the service as well as subscribing to any actors registering against the [`ServiceKey`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html "akka.actor.typed.receptionist.ServiceKey")[`ServiceKey`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html "akka.actor.typed.receptionist.ServiceKey"). Subscribing means that the guardian actor will be informed of any new registrations via a `Listing` message:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/ReceptionistExample.scala#L54-L69 "Go to snippet source")object Guardian {
  def apply(): Behavior[Nothing] = {
    Behaviors
      .setup[Receptionist.Listing] { context =>
        context.spawnAnonymous(PingService())
        context.system.receptionist ! Receptionist.Subscribe(PingService.PingServiceKey, context.self)

        Behaviors.receiveMessagePartial[Receptionist.Listing] {
          case PingService.PingServiceKey.Listing(listings) =>
            listings.foreach(ps => context.spawnAnonymous(Pinger(ps)))
            Behaviors.same
        }
      }
      .narrow
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/ReceptionistExample.java#L97-L132 "Go to snippet source")public class Guardian {

  public static Behavior<Void> create() {
    return Behaviors.setup(
            (ActorContext<Receptionist.Listing> context) -> {
              context
                  .getSystem()
                  .receptionist()
                  .tell(
                      Receptionist.subscribe(
                          PingService.pingServiceKey, context.getSelf().narrow()));
              context.spawnAnonymous(PingService.create());

              return new Guardian(context).behavior();
            })
        .unsafeCast(); // Void
  }

  private final ActorContext<Receptionist.Listing> context;

  private Guardian(ActorContext<Receptionist.Listing> context) {
    this.context = context;
  }

  private Behavior<Receptionist.Listing> behavior() {
    return Behaviors.receive(Receptionist.Listing.class)
        .onMessage(Receptionist.Listing.class, this::onListing)
        .build();
  }

  private Behavior<Receptionist.Listing> onListing(Receptionist.Listing msg) {
    msg.getServiceInstances(PingService.pingServiceKey)
        .forEach(pingService -> context.spawnAnonymous(Pinger.create(pingService)));
    return Behaviors.same();
  }
}
```

Each time a new (which is just a single time in this example) `PingService` is registered the guardian actor spawns a `Pinger` for each currently known `PingService`. The `Pinger` sends a `Ping` message and when receiving the `Pong` reply it stops.

In above example we used `Receptionist.Subscribe`, but it’s also possible to request a single `Listing` of the current state without receiving further updates by sending the `Receptionist.Find` message to the receptionist. An example of using `Receptionist.Find`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/ReceptionistExample.scala#L73-L94 "Go to snippet source")object PingManager {
  sealed trait Command
  case object PingAll extends Command
  private case class ListingResponse(listing: Receptionist.Listing) extends Command

  def apply(): Behavior[Command] = {
    Behaviors.setup[Command] { context =>
      val listingResponseAdapter = context.messageAdapter[Receptionist.Listing](ListingResponse.apply)

      context.spawnAnonymous(PingService())

      Behaviors.receiveMessagePartial {
        case PingAll =>
          context.system.receptionist ! Receptionist.Find(PingService.PingServiceKey, listingResponseAdapter)
          Behaviors.same
        case ListingResponse(PingService.PingServiceKey.Listing(listings)) =>
          listings.foreach(ps => context.spawnAnonymous(Pinger(ps)))
          Behaviors.same
      }
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/ReceptionistExample.java#L136-L187 "Go to snippet source")public class PingManager {

  interface Command {}

  enum PingAll implements Command {
    INSTANCE
  }

  private static class ListingResponse implements Command {
    final Receptionist.Listing listing;

    private ListingResponse(Receptionist.Listing listing) {
      this.listing = listing;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(context -> new PingManager(context).behavior());
  }

  private final ActorContext<Command> context;
  private final ActorRef<Receptionist.Listing> listingResponseAdapter;

  private PingManager(ActorContext<Command> context) {
    this.context = context;
    this.listingResponseAdapter =
        context.messageAdapter(Receptionist.Listing.class, ListingResponse::new);

    context.spawnAnonymous(PingService.create());
  }

  private Behavior<Command> behavior() {
    return Behaviors.receive(Command.class)
        .onMessage(PingAll.class, notUsed -> onPingAll())
        .onMessage(ListingResponse.class, response -> onListing(response.listing))
        .build();
  }

  private Behavior<Command> onPingAll() {
    context
        .getSystem()
        .receptionist()
        .tell(Receptionist.find(PingService.pingServiceKey, listingResponseAdapter));
    return Behaviors.same();
  }

  private Behavior<Command> onListing(Receptionist.Listing msg) {
    msg.getServiceInstances(PingService.pingServiceKey)
        .forEach(pingService -> context.spawnAnonymous(Pinger.create(pingService)));
    return Behaviors.same();
  }
}
```

Also note how a [`messageAdapter`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html#messageAdapter(java.lang.Class,akka.japi.function.Function) "akka.actor.typed.javadsl.ActorContext")[`messageAdapter`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html#messageAdapter[U](f:U=%3ET)(implicitevidence$1:scala.reflect.ClassTag[U]):akka.actor.typed.ActorRef[U] "akka.actor.typed.scaladsl.ActorContext") is used to convert the `Receptionist.Listing` to a message type that the `PingManager` understands.

If a server no longer wish to be associated with a service key it can deregister using the command `Receptionist.Deregister` which will remove the association and inform all subscribers.

The command can optionally send an acknowledgement once the local receptionist has removed the registration. The acknowledgement does not guarantee that all subscribers has seen that the instance has been removed, it may still receive messages from subscribers for some time after this.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/ReceptionistExample.scala#L99 "Go to snippet source")context.system.receptionist ! Receptionist.Deregister(PingService.PingServiceKey, context.self)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/ReceptionistExample.java#L194-L197 "Go to snippet source")context
    .getSystem()
    .receptionist()
    .tell(Receptionist.deregister(PingService.pingServiceKey, context.getSelf()));
```

## Cluster Receptionist

The `Receptionist` also works in a cluster, an actor registered to the receptionist will appear in the receptionist of the other nodes of the cluster.

The state for the receptionist is propagated via [distributed data](distributed-data.html) which means that each node will eventually reach the same set of actors per `ServiceKey`.

`Subscription`s and `Find` queries to a clustered receptionist will keep track of cluster reachability and only list registered actors that are reachable. The full set of actors, including unreachable ones, is available through [`Listing.allServiceInstances`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Listing.html#allServiceInstances[T](key:akka.actor.typed.receptionist.ServiceKey[T]):Set[akka.actor.typed.ActorRef[T]] "akka.actor.typed.receptionist.Receptionist.Listing")[`Listing.getAllServiceInstances`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Listing.html#getAllServiceInstances(akka.actor.typed.receptionist.ServiceKey) "akka.actor.typed.receptionist.Receptionist.Listing").

One important difference from local only receptions are the serialization concerns, all messages sent to and back from an actor on another node must be serializable, see [serialization](../serialization.html).

## Receptionist Scalability

The receptionist does not scale up to any number of services or very high turnaround of services. It will likely handle up to thousands or tens of thousands of services. Use cases with higher demands the receptionist for initial contact between actors on the nodes while the actual logic of those is up to the applications own actors.

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

### Example 4: Receptionist

```scala
import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.receptionist.Receptionist
import akka.actor.typed.receptionist.ServiceKey
import akka.actor.typed.scaladsl.Behaviors
```

### Example 5: Receptionist

```java
import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.receptionist.Receptionist;
import akka.actor.typed.receptionist.ServiceKey;
```

### Example 6: Receptionist

```scala
object PingService {
  val PingServiceKey = ServiceKey[Ping]("pingService")

  final case class Ping(replyTo: ActorRef[Pong.type])
  case object Pong

  def apply(): Behavior[Ping] = {
    Behaviors.setup { context =>
      context.system.receptionist ! Receptionist.Register(PingServiceKey, context.self)

      Behaviors.receiveMessage {
        case Ping(replyTo) =>
          context.log.info("Pinged by {}", replyTo)
          replyTo ! Pong
          Behaviors.same
      }
    }
  }
}
```

### Example 7: Receptionist

```java
public class PingService {

  public static final ServiceKey<Ping> pingServiceKey =
      ServiceKey.create(Ping.class, "pingService");

  public static class Pong {}

  public static class Ping {
    private final ActorRef<Pong> replyTo;

    public Ping(ActorRef<Pong> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static Behavior<Ping> create() {
    return Behaviors.setup(
        context -> {
          context
              .getSystem()
              .receptionist()
              .tell(Receptionist.register(pingServiceKey, context.getSelf()));

          return new PingService(context).behavior();
        });
  }

  private final ActorContext<Ping> context;

  private PingService(ActorContext<Ping> context) {
    this.context = context;
  }

  private Behavior<Ping> behavior() {
    return Behaviors.receive(Ping.class).onMessage(Ping.class, this::onPing).build();
  }

  private Behavior<Ping> onPing(Ping msg) {
    context.getLog().info("Pinged by {}", msg.replyTo);
    msg.replyTo.tell(new Pong());
    return Behaviors.same();
  }
}
```

### Example 8: Receptionist

```scala
object Pinger {
  def apply(pingService: ActorRef[PingService.Ping]): Behavior[PingService.Pong.type] = {
    Behaviors.setup { context =>
      pingService ! PingService.Ping(context.self)

      Behaviors.receiveMessage { _ =>
        context.log.info("{} was ponged!!", context.self)
        Behaviors.stopped
      }
    }
  }
}
```

### Example 9: Receptionist

```java
public class Pinger {
  private final ActorContext<PingService.Pong> context;
  private final ActorRef<PingService.Ping> pingService;

  private Pinger(ActorContext<PingService.Pong> context, ActorRef<PingService.Ping> pingService) {
    this.context = context;
    this.pingService = pingService;
  }

  public static Behavior<PingService.Pong> create(ActorRef<PingService.Ping> pingService) {
    return Behaviors.setup(
        ctx -> {
          pingService.tell(new PingService.Ping(ctx.getSelf()));
          return new Pinger(ctx, pingService).behavior();
        });
  }

  private Behavior<PingService.Pong> behavior() {
    return Behaviors.receive(PingService.Pong.class)
        .onMessage(PingService.Pong.class, this::onPong)
        .build();
  }

  private Behavior<PingService.Pong> onPong(PingService.Pong msg) {
    context.getLog().info("{} was ponged!!", context.getSelf());
    return Behaviors.stopped();
  }
}
```

### Example 10: Receptionist

```scala
object Guardian {
  def apply(): Behavior[Nothing] = {
    Behaviors
      .setup[Receptionist.Listing] { context =>
        context.spawnAnonymous(PingService())
        context.system.receptionist ! Receptionist.Subscribe(PingService.PingServiceKey, context.self)

        Behaviors.receiveMessagePartial[Receptionist.Listing] {
          case PingService.PingServiceKey.Listing(listings) =>
            listings.foreach(ps => context.spawnAnonymous(Pinger(ps)))
            Behaviors.same
        }
      }
      .narrow
  }
}
```

### Example 11: Receptionist

```java
public class Guardian {

  public static Behavior<Void> create() {
    return Behaviors.setup(
            (ActorContext<Receptionist.Listing> context) -> {
              context
                  .getSystem()
                  .receptionist()
                  .tell(
                      Receptionist.subscribe(
                          PingService.pingServiceKey, context.getSelf().narrow()));
              context.spawnAnonymous(PingService.create());

              return new Guardian(context).behavior();
            })
        .unsafeCast(); // Void
  }

  private final ActorContext<Receptionist.Listing> context;

  private Guardian(ActorContext<Receptionist.Listing> context) {
    this.context = context;
  }

  private Behavior<Receptionist.Listing> behavior() {
    return Behaviors.receive(Receptionist.Listing.class)
        .onMessage(Receptionist.Listing.class, this::onListing)
        .build();
  }

  private Behavior<Receptionist.Listing> onListing(Receptionist.Listing msg) {
    msg.getServiceInstances(PingService.pingServiceKey)
        .forEach(pingService -> context.spawnAnonymous(Pinger.create(pingService)));
    return Behaviors.same();
  }
}
```

### Example 12: Receptionist

```scala
object PingManager {
  sealed trait Command
  case object PingAll extends Command
  private case class ListingResponse(listing: Receptionist.Listing) extends Command

  def apply(): Behavior[Command] = {
    Behaviors.setup[Command] { context =>
      val listingResponseAdapter = context.messageAdapter[Receptionist.Listing](ListingResponse.apply)

      context.spawnAnonymous(PingService())

      Behaviors.receiveMessagePartial {
        case PingAll =>
          context.system.receptionist ! Receptionist.Find(PingService.PingServiceKey, listingResponseAdapter)
          Behaviors.same
        case ListingResponse(PingService.PingServiceKey.Listing(listings)) =>
          listings.foreach(ps => context.spawnAnonymous(Pinger(ps)))
          Behaviors.same
      }
    }
  }
}
```

### Example 13: Receptionist

```java
public class PingManager {

  interface Command {}

  enum PingAll implements Command {
    INSTANCE
  }

  private static class ListingResponse implements Command {
    final Receptionist.Listing listing;

    private ListingResponse(Receptionist.Listing listing) {
      this.listing = listing;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(context -> new PingManager(context).behavior());
  }

  private final ActorContext<Command> context;
  private final ActorRef<Receptionist.Listing> listingResponseAdapter;

  private PingManager(ActorContext<Command> context) {
    this.context = context;
    this.listingResponseAdapter =
        context.messageAdapter(Receptionist.Listing.class, ListingResponse::new);

    context.spawnAnonymous(PingService.create());
  }

  private Behavior<Command> behavior() {
    return Behaviors.receive(Command.class)
        .onMessage(PingAll.class, notUsed -> onPingAll())
        .onMessage(ListingResponse.class, response -> onListing(response.listing))
        .build();
  }

  private Behavior<Command> onPingAll() {
    context
        .getSystem()
        .receptionist()
        .tell(Receptionist.find(PingService.pingServiceKey, listingResponseAdapter));
    return Behaviors.same();
  }

  private Behavior<Command> onListing(Receptionist.Listing msg) {
    msg.getServiceInstances(PingService.pingServiceKey)
        .forEach(pingService -> context.spawnAnonymous(Pinger.create(pingService)));
    return Behaviors.same();
  }
}
```

### Example 14: Receptionist

```scala
context.system.receptionist ! Receptionist.Deregister(PingService.PingServiceKey, context.self)
```

### Example 15: Receptionist

```java
context
    .getSystem()
    .receptionist()
    .tell(Receptionist.deregister(PingService.pingServiceKey, context.getSelf()));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Listing.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Listing.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/libraries/akka-core/current/actors.html
- https://doc.akka.io/libraries/akka-core/current/general/addressing.html
- https://doc.akka.io/libraries/akka-core/current/serialization.html
- https://doc.akka.io/libraries/akka-core/current/typed/actor-discovery.html
- https://doc.akka.io/libraries/akka-core/current/typed/actor-lifecycle.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster.html
- https://doc.akka.io/libraries/akka-core/current/typed/distributed-data.html
- https://doc.akka.io/libraries/akka-core/current/typed/fault-tolerance.html
- https://doc.akka.io/libraries/akka-core/current/typed/routers.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/actor-discovery.html](https://doc.akka.io/libraries/akka-core/current/typed/actor-discovery.html)*