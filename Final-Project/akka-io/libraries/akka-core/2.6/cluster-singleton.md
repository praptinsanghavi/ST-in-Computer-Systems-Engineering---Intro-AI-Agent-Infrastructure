---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:15:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/cluster-singleton.html
title: Classic Cluster Singleton • Akka Documentation
---

# Classic Cluster Singleton • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Classic Cluster Singleton

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the full documentation of this feature and for new projects see [Cluster Singleton](typed/cluster-singleton.html).

## Module info

To use Cluster Singleton, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-tools" % AkkaVersion
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
      <version>2.6.21</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-tools_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.6.21")

  implementation "com.typesafe.akka:akka-cluster-tools_${versions.ScalaBinary}"
}
```

| Project Info: Akka Cluster Tools (classic) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-cluster\-tools 2\.6\.21 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Adopt OpenJDK 8Adopt OpenJDK 11 |
| Scala versions | 2\.13\.8, 2\.12\.16, 3\.1\.2 |
| JPMS module name | akka.cluster.tools |
| License | [Apache\-2\.0](https://www.apache.org/licenses/LICENSE-2.0.html) |
| Readiness level | [Supported](https://developer.lightbend.com/docs/introduction/getting-help/support-terminology.html#supported), [Lightbend Subscription](https://www.lightbend.com/lightbend-subscription) provides support Since 2\.3\.0, 2014\-03\-05 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.6.21/akka/cluster/tools/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.6.21/akka/cluster/tools/package-summary.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io) [akka/akka Gitter channel](https://gitter.im/akka/akka) |
| Release notes | [akka.io blog](https://akka.io/blog/news-archive.html) |
| Issues | [Github issues](https://github.com/akka/akka/issues) |
| Sources | <https://github.com/akka/akka> |

## Introduction

For the full documentation of this feature and for new projects see [Cluster Singleton \- Introduction](typed/cluster-singleton.html#introduction).

The cluster singleton pattern is implemented by `akka.cluster.singleton.ClusterSingletonManager`. It manages one singleton actor instance among all cluster nodes or a group of nodes tagged with a specific role. `ClusterSingletonManager` is an actor that is supposed to be started as early as possible on all nodes, or all nodes with specified role, in the cluster. The actual singleton actor is started by the `ClusterSingletonManager` on the oldest node by creating a child actor from supplied `Props`. `ClusterSingletonManager` makes sure that at most one singleton instance is running at any point in time.

You can access the singleton actor by using the provided `akka.cluster.singleton.ClusterSingletonProxy`, which will route all messages to the current instance of the singleton. The proxy will keep track of the oldest node in the cluster and resolve the singleton’s `ActorRef` by explicitly sending the singleton’s `actorSelection` the `akka.actor.Identify` message and waiting for it to reply. This is performed periodically if the singleton doesn’t reply within a certain (configurable) time. Given the implementation, there might be periods of time during which the `ActorRef` is unavailable, e.g., when a node leaves the cluster. In these cases, the proxy will buffer the messages sent to the singleton and then deliver them when the singleton is finally available. If the buffer is full the `ClusterSingletonProxy` will drop old messages when new messages are sent via the proxy. The size of the buffer is configurable and it can be disabled by using a buffer size of 0\.

See [Cluster Singleton \- Potential problems to be aware of](typed/cluster-singleton.html#potential-problems-to-be-aware-of).

## An Example

Assume that we need one single entry point to an external system. An actor that receives messages from a JMS queue with the strict requirement that only one JMS consumer must exist to make sure that the messages are processed in order. That is perhaps not how one would like to design things, but a typical real\-world scenario when integrating with external systems.

Before explaining how to create a cluster singleton actor, let’s define message classes and their corresponding factory methods which will be used by the singleton.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/singleton/ClusterSingletonManagerSpec.scala#L52-L117 "Go to snippet source")object PointToPointChannel {
  case object UnregistrationOk extends CborSerializable
}
object Consumer {
  case object End extends CborSerializable
  case object GetCurrent extends CborSerializable
  case object Ping extends CborSerializable
  case object Pong extends CborSerializable
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/test/java/akka/cluster/singleton/TestSingletonMessages.java#L8-L82 "Go to snippet source")public class TestSingletonMessages {
  public static class UnregistrationOk {}

  public static class End {}

  public static class Ping {}

  public static class Pong {}

  public static class GetCurrent {}

  public static UnregistrationOk unregistrationOk() {
    return new UnregistrationOk();
  }

  public static End end() {
    return new End();
  }

  public static Ping ping() {
    return new Ping();
  }

  public static Pong pong() {
    return new Pong();
  }

  public static GetCurrent getCurrent() {
    return new GetCurrent();
  }
}
```

On each node in the cluster you need to start the `ClusterSingletonManager` and supply the `Props` of the singleton actor, in this case the JMS queue consumer.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/singleton/ClusterSingletonManagerSpec.scala#L222-L227 "Go to snippet source")system.actorOf(
  ClusterSingletonManager.props(
    singletonProps = Props(classOf[Consumer], queue, testActor),
    terminationMessage = End,
    settings = ClusterSingletonManagerSettings(system).withRole("worker")),
  name = "consumer")
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/test/java/akka/cluster/singleton/ClusterSingletonManagerTest.java#L21-L29 "Go to snippet source")final ClusterSingletonManagerSettings settings =
    ClusterSingletonManagerSettings.create(system).withRole("worker");

system.actorOf(
    ClusterSingletonManager.props(
        Props.create(Consumer.class, () -> new Consumer(queue, testActor)),
        TestSingletonMessages.end(),
        settings),
    "consumer");
```

Here we limit the singleton to nodes tagged with the `"worker"` role, but all nodes, independent of role, can be used by not specifying `withRole`.

We use an application specific `terminationMessage` (i.e. `TestSingletonMessages.end()` message) to be able to close the resources before actually stopping the singleton actor. Note that `PoisonPill` is a perfectly fine `terminationMessage` if you only need to stop the actor.

Here is how the singleton actor handles the `terminationMessage` in this example.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/singleton/ClusterSingletonManagerSpec.scala#L149-L155 "Go to snippet source")case End =>
  queue ! UnregisterConsumer
case UnregistrationOk =>
  stoppedBeforeUnregistration = false
  context.stop(self)
case Ping =>
  sender() ! Pong
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/test/java/akka/cluster/singleton/Consumer.java#L53-L60 "Go to snippet source").match(End.class, message -> queue.tell(UnregisterConsumer.class, getSelf()))
.match(
    UnregistrationOk.class,
    message -> {
      stoppedBeforeUnregistration = false;
      getContext().stop(getSelf());
    })
.match(Ping.class, message -> getSender().tell(TestSingletonMessages.pong(), getSelf()))
```

With the names given above, access to the singleton can be obtained from any cluster node using a properly configured proxy.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/singleton/ClusterSingletonManagerSpec.scala#L233-L237 "Go to snippet source")val proxy = system.actorOf(
  ClusterSingletonProxy.props(
    singletonManagerPath = "/user/consumer",
    settings = ClusterSingletonProxySettings(system).withRole("worker")),
  name = "consumerProxy")
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/test/java/akka/cluster/singleton/ClusterSingletonManagerTest.java#L33-L38 "Go to snippet source")ClusterSingletonProxySettings proxySettings =
    ClusterSingletonProxySettings.create(system).withRole("worker");

ActorRef proxy =
    system.actorOf(
        ClusterSingletonProxy.props("/user/consumer", proxySettings), "consumerProxy");
```

A more comprehensive sample is available in the tutorial named [Distributed workers with Akka and Scala!](https://github.com/typesafehub/activator-akka-distributed-workers)[Distributed workers with Akka and Java!](https://github.com/typesafehub/activator-akka-distributed-workers-java).

## Configuration

For the full documentation of this feature and for new projects see [Cluster Singleton \- configuration](typed/cluster-singleton.html#configuration).

## Supervision

There are two actors that could potentially be supervised. For the `consumer` singleton created above these would be: 

- Cluster singleton manager e.g. `/user/consumer` which runs on every node in the cluster
- The user actor e.g. `/user/consumer/singleton` which the manager starts on the oldest node

The Cluster singleton manager actor should not have its supervision strategy changed as it should always be running. However it is sometimes useful to add supervision for the user actor. To accomplish this add a parent supervisor actor which will be used to create the ‘real’ singleton instance. Below is an example implementation (credit to [this StackOverflow answer](https://stackoverflow.com/questions/36701898/how-to-supervise-cluster-singleton-in-akka/36716708#36716708))

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/cluster/singleton/ClusterSingletonSupervision.scala#L8-L15 "Go to snippet source")import akka.actor.{ Actor, Props, SupervisorStrategy }
class SupervisorActor(childProps: Props, override val supervisorStrategy: SupervisorStrategy) extends Actor {
  val child = context.actorOf(childProps, "supervised-child")

  def receive = {
    case msg => child.forward(msg)
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/cluster/singleton/SupervisorActor.java#L8-L34 "Go to snippet source")import akka.actor.AbstractActor;
import akka.actor.AbstractActor.Receive;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.SupervisorStrategy;

public class SupervisorActor extends AbstractActor {
  final Props childProps;
  final SupervisorStrategy supervisorStrategy;
  final ActorRef child;

  SupervisorActor(Props childProps, SupervisorStrategy supervisorStrategy) {
    this.childProps = childProps;
    this.supervisorStrategy = supervisorStrategy;
    this.child = getContext().actorOf(childProps, "supervised-child");
  }

  @Override
  public SupervisorStrategy supervisorStrategy() {
    return supervisorStrategy;
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder().matchAny(msg -> child.forward(msg, getContext())).build();
  }
}
```

And used here

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/cluster/singleton/ClusterSingletonSupervision.scala#L23-L30 "Go to snippet source")import akka.actor.{ PoisonPill, Props }
import akka.cluster.singleton.{ ClusterSingletonManager, ClusterSingletonManagerSettings }
context.system.actorOf(
  ClusterSingletonManager.props(
    singletonProps = Props(classOf[SupervisorActor], props, supervisorStrategy),
    terminationMessage = PoisonPill,
    settings = ClusterSingletonManagerSettings(context.system)),
  name = name)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/cluster/singleton/ClusterSingletonSupervision.java#L13-L16 "Go to snippet source")import akka.actor.PoisonPill;
import akka.actor.Props;
import akka.cluster.singleton.ClusterSingletonManager;
import akka.cluster.singleton.ClusterSingletonManagerSettings;
```

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/cluster/singleton/ClusterSingletonSupervision.java#L23-L31 "Go to snippet source")return getContext()
    .system()
    .actorOf(
        ClusterSingletonManager.props(
            Props.create(
                SupervisorActor.class, () -> new SupervisorActor(props, supervisorStrategy)),
            PoisonPill.getInstance(),
            ClusterSingletonManagerSettings.create(getContext().system())),
        name = name);
```

## Lease

For the full documentation of this feature and for new projects see [Cluster Singleton \- Lease](typed/cluster-singleton.html#lease).

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-tools" % AkkaVersion
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
      <version>2.6.21</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-tools_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.6.21")

  implementation "com.typesafe.akka:akka-cluster-tools_${versions.ScalaBinary}"
}
```

### Example 4: An Example

```scala
object PointToPointChannel {
  case object UnregistrationOk extends CborSerializable
}
object Consumer {
  case object End extends CborSerializable
  case object GetCurrent extends CborSerializable
  case object Ping extends CborSerializable
  case object Pong extends CborSerializable
}
```

### Example 5: An Example

```java
public class TestSingletonMessages {
  public static class UnregistrationOk {}

  public static class End {}

  public static class Ping {}

  public static class Pong {}

  public static class GetCurrent {}

  public static UnregistrationOk unregistrationOk() {
    return new UnregistrationOk();
  }

  public static End end() {
    return new End();
  }

  public static Ping ping() {
    return new Ping();
  }

  public static Pong pong() {
    return new Pong();
  }

  public static GetCurrent getCurrent() {
    return new GetCurrent();
  }
}
```

### Example 6: An Example

```scala
system.actorOf(
  ClusterSingletonManager.props(
    singletonProps = Props(classOf[Consumer], queue, testActor),
    terminationMessage = End,
    settings = ClusterSingletonManagerSettings(system).withRole("worker")),
  name = "consumer")
```

### Example 7: An Example

```java
final ClusterSingletonManagerSettings settings =
    ClusterSingletonManagerSettings.create(system).withRole("worker");

system.actorOf(
    ClusterSingletonManager.props(
        Props.create(Consumer.class, () -> new Consumer(queue, testActor)),
        TestSingletonMessages.end(),
        settings),
    "consumer");
```

### Example 8: An Example

```scala
case End =>
  queue ! UnregisterConsumer
case UnregistrationOk =>
  stoppedBeforeUnregistration = false
  context.stop(self)
case Ping =>
  sender() ! Pong
```

### Example 9: An Example

```java
.match(End.class, message -> queue.tell(UnregisterConsumer.class, getSelf()))
.match(
    UnregistrationOk.class,
    message -> {
      stoppedBeforeUnregistration = false;
      getContext().stop(getSelf());
    })
.match(Ping.class, message -> getSender().tell(TestSingletonMessages.pong(), getSelf()))
```

### Example 10: An Example

```scala
val proxy = system.actorOf(
  ClusterSingletonProxy.props(
    singletonManagerPath = "/user/consumer",
    settings = ClusterSingletonProxySettings(system).withRole("worker")),
  name = "consumerProxy")
```

### Example 11: An Example

```java
ClusterSingletonProxySettings proxySettings =
    ClusterSingletonProxySettings.create(system).withRole("worker");

ActorRef proxy =
    system.actorOf(
        ClusterSingletonProxy.props("/user/consumer", proxySettings), "consumerProxy");
```

### Example 12: Supervision

```scala
import akka.actor.{ Actor, Props, SupervisorStrategy }
class SupervisorActor(childProps: Props, override val supervisorStrategy: SupervisorStrategy) extends Actor {
  val child = context.actorOf(childProps, "supervised-child")

  def receive = {
    case msg => child.forward(msg)
  }
}
```

### Example 13: Supervision

```java
import akka.actor.AbstractActor;
import akka.actor.AbstractActor.Receive;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.SupervisorStrategy;

public class SupervisorActor extends AbstractActor {
  final Props childProps;
  final SupervisorStrategy supervisorStrategy;
  final ActorRef child;

  SupervisorActor(Props childProps, SupervisorStrategy supervisorStrategy) {
    this.childProps = childProps;
    this.supervisorStrategy = supervisorStrategy;
    this.child = getContext().actorOf(childProps, "supervised-child");
  }

  @Override
  public SupervisorStrategy supervisorStrategy() {
    return supervisorStrategy;
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder().matchAny(msg -> child.forward(msg, getContext())).build();
  }
}
```

### Example 14: Supervision

```scala
import akka.actor.{ PoisonPill, Props }
import akka.cluster.singleton.{ ClusterSingletonManager, ClusterSingletonManagerSettings }
context.system.actorOf(
  ClusterSingletonManager.props(
    singletonProps = Props(classOf[SupervisorActor], props, supervisorStrategy),
    terminationMessage = PoisonPill,
    settings = ClusterSingletonManagerSettings(context.system)),
  name = name)
```

### Example 15: Supervision

```java
import akka.actor.PoisonPill;
import akka.actor.Props;
import akka.cluster.singleton.ClusterSingletonManager;
import akka.cluster.singleton.ClusterSingletonManagerSettings;
```

### Example 16: Supervision

```java
return getContext()
    .system()
    .actorOf(
        ClusterSingletonManager.props(
            Props.create(
                SupervisorActor.class, () -> new SupervisorActor(props, supervisorStrategy)),
            PoisonPill.getInstance(),
            ClusterSingletonManagerSettings.create(getContext().system())),
        name = name);
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6.21/akka/cluster/tools/index.html
- https://doc.akka.io/japi/akka-core/2.6.21/akka/cluster/tools/package-summary.html
- https://doc.akka.io/libraries/akka-core/2.6/cluster-routing.html
- https://doc.akka.io/libraries/akka-core/2.6/distributed-pub-sub.html
- https://doc.akka.io/libraries/akka-core/2.6/project/links.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/cluster-singleton.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/coexisting.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/cluster-singleton.html](https://doc.akka.io/libraries/akka-core/2.6/cluster-singleton.html)*