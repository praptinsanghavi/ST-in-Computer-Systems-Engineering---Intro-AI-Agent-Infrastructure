---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ConsumerControllerImpl$.html
title: ConsumerControllerImpl$
---

# ConsumerControllerImpl$

## Content

Package [akka.actor.typed.delivery.internal](package-summary.html)
## Class ConsumerControllerImpl$

- java.lang.Object
- - akka.actor.typed.delivery.internal.ConsumerControllerImpl$

- ---

```
public class ConsumerControllerImpl$
extends java.lang.Object
```

INTERNAL API
 
 \=\=\=\= Design notes \=\=\=\=
 

 The destination consumer will start the flow by sending an initial `Start` message
 to the `ConsumerController`.
 

 The `ProducerController` sends the first message to the `ConsumerController` without waiting for
 a `Request` from the `ConsumerController`. The main reason for this is that when used with
 Cluster Sharding the first message will typically create the `ConsumerController`. It's
 also a way to connect the ProducerController and ConsumerController in a dynamic way, for
 example when the ProducerController is replaced.
 

 The `ConsumerController` sends [`ProducerControllerImpl.Request`](ProducerControllerImpl.Request.html "class in akka.actor.typed.delivery.internal") to the `ProducerController`
 to specify it's ready to receive up to the requested sequence number.
 

 The `ConsumerController` sends the first `Request` when it receives the first `SequencedMessage`
 and has received the `Start` message from the consumer.
 

 It sends new `Request` when half of the requested window is remaining, but it also retries
 the `Request` if no messages are received because that could be caused by lost messages.
 

 Apart from the first message the producer will not send more messages than requested.
 

 Received messages are wrapped in `ConsumerController.Delivery` when sent to the consumer,
 which is supposed to reply with `ConsumerController.Confirmed` when it has processed the message.
 Next message is not delivered until the previous is confirmed.
 More messages from the producer that arrive while waiting for the confirmation are stashed by
 the `ConsumerController` and delivered when previous message was confirmed.
 

 In other words, the "request" protocol to the application producer and consumer is one\-by\-one, but
 between the `ProducerController` and `ConsumerController` it's window of messages in flight.
 

 The consumer and the `ConsumerController` are supposed to be local so that these messages are fast and not lost.
 

 If the `ConsumerController` receives a message with unexpected sequence number (not previous \+ 1\)
 it sends [`ProducerControllerImpl.Resend`](ProducerControllerImpl.Resend.html "class in akka.actor.typed.delivery.internal") to the `ProducerController` and will ignore all messages until
 the expected sequence number arrives.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConsumerControllerImpl$](ConsumerControllerImpl$.html "class in akka.actor.typed.delivery.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConsumerControllerImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](../ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(scala.Option,akka.actor.typed.delivery.ConsumerController.Settings))​(scala.Option<[ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](../ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>> serviceKey,  [ConsumerController.Settings](../ConsumerController.Settings.html "class in akka.actor.typed.delivery") settings)` |  |
	| `void` | `[enforceLocalConsumer](#enforceLocalConsumer(akka.actor.typed.ActorRef))​([ActorRef](../../ActorRef.html "interface in akka.actor.typed")<?> ref)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConsumerControllerImpl$](ConsumerControllerImpl$.html "class in akka.actor.typed.delivery.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ConsumerControllerImpl$
		
		
		
		```
		public ConsumerControllerImpl$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](../ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​(scala.Option<[ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](../ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>> serviceKey,
		                                                         [ConsumerController.Settings](../ConsumerController.Settings.html "class in akka.actor.typed.delivery") settings)
		```
		- #### enforceLocalConsumer
		
		
		
		```
		public void enforceLocalConsumer​([ActorRef](../../ActorRef.html "interface in akka.actor.typed")<?> ref)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ConsumerControllerImpl$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl.Request.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl.Resend.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ServiceKey.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ConsumerControllerImpl$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ConsumerControllerImpl$.html)*