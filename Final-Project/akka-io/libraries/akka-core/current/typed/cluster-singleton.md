---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:27Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/cluster-singleton.html
title: Cluster Singleton • Akka core
---

# Cluster Singleton • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Cluster Singleton

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Cluster Singleton](../cluster-singleton.html).

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Cluster Singleton, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
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
      <version>2.10.17</version>
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
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}"
}
```

| Project Info: Akka Cluster (typed) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-cluster\-typed 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.cluster.typed |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.6\.0, 2019\-11\-06 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## Introduction

For some use cases it is convenient and sometimes also mandatory to ensure that you have exactly one actor of a certain type running somewhere in the cluster.

Some examples:

- single point of responsibility for certain cluster\-wide consistent decisions, or coordination of actions across the cluster system
- single entry point to an external system
- single master, many workers
- centralized naming service, or routing logic

Using a singleton should not be the first design choice. It has several drawbacks, such as single\-point of bottleneck. Single\-point of failure is also a relevant concern, but for some cases this feature takes care of that by making sure that another singleton instance will eventually be started.

Warning
Make sure to not use a Cluster downing strategy that may split the cluster into several separate clusters in case of network problems or system overload (long GC pauses), since that will result in in *multiple Singletons* being started, one in each separate cluster! See [Downing](cluster.html#downing).

### Singleton manager

The cluster singleton pattern manages one singleton actor instance among all cluster nodes or a group of nodes tagged with a specific role. The singleton manager is an actor that is supposed to be started with [`ClusterSingleton.init`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingleton.html#init[M](singleton:akka.cluster.typed.SingletonActor[M]):akka.actor.typed.ActorRef[M] "akka.cluster.typed.ClusterSingleton")[`ClusterSingleton.init`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingleton.html#init(akka.cluster.typed.SingletonActor) "akka.cluster.typed.ClusterSingleton") as early as possible on all nodes, or all nodes with specified role, in the cluster. 

The actual singleton actor is

- Started on the oldest node by creating a child actor from supplied [`Behavior`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior"). It makes sure that at most one singleton instance is running at any point in time.
- Always running on the oldest member with specified role.

The oldest member is determined by [`akka.cluster.Member#isOlderThan`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/Member.html#isOlderThan(other:akka.cluster.Member):Boolean "akka.cluster.Member")[`akka.cluster.Member#isOlderThan`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Member.html#isOlderThan(akka.cluster.Member) "akka.cluster.Member") This can change when removing that member from the cluster. Be aware that there is a short time period when there is no active singleton during the hand\-over process.

When the oldest node is [Leaving](cluster.html#leaving) the cluster there is an exchange from the oldest and the new oldest before a new singleton is started up.

The cluster [failure detector](cluster.html#failure-detector) will notice when oldest node becomes unreachable due to things like JVM crash, hard shut down, or network failure. After [Downing](cluster.html#downing) and removing that node the a new oldest node will take over and a new singleton actor is created. For these failure scenarios there will not be a graceful hand\-over, but more than one active singletons is prevented by all reasonable means. Some corner cases are eventually resolved by configurable timeouts. Additional safety can be added by using a [Lease](cluster-singleton.html#lease). 

### Singleton proxy

To communicate with a given named singleton in the cluster you can access it though a proxy [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef"). When calling [`ClusterSingleton.init`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingleton.html#init[M](singleton:akka.cluster.typed.SingletonActor[M]):akka.actor.typed.ActorRef[M] "akka.cluster.typed.ClusterSingleton")[`ClusterSingleton.init`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingleton.html#init(akka.cluster.typed.SingletonActor) "akka.cluster.typed.ClusterSingleton") for a given `singletonName` on a node an `ActorRef` is returned. It is to this `ActorRef` that you can send messages to the singleton instance, independent of which node the singleton instance is active. `ClusterSingleton.init` can be called multiple times, if there already is a singleton manager running on this node, no additional manager is started, and if there is one running an `ActorRef` to the proxy is returned.

The proxy will route all messages to the current instance of the singleton, and keep track of the oldest node in the cluster and discover the singleton’s `ActorRef`. There might be periods of time during which the singleton is unavailable, e.g., when a node leaves the cluster. In these cases, the proxy will buffer the messages sent to the singleton and then deliver them when the singleton is finally available. If the buffer is full the proxy will drop old messages when new messages are sent via the proxy. The size of the buffer is configurable and it can be disabled by using a buffer size of 0\.

It’s worth noting that messages can always be lost because of the distributed nature of these actors. As always, additional logic should be implemented in the singleton (acknowledgement) and in the client (retry) actors to ensure at\-least\-once message delivery.

The singleton instance will not run on members with status [WeaklyUp](cluster-membership.html#weaklyup-members).

## Potential problems to be aware of

This pattern may seem to be very tempting to use at first, but it has several drawbacks, some of them are listed below:

- The cluster singleton may quickly become a *performance bottleneck*.
- You can not rely on the cluster singleton to be *non\-stop* available — e.g. when the node on which the singleton has been running dies, it will take a few seconds for this to be noticed and the singleton be migrated to another node.
- If many singletons are used be aware of that all will run on the oldest node (or oldest with configured role). [Cluster Sharding](cluster-sharding.html) combined with keeping the “singleton” entities alive can be a better alternative.

Warning
Make sure to not use a Cluster downing strategy that may split the cluster into several separate clusters in case of network problems or system overload (long GC pauses), since that will result in in *multiple Singletons* being started, one in each separate cluster! See [Downing](cluster.html#downing).

## Example

Any [`Behavior`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") can be run as a singleton. E.g. a basic counter:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/SingletonCompileOnlySpec.scala#L21-L43 "Go to snippet source")object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Int]) extends Command
  case object GoodByeCounter extends Command

  def apply(): Behavior[Command] = {
    def updated(value: Int): Behavior[Command] = {
      Behaviors.receiveMessage[Command] {
        case Increment =>
          updated(value + 1)
        case GetValue(replyTo) =>
          replyTo ! value
          Behaviors.same
        case GoodByeCounter =>
          // Possible async action then stop
          Behaviors.stopped
      }
    }

    updated(0)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/SingletonCompileOnlyTest.java#L25-L78 "Go to snippet source")public class Counter extends AbstractBehavior<Counter.Command> {

  public interface Command {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    private final ActorRef<Integer> replyTo;

    public GetValue(ActorRef<Integer> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public enum GoodByeCounter implements Command {
    INSTANCE
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(Counter::new);
  }

  private int value = 0;

  private Counter(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Increment.class, msg -> onIncrement())
        .onMessage(GetValue.class, this::onGetValue)
        .onMessage(GoodByeCounter.class, msg -> onGoodByCounter())
        .build();
  }

  private Behavior<Command> onIncrement() {
    value++;
    return this;
  }

  private Behavior<Command> onGetValue(GetValue msg) {
    msg.replyTo.tell(value);
    return this;
  }

  private Behavior<Command> onGoodByCounter() {
    // Possible async action then stop
    return this;
  }
}
```

Then on every node in the cluster, or every node with a given role, use the [`ClusterSingleton`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingleton$.html "akka.cluster.typed.ClusterSingleton")[`ClusterSingleton`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingleton.html "akka.cluster.typed.ClusterSingleton") extension to spawn the singleton. An instance will per data centre of the cluster:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/SingletonCompileOnlySpec.scala#L47-L55 "Go to snippet source")import akka.cluster.typed.ClusterSingleton
import akka.cluster.typed.SingletonActor

val singletonManager = ClusterSingleton(system)
// Start if needed and provide a proxy to a named singleton
val proxy: ActorRef[Counter.Command] = singletonManager.init(
  SingletonActor(Behaviors.supervise(Counter()).onFailure[Exception](SupervisorStrategy.restart), "GlobalCounter"))

proxy ! Counter.Increment
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/SingletonCompileOnlyTest.java#L16-L19 "Go to snippet source")import akka.cluster.typed.ClusterSingleton;
import akka.cluster.typed.ClusterSingletonSettings;
import akka.cluster.typed.SingletonActor;

ClusterSingleton singleton = ClusterSingleton.get(system);
// Start if needed and provide a proxy to a named singleton
ActorRef<Counter.Command> proxy =
    singleton.init(SingletonActor.of(Counter.create(), "GlobalCounter"));

proxy.tell(Counter.Increment.INSTANCE);
```

## Supervision

The default [supervision strategy](fault-tolerance.html) when an exception is thrown is for an actor to be stopped. The above example overrides this to `restart` to ensure it is always running. Another option would be to restart with a backoff: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/SingletonCompileOnlySpec.scala#L64-L69 "Go to snippet source")val proxyBackOff: ActorRef[Counter.Command] = singletonManager.init(
  SingletonActor(
    Behaviors
      .supervise(Counter())
      .onFailure[Exception](SupervisorStrategy.restartWithBackoff(1.second, 10.seconds, 0.2)),
    "GlobalCounter"))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/SingletonCompileOnlyTest.java#L109-L117 "Go to snippet source")ClusterSingleton singleton = ClusterSingleton.get(system);
ActorRef<Counter.Command> proxy =
    singleton.init(
        SingletonActor.of(
            Behaviors.supervise(Counter.create())
                .onFailure(
                    SupervisorStrategy.restartWithBackoff(
                        Duration.ofSeconds(1), Duration.ofSeconds(10), 0.2)),
            "GlobalCounter"));
```

Be aware that this means there will be times when the singleton won’t be running as restart is delayed. See [Fault Tolerance](fault-tolerance.html) for a full list of supervision options.

## Application specific stop message

An application specific `stopMessage` can be used to close the resources before actually stopping the singleton actor. This `stopMessage` is sent to the singleton actor to tell it to finish its work, close resources, and stop. The hand\-over to the new oldest node is completed when the singleton actor is terminated. If the shutdown logic does not include any asynchronous actions it can be executed in the [`PostStop`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop$.html "akka.actor.typed.PostStop")[`PostStop`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html "akka.actor.typed.PostStop") signal handler.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/SingletonCompileOnlySpec.scala#L59-L60 "Go to snippet source")val singletonActor = SingletonActor(Counter(), "GlobalCounter").withStopMessage(Counter.GoodByeCounter)
singletonManager.init(singletonActor)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/SingletonCompileOnlyTest.java#L99-L102 "Go to snippet source")SingletonActor<Counter.Command> counterSingleton =
    SingletonActor.of(Counter.create(), "GlobalCounter")
        .withStopMessage(Counter.GoodByeCounter.INSTANCE);
ActorRef<Counter.Command> proxy = singleton.init(counterSingleton);
```

## Lease

A [lease](../coordination.html) can be used as an additional safety measure to ensure that two singletons don’t run at the same time. Reasons for how this can happen:

- Network partitions without an appropriate downing provider
- Mistakes in the deployment process leading to two separate Akka Clusters
- Timing issues between removing members from the Cluster on one side of a network partition and shutting them down on the other side

A lease can be a final backup that means that the singleton actor won’t be created unless the lease can be acquired. 

To use a lease for every singleton in an application set `akka.cluster.singleton.use-lease` to the configuration location of the lease to use. A lease with the name `<actor system name>-singleton-<singleton actor path>` is used and the owner is set to the `Cluster(system).selfAddress.hostPort``Cluster.get(system).selfAddress().hostPort()`.

Note that the `akka.cluster.singleton.lease-name` configuration key is ignored and cannot be used to configure singleton lease names.

It is also possible to configure one individual singleton to use lease by defining a lease config block specifically for it:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/LeaseDocSpec.scala#L22-L26 "Go to snippet source")my.app.my-singleton-lease {
  use-lease = "akka.coordination.lease.kubernetes"
  lease-retry-interval = 5s
  lease-name = "my-pingpong-singleton-lease"
}
```

And then setting that into [`LeaseUsageSettings`](https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseUsageSettings.html "akka.coordination.lease.LeaseUsageSettings")[`LeaseUsageSettings`](https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/LeaseUsageSettings.html "akka.coordination.lease.LeaseUsageSettings") that can be set in the [`ClusterSingletonSettings`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingletonSettings.html "akka.cluster.typed.ClusterSingletonSettings")[`ClusterSingletonSettings`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingletonSettings.html "akka.cluster.typed.ClusterSingletonSettings"):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/LeaseDocSpec.scala#L37-L44 "Go to snippet source")val settings =
  ClusterSingletonSettings(system).withLeaseSettings(
    LeaseUsageSettings(system.settings.config.getConfig("my.app.my-singleton-lease")))
val singletonActor = SingletonActor(pingPong, "ping-pong").withStopMessage(Perish).withSettings(settings)
  ClusterSingleton(system).init(singletonActor)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/LeaseDocExample.java#L32-L41 "Go to snippet source")LeaseUsageSettings leaseSettings =
    LeaseUsageSettings.create(
        system.settings().config().getConfig("my.app.my-singleton-lease"));
ClusterSingletonSettings settings =
    ClusterSingletonSettings.create(system).withLeaseSettings(leaseSettings);
SingletonActor<PingPong.Command> singletonActor =
    SingletonActor.of(PingPong.create(), "ping-pong")
        .withStopMessage(new PingPong.Perish())
        .withSettings(settings);
ClusterSingleton.get(system).init(singletonActor);
```

Or programmatically specifying the lease settings:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/LeaseDocSpec.scala#L52-L54 "Go to snippet source")val settings = ClusterSingletonSettings(system).withLeaseSettings(
  LeaseUsageSettings("akka.coordination.lease.kubernetes", 5.seconds, "my-pingpong-singleton-lease"))
val singletonActor = SingletonActor(pingPong, "ping-pong").withStopMessage(Perish).withSettings(settings)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/LeaseDocExample.java#L48-L58 "Go to snippet source")ClusterSingletonSettings settings =
    ClusterSingletonSettings.create(system)
        .withLeaseSettings(
            LeaseUsageSettings.create(
                "akka.coordination.lease.kubernetes",
                Duration.ofSeconds(5),
                "my-pingpong-singleton-lease"));
SingletonActor<PingPong.Command> singletonActor =
    SingletonActor.of(PingPong.create(), "ping-pong")
        .withStopMessage(new PingPong.Perish())
        .withSettings(settings);
```

If the cluster singleton manager can’t acquire the lease it will keep retrying while it is the oldest node in the cluster. If the lease is lost then the singleton actor will be terminated then the lease will be re\-tried.

## Accessing singleton of another data centre

TODO [\#27705](https://github.com/akka/akka-core/issues/27705)

## Configuration

The following configuration properties are read by the [`ClusterSingletonManagerSettings`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerSettings.html "akka.cluster.singleton.ClusterSingletonManagerSettings")[`ClusterSingletonManagerSettings`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerSettings.html "akka.cluster.singleton.ClusterSingletonManagerSettings") when created with a [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") parameter. It is also possible to amend the `ClusterSingletonManagerSettings` or create it from another config section with the same layout as below. `ClusterSingletonManagerSettings` is a parameter to the [`ClusterSingletonManager.props`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager$.html#props(singletonProps:akka.actor.Props,terminationMessage:Any,settings:akka.cluster.singleton.ClusterSingletonManagerSettings):akka.actor.Props "akka.cluster.singleton.ClusterSingletonManager")[`ClusterSingletonManager.props`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.html#props(akka.actor.Props,java.lang.Object,akka.cluster.singleton.ClusterSingletonManagerSettings) "akka.cluster.singleton.ClusterSingletonManager") factory method, i.e. each singleton can be configured with different settings if needed.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/resources/reference.conf#L56-L100 "Go to snippet source")akka.cluster.singleton {
  # The actor name of the child singleton actor.
  singleton-name = "singleton"
  
  # Singleton among the nodes tagged with specified role.
  # If the role is not specified it's a singleton among all nodes in the cluster.
  role = ""
  
  # When a node is becoming oldest it sends hand-over request to previous oldest, 
  # that might be leaving the cluster. This is retried with this interval until 
  # the previous oldest confirms that the hand over has started or the previous 
  # oldest member is removed from the cluster (+ akka.cluster.down-removal-margin).
  hand-over-retry-interval = 1s
  
  # The number of retries are derived from hand-over-retry-interval and
  # akka.cluster.down-removal-margin (or ClusterSingletonManagerSettings.removalMargin),
  # but it will never be less than this property.
  # After the hand over retries and it's still not able to exchange the hand over messages
  # with the previous oldest it will restart itself by throwing ClusterSingletonManagerIsStuck,
  # to start from a clean state. After that it will still not start the singleton instance
  # until the previous oldest node has been removed from the cluster.
  # On the other side, on the previous oldest node, the same number of retries - 3 are used
  # and after that the singleton instance is stopped.
  # For large clusters it might be necessary to increase this to avoid too early timeouts while
  # gossip dissemination of the Leaving to Exiting phase occurs. For normal leaving scenarios
  # it will not be a quicker hand over by reducing this value, but in extreme failure scenarios
  # the recovery might be faster.
  min-number-of-hand-over-retries = 15

  # Config path of the lease to be taken before creating the singleton actor
  # if the lease is lost then the actor is restarted and it will need to re-acquire the lease
  # the default is no lease
  use-lease = ""

  # The interval between retries for acquiring the lease
  lease-retry-interval = 5s

  # Custom lease name. Note that if you have several singletons each one must have a unique
  # lease name, which can be defined with the leaseSettings of ClusterSingletonSettings.
  # If undefined it will be derived from ActorSystem name and singleton actor path,
  # but that may result in too long lease names.
  # Note that for typed cluster it is not possible to change this through configuration
  # any value here is ignored, custom names must be set through programmatic API.
  lease-name = ""
}
```

The following configuration properties are read by the [`ClusterSingletonSettings`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingletonSettings.html "akka.cluster.typed.ClusterSingletonSettings")[`ClusterSingletonSettings`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingletonSettings.html "akka.cluster.typed.ClusterSingletonSettings") when created with a [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") parameter. `ClusterSingletonSettings` is an optional parameter in [`ClusterSingleton.init`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingleton.html#init[M](singleton:akka.cluster.typed.SingletonActor[M]):akka.actor.typed.ActorRef[M] "akka.cluster.typed.ClusterSingleton")[`ClusterSingleton.init`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingleton.html#init(akka.cluster.typed.SingletonActor) "akka.cluster.typed.ClusterSingleton"). It is also possible to amend the [`ClusterSingletonProxySettings`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html "akka.cluster.singleton.ClusterSingletonProxySettings")[`ClusterSingletonProxySettings`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html "akka.cluster.singleton.ClusterSingletonProxySettings") or create it from another config section with the same layout as below.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/resources/reference.conf#L104-L125 "Go to snippet source")akka.cluster.singleton-proxy {
  # The actor name of the singleton actor that is started by the ClusterSingletonManager
  singleton-name = ${akka.cluster.singleton.singleton-name}
  
  # The role of the cluster nodes where the singleton can be deployed.
  # Corresponding to the role used by the `ClusterSingletonManager`. If the role is not
  # specified it's a singleton among all nodes in the cluster, and the `ClusterSingletonManager`
  # must then also be configured in same way.
  role = ""
  
  # Interval at which the proxy will try to resolve the singleton instance.
  singleton-identification-interval = 1s
  
  # If the location of the singleton is unknown the proxy will buffer this
  # number of messages and deliver them when the singleton is identified. 
  # When the buffer is full old messages will be dropped when new messages are
  # sent via the proxy.
  # Use 0 to disable buffering, i.e. messages will be dropped immediately if
  # the location of the singleton is unknown.
  # Maximum allowed buffer size is 10000.
  buffer-size = 1000 
}
```

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-typed" % AkkaVersion
```

### Example 2: Module info

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
    <artifactId>akka-cluster-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}"
}
```

### Example 4: Example

```scala
object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Int]) extends Command
  case object GoodByeCounter extends Command

  def apply(): Behavior[Command] = {
    def updated(value: Int): Behavior[Command] = {
      Behaviors.receiveMessage[Command] {
        case Increment =>
          updated(value + 1)
        case GetValue(replyTo) =>
          replyTo ! value
          Behaviors.same
        case GoodByeCounter =>
          // Possible async action then stop
          Behaviors.stopped
      }
    }

    updated(0)
  }
}
```

### Example 5: Example

```java
public class Counter extends AbstractBehavior<Counter.Command> {

  public interface Command {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    private final ActorRef<Integer> replyTo;

    public GetValue(ActorRef<Integer> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public enum GoodByeCounter implements Command {
    INSTANCE
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(Counter::new);
  }

  private int value = 0;

  private Counter(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Increment.class, msg -> onIncrement())
        .onMessage(GetValue.class, this::onGetValue)
        .onMessage(GoodByeCounter.class, msg -> onGoodByCounter())
        .build();
  }

  private Behavior<Command> onIncrement() {
    value++;
    return this;
  }

  private Behavior<Command> onGetValue(GetValue msg) {
    msg.replyTo.tell(value);
    return this;
  }

  private Behavior<Command> onGoodByCounter() {
    // Possible async action then stop
    return this;
  }
}
```

### Example 6: Example

```scala
import akka.cluster.typed.ClusterSingleton
import akka.cluster.typed.SingletonActor

val singletonManager = ClusterSingleton(system)
// Start if needed and provide a proxy to a named singleton
val proxy: ActorRef[Counter.Command] = singletonManager.init(
  SingletonActor(Behaviors.supervise(Counter()).onFailure[Exception](SupervisorStrategy.restart), "GlobalCounter"))

proxy ! Counter.Increment
```

### Example 7: Example

```java
import akka.cluster.typed.ClusterSingleton;
import akka.cluster.typed.ClusterSingletonSettings;
import akka.cluster.typed.SingletonActor;

ClusterSingleton singleton = ClusterSingleton.get(system);
// Start if needed and provide a proxy to a named singleton
ActorRef<Counter.Command> proxy =
    singleton.init(SingletonActor.of(Counter.create(), "GlobalCounter"));

proxy.tell(Counter.Increment.INSTANCE);
```

### Example 8: Supervision

```scala
val proxyBackOff: ActorRef[Counter.Command] = singletonManager.init(
  SingletonActor(
    Behaviors
      .supervise(Counter())
      .onFailure[Exception](SupervisorStrategy.restartWithBackoff(1.second, 10.seconds, 0.2)),
    "GlobalCounter"))
```

### Example 9: Supervision

```java
ClusterSingleton singleton = ClusterSingleton.get(system);
ActorRef<Counter.Command> proxy =
    singleton.init(
        SingletonActor.of(
            Behaviors.supervise(Counter.create())
                .onFailure(
                    SupervisorStrategy.restartWithBackoff(
                        Duration.ofSeconds(1), Duration.ofSeconds(10), 0.2)),
            "GlobalCounter"));
```

### Example 10: Application specific stop message

```scala
val singletonActor = SingletonActor(Counter(), "GlobalCounter").withStopMessage(Counter.GoodByeCounter)
singletonManager.init(singletonActor)
```

### Example 11: Application specific stop message

```java
SingletonActor<Counter.Command> counterSingleton =
    SingletonActor.of(Counter.create(), "GlobalCounter")
        .withStopMessage(Counter.GoodByeCounter.INSTANCE);
ActorRef<Counter.Command> proxy = singleton.init(counterSingleton);
```

### Example 12: Lease

```scala
my.app.my-singleton-lease {
  use-lease = "akka.coordination.lease.kubernetes"
  lease-retry-interval = 5s
  lease-name = "my-pingpong-singleton-lease"
}
```

### Example 13: Lease

```scala
val settings =
  ClusterSingletonSettings(system).withLeaseSettings(
    LeaseUsageSettings(system.settings.config.getConfig("my.app.my-singleton-lease")))
val singletonActor = SingletonActor(pingPong, "ping-pong").withStopMessage(Perish).withSettings(settings)
  ClusterSingleton(system).init(singletonActor)
```

### Example 14: Lease

```java
LeaseUsageSettings leaseSettings =
    LeaseUsageSettings.create(
        system.settings().config().getConfig("my.app.my-singleton-lease"));
ClusterSingletonSettings settings =
    ClusterSingletonSettings.create(system).withLeaseSettings(leaseSettings);
SingletonActor<PingPong.Command> singletonActor =
    SingletonActor.of(PingPong.create(), "ping-pong")
        .withStopMessage(new PingPong.Perish())
        .withSettings(settings);
ClusterSingleton.get(system).init(singletonActor);
```

### Example 15: Lease

```scala
val settings = ClusterSingletonSettings(system).withLeaseSettings(
  LeaseUsageSettings("akka.coordination.lease.kubernetes", 5.seconds, "my-pingpong-singleton-lease"))
val singletonActor = SingletonActor(pingPong, "ping-pong").withStopMessage(Perish).withSettings(settings)
```

### Example 16: Lease

```java
ClusterSingletonSettings settings =
    ClusterSingletonSettings.create(system)
        .withLeaseSettings(
            LeaseUsageSettings.create(
                "akka.coordination.lease.kubernetes",
                Duration.ofSeconds(5),
                "my-pingpong-singleton-lease"));
SingletonActor<PingPong.Command> singletonActor =
    SingletonActor.of(PingPong.create(), "ping-pong")
        .withStopMessage(new PingPong.Perish())
        .withSettings(settings);
```

### Example 17: Configuration

```conf
akka.cluster.singleton {
  # The actor name of the child singleton actor.
  singleton-name = "singleton"
  
  # Singleton among the nodes tagged with specified role.
  # If the role is not specified it's a singleton among all nodes in the cluster.
  role = ""
  
  # When a node is becoming oldest it sends hand-over request to previous oldest, 
  # that might be leaving the cluster. This is retried with this interval until 
  # the previous oldest confirms that the hand over has started or the previous 
  # oldest member is removed from the cluster (+ akka.cluster.down-removal-margin).
  hand-over-retry-interval = 1s
  
  # The number of retries are derived from hand-over-retry-interval and
  # akka.cluster.down-removal-margin (or ClusterSingletonManagerSettings.removalMargin),
  # but it will never be less than this property.
  # After the hand over retries and it's still not able to exchange the hand over messages
  # with the previous oldest it will restart itself by throwing ClusterSingletonManagerIsStuck,
  # to start from a clean state. After that it will still not start the singleton instance
  # until the previous oldest node has been removed from the cluster.
  # On the other side, on the previous oldest node, the same number of retries - 3 are used
  # and after that the singleton instance is stopped.
  # For large clusters it might be necessary to increase this to avoid too early timeouts while
  # gossip dissemination of the Leaving to Exiting phase occurs. For normal leaving scenarios
  # it will not be a quicker hand over by reducing this value, but in extreme failure scenarios
  # the recovery might be faster.
  min-number-of-hand-over-retries = 15

  # Config path of the lease to be taken before creating the singleton actor
  # if the lease is lost then the actor is restarted and it will need to re-acquire the lease
  # the default is no lease
  use-lease = ""

  # The interval between retries for acquiring the lease
  lease-retry-interval = 5s

  # Custom lease name. Note that if you have several singletons each one must have a unique
  # lease name, which can be defined with the leaseSettings of ClusterSingletonSettings.
  # If undefined it will be derived from ActorSystem name and singleton actor path,
  # but that may result in too long lease names.
  # Note that for typed cluster it is not possible to change this through configuration
  # any value here is ignored, custom names must be set through programmatic API.
  lease-name = ""
}
```

### Example 18: Configuration

```conf
akka.cluster.singleton-proxy {
  # The actor name of the singleton actor that is started by the ClusterSingletonManager
  singleton-name = ${akka.cluster.singleton.singleton-name}
  
  # The role of the cluster nodes where the singleton can be deployed.
  # Corresponding to the role used by the `ClusterSingletonManager`. If the role is not
  # specified it's a singleton among all nodes in the cluster, and the `ClusterSingletonManager`
  # must then also be configured in same way.
  role = ""
  
  # Interval at which the proxy will try to resolve the singleton instance.
  singleton-identification-interval = 1s
  
  # If the location of the singleton is unknown the proxy will buffer this
  # number of messages and deliver them when the singleton is identified. 
  # When the buffer is full old messages will be dropped when new messages are
  # sent via the proxy.
  # Use 0 to disable buffering, i.e. messages will be dropped immediately if
  # the location of the singleton is unknown.
  # Maximum allowed buffer size is 10000.
  buffer-size = 1000 
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingleton$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingleton.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingletonSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingleton.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterSingletonSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/libraries/akka-core/current/cluster-singleton.html
- https://doc.akka.io/libraries/akka-core/current/coordination.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-membership.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-singleton.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster.html
- https://doc.akka.io/libraries/akka-core/current/typed/distributed-data.html
- https://doc.akka.io/libraries/akka-core/current/typed/fault-tolerance.html
- https://doc.akka.io/libraries/akka-core/current/typed/project/links.html
- https://doc.akka.io/reference/release-notes.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/cluster-singleton.html](https://doc.akka.io/libraries/akka-core/current/typed/cluster-singleton.html)*