---
description: Akka 2.10.17 - akka.cluster.metrics.SigarMetricsCollector
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:25:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/SigarMetricsCollector.html
title: Akka 2.10.17 - akka.cluster.metrics.SigarMetricsCollector
---

# Akka 2.10.17 - akka.cluster.metrics.SigarMetricsCollector

> **Summary:** Akka 2.10.17 - akka.cluster.metrics.SigarMetricsCollector

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
- SigarMetricsCollector
- [SigarProvider](SigarProvider.html "Provide sigar instance as SigarProxy.")
- [StandardMetrics](StandardMetrics$.html "Definitions of the built-in standard metrics.")
- [SystemLoadAverageMetricsSelector](SystemLoadAverageMetricsSelector$.html "MetricsSelector that uses the system load average metrics.")
c[akka](../../index.html).[cluster](../index.html).[metrics](index.html)

# SigarMetricsCollector[**](../../../akka/cluster/metrics/SigarMetricsCollector.html "Permalink")

### 

#### class SigarMetricsCollector extends [JmxMetricsCollector](JmxMetricsCollector.html)

Loads metrics through Hyperic SIGAR and JMX monitoring beans. This
loads wider and more accurate range of metrics compared to JmxMetricsCollector
by using SIGAR's native OS library.

The constructor will by design throw exception if org.hyperic.sigar.Sigar can't be loaded, due
to missing classes or native libraries.

Source[MetricsCollector.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/main/scala/akka/cluster/metrics/MetricsCollector.scala#L185)Linear Supertypes[JmxMetricsCollector](JmxMetricsCollector.html), [MetricsCollector](MetricsCollector.html), [Closeable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Closeable.html#java.io.Closeable), [AutoCloseable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/AutoCloseable.html#java.lang.AutoCloseable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SigarMetricsCollector
2. JmxMetricsCollector
3. MetricsCollector
4. Closeable
5. AutoCloseable
6. AnyRef
7. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#<init>(system:akka.actor.ActorSystem):akka.cluster.metrics.SigarMetricsCollector "Permalink")  new SigarMetricsCollector(system: [ActorSystem](../../actor/ActorSystem.html))This constructor is used when creating an instance from configured FQCN
2. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#<init>(address:akka.actor.Address,settings:akka.cluster.metrics.ClusterMetricsSettings):akka.cluster.metrics.SigarMetricsCollector "Permalink")  new SigarMetricsCollector(address: [Address](../../actor/Address.html), settings: [ClusterMetricsSettings](ClusterMetricsSettings.html))
3. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#<init>(address:akka.actor.Address,settings:akka.cluster.metrics.ClusterMetricsSettings,sigar:org.hyperic.sigar.SigarProxy):akka.cluster.metrics.SigarMetricsCollector "Permalink")  new SigarMetricsCollector(address: [Address](../../actor/Address.html), settings: [ClusterMetricsSettings](ClusterMetricsSettings.html), sigar: SigarProxy)
4. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#<init>(address:akka.actor.Address,decayFactor:Double,sigar:org.hyperic.sigar.SigarProxy):akka.cluster.metrics.SigarMetricsCollector "Permalink")  new SigarMetricsCollector(address: [Address](../../actor/Address.html), decayFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), sigar: SigarProxy)addressThe [akka.actor.Address](../../actor/Address.html) of the node being sampled

decayFactorhow quickly the exponential weighting of past data is decayed

sigarthe org.hyperic.Sigar instance
### Value Members

1. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SigarMetricsCollector toany2stringadd\[SigarMetricsCollector] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SigarMetricsCollector, B)ImplicitThis member is added by an implicit conversion from SigarMetricsCollector toArrowAssoc\[SigarMetricsCollector] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#close():Unit "Permalink")  def close(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Releases any native resources associated with this instance.

Releases any native resources associated with this instance.

Definition ClassesSigarMetricsCollector → [JmxMetricsCollector](JmxMetricsCollector.html) → Closeable → AutoCloseable
9. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#cpuCombined(cpuPerc:org.hyperic.sigar.CpuPerc):Option[akka.cluster.metrics.Metric] "Permalink")  def cpuCombined(cpuPerc: CpuPerc): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Metric](Metric.html)](SIGAR) Returns the combined CPU sum of User \+ Sys \+ Nice \+ Wait, in percentage.

(SIGAR) Returns the combined CPU sum of User \+ Sys \+ Nice \+ Wait, in percentage. This metric can describe
the amount of time the CPU spent executing code during n\-interval and how much more it could
theoretically. Note that 99% CPU utilization can be optimal or indicative of failure.

In the data stream, this will sometimes return with a valid metric value, and sometimes as a NaN or Infinite.
Documented bug [749121](https://bugzilla.redhat.com/show_bug.cgi?id=749121) and several others.

Creates a new instance each time.
10. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#cpuIdle(cpuPerc:org.hyperic.sigar.CpuPerc):Option[akka.cluster.metrics.Metric] "Permalink")  def cpuIdle(cpuPerc: CpuPerc): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Metric](Metric.html)](SIGAR) Returns the idle CPU time.

(SIGAR) Returns the idle CPU time.
Amount of CPU time left after combined and stolen are removed.

Creates a new instance each time.
11. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#cpuStolen(cpuPerc:org.hyperic.sigar.CpuPerc):Option[akka.cluster.metrics.Metric] "Permalink")  def cpuStolen(cpuPerc: CpuPerc): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Metric](Metric.html)](SIGAR) Returns the stolen CPU time.

(SIGAR) Returns the stolen CPU time. Relevant to virtual hosting environments.
For details please see: [Wikipedia \- CPU time subdivision](https://en.wikipedia.org/wiki/CPU_time#Subdivision) and
[Understanding AWS stolen CPU and how it affects your apps](https://www.datadoghq.com/2013/08/understanding-aws-stolen-cpu-and-how-it-affects-your-apps/)

Creates a new instance each time.
12. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SigarMetricsCollector) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SigarMetricsCollectorImplicitThis member is added by an implicit conversion from SigarMetricsCollector toEnsuring\[SigarMetricsCollector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SigarMetricsCollector) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SigarMetricsCollectorImplicitThis member is added by an implicit conversion from SigarMetricsCollector toEnsuring\[SigarMetricsCollector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SigarMetricsCollectorImplicitThis member is added by an implicit conversion from SigarMetricsCollector toEnsuring\[SigarMetricsCollector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SigarMetricsCollectorImplicitThis member is added by an implicit conversion from SigarMetricsCollector toEnsuring\[SigarMetricsCollector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#heapCommitted(heap:java.lang.management.MemoryUsage):Option[akka.cluster.metrics.Metric] "Permalink")  def heapCommitted(heap: [MemoryUsage](https://docs.oracle.com/en/java/javase/11/docs/api/java.management/java/lang/management/MemoryUsage.html#java.lang.management.MemoryUsage)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Metric](Metric.html)](JMX) Returns the current sum of heap memory guaranteed to be available to the JVM
from all heap memory pools (in bytes).

(JMX) Returns the current sum of heap memory guaranteed to be available to the JVM
from all heap memory pools (in bytes).
Creates a new instance each time.

Definition Classes[JmxMetricsCollector](JmxMetricsCollector.html)
21. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#heapMax(heap:java.lang.management.MemoryUsage):Option[akka.cluster.metrics.Metric] "Permalink")  def heapMax(heap: [MemoryUsage](https://docs.oracle.com/en/java/javase/11/docs/api/java.management/java/lang/management/MemoryUsage.html#java.lang.management.MemoryUsage)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Metric](Metric.html)](JMX) Returns the maximum amount of memory (in bytes) that can be used
for JVM memory management.

(JMX) Returns the maximum amount of memory (in bytes) that can be used
for JVM memory management. If not defined the metrics value is None, i.e.
never negative.
Creates a new instance each time.

Definition Classes[JmxMetricsCollector](JmxMetricsCollector.html)
22. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#heapMemoryUsage:java.lang.management.MemoryUsage "Permalink")  def heapMemoryUsage: [MemoryUsage](https://docs.oracle.com/en/java/javase/11/docs/api/java.management/java/lang/management/MemoryUsage.html#java.lang.management.MemoryUsage)Current heap to be passed in to heapUsed, heapCommitted and heapMax

Current heap to be passed in to heapUsed, heapCommitted and heapMax

Definition Classes[JmxMetricsCollector](JmxMetricsCollector.html)
23. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#heapUsed(heap:java.lang.management.MemoryUsage):Option[akka.cluster.metrics.Metric] "Permalink")  def heapUsed(heap: [MemoryUsage](https://docs.oracle.com/en/java/javase/11/docs/api/java.management/java/lang/management/MemoryUsage.html#java.lang.management.MemoryUsage)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Metric](Metric.html)](JMX) Returns the current sum of heap memory used from all heap memory pools (in bytes).

(JMX) Returns the current sum of heap memory used from all heap memory pools (in bytes).
Creates a new instance each time.

Definition Classes[JmxMetricsCollector](JmxMetricsCollector.html)
24. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#metrics():Set[akka.cluster.metrics.Metric] "Permalink")  def metrics(): Set\[[Metric](Metric.html)]Generate metrics set.

Generate metrics set.
Creates a new instance each time.

Definition ClassesSigarMetricsCollector → [JmxMetricsCollector](JmxMetricsCollector.html)
26. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#processors:Option[akka.cluster.metrics.Metric] "Permalink")  def processors: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Metric](Metric.html)](JMX) Returns the number of available processors
Creates a new instance each time.

(JMX) Returns the number of available processors
Creates a new instance each time.

Definition Classes[JmxMetricsCollector](JmxMetricsCollector.html)
30. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#sample():akka.cluster.metrics.NodeMetrics "Permalink")  def sample(): [NodeMetrics](NodeMetrics.html)Samples and collects new data points.

Samples and collects new data points.
Creates a new instance each time.

Definition Classes[JmxMetricsCollector](JmxMetricsCollector.html) → [MetricsCollector](MetricsCollector.html)
31. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#systemLoadAverage:Option[akka.cluster.metrics.Metric] "Permalink")  def systemLoadAverage: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Metric](Metric.html)](SIGAR) Returns the OS\-specific average load on the CPUs in the system, for the past 1 minute.

(SIGAR) Returns the OS\-specific average load on the CPUs in the system, for the past 1 minute.

Creates a new instance each time.

Definition ClassesSigarMetricsCollector → [JmxMetricsCollector](JmxMetricsCollector.html)
33. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
34. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SigarMetricsCollector toStringFormat\[SigarMetricsCollector] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/metrics/SigarMetricsCollector.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SigarMetricsCollector, B)ImplicitThis member is added by an implicit conversion from SigarMetricsCollector toArrowAssoc\[SigarMetricsCollector] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [JmxMetricsCollector](JmxMetricsCollector.html)

### Inherited from [MetricsCollector](MetricsCollector.html)

### Inherited from [Closeable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Closeable.html#java.io.Closeable)

### Inherited from [AutoCloseable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/AutoCloseable.html#java.lang.AutoCloseable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSigarMetricsCollector to any2stringadd\[SigarMetricsCollector]

### Inherited by implicit conversion StringFormat fromSigarMetricsCollector to StringFormat\[SigarMetricsCollector]

### Inherited by implicit conversion Ensuring fromSigarMetricsCollector to Ensuring\[SigarMetricsCollector]

### Inherited by implicit conversion ArrowAssoc fromSigarMetricsCollector to ArrowAssoc\[SigarMetricsCollector]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/SigarMetricsCollector.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/SigarMetricsCollector.html)*