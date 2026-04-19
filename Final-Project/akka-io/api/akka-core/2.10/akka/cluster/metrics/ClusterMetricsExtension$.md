---
description: Akka 2.10.17 - akka.cluster.metrics.ClusterMetricsExtension
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:25:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/ClusterMetricsExtension$.html
title: Akka 2.10.17 - akka.cluster.metrics.ClusterMetricsExtension
---

# Akka 2.10.17 - akka.cluster.metrics.ClusterMetricsExtension

> **Summary:** Akka 2.10.17 - akka.cluster.metrics.ClusterMetricsExtension

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/metrics/index.html "Permalink")  package [metrics](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/metrics/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[metrics](index.html)
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
[o](ClusterMetricsExtension.html "See companion class")[akka](../../index.html).[cluster](../index.html).[metrics](index.html)

# [ClusterMetricsExtension](ClusterMetricsExtension.html "See companion class")[**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html "Permalink")

### Companion [class ClusterMetricsExtension](ClusterMetricsExtension.html "See companion class")

#### object ClusterMetricsExtension extends [ExtensionId](../../actor/ExtensionId.html)\[[ClusterMetricsExtension](ClusterMetricsExtension.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)

Cluster metrics extension provider.

Source[ClusterMetricsExtension.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/main/scala/akka/cluster/metrics/ClusterMetricsExtension.scala#L90)Linear Supertypes[ExtensionIdProvider](../../actor/ExtensionIdProvider.html), [ExtensionId](../../actor/ExtensionId.html)\[[ClusterMetricsExtension](ClusterMetricsExtension.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterMetricsExtension
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): [ClusterMetricsExtension](ClusterMetricsExtension.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../actor/ExtensionId.html)
5. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](../../actor/ActorSystem.html)): [ClusterMetricsExtension](ClusterMetricsExtension.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../actor/ExtensionId.html)
6. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.cluster.metrics.ClusterMetricsExtension "Permalink")  def createExtension(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html)): [ClusterMetricsExtension](ClusterMetricsExtension.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesClusterMetricsExtension → [ExtensionId](../../actor/ExtensionId.html)
9. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../../actor/ExtensionId.html) → AnyRef → Any
11. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.cluster.metrics.ClusterMetricsExtension "Permalink")  def get(system: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): [ClusterMetricsExtension](ClusterMetricsExtension.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesClusterMetricsExtension → [ExtensionId](../../actor/ExtensionId.html)
12. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#get(system:akka.actor.ActorSystem):akka.cluster.metrics.ClusterMetricsExtension "Permalink")  def get(system: [ActorSystem](../../actor/ActorSystem.html)): [ClusterMetricsExtension](ClusterMetricsExtension.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ActorSystem): TheExtension = super.get(system)
```
Definition ClassesClusterMetricsExtension → [ExtensionId](../../actor/ExtensionId.html)
13. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../../actor/ExtensionId.html) → AnyRef → Any
15. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#lookup:akka.cluster.metrics.ClusterMetricsExtension.type "Permalink")  def lookup: ClusterMetricsExtensionReturns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesClusterMetricsExtension → [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)
17. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/metrics/ClusterMetricsExtension$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)

### Inherited from [ExtensionId](../../actor/ExtensionId.html)\[[ClusterMetricsExtension](ClusterMetricsExtension.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/CapacityMetricsSelector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsChanged.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsExtension$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsExtension.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/CollectionControlMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/CollectionStartMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/CollectionStopMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/CpuMetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/DefaultSigarProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/EWMA$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/EWMA.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/HeapMetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/JmxMetricsCollector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/Metric$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/Metric.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/MetricsCollector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/MetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/MixMetricsSelectorBase.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/SigarMetricsCollector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/SigarProvider$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/SigarProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/StandardMetrics$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/SystemLoadAverageMetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsExtension$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsExtension$.html)*