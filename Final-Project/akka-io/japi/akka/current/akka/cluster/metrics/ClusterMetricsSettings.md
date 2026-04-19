---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsSettings.html
title: ClusterMetricsSettings
---

# ClusterMetricsSettings

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class ClusterMetricsSettings

- java.lang.Object
- - akka.cluster.metrics.ClusterMetricsSettings

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class ClusterMetricsSettings
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Metrics extension settings. Documented in: `src/main/resources/reference.conf`.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.ClusterMetricsSettings)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterMetricsSettings](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `boolean` | `[CollectorEnabled](#CollectorEnabled())()` |  |
	| `boolean` | `[CollectorFallback](#CollectorFallback())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[CollectorGossipInterval](#CollectorGossipInterval())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[CollectorMovingAverageHalfLife](#CollectorMovingAverageHalfLife())()` |  |
	| `java.lang.String` | `[CollectorProvider](#CollectorProvider())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[CollectorSampleInterval](#CollectorSampleInterval())()` |  |
	| `com.typesafe.config.Config` | `[config](#config())()` |  |
	| `[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics")` | `[copy](#copy(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `com.typesafe.config.Config` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[MetricsDispatcher](#MetricsDispatcher())()` |  |
	| `java.lang.String` | `[NativeLibraryExtractFolder](#NativeLibraryExtractFolder())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[PeriodicTasksInitialDelay](#PeriodicTasksInitialDelay())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[SupervisorName](#SupervisorName())()` |  |
	| `com.typesafe.config.Config` | `[SupervisorStrategyConfiguration](#SupervisorStrategyConfiguration())()` |  |
	| `java.lang.String` | `[SupervisorStrategyProvider](#SupervisorStrategyProvider())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<com.typesafe.config.Config>` | `[unapply](#unapply(akka.cluster.metrics.ClusterMetricsSettings))​([ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ClusterMetricsSettings
		
		
		
		```
		public ClusterMetricsSettings​(com.typesafe.config.Config config)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") apply​(com.typesafe.config.Config config)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<com.typesafe.config.Config> unapply​([ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") x$0)
		```
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```
		- #### MetricsDispatcher
		
		
		
		```
		public java.lang.String MetricsDispatcher()
		```
		- #### PeriodicTasksInitialDelay
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration PeriodicTasksInitialDelay()
		```
		- #### NativeLibraryExtractFolder
		
		
		
		```
		public java.lang.String NativeLibraryExtractFolder()
		```
		- #### SupervisorName
		
		
		
		```
		public java.lang.String SupervisorName()
		```
		- #### SupervisorStrategyProvider
		
		
		
		```
		public java.lang.String SupervisorStrategyProvider()
		```
		- #### SupervisorStrategyConfiguration
		
		
		
		```
		public com.typesafe.config.Config SupervisorStrategyConfiguration()
		```
		- #### CollectorEnabled
		
		
		
		```
		public boolean CollectorEnabled()
		```
		- #### CollectorProvider
		
		
		
		```
		public java.lang.String CollectorProvider()
		```
		- #### CollectorFallback
		
		
		
		```
		public boolean CollectorFallback()
		```
		- #### CollectorSampleInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration CollectorSampleInterval()
		```
		- #### CollectorGossipInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration CollectorGossipInterval()
		```
		- #### CollectorMovingAverageHalfLife
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration CollectorMovingAverageHalfLife()
		```
		- #### copy
		
		
		
		```
		public [ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") copy​(com.typesafe.config.Config config)
		```
		- #### copy$default$1
		
		
		
		```
		public com.typesafe.config.Config copy$default$1()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsSettings.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsSettings.html)*