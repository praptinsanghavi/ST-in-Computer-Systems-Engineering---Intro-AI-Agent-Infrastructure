---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController$.html
title: ProducerController$
---

# ProducerController$

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class ProducerController$

- java.lang.Object
- - akka.actor.typed.delivery.ProducerController$

- ---

```
public class ProducerController$
extends java.lang.Object
```

Point\-to\-point reliable delivery between a single producer actor sending messages and a single consumer
 actor receiving the messages. Used together with [`ConsumerController`](ConsumerController.html "class in akka.actor.typed.delivery").
 
 The producer actor will start the flow by sending a [`ProducerController.Start`](ProducerController.Start.html "class in akka.actor.typed.delivery") message to
 the `ProducerController`. The `ActorRef` in the `Start` message is typically constructed
 as a message adapter to map the [`ProducerController.RequestNext`](ProducerController.RequestNext.html "class in akka.actor.typed.delivery") to the protocol of the
 producer actor.
 

 For the `ProducerController` to know where to send the messages it must be connected with the
 `ConsumerController`. You do this is with [`ProducerController.RegisterConsumer`](ProducerController.RegisterConsumer.html "class in akka.actor.typed.delivery") or
 [`ConsumerController.RegisterToProducerController`](ConsumerController.RegisterToProducerController.html "class in akka.actor.typed.delivery") messages.
 

 The `ProducerController` sends `RequestNext` to the producer, which is then allowed to send one
 message to the `ProducerController` via the `sendNextTo` in the `RequestNext`. Thereafter the
 producer will receive a new `RequestNext` when it's allowed to send one more message.
 

 The producer and `ProducerController` actors are supposed to be local so that these messages are
 fast and not lost. This is enforced by a runtime check.
 

 Many unconfirmed messages can be in flight between the `ProducerController` and `ConsumerController`.
 The flow control is driven by the consumer side, which means that the `ProducerController` will
 not send faster than the demand requested by the `ConsumerController`.
 

 Lost messages are detected, resent and deduplicated if needed. This is also driven by the consumer side,
 which means that the `ProducerController` will not push resends unless requested by the
 `ConsumerController`.
 

 Until sent messages have been confirmed the `ProducerController` keeps them in memory to be able to
 resend them. If the JVM of the `ProducerController` crashes those unconfirmed messages are lost.
 To make sure the messages can be delivered also in that scenario the `ProducerController` can be
 used with a [`DurableProducerQueue`](DurableProducerQueue.html "class in akka.actor.typed.delivery"). Then the unconfirmed messages are stored in a durable way so
 that they can be redelivered when the producer is started again. An implementation of the
 `DurableProducerQueue` is provided by `EventSourcedProducerQueue` in `akka-persistence-typed`.
 

 Instead of using `tell` with the `sendNextTo` in the `RequestNext` the producer can use `context.ask`
 with the `askNextTo` in the `RequestNext`. The difference is that a reply is sent back when the
 message has been handled. If a `DurableProducerQueue` is used then the reply is sent when the message
 has been stored successfully, but it might not have been processed by the consumer yet. Otherwise the
 reply is sent after the consumer has processed and confirmed the message.
 

 If the consumer crashes a new `ConsumerController` can be connected to the original `ProducerConsumer`
 without restarting it. The `ProducerConsumer` will then redeliver all unconfirmed messages.
 

 It's also possible to use the `ProducerController` and `ConsumerController` without resending
 lost messages, but the flow control is still used. This can for example be useful when both consumer and
 producer are know to be located in the same local `ActorSystem`. This can be more efficient since messages
 don't have to be kept in memory in the `ProducerController` until they have been
 confirmed, but the drawback is that lost messages will not be delivered. See configuration
 `only-flow-control` of the `ConsumerController`.
 

 The `producerId` is used in logging and included as MDC entry with key `"producerId"`. It's propagated
 to the `ConsumerController` and is useful for correlating log messages. It can be any `String` but it's
 recommended to use a unique identifier of representing the producer.
 

 If the `DurableProducerQueue` is defined it is created as a child actor of the `ProducerController` actor.
 It will use the same dispatcher as the parent `ProducerController`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ProducerController$](ProducerController$.html "class in akka.actor.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ProducerController$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,scala.Option,akka.actor.typed.delivery.ProducerController.Settings,scala.reflect.ClassTag))​(java.lang.String producerId,  scala.Option<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery") settings,  scala.reflect.ClassTag<A> evidence$2)` |  |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,scala.Option,scala.reflect.ClassTag))​(java.lang.String producerId,  scala.Option<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  scala.reflect.ClassTag<A> evidence$1)` |  |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[create](#create(java.lang.Class,java.lang.String,java.util.Optional))​(java.lang.Class<A> messageClass,  java.lang.String producerId,  java.util.Optional<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior)` | Java API |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[create](#create(java.lang.Class,java.lang.String,java.util.Optional,akka.actor.typed.delivery.ProducerController.Settings))​(java.lang.Class<A> messageClass,  java.lang.String producerId,  java.util.Optional<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery") settings)` | Java API |
	| `<A> java.lang.Class<[ProducerController.RequestNext](ProducerController.RequestNext.html "class in akka.actor.typed.delivery")<A>>` | `[requestNextClass](#requestNextClass())()` | Java API: The generic `Class` type for `ProducerController.RequestNext` that can be used when creating a  `messageAdapter` for `Class>`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ProducerController$](ProducerController$.html "class in akka.actor.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ProducerController$
		
		
		
		```
		public ProducerController$()
		```

	- ### Method Detail
	
	
	
		- #### requestNextClass
		
		
		
		```
		public <A> java.lang.Class<[ProducerController.RequestNext](ProducerController.RequestNext.html "class in akka.actor.typed.delivery")<A>> requestNextClass()
		```
		
		Java API: The generic `Class` type for `ProducerController.RequestNext` that can be used when creating a
		 `messageAdapter` for `Class>`.
		- #### apply
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​(java.lang.String producerId,
		                                                         scala.Option<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                         scala.reflect.ClassTag<A> evidence$1)
		```
		- #### apply
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​(java.lang.String producerId,
		                                                         scala.Option<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                         [ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery") settings,
		                                                         scala.reflect.ClassTag<A> evidence$2)
		```
		- #### create
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> create​(java.lang.Class<A> messageClass,
		                                                          java.lang.String producerId,
		                                                          java.util.Optional<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior)
		```
		
		Java API
		- #### create
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> create​(java.lang.Class<A> messageClass,
		                                                          java.lang.String producerId,
		                                                          java.util.Optional<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                          [ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery") settings)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.RegisterToProducerController.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController.RegisterConsumer.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController.RequestNext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController.Start.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController$.html)*