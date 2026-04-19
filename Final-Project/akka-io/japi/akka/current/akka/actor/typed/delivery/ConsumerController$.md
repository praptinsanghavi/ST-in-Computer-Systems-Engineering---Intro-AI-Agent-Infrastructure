---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController$.html
title: ConsumerController$
---

# ConsumerController$

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class ConsumerController$

- java.lang.Object
- - akka.actor.typed.delivery.ConsumerController$

- ---

```
public class ConsumerController$
extends java.lang.Object
```

`ConsumerController` and [`ProducerController`](ProducerController.html "class in akka.actor.typed.delivery") or [`WorkPullingProducerController`](WorkPullingProducerController.html "class in akka.actor.typed.delivery") are used
 together. See the descriptions in those classes or the Akka reference documentation for
 how they are intended to be used.
 
 The destination consumer actor will start the flow by sending an initial [`ConsumerController.Start`](ConsumerController.Start.html "class in akka.actor.typed.delivery")
 message to the `ConsumerController`. The `ActorRef` in the `Start` message is typically constructed
 as a message adapter to map the [`ConsumerController.Delivery`](ConsumerController.Delivery.html "class in akka.actor.typed.delivery") to the protocol of the consumer actor.
 

 Received messages from the producer are wrapped in [`ConsumerController.Delivery`](ConsumerController.Delivery.html "class in akka.actor.typed.delivery") when sent to the consumer,
 which is supposed to reply with [`ConsumerController.Confirmed`](ConsumerController.Confirmed.html "interface in akka.actor.typed.delivery") when it has processed the message.
 Next message is not delivered until the previous is confirmed.
 More messages from the producer that arrive while waiting for the confirmation are stashed by
 the `ConsumerController` and delivered when previous message was confirmed.
 

 The consumer and the `ConsumerController` actors are supposed to be local so that these messages are fast
 and not lost. This is enforced by a runtime check.
 

 The `ConsumerController` is automatically stopped when the consumer that registered with the `Start`
 message is terminated.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConsumerController$](ConsumerController$.html "class in akka.actor.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConsumerController$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply())()` |  |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(akka.actor.typed.delivery.ConsumerController.Settings))​([ConsumerController.Settings](ConsumerController.Settings.html "class in akka.actor.typed.delivery") settings)` |  |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(akka.actor.typed.receptionist.ServiceKey))​([ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> serviceKey)` | To be used with [`WorkPullingProducerController`](WorkPullingProducerController.html "class in akka.actor.typed.delivery"). |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.delivery.ConsumerController.Settings))​([ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> serviceKey,  [ConsumerController.Settings](ConsumerController.Settings.html "class in akka.actor.typed.delivery") settings)` |  |
	| `[ConsumerController.Confirmed](ConsumerController.Confirmed.html "interface in akka.actor.typed.delivery")` | `[confirmed](#confirmed())()` | Java API: the singleton instance of the Confirmed message. |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[create](#create())()` | Java API |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[create](#create(akka.actor.typed.delivery.ConsumerController.Settings))​([ConsumerController.Settings](ConsumerController.Settings.html "class in akka.actor.typed.delivery") settings)` | Java API |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[create](#create(akka.actor.typed.receptionist.ServiceKey))​([ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> serviceKey)` | Java API: To be used with [`WorkPullingProducerController`](WorkPullingProducerController.html "class in akka.actor.typed.delivery"). |
	| `<A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[create](#create(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.delivery.ConsumerController.Settings))​([ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> serviceKey,  [ConsumerController.Settings](ConsumerController.Settings.html "class in akka.actor.typed.delivery") settings)` | Java API |
	| `<A> java.lang.Class<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A>>` | `[deliveryClass](#deliveryClass())()` | Java API: The generic `Class` type for `ConsumerController.Delivery` that can be used when creating a  `messageAdapter` for `Class>`. |
	| `<A> java.lang.Class<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[serviceKeyClass](#serviceKeyClass())()` | Java API: The generic `Class` type for `ConsumerController.Command` that can be used when creating a `ServiceKey`  for `Class>`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConsumerController$](ConsumerController$.html "class in akka.actor.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ConsumerController$
		
		
		
		```
		public ConsumerController$()
		```

	- ### Method Detail
	
	
	
		- #### deliveryClass
		
		
		
		```
		public <A> java.lang.Class<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A>> deliveryClass()
		```
		
		Java API: The generic `Class` type for `ConsumerController.Delivery` that can be used when creating a
		 `messageAdapter` for `Class>`.
		- #### serviceKeyClass
		
		
		
		```
		public <A> java.lang.Class<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> serviceKeyClass()
		```
		
		Java API: The generic `Class` type for `ConsumerController.Command` that can be used when creating a `ServiceKey`
		 for `Class>`.
		- #### confirmed
		
		
		
		```
		public [ConsumerController.Confirmed](ConsumerController.Confirmed.html "interface in akka.actor.typed.delivery") confirmed()
		```
		
		Java API: the singleton instance of the Confirmed message.
		 When the message has been processed the consumer is supposed to send `Confirmed` back
		 to the `ConsumerController` via the `confirmTo` in the `Delivery` message.
		- #### apply
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply()
		```
		- #### apply
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​([ConsumerController.Settings](ConsumerController.Settings.html "class in akka.actor.typed.delivery") settings)
		```
		- #### apply
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​([ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> serviceKey)
		```
		
		To be used with [`WorkPullingProducerController`](WorkPullingProducerController.html "class in akka.actor.typed.delivery"). It will register itself to the
		 [`Receptionist`](../receptionist/Receptionist.html "class in akka.actor.typed.receptionist") with the given `serviceKey`, and the
		 `WorkPullingProducerController` subscribes to the same key to find active workers.
		- #### apply
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​([ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> serviceKey,
		                                                         [ConsumerController.Settings](ConsumerController.Settings.html "class in akka.actor.typed.delivery") settings)
		```
		- #### create
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> create()
		```
		
		Java API
		- #### create
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> create​([ConsumerController.Settings](ConsumerController.Settings.html "class in akka.actor.typed.delivery") settings)
		```
		
		Java API
		- #### create
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> create​([ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> serviceKey)
		```
		
		Java API: To be used with [`WorkPullingProducerController`](WorkPullingProducerController.html "class in akka.actor.typed.delivery"). It will register itself to the
		 [`Receptionist`](../receptionist/Receptionist.html "class in akka.actor.typed.receptionist") with the given `serviceKey`, and the
		 `WorkPullingProducerController` subscribes to the same key to find active workers.
		- #### create
		
		
		
		```
		public <A> [Behavior](../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> create​([ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> serviceKey,
		                                                          [ConsumerController.Settings](ConsumerController.Settings.html "class in akka.actor.typed.delivery") settings)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Confirmed.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Delivery.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Start.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ServiceKey.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController$.html)*