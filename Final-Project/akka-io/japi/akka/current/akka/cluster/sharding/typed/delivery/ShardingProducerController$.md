---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:10:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController$.html
title: ShardingProducerController$
---

# ShardingProducerController$

## Content

Package [akka.cluster.sharding.typed.delivery](package-summary.html)
## Class ShardingProducerController$

- java.lang.Object
- - akka.cluster.sharding.typed.delivery.ShardingProducerController$

- ---

```
public class ShardingProducerController$
extends java.lang.Object
```

Reliable delivery between a producer actor sending messages to sharded consumer
 actors receiving the messages.
 
 The `ShardingProducerController` should be used together with [`ShardingConsumerController`](ShardingConsumerController.html "class in akka.cluster.sharding.typed.delivery").
 

 A producer can send messages via a `ShardingProducerController` to any `ShardingConsumerController`
 identified by an `entityId`. A single `ShardingProducerController` per `ActorSystem` (node) can be
 shared for sending to all entities of a certain entity type. No explicit registration is needed
 between the `ShardingConsumerController` and `ShardingProducerController`.
 

 The producer actor will start the flow by sending a [`ShardingProducerController.Start`](ShardingProducerController.Start.html "class in akka.cluster.sharding.typed.delivery")
 message to the `ShardingProducerController`. The `ActorRef` in the `Start` message is
 typically constructed as a message adapter to map the [`ShardingProducerController.RequestNext`](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")
 to the protocol of the producer actor.
 

 The `ShardingProducerController` sends `RequestNext` to the producer, which is then allowed
 to send one message to the `ShardingProducerController` via the `sendNextTo` in the `RequestNext`.
 Thereafter the producer will receive a new `RequestNext` when it's allowed to send one more message.
 

 In the `RequestNext` message there is information about which entities that have demand. It is allowed
 to send to a new `entityId` that is not included in the `RequestNext.entitiesWithDemand`. If sending to
 an entity that doesn't have demand the message will be buffered. This support for buffering means that
 it is even allowed to send several messages in response to one `RequestNext` but it's recommended to
 only send one message and wait for next `RequestNext` before sending more messages.
 

 The producer and `ShardingProducerController` actors are supposed to be local so that these messages are
 fast and not lost. This is enforced by a runtime check.
 

 There will be one `ShardingConsumerController` for each entity. Many unconfirmed messages can be in
 flight between the `ShardingProducerController` and each `ShardingConsumerController`. The flow control
 is driven by the consumer side, which means that the `ShardingProducerController` will not send faster
 than the demand requested by the consumers.
 

 Lost messages are detected, resent and deduplicated if needed. This is also driven by the consumer side,
 which means that the `ShardingProducerController` will not push resends unless requested by the
 `ShardingConsumerController`.
 

 Until sent messages have been confirmed the `ShardingProducerController` keeps them in memory to be able to
 resend them. If the JVM of the `ShardingProducerController` crashes those unconfirmed messages are lost.
 To make sure the messages can be delivered also in that scenario the `ShardingProducerController` can be
 used with a `DurableProducerQueue`. Then the unconfirmed messages are stored in a durable way so
 that they can be redelivered when the producer is started again. An implementation of the
 `DurableProducerQueue` is provided by `EventSourcedProducerQueue` in `akka-persistence-typed`.
 

 Instead of using `tell` with the `sendNextTo` in the `RequestNext` the producer can use `context.ask`
 with the `askNextTo` in the `RequestNext`. The difference is that a reply is sent back when the
 message has been handled. If a `DurableProducerQueue` is used then the reply is sent when the message
 has been stored successfully, but it might not have been processed by the consumer yet. Otherwise the
 reply is sent after the consumer has processed and confirmed the message.
 

 It's also possible to use the `ShardingProducerController` and `ShardingConsumerController` without resending
 lost messages, but the flow control is still used. This can be more efficient since messages
 don't have to be kept in memory in the `ProducerController` until they have been
 confirmed, but the drawback is that lost messages will not be delivered. See configuration
 `only-flow-control` of the `ShardingConsumerController`.
 

 The `producerId` is used in logging and included as MDC entry with key `"producerId"`. It's propagated
 to the `ConsumerController` and is useful for correlating log messages. It can be any `String` but it's
 recommended to use a unique identifier of representing the producer.
 

 If the `DurableProducerQueue` is defined it is created as a child actor of the `ShardingProducerController` actor.
 `ProducerController` actors are created for each destination entity. Those child actors use the same dispatcher
 as the parent `ShardingProducerController`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardingProducerController$](ShardingProducerController$.html "class in akka.cluster.sharding.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingProducerController$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingProducerController.Command](ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,akka.actor.typed.ActorRef,scala.Option,akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings,scala.reflect.ClassTag))​(java.lang.String producerId,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>> region,  scala.Option<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [ShardingProducerController.Settings](ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings,  scala.reflect.ClassTag<A> evidence$2)` |  |
	| `<A> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingProducerController.Command](ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,akka.actor.typed.ActorRef,scala.Option,scala.reflect.ClassTag))​(java.lang.String producerId,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>> region,  scala.Option<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  scala.reflect.ClassTag<A> evidence$1)` |  |
	| `<A> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingProducerController.Command](ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>>` | `[create](#create(java.lang.Class,java.lang.String,akka.actor.typed.ActorRef,java.util.Optional))​(java.lang.Class<A> messageClass,  java.lang.String producerId,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>> region,  java.util.Optional<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior)` | Java API |
	| `<A> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingProducerController.Command](ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>>` | `[create](#create(java.lang.Class,java.lang.String,akka.actor.typed.ActorRef,java.util.Optional,akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings))​(java.lang.Class<A> messageClass,  java.lang.String producerId,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>> region,  java.util.Optional<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [ShardingProducerController.Settings](ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings)` | Java API |
	| `<A> java.lang.Class<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<A>>` | `[requestNextClass](#requestNextClass())()` | Java API: The generic `Class` type for `ShardingProducerController.RequestNext` that can be used when creating a  `messageAdapter` for `Class>`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardingProducerController$](ShardingProducerController$.html "class in akka.cluster.sharding.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardingProducerController$
		
		
		
		```
		public ShardingProducerController$()
		```

	- ### Method Detail
	
	
	
		- #### requestNextClass
		
		
		
		```
		public <A> java.lang.Class<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<A>> requestNextClass()
		```
		
		Java API: The generic `Class` type for `ShardingProducerController.RequestNext` that can be used when creating a
		 `messageAdapter` for `Class>`.
		- #### apply
		
		
		
		```
		public <A> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingProducerController.Command](ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>> apply​(java.lang.String producerId,
		                                                                 [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>> region,
		                                                                 scala.Option<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                                 scala.reflect.ClassTag<A> evidence$1)
		```
		- #### apply
		
		
		
		```
		public <A> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingProducerController.Command](ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>> apply​(java.lang.String producerId,
		                                                                 [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>> region,
		                                                                 scala.Option<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                                 [ShardingProducerController.Settings](ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings,
		                                                                 scala.reflect.ClassTag<A> evidence$2)
		```
		- #### create
		
		
		
		```
		public <A> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingProducerController.Command](ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>> create​(java.lang.Class<A> messageClass,
		                                                                  java.lang.String producerId,
		                                                                  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>> region,
		                                                                  java.util.Optional<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior)
		```
		
		Java API
		- #### create
		
		
		
		```
		public <A> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingProducerController.Command](ShardingProducerController.Command.html "interface in akka.cluster.sharding.typed.delivery")<A>> create​(java.lang.Class<A> messageClass,
		                                                                  java.lang.String producerId,
		                                                                  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[ConsumerController.SequencedMessage](../../../../actor/typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>>> region,
		                                                                  java.util.Optional<[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../../../../actor/typed/delivery/DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                                  [ShardingProducerController.Settings](ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") settings)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.SequencedMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingConsumerController.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.RequestNext.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController.Start.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/delivery/ShardingProducerController$.html)*