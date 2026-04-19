---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingProducerControllerImpl$.html
title: ShardingProducerControllerImpl$
---

# ShardingProducerControllerImpl$

## Content

Package [akka.cluster.sharding.typed.delivery.internal](package-summary.html)
## Class ShardingProducerControllerImpl$

- java.lang.Object
- - akka.cluster.sharding.typed.delivery.internal.ShardingProducerControllerImpl$

- ---

```
public class ShardingProducerControllerImpl$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardingProducerControllerImpl$](ShardingProducerControllerImpl$.html "class in akka.cluster.sharding.typed.delivery.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingProducerControllerImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingProducerController.Command](../ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,akka.actor.typed.ActorRef,scala.Option,akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings,scala.reflect.ClassTag))​(java.lang.String producerId,  [ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[ConsumerController.SequencedMessage](../../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>> region,  scala.Option<[Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [ShardingProducerController.Settings](../ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings,  scala.reflect.ClassTag<A> evidence$1)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardingProducerControllerImpl$](ShardingProducerControllerImpl$.html "class in akka.cluster.sharding.typed.delivery.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardingProducerControllerImpl$
		
		
		
		```
		public ShardingProducerControllerImpl$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A> [Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingProducerController.Command](../ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>> apply​(java.lang.String producerId,
		                                                                 [ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[ConsumerController.SequencedMessage](../../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>> region,
		                                                                 scala.Option<[Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                                 [ShardingProducerController.Settings](../ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings,
		                                                                 scala.reflect.ClassTag<A> evidence$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.SequencedMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingProducerControllerImpl$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingProducerControllerImpl$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingProducerControllerImpl$.html)*