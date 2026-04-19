---
description: Akka 2.10.17 - akka.cluster.metrics.MetricsSelector
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:02:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/MetricsSelector.html
title: Akka 2.10.17 - akka.cluster.metrics.MetricsSelector
---

# Akka 2.10.17 - akka.cluster.metrics.MetricsSelector

> **Summary:** Akka 2.10.17 - akka.cluster.metrics.MetricsSelector

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
- MetricsSelector
- [MixMetricsSelector](MixMetricsSelector.html "MetricsSelector that combines other selectors and aggregates their capacity values.")
- [MixMetricsSelectorBase](MixMetricsSelectorBase.html "Base class for MetricsSelector that combines other selectors and aggregates their capacity.")
- [NodeMetrics](NodeMetrics.html "The snapshot of current sampled health metrics for any monitored process.")
- [SigarMetricsCollector](SigarMetricsCollector.html "Loads metrics through Hyperic SIGAR and JMX monitoring beans.")
- [SigarProvider](SigarProvider.html "Provide sigar instance as SigarProxy.")
- [StandardMetrics](StandardMetrics$.html "Definitions of the built-in standard metrics.")
- [SystemLoadAverageMetricsSelector](SystemLoadAverageMetricsSelector$.html "MetricsSelector that uses the system load average metrics.")
[t](MetricsSelector$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[metrics](index.html)

# [MetricsSelector](MetricsSelector$.html "See companion object")[**](../../../akka/cluster/metrics/MetricsSelector.html "Permalink")

### Companion [object MetricsSelector](MetricsSelector$.html "See companion object")

#### trait MetricsSelector extends Serializable

A MetricsSelector is responsible for producing weights from the node metrics.

Annotations@nowarn() @SerialVersionUID() Source[ClusterMetricsRouting.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/main/scala/akka/cluster/metrics/ClusterMetricsRouting.scala#L425)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[CapacityMetricsSelector](CapacityMetricsSelector.html), [CpuMetricsSelector](CpuMetricsSelector$.html), [HeapMetricsSelector](HeapMetricsSelector$.html), [MixMetricsSelector](MixMetricsSelector.html), [MixMetricsSelector](MixMetricsSelector$.html), [MixMetricsSelectorBase](MixMetricsSelectorBase.html), [SystemLoadAverageMetricsSelector](SystemLoadAverageMetricsSelector$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MetricsSelector
2. Serializable
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../akka/cluster/metrics/MetricsSelector.html#weights(nodeMetrics:Set[akka.cluster.metrics.NodeMetrics]):Map[akka.actor.Address,Int] "Permalink") abstract  def weights(nodeMetrics: Set\[[NodeMetrics](NodeMetrics.html)]): Map\[[Address](../../actor/Address.html), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]The weights per address, based on the nodeMetrics.
### Concrete Value Members

1. [**](../../../akka/cluster/metrics/MetricsSelector.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/metrics/MetricsSelector.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/metrics/MetricsSelector.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MetricsSelector toany2stringadd\[MetricsSelector] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/metrics/MetricsSelector.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MetricsSelector, B)ImplicitThis member is added by an implicit conversion from MetricsSelector toArrowAssoc\[MetricsSelector] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/metrics/MetricsSelector.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/metrics/MetricsSelector.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/metrics/MetricsSelector.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/metrics/MetricsSelector.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MetricsSelector) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MetricsSelectorImplicitThis member is added by an implicit conversion from MetricsSelector toEnsuring\[MetricsSelector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/metrics/MetricsSelector.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MetricsSelector) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MetricsSelectorImplicitThis member is added by an implicit conversion from MetricsSelector toEnsuring\[MetricsSelector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/metrics/MetricsSelector.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MetricsSelectorImplicitThis member is added by an implicit conversion from MetricsSelector toEnsuring\[MetricsSelector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/metrics/MetricsSelector.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MetricsSelectorImplicitThis member is added by an implicit conversion from MetricsSelector toEnsuring\[MetricsSelector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/metrics/MetricsSelector.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/metrics/MetricsSelector.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/metrics/MetricsSelector.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/metrics/MetricsSelector.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/metrics/MetricsSelector.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/metrics/MetricsSelector.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/metrics/MetricsSelector.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/metrics/MetricsSelector.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/metrics/MetricsSelector.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/cluster/metrics/MetricsSelector.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/cluster/metrics/MetricsSelector.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/metrics/MetricsSelector.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/cluster/metrics/MetricsSelector.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/metrics/MetricsSelector.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/metrics/MetricsSelector.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MetricsSelector toStringFormat\[MetricsSelector] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/metrics/MetricsSelector.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MetricsSelector, B)ImplicitThis member is added by an implicit conversion from MetricsSelector toArrowAssoc\[MetricsSelector] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMetricsSelector to any2stringadd\[MetricsSelector]

### Inherited by implicit conversion StringFormat fromMetricsSelector to StringFormat\[MetricsSelector]

### Inherited by implicit conversion Ensuring fromMetricsSelector to Ensuring\[MetricsSelector]

### Inherited by implicit conversion ArrowAssoc fromMetricsSelector to ArrowAssoc\[MetricsSelector]

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
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/SystemLoadAverageMetricsSelector$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/metrics/MetricsSelector.html](https://doc.akka.io/api/akka/current/akka/cluster/metrics/MetricsSelector.html)*