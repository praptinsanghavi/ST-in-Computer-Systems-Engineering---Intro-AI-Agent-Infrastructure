---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:10:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html
title: ShardingConsumerController$
---

# ShardingConsumerController$

## Content

Package [akka.cluster.sharding.typed.delivery](package-summary.html)
## Class ShardingConsumerController$

- java.lang.Object
- - akka.cluster.sharding.typed.delivery.ShardingConsumerController$

- ---

```
public class ShardingConsumerController$
extends java.lang.Object
```

`ShardingConsumerController` is used together with [`ShardingProducerController`](ShardingProducerController.html "class in akka.cluster.sharding.typed.delivery"). See the description
 in that class or the Akka reference documentation for how they are intended to be used.
 
`ShardingConsumerController` is the entity that is initialized in `ClusterSharding`. It will manage
 the lifecycle and message delivery to the destination consumer actor.
 

 The destination consumer actor will start the flow by sending an initial `ConsumerController.Start`
 message via the `ActorRef` provided in the factory function of the consumer `Behavior`.
 The `ActorRef` in the `Start` message is typically constructed as a message adapter to map the
 `ConsumerController.Delivery` to the protocol of the consumer actor.
 

 Received messages from the producer are wrapped in `ConsumerController.Delivery` when sent to the consumer,
 which is supposed to reply with `ConsumerController.Confirmed` when it has processed the message.
 Next message from a specific producer is not delivered until the previous is confirmed. However, since
 there can be several producers, e.g. one per node, sending to the same destination entity there can be
 several `Delivery` in flight at the same time.
 More messages from a specific producer that arrive while waiting for the confirmation are stashed by
 the `ConsumerController` and delivered when previous message was confirmed.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardingConsumerController$](ShardingConsumerController$.html "class in akka.cluster.sharding.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingConsumerController$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B>[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>` | `[apply](#apply(scala.Function1))​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Start](../../../../actor/typed/delivery/ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<B>> consumerBehavior)` | The `Behavior` of the entity that is to be initialized in `ClusterSharding`. |
	| `<A,​B>[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>` | `[create](#create(java.util.function.Function))​(java.util.function.Function<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Start](../../../../actor/typed/delivery/ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<B>> consumerBehavior)` | Java API: The `Behavior` of the entity that is to be initialized in `ClusterSharding`. |
	| `<A,​B>[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>` | `[create](#create(java.util.function.Function,akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings))​(java.util.function.Function<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Start](../../../../actor/typed/delivery/ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<B>> consumerBehavior,  [ShardingConsumerController.Settings](ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings)` | Java API: The `Behavior` of the entity that is to be initialized in `ClusterSharding`. |
	| `<A> java.lang.Class<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>` | `[entityTypeKeyClass](#entityTypeKeyClass())()` | Java API: The generic `Class` type for `ConsumerController.SequencedMessage` that can be used when creating  an `EntityTypeKey` for the `ShardedConsumerController` with  `Class>>`. |
	| `<A,​B>[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>` | `[withSettings](#withSettings(akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings,scala.Function1))​([ShardingConsumerController.Settings](ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings,  scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Start](../../../../actor/typed/delivery/ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<B>> consumerBehavior)` | The `Behavior` of the entity that is to be initialized in `ClusterSharding`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardingConsumerController$](ShardingConsumerController$.html "class in akka.cluster.sharding.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardingConsumerController$
		
		
		
		```
		public ShardingConsumerController$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A,​B> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>> apply​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Start](../../../../actor/typed/delivery/ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<B>> consumerBehavior)
		```
		
		The `Behavior` of the entity that is to be initialized in `ClusterSharding`. It will manage
		 the lifecycle and message delivery to the destination consumer actor.
		- #### withSettings
		
		
		
		```
		public <A,​B> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>> withSettings​([ShardingConsumerController.Settings](ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings,
		                                                                                 scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Start](../../../../actor/typed/delivery/ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<B>> consumerBehavior)
		```
		
		The `Behavior` of the entity that is to be initialized in `ClusterSharding`. It will manage
		 the lifecycle and message delivery to the destination consumer actor.
		- #### create
		
		
		
		```
		public <A,​B> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>> create​(java.util.function.Function<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Start](../../../../actor/typed/delivery/ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<B>> consumerBehavior)
		```
		
		Java API: The `Behavior` of the entity that is to be initialized in `ClusterSharding`. It will manage
		 the lifecycle and message delivery to the destination consumer actor.
		- #### create
		
		
		
		```
		public <A,​B> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>> create​(java.util.function.Function<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Start](../../../../actor/typed/delivery/ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<B>> consumerBehavior,
		                                                                           [ShardingConsumerController.Settings](ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings)
		```
		
		Java API: The `Behavior` of the entity that is to be initialized in `ClusterSharding`. It will manage
		 the lifecycle and message delivery to the destination consumer actor.
		- #### entityTypeKeyClass
		
		
		
		```
		public <A> java.lang.Class<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>> entityTypeKeyClass()
		```
		
		Java API: The generic `Class` type for `ConsumerController.SequencedMessage` that can be used when creating
		 an `EntityTypeKey` for the `ShardedConsumerController` with
		 `Class>>`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.SequencedMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Start.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingConsumerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingConsumerController$.html)*