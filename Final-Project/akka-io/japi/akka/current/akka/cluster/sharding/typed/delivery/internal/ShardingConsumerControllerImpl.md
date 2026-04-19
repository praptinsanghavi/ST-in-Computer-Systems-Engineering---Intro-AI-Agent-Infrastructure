---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingConsumerControllerImpl.html
title: ShardingConsumerControllerImpl
---

# ShardingConsumerControllerImpl

## Content

Package [akka.cluster.sharding.typed.delivery.internal](package-summary.html)
## Class ShardingConsumerControllerImpl\<A\>

- java.lang.Object
- - akka.cluster.sharding.typed.delivery.internal.ShardingConsumerControllerImpl\<A\>

- ---

```
public class ShardingConsumerControllerImpl<A>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingConsumerControllerImpl](#%3Cinit%3E(akka.actor.typed.scaladsl.ActorContext,akka.actor.typed.ActorRef,akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings))​([ActorContext](../../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[ConsumerController.Command](../../../../../actor/typed/delivery/ConsumerController.Command.html "interface in akka.actor.typed.delivery")<[A](ShardingConsumerControllerImpl.html "type parameter in ShardingConsumerControllerImpl")>> context,  [ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](../../../../../actor/typed/delivery/ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<[A](ShardingConsumerControllerImpl.html "type parameter in ShardingConsumerControllerImpl")>> deliverTo,  [ShardingConsumerController.Settings](../ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](../../../../../actor/typed/delivery/ConsumerController.Command.html "interface in akka.actor.typed.delivery")<[A](ShardingConsumerControllerImpl.html "type parameter in ShardingConsumerControllerImpl")>>` | `[active](#active(scala.collection.immutable.Map,scala.collection.immutable.Map))​(scala.collection.immutable.Map<[ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ProducerControllerImpl.InternalCommand](../../../../../actor/typed/delivery/internal/ProducerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")>,​java.lang.String> producerControllers,  scala.collection.immutable.Map<java.lang.String,​[ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Command](../../../../../actor/typed/delivery/ConsumerController.Command.html "interface in akka.actor.typed.delivery")<[A](ShardingConsumerControllerImpl.html "type parameter in ShardingConsumerControllerImpl")>>> consumerControllers)` |  |
	| `static <A,​B>[Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.SequencedMessage](../../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>` | `[apply](#apply(scala.Function1,akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings))​(scala.Function1<[ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Start](../../../../../actor/typed/delivery/ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>>,​[Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<B>> consumerBehavior,  [ShardingConsumerController.Settings](../ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ShardingConsumerControllerImpl
		
		
		
		```
		public ShardingConsumerControllerImpl​([ActorContext](../../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[ConsumerController.Command](../../../../../actor/typed/delivery/ConsumerController.Command.html "interface in akka.actor.typed.delivery")<[A](ShardingConsumerControllerImpl.html "type parameter in ShardingConsumerControllerImpl")>> context,
		                                      [ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](../../../../../actor/typed/delivery/ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<[A](ShardingConsumerControllerImpl.html "type parameter in ShardingConsumerControllerImpl")>> deliverTo,
		                                      [ShardingConsumerController.Settings](../ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <A,​B> [Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.SequencedMessage](../../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>> apply​(scala.Function1<[ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Start](../../../../../actor/typed/delivery/ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>>,​[Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<B>> consumerBehavior,
		                                                                                 [ShardingConsumerController.Settings](../ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings)
		```
		- #### active
		
		
		
		```
		public [Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](../../../../../actor/typed/delivery/ConsumerController.Command.html "interface in akka.actor.typed.delivery")<[A](ShardingConsumerControllerImpl.html "type parameter in ShardingConsumerControllerImpl")>> active​(scala.collection.immutable.Map<[ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ProducerControllerImpl.InternalCommand](../../../../../actor/typed/delivery/internal/ProducerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")>,​java.lang.String> producerControllers,
		                                                      scala.collection.immutable.Map<java.lang.String,​[ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Command](../../../../../actor/typed/delivery/ConsumerController.Command.html "interface in akka.actor.typed.delivery")<[A](ShardingConsumerControllerImpl.html "type parameter in ShardingConsumerControllerImpl")>>> consumerControllers)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Delivery.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.SequencedMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Start.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl.InternalCommand.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingConsumerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingConsumerControllerImpl.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingConsumerControllerImpl.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingConsumerControllerImpl.html)*