---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:10:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/package-summary.html
title: akka.cluster.metrics
---

# akka.cluster.metrics

## Content

# Package akka.cluster.metrics

- Interface Summary 
| Interface | Description |
| [ClusterMetricsEvent](ClusterMetricsEvent.html "interface in akka.cluster.metrics") | Local cluster metrics extension events. |
| --- | --- |
| [ClusterMetricsMessage](ClusterMetricsMessage.html "interface in akka.cluster.metrics") | INTERNAL API. |
| [MetricNumericConverter](MetricNumericConverter.html "interface in akka.cluster.metrics") | INTERNAL API |
| [MetricsCollector](MetricsCollector.html "interface in akka.cluster.metrics") | Metrics sampler. |
| [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") | A MetricsSelector is responsible for producing weights from the node metrics. |
| [SigarProvider](SigarProvider.html "interface in akka.cluster.metrics") | Provide sigar instance as `SigarProxy`. |
- Class Summary 
| Class | Description |
| [AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics") | A router group that performs load balancing of messages to cluster nodes based on  cluster metric data. |
| --- | --- |
| [AdaptiveLoadBalancingGroup$](AdaptiveLoadBalancingGroup$.html "class in akka.cluster.metrics") |  |
| [AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") | A router pool that performs load balancing of messages to cluster nodes based on  cluster metric data. |
| [AdaptiveLoadBalancingPool$](AdaptiveLoadBalancingPool$.html "class in akka.cluster.metrics") |  |
| [AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics") | Load balancing of messages to cluster nodes based on cluster metric data. |
| [AdaptiveLoadBalancingRoutingLogic$](AdaptiveLoadBalancingRoutingLogic$.html "class in akka.cluster.metrics") |  |
| [CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics") | A MetricsSelector producing weights from remaining capacity. |
| [ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics") | Current snapshot of cluster node metrics. |
| [ClusterMetricsChanged$](ClusterMetricsChanged$.html "class in akka.cluster.metrics") |  |
| [ClusterMetricsCollector$](ClusterMetricsCollector$.html "class in akka.cluster.metrics") | INTERNAL API. |
| [ClusterMetricsExtension](ClusterMetricsExtension.html "class in akka.cluster.metrics") | Cluster metrics extension. |
| [ClusterMetricsExtension$](ClusterMetricsExtension$.html "class in akka.cluster.metrics") | Cluster metrics extension provider. |
| [ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") | Metrics extension settings. |
| [ClusterMetricsSettings$](ClusterMetricsSettings$.html "class in akka.cluster.metrics") |  |
| [ClusterMetricsStrategy](ClusterMetricsStrategy.html "class in akka.cluster.metrics") | Default `ClusterMetricsSupervisor` strategy:  A configurable [`OneForOneStrategy`](../../actor/OneForOneStrategy.html "class in akka.actor") with restart\-on\-throwable decider. |
| [ClusterMetricsStrategy$](ClusterMetricsStrategy$.html "class in akka.cluster.metrics") | Provide custom metrics strategy resources. |
| [CollectionControlMessage](CollectionControlMessage.html "class in akka.cluster.metrics") | Runtime collection management commands. |
| [CollectionStartMessage](CollectionStartMessage.html "class in akka.cluster.metrics") | Command for `ClusterMetricsSupervisor` to start metrics collection. |
| [CollectionStartMessage$](CollectionStartMessage$.html "class in akka.cluster.metrics") | Command for `ClusterMetricsSupervisor` to start metrics collection. |
| [CollectionStopMessage](CollectionStopMessage.html "class in akka.cluster.metrics") | Command for `ClusterMetricsSupervisor` to stop metrics collection. |
| [CollectionStopMessage$](CollectionStopMessage$.html "class in akka.cluster.metrics") | Command for `ClusterMetricsSupervisor` to stop metrics collection. |
| [CpuMetricsSelector](CpuMetricsSelector.html "class in akka.cluster.metrics") | MetricsSelector that uses the combined CPU time metrics and stolen CPU time metrics. |
| [CpuMetricsSelector$](CpuMetricsSelector$.html "class in akka.cluster.metrics") | MetricsSelector that uses the combined CPU time metrics and stolen CPU time metrics. |
| [DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics") | Provide sigar instance as `SigarProxy` with configured location via [`ClusterMetricsSettings`](ClusterMetricsSettings.html "class in akka.cluster.metrics"). |
| [DefaultSigarProvider$](DefaultSigarProvider$.html "class in akka.cluster.metrics") |  |
| [EWMA](EWMA.html "class in akka.cluster.metrics") | The exponentially weighted moving average (EWMA) approach captures short\-term  movements in volatility for a conditional volatility forecasting model. |
| [EWMA$](EWMA$.html "class in akka.cluster.metrics") |  |
| [HeapMetricsSelector](HeapMetricsSelector.html "class in akka.cluster.metrics") | MetricsSelector that uses the heap metrics. |
| [HeapMetricsSelector$](HeapMetricsSelector$.html "class in akka.cluster.metrics") | MetricsSelector that uses the heap metrics. |
| [JmxMetricsCollector](JmxMetricsCollector.html "class in akka.cluster.metrics") | Loads JVM and system metrics through JMX monitoring beans. |
| [Metric](Metric.html "class in akka.cluster.metrics") | Metrics key/value. |
| [Metric$](Metric$.html "class in akka.cluster.metrics") | Factory for creating valid Metric instances. |
| [MetricsCollector$](MetricsCollector$.html "class in akka.cluster.metrics") | INTERNAL API |
| [MetricsGossip$](MetricsGossip$.html "class in akka.cluster.metrics") | INTERNAL API |
| [MetricsGossipEnvelope$](MetricsGossipEnvelope$.html "class in akka.cluster.metrics") |  |
| [MetricsSelector$](MetricsSelector$.html "class in akka.cluster.metrics") |  |
| [MixMetricsSelector](MixMetricsSelector.html "class in akka.cluster.metrics") |  |
| [MixMetricsSelector$](MixMetricsSelector$.html "class in akka.cluster.metrics") | Singleton instance of the default MixMetricsSelector, which uses \[akka.cluster.routing.HeapMetricsSelector],  \[akka.cluster.routing.CpuMetricsSelector], and \[akka.cluster.routing.SystemLoadAverageMetricsSelector] |
| [MixMetricsSelectorBase](MixMetricsSelectorBase.html "class in akka.cluster.metrics") | Base class for MetricsSelector that combines other selectors and aggregates their capacity. |
| [NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") | The snapshot of current sampled health metrics for any monitored process. |
| [NodeMetrics$](NodeMetrics$.html "class in akka.cluster.metrics") |  |
| [SigarMetricsCollector](SigarMetricsCollector.html "class in akka.cluster.metrics") | Loads metrics through Hyperic SIGAR and JMX monitoring beans. |
| [SigarProvider$](SigarProvider$.html "class in akka.cluster.metrics") |  |
| [StandardMetrics](StandardMetrics.html "class in akka.cluster.metrics") | Definitions of the built\-in standard metrics. |
| [StandardMetrics.Cpu](StandardMetrics.Cpu.html "class in akka.cluster.metrics") |  |
| [StandardMetrics.Cpu$](StandardMetrics.Cpu$.html "class in akka.cluster.metrics") |  |
| [StandardMetrics.HeapMemory](StandardMetrics.HeapMemory.html "class in akka.cluster.metrics") |  |
| [StandardMetrics.HeapMemory$](StandardMetrics.HeapMemory$.html "class in akka.cluster.metrics") |  |
| [StandardMetrics$](StandardMetrics$.html "class in akka.cluster.metrics") | Definitions of the built\-in standard metrics. |
| [SystemLoadAverageMetricsSelector](SystemLoadAverageMetricsSelector.html "class in akka.cluster.metrics") | MetricsSelector that uses the system load average metrics. |
| [SystemLoadAverageMetricsSelector$](SystemLoadAverageMetricsSelector$.html "class in akka.cluster.metrics") | MetricsSelector that uses the system load average metrics. |
| [TryNative](TryNative.html "class in akka.cluster.metrics") | INTERNAL API |
| [TryNative$](TryNative$.html "class in akka.cluster.metrics") | INTERNAL API |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/OneForOneStrategy.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/AdaptiveLoadBalancingGroup$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/AdaptiveLoadBalancingPool$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/AdaptiveLoadBalancingPool.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/CapacityMetricsSelector.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/ClusterMetricsChanged$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/ClusterMetricsChanged.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/ClusterMetricsCollector$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/ClusterMetricsEvent.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/ClusterMetricsExtension$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/ClusterMetricsExtension.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/ClusterMetricsMessage.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/ClusterMetricsSettings$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/ClusterMetricsSettings.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/ClusterMetricsStrategy$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/ClusterMetricsStrategy.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/CollectionControlMessage.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/CollectionStartMessage$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/CollectionStartMessage.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/CollectionStopMessage$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/CollectionStopMessage.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/CpuMetricsSelector$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/CpuMetricsSelector.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/DefaultSigarProvider$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/DefaultSigarProvider.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/EWMA$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/EWMA.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/HeapMetricsSelector$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/HeapMetricsSelector.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/JmxMetricsCollector.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/Metric$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/Metric.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/MetricNumericConverter.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/MetricsCollector$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/MetricsCollector.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/MetricsGossip$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/MetricsGossipEnvelope$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/MetricsSelector$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/MixMetricsSelector$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/MixMetricsSelector.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/MixMetricsSelectorBase.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/NodeMetrics$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/SigarMetricsCollector.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/SigarProvider$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/SigarProvider.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/cluster/metrics/package-summary.html)*