---
description: Akka 2.10.17 - akka.cluster.metrics.StandardMetrics
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:02:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/StandardMetrics$.html
title: Akka 2.10.17 - akka.cluster.metrics.StandardMetrics
---

# Akka 2.10.17 - akka.cluster.metrics.StandardMetrics

> **Summary:** Akka 2.10.17 - akka.cluster.metrics.StandardMetrics

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
- StandardMetrics
- [SystemLoadAverageMetricsSelector](SystemLoadAverageMetricsSelector$.html "MetricsSelector that uses the system load average metrics.")
o[akka](../../index.html).[cluster](../index.html).[metrics](index.html)

# StandardMetrics[**](../../../akka/cluster/metrics/StandardMetrics$.html "Permalink")

### 

#### object StandardMetrics

Definitions of the built\-in standard metrics.

The following extractors and data structures makes it easy to consume the
[NodeMetrics](NodeMetrics.html) in for example load balancers.

Source[Metric.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/main/scala/akka/cluster/metrics/Metric.scala#L103)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StandardMetrics
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html "Permalink") final  case class [Cpu](StandardMetrics$$Cpu.html)(address: [Address](../../actor/Address.html), timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), systemLoadAverage: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], cpuCombined: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], cpuStolen: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], processors: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializableaddress[akka.actor.Address](../../actor/Address.html) of the node the metrics are gathered at

timestampthe time of sampling, in milliseconds since midnight, January 1, 1970 UTC

systemLoadAverageOS\-specific average load on the CPUs in the system, for the past 1 minute,
 The system is possibly nearing a bottleneck if the system load average is nearing number of cpus/cores.

cpuCombinedcombined CPU sum of User \+ Sys \+ Nice \+ Wait, in percentage (\[0\.0 \- 1\.0]. This
 metric can describe the amount of time the CPU spent executing code during n\-interval and how
 much more it could theoretically.

cpuStolenstolen CPU time, in percentage (\[0\.0 \- 1\.0].

processorsthe number of available processors

Annotations@SerialVersionUID()
2. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html "Permalink") final  case class [HeapMemory](StandardMetrics$$HeapMemory.html "The amount of used and committed memory will always be <= max if max is defined.")(address: [Address](../../actor/Address.html), timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), used: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), committed: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), max: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe amount of used and committed memory will always be \<\= max if max is defined.

The amount of used and committed memory will always be \<\= max if max is defined.
A memory allocation may fail if it attempts to increase the used memory such that used \> committed
even if used \<\= max is true (e.g. when the system virtual memory is low).

address[akka.actor.Address](../../actor/Address.html) of the node the metrics are gathered at

timestampthe time of sampling, in milliseconds since midnight, January 1, 1970 UTC

usedthe current sum of heap memory used from all heap memory pools (in bytes)

committedthe current sum of heap memory guaranteed to be available to the JVM
 from all heap memory pools (in bytes). Committed will always be greater than or equal to used.

maxthe maximum amount of memory (in bytes) that can be used for JVM memory management.
 Can be undefined on some OS.

Annotations@SerialVersionUID()
### Value Members

1. [**](../../../akka/cluster/metrics/StandardMetrics$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/metrics/StandardMetrics$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/metrics/StandardMetrics$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/metrics/StandardMetrics$.html#CpuCombined:String("cpu-combined") "Permalink") final  val CpuCombined: String("cpu\-combined")Sum of User \+ Sys \+ Nice \+ Wait.

Sum of User \+ Sys \+ Nice \+ Wait. See `org.hyperic.sigar.CpuPerc`
5. [**](../../../akka/cluster/metrics/StandardMetrics$.html#CpuIdle:String("cpu-idle") "Permalink") final  val CpuIdle: String("cpu\-idle")Amount of CPU time left after combined and stolen are removed.
6. [**](../../../akka/cluster/metrics/StandardMetrics$.html#CpuStolen:String("cpu-stolen") "Permalink") final  val CpuStolen: String("cpu\-stolen")The amount of CPU 'stolen' from this virtual machine by the hypervisor for other tasks (such as running another virtual machine).
7. [**](../../../akka/cluster/metrics/StandardMetrics$.html#HeapMemoryCommitted:String("heap-memory-committed") "Permalink") final  val HeapMemoryCommitted: String("heap\-memory\-committed")
8. [**](../../../akka/cluster/metrics/StandardMetrics$.html#HeapMemoryMax:String("heap-memory-max") "Permalink") final  val HeapMemoryMax: String("heap\-memory\-max")
9. [**](../../../akka/cluster/metrics/StandardMetrics$.html#HeapMemoryUsed:String("heap-memory-used") "Permalink") final  val HeapMemoryUsed: String("heap\-memory\-used")
10. [**](../../../akka/cluster/metrics/StandardMetrics$.html#Processors:String("processors") "Permalink") final  val Processors: String("processors")
11. [**](../../../akka/cluster/metrics/StandardMetrics$.html#SystemLoadAverage:String("system-load-average") "Permalink") final  val SystemLoadAverage: String("system\-load\-average")
12. [**](../../../akka/cluster/metrics/StandardMetrics$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../../akka/cluster/metrics/StandardMetrics$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/metrics/StandardMetrics$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/metrics/StandardMetrics$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/cluster/metrics/StandardMetrics$.html#extractCpu(nodeMetrics:akka.cluster.metrics.NodeMetrics):akka.cluster.metrics.StandardMetrics.Cpu "Permalink")  def extractCpu(nodeMetrics: [NodeMetrics](NodeMetrics.html)): [Cpu](StandardMetrics$$Cpu.html)Java API to extract Cpu data from nodeMetrics, if the nodeMetrics
contains necessary cpu metrics, otherwise it returns null.
17. [**](../../../akka/cluster/metrics/StandardMetrics$.html#extractHeapMemory(nodeMetrics:akka.cluster.metrics.NodeMetrics):akka.cluster.metrics.StandardMetrics.HeapMemory "Permalink")  def extractHeapMemory(nodeMetrics: [NodeMetrics](NodeMetrics.html)): [HeapMemory](StandardMetrics$$HeapMemory.html)Java API to extract HeapMemory data from nodeMetrics, if the nodeMetrics
contains necessary heap metrics, otherwise it returns null.
18. [**](../../../akka/cluster/metrics/StandardMetrics$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/metrics/StandardMetrics$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/metrics/StandardMetrics$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../akka/cluster/metrics/StandardMetrics$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/cluster/metrics/StandardMetrics$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/metrics/StandardMetrics$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/cluster/metrics/StandardMetrics$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../akka/cluster/metrics/StandardMetrics$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../akka/cluster/metrics/StandardMetrics$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/cluster/metrics/StandardMetrics$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/cluster/metrics/StandardMetrics$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html "Permalink")  object [Cpu](StandardMetrics$$Cpu$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
30. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory$.html "Permalink")  object [HeapMemory](StandardMetrics$$HeapMemory$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../../akka/cluster/metrics/StandardMetrics$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Address.html
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
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$Cpu$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$Cpu.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$HeapMemory$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$HeapMemory.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/SystemLoadAverageMetricsSelector$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$.html](https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$.html)*