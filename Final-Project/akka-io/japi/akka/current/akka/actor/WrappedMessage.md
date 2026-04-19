---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/WrappedMessage.html
title: WrappedMessage
---

# WrappedMessage

## Content

Package [akka.actor](package-summary.html)
## Interface WrappedMessage

- All Known Subinterfaces:
`[AllDeadLetters](AllDeadLetters.html "interface in akka.actor")`, `[RouterEnvelope](../routing/RouterEnvelope.html "interface in akka.routing")`

All Known Implementing Classes:
`[Broadcast](../routing/Broadcast.html "class in akka.routing")`, `[ConsistentHashingRouter.ConsistentHashableEnvelope](../routing/ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing")`, `[DeadLetter](DeadLetter.html "class in akka.actor")`, `[DistributedPubSubMediator.Internal$.MediatorRouterEnvelope](../cluster/pubsub/DistributedPubSubMediator.Internal$.MediatorRouterEnvelope.html "class in akka.cluster.pubsub")`, `[DistributedPubSubMediator.Publish](../cluster/pubsub/DistributedPubSubMediator.Publish.html "class in akka.cluster.pubsub")`, `[DistributedPubSubMediator.Send](../cluster/pubsub/DistributedPubSubMediator.Send.html "class in akka.cluster.pubsub")`, `[DistributedPubSubMediator.SendToAll](../cluster/pubsub/DistributedPubSubMediator.SendToAll.html "class in akka.cluster.pubsub")`, `[Dropped](Dropped.html "class in akka.actor")`, `[ShardingEnvelope](../cluster/sharding/typed/ShardingEnvelope.html "class in akka.cluster.sharding.typed")`, `[SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor")`, `[UnhandledMessage](UnhandledMessage.html "class in akka.actor")`

---

```
public interface WrappedMessage
```

Message envelopes may implement this trait for better logging, such as logging of
 message class name of the wrapped message instead of the envelope class name.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[message](#message())()` |  |

- - ### Method Detail
	
	
	
		- #### message
		
		
		
		```
		java.lang.Object message()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/AllDeadLetters.html
- https://doc.akka.io/japi/akka/current/akka/actor/DeadLetter.html
- https://doc.akka.io/japi/akka/current/akka/actor/Dropped.html
- https://doc.akka.io/japi/akka/current/akka/actor/SuppressedDeadLetter.html
- https://doc.akka.io/japi/akka/current/akka/actor/UnhandledMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.MediatorRouterEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.Publish.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.Send.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.SendToAll.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/routing/Broadcast.html
- https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/routing/RouterEnvelope.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/WrappedMessage.html](https://doc.akka.io/japi/akka/current/akka/actor/WrappedMessage.html)*