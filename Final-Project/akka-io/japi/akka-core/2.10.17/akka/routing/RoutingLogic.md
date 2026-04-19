---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:16:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RoutingLogic.html
title: RoutingLogic
---

# RoutingLogic

## Content

Package [akka.routing](package-summary.html)
## Interface RoutingLogic

- All Superinterfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`

All Known Implementing Classes:
`[AdaptiveLoadBalancingRoutingLogic](../cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html "class in akka.cluster.metrics")`, `[BroadcastRoutingLogic](BroadcastRoutingLogic.html "class in akka.routing")`, `[ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing")`, `[RandomRoutingLogic](RandomRoutingLogic.html "class in akka.routing")`, `[RoundRobinRoutingLogic](RoundRobinRoutingLogic.html "class in akka.routing")`, `[ScatterGatherFirstCompletedRoutingLogic](ScatterGatherFirstCompletedRoutingLogic.html "class in akka.routing")`, `[SmallestMailboxRoutingLogic](SmallestMailboxRoutingLogic.html "class in akka.routing")`, `[TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing")`

---

```
public interface RoutingLogic
extends [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")
```

The interface of the routing logic that is used in a [`Router`](Router.html "class in akka.routing") to select
 destination routed messages.
 
 The implementation must be thread safe.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Routee](Routee.html "interface in akka.routing")` | `[select](#select(java.lang.Object,scala.collection.immutable.IndexedSeq))​(java.lang.Object message,  scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` | Pick the destination for a given message. |

- - ### Method Detail
	
	
	
		- #### select
		
		
		
		```
		[Routee](Routee.html "interface in akka.routing") select​(java.lang.Object message,
		              scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		
		Pick the destination for a given message. Normally it picks one of the
		 passed `routees`, but in the end it is up to the implementation to
		 return whatever [`Routee`](Routee.html "interface in akka.routing") to use for sending a specific message.
		 
		 When implemented from Java it can be good to know that
		 `routees.apply(index)` can be used to get an element
		 from the `IndexedSeq`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/BroadcastRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ConsistentHashingRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RandomRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RoundRobinRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Router.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ScatterGatherFirstCompletedRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/SmallestMailboxRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/TailChoppingRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RoutingLogic.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RoutingLogic.html)*