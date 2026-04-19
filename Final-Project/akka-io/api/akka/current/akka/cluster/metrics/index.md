---
description: Akka 2.10.17 - akka.cluster.metrics
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:44:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/index.html
title: Akka 2.10.17 - akka.cluster.metrics
---

# Akka 2.10.17 - akka.cluster.metrics

> **Summary:** Akka 2.10.17 - akka.cluster.metrics

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../ddata/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/metrics/index.html "Permalink")  package metricsDefinition Classes[cluster](../index.html)
- [**](../../../akka/cluster/metrics/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
- [AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "A router group that performs load balancing of messages to cluster nodes based on cluster metric data.")
- [AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "A router pool that performs load balancing of messages to cluster nodes based on cluster metric data.")
- [AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "Load balancing of messages to cluster nodes based on cluster metric data.")
- [CapacityMetricsSelector](CapacityMetricsSelector.html "A MetricsSelector producing weights from remaining capacity.")
- [ClusterMetricsChanged](ClusterMetricsChanged.html "Current snapshot of cluster node metrics.")
- [ClusterMetricsEvent](ClusterMetricsEvent.html "Local cluster metrics extension events.")
- [ClusterMetricsExtension](ClusterMetricsExtension.html "Cluster metrics extension.")
- [ClusterMetricsSettings](ClusterMetricsSettings.html "Metrics extension settings.")
- [ClusterMetricsStrategy](ClusterMetricsStrategy.html "Default ClusterMetricsSupervisor strategy: A configurable akka.actor.OneForOneStrategy with restart-on-throwable decider.")
- [CollectionControlMessage](CollectionControlMessage.html "Runtime collection management commands.")
- [CollectionStartMessage](CollectionStartMessage$.html "Command for ClusterMetricsSupervisor to start metrics collection.")
- [CollectionStopMessage](CollectionStopMessage$.html "Command for ClusterMetricsSupervisor to stop metrics collection.")
- [CpuMetricsSelector](CpuMetricsSelector$.html "MetricsSelector that uses the combined CPU time metrics and stolen CPU time metrics.")
- [DefaultSigarProvider](DefaultSigarProvider.html "Provide sigar instance as SigarProxy with configured location via ClusterMetricsSettings.")
- [EWMA](EWMA.html "The exponentially weighted moving average (EWMA) approach captures short-term movements in volatility for a conditional volatility forecasting model.")
- [HeapMetricsSelector](HeapMetricsSelector$.html "MetricsSelector that uses the heap metrics.")
- [JmxMetricsCollector](JmxMetricsCollector.html "Loads JVM and system metrics through JMX monitoring beans.")
- [Metric](Metric.html "Metrics key/value.")
- [MetricsCollector](MetricsCollector.html "Metrics sampler.")
- [MetricsSelector](MetricsSelector.html "A MetricsSelector is responsible for producing weights from the node metrics.")
- [MixMetricsSelector](MixMetricsSelector.html "MetricsSelector that combines other selectors and aggregates their capacity values.")
- [MixMetricsSelectorBase](MixMetricsSelectorBase.html "Base class for MetricsSelector that combines other selectors and aggregates their capacity.")
- [NodeMetrics](NodeMetrics.html "The snapshot of current sampled health metrics for any monitored process.")
- [SigarMetricsCollector](SigarMetricsCollector.html "Loads metrics through Hyperic SIGAR and JMX monitoring beans.")
- [SigarProvider](SigarProvider.html "Provide sigar instance as SigarProxy.")
- [StandardMetrics](StandardMetrics$.html "Definitions of the built-in standard metrics.")
- [SystemLoadAverageMetricsSelector](SystemLoadAverageMetricsSelector$.html "MetricsSelector that uses the system load average metrics.")
- [**](../../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](../protobuf/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](../pubsub/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sbr/index.html "Permalink")  package [sbr](../sbr/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../sharding/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package [singleton](../singleton/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[cluster](../index.html)
p[akka](../../index.html).[cluster](../index.html)

# metrics[**](../../../akka/cluster/metrics/index.html "Permalink")

#### package metrics

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/cluster/metrics/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
### Type Members

1. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html "Permalink") final  case class [AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "A router group that performs load balancing of messages to cluster nodes based on cluster metric data.")(metricsSelector: [MetricsSelector](MetricsSelector.html) \= [MixMetricsSelector](MixMetricsSelector$.html), paths: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String] \= Nil, routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../../index.html)) extends [Group](../../routing/Group.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router group that performs load balancing of messages to cluster nodes based on
cluster metric data.

A router group that performs load balancing of messages to cluster nodes based on
cluster metric data.

It uses random selection of routees based on probabilities derived from
the remaining capacity of corresponding node.

The configuration parameter trumps the constructor arguments. This means that
if you provide `paths` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

metricsSelectordecides what probability to use for selecting a routee, based
 on remaining capacity as indicated by the node metrics

pathsstring representation of the actor paths of the routees, messages are
 sent with [akka.actor.ActorSelection](../../actor/ActorSelection.html) to these paths

routerDispatcherdispatcher to use for the router head actor, which handles
 router management messages

Annotations@SerialVersionUID()
2. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html "Permalink") final  case class [AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "A router pool that performs load balancing of messages to cluster nodes based on cluster metric data.")(metricsSelector: [MetricsSelector](MetricsSelector.html) \= [MixMetricsSelector](MixMetricsSelector$.html), nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html) \= [Pool.defaultSupervisorStrategy](../../index.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../../index.html), usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [Pool](../../routing/Pool.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router pool that performs load balancing of messages to cluster nodes based on
cluster metric data.

A router pool that performs load balancing of messages to cluster nodes based on
cluster metric data.

It uses random selection of routees based on probabilities derived from
the remaining capacity of corresponding node.

The configuration parameter trumps the constructor arguments. This means that
if you provide `nrOfInstances` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

### Supervision Setup

Any routees that are created by a router will be created as the router's children.
The router is therefore also the children's supervisor.

The supervision strategy of the router actor can be configured with
[\#withSupervisorStrategy](AdaptiveLoadBalancingPool.html#withSupervisorStrategy(strategy:akka.actor.SupervisorStrategy):akka.cluster.metrics.AdaptiveLoadBalancingPool). If no strategy is provided, routers default to
a strategy of “always escalate”. This means that errors are passed up to the
router's supervisor for handling.

The router's supervisor will treat the error as an error with the router itself.
Therefore a directive to stop or restart will cause the router itself to stop or
restart. The router, in turn, will cause its children to stop and restart.

metricsSelectordecides what probability to use for selecting a routee, based
 on remaining capacity as indicated by the node metrics

nrOfInstancesinitial number of routees in the pool

supervisorStrategystrategy for supervising the routees, see 'Supervision Setup'

routerDispatcherdispatcher to use for the router head actor, which handles
 supervision, death watch and router management messages

Annotations@SerialVersionUID()
3. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html "Permalink") final  case class [AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "Load balancing of messages to cluster nodes based on cluster metric data.")(system: [ActorSystem](../../actor/ActorSystem.html), metricsSelector: [MetricsSelector](MetricsSelector.html) \= [MixMetricsSelector](MixMetricsSelector$.html)) extends [RoutingLogic](../../routing/RoutingLogic.html) with [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableLoad balancing of messages to cluster nodes based on cluster metric data.

Load balancing of messages to cluster nodes based on cluster metric data.

It uses random selection of routees based on probabilities derived from
the remaining capacity of corresponding node.

systemthe actor system hosting this router

metricsSelectordecides what probability to use for selecting a routee, based
 on remaining capacity as indicated by the node metrics
4. [**](../../../akka/cluster/metrics/CapacityMetricsSelector.html "Permalink") abstract  class [CapacityMetricsSelector](CapacityMetricsSelector.html "A MetricsSelector producing weights from remaining capacity.") extends [MetricsSelector](MetricsSelector.html)A MetricsSelector producing weights from remaining capacity.

A MetricsSelector producing weights from remaining capacity.
The weights are typically proportional to the remaining capacity.

Annotations@SerialVersionUID()
5. [**](../../../akka/cluster/metrics/ClusterMetricsChanged.html "Permalink") final  case class [ClusterMetricsChanged](ClusterMetricsChanged.html "Current snapshot of cluster node metrics.")(nodeMetrics: Set\[[NodeMetrics](NodeMetrics.html)]) extends [ClusterMetricsEvent](ClusterMetricsEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableCurrent snapshot of cluster node metrics.
6. [**](../../../akka/cluster/metrics/ClusterMetricsEvent.html "Permalink")  trait [ClusterMetricsEvent](ClusterMetricsEvent.html "Local cluster metrics extension events.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Local cluster metrics extension events.

Local cluster metrics extension events.

Published to local event bus subscribers by ClusterMetricsCollector.
7. [**](../../../akka/cluster/metrics/ClusterMetricsExtension.html "Permalink")  class [ClusterMetricsExtension](ClusterMetricsExtension.html "Cluster metrics extension.") extends [Extension](../../actor/Extension.html)Cluster metrics extension.

Cluster metrics extension.

Cluster metrics is primarily for load\-balancing of nodes. It controls metrics sampling
at a regular frequency, prepares highly variable data for further analysis by other entities,
and publishes the latest cluster metrics data around the node ring and local eventStream
to assist in determining the need to redirect traffic to the least\-loaded nodes.

Metrics sampling is delegated to the [MetricsCollector](MetricsCollector.html).

Smoothing of the data for each monitored process is delegated to the
[EWMA](EWMA.html) for exponential weighted moving average.
8. [**](../../../akka/cluster/metrics/ClusterMetricsSettings.html "Permalink")  case class [ClusterMetricsSettings](ClusterMetricsSettings.html "Metrics extension settings.")(config: Config) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMetrics extension settings.

Metrics extension settings. Documented in: `src/main/resources/reference.conf`.
9. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html "Permalink")  class [ClusterMetricsStrategy](ClusterMetricsStrategy.html "Default ClusterMetricsSupervisor strategy: A configurable akka.actor.OneForOneStrategy with restart-on-throwable decider.") extends [OneForOneStrategy](../../actor/OneForOneStrategy.html)Default ClusterMetricsSupervisor strategy:
A configurable [akka.actor.OneForOneStrategy](../../actor/OneForOneStrategy.html) with restart\-on\-throwable decider.
10. [**](../../../akka/cluster/metrics/CollectionControlMessage.html "Permalink") sealed abstract  class [CollectionControlMessage](CollectionControlMessage.html "Runtime collection management commands.") extends Serializable Runtime collection management commands.
11. [**](../../../akka/cluster/metrics/DefaultSigarProvider.html "Permalink")  case class [DefaultSigarProvider](DefaultSigarProvider.html "Provide sigar instance as SigarProxy with configured location via ClusterMetricsSettings.")(settings: [ClusterMetricsSettings](ClusterMetricsSettings.html)) extends [SigarProvider](SigarProvider.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableProvide sigar instance as `SigarProxy` with configured location via [ClusterMetricsSettings](ClusterMetricsSettings.html).
12. [**](../../../akka/cluster/metrics/EWMA.html "Permalink") final  case class [EWMA](EWMA.html "The exponentially weighted moving average (EWMA) approach captures short-term movements in volatility for a conditional volatility forecasting model.")(value: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), alpha: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe exponentially weighted moving average (EWMA) approach captures short\-term
movements in volatility for a conditional volatility forecasting model.

The exponentially weighted moving average (EWMA) approach captures short\-term
movements in volatility for a conditional volatility forecasting model. By virtue
of its alpha, or decay factor, this provides a statistical streaming data model
that is exponentially biased towards newer entries.

https://en.wikipedia.org/wiki/Moving\_average\#Exponential\_moving\_average

An EWMA only needs the most recent forecast value to be kept, as opposed to a standard
moving average model.

valuethe current exponentially weighted moving average, e.g. Y(n \- 1\), or,
 the sampled value resulting from the previous smoothing iteration.
 This value is always used as the previous EWMA to calculate the new EWMA.

alphadecay factor, sets how quickly the exponential weighting decays for past data compared to new data,
 see https://en.wikipedia.org/wiki/Moving\_average\#Exponential\_moving\_average

Annotations@SerialVersionUID()
13. [**](../../../akka/cluster/metrics/JmxMetricsCollector.html "Permalink")  class [JmxMetricsCollector](JmxMetricsCollector.html "Loads JVM and system metrics through JMX monitoring beans.") extends [MetricsCollector](MetricsCollector.html)Loads JVM and system metrics through JMX monitoring beans.
14. [**](../../../akka/cluster/metrics/Metric.html "Permalink") final  case class [Metric](Metric.html "Metrics key/value.") extends MetricNumericConverter with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMetrics key/value.

Metrics key/value.

Equality of Metric is based on its name.

Annotations@SerialVersionUID()
15. [**](../../../akka/cluster/metrics/MetricsCollector.html "Permalink")  trait [MetricsCollector](MetricsCollector.html "Metrics sampler.") extends [Closeable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Closeable.html#java.io.Closeable)Metrics sampler.

Metrics sampler.

Implementations of cluster system metrics collectors extend this trait.
16. [**](../../../akka/cluster/metrics/MetricsSelector.html "Permalink")  trait [MetricsSelector](MetricsSelector.html "A MetricsSelector is responsible for producing weights from the node metrics.") extends SerializableA MetricsSelector is responsible for producing weights from the node metrics.

A MetricsSelector is responsible for producing weights from the node metrics.

Annotations@nowarn() @SerialVersionUID()
17. [**](../../../akka/cluster/metrics/MixMetricsSelector.html "Permalink") final  case class [MixMetricsSelector](MixMetricsSelector.html "MetricsSelector that combines other selectors and aggregates their capacity values.")(selectors: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[CapacityMetricsSelector](CapacityMetricsSelector.html)]) extends [MixMetricsSelectorBase](MixMetricsSelectorBase.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMetricsSelector that combines other selectors and aggregates their capacity
values.

MetricsSelector that combines other selectors and aggregates their capacity
values. By default it uses \[akka.cluster.routing.HeapMetricsSelector],
\[akka.cluster.routing.CpuMetricsSelector], and \[akka.cluster.routing.SystemLoadAverageMetricsSelector]

Annotations@SerialVersionUID()
18. [**](../../../akka/cluster/metrics/MixMetricsSelectorBase.html "Permalink") abstract  class [MixMetricsSelectorBase](MixMetricsSelectorBase.html "Base class for MetricsSelector that combines other selectors and aggregates their capacity.") extends [CapacityMetricsSelector](CapacityMetricsSelector.html)Base class for MetricsSelector that combines other selectors and aggregates their capacity.

Base class for MetricsSelector that combines other selectors and aggregates their capacity.

Annotations@SerialVersionUID()
19. [**](../../../akka/cluster/metrics/NodeMetrics.html "Permalink") final  case class [NodeMetrics](NodeMetrics.html "The snapshot of current sampled health metrics for any monitored process.")(address: [Address](../../actor/Address.html), timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), metrics: Set\[[Metric](Metric.html)] \= Set.empty\[Metric]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe snapshot of current sampled health metrics for any monitored process.

The snapshot of current sampled health metrics for any monitored process.
Collected and gossipped at regular intervals for dynamic cluster management strategies.

Equality of NodeMetrics is based on its address.

address[akka.actor.Address](../../actor/Address.html) of the node the metrics are gathered at

timestampthe time of sampling, in milliseconds since midnight, January 1, 1970 UTC

metricsthe set of sampled [akka.cluster.metrics.Metric](Metric.html)

Annotations@SerialVersionUID()
20. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html "Permalink")  class [SigarMetricsCollector](SigarMetricsCollector.html "Loads metrics through Hyperic SIGAR and JMX monitoring beans.") extends [JmxMetricsCollector](JmxMetricsCollector.html)Loads metrics through Hyperic SIGAR and JMX monitoring beans.

Loads metrics through Hyperic SIGAR and JMX monitoring beans. This
loads wider and more accurate range of metrics compared to JmxMetricsCollector
by using SIGAR's native OS library.

The constructor will by design throw exception if org.hyperic.sigar.Sigar can't be loaded, due
to missing classes or native libraries.
21. [**](../../../akka/cluster/metrics/SigarProvider.html "Permalink")  trait [SigarProvider](SigarProvider.html "Provide sigar instance as SigarProxy.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Provide sigar instance as `SigarProxy`.

Provide sigar instance as `SigarProxy`.

User can provision sigar classes and native library in one of the following ways:

1\) Use [Kamon sigar\-loader](https://github.com/kamon-io/sigar-loader) as a project dependency for the user project.
Metrics extension will extract and load sigar library on demand with help of Kamon sigar provisioner.

2\) Use [Kamon sigar\-loader](https://github.com/kamon-io/sigar-loader) as java agent: `java -javaagent:/path/to/sigar-loader.jar`
Kamon sigar loader agent will extract and load sigar library during JVM start.

3\) Place `sigar.jar` on the `classpath` and sigar native library for the o/s on the `java.library.path`
User is required to manage both project dependency and library deployment manually.
### Value Members

1. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html "Permalink")  object [ClusterMetricsExtension](ClusterMetricsExtension$.html "Cluster metrics extension provider.") extends [ExtensionId](../../actor/ExtensionId.html)\[[ClusterMetricsExtension](ClusterMetricsExtension.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)Cluster metrics extension provider.
2. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy$.html "Permalink")  object [ClusterMetricsStrategy](ClusterMetricsStrategy$.html "Provide custom metrics strategy resources.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Provide custom metrics strategy resources.
3. [**](../../../akka/cluster/metrics/CollectionStartMessage$.html "Permalink")  case object [CollectionStartMessage](CollectionStartMessage$.html "Command for ClusterMetricsSupervisor to start metrics collection.") extends [CollectionControlMessage](CollectionControlMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableCommand for ClusterMetricsSupervisor to start metrics collection.

Command for ClusterMetricsSupervisor to start metrics collection.

Annotations@SerialVersionUID()
4. [**](../../../akka/cluster/metrics/CollectionStopMessage$.html "Permalink")  case object [CollectionStopMessage](CollectionStopMessage$.html "Command for ClusterMetricsSupervisor to stop metrics collection.") extends [CollectionControlMessage](CollectionControlMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableCommand for ClusterMetricsSupervisor to stop metrics collection.

Command for ClusterMetricsSupervisor to stop metrics collection.

Annotations@SerialVersionUID()
5. [**](../../../akka/cluster/metrics/CpuMetricsSelector$.html "Permalink")  case object [CpuMetricsSelector](CpuMetricsSelector$.html "MetricsSelector that uses the combined CPU time metrics and stolen CPU time metrics.") extends [CapacityMetricsSelector](CapacityMetricsSelector.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMetricsSelector that uses the combined CPU time metrics and stolen CPU time metrics.

MetricsSelector that uses the combined CPU time metrics and stolen CPU time metrics.
In modern Linux kernels: CpuCombined \+ CpuStolen \+ CpuIdle \= 1\.0 or 100%.
Combined CPU is sum of User \+ Sys \+ Nice \+ Wait times, as percentage.
Stolen CPU is the amount of CPU taken away from this virtual machine by the hypervisor, as percentage.

Low CPU capacity \=\> small node weight.

Annotations@SerialVersionUID()
6. [**](../../../akka/cluster/metrics/EWMA$.html "Permalink")  object [EWMA](EWMA$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
7. [**](../../../akka/cluster/metrics/HeapMetricsSelector$.html "Permalink")  case object [HeapMetricsSelector](HeapMetricsSelector$.html "MetricsSelector that uses the heap metrics.") extends [CapacityMetricsSelector](CapacityMetricsSelector.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMetricsSelector that uses the heap metrics.

MetricsSelector that uses the heap metrics.
Low heap capacity \=\> small weight.

Annotations@SerialVersionUID()
8. [**](../../../akka/cluster/metrics/Metric$.html "Permalink")  object [Metric](Metric$.html "Factory for creating valid Metric instances.") extends MetricNumericConverter with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Factory for creating valid Metric instances.
9. [**](../../../akka/cluster/metrics/MetricsSelector$.html "Permalink")  object [MetricsSelector](MetricsSelector$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
10. [**](../../../akka/cluster/metrics/MixMetricsSelector$.html "Permalink")  object [MixMetricsSelector](MixMetricsSelector$.html "Singleton instance of the default MixMetricsSelector, which uses [akka.cluster.routing.HeapMetricsSelector], [akka.cluster.routing.CpuMetricsSelector], and [akka.cluster.routing.SystemLoadAverageMetricsSelector]") extends [MixMetricsSelectorBase](MixMetricsSelectorBase.html)Singleton instance of the default MixMetricsSelector, which uses \[akka.cluster.routing.HeapMetricsSelector],
\[akka.cluster.routing.CpuMetricsSelector], and \[akka.cluster.routing.SystemLoadAverageMetricsSelector]

Singleton instance of the default MixMetricsSelector, which uses \[akka.cluster.routing.HeapMetricsSelector],
\[akka.cluster.routing.CpuMetricsSelector], and \[akka.cluster.routing.SystemLoadAverageMetricsSelector]

Annotations@SerialVersionUID()
11. [**](../../../akka/cluster/metrics/SigarProvider$.html "Permalink")  object [SigarProvider](SigarProvider$.html)
12. [**](../../../akka/cluster/metrics/StandardMetrics$.html "Permalink")  object [StandardMetrics](StandardMetrics$.html "Definitions of the built-in standard metrics.")Definitions of the built\-in standard metrics.

Definitions of the built\-in standard metrics.

The following extractors and data structures makes it easy to consume the
[NodeMetrics](NodeMetrics.html) in for example load balancers.
13. [**](../../../akka/cluster/metrics/SystemLoadAverageMetricsSelector$.html "Permalink")  case object [SystemLoadAverageMetricsSelector](SystemLoadAverageMetricsSelector$.html "MetricsSelector that uses the system load average metrics.") extends [CapacityMetricsSelector](CapacityMetricsSelector.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMetricsSelector that uses the system load average metrics.

MetricsSelector that uses the system load average metrics.
System load average is OS\-specific average load on the CPUs in the system,
for the past 1 minute. The system is possibly nearing a bottleneck if the
system load average is nearing number of cpus/cores.
Low load average capacity \=\> small weight.

Annotations@SerialVersionUID()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka/current/akka/actor/OneForOneStrategy.html
- https://doc.akka.io/api/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/AdaptiveLoadBalancingPool.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/CapacityMetricsSelector.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsChanged.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsEvent.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsExtension$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsExtension.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsStrategy$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/CollectionControlMessage.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/CollectionStartMessage$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/CollectionStopMessage$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/CpuMetricsSelector$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/DefaultSigarProvider.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/EWMA$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/EWMA.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/HeapMetricsSelector$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/JmxMetricsCollector.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/Metric$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/Metric.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/MetricsCollector.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/MetricsSelector$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/MixMetricsSelector$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/MixMetricsSelector.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/MixMetricsSelectorBase.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/SigarMetricsCollector.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/SigarProvider$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/SigarProvider.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/SystemLoadAverageMetricsSelector$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/metrics/index.html](https://doc.akka.io/api/akka/current/akka/cluster/metrics/index.html)*