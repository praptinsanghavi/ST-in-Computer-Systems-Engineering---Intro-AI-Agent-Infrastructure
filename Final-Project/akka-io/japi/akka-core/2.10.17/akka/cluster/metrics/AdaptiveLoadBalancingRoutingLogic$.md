---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:36:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic$.html
title: AdaptiveLoadBalancingRoutingLogic$
---

# AdaptiveLoadBalancingRoutingLogic$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class AdaptiveLoadBalancingRoutingLogic$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[ActorSystem](../../actor/ActorSystem.html "class in akka.actor"),​[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​[AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics")\>
	- - akka.cluster.metrics.AdaptiveLoadBalancingRoutingLogic$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[ActorSystem](../../actor/ActorSystem.html "class in akka.actor"),​[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​[AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics")>`

---

```
public class AdaptiveLoadBalancingRoutingLogic$
extends scala.runtime.AbstractFunction2<[ActorSystem](../../actor/ActorSystem.html "class in akka.actor"),​[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​[AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.AdaptiveLoadBalancingRoutingLogic$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AdaptiveLoadBalancingRoutingLogic$](AdaptiveLoadBalancingRoutingLogic$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AdaptiveLoadBalancingRoutingLogic$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `[AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics")` | `[apply](#apply(akka.actor.ActorSystem,akka.cluster.metrics.MetricsSelector))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system,  [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector)` |  |
	| `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[apply$default$2](#apply$default$2())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[ActorSystem](../../actor/ActorSystem.html "class in akka.actor"),​[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")>>` | `[unapply](#unapply(akka.cluster.metrics.AdaptiveLoadBalancingRoutingLogic))​([AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AdaptiveLoadBalancingRoutingLogic$](AdaptiveLoadBalancingRoutingLogic$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AdaptiveLoadBalancingRoutingLogic$
		
		
		
		```
		public AdaptiveLoadBalancingRoutingLogic$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") $lessinit$greater$default$2()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[ActorSystem](../../actor/ActorSystem.html "class in akka.actor"),​[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​[AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[ActorSystem](../../actor/ActorSystem.html "class in akka.actor"),​[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​[AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics")>`
		- #### apply
		
		
		
		```
		public [AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics") apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system,
		                                               [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[ActorSystem](../../actor/ActorSystem.html "class in akka.actor"),​[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​[AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics")>`
		- #### apply$default$2
		
		
		
		```
		public [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") apply$default$2()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[ActorSystem](../../actor/ActorSystem.html "class in akka.actor"),​[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")>> unapply​([AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic$.html)*