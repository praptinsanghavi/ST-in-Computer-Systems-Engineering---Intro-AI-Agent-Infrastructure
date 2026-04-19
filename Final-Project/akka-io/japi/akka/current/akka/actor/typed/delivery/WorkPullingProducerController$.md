---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController$.html
title: WorkPullingProducerController$
---

# WorkPullingProducerController$

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class WorkPullingProducerController$

- java.lang.Object
- - akka.actor.typed.delivery.WorkPullingProducerController$

- ---

```
public class WorkPullingProducerController$
extends java.lang.Object
```

Work pulling is a pattern where several worker actors pull tasks in their own pace from
 a shared work manager instead of that the manager pushes work to the workers blindly
 without knowing their individual capacity and current availability.
 
 The `WorkPullingProducerController` can be used together with [`ConsumerController`](ConsumerController.html "class in akka.actor.typed.delivery") to
 implement the work pulling pattern.
 

 One important property is that the order of the messages should not matter, because each
 message is routed randomly to one of the workers with demand. In other words, two subsequent
 messages may be routed to two different workers and processed independent of each other.
 

 A worker actor (consumer) and its `ConsumerController` is dynamically registered to the
 `WorkPullingProducerController` via a `ServiceKey`. It will register itself to the
 \* [`Receptionist`](../receptionist/Receptionist.html "class in akka.actor.typed.receptionist"), and the `WorkPullingProducerController`
 subscribes to the same key to find active workers. In this way workers can be dynamically
 added or removed from any node in the cluster.
 

 The work manager (producer) actor will start the flow by sending a [`WorkPullingProducerController.Start`](WorkPullingProducerController.Start.html "class in akka.actor.typed.delivery")
 message to the `WorkPullingProducerController`. The `ActorRef` in the `Start` message is
 typically constructed as a message adapter to map the [`WorkPullingProducerController.RequestNext`](WorkPullingProducerController.RequestNext.html "class in akka.actor.typed.delivery")
 to the protocol of the producer actor.
 

 The `WorkPullingProducerController` sends `RequestNext` to the producer, which is then allowed
 to send one message to the `WorkPullingProducerController` via the `sendNextTo` in the `RequestNext`.
 Thereafter the producer will receive a new `RequestNext` when it's allowed to send one more message.
 It will send a new `RequestNext` when there are demand from any worker.
 It's possible that all workers with demand are deregistered after the `RequestNext` is sent and before
 the actual messages is sent to the `WorkPullingProducerController`. In that case the message is
 buffered and will be delivered when a new worker is registered or when there is new demand.
 

 The producer and `WorkPullingProducerController` actors are supposed to be local so that these messages are
 fast and not lost. This is enforced by a runtime check.
 

 Many unconfirmed messages can be in flight between the `WorkPullingProducerController` and each
 `ConsumerController`. The flow control is driven by the consumer side, which means that the
 `WorkPullingProducerController` will not send faster than the demand requested by the workers.
 

 Lost messages are detected, resent and deduplicated if needed. This is also driven by the consumer side,
 which means that the `WorkPullingProducerController` will not push resends unless requested by the
 `ConsumerController`.
 

 If a worker crashes or is stopped gracefully the unconfirmed messages for that worker will be
 routed to other workers by the `WorkPullingProducerController`. This may result in that some messages
 may be processed more than once, by different workers.
 

 Until sent messages have been confirmed the `WorkPullingProducerController` keeps them in memory to be able to
 resend them. If the JVM of the `WorkPullingProducerController` crashes those unconfirmed messages are lost.
 To make sure the messages can be delivered also in that scenario the `WorkPullingProducerController` can be
 used with a [`DurableProducerQueue`](DurableProducerQueue.html "class in akka.actor.typed.delivery"). Then the unconfirmed messages are stored in a durable way so
 that they can be redelivered when the producer is started again. An implementation of the
 `DurableProducerQueue` is provided by `EventSourcedProducerQueue` in `akka-persistence-typed`.
 

 Instead of using `tell` with the `sendNextTo` in the `RequestNext` the producer can use `context.ask`
 with the `askNextTo` in the `RequestNext`. The difference is that a reply is sent back when the
 message has been handled. If a `DurableProducerQueue` is used then the reply is sent when the message
 has been stored successfully, but it might not have been processed by the consumer yet. Otherwise the
 reply is sent after the consumer has processed and confirmed the message.
 

 It's also possible to use the `WorkPullingProducerController` and `ConsumerController` without resending
 lost messages, but the flow control is still used. This can for example be useful when both consumer and
 producer are know to be located in the same local `ActorSystem`. This can be more efficient since messages
 don't have to be kept in memory in the `ProducerController` until they have been
 confirmed, but the drawback is that lost messages will not be delivered. See configuration
 `only-flow-control` of the `ConsumerController`.
 

 The `producerId` is used in logging and included as MDC entry with key `"producerId"`. It's propagated
 to the `ConsumerController` and is useful for correlating log messages. It can be any `String` but it's
 recommended to use a unique identifier of representing the producer.
 

 If the `DurableProducerQueue` is defined it is created as a child actor of the `WorkPullingProducerController` actor.
 `ProducerController` actors are created for each registered worker. Those child actors use the same dispatcher
 as the parent `WorkPullingProducerController`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WorkPullingProducerController$](WorkPullingProducerController$.html "class in akka.actor.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WorkPullingProducerController$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[WorkPullingProducerController.Command](WorkPullingProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(java.lang.Class,java.lang.String,akka.actor.typed.receptionist.ServiceKey,java.util.Optional,akka.actor.typed.delivery.WorkPullingProducerController.Settings))​(java.lang.Class<A> messageClass,  java.lang.String producerId,  [ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> workerServiceKey,  java.util.Optional<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [WorkPullingProducerController.Settings](WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") settings)` | Java API |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[WorkPullingProducerController.Command](WorkPullingProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,akka.actor.typed.receptionist.ServiceKey,scala.Option,akka.actor.typed.delivery.WorkPullingProducerController.Settings,scala.reflect.ClassTag))​(java.lang.String producerId,  [ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> workerServiceKey,  scala.Option<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [WorkPullingProducerController.Settings](WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") settings,  scala.reflect.ClassTag<A> evidence$2)` |  |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[WorkPullingProducerController.Command](WorkPullingProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,akka.actor.typed.receptionist.ServiceKey,scala.Option,scala.reflect.ClassTag))​(java.lang.String producerId,  [ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> workerServiceKey,  scala.Option<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  scala.reflect.ClassTag<A> evidence$1)` |  |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[WorkPullingProducerController.Command](WorkPullingProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[create](#create(java.lang.Class,java.lang.String,akka.actor.typed.receptionist.ServiceKey,java.util.Optional))​(java.lang.Class<A> messageClass,  java.lang.String producerId,  [ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> workerServiceKey,  java.util.Optional<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior)` | Java API |
	| `<A> java.lang.Class<[WorkPullingProducerController.RequestNext](WorkPullingProducerController.RequestNext.html "class in akka.actor.typed.delivery")<A>>` | `[requestNextClass](#requestNextClass())()` | Java API: The generic `Class` type for `WorkPullingProducerController.RequestNext` that can be used when  creating a `messageAdapter` for `Class>`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WorkPullingProducerController$](WorkPullingProducerController$.html "class in akka.actor.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WorkPullingProducerController$
		
		
		
		```
		public WorkPullingProducerController$()
		```

	- ### Method Detail
	
	
	
		- #### requestNextClass
		
		
		
		```
		public <A> java.lang.Class<[WorkPullingProducerController.RequestNext](WorkPullingProducerController.RequestNext.html "class in akka.actor.typed.delivery")<A>> requestNextClass()
		```
		
		Java API: The generic `Class` type for `WorkPullingProducerController.RequestNext` that can be used when
		 creating a `messageAdapter` for `Class>`.
		- #### apply
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[WorkPullingProducerController.Command](WorkPullingProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​(java.lang.String producerId,
		                                                                    [ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> workerServiceKey,
		                                                                    scala.Option<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                                    scala.reflect.ClassTag<A> evidence$1)
		```
		- #### apply
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[WorkPullingProducerController.Command](WorkPullingProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​(java.lang.String producerId,
		                                                                    [ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> workerServiceKey,
		                                                                    scala.Option<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                                    [WorkPullingProducerController.Settings](WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") settings,
		                                                                    scala.reflect.ClassTag<A> evidence$2)
		```
		- #### create
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[WorkPullingProducerController.Command](WorkPullingProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> create​(java.lang.Class<A> messageClass,
		                                                                     java.lang.String producerId,
		                                                                     [ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> workerServiceKey,
		                                                                     java.util.Optional<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[WorkPullingProducerController.Command](WorkPullingProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​(java.lang.Class<A> messageClass,
		                                                                    java.lang.String producerId,
		                                                                    [ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> workerServiceKey,
		                                                                    java.util.Optional<[Behavior](../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                                    [WorkPullingProducerController.Settings](WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") settings)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.RequestNext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.Start.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ServiceKey.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController$.html)*