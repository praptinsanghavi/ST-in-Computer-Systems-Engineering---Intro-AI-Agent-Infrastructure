---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/JmxMetricsCollector.html
title: JmxMetricsCollector
---

# JmxMetricsCollector

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class JmxMetricsCollector

- java.lang.Object
- - akka.cluster.metrics.JmxMetricsCollector

- All Implemented Interfaces:
`[MetricsCollector](MetricsCollector.html "interface in akka.cluster.metrics")`, `java.io.Closeable`, `java.lang.AutoCloseable`

Direct Known Subclasses:
`[SigarMetricsCollector](SigarMetricsCollector.html "class in akka.cluster.metrics")`

---

```
public class JmxMetricsCollector
extends java.lang.Object
implements [MetricsCollector](MetricsCollector.html "interface in akka.cluster.metrics")
```

Loads JVM and system metrics through JMX monitoring beans.
 
 param: address The [`Address`](../../actor/Address.html "class in akka.actor") of the node being sampled
 param: decayFactor how quickly the exponential weighting of past data is decayed

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JmxMetricsCollector](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | This constructor is used when creating an instance from configured FQCN |
	| `[JmxMetricsCollector](#%3Cinit%3E(akka.actor.Address,double))​([Address](../../actor/Address.html "class in akka.actor") address,  double decayFactor)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[close](#close())()` |  |
	| `scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[heapCommitted](#heapCommitted(java.lang.management.MemoryUsage))​(java.lang.management.MemoryUsage heap)` | (JMX) Returns the current sum of heap memory guaranteed to be available to the JVM  from all heap memory pools (in bytes). |
	| `scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[heapMax](#heapMax(java.lang.management.MemoryUsage))​(java.lang.management.MemoryUsage heap)` | (JMX) Returns the maximum amount of memory (in bytes) that can be used  for JVM memory management. |
	| `java.lang.management.MemoryUsage` | `[heapMemoryUsage](#heapMemoryUsage())()` | Current heap to be passed in to heapUsed, heapCommitted and heapMax |
	| `scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[heapUsed](#heapUsed(java.lang.management.MemoryUsage))​(java.lang.management.MemoryUsage heap)` | (JMX) Returns the current sum of heap memory used from all heap memory pools (in bytes). |
	| `scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[metrics](#metrics())()` | Generate metrics set. |
	| `scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[processors](#processors())()` | (JMX) Returns the number of available processors  Creates a new instance each time. |
	| `[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")` | `[sample](#sample())()` | Samples and collects new data points. |
	| `scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[systemLoadAverage](#systemLoadAverage())()` | (JMX) Returns the OS\-specific average load on the CPUs in the system, for the past 1 minute. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JmxMetricsCollector
		
		
		
		```
		public JmxMetricsCollector​([Address](../../actor/Address.html "class in akka.actor") address,
		                           double decayFactor)
		```
		- #### JmxMetricsCollector
		
		
		
		```
		public JmxMetricsCollector​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		This constructor is used when creating an instance from configured FQCN

	- ### Method Detail
	
	
	
		- #### close
		
		
		
		```
		public void close()
		```
		
		
		Specified by:
		`close` in interface `java.lang.AutoCloseable`
		Specified by:
		`close` in interface `java.io.Closeable`
		- #### heapCommitted
		
		
		
		```
		public scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> heapCommitted​(java.lang.management.MemoryUsage heap)
		```
		
		(JMX) Returns the current sum of heap memory guaranteed to be available to the JVM
		 from all heap memory pools (in bytes).
		 Creates a new instance each time.
		- #### heapMax
		
		
		
		```
		public scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> heapMax​(java.lang.management.MemoryUsage heap)
		```
		
		(JMX) Returns the maximum amount of memory (in bytes) that can be used
		 for JVM memory management. If not defined the metrics value is None, i.e.
		 never negative.
		 Creates a new instance each time.
		- #### heapMemoryUsage
		
		
		
		```
		public java.lang.management.MemoryUsage heapMemoryUsage()
		```
		
		Current heap to be passed in to heapUsed, heapCommitted and heapMax
		- #### heapUsed
		
		
		
		```
		public scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> heapUsed​(java.lang.management.MemoryUsage heap)
		```
		
		(JMX) Returns the current sum of heap memory used from all heap memory pools (in bytes).
		 Creates a new instance each time.
		- #### metrics
		
		
		
		```
		public scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> metrics()
		```
		
		Generate metrics set.
		 Creates a new instance each time.
		- #### processors
		
		
		
		```
		public scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> processors()
		```
		
		(JMX) Returns the number of available processors
		 Creates a new instance each time.
		- #### sample
		
		
		
		```
		public [NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") sample()
		```
		
		Samples and collects new data points.
		 Creates a new instance each time.
		
		Specified by:
		`[sample](MetricsCollector.html#sample())` in interface `[MetricsCollector](MetricsCollector.html "interface in akka.cluster.metrics")`
		- #### systemLoadAverage
		
		
		
		```
		public scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> systemLoadAverage()
		```
		
		(JMX) Returns the OS\-specific average load on the CPUs in the system, for the past 1 minute.
		 On some systems the JMX OS system load average may not be available, in which case a \-1 is
		 returned from JMX, and None is returned from this method.
		 Creates a new instance each time.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/Metric.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricsCollector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/SigarMetricsCollector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/JmxMetricsCollector.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/JmxMetricsCollector.html)*