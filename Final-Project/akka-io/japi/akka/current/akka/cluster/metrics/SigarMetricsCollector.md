---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/SigarMetricsCollector.html
title: SigarMetricsCollector
---

# SigarMetricsCollector

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class SigarMetricsCollector

- java.lang.Object
- - [akka.cluster.metrics.JmxMetricsCollector](JmxMetricsCollector.html "class in akka.cluster.metrics")
	- - akka.cluster.metrics.SigarMetricsCollector

- All Implemented Interfaces:
`[MetricsCollector](MetricsCollector.html "interface in akka.cluster.metrics")`, `java.io.Closeable`, `java.lang.AutoCloseable`

---

```
public class SigarMetricsCollector
extends [JmxMetricsCollector](JmxMetricsCollector.html "class in akka.cluster.metrics")
```

Loads metrics through Hyperic SIGAR and JMX monitoring beans. This
 loads wider and more accurate range of metrics compared to JmxMetricsCollector
 by using SIGAR's native OS library.
 
 The constructor will by design throw exception if org.hyperic.sigar.Sigar can't be loaded, due
 to missing classes or native libraries.
 

 param: address The [`Address`](../../actor/Address.html "class in akka.actor") of the node being sampled
 param: decayFactor how quickly the exponential weighting of past data is decayed
 param: sigar the org.hyperic.Sigar instance

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SigarMetricsCollector](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | This constructor is used when creating an instance from configured FQCN |
	| `[SigarMetricsCollector](#%3Cinit%3E(akka.actor.Address,double,org.hyperic.sigar.SigarProxy))​([Address](../../actor/Address.html "class in akka.actor") address,  double decayFactor,  org.hyperic.sigar.SigarProxy sigar)` |  |
	| `[SigarMetricsCollector](#%3Cinit%3E(akka.actor.Address,akka.cluster.metrics.ClusterMetricsSettings))​([Address](../../actor/Address.html "class in akka.actor") address,  [ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings)` |  |
	| `[SigarMetricsCollector](#%3Cinit%3E(akka.actor.Address,akka.cluster.metrics.ClusterMetricsSettings,org.hyperic.sigar.SigarProxy))​([Address](../../actor/Address.html "class in akka.actor") address,  [ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings,  org.hyperic.sigar.SigarProxy sigar)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[close](#close())()` | Releases any native resources associated with this instance. |
	| `scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[cpuCombined](#cpuCombined(org.hyperic.sigar.CpuPerc))​(org.hyperic.sigar.CpuPerc cpuPerc)` | (SIGAR) Returns the combined CPU sum of User \+ Sys \+ Nice \+ Wait, in percentage. |
	| `scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[cpuIdle](#cpuIdle(org.hyperic.sigar.CpuPerc))​(org.hyperic.sigar.CpuPerc cpuPerc)` | (SIGAR) Returns the idle CPU time. |
	| `scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[cpuStolen](#cpuStolen(org.hyperic.sigar.CpuPerc))​(org.hyperic.sigar.CpuPerc cpuPerc)` | (SIGAR) Returns the stolen CPU time. |
	| `scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[metrics](#metrics())()` | Generate metrics set. |
	| `scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[systemLoadAverage](#systemLoadAverage())()` | (SIGAR) Returns the OS\-specific average load on the CPUs in the system, for the past 1 minute. |
	
	
		- ### Methods inherited from class akka.cluster.metrics.[JmxMetricsCollector](JmxMetricsCollector.html "class in akka.cluster.metrics")
		
		
		`[heapCommitted](JmxMetricsCollector.html#heapCommitted(java.lang.management.MemoryUsage)), [heapMax](JmxMetricsCollector.html#heapMax(java.lang.management.MemoryUsage)), [heapMemoryUsage](JmxMetricsCollector.html#heapMemoryUsage()), [heapUsed](JmxMetricsCollector.html#heapUsed(java.lang.management.MemoryUsage)), [processors](JmxMetricsCollector.html#processors()), [sample](JmxMetricsCollector.html#sample())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SigarMetricsCollector
		
		
		
		```
		public SigarMetricsCollector​([Address](../../actor/Address.html "class in akka.actor") address,
		                             double decayFactor,
		                             org.hyperic.sigar.SigarProxy sigar)
		```
		- #### SigarMetricsCollector
		
		
		
		```
		public SigarMetricsCollector​([Address](../../actor/Address.html "class in akka.actor") address,
		                             [ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings,
		                             org.hyperic.sigar.SigarProxy sigar)
		```
		- #### SigarMetricsCollector
		
		
		
		```
		public SigarMetricsCollector​([Address](../../actor/Address.html "class in akka.actor") address,
		                             [ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings)
		```
		- #### SigarMetricsCollector
		
		
		
		```
		public SigarMetricsCollector​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		This constructor is used when creating an instance from configured FQCN

	- ### Method Detail
	
	
	
		- #### close
		
		
		
		```
		public void close()
		```
		
		Releases any native resources associated with this instance.
		
		Specified by:
		`close` in interface `java.lang.AutoCloseable`
		Specified by:
		`close` in interface `java.io.Closeable`
		Overrides:
		`[close](JmxMetricsCollector.html#close())` in class `[JmxMetricsCollector](JmxMetricsCollector.html "class in akka.cluster.metrics")`
		- #### cpuCombined
		
		
		
		```
		public scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> cpuCombined​(org.hyperic.sigar.CpuPerc cpuPerc)
		```
		
		(SIGAR) Returns the combined CPU sum of User \+ Sys \+ Nice \+ Wait, in percentage. This metric can describe
		 the amount of time the CPU spent executing code during n\-interval and how much more it could
		 theoretically. Note that 99% CPU utilization can be optimal or indicative of failure.
		 
		 In the data stream, this will sometimes return with a valid metric value, and sometimes as a NaN or Infinite.
		 Documented bug [749121](https://bugzilla.redhat.com/show_bug.cgi?id=749121) and several others.
		 
		
		
		 Creates a new instance each time.
		- #### cpuIdle
		
		
		
		```
		public scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> cpuIdle​(org.hyperic.sigar.CpuPerc cpuPerc)
		```
		
		(SIGAR) Returns the idle CPU time.
		 Amount of CPU time left after combined and stolen are removed.
		 
		 Creates a new instance each time.
		- #### cpuStolen
		
		
		
		```
		public scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> cpuStolen​(org.hyperic.sigar.CpuPerc cpuPerc)
		```
		
		(SIGAR) Returns the stolen CPU time. Relevant to virtual hosting environments.
		 For details please see: [Wikipedia \- CPU time subdivision](https://en.wikipedia.org/wiki/CPU_time#Subdivision) and
		 [Understanding AWS stolen CPU and how it affects your apps](https://www.datadoghq.com/2013/08/understanding-aws-stolen-cpu-and-how-it-affects-your-apps/)
		
		 Creates a new instance each time.
		- #### metrics
		
		
		
		```
		public scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> metrics()
		```
		
		Description copied from class: `[JmxMetricsCollector](JmxMetricsCollector.html#metrics())`
		Generate metrics set.
		 Creates a new instance each time.
		
		Overrides:
		`[metrics](JmxMetricsCollector.html#metrics())` in class `[JmxMetricsCollector](JmxMetricsCollector.html "class in akka.cluster.metrics")`
		- #### systemLoadAverage
		
		
		
		```
		public scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> systemLoadAverage()
		```
		
		(SIGAR) Returns the OS\-specific average load on the CPUs in the system, for the past 1 minute.
		 
		 Creates a new instance each time.
		
		
		
		Overrides:
		`[systemLoadAverage](JmxMetricsCollector.html#systemLoadAverage())` in class `[JmxMetricsCollector](JmxMetricsCollector.html "class in akka.cluster.metrics")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/JmxMetricsCollector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/Metric.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricsCollector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/SigarMetricsCollector.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/SigarMetricsCollector.html)*