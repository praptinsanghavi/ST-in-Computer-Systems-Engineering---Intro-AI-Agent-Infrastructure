---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/event-stream.html
title: EventStream • Akka core
---

# EventStream • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# EventStream

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Event Stream](../event-bus.html#event-stream).

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

The event stream is the main [Event Bus](event-stream.html#eventbus) of each actor system: it is used for carrying [log messages](logging.html) and [Dead Letters](event-stream.html#dead-letters) and may be used by the user code for other purposes as well. 

It uses [Subchannel Classification](event-stream.html#subchannel-classification) which enables registering to related sets of channels.

## How to use

The following example demonstrates how a subscription works. Given an actor:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/akka/actor/typed/eventstream/LoggingDocSpec.scala#L27-L79 "Go to snippet source")import akka.actor.typed.Behavior
import akka.actor.typed.eventstream.EventStream.Subscribe
import akka.actor.typed.scaladsl.Behaviors

object DeadLetterListener {

  def apply(): Behavior[String] = Behaviors.setup { context =>
    // subscribe DeadLetter at startup.
    val adapter = context.messageAdapter[DeadLetter](d => d.message.toString)
    context.system.eventStream ! Subscribe(adapter)

    Behaviors.receiveMessage {
      case msg: String =>
        println(msg)
        Behaviors.same
    }
  }
}
  ActorSystem(Behaviors.setup[Void] { context =>
    context.spawn(DeadLetterListener(), "DeadLetterListener", Props.empty)
    Behaviors.empty
  }, "System")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/akka/actor/typed/eventstream/LoggingDocTest.java#L29-L31 "Go to snippet source")import akka.actor.DeadLetter;
import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
```

the actor definition like this:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/akka/actor/typed/eventstream/LoggingDocTest.java#L47-L70 "Go to snippet source")static class DeadLetterActor extends AbstractBehavior<String> {

    public static Behavior<String> create() {
        return Behaviors.setup(DeadLetterActor::new);
    }

    public DeadLetterActor(ActorContext<String> context) {
        super(context);
        ActorRef<DeadLetter> messageAdapter = context.messageAdapter(
            DeadLetter.class,
            d -> d.message().toString()
        );
        context.getSystem().eventStream()
            .tell(new Subscribe<>(DeadLetter.class, messageAdapter));
    }

    @Override
    public Receive<String> createReceive() {
        return newReceiveBuilder().onMessage(String.class, msg -> {
            System.out.println(msg);
            return Behaviors.same();
        }).build();
    }
}
```

it can be subscribed like this:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/akka/actor/typed/eventstream/LoggingDocTest.java#L39-L40 "Go to snippet source")ActorSystem<DeadLetter> system = ActorSystem.create(Behaviors.empty(), "DeadLetters");
system.eventStream().tell(new Subscribe<>(DeadLetter.class, system));
```

It is also worth pointing out that thanks to the way the subchannel classification is implemented in the event stream, it is possible to subscribe to a group of events, by subscribing to their common superclass as demonstrated in the following example:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/akka/actor/typed/eventstream/LoggingDocSpec.scala#L48-L104 "Go to snippet source")object ListenerActor {
  abstract class AllKindsOfMusic { def artist: String }
  case class Jazz(artist: String) extends AllKindsOfMusic
  case class Electronic(artist: String) extends AllKindsOfMusic

  def apply(): Behavior[ListenerActor.AllKindsOfMusic] = Behaviors.receive { (context, msg) =>
    msg match {
      case m: Jazz =>
        println(s"${context.self.path.name} is listening to: ${m.artist}")
        Behaviors.same
      case m: Electronic =>
        println(s"${context.self.path.name} is listening to: ${m.artist}")
        Behaviors.same
      case _ =>
        Behaviors.same
    }
  }
}

  implicit val system: ActorSystem[SpawnProtocol.Command] = ActorSystem(SpawnProtocol(), "SpawnProtocol")
  implicit val ec: ExecutionContext = system.executionContext

  val jazzListener: Future[ActorRef[Jazz]] =
    system.ask(Spawn(behavior = ListenerActor(), name = "jazz", props = Props.empty, _))
  val musicListener: Future[ActorRef[AllKindsOfMusic]] =
    system.ask(Spawn(behavior = ListenerActor(), name = "music", props = Props.empty, _))

  for (jazzListenerRef <- jazzListener; musicListenerRef <- musicListener) {
    system.eventStream ! Subscribe(jazzListenerRef)
    system.eventStream ! Subscribe(musicListenerRef)
  }

  // only musicListener gets this message, since it listens to *all* kinds of music:
  system.eventStream ! Publish(Electronic("Parov Stelar"))

  // jazzListener and musicListener will be notified about Jazz:
  system.eventStream ! Publish(Jazz("Sonny Rollins"))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/akka/actor/typed/eventstream/LoggingDocTest.java#L74-L158 "Go to snippet source")interface AllKindsOfMusic {

}

class Jazz implements AllKindsOfMusic {

    public final String artist;

    public Jazz(String artist) {
        this.artist = artist;
    }
}

class Electronic implements AllKindsOfMusic {

    public final String artist;

    public Electronic(String artist) {
        this.artist = artist;
    }
}

static class Listener extends AbstractBehavior<AllKindsOfMusic> {

    public static Behavior<AllKindsOfMusic> create() {
        return Behaviors.setup(Listener::new);
    }

    public Listener(ActorContext<AllKindsOfMusic> context) {
        super(context);
    }

    @Override
    public Receive<AllKindsOfMusic> createReceive() {
        return newReceiveBuilder()
            .onMessage(Jazz.class, msg -> {
                System.out.printf("%s is listening to: %s%n",
                    getContext().getSelf().path().name(),
                    msg);
                return Behaviors.same();
            })
            .onMessage(Electronic.class, msg -> {
                System.out.printf("%s is listening to: %s%n",
                    getContext().getSelf().path().name(),
                    msg);
                return Behaviors.same();
            }).build();
    }
}
    ActorSystem<SpawnProtocol.Command> system = ActorSystem.create(SpawnProtocol.create(),
        "Subclassification");
    final Duration timeout = Duration.ofSeconds(3);

    CompletionStage<ActorRef<Jazz>> jazzListener = AskPattern.ask(
        system,
        replyTo -> new Spawn<>(Listener.create().narrow(), "jazzListener", Props.empty(), replyTo),
        timeout,
        system.scheduler()
    );

    CompletionStage<ActorRef<AllKindsOfMusic>> musicListener = AskPattern.ask(
        system,
        replyTo -> new Spawn<>(Listener.create(), "musicListener", Props.empty(), replyTo),
        timeout,
        system.scheduler()
    );

    ActorRef<Jazz> jazzListenerActorRef = jazzListener.toCompletableFuture().join();
    ActorRef<AllKindsOfMusic> musicListenerActorRef = musicListener.toCompletableFuture()
        .join();

    system.eventStream().tell(new Subscribe<>(Jazz.class, jazzListenerActorRef));
    system.eventStream().tell(new Subscribe<>(AllKindsOfMusic.class, musicListenerActorRef));
    // only musicListener gets this message, since it listens to *all* kinds of music:
    system.eventStream().tell(new Publish<>(new Electronic("Parov Stelar")));

    // jazzListener and musicListener will be notified about Jazz:
    system.eventStream().tell(new Publish<>(new Jazz("Sonny Rollins")));

```

Similarly to [Actor Classification](event-stream.html#actor-classification), [`EventStream`](https://doc.akka.io/api/akka-core/2.10/akka/event/EventStream.html "akka.event.EventStream")[`EventStream`](https://doc.akka.io/japi/akka-core/2.10/akka/event/EventStream.html "akka.event.EventStream") will automatically remove subscribers when they terminate.

Note
The event stream is a *local facility*, meaning that it will *not* distribute events to other nodes in a clustered environment (unless you subscribe a Remote Actor to the stream explicitly). If you need to broadcast events in an Akka cluster, *without* knowing your recipients explicitly (i.e. obtaining their ActorRefs), you may want to look into: [The Receptionist](actor-discovery.html#receptionist), [Group Routers](routers.html#group-router) or [Distributed Publish Subscribe in Cluster](distributed-pub-sub.html).

### Dead Letters

As described at [Stopping actors](actor-lifecycle.html#stopping-actors), messages queued when an actor terminates or sent after its death are re\-routed to the dead letter mailbox, which by default will publish the messages wrapped in [`DeadLetter`](https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetter.html "akka.actor.DeadLetter")[`DeadLetter`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetter.html "akka.actor.DeadLetter"). This wrapper holds the original sender, receiver and message of the envelope which was redirected.

Some internal messages (marked with the [`DeadLetterSuppression`](https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetterSuppression.html "akka.actor.DeadLetterSuppression")[`DeadLetterSuppression`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetterSuppression.html "akka.actor.DeadLetterSuppression") traitinterface) will not end up as dead letters like normal messages. These are by design safe and expected to sometimes arrive at a terminated actor and since they are nothing to worry about, they are suppressed from the default dead letters logging mechanism.

However, in case you find yourself in need of debugging these kinds of low level suppressed dead letters, it’s still possible to subscribe to them explicitly:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/akka/actor/typed/eventstream/LoggingDocSpec.scala#L112-L113 "Go to snippet source")import akka.actor.SuppressedDeadLetter
system.eventStream ! Subscribe[SuppressedDeadLetter](listener)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/akka/actor/typed/eventstream/LoggingDocTest.java#L169 "Go to snippet source")system.eventStream().tell(new Subscribe<>(SuppressedDeadLetter.class, actor));
```

or all dead letters (including the suppressed ones):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/akka/actor/typed/eventstream/LoggingDocSpec.scala#L117-L118 "Go to snippet source")import akka.actor.AllDeadLetters
system.eventStream ! Subscribe[AllDeadLetters](listener)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/akka/actor/typed/eventstream/LoggingDocTest.java#L181 "Go to snippet source")system.eventStream().tell(new Subscribe<>(AllDeadLetters.class, actor));
```

### Other Uses

The event stream is always there and ready to be used, you can publish your own events (it accepts [`AnyRef`](http://www.scala-lang.org/api/2.13.17/scala/AnyRef.html "scala.AnyRef")[`Object`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html "java.lang.Object")) and subscribe listeners to the corresponding JVM classes.

## EventBus

Originally conceived as a way to send messages to groups of actors, the [`EventBus`](https://doc.akka.io/api/akka-core/2.10/akka/event/EventBus.html "akka.event.EventBus")[`EventBus`](https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/EventBus.html "akka.event.japi.EventBus") has been generalized into a set of composable traits abstract base classes implementing a simple interface: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/EventBus.scala#L29-L51 "Go to snippet source")/**
 * Attempts to register the subscriber to the specified Classifier
 * @return true if successful and false if not (because it was already
 *   subscribed to that Classifier, or otherwise)
 */
def subscribe(subscriber: Subscriber, to: Classifier): Boolean

/**
 * Attempts to deregister the subscriber from the specified Classifier
 * @return true if successful and false if not (because it wasn't subscribed
 *   to that Classifier, or otherwise)
 */
def unsubscribe(subscriber: Subscriber, from: Classifier): Boolean

/**
 * Attempts to deregister the subscriber from all Classifiers it may be subscribed to
 */
def unsubscribe(subscriber: Subscriber): Unit

/**
 * Publishes the specified Event to this bus
 */
def publish(event: Event): Unit
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/EventBusDocTest.java#L53-L86 "Go to snippet source")/**
 * Attempts to register the subscriber to the specified Classifier
 *
 * @return true if successful and false if not (because it was already subscribed to that
 *     Classifier, or otherwise)
 */
public boolean subscribe(Subscriber subscriber, Classifier to);

/**
 * Attempts to deregister the subscriber from the specified Classifier
 *
 * @return true if successful and false if not (because it wasn't subscribed to that Classifier,
 *     or otherwise)
 */
public boolean unsubscribe(Subscriber subscriber, Classifier from);

/** Attempts to deregister the subscriber from all Classifiers it may be subscribed to */
public void unsubscribe(Subscriber subscriber);

/** Publishes the specified Event to this bus */
public void publish(Event event);

```

Note
Please note that the EventBus does not preserve the sender of the published messages. If you need a reference to the original sender you have to provide it inside the message.

This mechanism is used in different places within Akka, e.g. the EventStream. Implementations can make use of the specific building blocks presented below.

An event bus must define the following three abstract typestype parameters:

- `Event` is the type of all events published on that bus
- `Subscriber` is the type of subscribers allowed to register on that event bus
- `Classifier` defines the classifier to be used in selecting subscribers for dispatching events

The traits below are still generic in these types, but they need to be defined for any concrete implementation. 

## Classifiers

The classifiers presented here are part of the Akka distribution, but rolling your own in case you do not find a perfect match is not difficult, check the implementation of the existing ones on [github](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/EventBus.scala) 

### Lookup Classification

The simplest classification is just to extract an arbitrary classifier from each event and maintaining a set of subscribers for each possible classifier. This can be compared to tuning in on a radio station. The trait [`LookupClassification`](https://doc.akka.io/api/akka-core/2.10/akka/event/LookupClassification.html "akka.event.LookupClassification")abstract class [`LookupEventBus`](https://doc.akka.io/api/akka-core/2.10/akka/event/japi/LookupEventBus.html "akka.event.japi.LookupEventBus") is still generic in that it abstracts over how to compare subscribers and how exactly to classify them.

The necessary methods to be implemented are illustrated with the following example: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/EventBusDocSpec.scala#L15-L48 "Go to snippet source")import akka.event.EventBus
import akka.event.LookupClassification

final case class MsgEnvelope(topic: String, payload: Any)

/**
 * Publishes the payload of the MsgEnvelope when the topic of the
 * MsgEnvelope equals the String specified when subscribing.
 */
class LookupBusImpl extends EventBus with LookupClassification {
  type Event = MsgEnvelope
  type Classifier = String
  type Subscriber = ActorRef

  // is used for extracting the classifier from the incoming events
  override protected def classify(event: Event): Classifier = event.topic

  // will be invoked for each event for all subscribers which registered themselves
  // for the event’s classifier
  override protected def publish(event: Event, subscriber: Subscriber): Unit = {
    subscriber ! event.payload
  }

  // must define a full order over the subscribers, expressed as expected from
  // `java.lang.Comparable.compare`
  override protected def compareSubscribers(a: Subscriber, b: Subscriber): Int =
    a.compareTo(b)

  // determines the initial size of the index data structure
  // used internally (i.e. the expected number of different classifiers)
  override protected def mapSize(): Int = 128

}

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/EventBusDocTest.java#L22-L138 "Go to snippet source")import akka.event.japi.LookupEventBus;

static class MsgEnvelope {
  public final String topic;
  public final Object payload;

  public MsgEnvelope(String topic, Object payload) {
    this.topic = topic;
    this.payload = payload;
  }
}

/**
 * Publishes the payload of the MsgEnvelope when the topic of the MsgEnvelope equals the String
 * specified when subscribing.
 */
static class LookupBusImpl extends LookupEventBus<MsgEnvelope, ActorRef, String> {

  // is used for extracting the classifier from the incoming events
  @Override
  public String classify(MsgEnvelope event) {
    return event.topic;
  }

  // will be invoked for each event for all subscribers which registered themselves
  // for the event’s classifier
  @Override
  public void publish(MsgEnvelope event, ActorRef subscriber) {
    subscriber.tell(event.payload, ActorRef.noSender());
  }

  // must define a full order over the subscribers, expressed as expected from
  // `java.lang.Comparable.compare`
  @Override
  public int compareSubscribers(ActorRef a, ActorRef b) {
    return a.compareTo(b);
  }

  // determines the initial size of the index data structure
  // used internally (i.e. the expected number of different classifiers)
  @Override
  public int mapSize() {
    return 128;
  }
}
```

A test for this implementation may look like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/EventBusDocSpec.scala#L152-L156 "Go to snippet source")val lookupBus = new LookupBusImpl
lookupBus.subscribe(testActor, "greetings")
lookupBus.publish(MsgEnvelope("time", System.currentTimeMillis()))
lookupBus.publish(MsgEnvelope("greetings", "hello"))
expectMsg("hello")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/EventBusDocTest.java#L273-L277 "Go to snippet source")LookupBusImpl lookupBus = new LookupBusImpl();
lookupBus.subscribe(getTestActor(), "greetings");
lookupBus.publish(new MsgEnvelope("time", System.currentTimeMillis()));
lookupBus.publish(new MsgEnvelope("greetings", "hello"));
expectMsgEquals("hello");
```

This classifier is efficient in case no subscribers exist for a particular event. 

### Subchannel Classification

If classifiers form a hierarchy and it is desired that subscription be possible not only at the leaf nodes, this classification may be just the right one. It can be compared to tuning in on (possibly multiple) radio channels by genre. This classification has been developed for the case where the classifier is just the JVM class of the event and subscribers may be interested in subscribing to all subclasses of a certain class, but it may be used with any classifier hierarchy.

The necessary methods to be implemented are illustrated with the following example: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/EventBusDocSpec.scala#L52-L86 "Go to snippet source")import akka.util.Subclassification

class StartsWithSubclassification extends Subclassification[String] {
  override def isEqual(x: String, y: String): Boolean =
    x == y

  override def isSubclass(x: String, y: String): Boolean =
    x.startsWith(y)
}

import akka.event.SubchannelClassification

/**
 * Publishes the payload of the MsgEnvelope when the topic of the
 * MsgEnvelope starts with the String specified when subscribing.
 */
class SubchannelBusImpl extends EventBus with SubchannelClassification {
  type Event = MsgEnvelope
  type Classifier = String
  type Subscriber = ActorRef

  // Subclassification is an object providing `isEqual` and `isSubclass`
  // to be consumed by the other methods of this classifier
  override protected val subclassification: Subclassification[Classifier] =
    new StartsWithSubclassification

  // is used for extracting the classifier from the incoming events
  override protected def classify(event: Event): Classifier = event.topic

  // will be invoked for each event for all subscribers which registered
  // themselves for the event’s classifier
  override protected def publish(event: Event, subscriber: Subscriber): Unit = {
    subscriber ! event.payload
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/EventBusDocTest.java#L27-L184 "Go to snippet source")import akka.event.japi.SubchannelEventBus;

static class StartsWithSubclassification implements Subclassification<String> {
  @Override
  public boolean isEqual(String x, String y) {
    return x.equals(y);
  }

  @Override
  public boolean isSubclass(String x, String y) {
    return x.startsWith(y);
  }
}

/**
 * Publishes the payload of the MsgEnvelope when the topic of the MsgEnvelope starts with the
 * String specified when subscribing.
 */
static class SubchannelBusImpl extends SubchannelEventBus<MsgEnvelope, ActorRef, String> {

  // Subclassification is an object providing `isEqual` and `isSubclass`
  // to be consumed by the other methods of this classifier
  @Override
  public Subclassification<String> subclassification() {
    return new StartsWithSubclassification();
  }

  // is used for extracting the classifier from the incoming events
  @Override
  public String classify(MsgEnvelope event) {
    return event.topic;
  }

  // will be invoked for each event for all subscribers which registered themselves
  // for the event’s classifier
  @Override
  public void publish(MsgEnvelope event, ActorRef subscriber) {
    subscriber.tell(event.payload, ActorRef.noSender());
  }
}
```

A test for this implementation may look like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/EventBusDocSpec.scala#L162-L169 "Go to snippet source")val subchannelBus = new SubchannelBusImpl
subchannelBus.subscribe(testActor, "abc")
subchannelBus.publish(MsgEnvelope("xyzabc", "x"))
subchannelBus.publish(MsgEnvelope("bcdef", "b"))
subchannelBus.publish(MsgEnvelope("abc", "c"))
expectMsg("c")
subchannelBus.publish(MsgEnvelope("abcdef", "d"))
expectMsg("d")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/EventBusDocTest.java#L288-L295 "Go to snippet source")SubchannelBusImpl subchannelBus = new SubchannelBusImpl();
subchannelBus.subscribe(getTestActor(), "abc");
subchannelBus.publish(new MsgEnvelope("xyzabc", "x"));
subchannelBus.publish(new MsgEnvelope("bcdef", "b"));
subchannelBus.publish(new MsgEnvelope("abc", "c"));
expectMsgEquals("c");
subchannelBus.publish(new MsgEnvelope("abcdef", "d"));
expectMsgEquals("d");
```

This classifier is also efficient in case no subscribers are found for an event, but it uses conventional locking to synchronize an internal classifier cache, hence it is not well\-suited to use cases in which subscriptions change with very high frequency (keep in mind that “opening” a classifier by sending the first message will also have to re\-check all previous subscriptions). 

### Scanning Classification

The previous classifier was built for multi\-classifier subscriptions which are strictly hierarchical, this classifier is useful if there are overlapping classifiers which cover various parts of the event space without forming a hierarchy. It can be compared to tuning in on (possibly multiple) radio stations by geographical reachability (for old\-school radio\-wave transmission).

The necessary methods to be implemented are illustrated with the following example: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/EventBusDocSpec.scala#L90-L120 "Go to snippet source")import akka.event.ScanningClassification

/**
 * Publishes String messages with length less than or equal to the length
 * specified when subscribing.
 */
class ScanningBusImpl extends EventBus with ScanningClassification {
  type Event = String
  type Classifier = Int
  type Subscriber = ActorRef

  // is needed for determining matching classifiers and storing them in an
  // ordered collection
  override protected def compareClassifiers(a: Classifier, b: Classifier): Int =
    if (a < b) -1 else if (a == b) 0 else 1

  // is needed for storing subscribers in an ordered collection
  override protected def compareSubscribers(a: Subscriber, b: Subscriber): Int =
    a.compareTo(b)

  // determines whether a given classifier shall match a given event; it is invoked
  // for each subscription for all received events, hence the name of the classifier
  override protected def matches(classifier: Classifier, event: Event): Boolean =
    event.length <= classifier

  // will be invoked for each event for all subscribers which registered themselves
  // for a classifier matching this event
  override protected def publish(event: Event, subscriber: Subscriber): Unit = {
    subscriber ! event
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/EventBusDocTest.java#L32-L221 "Go to snippet source")import akka.event.japi.ScanningEventBus;

/**
 * Publishes String messages with length less than or equal to the length specified when
 * subscribing.
 */
static class ScanningBusImpl extends ScanningEventBus<String, ActorRef, Integer> {

  // is needed for determining matching classifiers and storing them in an
  // ordered collection
  @Override
  public int compareClassifiers(Integer a, Integer b) {
    return a.compareTo(b);
  }

  // is needed for storing subscribers in an ordered collection
  @Override
  public int compareSubscribers(ActorRef a, ActorRef b) {
    return a.compareTo(b);
  }

  // determines whether a given classifier shall match a given event; it is invoked
  // for each subscription for all received events, hence the name of the classifier
  @Override
  public boolean matches(Integer classifier, String event) {
    return event.length() <= classifier;
  }

  // will be invoked for each event for all subscribers which registered themselves
  // for the event’s classifier
  @Override
  public void publish(String event, ActorRef subscriber) {
    subscriber.tell(event, ActorRef.noSender());
  }
}
```

A test for this implementation may look like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/EventBusDocSpec.scala#L175-L181 "Go to snippet source")val scanningBus = new ScanningBusImpl
scanningBus.subscribe(testActor, 3)
scanningBus.publish("xyzabc")
scanningBus.publish("ab")
expectMsg("ab")
scanningBus.publish("abc")
expectMsg("abc")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/EventBusDocTest.java#L306-L312 "Go to snippet source")ScanningBusImpl scanningBus = new ScanningBusImpl();
scanningBus.subscribe(getTestActor(), 3);
scanningBus.publish("xyzabc");
scanningBus.publish("ab");
expectMsgEquals("ab");
scanningBus.publish("abc");
expectMsgEquals("abc");
```

This classifier takes always a time which is proportional to the number of subscriptions, independent of how many actually match. 

### Actor Classification

This classification was originally developed specifically for implementing [DeathWatch](../actors.html#lifecycle-monitoring-aka-deathwatch): subscribers as well as classifiers are of type [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef").

This classification requires an [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") in order to perform book\-keeping operations related to the subscribers being Actors, which can terminate without first unsubscribing from the EventBus. ManagedActorClassification maintains a system Actor which takes care of unsubscribing terminated actors automatically.

The necessary methods to be implemented are illustrated with the following example: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/EventBusDocSpec.scala#L124-L142 "Go to snippet source")import akka.event.ActorEventBus
import akka.event.ManagedActorClassification
import akka.event.ActorClassifier

final case class Notification(ref: ActorRef, id: Int)

class ActorBusImpl(val system: ActorSystem)
    extends ActorEventBus
    with ActorClassifier
    with ManagedActorClassification {
  type Event = Notification

  // is used for extracting the classifier from the incoming events
  override protected def classify(event: Event): ActorRef = event.ref

  // determines the initial size of the index data structure
  // used internally (i.e. the expected number of different classifiers)
  override protected def mapSize: Int = 128
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/EventBusDocTest.java#L37-L259 "Go to snippet source")import akka.event.japi.ManagedActorEventBus;

static class Notification {
  public final ActorRef ref;
  public final int id;

  public Notification(ActorRef ref, int id) {
    this.ref = ref;
    this.id = id;
  }
}

static class ActorBusImpl extends ManagedActorEventBus<Notification> {

  // the ActorSystem will be used for book-keeping operations, such as subscribers terminating
  public ActorBusImpl(ActorSystem system) {
    super(system);
  }

  // is used for extracting the classifier from the incoming events
  @Override
  public ActorRef classify(Notification event) {
    return event.ref;
  }

  // determines the initial size of the index data structure
  // used internally (i.e. the expected number of different classifiers)
  @Override
  public int mapSize() {
    return 128;
  }
}
```

A test for this implementation may look like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/EventBusDocSpec.scala#L187-L202 "Go to snippet source")val observer1 = TestProbe().ref
val observer2 = TestProbe().ref
val probe1 = TestProbe()
val probe2 = TestProbe()
val subscriber1 = probe1.ref
val subscriber2 = probe2.ref
val actorBus = new ActorBusImpl(system)
actorBus.subscribe(subscriber1, observer1)
actorBus.subscribe(subscriber2, observer1)
actorBus.subscribe(subscriber2, observer2)
actorBus.publish(Notification(observer1, 100))
probe1.expectMsg(Notification(observer1, 100))
probe2.expectMsg(Notification(observer1, 100))
actorBus.publish(Notification(observer2, 101))
probe2.expectMsg(Notification(observer2, 101))
probe1.expectNoMessage(500.millis)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/EventBusDocTest.java#L321-L338 "Go to snippet source")ActorRef observer1 = new TestKit(system).getRef();
ActorRef observer2 = new TestKit(system).getRef();
TestKit probe1 = new TestKit(system);
TestKit probe2 = new TestKit(system);
ActorRef subscriber1 = probe1.getRef();
ActorRef subscriber2 = probe2.getRef();
ActorBusImpl actorBus = new ActorBusImpl(system);
actorBus.subscribe(subscriber1, observer1);
actorBus.subscribe(subscriber2, observer1);
actorBus.subscribe(subscriber2, observer2);
Notification n1 = new Notification(observer1, 100);
actorBus.publish(n1);
probe1.expectMsgEquals(n1);
probe2.expectMsgEquals(n1);
Notification n2 = new Notification(observer2, 101);
actorBus.publish(n2);
probe2.expectMsgEquals(n2);
probe1.expectNoMessage(Duration.ofMillis(500));
```

This classifier is still is generic in the event type, and it is efficient for all use cases.

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

### Example 4: How to use

```scala
import akka.actor.typed.Behavior
import akka.actor.typed.eventstream.EventStream.Subscribe
import akka.actor.typed.scaladsl.Behaviors

object DeadLetterListener {

  def apply(): Behavior[String] = Behaviors.setup { context =>
    // subscribe DeadLetter at startup.
    val adapter = context.messageAdapter[DeadLetter](d => d.message.toString)
    context.system.eventStream ! Subscribe(adapter)

    Behaviors.receiveMessage {
      case msg: String =>
        println(msg)
        Behaviors.same
    }
  }
}
  ActorSystem(Behaviors.setup[Void] { context =>
    context.spawn(DeadLetterListener(), "DeadLetterListener", Props.empty)
    Behaviors.empty
  }, "System")
```

### Example 5: How to use

```java
import akka.actor.DeadLetter;
import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
```

### Example 6: How to use

```java
static class DeadLetterActor extends AbstractBehavior<String> {

    public static Behavior<String> create() {
        return Behaviors.setup(DeadLetterActor::new);
    }

    public DeadLetterActor(ActorContext<String> context) {
        super(context);
        ActorRef<DeadLetter> messageAdapter = context.messageAdapter(
            DeadLetter.class,
            d -> d.message().toString()
        );
        context.getSystem().eventStream()
            .tell(new Subscribe<>(DeadLetter.class, messageAdapter));
    }

    @Override
    public Receive<String> createReceive() {
        return newReceiveBuilder().onMessage(String.class, msg -> {
            System.out.println(msg);
            return Behaviors.same();
        }).build();
    }
}
```

### Example 7: How to use

```java
ActorSystem<DeadLetter> system = ActorSystem.create(Behaviors.empty(), "DeadLetters");
system.eventStream().tell(new Subscribe<>(DeadLetter.class, system));
```

### Example 8: How to use

```scala
object ListenerActor {
  abstract class AllKindsOfMusic { def artist: String }
  case class Jazz(artist: String) extends AllKindsOfMusic
  case class Electronic(artist: String) extends AllKindsOfMusic

  def apply(): Behavior[ListenerActor.AllKindsOfMusic] = Behaviors.receive { (context, msg) =>
    msg match {
      case m: Jazz =>
        println(s"${context.self.path.name} is listening to: ${m.artist}")
        Behaviors.same
      case m: Electronic =>
        println(s"${context.self.path.name} is listening to: ${m.artist}")
        Behaviors.same
      case _ =>
        Behaviors.same
    }
  }
}

  implicit val system: ActorSystem[SpawnProtocol.Command] = ActorSystem(SpawnProtocol(), "SpawnProtocol")
  implicit val ec: ExecutionContext = system.executionContext

  val jazzListener: Future[ActorRef[Jazz]] =
    system.ask(Spawn(behavior = ListenerActor(), name = "jazz", props = Props.empty, _))
  val musicListener: Future[ActorRef[AllKindsOfMusic]] =
    system.ask(Spawn(behavior = ListenerActor(), name = "music", props = Props.empty, _))

  for (jazzListenerRef <- jazzListener; musicListenerRef <- musicListener) {
    system.eventStream ! Subscribe(jazzListenerRef)
    system.eventStream ! Subscribe(musicListenerRef)
  }

  // only musicListener gets this message, since it listens to *all* kinds of music:
  system.eventStream ! Publish(Electronic("Parov Stelar"))

  // jazzListener and musicListener will be notified about Jazz:
  system.eventStream ! Publish(Jazz("Sonny Rollins"))
```

### Example 9: How to use

```java
interface AllKindsOfMusic {

}

class Jazz implements AllKindsOfMusic {

    public final String artist;

    public Jazz(String artist) {
        this.artist = artist;
    }
}

class Electronic implements AllKindsOfMusic {

    public final String artist;

    public Electronic(String artist) {
        this.artist = artist;
    }
}

static class Listener extends AbstractBehavior<AllKindsOfMusic> {

    public static Behavior<AllKindsOfMusic> create() {
        return Behaviors.setup(Listener::new);
    }

    public Listener(ActorContext<AllKindsOfMusic> context) {
        super(context);
    }


    @Override
    public Receive<AllKindsOfMusic> createReceive() {
        return newReceiveBuilder()
            .onMessage(Jazz.class, msg -> {
                System.out.printf("%s is listening to: %s%n",
                    getContext().getSelf().path().name(),
                    msg);
                return Behaviors.same();
            })
            .onMessage(Electronic.class, msg -> {
                System.out.printf("%s is listening to: %s%n",
                    getContext().getSelf().path().name(),
                    msg);
                return Behaviors.same();
            }).build();
    }
}
    ActorSystem<SpawnProtocol.Command> system = ActorSystem.create(SpawnProtocol.create(),
        "Subclassification");
    final Duration timeout = Duration.ofSeconds(3);

    CompletionStage<ActorRef<Jazz>> jazzListener = AskPattern.ask(
        system,
        replyTo -> new Spawn<>(Listener.create().narrow(), "jazzListener", Props.empty(), replyTo),
        timeout,
        system.scheduler()
    );

    CompletionStage<ActorRef<AllKindsOfMusic>> musicListener = AskPattern.ask(
        system,
        replyTo -> new Spawn<>(Listener.create(), "musicListener", Props.empty(), replyTo),
        timeout,
        system.scheduler()
    );

    ActorRef<Jazz> jazzListenerActorRef = jazzListener.toCompletableFuture().join();
    ActorRef<AllKindsOfMusic> musicListenerActorRef = musicListener.toCompletableFuture()
        .join();

    system.eventStream().tell(new Subscribe<>(Jazz.class, jazzListenerActorRef));
    system.eventStream().tell(new Subscribe<>(AllKindsOfMusic.class, musicListenerActorRef));
    // only musicListener gets this message, since it listens to *all* kinds of music:
    system.eventStream().tell(new Publish<>(new Electronic("Parov Stelar")));

    // jazzListener and musicListener will be notified about Jazz:
    system.eventStream().tell(new Publish<>(new Jazz("Sonny Rollins")));
```

### Example 10: Dead Letters

```scala
import akka.actor.SuppressedDeadLetter
system.eventStream ! Subscribe[SuppressedDeadLetter](listener)
```

### Example 11: Dead Letters

```java
system.eventStream().tell(new Subscribe<>(SuppressedDeadLetter.class, actor));
```

### Example 12: Dead Letters

```scala
import akka.actor.AllDeadLetters
system.eventStream ! Subscribe[AllDeadLetters](listener)
```

### Example 13: Dead Letters

```java
system.eventStream().tell(new Subscribe<>(AllDeadLetters.class, actor));
```

### Example 14: EventBus

```scala
/**
 * Attempts to register the subscriber to the specified Classifier
 * @return true if successful and false if not (because it was already
 *   subscribed to that Classifier, or otherwise)
 */
def subscribe(subscriber: Subscriber, to: Classifier): Boolean

/**
 * Attempts to deregister the subscriber from the specified Classifier
 * @return true if successful and false if not (because it wasn't subscribed
 *   to that Classifier, or otherwise)
 */
def unsubscribe(subscriber: Subscriber, from: Classifier): Boolean

/**
 * Attempts to deregister the subscriber from all Classifiers it may be subscribed to
 */
def unsubscribe(subscriber: Subscriber): Unit

/**
 * Publishes the specified Event to this bus
 */
def publish(event: Event): Unit
```

### Example 15: EventBus

```java
/**
 * Attempts to register the subscriber to the specified Classifier
 *
 * @return true if successful and false if not (because it was already subscribed to that
 *     Classifier, or otherwise)
 */
public boolean subscribe(Subscriber subscriber, Classifier to);

/**
 * Attempts to deregister the subscriber from the specified Classifier
 *
 * @return true if successful and false if not (because it wasn't subscribed to that Classifier,
 *     or otherwise)
 */
public boolean unsubscribe(Subscriber subscriber, Classifier from);

/** Attempts to deregister the subscriber from all Classifiers it may be subscribed to */
public void unsubscribe(Subscriber subscriber);

/** Publishes the specified Event to this bus */
public void publish(Event event);
```

### Example 16: Lookup Classification

```scala
import akka.event.EventBus
import akka.event.LookupClassification

final case class MsgEnvelope(topic: String, payload: Any)

/**
 * Publishes the payload of the MsgEnvelope when the topic of the
 * MsgEnvelope equals the String specified when subscribing.
 */
class LookupBusImpl extends EventBus with LookupClassification {
  type Event = MsgEnvelope
  type Classifier = String
  type Subscriber = ActorRef

  // is used for extracting the classifier from the incoming events
  override protected def classify(event: Event): Classifier = event.topic

  // will be invoked for each event for all subscribers which registered themselves
  // for the event’s classifier
  override protected def publish(event: Event, subscriber: Subscriber): Unit = {
    subscriber ! event.payload
  }

  // must define a full order over the subscribers, expressed as expected from
  // `java.lang.Comparable.compare`
  override protected def compareSubscribers(a: Subscriber, b: Subscriber): Int =
    a.compareTo(b)

  // determines the initial size of the index data structure
  // used internally (i.e. the expected number of different classifiers)
  override protected def mapSize(): Int = 128

}
```

### Example 17: Lookup Classification

```java
import akka.event.japi.LookupEventBus;

static class MsgEnvelope {
  public final String topic;
  public final Object payload;

  public MsgEnvelope(String topic, Object payload) {
    this.topic = topic;
    this.payload = payload;
  }
}

/**
 * Publishes the payload of the MsgEnvelope when the topic of the MsgEnvelope equals the String
 * specified when subscribing.
 */
static class LookupBusImpl extends LookupEventBus<MsgEnvelope, ActorRef, String> {

  // is used for extracting the classifier from the incoming events
  @Override
  public String classify(MsgEnvelope event) {
    return event.topic;
  }

  // will be invoked for each event for all subscribers which registered themselves
  // for the event’s classifier
  @Override
  public void publish(MsgEnvelope event, ActorRef subscriber) {
    subscriber.tell(event.payload, ActorRef.noSender());
  }

  // must define a full order over the subscribers, expressed as expected from
  // `java.lang.Comparable.compare`
  @Override
  public int compareSubscribers(ActorRef a, ActorRef b) {
    return a.compareTo(b);
  }

  // determines the initial size of the index data structure
  // used internally (i.e. the expected number of different classifiers)
  @Override
  public int mapSize() {
    return 128;
  }
}
```

### Example 18: Lookup Classification

```scala
val lookupBus = new LookupBusImpl
lookupBus.subscribe(testActor, "greetings")
lookupBus.publish(MsgEnvelope("time", System.currentTimeMillis()))
lookupBus.publish(MsgEnvelope("greetings", "hello"))
expectMsg("hello")
```

### Example 19: Lookup Classification

```java
LookupBusImpl lookupBus = new LookupBusImpl();
lookupBus.subscribe(getTestActor(), "greetings");
lookupBus.publish(new MsgEnvelope("time", System.currentTimeMillis()));
lookupBus.publish(new MsgEnvelope("greetings", "hello"));
expectMsgEquals("hello");
```

### Example 20: Subchannel Classification

```scala
import akka.util.Subclassification

class StartsWithSubclassification extends Subclassification[String] {
  override def isEqual(x: String, y: String): Boolean =
    x == y

  override def isSubclass(x: String, y: String): Boolean =
    x.startsWith(y)
}

import akka.event.SubchannelClassification

/**
 * Publishes the payload of the MsgEnvelope when the topic of the
 * MsgEnvelope starts with the String specified when subscribing.
 */
class SubchannelBusImpl extends EventBus with SubchannelClassification {
  type Event = MsgEnvelope
  type Classifier = String
  type Subscriber = ActorRef

  // Subclassification is an object providing `isEqual` and `isSubclass`
  // to be consumed by the other methods of this classifier
  override protected val subclassification: Subclassification[Classifier] =
    new StartsWithSubclassification

  // is used for extracting the classifier from the incoming events
  override protected def classify(event: Event): Classifier = event.topic

  // will be invoked for each event for all subscribers which registered
  // themselves for the event’s classifier
  override protected def publish(event: Event, subscriber: Subscriber): Unit = {
    subscriber ! event.payload
  }
}
```

### Example 21: Subchannel Classification

```java
import akka.event.japi.SubchannelEventBus;

static class StartsWithSubclassification implements Subclassification<String> {
  @Override
  public boolean isEqual(String x, String y) {
    return x.equals(y);
  }

  @Override
  public boolean isSubclass(String x, String y) {
    return x.startsWith(y);
  }
}

/**
 * Publishes the payload of the MsgEnvelope when the topic of the MsgEnvelope starts with the
 * String specified when subscribing.
 */
static class SubchannelBusImpl extends SubchannelEventBus<MsgEnvelope, ActorRef, String> {

  // Subclassification is an object providing `isEqual` and `isSubclass`
  // to be consumed by the other methods of this classifier
  @Override
  public Subclassification<String> subclassification() {
    return new StartsWithSubclassification();
  }

  // is used for extracting the classifier from the incoming events
  @Override
  public String classify(MsgEnvelope event) {
    return event.topic;
  }

  // will be invoked for each event for all subscribers which registered themselves
  // for the event’s classifier
  @Override
  public void publish(MsgEnvelope event, ActorRef subscriber) {
    subscriber.tell(event.payload, ActorRef.noSender());
  }
}
```

### Example 22: Subchannel Classification

```scala
val subchannelBus = new SubchannelBusImpl
subchannelBus.subscribe(testActor, "abc")
subchannelBus.publish(MsgEnvelope("xyzabc", "x"))
subchannelBus.publish(MsgEnvelope("bcdef", "b"))
subchannelBus.publish(MsgEnvelope("abc", "c"))
expectMsg("c")
subchannelBus.publish(MsgEnvelope("abcdef", "d"))
expectMsg("d")
```

### Example 23: Subchannel Classification

```java
SubchannelBusImpl subchannelBus = new SubchannelBusImpl();
subchannelBus.subscribe(getTestActor(), "abc");
subchannelBus.publish(new MsgEnvelope("xyzabc", "x"));
subchannelBus.publish(new MsgEnvelope("bcdef", "b"));
subchannelBus.publish(new MsgEnvelope("abc", "c"));
expectMsgEquals("c");
subchannelBus.publish(new MsgEnvelope("abcdef", "d"));
expectMsgEquals("d");
```

### Example 24: Scanning Classification

```scala
import akka.event.ScanningClassification

/**
 * Publishes String messages with length less than or equal to the length
 * specified when subscribing.
 */
class ScanningBusImpl extends EventBus with ScanningClassification {
  type Event = String
  type Classifier = Int
  type Subscriber = ActorRef

  // is needed for determining matching classifiers and storing them in an
  // ordered collection
  override protected def compareClassifiers(a: Classifier, b: Classifier): Int =
    if (a < b) -1 else if (a == b) 0 else 1

  // is needed for storing subscribers in an ordered collection
  override protected def compareSubscribers(a: Subscriber, b: Subscriber): Int =
    a.compareTo(b)

  // determines whether a given classifier shall match a given event; it is invoked
  // for each subscription for all received events, hence the name of the classifier
  override protected def matches(classifier: Classifier, event: Event): Boolean =
    event.length <= classifier

  // will be invoked for each event for all subscribers which registered themselves
  // for a classifier matching this event
  override protected def publish(event: Event, subscriber: Subscriber): Unit = {
    subscriber ! event
  }
}
```

### Example 25: Scanning Classification

```java
import akka.event.japi.ScanningEventBus;

/**
 * Publishes String messages with length less than or equal to the length specified when
 * subscribing.
 */
static class ScanningBusImpl extends ScanningEventBus<String, ActorRef, Integer> {

  // is needed for determining matching classifiers and storing them in an
  // ordered collection
  @Override
  public int compareClassifiers(Integer a, Integer b) {
    return a.compareTo(b);
  }

  // is needed for storing subscribers in an ordered collection
  @Override
  public int compareSubscribers(ActorRef a, ActorRef b) {
    return a.compareTo(b);
  }

  // determines whether a given classifier shall match a given event; it is invoked
  // for each subscription for all received events, hence the name of the classifier
  @Override
  public boolean matches(Integer classifier, String event) {
    return event.length() <= classifier;
  }

  // will be invoked for each event for all subscribers which registered themselves
  // for the event’s classifier
  @Override
  public void publish(String event, ActorRef subscriber) {
    subscriber.tell(event, ActorRef.noSender());
  }
}
```

### Example 26: Scanning Classification

```scala
val scanningBus = new ScanningBusImpl
scanningBus.subscribe(testActor, 3)
scanningBus.publish("xyzabc")
scanningBus.publish("ab")
expectMsg("ab")
scanningBus.publish("abc")
expectMsg("abc")
```

### Example 27: Scanning Classification

```java
ScanningBusImpl scanningBus = new ScanningBusImpl();
scanningBus.subscribe(getTestActor(), 3);
scanningBus.publish("xyzabc");
scanningBus.publish("ab");
expectMsgEquals("ab");
scanningBus.publish("abc");
expectMsgEquals("abc");
```

### Example 28: Actor Classification

```scala
import akka.event.ActorEventBus
import akka.event.ManagedActorClassification
import akka.event.ActorClassifier

final case class Notification(ref: ActorRef, id: Int)

class ActorBusImpl(val system: ActorSystem)
    extends ActorEventBus
    with ActorClassifier
    with ManagedActorClassification {
  type Event = Notification

  // is used for extracting the classifier from the incoming events
  override protected def classify(event: Event): ActorRef = event.ref

  // determines the initial size of the index data structure
  // used internally (i.e. the expected number of different classifiers)
  override protected def mapSize: Int = 128
}
```

### Example 29: Actor Classification

```java
import akka.event.japi.ManagedActorEventBus;

static class Notification {
  public final ActorRef ref;
  public final int id;

  public Notification(ActorRef ref, int id) {
    this.ref = ref;
    this.id = id;
  }
}

static class ActorBusImpl extends ManagedActorEventBus<Notification> {

  // the ActorSystem will be used for book-keeping operations, such as subscribers terminating
  public ActorBusImpl(ActorSystem system) {
    super(system);
  }

  // is used for extracting the classifier from the incoming events
  @Override
  public ActorRef classify(Notification event) {
    return event.ref;
  }

  // determines the initial size of the index data structure
  // used internally (i.e. the expected number of different classifiers)
  @Override
  public int mapSize() {
    return 128;
  }
}
```

### Example 30: Actor Classification

```scala
val observer1 = TestProbe().ref
val observer2 = TestProbe().ref
val probe1 = TestProbe()
val probe2 = TestProbe()
val subscriber1 = probe1.ref
val subscriber2 = probe2.ref
val actorBus = new ActorBusImpl(system)
actorBus.subscribe(subscriber1, observer1)
actorBus.subscribe(subscriber2, observer1)
actorBus.subscribe(subscriber2, observer2)
actorBus.publish(Notification(observer1, 100))
probe1.expectMsg(Notification(observer1, 100))
probe2.expectMsg(Notification(observer1, 100))
actorBus.publish(Notification(observer2, 101))
probe2.expectMsg(Notification(observer2, 101))
probe1.expectNoMessage(500.millis)
```

### Example 31: Actor Classification

```java
ActorRef observer1 = new TestKit(system).getRef();
ActorRef observer2 = new TestKit(system).getRef();
TestKit probe1 = new TestKit(system);
TestKit probe2 = new TestKit(system);
ActorRef subscriber1 = probe1.getRef();
ActorRef subscriber2 = probe2.getRef();
ActorBusImpl actorBus = new ActorBusImpl(system);
actorBus.subscribe(subscriber1, observer1);
actorBus.subscribe(subscriber2, observer1);
actorBus.subscribe(subscriber2, observer2);
Notification n1 = new Notification(observer1, 100);
actorBus.publish(n1);
probe1.expectMsgEquals(n1);
probe2.expectMsgEquals(n1);
Notification n2 = new Notification(observer2, 101);
actorBus.publish(n2);
probe2.expectMsgEquals(n2);
probe1.expectNoMessage(Duration.ofMillis(500));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetter.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/EventBus.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LookupClassification.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/japi/LookupEventBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/japi/EventBus.html
- https://doc.akka.io/libraries/akka-core/current/actors.html
- https://doc.akka.io/libraries/akka-core/current/event-bus.html
- https://doc.akka.io/libraries/akka-core/current/index-utilities.html
- https://doc.akka.io/libraries/akka-core/current/typed/actor-discovery.html
- https://doc.akka.io/libraries/akka-core/current/typed/actor-lifecycle.html
- https://doc.akka.io/libraries/akka-core/current/typed/distributed-pub-sub.html
- https://doc.akka.io/libraries/akka-core/current/typed/event-stream.html
- https://doc.akka.io/libraries/akka-core/current/typed/logging.html
- https://doc.akka.io/libraries/akka-core/current/typed/routers.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/event-stream.html](https://doc.akka.io/libraries/akka-core/current/typed/event-stream.html)*