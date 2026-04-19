---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html
title: AdaptiveLoadBalancingRoutingLogic
---

# AdaptiveLoadBalancingRoutingLogic

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class AdaptiveLoadBalancingRoutingLogic

- java.lang.Object
- - akka.cluster.metrics.AdaptiveLoadBalancingRoutingLogic

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class AdaptiveLoadBalancingRoutingLogic
extends java.lang.Object
implements [RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing"), [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor"), scala.Product, java.io.Serializable
```

Load balancing of messages to cluster nodes based on cluster metric data.
 
 It uses random selection of routees based on probabilities derived from
 the remaining capacity of corresponding node.
 

 param: system the actor system hosting this router
 

 param: metricsSelector decides what probability to use for selecting a routee, based
 on remaining capacity as indicated by the node metrics

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.AdaptiveLoadBalancingRoutingLogic)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AdaptiveLoadBalancingRoutingLogic](#%3Cinit%3E(akka.actor.ActorSystem,akka.cluster.metrics.MetricsSelector))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system,  [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static [AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics")` | `[apply](#apply(akka.actor.ActorSystem,akka.cluster.metrics.MetricsSelector))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system,  [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector)` |  |
	| `static [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[apply$default$2](#apply$default$2())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics")` | `[copy](#copy(akka.actor.ActorSystem,akka.cluster.metrics.MetricsSelector))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system,  [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector)` |  |
	| `[ActorSystem](../../actor/ActorSystem.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `void` | `[metricsChanged](#metricsChanged(akka.cluster.metrics.ClusterMetricsChanged))​([ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics") event)` |  |
	| `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[metricsSelector](#metricsSelector())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Routee](../../routing/Routee.html "interface in akka.routing")` | `[select](#select(java.lang.Object,scala.collection.immutable.IndexedSeq))​(java.lang.Object message,  scala.collection.immutable.IndexedSeq<[Routee](../../routing/Routee.html "interface in akka.routing")> routees)` | Pick the destination for a given message. |
	| `[ActorSystem](../../actor/ActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[ActorSystem](../../actor/ActorSystem.html "class in akka.actor"),​[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")>>` | `[unapply](#unapply(akka.cluster.metrics.AdaptiveLoadBalancingRoutingLogic))​([AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### AdaptiveLoadBalancingRoutingLogic
		
		
		
		```
		public AdaptiveLoadBalancingRoutingLogic​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system,
		                                         [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") $lessinit$greater$default$2()
		```
		- #### apply
		
		
		
		```
		public static [AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics") apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system,
		                                                      [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector)
		```
		- #### apply$default$2
		
		
		
		```
		public static [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") apply$default$2()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[ActorSystem](../../actor/ActorSystem.html "class in akka.actor"),​[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")>> unapply​([AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics") x$0)
		```
		- #### system
		
		
		
		```
		public [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system()
		```
		- #### metricsSelector
		
		
		
		```
		public [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector()
		```
		- #### metricsChanged
		
		
		
		```
		public final void metricsChanged​([ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics") event)
		```
		- #### select
		
		
		
		```
		public [Routee](../../routing/Routee.html "interface in akka.routing") select​(java.lang.Object message,
		                     scala.collection.immutable.IndexedSeq<[Routee](../../routing/Routee.html "interface in akka.routing")> routees)
		```
		
		Description copied from interface: `[RoutingLogic](../../routing/RoutingLogic.html#select(java.lang.Object,scala.collection.immutable.IndexedSeq))`
		Pick the destination for a given message. Normally it picks one of the
		 passed `routees`, but in the end it is up to the implementation to
		 return whatever [`Routee`](../../routing/Routee.html "interface in akka.routing") to use for sending a specific message.
		 
		 When implemented from Java it can be good to know that
		 `routees.apply(index)` can be used to get an element
		 from the `IndexedSeq`.
		
		
		
		Specified by:
		`[select](../../routing/RoutingLogic.html#select(java.lang.Object,scala.collection.immutable.IndexedSeq))` in interface `[RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing")`
		- #### copy
		
		
		
		```
		public [AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics") copy​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system,
		                                              [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector)
		```
		- #### copy$default$1
		
		
		
		```
		public [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/ClusterMetricsChanged.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html)*