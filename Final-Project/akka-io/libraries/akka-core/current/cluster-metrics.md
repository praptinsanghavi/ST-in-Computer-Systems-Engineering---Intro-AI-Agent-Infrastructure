---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/cluster-metrics.html
title: Classic Cluster Metrics Extension • Akka core
---

# Classic Cluster Metrics Extension • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Cluster Metrics Extension

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Cluster Metrics Extension, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-metrics" % AkkaVersion
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
    <artifactId>akka-cluster-metrics_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-cluster-metrics_${versions.ScalaBinary}"
}
```

and add the following configuration stanza to your `application.conf` :

```
akka.extensions = [ "akka.cluster.metrics.ClusterMetricsExtension" ]

```

| Project Info: Akka Cluster Metrics (classic) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-cluster\-metrics 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.cluster.metrics |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.3\.0, 2014\-03\-05 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## Introduction

The member nodes of the cluster can collect system health metrics and publish that to other cluster nodes and to the registered subscribers on the system event bus with the help of Cluster Metrics Extension.

Cluster metrics information is primarily used for load\-balancing routers, and can also be used to implement advanced metrics\-based node life cycles, such as “Node Let\-it\-crash” when CPU steal time becomes excessive.

Cluster members with status [WeaklyUp](typed/cluster-membership.html#weaklyup-members), if that feature is enabled, will participate in Cluster Metrics collection and dissemination.

## Metrics Collector

Metrics collection is delegated to an implementation of `akka.cluster.metrics.MetricsCollector`.

Different collector implementations provide different subsets of metrics published to the cluster. Certain message routing and let\-it\-crash functions may not work when Sigar is not provisioned.

Cluster metrics extension comes with two built\-in collector implementations:

1. `akka.cluster.metrics.SigarMetricsCollector`, which requires Sigar provisioning, and is more rich/precise
2. `akka.cluster.metrics.JmxMetricsCollector`, which is used as fall back, and is less rich/precise

You can also plug\-in your own metrics collector implementation.

By default, metrics extension will use collector provider fall back and will try to load them in this order:

1. configured user\-provided collector
2. built\-in `akka.cluster.metrics.SigarMetricsCollector`
3. and finally `akka.cluster.metrics.JmxMetricsCollector`

## Metrics Events

Metrics extension periodically publishes current snapshot of the cluster metrics to the node system event bus.

The publication interval is controlled by the `akka.cluster.metrics.collector.sample-interval` setting.

The payload of the `akka.cluster.metrics.ClusterMetricsChanged` event will contain latest metrics of the node as well as other cluster member nodes metrics gossip which was received during the collector sample interval.

You can subscribe your metrics listener actors to these events in order to implement custom node lifecycle:

Scala

```
ClusterMetricsExtension(system).subscribe(metricsListenerActor)

```

Java

```
ClusterMetricsExtension.get(system).subscribe(metricsListenerActor);

```

## Hyperic Sigar Provisioning

Both user\-provided and built\-in metrics collectors can optionally use [Hyperic Sigar](https://github.com/hyperic/sigar) for a wider and more accurate range of metrics compared to what can be retrieved from ordinary JMX MBeans.

Sigar is using a native o/s library, and requires library provisioning, i.e. deployment, extraction and loading of the o/s native library into JVM at runtime.

User can provision Sigar classes and native library in one of the following ways:

1. Use [Kamon sigar\-loader](https://github.com/kamon-io/sigar-loader) as a project dependency for the user project. Metrics extension will extract and load sigar library on demand with help of Kamon sigar provisioner.
2. Use [Kamon sigar\-loader](https://github.com/kamon-io/sigar-loader) as java agent: `java -javaagent:/path/to/sigar-loader.jar`. Kamon sigar loader agent will extract and load sigar library during JVM start.
3. Place `sigar.jar` on the `classpath` and Sigar native library for the o/s on the `java.library.path`. User is required to manage both project dependency and library deployment manually.

Warning
When using [Kamon sigar\-loader](https://github.com/kamon-io/sigar-loader) and running multiple instances of the same application on the same host, you have to make sure that sigar library is extracted to a unique per instance directory. You can control the extract directory with the `akka.cluster.metrics.native-library-extract-folder` configuration setting.

To enable usage of Sigar you can add the following dependency to the user project:

sbt
```
libraryDependencies += "io.kamon" % "sigar-loader" % "1.6.6-rev002"
```
Maven
```
<dependencies&gt
  <dependency>
    <groupId>io.kamon</groupId>
    <artifactId>sigar-loader</artifactId>
    <version>1.6.6-rev002</version>
  </dependency&gt
</dependencies>
```
Gradle
```
dependencies {
  implementation "io.kamon:sigar-loader:1.6.6-rev002"
}
```

You can download Kamon sigar\-loader from [Maven Central](https://search.maven.org/search?q=sigar-loader)

## Adaptive Load Balancing

The `AdaptiveLoadBalancingPool` / `AdaptiveLoadBalancingGroup` performs load balancing of messages to cluster nodes based on the cluster metrics data. It uses random selection of routees with probabilities derived from the remaining capacity of the corresponding node. It can be configured to use a specific MetricsSelector to produce the probabilities, a.k.a. weights:

- `heap` / `HeapMetricsSelector` \- Used and max JVM heap memory. Weights based on remaining heap capacity; (max \- used) / max
- `load` / `SystemLoadAverageMetricsSelector` \- System load average for the past 1 minute, corresponding value can be found in `top` of Linux systems. The system is possibly nearing a bottleneck if the system load average is nearing number of cpus/cores. Weights based on remaining load capacity; 1 \- (load / processors)
- `cpu` / `CpuMetricsSelector` \- CPU utilization in percentage, sum of User \+ Sys \+ Nice \+ Wait. Weights based on remaining cpu capacity; 1 \- utilization
- `mix` / `MixMetricsSelector` \- Combines heap, cpu and load. Weights based on mean of remaining capacity of the combined selectors.
- Any custom implementation of `akka.cluster.metrics.MetricsSelector`

The collected metrics values are smoothed with [exponential weighted moving average](https://en.wikipedia.org/wiki/Moving_average#Exponential_moving_average). In the [Cluster configuration](cluster-usage.html#cluster-configuration) you can adjust how quickly past data is decayed compared to new data.

Let’s take a look at this router in action. What can be more demanding than calculating factorials?

The backend worker that performs the factorial calculation:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/FactorialBackend.scala#L17-L38 "Go to snippet source")class FactorialBackend extends Actor with ActorLogging {

  import context.dispatcher

  def receive = {
    case (n: Int) =>
      Future(factorial(n))
        .map { result =>
          (n, result)
        }
        .pipeTo(sender())
  }

  def factorial(n: Int): BigInt = {
    @tailrec def factorialAcc(acc: BigInt, n: Int): BigInt = {
      if (n <= 1) acc
      else factorialAcc(acc * n, n - 1)
    }
    factorialAcc(BigInt(1), n)
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/FactorialBackend.java#L14-L38 "Go to snippet source")public class FactorialBackend extends AbstractActor {

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Integer.class,
            n -> {
              CompletableFuture<FactorialResult> result =
                  CompletableFuture.supplyAsync(() -> factorial(n))
                      .thenApply((factorial) -> new FactorialResult(n, factorial));

              pipe(result, getContext().dispatcher()).to(getSender());
            })
        .build();
  }

  BigInteger factorial(int n) {
    BigInteger acc = BigInteger.ONE;
    for (int i = 1; i <= n; ++i) {
      acc = acc.multiply(BigInteger.valueOf(i));
    }
    return acc;
  }
}
```

The frontend that receives user jobs and delegates to the backends via the router:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/FactorialFrontend.scala#L18-L45 "Go to snippet source")class FactorialFrontend(upToN: Int, repeat: Boolean) extends Actor with ActorLogging {

  val backend = context.actorOf(FromConfig.props(), name = "factorialBackendRouter")

  override def preStart(): Unit = {
    sendJobs()
    if (repeat) {
      context.setReceiveTimeout(10.seconds)
    }
  }

  def receive = {
    case (n: Int, factorial: BigInt) =>
      if (n == upToN) {
        log.debug("{}! = {}", n, factorial)
        if (repeat) sendJobs()
        else context.stop(self)
      }
    case ReceiveTimeout =>
      log.info("Timeout")
      sendJobs()
  }

  def sendJobs(): Unit = {
    log.info("Starting batch of factorials up to [{}]", upToN)
    (1 to upToN).foreach { backend ! _ }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/FactorialFrontend.java#L29-L76 "Go to snippet source")public class FactorialFrontend extends AbstractActor {
  final int upToN;
  final boolean repeat;

  LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  ActorRef backend =
      getContext().actorOf(FromConfig.getInstance().props(), "factorialBackendRouter");

  public FactorialFrontend(int upToN, boolean repeat) {
    this.upToN = upToN;
    this.repeat = repeat;
  }

  @Override
  public void preStart() {
    sendJobs();
    getContext().setReceiveTimeout(Duration.ofSeconds(10));
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            FactorialResult.class,
            result -> {
              if (result.n == upToN) {
                log.debug("{}! = {}", result.n, result.factorial);
                if (repeat) sendJobs();
                else getContext().stop(getSelf());
              }
            })
        .match(
            ReceiveTimeout.class,
            x -> {
              log.info("Timeout");
              sendJobs();
            })
        .build();
  }

  void sendJobs() {
    log.info("Starting batch of factorials up to [{}]", upToN);
    for (int n = 1; n <= upToN; n++) {
      backend.tell(n, getSelf());
    }
  }
}
```

As you can see, the router is defined in the same way as other routers, and in this case it is configured as follows:

```
akka.actor.deployment {
  /factorialFrontend/factorialBackendRouter = {
    # Router type provided by metrics extension.
    router = cluster-metrics-adaptive-group
    # Router parameter specific for metrics extension.
    # metrics-selector = heap
    # metrics-selector = load
    # metrics-selector = cpu
    metrics-selector = mix
    #
    routees.paths = ["/user/factorialBackend"]
    cluster {
      enabled = on
      use-roles = ["backend"]
      allow-local-routees = off
    }
  }
}

```

It is only `router` type and the `metrics-selector` parameter that is specific to this router, other things work in the same way as other routers.

The same type of router could also have been defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/FactorialFrontend.scala#L69-L83 "Go to snippet source")import akka.cluster.routing.ClusterRouterGroup
import akka.cluster.routing.ClusterRouterGroupSettings
import akka.cluster.metrics.AdaptiveLoadBalancingGroup
import akka.cluster.metrics.HeapMetricsSelector

val backend = context.actorOf(
  ClusterRouterGroup(
    AdaptiveLoadBalancingGroup(HeapMetricsSelector),
    ClusterRouterGroupSettings(
      totalInstances = 100,
      routeesPaths = List("/user/factorialBackend"),
      allowLocalRoutees = true,
      useRoles = Set("backend"))).props(),
  name = "factorialBackendRouter2")

import akka.cluster.routing.ClusterRouterPool
import akka.cluster.routing.ClusterRouterPoolSettings
import akka.cluster.metrics.AdaptiveLoadBalancingPool
import akka.cluster.metrics.SystemLoadAverageMetricsSelector

val backend = context.actorOf(
  ClusterRouterPool(
    AdaptiveLoadBalancingPool(SystemLoadAverageMetricsSelector),
    ClusterRouterPoolSettings(
      totalInstances = 100,
      maxInstancesPerNode = 3,
      allowLocalRoutees = false,
      useRoles = Set("backend"))).props(Props[FactorialBackend]()),
  name = "factorialBackendRouter3")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/FactorialFrontend.java#L82-L96 "Go to snippet source")int totalInstances = 100;
Iterable<String> routeesPaths = Arrays.asList("/user/factorialBackend", "");
boolean allowLocalRoutees = true;
Set<String> useRoles = new HashSet<>(Arrays.asList("backend"));
ActorRef backend =
    getContext()
        .actorOf(
            new ClusterRouterGroup(
                    new AdaptiveLoadBalancingGroup(
                        HeapMetricsSelector.getInstance(), Collections.<String>emptyList()),
                    new ClusterRouterGroupSettings(
                        totalInstances, routeesPaths, allowLocalRoutees, useRoles))
                .props(),
            "factorialBackendRouter2");

int totalInstances = 100;
int maxInstancesPerNode = 3;
boolean allowLocalRoutees = false;
Set<String> useRoles = new HashSet<>(Arrays.asList("backend"));
ActorRef backend =
    getContext()
        .actorOf(
            new ClusterRouterPool(
                    new AdaptiveLoadBalancingPool(
                        SystemLoadAverageMetricsSelector.getInstance(), 0),
                    new ClusterRouterPoolSettings(
                        totalInstances, maxInstancesPerNode, allowLocalRoutees, useRoles))
                .props(Props.create(FactorialBackend.class)),
            "factorialBackendRouter3");
```

## Subscribe to Metrics Events

It is possible to subscribe to the metrics events directly to implement other functionality.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/MetricsListener.scala#L8-L53 "Go to snippet source")import akka.actor.ActorLogging
import akka.actor.Actor
import akka.cluster.Cluster
import akka.cluster.metrics.ClusterMetricsChanged
import akka.cluster.ClusterEvent.CurrentClusterState
import akka.cluster.metrics.NodeMetrics
import akka.cluster.metrics.StandardMetrics.HeapMemory
import akka.cluster.metrics.StandardMetrics.Cpu
import akka.cluster.metrics.ClusterMetricsExtension

class MetricsListener extends Actor with ActorLogging {
  val selfAddress = Cluster(context.system).selfAddress
  val extension = ClusterMetricsExtension(context.system)

  // Subscribe unto ClusterMetricsEvent events.
  override def preStart(): Unit = extension.subscribe(self)

  // Unsubscribe from ClusterMetricsEvent events.
  override def postStop(): Unit = extension.unsubscribe(self)

  def receive = {
    case ClusterMetricsChanged(clusterMetrics) =>
      clusterMetrics.filter(_.address == selfAddress).foreach { nodeMetrics =>
        logHeap(nodeMetrics)
        logCpu(nodeMetrics)
      }
    case state: CurrentClusterState => // Ignore.
  }

  def logHeap(nodeMetrics: NodeMetrics): Unit = nodeMetrics match {
    case HeapMemory(address, timestamp, used, committed, max) =>
      log.info("Used heap: {} MB", used.doubleValue / 1024 / 1024)
    case _ => // No heap info.
  }

  def logCpu(nodeMetrics: NodeMetrics): Unit = nodeMetrics match {
    case Cpu(address, timestamp, Some(systemLoadAverage), cpuCombined, cpuStolen, processors) =>
      log.info("Load: {} ({} processors)", systemLoadAverage, processors)
    case _ => // No cpu info.
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/MetricsListener.java#L8-L73 "Go to snippet source")import akka.actor.AbstractActor;
import akka.cluster.Cluster;
import akka.cluster.ClusterEvent.CurrentClusterState;
import akka.cluster.metrics.ClusterMetricsChanged;
import akka.cluster.metrics.ClusterMetricsExtension;
import akka.cluster.metrics.NodeMetrics;
import akka.cluster.metrics.StandardMetrics;
import akka.cluster.metrics.StandardMetrics.Cpu;
import akka.cluster.metrics.StandardMetrics.HeapMemory;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class MetricsListener extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  Cluster cluster = Cluster.get(getContext().getSystem());

  ClusterMetricsExtension extension = ClusterMetricsExtension.get(getContext().getSystem());

  // Subscribe unto ClusterMetricsEvent events.
  @Override
  public void preStart() {
    extension.subscribe(getSelf());
  }

  // Unsubscribe from ClusterMetricsEvent events.
  @Override
  public void postStop() {
    extension.unsubscribe(getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            ClusterMetricsChanged.class,
            clusterMetrics -> {
              for (NodeMetrics nodeMetrics : clusterMetrics.getNodeMetrics()) {
                if (nodeMetrics.address().equals(cluster.selfAddress())) {
                  logHeap(nodeMetrics);
                  logCpu(nodeMetrics);
                }
              }
            })
        .match(
            CurrentClusterState.class,
            message -> {
              // Ignore.
            })
        .build();
  }

  void logHeap(NodeMetrics nodeMetrics) {
    HeapMemory heap = StandardMetrics.extractHeapMemory(nodeMetrics);
    if (heap != null) {
      log.info("Used heap: {} MB", ((double) heap.used()) / 1024 / 1024);
    }
  }

  void logCpu(NodeMetrics nodeMetrics) {
    Cpu cpu = StandardMetrics.extractCpu(nodeMetrics);
    if (cpu != null && cpu.systemLoadAverage().isDefined()) {
      log.info("Load: {} ({} processors)", cpu.systemLoadAverage().get(), cpu.processors());
    }
  }
}
```

## Custom Metrics Collector

Metrics collection is delegated to the implementation of `akka.cluster.metrics.MetricsCollector`

You can plug\-in your own metrics collector instead of built\-in `akka.cluster.metrics.SigarMetricsCollector` or `akka.cluster.metrics.JmxMetricsCollector`.

Look at those two implementations for inspiration.

Custom metrics collector implementation class must be specified in the `akka.cluster.metrics.collector.provider` configuration property.

## Configuration

The Cluster metrics extension can be configured with the following properties:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/main/resources/reference.conf "Go to snippet source")##############################################
# Akka Cluster Metrics Reference Config File #
##############################################

# This is the reference config file that contains all the default settings.
# Make your edits in your application.conf in order to override these settings.

# Sigar provisioning:
#
#  User can provision sigar classes and native library in one of the following ways:
# 
#  1) Use https://github.com/kamon-io/sigar-loader Kamon sigar-loader as a project dependency for the user project.
#  Metrics extension will extract and load sigar library on demand with help of Kamon sigar provisioner.
# 
#  2) Use https://github.com/kamon-io/sigar-loader Kamon sigar-loader as java agent: `java -javaagent:/path/to/sigar-loader.jar`
#  Kamon sigar loader agent will extract and load sigar library during JVM start.
# 
#  3) Place `sigar.jar` on the `classpath` and sigar native library for the o/s on the `java.library.path`
#  User is required to manage both project dependency and library deployment manually.

# Cluster metrics extension.
# Provides periodic statistics collection and publication throughout the cluster.
akka.cluster.metrics {
  # Full path of dispatcher configuration key.
  dispatcher = "akka.actor.default-dispatcher"
  # How long should any actor wait before starting the periodic tasks.
  periodic-tasks-initial-delay = 1s
  # Sigar native library extract location.
  # Use per-application-instance scoped location, such as program working directory.
  native-library-extract-folder = ${user.dir}"/native"
  # Metrics supervisor actor.
  supervisor {
    # Actor name. Example name space: /system/cluster-metrics
    name = "cluster-metrics"
    # Supervision strategy.
    strategy {
      #
      # FQCN of class providing `akka.actor.SupervisorStrategy`.
      # Must have a constructor with signature `<init>(com.typesafe.config.Config)`.
      # Default metrics strategy provider is a configurable extension of `OneForOneStrategy`.
      provider = "akka.cluster.metrics.ClusterMetricsStrategy"
      #
      # Configuration of the default strategy provider.
      # Replace with custom settings when overriding the provider.
      configuration = {
        # Log restart attempts.
        loggingEnabled = true
        # Child actor restart-on-failure window.
        withinTimeRange = 3s
        # Maximum number of restart attempts before child actor is stopped.
        maxNrOfRetries = 3
      }
    }
  }
  # Metrics collector actor.
  collector {
    # Enable or disable metrics collector for load-balancing nodes.
    # Metrics collection can also be controlled at runtime by sending control messages
    # to /system/cluster-metrics actor: `akka.cluster.metrics.{CollectionStartMessage,CollectionStopMessage}`
    enabled = on
    # FQCN of the metrics collector implementation.
    # It must implement `akka.cluster.metrics.MetricsCollector` and
    # have public constructor with akka.actor.ActorSystem parameter.
    # Will try to load in the following order of priority:
    # 1) configured custom collector 2) internal `SigarMetricsCollector` 3) internal `JmxMetricsCollector`
    provider = ""
    # Try all 3 available collector providers, or else fail on the configured custom collector provider.
    fallback = true
    # How often metrics are sampled on a node.
    # Shorter interval will collect the metrics more often.
    # Also controls frequency of the metrics publication to the node system event bus.
    sample-interval = 3s
    # How often a node publishes metrics information to the other nodes in the cluster.
    # Shorter interval will publish the metrics gossip more often.
    gossip-interval = 3s
    # How quickly the exponential weighting of past data is decayed compared to
    # new data. Set lower to increase the bias toward newer values.
    # The relevance of each data sample is halved for every passing half-life
    # duration, i.e. after 4 times the half-life, a data sample’s relevance is
    # reduced to 6% of its original relevance. The initial relevance of a data
    # sample is given by 1 – 0.5 ^ (collect-interval / half-life).
    # See https://en.wikipedia.org/wiki/Moving_average#Exponential_moving_average
    moving-average-half-life = 12s
  }
}

# Cluster metrics extension serializers and routers.
akka.actor {
  # Protobuf serializer for remote cluster metrics messages.
  serializers {
    akka-cluster-metrics = "akka.cluster.metrics.protobuf.MessageSerializer"
  }
  # Interface binding for remote cluster metrics messages.
  serialization-bindings {
    "akka.cluster.metrics.ClusterMetricsMessage" = akka-cluster-metrics
    "akka.cluster.metrics.AdaptiveLoadBalancingPool" = akka-cluster-metrics
    "akka.cluster.metrics.MixMetricsSelector" = akka-cluster-metrics
    "akka.cluster.metrics.CpuMetricsSelector$" = akka-cluster-metrics
    "akka.cluster.metrics.HeapMetricsSelector$" = akka-cluster-metrics
    "akka.cluster.metrics.SystemLoadAverageMetricsSelector$" = akka-cluster-metrics
  }
  # Globally unique metrics extension serializer identifier.
  serialization-identifiers {
    "akka.cluster.metrics.protobuf.MessageSerializer" = 10
  }
  #  Provide routing of messages based on cluster metrics.
  router.type-mapping {
    cluster-metrics-adaptive-pool  = "akka.cluster.metrics.AdaptiveLoadBalancingPool"
    cluster-metrics-adaptive-group = "akka.cluster.metrics.AdaptiveLoadBalancingGroup"
  }
}
```

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-metrics" % AkkaVersion
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
    <artifactId>akka-cluster-metrics_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-cluster-metrics_${versions.ScalaBinary}"
}
```

### Example 4: Module info

```text
akka.extensions = [ "akka.cluster.metrics.ClusterMetricsExtension" ]
```

### Example 5: Metrics Events

```scala
ClusterMetricsExtension(system).subscribe(metricsListenerActor)
```

### Example 6: Metrics Events

```java
ClusterMetricsExtension.get(system).subscribe(metricsListenerActor);
```

### Example 7: Hyperic Sigar Provisioning

```scala
libraryDependencies += "io.kamon" % "sigar-loader" % "1.6.6-rev002"
```

### Example 8: Hyperic Sigar Provisioning

```xml
<dependencies&gt
  <dependency>
    <groupId>io.kamon</groupId>
    <artifactId>sigar-loader</artifactId>
    <version>1.6.6-rev002</version>
  </dependency&gt
</dependencies>
```

### Example 9: Hyperic Sigar Provisioning

```gradle
dependencies {
  implementation "io.kamon:sigar-loader:1.6.6-rev002"
}
```

### Example 10: Adaptive Load Balancing

```scala
class FactorialBackend extends Actor with ActorLogging {

  import context.dispatcher

  def receive = {
    case (n: Int) =>
      Future(factorial(n))
        .map { result =>
          (n, result)
        }
        .pipeTo(sender())
  }

  def factorial(n: Int): BigInt = {
    @tailrec def factorialAcc(acc: BigInt, n: Int): BigInt = {
      if (n <= 1) acc
      else factorialAcc(acc * n, n - 1)
    }
    factorialAcc(BigInt(1), n)
  }

}
```

### Example 11: Adaptive Load Balancing

```java
public class FactorialBackend extends AbstractActor {

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Integer.class,
            n -> {
              CompletableFuture<FactorialResult> result =
                  CompletableFuture.supplyAsync(() -> factorial(n))
                      .thenApply((factorial) -> new FactorialResult(n, factorial));

              pipe(result, getContext().dispatcher()).to(getSender());
            })
        .build();
  }

  BigInteger factorial(int n) {
    BigInteger acc = BigInteger.ONE;
    for (int i = 1; i <= n; ++i) {
      acc = acc.multiply(BigInteger.valueOf(i));
    }
    return acc;
  }
}
```

### Example 12: Adaptive Load Balancing

```scala
class FactorialFrontend(upToN: Int, repeat: Boolean) extends Actor with ActorLogging {

  val backend = context.actorOf(FromConfig.props(), name = "factorialBackendRouter")

  override def preStart(): Unit = {
    sendJobs()
    if (repeat) {
      context.setReceiveTimeout(10.seconds)
    }
  }

  def receive = {
    case (n: Int, factorial: BigInt) =>
      if (n == upToN) {
        log.debug("{}! = {}", n, factorial)
        if (repeat) sendJobs()
        else context.stop(self)
      }
    case ReceiveTimeout =>
      log.info("Timeout")
      sendJobs()
  }

  def sendJobs(): Unit = {
    log.info("Starting batch of factorials up to [{}]", upToN)
    (1 to upToN).foreach { backend ! _ }
  }
}
```

### Example 13: Adaptive Load Balancing

```java
public class FactorialFrontend extends AbstractActor {
  final int upToN;
  final boolean repeat;

  LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  ActorRef backend =
      getContext().actorOf(FromConfig.getInstance().props(), "factorialBackendRouter");

  public FactorialFrontend(int upToN, boolean repeat) {
    this.upToN = upToN;
    this.repeat = repeat;
  }

  @Override
  public void preStart() {
    sendJobs();
    getContext().setReceiveTimeout(Duration.ofSeconds(10));
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            FactorialResult.class,
            result -> {
              if (result.n == upToN) {
                log.debug("{}! = {}", result.n, result.factorial);
                if (repeat) sendJobs();
                else getContext().stop(getSelf());
              }
            })
        .match(
            ReceiveTimeout.class,
            x -> {
              log.info("Timeout");
              sendJobs();
            })
        .build();
  }

  void sendJobs() {
    log.info("Starting batch of factorials up to [{}]", upToN);
    for (int n = 1; n <= upToN; n++) {
      backend.tell(n, getSelf());
    }
  }
}
```

### Example 14: Adaptive Load Balancing

```text
akka.actor.deployment {
  /factorialFrontend/factorialBackendRouter = {
    # Router type provided by metrics extension.
    router = cluster-metrics-adaptive-group
    # Router parameter specific for metrics extension.
    # metrics-selector = heap
    # metrics-selector = load
    # metrics-selector = cpu
    metrics-selector = mix
    #
    routees.paths = ["/user/factorialBackend"]
    cluster {
      enabled = on
      use-roles = ["backend"]
      allow-local-routees = off
    }
  }
}
```

### Example 15: Adaptive Load Balancing

```scala
import akka.cluster.routing.ClusterRouterGroup
import akka.cluster.routing.ClusterRouterGroupSettings
import akka.cluster.metrics.AdaptiveLoadBalancingGroup
import akka.cluster.metrics.HeapMetricsSelector

val backend = context.actorOf(
  ClusterRouterGroup(
    AdaptiveLoadBalancingGroup(HeapMetricsSelector),
    ClusterRouterGroupSettings(
      totalInstances = 100,
      routeesPaths = List("/user/factorialBackend"),
      allowLocalRoutees = true,
      useRoles = Set("backend"))).props(),
  name = "factorialBackendRouter2")

import akka.cluster.routing.ClusterRouterPool
import akka.cluster.routing.ClusterRouterPoolSettings
import akka.cluster.metrics.AdaptiveLoadBalancingPool
import akka.cluster.metrics.SystemLoadAverageMetricsSelector

val backend = context.actorOf(
  ClusterRouterPool(
    AdaptiveLoadBalancingPool(SystemLoadAverageMetricsSelector),
    ClusterRouterPoolSettings(
      totalInstances = 100,
      maxInstancesPerNode = 3,
      allowLocalRoutees = false,
      useRoles = Set("backend"))).props(Props[FactorialBackend]()),
  name = "factorialBackendRouter3")
```

### Example 16: Adaptive Load Balancing

```java
int totalInstances = 100;
Iterable<String> routeesPaths = Arrays.asList("/user/factorialBackend", "");
boolean allowLocalRoutees = true;
Set<String> useRoles = new HashSet<>(Arrays.asList("backend"));
ActorRef backend =
    getContext()
        .actorOf(
            new ClusterRouterGroup(
                    new AdaptiveLoadBalancingGroup(
                        HeapMetricsSelector.getInstance(), Collections.<String>emptyList()),
                    new ClusterRouterGroupSettings(
                        totalInstances, routeesPaths, allowLocalRoutees, useRoles))
                .props(),
            "factorialBackendRouter2");

int totalInstances = 100;
int maxInstancesPerNode = 3;
boolean allowLocalRoutees = false;
Set<String> useRoles = new HashSet<>(Arrays.asList("backend"));
ActorRef backend =
    getContext()
        .actorOf(
            new ClusterRouterPool(
                    new AdaptiveLoadBalancingPool(
                        SystemLoadAverageMetricsSelector.getInstance(), 0),
                    new ClusterRouterPoolSettings(
                        totalInstances, maxInstancesPerNode, allowLocalRoutees, useRoles))
                .props(Props.create(FactorialBackend.class)),
            "factorialBackendRouter3");
```

### Example 17: Subscribe to Metrics Events

```scala
import akka.actor.ActorLogging
import akka.actor.Actor
import akka.cluster.Cluster
import akka.cluster.metrics.ClusterMetricsChanged
import akka.cluster.ClusterEvent.CurrentClusterState
import akka.cluster.metrics.NodeMetrics
import akka.cluster.metrics.StandardMetrics.HeapMemory
import akka.cluster.metrics.StandardMetrics.Cpu
import akka.cluster.metrics.ClusterMetricsExtension

class MetricsListener extends Actor with ActorLogging {
  val selfAddress = Cluster(context.system).selfAddress
  val extension = ClusterMetricsExtension(context.system)

  // Subscribe unto ClusterMetricsEvent events.
  override def preStart(): Unit = extension.subscribe(self)

  // Unsubscribe from ClusterMetricsEvent events.
  override def postStop(): Unit = extension.unsubscribe(self)

  def receive = {
    case ClusterMetricsChanged(clusterMetrics) =>
      clusterMetrics.filter(_.address == selfAddress).foreach { nodeMetrics =>
        logHeap(nodeMetrics)
        logCpu(nodeMetrics)
      }
    case state: CurrentClusterState => // Ignore.
  }

  def logHeap(nodeMetrics: NodeMetrics): Unit = nodeMetrics match {
    case HeapMemory(address, timestamp, used, committed, max) =>
      log.info("Used heap: {} MB", used.doubleValue / 1024 / 1024)
    case _ => // No heap info.
  }

  def logCpu(nodeMetrics: NodeMetrics): Unit = nodeMetrics match {
    case Cpu(address, timestamp, Some(systemLoadAverage), cpuCombined, cpuStolen, processors) =>
      log.info("Load: {} ({} processors)", systemLoadAverage, processors)
    case _ => // No cpu info.
  }
}
```

### Example 18: Subscribe to Metrics Events

```java
import akka.actor.AbstractActor;
import akka.cluster.Cluster;
import akka.cluster.ClusterEvent.CurrentClusterState;
import akka.cluster.metrics.ClusterMetricsChanged;
import akka.cluster.metrics.ClusterMetricsExtension;
import akka.cluster.metrics.NodeMetrics;
import akka.cluster.metrics.StandardMetrics;
import akka.cluster.metrics.StandardMetrics.Cpu;
import akka.cluster.metrics.StandardMetrics.HeapMemory;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class MetricsListener extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  Cluster cluster = Cluster.get(getContext().getSystem());

  ClusterMetricsExtension extension = ClusterMetricsExtension.get(getContext().getSystem());

  // Subscribe unto ClusterMetricsEvent events.
  @Override
  public void preStart() {
    extension.subscribe(getSelf());
  }

  // Unsubscribe from ClusterMetricsEvent events.
  @Override
  public void postStop() {
    extension.unsubscribe(getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            ClusterMetricsChanged.class,
            clusterMetrics -> {
              for (NodeMetrics nodeMetrics : clusterMetrics.getNodeMetrics()) {
                if (nodeMetrics.address().equals(cluster.selfAddress())) {
                  logHeap(nodeMetrics);
                  logCpu(nodeMetrics);
                }
              }
            })
        .match(
            CurrentClusterState.class,
            message -> {
              // Ignore.
            })
        .build();
  }

  void logHeap(NodeMetrics nodeMetrics) {
    HeapMemory heap = StandardMetrics.extractHeapMemory(nodeMetrics);
    if (heap != null) {
      log.info("Used heap: {} MB", ((double) heap.used()) / 1024 / 1024);
    }
  }

  void logCpu(NodeMetrics nodeMetrics) {
    Cpu cpu = StandardMetrics.extractCpu(nodeMetrics);
    if (cpu != null && cpu.systemLoadAverage().isDefined()) {
      log.info("Load: {} ({} processors)", cpu.systemLoadAverage().get(), cpu.processors());
    }
  }
}
```

### Example 19: Configuration

```conf
##############################################
# Akka Cluster Metrics Reference Config File #
##############################################

# This is the reference config file that contains all the default settings.
# Make your edits in your application.conf in order to override these settings.

# Sigar provisioning:
#
#  User can provision sigar classes and native library in one of the following ways:
# 
#  1) Use https://github.com/kamon-io/sigar-loader Kamon sigar-loader as a project dependency for the user project.
#  Metrics extension will extract and load sigar library on demand with help of Kamon sigar provisioner.
# 
#  2) Use https://github.com/kamon-io/sigar-loader Kamon sigar-loader as java agent: `java -javaagent:/path/to/sigar-loader.jar`
#  Kamon sigar loader agent will extract and load sigar library during JVM start.
# 
#  3) Place `sigar.jar` on the `classpath` and sigar native library for the o/s on the `java.library.path`
#  User is required to manage both project dependency and library deployment manually.

# Cluster metrics extension.
# Provides periodic statistics collection and publication throughout the cluster.
akka.cluster.metrics {
  # Full path of dispatcher configuration key.
  dispatcher = "akka.actor.default-dispatcher"
  # How long should any actor wait before starting the periodic tasks.
  periodic-tasks-initial-delay = 1s
  # Sigar native library extract location.
  # Use per-application-instance scoped location, such as program working directory.
  native-library-extract-folder = ${user.dir}"/native"
  # Metrics supervisor actor.
  supervisor {
    # Actor name. Example name space: /system/cluster-metrics
    name = "cluster-metrics"
    # Supervision strategy.
    strategy {
      #
      # FQCN of class providing `akka.actor.SupervisorStrategy`.
      # Must have a constructor with signature `<init>(com.typesafe.config.Config)`.
      # Default metrics strategy provider is a configurable extension of `OneForOneStrategy`.
      provider = "akka.cluster.metrics.ClusterMetricsStrategy"
      #
      # Configuration of the default strategy provider.
      # Replace with custom settings when overriding the provider.
      configuration = {
        # Log restart attempts.
        loggingEnabled = true
        # Child actor restart-on-failure window.
        withinTimeRange = 3s
        # Maximum number of restart attempts before child actor is stopped.
        maxNrOfRetries = 3
      }
    }
  }
  # Metrics collector actor.
  collector {
    # Enable or disable metrics collector for load-balancing nodes.
    # Metrics collection can also be controlled at runtime by sending control messages
    # to /system/cluster-metrics actor: `akka.cluster.metrics.{CollectionStartMessage,CollectionStopMessage}`
    enabled = on
    # FQCN of the metrics collector implementation.
    # It must implement `akka.cluster.metrics.MetricsCollector` and
    # have public constructor with akka.actor.ActorSystem parameter.
    # Will try to load in the following order of priority:
    # 1) configured custom collector 2) internal `SigarMetricsCollector` 3) internal `JmxMetricsCollector`
    provider = ""
    # Try all 3 available collector providers, or else fail on the configured custom collector provider.
    fallback = true
    # How often metrics are sampled on a node.
    # Shorter interval will collect the metrics more often.
    # Also controls frequency of the metrics publication to the node system event bus.
    sample-interval = 3s
    # How often a node publishes metrics information to the other nodes in the cluster.
    # Shorter interval will publish the metrics gossip more often.
    gossip-interval = 3s
    # How quickly the exponential weighting of past data is decayed compared to
    # new data. Set lower to increase the bias toward newer values.
    # The relevance of each data sample is halved for every passing half-life
    # duration, i.e. after 4 times the half-life, a data sample’s relevance is
    # reduced to 6% of its original relevance. The initial relevance of a data
    # sample is given by 1 – 0.5 ^ (collect-interval / half-life).
    # See https://en.wikipedia.org/wiki/Moving_average#Exponential_moving_average
    moving-average-half-life = 12s
  }
}

# Cluster metrics extension serializers and routers.
akka.actor {
  # Protobuf serializer for remote cluster metrics messages.
  serializers {
    akka-cluster-metrics = "akka.cluster.metrics.protobuf.MessageSerializer"
  }
  # Interface binding for remote cluster metrics messages.
  serialization-bindings {
    "akka.cluster.metrics.ClusterMetricsMessage" = akka-cluster-metrics
    "akka.cluster.metrics.AdaptiveLoadBalancingPool" = akka-cluster-metrics
    "akka.cluster.metrics.MixMetricsSelector" = akka-cluster-metrics
    "akka.cluster.metrics.CpuMetricsSelector$" = akka-cluster-metrics
    "akka.cluster.metrics.HeapMetricsSelector$" = akka-cluster-metrics
    "akka.cluster.metrics.SystemLoadAverageMetricsSelector$" = akka-cluster-metrics
  }
  # Globally unique metrics extension serializer identifier.
  serialization-identifiers {
    "akka.cluster.metrics.protobuf.MessageSerializer" = 10
  }
  #  Provide routing of messages based on cluster metrics.
  router.type-mapping {
    cluster-metrics-adaptive-pool  = "akka.cluster.metrics.AdaptiveLoadBalancingPool"
    cluster-metrics-adaptive-group = "akka.cluster.metrics.AdaptiveLoadBalancingGroup"
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/libraries/akka-core/current/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/cluster-usage.html
- https://doc.akka.io/libraries/akka-core/current/distributed-data.html
- https://doc.akka.io/libraries/akka-core/current/project/links.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-membership.html
- https://doc.akka.io/reference/release-notes.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/cluster-metrics.html](https://doc.akka.io/libraries/akka-core/current/cluster-metrics.html)*