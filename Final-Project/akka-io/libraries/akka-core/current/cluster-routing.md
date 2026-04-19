---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:46Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/cluster-routing.html
title: Classic Cluster Aware Routers • Akka core
---

# Classic Cluster Aware Routers • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Cluster Aware Routers

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the full documentation of this feature and for new projects see [routers](typed/routers.html).

All [routers](routing.html) can be made aware of member nodes in the cluster, i.e. deploying new routees or looking up routees on nodes in the cluster. When a node becomes unreachable or leaves the cluster the routees of that node are automatically unregistered from the router. When new nodes join the cluster, additional routees are added to the router, according to the configuration. Routees are also added when a node becomes reachable again, after having been unreachable.

Cluster aware routers make use of members with status [WeaklyUp](typed/cluster-membership.html#weakly-up) if that feature is enabled.

There are two distinct types of routers.

- **Group \- router that sends messages to the specified path using actor selection** The routees can be shared among routers running on different nodes in the cluster. One example of a use case for this type of router is a service running on some backend nodes in the cluster and used by routers running on front\-end nodes in the cluster.
- **Pool \- router that creates routees as child actors and deploys them on remote nodes.** Each router will have its own routee instances. For example, if you start a router on 3 nodes in a 10\-node cluster, you will have 30 routees in total if the router is configured to use one instance per node. The routees created by the different routers will not be shared among the routers. One example of a use case for this type of router is a single master that coordinates jobs and delegates the actual work to routees running on other nodes in the cluster.

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Cluster aware routers, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % AkkaVersion
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
    <artifactId>akka-cluster_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-cluster_${versions.ScalaBinary}"
}
```

## Router with Group of Routees

When using a `Group` you must start the routee actors on the cluster member nodes. That is not done by the router. The configuration for a group looks like this::

```
akka.actor.deployment {
  /statsService/workerRouter {
      router = consistent-hashing-group
      routees.paths = ["/user/statsWorker"]
      cluster {
        enabled = on
        allow-local-routees = on
        use-roles = ["compute"]
      }
    }
}

```
Note
The routee actors should be started as early as possible when starting the actor system, because the router will try to use them as soon as the member status is changed to ‘Up’.

The actor paths that are defined in `routees.paths` are used for selecting the actors to which the messages will be forwarded to by the router. The path should not contain protocol and address information because they are retrieved dynamically from the cluster membership. Messages will be forwarded to the routees using [ActorSelection](actors.html#actorselection), so the same delivery semantics should be expected. It is possible to limit the lookup of routees to member nodes tagged with a particular set of roles by specifying `use-roles`.

`max-total-nr-of-instances` defines total number of routees in the cluster. By default `max-total-nr-of-instances` is set to a high value (10000\) that will result in new routees added to the router when nodes join the cluster. Set it to a lower value if you want to limit total number of routees.

The same type of router could also have been defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsService.scala#L54-L65 "Go to snippet source")import akka.cluster.routing.{ ClusterRouterGroup, ClusterRouterGroupSettings }
import akka.routing.ConsistentHashingGroup

val workerRouter = context.actorOf(
  ClusterRouterGroup(
    ConsistentHashingGroup(Nil),
    ClusterRouterGroupSettings(
      totalInstances = 100,
      routeesPaths = List("/user/statsWorker"),
      allowLocalRoutees = true,
      useRoles = Set("compute"))).props(),
  name = "workerRouter2")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/StatsService.java#L61-L73 "Go to snippet source")int totalInstances = 100;
Iterable<String> routeesPaths = Collections.singletonList("/user/statsWorker");
boolean allowLocalRoutees = true;
Set<String> useRoles = new HashSet<>(Arrays.asList("compute"));
ActorRef workerRouter =
    getContext()
        .actorOf(
            new ClusterRouterGroup(
                    new ConsistentHashingGroup(routeesPaths),
                    new ClusterRouterGroupSettings(
                        totalInstances, routeesPaths, allowLocalRoutees, useRoles))
                .props(),
            "workerRouter2");
```

See [reference configuration](general/configuration-reference.html#config-akka-cluster) for further descriptions of the settings.

### Router Example with Group of Routees

Let’s take a look at how to use a cluster aware router with a group of routees, i.e. router sending to the paths of the routees.

The example application provides a service to calculate statistics for a text. When some text is sent to the service it splits it into words, and delegates the task to count number of characters in each word to a separate worker, a routee of a router. The character count for each word is sent back to an aggregator that calculates the average number of characters per word when all results have been collected.

Messages:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsMessages.scala#L10-L12 "Go to snippet source")final case class StatsJob(text: String) extends CborSerializable
final case class StatsResult(meanWordLength: Double) extends CborSerializable
final case class JobFailed(reason: String) extends CborSerializable
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/StatsMessages.java#L10-L57 "Go to snippet source")public interface StatsMessages {

  public static class StatsJob implements Serializable {
    private final String text;

    public StatsJob(String text) {
      this.text = text;
    }

    public String getText() {
      return text;
    }
  }

  public static class StatsResult implements Serializable {
    private final double meanWordLength;

    public StatsResult(double meanWordLength) {
      this.meanWordLength = meanWordLength;
    }

    public double getMeanWordLength() {
      return meanWordLength;
    }

    @Override
    public String toString() {
      return "meanWordLength: " + meanWordLength;
    }
  }

  public static class JobFailed implements Serializable {
    private final String reason;

    public JobFailed(String reason) {
      this.reason = reason;
    }

    public String getReason() {
      return reason;
    }

    @Override
    public String toString() {
      return "JobFailed(" + reason + ")";
    }
  }
}
```

The worker that counts number of characters in each word:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsWorker.scala#L10-L24 "Go to snippet source")class StatsWorker extends Actor {
  var cache = Map.empty[String, Int]
  def receive = {
    case word: String =>
      val length = cache.get(word) match {
        case Some(x) => x
        case None =>
          val x = word.length
          cache += (word -> x)
          x
      }

      sender() ! length
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/StatsWorker.java#L12-L31 "Go to snippet source")public class StatsWorker extends AbstractActor {

  Map<String, Integer> cache = new HashMap<String, Integer>();

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            word -> {
              Integer length = cache.get(word);
              if (length == null) {
                length = word.length();
                cache.put(word, length);
              }
              getSender().tell(length, getSelf());
            })
        .build();
  }
}
```

The service that receives text from users and splits it up into words, delegates to workers and aggregates:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsService.scala#L14-L48 "Go to snippet source")class StatsService extends Actor {
  // This router is used both with lookup and deploy of routees. If you
  // have a router with only lookup of routees you can use Props.empty
  // instead of Props[StatsWorker.class].
  val workerRouter = context.actorOf(FromConfig.props(Props[StatsWorker]()), name = "workerRouter")

  def receive = {
    case StatsJob(text) if text != "" =>
      val words = text.split(" ")
      val replyTo = sender() // important to not close over sender()
      // create actor that collects replies from workers
      val aggregator = context.actorOf(Props(classOf[StatsAggregator], words.size, replyTo))
      words.foreach { word =>
        workerRouter.tell(ConsistentHashableEnvelope(word, word), aggregator)
      }
  }
}

class StatsAggregator(expectedResults: Int, replyTo: ActorRef) extends Actor {
  var results = IndexedSeq.empty[Int]
  context.setReceiveTimeout(3.seconds)

  def receive = {
    case wordCount: Int =>
      results = results :+ wordCount
      if (results.size == expectedResults) {
        val meanWordLength = results.sum.toDouble / results.size
        replyTo ! StatsResult(meanWordLength)
        context.stop(self)
      }
    case ReceiveTimeout =>
      replyTo ! JobFailed("Service unavailable, try again later")
      context.stop(self)
  }
}
```

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/StatsService.java#L25-L55 "Go to snippet source")public class StatsService extends AbstractActor {

  // This router is used both with lookup and deploy of routees. If you
  // have a router with only lookup of routees you can use Props.empty()
  // instead of Props.create(StatsWorker.class).
  ActorRef workerRouter =
      getContext()
          .actorOf(FromConfig.getInstance().props(Props.create(StatsWorker.class)), "workerRouter");

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            StatsJob.class,
            job -> !job.getText().isEmpty(),
            job -> {
              String[] words = job.getText().split(" ");
              ActorRef replyTo = getSender();

              // create actor that collects replies from workers
              ActorRef aggregator =
                  getContext().actorOf(Props.create(StatsAggregator.class, words.length, replyTo));

              // send each word to a worker
              for (String word : words) {
                workerRouter.tell(new ConsistentHashableEnvelope(word, word), aggregator);
              }
            })
        .build();
  }
}
```

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/StatsAggregator.java#L17-L58 "Go to snippet source")public class StatsAggregator extends AbstractActor {

  final int expectedResults;
  final ActorRef replyTo;
  final List<Integer> results = new ArrayList<Integer>();

  public StatsAggregator(int expectedResults, ActorRef replyTo) {
    this.expectedResults = expectedResults;
    this.replyTo = replyTo;
  }

  @Override
  public void preStart() {
    getContext().setReceiveTimeout(Duration.ofSeconds(3));
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Integer.class,
            wordCount -> {
              results.add(wordCount);
              if (results.size() == expectedResults) {
                int sum = 0;
                for (int c : results) {
                  sum += c;
                }
                double meanWordLength = ((double) sum) / results.size();
                replyTo.tell(new StatsResult(meanWordLength), getSelf());
                getContext().stop(getSelf());
              }
            })
        .match(
            ReceiveTimeout.class,
            x -> {
              replyTo.tell(new JobFailed("Service unavailable, try again later"), getSelf());
              getContext().stop(getSelf());
            })
        .build();
  }
}
```

Note, nothing cluster specific so far, just plain actors.

All nodes start `StatsService` and `StatsWorker` actors. Remember, routees are the workers in this case. The router is configured with `routees.paths`::

```
akka.actor.deployment {
  /statsService/workerRouter {
    router = consistent-hashing-group
    routees.paths = ["/user/statsWorker"]
    cluster {
      enabled = on
      allow-local-routees = on
      use-roles = ["compute"]
    }
  }
}

```

This means that user requests can be sent to `StatsService` on any node and it will use `StatsWorker` on all nodes.

## Router with Pool of Remote Deployed Routees

When using a `Pool` with routees created and deployed on the cluster member nodes the configuration for a router looks like this::

```
akka.actor.deployment {
  /statsService/singleton/workerRouter {
      router = consistent-hashing-pool
      cluster {
        enabled = on
        max-nr-of-instances-per-node = 3
        allow-local-routees = on
        use-roles = ["compute"]
      }
    }
}

```

It is possible to limit the deployment of routees to member nodes tagged with a particular set of roles by specifying `use-roles`.

`max-total-nr-of-instances` defines total number of routees in the cluster, but the number of routees per node, `max-nr-of-instances-per-node`, will not be exceeded. By default `max-total-nr-of-instances` is set to a high value (10000\) that will result in new routees added to the router when nodes join the cluster. Set it to a lower value if you want to limit total number of routees.

The same type of router could also have been defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsService.scala#L72-L80 "Go to snippet source")import akka.cluster.routing.{ ClusterRouterPool, ClusterRouterPoolSettings }
import akka.routing.ConsistentHashingPool

val workerRouter = context.actorOf(
  ClusterRouterPool(
    ConsistentHashingPool(0),
    ClusterRouterPoolSettings(totalInstances = 100, maxInstancesPerNode = 3, allowLocalRoutees = false))
    .props(Props[StatsWorker]()),
  name = "workerRouter3")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/StatsService.java#L80-L92 "Go to snippet source")int totalInstances = 100;
int maxInstancesPerNode = 3;
boolean allowLocalRoutees = false;
Set<String> useRoles = new HashSet<>(Arrays.asList("compute"));
ActorRef workerRouter =
    getContext()
        .actorOf(
            new ClusterRouterPool(
                    new ConsistentHashingPool(0),
                    new ClusterRouterPoolSettings(
                        totalInstances, maxInstancesPerNode, allowLocalRoutees, useRoles))
                .props(Props.create(StatsWorker.class)),
            "workerRouter3");
```

See [reference configuration](general/configuration-reference.html#config-akka-cluster) for further descriptions of the settings.

When using a pool of remote deployed routees you must ensure that all parameters of the `Props` can be [serialized](serialization.html).

### Router Example with Pool of Remote Deployed Routees

Let’s take a look at how to use a cluster aware router on single master node that creates and deploys workers. To keep track of a single master we use the [Cluster Singleton](cluster-singleton.html) in the cluster\-tools module. The `ClusterSingletonManager` is started on each node:

Scala

```
system.actorOf(
  ClusterSingletonManager.props(
    singletonProps = Props[StatsService],
    terminationMessage = PoisonPill,
    settings = ClusterSingletonManagerSettings(system).withRole("compute")),
  name = "statsService")

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/StatsSampleOneMasterMain.java#L39-L44 "Go to snippet source")ClusterSingletonManagerSettings settings =
    ClusterSingletonManagerSettings.create(system).withRole("compute");
system.actorOf(
    ClusterSingletonManager.props(
        Props.create(StatsService.class), PoisonPill.getInstance(), settings),
    "statsService");
```

We also need an actor on each node that keeps track of where current single master exists and delegates jobs to the `StatsService`. That is provided by the `ClusterSingletonProxy`:

Scala

```
system.actorOf(
  ClusterSingletonProxy.props(
    singletonManagerPath = "/user/statsService",
    settings = ClusterSingletonProxySettings(system).withRole("compute")),
  name = "statsServiceProxy")

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/StatsSampleOneMasterMain.java#L48-L51 "Go to snippet source")ClusterSingletonProxySettings proxySettings =
    ClusterSingletonProxySettings.create(system).withRole("compute");
system.actorOf(
    ClusterSingletonProxy.props("/user/statsService", proxySettings), "statsServiceProxy");
```

The `ClusterSingletonProxy` receives text from users and delegates to the current `StatsService`, the single master. It listens to cluster events to lookup the `StatsService` on the oldest node.

All nodes start `ClusterSingletonProxy` and the `ClusterSingletonManager`. The router is now configured like this::

```
akka.actor.deployment {
  /statsService/singleton/workerRouter {
    router = consistent-hashing-pool
    cluster {
      enabled = on
      max-nr-of-instances-per-node = 3
      allow-local-routees = on
      use-roles = ["compute"]
    }
  }
}

```

The easiest way to run **Router Example with Pool of Routees** example yourself is to try the [Akka Cluster Sample with Scala](../attachments/akka-samples-cluster-scala.zip)[Akka Cluster Sample with Java](../attachments/akka-samples-cluster-java.zip). It contains instructions on how to run the **Router Example with Pool of Routees** sample.

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % AkkaVersion
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
    <artifactId>akka-cluster_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-cluster_${versions.ScalaBinary}"
}
```

### Example 4: Router with Group of Routees

```text
akka.actor.deployment {
  /statsService/workerRouter {
      router = consistent-hashing-group
      routees.paths = ["/user/statsWorker"]
      cluster {
        enabled = on
        allow-local-routees = on
        use-roles = ["compute"]
      }
    }
}
```

### Example 5: Router with Group of Routees

```scala
import akka.cluster.routing.{ ClusterRouterGroup, ClusterRouterGroupSettings }
import akka.routing.ConsistentHashingGroup

val workerRouter = context.actorOf(
  ClusterRouterGroup(
    ConsistentHashingGroup(Nil),
    ClusterRouterGroupSettings(
      totalInstances = 100,
      routeesPaths = List("/user/statsWorker"),
      allowLocalRoutees = true,
      useRoles = Set("compute"))).props(),
  name = "workerRouter2")
```

### Example 6: Router with Group of Routees

```java
int totalInstances = 100;
Iterable<String> routeesPaths = Collections.singletonList("/user/statsWorker");
boolean allowLocalRoutees = true;
Set<String> useRoles = new HashSet<>(Arrays.asList("compute"));
ActorRef workerRouter =
    getContext()
        .actorOf(
            new ClusterRouterGroup(
                    new ConsistentHashingGroup(routeesPaths),
                    new ClusterRouterGroupSettings(
                        totalInstances, routeesPaths, allowLocalRoutees, useRoles))
                .props(),
            "workerRouter2");
```

### Example 7: Router Example with Group of Routees

```scala
final case class StatsJob(text: String) extends CborSerializable
final case class StatsResult(meanWordLength: Double) extends CborSerializable
final case class JobFailed(reason: String) extends CborSerializable
```

### Example 8: Router Example with Group of Routees

```java
public interface StatsMessages {

  public static class StatsJob implements Serializable {
    private final String text;

    public StatsJob(String text) {
      this.text = text;
    }

    public String getText() {
      return text;
    }
  }

  public static class StatsResult implements Serializable {
    private final double meanWordLength;

    public StatsResult(double meanWordLength) {
      this.meanWordLength = meanWordLength;
    }

    public double getMeanWordLength() {
      return meanWordLength;
    }

    @Override
    public String toString() {
      return "meanWordLength: " + meanWordLength;
    }
  }

  public static class JobFailed implements Serializable {
    private final String reason;

    public JobFailed(String reason) {
      this.reason = reason;
    }

    public String getReason() {
      return reason;
    }

    @Override
    public String toString() {
      return "JobFailed(" + reason + ")";
    }
  }
}
```

### Example 9: Router Example with Group of Routees

```scala
class StatsWorker extends Actor {
  var cache = Map.empty[String, Int]
  def receive = {
    case word: String =>
      val length = cache.get(word) match {
        case Some(x) => x
        case None =>
          val x = word.length
          cache += (word -> x)
          x
      }

      sender() ! length
  }
}
```

### Example 10: Router Example with Group of Routees

```java
public class StatsWorker extends AbstractActor {

  Map<String, Integer> cache = new HashMap<String, Integer>();

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            word -> {
              Integer length = cache.get(word);
              if (length == null) {
                length = word.length();
                cache.put(word, length);
              }
              getSender().tell(length, getSelf());
            })
        .build();
  }
}
```

### Example 11: Router Example with Group of Routees

```scala
class StatsService extends Actor {
  // This router is used both with lookup and deploy of routees. If you
  // have a router with only lookup of routees you can use Props.empty
  // instead of Props[StatsWorker.class].
  val workerRouter = context.actorOf(FromConfig.props(Props[StatsWorker]()), name = "workerRouter")

  def receive = {
    case StatsJob(text) if text != "" =>
      val words = text.split(" ")
      val replyTo = sender() // important to not close over sender()
      // create actor that collects replies from workers
      val aggregator = context.actorOf(Props(classOf[StatsAggregator], words.size, replyTo))
      words.foreach { word =>
        workerRouter.tell(ConsistentHashableEnvelope(word, word), aggregator)
      }
  }
}

class StatsAggregator(expectedResults: Int, replyTo: ActorRef) extends Actor {
  var results = IndexedSeq.empty[Int]
  context.setReceiveTimeout(3.seconds)

  def receive = {
    case wordCount: Int =>
      results = results :+ wordCount
      if (results.size == expectedResults) {
        val meanWordLength = results.sum.toDouble / results.size
        replyTo ! StatsResult(meanWordLength)
        context.stop(self)
      }
    case ReceiveTimeout =>
      replyTo ! JobFailed("Service unavailable, try again later")
      context.stop(self)
  }
}
```

### Example 12: Router Example with Group of Routees

```java
public class StatsService extends AbstractActor {

  // This router is used both with lookup and deploy of routees. If you
  // have a router with only lookup of routees you can use Props.empty()
  // instead of Props.create(StatsWorker.class).
  ActorRef workerRouter =
      getContext()
          .actorOf(FromConfig.getInstance().props(Props.create(StatsWorker.class)), "workerRouter");

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            StatsJob.class,
            job -> !job.getText().isEmpty(),
            job -> {
              String[] words = job.getText().split(" ");
              ActorRef replyTo = getSender();

              // create actor that collects replies from workers
              ActorRef aggregator =
                  getContext().actorOf(Props.create(StatsAggregator.class, words.length, replyTo));

              // send each word to a worker
              for (String word : words) {
                workerRouter.tell(new ConsistentHashableEnvelope(word, word), aggregator);
              }
            })
        .build();
  }
}
```

### Example 13: Router Example with Group of Routees

```java
public class StatsAggregator extends AbstractActor {

  final int expectedResults;
  final ActorRef replyTo;
  final List<Integer> results = new ArrayList<Integer>();

  public StatsAggregator(int expectedResults, ActorRef replyTo) {
    this.expectedResults = expectedResults;
    this.replyTo = replyTo;
  }

  @Override
  public void preStart() {
    getContext().setReceiveTimeout(Duration.ofSeconds(3));
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Integer.class,
            wordCount -> {
              results.add(wordCount);
              if (results.size() == expectedResults) {
                int sum = 0;
                for (int c : results) {
                  sum += c;
                }
                double meanWordLength = ((double) sum) / results.size();
                replyTo.tell(new StatsResult(meanWordLength), getSelf());
                getContext().stop(getSelf());
              }
            })
        .match(
            ReceiveTimeout.class,
            x -> {
              replyTo.tell(new JobFailed("Service unavailable, try again later"), getSelf());
              getContext().stop(getSelf());
            })
        .build();
  }
}
```

### Example 14: Router Example with Group of Routees

```text
akka.actor.deployment {
  /statsService/workerRouter {
    router = consistent-hashing-group
    routees.paths = ["/user/statsWorker"]
    cluster {
      enabled = on
      allow-local-routees = on
      use-roles = ["compute"]
    }
  }
}
```

### Example 15: Router with Pool of Remote Deployed Routees

```text
akka.actor.deployment {
  /statsService/singleton/workerRouter {
      router = consistent-hashing-pool
      cluster {
        enabled = on
        max-nr-of-instances-per-node = 3
        allow-local-routees = on
        use-roles = ["compute"]
      }
    }
}
```

### Example 16: Router with Pool of Remote Deployed Routees

```scala
import akka.cluster.routing.{ ClusterRouterPool, ClusterRouterPoolSettings }
import akka.routing.ConsistentHashingPool

val workerRouter = context.actorOf(
  ClusterRouterPool(
    ConsistentHashingPool(0),
    ClusterRouterPoolSettings(totalInstances = 100, maxInstancesPerNode = 3, allowLocalRoutees = false))
    .props(Props[StatsWorker]()),
  name = "workerRouter3")
```

### Example 17: Router with Pool of Remote Deployed Routees

```java
int totalInstances = 100;
int maxInstancesPerNode = 3;
boolean allowLocalRoutees = false;
Set<String> useRoles = new HashSet<>(Arrays.asList("compute"));
ActorRef workerRouter =
    getContext()
        .actorOf(
            new ClusterRouterPool(
                    new ConsistentHashingPool(0),
                    new ClusterRouterPoolSettings(
                        totalInstances, maxInstancesPerNode, allowLocalRoutees, useRoles))
                .props(Props.create(StatsWorker.class)),
            "workerRouter3");
```

### Example 18: Router Example with Pool of Remote Deployed Routees

```text
system.actorOf(
  ClusterSingletonManager.props(
    singletonProps = Props[StatsService],
    terminationMessage = PoisonPill,
    settings = ClusterSingletonManagerSettings(system).withRole("compute")),
  name = "statsService")
```

### Example 19: Router Example with Pool of Remote Deployed Routees

```java
ClusterSingletonManagerSettings settings =
    ClusterSingletonManagerSettings.create(system).withRole("compute");
system.actorOf(
    ClusterSingletonManager.props(
        Props.create(StatsService.class), PoisonPill.getInstance(), settings),
    "statsService");
```

### Example 20: Router Example with Pool of Remote Deployed Routees

```text
system.actorOf(
  ClusterSingletonProxy.props(
    singletonManagerPath = "/user/statsService",
    settings = ClusterSingletonProxySettings(system).withRole("compute")),
  name = "statsServiceProxy")
```

### Example 21: Router Example with Pool of Remote Deployed Routees

```java
ClusterSingletonProxySettings proxySettings =
    ClusterSingletonProxySettings.create(system).withRole("compute");
system.actorOf(
    ClusterSingletonProxy.props("/user/statsService", proxySettings), "statsServiceProxy");
```

### Example 22: Router Example with Pool of Remote Deployed Routees

```text
akka.actor.deployment {
  /statsService/singleton/workerRouter {
    router = consistent-hashing-pool
    cluster {
      enabled = on
      max-nr-of-instances-per-node = 3
      allow-local-routees = on
      use-roles = ["compute"]
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/attachments/akka-samples-cluster-java.zip
- https://doc.akka.io/libraries/akka-core/attachments/akka-samples-cluster-scala.zip
- https://doc.akka.io/libraries/akka-core/current/actors.html
- https://doc.akka.io/libraries/akka-core/current/cluster-singleton.html
- https://doc.akka.io/libraries/akka-core/current/cluster-usage.html
- https://doc.akka.io/libraries/akka-core/current/general/configuration-reference.html
- https://doc.akka.io/libraries/akka-core/current/routing.html
- https://doc.akka.io/libraries/akka-core/current/serialization.html
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-membership.html
- https://doc.akka.io/libraries/akka-core/current/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/current/typed/routers.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/cluster-routing.html](https://doc.akka.io/libraries/akka-core/current/cluster-routing.html)*