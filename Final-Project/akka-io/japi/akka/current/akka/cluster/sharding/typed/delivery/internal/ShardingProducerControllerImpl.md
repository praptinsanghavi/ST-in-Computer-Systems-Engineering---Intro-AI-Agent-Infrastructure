---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingProducerControllerImpl.html
title: ShardingProducerControllerImpl
---

# ShardingProducerControllerImpl

## Content

Package [akka.cluster.sharding.typed.delivery.internal](package-summary.html)
## Class ShardingProducerControllerImpl\<A\>

- java.lang.Object
- - akka.cluster.sharding.typed.delivery.internal.ShardingProducerControllerImpl\<A\>

- ---

```
public class ShardingProducerControllerImpl<A>
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[ShardingProducerControllerImpl.InternalCommand](ShardingProducerControllerImpl.InternalCommand.html "interface in akka.cluster.sharding.typed.delivery.internal")` |  |
	| `static interface` | `[ShardingProducerControllerImpl.UnsealedInternalCommand](ShardingProducerControllerImpl.UnsealedInternalCommand.html "interface in akka.cluster.sharding.typed.delivery.internal")` | For commands defined in public ShardingProducerController |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingProducerControllerImpl](#%3Cinit%3E(akka.actor.typed.scaladsl.ActorContext,java.lang.String,akka.actor.typed.ActorRef,akka.actor.typed.ActorRef,scala.Option,akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings,scala.reflect.ClassTag))​([ActorContext](../../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[ShardingProducerControllerImpl.InternalCommand](ShardingProducerControllerImpl.InternalCommand.html "interface in akka.cluster.sharding.typed.delivery.internal")> context,  java.lang.String producerId,  [ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[A](ShardingProducerControllerImpl.html "type parameter in ShardingProducerControllerImpl")>> msgAdapter,  [ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[ConsumerController.SequencedMessage](../../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<[A](ShardingProducerControllerImpl.html "type parameter in ShardingProducerControllerImpl")>>> region,  scala.Option<[ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[DurableProducerQueue.Command](../../../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<[A](ShardingProducerControllerImpl.html "type parameter in ShardingProducerControllerImpl")>>> durableQueue,  [ShardingProducerController.Settings](../ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings,  scala.reflect.ClassTag<[A](ShardingProducerControllerImpl.html "type parameter in ShardingProducerControllerImpl")> evidence$3)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A> [Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingProducerController.Command](../ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,akka.actor.typed.ActorRef,scala.Option,akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings,scala.reflect.ClassTag))​(java.lang.String producerId,  [ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[ConsumerController.SequencedMessage](../../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>> region,  scala.Option<[Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [ShardingProducerController.Settings](../ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings,  scala.reflect.ClassTag<A> evidence$1)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ShardingProducerControllerImpl
		
		
		
		```
		public ShardingProducerControllerImpl​([ActorContext](../../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[ShardingProducerControllerImpl.InternalCommand](ShardingProducerControllerImpl.InternalCommand.html "interface in akka.cluster.sharding.typed.delivery.internal")> context,
		                                      java.lang.String producerId,
		                                      [ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[A](ShardingProducerControllerImpl.html "type parameter in ShardingProducerControllerImpl")>> msgAdapter,
		                                      [ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[ConsumerController.SequencedMessage](../../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<[A](ShardingProducerControllerImpl.html "type parameter in ShardingProducerControllerImpl")>>> region,
		                                      scala.Option<[ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[DurableProducerQueue.Command](../../../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<[A](ShardingProducerControllerImpl.html "type parameter in ShardingProducerControllerImpl")>>> durableQueue,
		                                      [ShardingProducerController.Settings](../ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings,
		                                      scala.reflect.ClassTag<[A](ShardingProducerControllerImpl.html "type parameter in ShardingProducerControllerImpl")> evidence$3)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <A> [Behavior](../../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingProducerController.Command](../ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>> apply​(java.lang.String producerId,
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
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingProducerControllerImpl.InternalCommand.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingProducerControllerImpl.UnsealedInternalCommand.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingProducerControllerImpl.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingProducerControllerImpl.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/internal/ShardingProducerControllerImpl.html)*