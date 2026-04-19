---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$.html
title: ProducerControllerImpl$
---

# ProducerControllerImpl$

## Content

Package [akka.actor.typed.delivery.internal](package-summary.html)
## Class ProducerControllerImpl$

- java.lang.Object
- - akka.actor.typed.delivery.internal.ProducerControllerImpl$

- ---

```
public class ProducerControllerImpl$
extends java.lang.Object
```

INTERNAL API
 
 \=\=\=\= Design notes \=\=\=\=
 

 The producer will start the flow by sending a `ProducerController.Start` message to the `ProducerController` with
 message adapter reference to convert `ProducerController.RequestNext` message.
 The `ProducerController` sends `RequestNext` to the producer, which is then allowed to send one message to
 the `ProducerController`.
 

 The producer and `ProducerController` are supposed to be local so that these messages are fast and not lost.
 

 The `ProducerController` sends the first message to the `ConsumerController` without waiting for
 a `Request` from the `ConsumerController`. The main reason for this is that when used with
 Cluster Sharding the first message will typically create the `ConsumerController`. It's
 also a way to connect the ProducerController and ConsumerController in a dynamic way, for
 example when the ProducerController is replaced.
 

 When the first message is received by the `ConsumerController` it sends back the initial `Request`,
 with demand of how many messages it can accept.
 

 Apart from the first message the `ProducerController` will not send more messages than requested
 by the `ConsumerController`.
 

 When there is demand from the consumer side the `ProducerController` sends `RequestNext` to the
 actual producer, which is then allowed to send one more message.
 

 Each message is wrapped by the `ProducerController` in `ConsumerController.SequencedMessage` with
 a monotonically increasing sequence number without gaps, starting at 1\.
 

 In other words, the "request" protocol to the application producer and consumer is one\-by\-one, but
 between the `ProducerController` and `ConsumerController` it's window of messages in flight.
 

 The `Request` message also contains a `confirmedSeqNr` that is the acknowledgement
 from the consumer that it has received and processed all messages up to that sequence number.
 

 The `ConsumerController` will send [`ProducerControllerImpl.Resend`](ProducerControllerImpl.Resend.html "class in akka.actor.typed.delivery.internal") if a lost message is detected
 and then the `ProducerController` will resend all messages from that sequence number. The producer keeps
 unconfirmed messages in a buffer to be able to resend them. The buffer size is limited
 by the request window size.
 

 The resending is optional, and the `ConsumerController` can be started with `resendLost=false`
 to ignore lost messages, and then the `ProducerController` will not buffer unconfirmed messages.
 In that mode it provides only flow control but no reliable delivery.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ProducerControllerImpl$](ProducerControllerImpl$.html "class in akka.actor.typed.delivery.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ProducerControllerImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](../ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,scala.Option,akka.actor.typed.delivery.ProducerController.Settings,scala.Function1,scala.reflect.ClassTag))​(java.lang.String producerId,  scala.Option<[Behavior](../../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [ProducerController.Settings](../ProducerController.Settings.html "class in akka.actor.typed.delivery") settings,  scala.Function1<[ConsumerController.SequencedMessage](../ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>,​scala.runtime.BoxedUnit> send,  scala.reflect.ClassTag<A> evidence$2)` | For custom `send` function. |
	| `<A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](../ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,scala.Option,akka.actor.typed.delivery.ProducerController.Settings,scala.reflect.ClassTag))​(java.lang.String producerId,  scala.Option<[Behavior](../../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [ProducerController.Settings](../ProducerController.Settings.html "class in akka.actor.typed.delivery") settings,  scala.reflect.ClassTag<A> evidence$1)` |  |
	| `<A> scala.collection.immutable.Seq<akka.actor.typed.delivery.internal.ChunkedMessage>` | `[createChunks](#createChunks(A,int,akka.serialization.Serialization))​(A m,  int chunkSize,  [Serialization](../../../../serialization/Serialization.html "class in akka.serialization") serialization)` |  |
	| `void` | `[enforceLocalProducer](#enforceLocalProducer(akka.actor.typed.ActorRef))​([ActorRef](../../ActorRef.html "interface in akka.actor.typed")<?> ref)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ProducerControllerImpl$](ProducerControllerImpl$.html "class in akka.actor.typed.delivery.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ProducerControllerImpl$
		
		
		
		```
		public ProducerControllerImpl$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](../ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​(java.lang.String producerId,
		                                                         scala.Option<[Behavior](../../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                         [ProducerController.Settings](../ProducerController.Settings.html "class in akka.actor.typed.delivery") settings,
		                                                         scala.reflect.ClassTag<A> evidence$1)
		```
		- #### apply
		
		
		
		```
		public <A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](../ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​(java.lang.String producerId,
		                                                         scala.Option<[Behavior](../../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                         [ProducerController.Settings](../ProducerController.Settings.html "class in akka.actor.typed.delivery") settings,
		                                                         scala.Function1<[ConsumerController.SequencedMessage](../ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>,​scala.runtime.BoxedUnit> send,
		                                                         scala.reflect.ClassTag<A> evidence$2)
		```
		
		For custom `send` function. For example used with Sharding where the message must be wrapped in
		 `ShardingEnvelope(SequencedMessage(msg))`.
		- #### enforceLocalProducer
		
		
		
		```
		public void enforceLocalProducer​([ActorRef](../../ActorRef.html "interface in akka.actor.typed")<?> ref)
		```
		- #### createChunks
		
		
		
		```
		public <A> scala.collection.immutable.Seq<akka.actor.typed.delivery.internal.ChunkedMessage> createChunks​(A m,
		                                                                                                          int chunkSize,
		                                                                                                          [Serialization](../../../../serialization/Serialization.html "class in akka.serialization") serialization)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.SequencedMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl.Resend.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ProducerControllerImpl$.html)*