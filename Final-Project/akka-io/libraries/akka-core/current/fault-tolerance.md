---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:29:36Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/fault-tolerance.html
title: Classic Fault Tolerance • Akka core
---

# Classic Fault Tolerance • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Fault Tolerance

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the full documentation of this feature and for new projects see [fault tolerance](typed/fault-tolerance.html).

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

The concept of fault tolerance relates to actors, so in order to use these make sure to depend on actors.

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
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
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

## Introduction

As explained in [Actor Systems](general/actor-systems.html) each actor is the supervisor of its children, and as such each actor defines fault handling supervisor strategy. This strategy cannot be changed afterwards as it is an integral part of the actor system’s structure.

## Fault Handling in Practice

First, let us look at a sample that illustrates one way to handle data store errors, which is a typical source of failure in real world applications. Of course it depends on the actual application what is possible to do when the data store is unavailable, but in this sample we use a best effort re\-connect approach.

Read the following source code. The inlined comments explain the different pieces of the fault handling and why they are added. It is also highly recommended to run this sample as it is easy to follow the log output to understand what is happening at runtime.

## Creating a Supervisor Strategy

The following sections explain the fault handling mechanism and alternatives in more depth.

For the sake of demonstration let us consider the following strategy:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/FaultHandlingDocSpec.scala#L27-L37 "Go to snippet source")import akka.actor.OneForOneStrategy
import akka.actor.SupervisorStrategy._
import scala.concurrent.duration._

override val supervisorStrategy =
  OneForOneStrategy(maxNrOfRetries = 10, withinTimeRange = 1 minute) {
    case _: ArithmeticException      => Resume
    case _: NullPointerException     => Restart
    case _: IllegalArgumentException => Stop
    case _: Exception                => Escalate
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/FaultHandlingTest.java#L58-L72 "Go to snippet source")private static SupervisorStrategy strategy =
    new OneForOneStrategy(
        10,
        Duration.ofMinutes(1),
        DeciderBuilder.match(ArithmeticException.class, e -> SupervisorStrategy.resume())
            .match(NullPointerException.class, e -> SupervisorStrategy.restart())
            .match(IllegalArgumentException.class, e -> SupervisorStrategy.stop())
            .matchAny(o -> SupervisorStrategy.escalate())
            .build());

@Override
public SupervisorStrategy supervisorStrategy() {
  return strategy;
}

```

We have chosen a few well\-known exception types in order to demonstrate the application of the fault handling directives described in [supervision](general/supervision.html). First off, it is a one\-for\-one strategy, meaning that each child is treated separately (an all\-for\-one strategy works very similarly, the only difference is that any decision is applied to all children of the supervisor, not only the failing one). In the above example, `10` and `1 minute``Duration.create(1, TimeUnit.MINUTES)` are passed to the `maxNrOfRetries` and `withinTimeRange` parameters respectively, which means that the strategy restarts a child up to 10 restarts per minute. The child actor is stopped if the restart count exceeds `maxNrOfRetries` during the `withinTimeRange` duration.

Also, there are special values for these parameters. If you specify:

- `-1` to `maxNrOfRetries`, and `Duration.Inf``Duration.Inf()` to `withinTimeRange`
	- then the child is always restarted without any limit
- `-1` to `maxNrOfRetries`, and a non\-infinite `Duration` to `withinTimeRange`
	- `maxNrOfRetries` is treated as `1`
- a non\-negative number to `maxNrOfRetries` and `Duration.Inf``Duration.Inf()` to `withinTimeRange`
	- `withinTimeRange` is treated as infinite duration (i.e.) no matter how long it takes, once the restart count exceeds `maxNrOfRetries`, the child actor is stopped

The match statement which forms the bulk of the body  
is of type `Decider` which is a `PartialFunction[Throwable, Directive]`. consists of `PFBuilder` returned by `DeciderBuilder`’s `match` method, where the builder is finished by the `build` method. This is the piece which maps child failure types to their corresponding directives.

Note
If the strategy is declared inside the supervising actor (as opposed to within a companion objecta separate class) its decider has access to all internal state of the actor in a thread\-safe fashion, including obtaining a reference to the currently failed child (available as the `sender``getSender()` of the failure message).

### Default Supervisor Strategy

`Escalate` is used if the defined strategy doesn’t cover the exception that was thrown.

When the supervisor strategy is not defined for an actor the following exceptions are handled by default:

- `ActorInitializationException` will stop the failing child actor
- `ActorKilledException` will stop the failing child actor
- `DeathPactException` will stop the failing child actor
- `Exception` will restart the failing child actor
- Other types of `Throwable` will be escalated to parent actor

If the exception escalate all the way up to the root guardian it will handle it in the same way as the default strategy defined above.

You can combine your own strategy with the default strategy:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/FaultHandlingDocSpec.scala#L72-L81 "Go to snippet source")import akka.actor.OneForOneStrategy
import akka.actor.SupervisorStrategy._
import scala.concurrent.duration._

override val supervisorStrategy =
  OneForOneStrategy(maxNrOfRetries = 10, withinTimeRange = 1 minute) {
    case _: ArithmeticException => Resume
    case t =>
      super.supervisorStrategy.decider.applyOrElse(t, (_: Any) => Escalate)
  }
```

### Stopping Supervisor Strategy

Closer to the Erlang way is the strategy to stop children when they fail and then take corrective action in the supervisor when DeathWatch signals the loss of the child. This strategy is also provided pre\-packaged as `SupervisorStrategy.stoppingStrategy` with an accompanying `StoppingSupervisorStrategy` configurator to be used when you want the `"/user"` guardian to apply it.

### Logging of Actor Failures

By default the `SupervisorStrategy` logs failures unless they are escalated. Escalated failures are supposed to be handled, and potentially logged, at a level higher in the hierarchy.

Log levels can be controlled by providing a `Decider` and using the appropriate decision methods accepting a `LogLevel` on `SupervisorStrategy`.

You can mute the default logging of a `SupervisorStrategy` by setting `loggingEnabled` to `false` when instantiating it. Customized logging can be done inside the `Decider`. Note that the reference to the currently failed child is available as the `sender` when the `SupervisorStrategy` is declared inside the supervising actor.

You may also customize the logging in your own `SupervisorStrategy` implementation by overriding the `logFailure` method.

## Supervision of Top\-Level Actors

Toplevel actors means those which are created using `system.actorOf()`, and they are children of the [User Guardian](supervision-classic.html#user-guardian). There are no special rules applied in this case, the guardian applies the configured strategy.

## Test Application

The following section shows the effects of the different directives in practice, where a test setup is needed. First off, we need a suitable supervisor:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/FaultHandlingDocSpec.scala#L22-L43 "Go to snippet source")import akka.actor.Actor

class Supervisor extends Actor {
  import akka.actor.OneForOneStrategy
  import akka.actor.SupervisorStrategy._
  import scala.concurrent.duration._

  override val supervisorStrategy =
    OneForOneStrategy(maxNrOfRetries = 10, withinTimeRange = 1 minute) {
      case _: ArithmeticException      => Resume
      case _: NullPointerException     => Restart
      case _: IllegalArgumentException => Stop
      case _: Exception                => Escalate
    }

  def receive = {
    case p: Props => sender() ! context.actorOf(p)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/FaultHandlingTest.java#L32-L86 "Go to snippet source")import akka.japi.pf.DeciderBuilder;
import akka.actor.SupervisorStrategy;

static class Supervisor extends AbstractActor {

  private static SupervisorStrategy strategy =
      new OneForOneStrategy(
          10,
          Duration.ofMinutes(1),
          DeciderBuilder.match(ArithmeticException.class, e -> SupervisorStrategy.resume())
              .match(NullPointerException.class, e -> SupervisorStrategy.restart())
              .match(IllegalArgumentException.class, e -> SupervisorStrategy.stop())
              .matchAny(o -> SupervisorStrategy.escalate())
              .build());

  @Override
  public SupervisorStrategy supervisorStrategy() {
    return strategy;
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Props.class,
            props -> {
              getSender().tell(getContext().actorOf(props), getSelf());
            })
        .build();
  }
}

```

This supervisor will be used to create a child, with which we can experiment:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/FaultHandlingDocSpec.scala#L22-L95 "Go to snippet source")import akka.actor.Actor

class Child extends Actor {
  var state = 0
  def receive = {
    case ex: Exception => throw ex
    case x: Int        => state = x
    case "get"         => sender() ! state
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/FaultHandlingTest.java#L132-L148 "Go to snippet source")static class Child extends AbstractActor {
  int state = 0;

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Exception.class,
            exception -> {
              throw exception;
            })
        .match(Integer.class, i -> state = i)
        .matchEquals("get", s -> getSender().tell(state, getSelf()))
        .build();
  }
}

```

The test is easier by using the utilities described in [Testing Actor Systems](testing.html)[TestKit](testing.html), where `TestProbe` provides an actor ref useful for receiving and inspecting replies.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/FaultHandlingDocSpec.scala#L12-L194 "Go to snippet source")import com.typesafe.config.{ Config, ConfigFactory }
import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike
import akka.testkit.{ EventFilter, ImplicitSender, TestKit }

class FaultHandlingDocSpec(_system: ActorSystem)
    extends TestKit(_system)
    with ImplicitSender
    with AnyWordSpecLike
    with Matchers
    with BeforeAndAfterAll {

  def this() =
    this(
      ActorSystem(
        "FaultHandlingDocSpec",
        ConfigFactory.parseString("""
      akka {
        loggers = ["akka.testkit.TestEventListener"]
        loglevel = "WARNING"
      }
      """)))

  override def afterAll(): Unit = {
    TestKit.shutdownActorSystem(system)
  }

  "A supervisor" must {
    "apply the chosen strategy for its child" in {
      // code here
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/FaultHandlingTest.java#L19-L223 "Go to snippet source")import akka.testkit.TestProbe;
import akka.testkit.ErrorFilter;
import akka.testkit.EventFilter;
import akka.testkit.TestEvent;
import static java.util.concurrent.TimeUnit.SECONDS;
import static akka.japi.Util.immutableSeq;
import static org.junit.Assert.assertEquals;

import scala.concurrent.Await;

public class FaultHandlingTest extends AbstractJavaTest {
  static ActorSystem system;
  scala.concurrent.duration.Duration timeout =
      scala.concurrent.duration.Duration.create(5, SECONDS);

  @BeforeClass
  public static void start() {
    system = ActorSystem.create("FaultHandlingTest", config);
  }

  @AfterClass
  public static void cleanup() {
    TestKit.shutdownActorSystem(system);
    system = null;
  }

  @Test
  public void mustEmploySupervisorStrategy() throws Exception {
    // code here
  }
}
```

Let us create actors:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/FaultHandlingDocSpec.scala#L132-L135 "Go to snippet source")val supervisor = system.actorOf(Props[Supervisor](), "supervisor")

supervisor ! Props[Child]()
val child = expectMsgType[ActorRef] // retrieve answer from TestKit’s testActor
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/FaultHandlingTest.java#L179-L182 "Go to snippet source")Props superprops = Props.create(Supervisor.class);
ActorRef supervisor = system.actorOf(superprops, "supervisor");
ActorRef child =
    (ActorRef) Await.result(ask(supervisor, Props.create(Child.class), 5000), timeout);
```

The first test shall demonstrate the `Resume` directive, so we try it out by setting some non\-initial state in the actor and have it fail:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/FaultHandlingDocSpec.scala#L139-L145 "Go to snippet source")child ! 42 // set state to 42
child ! "get"
expectMsg(42)

child ! new ArithmeticException // crash it
child ! "get"
expectMsg(42)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/FaultHandlingTest.java#L186-L189 "Go to snippet source")child.tell(42, ActorRef.noSender());
assertEquals(42, Await.result(ask(child, "get", 5000), timeout));
child.tell(new ArithmeticException(), ActorRef.noSender());
assertEquals(42, Await.result(ask(child, "get", 5000), timeout));
```

As you can see the value 42 survives the fault handling directive. Now, if we change the failure to a more serious `NullPointerException`, that will no longer be the case:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/FaultHandlingDocSpec.scala#L150-L152 "Go to snippet source")child ! new NullPointerException // crash it harder
child ! "get"
expectMsg(0)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/FaultHandlingTest.java#L193-L194 "Go to snippet source")child.tell(new NullPointerException(), ActorRef.noSender());
assertEquals(0, Await.result(ask(child, "get", 5000), timeout));
```

And finally in case of the fatal `IllegalArgumentException` the child will be terminated by the supervisor:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/FaultHandlingDocSpec.scala#L157-L159 "Go to snippet source")watch(child) // have testActor watch “child”
child ! new IllegalArgumentException // break it
expectMsgPF() { case Terminated(`child`) => () }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/FaultHandlingTest.java#L198-L201 "Go to snippet source")final TestProbe probe = new TestProbe(system);
probe.watch(child);
child.tell(new IllegalArgumentException(), ActorRef.noSender());
probe.expectMsgClass(Terminated.class);
```

Up to now the supervisor was completely unaffected by the child’s failure, because the directives set did handle it. In case of an `Exception`, this is not true anymore and the supervisor escalates the failure.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/FaultHandlingDocSpec.scala#L164-L173 "Go to snippet source")supervisor ! Props[Child]() // create new child
val child2 = expectMsgType[ActorRef]
watch(child2)
child2 ! "get" // verify it is alive
expectMsg(0)

child2 ! new Exception("CRASH") // escalate failure
expectMsgPF() {
  case t @ Terminated(`child2`) if t.existenceConfirmed => ()
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/FaultHandlingTest.java#L205-L209 "Go to snippet source")child = (ActorRef) Await.result(ask(supervisor, Props.create(Child.class), 5000), timeout);
probe.watch(child);
assertEquals(0, Await.result(ask(child, "get", 5000), timeout));
child.tell(new Exception(), ActorRef.noSender());
probe.expectMsgClass(Terminated.class);
```

The supervisor itself is supervised by the top\-level actor provided by the `ActorSystem`, which has the default policy to restart in case of all `Exception` cases (with the notable exceptions of `ActorInitializationException` and `ActorKilledException`). Since the default directive in case of a restart is to kill all children, we expected our poor child not to survive this failure.

In case this is not desired (which depends on the use case), we need to use a different supervisor which overrides this behavior.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/FaultHandlingDocSpec.scala#L47-L67 "Go to snippet source")class Supervisor2 extends Actor {
  import akka.actor.OneForOneStrategy
  import akka.actor.SupervisorStrategy._
  import scala.concurrent.duration._

  override val supervisorStrategy =
    OneForOneStrategy(maxNrOfRetries = 10, withinTimeRange = 1 minute) {
      case _: ArithmeticException      => Resume
      case _: NullPointerException     => Restart
      case _: IllegalArgumentException => Stop
      case _: Exception                => Escalate
    }

  def receive = {
    case p: Props => sender() ! context.actorOf(p)
  }
  // override default to kill all children during restart
  override def preRestart(cause: Throwable, msg: Option[Any]): Unit = {}
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/FaultHandlingTest.java#L91-L127 "Go to snippet source")static class Supervisor2 extends AbstractActor {

  private static SupervisorStrategy strategy =
      new OneForOneStrategy(
          10,
          Duration.ofMinutes(1),
          DeciderBuilder.match(ArithmeticException.class, e -> SupervisorStrategy.resume())
              .match(NullPointerException.class, e -> SupervisorStrategy.restart())
              .match(IllegalArgumentException.class, e -> SupervisorStrategy.stop())
              .matchAny(o -> SupervisorStrategy.escalate())
              .build());

  @Override
  public SupervisorStrategy supervisorStrategy() {
    return strategy;
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Props.class,
            props -> {
              getSender().tell(getContext().actorOf(props), getSelf());
            })
        .build();
  }

  @Override
  public void preRestart(Throwable cause, Optional<Object> msg) {
    // do not kill all children, which is the default here
  }
}

```

With this parent, the child survives the escalated restart, as demonstrated in the last test:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/FaultHandlingDocSpec.scala#L176-L187 "Go to snippet source")val supervisor2 = system.actorOf(Props[Supervisor2](), "supervisor2")

supervisor2 ! Props[Child]()
val child3 = expectMsgType[ActorRef]

child3 ! 23
child3 ! "get"
expectMsg(23)

child3 ! new Exception("CRASH")
child3 ! "get"
expectMsg(0)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/FaultHandlingTest.java#L213-L219 "Go to snippet source")superprops = Props.create(Supervisor2.class);
supervisor = system.actorOf(superprops);
child = (ActorRef) Await.result(ask(supervisor, Props.create(Child.class), 5000), timeout);
child.tell(23, ActorRef.noSender());
assertEquals(23, Await.result(ask(child, "get", 5000), timeout));
child.tell(new Exception(), ActorRef.noSender());
assertEquals(0, Await.result(ask(child, "get", 5000), timeout));
```

## Delayed restarts for classic actors

The supervision strategy to restart a classic actor only provides immediate restart. In some cases that will only trigger the same failure right away and giving things a bit of time before restarting is required to actually resolve the failure.

The `akka.pattern.BackoffSupervisor` implements the so\-called *exponential backoff supervision strategy*, starting a child actor again when it fails, each time with a growing time delay between restarts.

This pattern is useful when the started actor fails [\[1]](#1) because some external resource is not available, and we need to give it some time to start\-up again. One of the prime examples when this is useful is when a [PersistentActor](persistence.html) fails (by stopping) with a persistence failure \- which indicates that the database may be down or overloaded, in such situations it makes most sense to give it a little bit of time to recover before the persistent actor is started.

> [\[1]](#^1) A failure can be indicated in two different ways; by an actor stopping or crashing.

### Supervision strategies

There are two basic supervision strategies available for backoff:

- ‘On failure’: The supervisor will terminate and then start the supervised actor if it crashes. If the supervised actor stops normally (e.g. through `context.stop`), the supervisor will be terminated and no further attempt to start the supervised actor will be done.
- ‘On stop’: The supervisor will terminate and then start the supervised actor if it terminates in any way (consider this for `PersistentActor` since they stop on persistence failures instead of crashing)

To note that this supervision strategy does not restart the actor but rather stops and starts it. Be aware of it if you use `Stash` trait’s `AbstractActorWithStash` in combination with the backoff supervision strategy. The `preRestart` hook will not be executed if the supervised actor fails or stops and you will miss the opportunity to unstash the messages.

### Sharding

If the ‘on stop’ strategy is used for sharded actors a final termination message should be configured and used to terminate the actor on passivation. Otherwise the supervisor will just stop and start the actor again.

The termination message is configured with:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/pattern/BackoffSupervisorDocSpec.scala#L116-L119 "Go to snippet source")val supervisor = BackoffSupervisor.props(
  BackoffOpts
    .onStop(childProps, childName = "myEcho", minBackoff = 3.seconds, maxBackoff = 30.seconds, randomFactor = 0.2)
    .withFinalStopMessage(_ == StopMessage))
```

And must be used for passivation:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/pattern/BackoffSupervisorDocSpec.scala#L123 "Go to snippet source")context.parent ! Passivate(StopMessage)
```

### Simple backoff

The following snippet shows how to create a backoff supervisor which will start the given echo actor after it has stopped because of a failure, in increasing intervals of 3, 6, 12, 24 and finally 30 seconds:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/pattern/BackoffSupervisorDocSpec.scala#L19-L30 "Go to snippet source")val childProps = Props(classOf[EchoActor])

val supervisor = BackoffSupervisor.props(
  BackoffOpts.onStop(
    childProps,
    childName = "myEcho",
    minBackoff = 3.seconds,
    maxBackoff = 30.seconds,
    randomFactor = 0.2 // adds 20% "noise" to vary the intervals slightly
  ))

system.actorOf(supervisor, name = "echoSupervisor")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/pattern/BackoffSupervisorDocTest.java#L19-L30 "Go to snippet source")final Props childProps = Props.create(EchoActor.class);

final Props supervisorProps =
    BackoffSupervisor.props(
        BackoffOpts.onStop(
            childProps,
            "myEcho",
            Duration.ofSeconds(3),
            Duration.ofSeconds(30),
            0.2)); // adds 20% "noise" to vary the intervals slightly

system.actorOf(supervisorProps, "echoSupervisor");
```

Using a `randomFactor` to add a little bit of additional variance to the backoff intervals is highly recommended, in order to avoid multiple actors re\-start at the exact same point in time, for example because they were stopped due to a shared resource such as a database going down and re\-starting after the same configured interval. By adding additional randomness to the re\-start intervals the actors will start in slightly different points in time, thus avoiding large spikes of traffic hitting the recovering shared database or other resource that they all need to contact.

The `akka.pattern.BackoffSupervisor` actor can also be configured to stop and start the actor after a delay when the actor crashes and the supervision strategy decides that it should restart.

The following snippet shows how to create a backoff supervisor which will start the given echo actor after it has crashed because of some exception, in increasing intervals of 3, 6, 12, 24 and finally 30 seconds:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/pattern/BackoffSupervisorDocSpec.scala#L39-L50 "Go to snippet source")val childProps = Props(classOf[EchoActor])

val supervisor = BackoffSupervisor.props(
  BackoffOpts.onFailure(
    childProps,
    childName = "myEcho",
    minBackoff = 3.seconds,
    maxBackoff = 30.seconds,
    randomFactor = 0.2 // adds 20% "noise" to vary the intervals slightly
  ))

system.actorOf(supervisor, name = "echoSupervisor")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/pattern/BackoffSupervisorDocTest.java#L36-L47 "Go to snippet source")final Props childProps = Props.create(EchoActor.class);

final Props supervisorProps =
    BackoffSupervisor.props(
        BackoffOpts.onFailure(
            childProps,
            "myEcho",
            Duration.ofSeconds(3),
            Duration.ofSeconds(30),
            0.2)); // adds 20% "noise" to vary the intervals slightly

system.actorOf(supervisorProps, "echoSupervisor");
```

### Customization

The `akka.pattern.BackoffOnFailureOptions` and `akka.pattern.BackoffOnRestartOptions` can be used to customize the behavior of the back\-off supervisor actor. Options are: \* `withAutoReset`: The backoff is reset if no failure/stop occurs within the duration. This is the default behaviour with `minBackoff` as default value \* `withManualReset`: The child must send `BackoffSupervisor.Reset` to its backoff supervisor (parent) \* `withSupervisionStrategy`: Sets a custom `OneForOneStrategy` (as each backoff supervisor only has one child). The default strategy uses the `akka.actor.SupervisorStrategy.defaultDecider` which stops and starts the child on exceptions. \* `withMaxNrOfRetries`: Sets the maximum number of retries until the supervisor will give up (`-1` is default which means no limit of retries). Note: This is set on the supervision strategy, so setting a different strategy resets the `maxNrOfRetries`. \* `withReplyWhileStopped`: By default all messages received while the child is stopped are forwarded to dead letters. With this set, the supervisor will reply to the sender instead.

Only available on `BackoffOnStopOptions`: \* `withDefaultStoppingStrategy`: Sets a `OneForOneStrategy` with the stopping decider that stops the child on all exceptions. \* `withFinalStopMessage`: Allows to define a predicate to decide on finally stopping the child (and supervisor). Used for passivate sharded actors \- see above.

Some examples:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/pattern/BackoffSupervisorDocSpec.scala#L61-L72 "Go to snippet source")val supervisor = BackoffSupervisor.props(
  BackoffOpts
    .onStop(
      childProps,
      childName = "myEcho",
      minBackoff = 3.seconds,
      maxBackoff = 30.seconds,
      randomFactor = 0.2 // adds 20% "noise" to vary the intervals slightly
    )
    .withManualReset // the child must send BackoffSupervisor.Reset to its parent
    .withDefaultStoppingStrategy // Stop at any Exception thrown
)
```

The above code sets up a back\-off supervisor that requires the child actor to send a `akka.pattern.BackoffSupervisor.Reset` message to its parent when a message is successfully processed, resetting the back\-off. It also uses a default stopping strategy, any exception will cause the child to stop.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/pattern/BackoffSupervisorDocSpec.scala#L85-L98 "Go to snippet source")val supervisor = BackoffSupervisor.props(
  BackoffOpts
    .onFailure(
      childProps,
      childName = "myEcho",
      minBackoff = 3.seconds,
      maxBackoff = 30.seconds,
      randomFactor = 0.2 // adds 20% "noise" to vary the intervals slightly
    )
    .withAutoReset(10.seconds) // reset if the child does not throw any errors within 10 seconds
    .withSupervisorStrategy(OneForOneStrategy() {
      case _: MyException => SupervisorStrategy.Restart
      case _              => SupervisorStrategy.Escalate
    }))
```

The above code sets up a back\-off supervisor that stops and starts the child after back\-off if MyException is thrown, any other exception will be escalated. The back\-off is automatically reset if the child does not throw any errors within 10 seconds.

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
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
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

### Example 4: Creating a Supervisor Strategy

```scala
import akka.actor.OneForOneStrategy
import akka.actor.SupervisorStrategy._
import scala.concurrent.duration._

override val supervisorStrategy =
  OneForOneStrategy(maxNrOfRetries = 10, withinTimeRange = 1 minute) {
    case _: ArithmeticException      => Resume
    case _: NullPointerException     => Restart
    case _: IllegalArgumentException => Stop
    case _: Exception                => Escalate
  }
```

### Example 5: Creating a Supervisor Strategy

```java
private static SupervisorStrategy strategy =
    new OneForOneStrategy(
        10,
        Duration.ofMinutes(1),
        DeciderBuilder.match(ArithmeticException.class, e -> SupervisorStrategy.resume())
            .match(NullPointerException.class, e -> SupervisorStrategy.restart())
            .match(IllegalArgumentException.class, e -> SupervisorStrategy.stop())
            .matchAny(o -> SupervisorStrategy.escalate())
            .build());

@Override
public SupervisorStrategy supervisorStrategy() {
  return strategy;
}
```

### Example 6: Default Supervisor Strategy

```scala
import akka.actor.OneForOneStrategy
import akka.actor.SupervisorStrategy._
import scala.concurrent.duration._

override val supervisorStrategy =
  OneForOneStrategy(maxNrOfRetries = 10, withinTimeRange = 1 minute) {
    case _: ArithmeticException => Resume
    case t =>
      super.supervisorStrategy.decider.applyOrElse(t, (_: Any) => Escalate)
  }
```

### Example 7: Test Application

```scala
import akka.actor.Actor

class Supervisor extends Actor {
  import akka.actor.OneForOneStrategy
  import akka.actor.SupervisorStrategy._
  import scala.concurrent.duration._

  override val supervisorStrategy =
    OneForOneStrategy(maxNrOfRetries = 10, withinTimeRange = 1 minute) {
      case _: ArithmeticException      => Resume
      case _: NullPointerException     => Restart
      case _: IllegalArgumentException => Stop
      case _: Exception                => Escalate
    }

  def receive = {
    case p: Props => sender() ! context.actorOf(p)
  }
}
```

### Example 8: Test Application

```java
import akka.japi.pf.DeciderBuilder;
import akka.actor.SupervisorStrategy;

static class Supervisor extends AbstractActor {

  private static SupervisorStrategy strategy =
      new OneForOneStrategy(
          10,
          Duration.ofMinutes(1),
          DeciderBuilder.match(ArithmeticException.class, e -> SupervisorStrategy.resume())
              .match(NullPointerException.class, e -> SupervisorStrategy.restart())
              .match(IllegalArgumentException.class, e -> SupervisorStrategy.stop())
              .matchAny(o -> SupervisorStrategy.escalate())
              .build());

  @Override
  public SupervisorStrategy supervisorStrategy() {
    return strategy;
  }


  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Props.class,
            props -> {
              getSender().tell(getContext().actorOf(props), getSelf());
            })
        .build();
  }
}
```

### Example 9: Test Application

```scala
import akka.actor.Actor

class Child extends Actor {
  var state = 0
  def receive = {
    case ex: Exception => throw ex
    case x: Int        => state = x
    case "get"         => sender() ! state
  }
}
```

### Example 10: Test Application

```java
static class Child extends AbstractActor {
  int state = 0;

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Exception.class,
            exception -> {
              throw exception;
            })
        .match(Integer.class, i -> state = i)
        .matchEquals("get", s -> getSender().tell(state, getSelf()))
        .build();
  }
}
```

### Example 11: Test Application

```scala
import com.typesafe.config.{ Config, ConfigFactory }
import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike
import akka.testkit.{ EventFilter, ImplicitSender, TestKit }

class FaultHandlingDocSpec(_system: ActorSystem)
    extends TestKit(_system)
    with ImplicitSender
    with AnyWordSpecLike
    with Matchers
    with BeforeAndAfterAll {

  def this() =
    this(
      ActorSystem(
        "FaultHandlingDocSpec",
        ConfigFactory.parseString("""
      akka {
        loggers = ["akka.testkit.TestEventListener"]
        loglevel = "WARNING"
      }
      """)))

  override def afterAll(): Unit = {
    TestKit.shutdownActorSystem(system)
  }

  "A supervisor" must {
    "apply the chosen strategy for its child" in {
      // code here
    }
  }
}
```

### Example 12: Test Application

```java
import akka.testkit.TestProbe;
import akka.testkit.ErrorFilter;
import akka.testkit.EventFilter;
import akka.testkit.TestEvent;
import static java.util.concurrent.TimeUnit.SECONDS;
import static akka.japi.Util.immutableSeq;
import static org.junit.Assert.assertEquals;

import scala.concurrent.Await;

public class FaultHandlingTest extends AbstractJavaTest {
  static ActorSystem system;
  scala.concurrent.duration.Duration timeout =
      scala.concurrent.duration.Duration.create(5, SECONDS);

  @BeforeClass
  public static void start() {
    system = ActorSystem.create("FaultHandlingTest", config);
  }

  @AfterClass
  public static void cleanup() {
    TestKit.shutdownActorSystem(system);
    system = null;
  }

  @Test
  public void mustEmploySupervisorStrategy() throws Exception {
    // code here
  }
}
```

### Example 13: Test Application

```scala
val supervisor = system.actorOf(Props[Supervisor](), "supervisor")

supervisor ! Props[Child]()
val child = expectMsgType[ActorRef] // retrieve answer from TestKit’s testActor
```

### Example 14: Test Application

```java
Props superprops = Props.create(Supervisor.class);
ActorRef supervisor = system.actorOf(superprops, "supervisor");
ActorRef child =
    (ActorRef) Await.result(ask(supervisor, Props.create(Child.class), 5000), timeout);
```

### Example 15: Test Application

```scala
child ! 42 // set state to 42
child ! "get"
expectMsg(42)

child ! new ArithmeticException // crash it
child ! "get"
expectMsg(42)
```

### Example 16: Test Application

```java
child.tell(42, ActorRef.noSender());
assertEquals(42, Await.result(ask(child, "get", 5000), timeout));
child.tell(new ArithmeticException(), ActorRef.noSender());
assertEquals(42, Await.result(ask(child, "get", 5000), timeout));
```

### Example 17: Test Application

```scala
child ! new NullPointerException // crash it harder
child ! "get"
expectMsg(0)
```

### Example 18: Test Application

```java
child.tell(new NullPointerException(), ActorRef.noSender());
assertEquals(0, Await.result(ask(child, "get", 5000), timeout));
```

### Example 19: Test Application

```scala
watch(child) // have testActor watch “child”
child ! new IllegalArgumentException // break it
expectMsgPF() { case Terminated(`child`) => () }
```

### Example 20: Test Application

```java
final TestProbe probe = new TestProbe(system);
probe.watch(child);
child.tell(new IllegalArgumentException(), ActorRef.noSender());
probe.expectMsgClass(Terminated.class);
```

### Example 21: Test Application

```scala
supervisor ! Props[Child]() // create new child
val child2 = expectMsgType[ActorRef]
watch(child2)
child2 ! "get" // verify it is alive
expectMsg(0)

child2 ! new Exception("CRASH") // escalate failure
expectMsgPF() {
  case t @ Terminated(`child2`) if t.existenceConfirmed => ()
}
```

### Example 22: Test Application

```java
child = (ActorRef) Await.result(ask(supervisor, Props.create(Child.class), 5000), timeout);
probe.watch(child);
assertEquals(0, Await.result(ask(child, "get", 5000), timeout));
child.tell(new Exception(), ActorRef.noSender());
probe.expectMsgClass(Terminated.class);
```

### Example 23: Test Application

```scala
class Supervisor2 extends Actor {
  import akka.actor.OneForOneStrategy
  import akka.actor.SupervisorStrategy._
  import scala.concurrent.duration._

  override val supervisorStrategy =
    OneForOneStrategy(maxNrOfRetries = 10, withinTimeRange = 1 minute) {
      case _: ArithmeticException      => Resume
      case _: NullPointerException     => Restart
      case _: IllegalArgumentException => Stop
      case _: Exception                => Escalate
    }

  def receive = {
    case p: Props => sender() ! context.actorOf(p)
  }
  // override default to kill all children during restart
  override def preRestart(cause: Throwable, msg: Option[Any]): Unit = {}
}
```

### Example 24: Test Application

```java
static class Supervisor2 extends AbstractActor {

  private static SupervisorStrategy strategy =
      new OneForOneStrategy(
          10,
          Duration.ofMinutes(1),
          DeciderBuilder.match(ArithmeticException.class, e -> SupervisorStrategy.resume())
              .match(NullPointerException.class, e -> SupervisorStrategy.restart())
              .match(IllegalArgumentException.class, e -> SupervisorStrategy.stop())
              .matchAny(o -> SupervisorStrategy.escalate())
              .build());

  @Override
  public SupervisorStrategy supervisorStrategy() {
    return strategy;
  }


  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Props.class,
            props -> {
              getSender().tell(getContext().actorOf(props), getSelf());
            })
        .build();
  }

  @Override
  public void preRestart(Throwable cause, Optional<Object> msg) {
    // do not kill all children, which is the default here
  }
}
```

### Example 25: Test Application

```scala
val supervisor2 = system.actorOf(Props[Supervisor2](), "supervisor2")

supervisor2 ! Props[Child]()
val child3 = expectMsgType[ActorRef]

child3 ! 23
child3 ! "get"
expectMsg(23)

child3 ! new Exception("CRASH")
child3 ! "get"
expectMsg(0)
```

### Example 26: Test Application

```java
superprops = Props.create(Supervisor2.class);
supervisor = system.actorOf(superprops);
child = (ActorRef) Await.result(ask(supervisor, Props.create(Child.class), 5000), timeout);
child.tell(23, ActorRef.noSender());
assertEquals(23, Await.result(ask(child, "get", 5000), timeout));
child.tell(new Exception(), ActorRef.noSender());
assertEquals(0, Await.result(ask(child, "get", 5000), timeout));
```

### Example 27: Sharding

```scala
val supervisor = BackoffSupervisor.props(
  BackoffOpts
    .onStop(childProps, childName = "myEcho", minBackoff = 3.seconds, maxBackoff = 30.seconds, randomFactor = 0.2)
    .withFinalStopMessage(_ == StopMessage))
```

### Example 28: Sharding

```scala
context.parent ! Passivate(StopMessage)
```

### Example 29: Simple backoff

```scala
val childProps = Props(classOf[EchoActor])

val supervisor = BackoffSupervisor.props(
  BackoffOpts.onStop(
    childProps,
    childName = "myEcho",
    minBackoff = 3.seconds,
    maxBackoff = 30.seconds,
    randomFactor = 0.2 // adds 20% "noise" to vary the intervals slightly
  ))

system.actorOf(supervisor, name = "echoSupervisor")
```

### Example 30: Simple backoff

```java
final Props childProps = Props.create(EchoActor.class);

final Props supervisorProps =
    BackoffSupervisor.props(
        BackoffOpts.onStop(
            childProps,
            "myEcho",
            Duration.ofSeconds(3),
            Duration.ofSeconds(30),
            0.2)); // adds 20% "noise" to vary the intervals slightly

system.actorOf(supervisorProps, "echoSupervisor");
```

### Example 31: Simple backoff

```scala
val childProps = Props(classOf[EchoActor])

val supervisor = BackoffSupervisor.props(
  BackoffOpts.onFailure(
    childProps,
    childName = "myEcho",
    minBackoff = 3.seconds,
    maxBackoff = 30.seconds,
    randomFactor = 0.2 // adds 20% "noise" to vary the intervals slightly
  ))

system.actorOf(supervisor, name = "echoSupervisor")
```

### Example 32: Simple backoff

```java
final Props childProps = Props.create(EchoActor.class);

final Props supervisorProps =
    BackoffSupervisor.props(
        BackoffOpts.onFailure(
            childProps,
            "myEcho",
            Duration.ofSeconds(3),
            Duration.ofSeconds(30),
            0.2)); // adds 20% "noise" to vary the intervals slightly

system.actorOf(supervisorProps, "echoSupervisor");
```

### Example 33: Customization

```scala
val supervisor = BackoffSupervisor.props(
  BackoffOpts
    .onStop(
      childProps,
      childName = "myEcho",
      minBackoff = 3.seconds,
      maxBackoff = 30.seconds,
      randomFactor = 0.2 // adds 20% "noise" to vary the intervals slightly
    )
    .withManualReset // the child must send BackoffSupervisor.Reset to its parent
    .withDefaultStoppingStrategy // Stop at any Exception thrown
)
```

### Example 34: Customization

```scala
val supervisor = BackoffSupervisor.props(
  BackoffOpts
    .onFailure(
      childProps,
      childName = "myEcho",
      minBackoff = 3.seconds,
      maxBackoff = 30.seconds,
      randomFactor = 0.2 // adds 20% "noise" to vary the intervals slightly
    )
    .withAutoReset(10.seconds) // reset if the child does not throw any errors within 10 seconds
    .withSupervisorStrategy(OneForOneStrategy() {
      case _: MyException => SupervisorStrategy.Restart
      case _              => SupervisorStrategy.Escalate
    }))
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/dispatchers.html
- https://doc.akka.io/libraries/akka-core/current/general/actor-systems.html
- https://doc.akka.io/libraries/akka-core/current/general/supervision.html
- https://doc.akka.io/libraries/akka-core/current/persistence.html
- https://doc.akka.io/libraries/akka-core/current/supervision-classic.html
- https://doc.akka.io/libraries/akka-core/current/testing.html
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-core/current/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/current/typed/fault-tolerance.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/fault-tolerance.html](https://doc.akka.io/libraries/akka-core/current/fault-tolerance.html)*