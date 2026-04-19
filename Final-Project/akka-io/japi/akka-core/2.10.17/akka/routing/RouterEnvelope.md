---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:18:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RouterEnvelope.html
title: RouterEnvelope
---

# RouterEnvelope

## Content

Package [akka.routing](package-summary.html)
## Interface RouterEnvelope

- All Superinterfaces:
`[WrappedMessage](../actor/WrappedMessage.html "interface in akka.actor")`

All Known Implementing Classes:
`[Broadcast](Broadcast.html "class in akka.routing")`, `[ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing")`, `[DistributedPubSubMediator.Internal$.MediatorRouterEnvelope](../cluster/pubsub/DistributedPubSubMediator.Internal$.MediatorRouterEnvelope.html "class in akka.cluster.pubsub")`

---

```
public interface RouterEnvelope
extends [WrappedMessage](../actor/WrappedMessage.html "interface in akka.actor")
```

Only the contained message will be forwarded to the
 destination, i.e. the envelope will be stripped off.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[message](#message())()` |  |

- - ### Method Detail
	
	
	
		- #### message
		
		
		
		```
		java.lang.Object message()
		```
		
		
		Specified by:
		`[message](../actor/WrappedMessage.html#message())` in interface `[WrappedMessage](../actor/WrappedMessage.html "interface in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/WrappedMessage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.MediatorRouterEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Broadcast.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RouterEnvelope.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RouterEnvelope.html)*