---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsExtension.html
title: ClusterMetricsExtension
---

# ClusterMetricsExtension

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class ClusterMetricsExtension

- java.lang.Object
- - akka.cluster.metrics.ClusterMetricsExtension

- All Implemented Interfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`

---

```
public class ClusterMetricsExtension
extends java.lang.Object
implements [Extension](../../actor/Extension.html "interface in akka.actor")
```

Cluster metrics extension.
 
 Cluster metrics is primarily for load\-balancing of nodes. It controls metrics sampling
 at a regular frequency, prepares highly variable data for further analysis by other entities,
 and publishes the latest cluster metrics data around the node ring and local eventStream
 to assist in determining the need to redirect traffic to the least\-loaded nodes.
 

 Metrics sampling is delegated to the [`MetricsCollector`](MetricsCollector.html "interface in akka.cluster.metrics").
 

 Smoothing of the data for each monitored process is delegated to the
 [`EWMA`](EWMA.html "class in akka.cluster.metrics") for exponential weighted moving average.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterMetricsExtension](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [ClusterMetricsExtension](ClusterMetricsExtension.html "class in akka.cluster.metrics")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [ClusterMetricsExtension](ClusterMetricsExtension.html "class in akka.cluster.metrics")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [ClusterMetricsExtension](ClusterMetricsExtension.html "class in akka.cluster.metrics")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ClusterMetricsExtension$](ClusterMetricsExtension$.html "class in akka.cluster.metrics")` | `[lookup](#lookup())()` |  |
	| `[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics")` | `[settings](#settings())()` | Metrics extension configuration. |
	| `void` | `[subscribe](#subscribe(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") metricsListener)` | Subscribe user metrics listener actor unto [`ClusterMetricsEvent`](ClusterMetricsEvent.html "interface in akka.cluster.metrics")  events published by extension on the system event bus. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[supervisor](#supervisor())()` | Supervisor actor. |
	| `void` | `[unsubscribe](#unsubscribe(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") metricsListenter)` | Unsubscribe user metrics listener actor from [`ClusterMetricsEvent`](ClusterMetricsEvent.html "interface in akka.cluster.metrics")  events published by extension on the system event bus. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterMetricsExtension
		
		
		
		```
		public ClusterMetricsExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### lookup
		
		
		
		```
		public static [ClusterMetricsExtension$](ClusterMetricsExtension$.html "class in akka.cluster.metrics") lookup()
		```
		- #### get
		
		
		
		```
		public static [ClusterMetricsExtension](ClusterMetricsExtension.html "class in akka.cluster.metrics") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [ClusterMetricsExtension](ClusterMetricsExtension.html "class in akka.cluster.metrics") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### createExtension
		
		
		
		```
		public static [ClusterMetricsExtension](ClusterMetricsExtension.html "class in akka.cluster.metrics") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### settings
		
		
		
		```
		public [ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings()
		```
		
		Metrics extension configuration.
		- #### supervisor
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") supervisor()
		```
		
		Supervisor actor.
		 Accepts subtypes of [`CollectionControlMessage`](CollectionControlMessage.html "class in akka.cluster.metrics")s to manage metrics collection at runtime.
		- #### subscribe
		
		
		
		```
		public void subscribe​([ActorRef](../../actor/ActorRef.html "class in akka.actor") metricsListener)
		```
		
		Subscribe user metrics listener actor unto [`ClusterMetricsEvent`](ClusterMetricsEvent.html "interface in akka.cluster.metrics")
		 events published by extension on the system event bus.
		- #### unsubscribe
		
		
		
		```
		public void unsubscribe​([ActorRef](../../actor/ActorRef.html "class in akka.actor") metricsListenter)
		```
		
		Unsubscribe user metrics listener actor from [`ClusterMetricsEvent`](ClusterMetricsEvent.html "interface in akka.cluster.metrics")
		 events published by extension on the system event bus.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsEvent.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsExtension$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsExtension.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/CollectionControlMessage.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/EWMA.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricsCollector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsExtension.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsExtension.html)*