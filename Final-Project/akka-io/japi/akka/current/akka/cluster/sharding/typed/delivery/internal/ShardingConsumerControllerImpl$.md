---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingConsumerControllerImpl$.html
title: ShardingConsumerControllerImpl$
---

# ShardingConsumerControllerImpl$

## Content

Package [akka.cluster.sharding.typed.delivery.internal](package-summary.html)
## Class ShardingConsumerControllerImpl$

- java.lang.Object
- - akka.cluster.sharding.typed.delivery.internal.ShardingConsumerControllerImpl$

- ---

```
public class ShardingConsumerControllerImpl$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardingConsumerControllerImpl$](ShardingConsumerControllerImpl$.html "class in akka.cluster.sharding.typed.delivery.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingConsumerControllerImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B>[Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.SequencedMessage](../../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>` | `[apply](#apply(scala.Function1,akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings))​(scala.Function1<[ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Start](../../../../../actor/typed/delivery/ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>>,​[Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<B>> consumerBehavior,  [ShardingConsumerController.Settings](../ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardingConsumerControllerImpl$](ShardingConsumerControllerImpl$.html "class in akka.cluster.sharding.typed.delivery.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardingConsumerControllerImpl$
		
		
		
		```
		public ShardingConsumerControllerImpl$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A,​B> [Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.SequencedMessage](../../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>> apply​(scala.Function1<[ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Start](../../../../../actor/typed/delivery/ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>>,​[Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<B>> consumerBehavior,
		                                                                          [ShardingConsumerController.Settings](../ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.SequencedMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Start.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingConsumerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingConsumerControllerImpl$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingConsumerControllerImpl$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingConsumerControllerImpl$.html)*