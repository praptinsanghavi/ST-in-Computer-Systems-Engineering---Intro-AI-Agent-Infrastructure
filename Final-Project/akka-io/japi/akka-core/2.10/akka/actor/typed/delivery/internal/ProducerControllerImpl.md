---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:00:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl.html
title: ProducerControllerImpl
---

# ProducerControllerImpl

## Content

Package [akka.actor.typed.delivery.internal](package-summary.html)
## Class ProducerControllerImpl\<A\>

- java.lang.Object
- - akka.actor.typed.delivery.internal.ProducerControllerImpl\<A\>

- ---

```
public class ProducerControllerImpl<A>
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ProducerControllerImpl.Ack](ProducerControllerImpl.Ack.html "class in akka.actor.typed.delivery.internal")` |  |
	| `static class` | `[ProducerControllerImpl.Ack$](ProducerControllerImpl.Ack$.html "class in akka.actor.typed.delivery.internal")` |  |
	| `static interface` | `[ProducerControllerImpl.InternalCommand](ProducerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")` |  |
	| `static class` | `[ProducerControllerImpl.Request](ProducerControllerImpl.Request.html "class in akka.actor.typed.delivery.internal")` |  |
	| `static class` | `[ProducerControllerImpl.Request$](ProducerControllerImpl.Request$.html "class in akka.actor.typed.delivery.internal")` |  |
	| `static class` | `[ProducerControllerImpl.Resend](ProducerControllerImpl.Resend.html "class in akka.actor.typed.delivery.internal")` |  |
	| `static class` | `[ProducerControllerImpl.Resend$](ProducerControllerImpl.Resend$.html "class in akka.actor.typed.delivery.internal")` |  |
	| `static class` | `[ProducerControllerImpl.ResendFirstUnconfirmed$](ProducerControllerImpl.ResendFirstUnconfirmed$.html "class in akka.actor.typed.delivery.internal")` |  |
	| `static interface` | `[ProducerControllerImpl.UnsealedInternalCommand](ProducerControllerImpl.UnsealedInternalCommand.html "interface in akka.actor.typed.delivery.internal")` | For commands defined in public ProducerController |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ProducerControllerImpl](#%3Cinit%3E(akka.actor.typed.scaladsl.ActorContext,java.lang.String,scala.Option,akka.actor.typed.delivery.ProducerController.Settings,akka.actor.typed.ActorRef,akka.actor.typed.scaladsl.TimerScheduler,scala.reflect.ClassTag))​([ActorContext](../../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[ProducerControllerImpl.InternalCommand](ProducerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")> context,  java.lang.String producerId,  scala.Option<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<[A](ProducerControllerImpl.html "type parameter in ProducerControllerImpl")>>> durableQueue,  [ProducerController.Settings](../ProducerController.Settings.html "class in akka.actor.typed.delivery") settings,  [ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[A](ProducerControllerImpl.html "type parameter in ProducerControllerImpl")> msgAdapter,  [TimerScheduler](../../scaladsl/TimerScheduler.html "interface in akka.actor.typed.scaladsl")<[ProducerControllerImpl.InternalCommand](ProducerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")> timers,  scala.reflect.ClassTag<[A](ProducerControllerImpl.html "type parameter in ProducerControllerImpl")> evidence$5)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](../ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,scala.Option,akka.actor.typed.delivery.ProducerController.Settings,scala.Function1,scala.reflect.ClassTag))​(java.lang.String producerId,  scala.Option<[Behavior](../../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [ProducerController.Settings](../ProducerController.Settings.html "class in akka.actor.typed.delivery") settings,  scala.Function1<[ConsumerController.SequencedMessage](../ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>,​scala.runtime.BoxedUnit> send,  scala.reflect.ClassTag<A> evidence$2)` | For custom `send` function. |
	| `static <A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](../ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,scala.Option,akka.actor.typed.delivery.ProducerController.Settings,scala.reflect.ClassTag))​(java.lang.String producerId,  scala.Option<[Behavior](../../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [ProducerController.Settings](../ProducerController.Settings.html "class in akka.actor.typed.delivery") settings,  scala.reflect.ClassTag<A> evidence$1)` |  |
	| `static <A> scala.collection.immutable.Seq<akka.actor.typed.delivery.internal.ChunkedMessage>` | `[createChunks](#createChunks(A,int,akka.serialization.Serialization))​(A m,  int chunkSize,  [Serialization](../../../../serialization/Serialization.html "class in akka.serialization") serialization)` |  |
	| `static void` | `[enforceLocalProducer](#enforceLocalProducer(akka.actor.typed.ActorRef))​([ActorRef](../../ActorRef.html "interface in akka.actor.typed")<?> ref)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ProducerControllerImpl
		
		
		
		```
		public ProducerControllerImpl​([ActorContext](../../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[ProducerControllerImpl.InternalCommand](ProducerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")> context,
		                              java.lang.String producerId,
		                              scala.Option<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<[A](ProducerControllerImpl.html "type parameter in ProducerControllerImpl")>>> durableQueue,
		                              [ProducerController.Settings](../ProducerController.Settings.html "class in akka.actor.typed.delivery") settings,
		                              [ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[A](ProducerControllerImpl.html "type parameter in ProducerControllerImpl")> msgAdapter,
		                              [TimerScheduler](../../scaladsl/TimerScheduler.html "interface in akka.actor.typed.scaladsl")<[ProducerControllerImpl.InternalCommand](ProducerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")> timers,
		                              scala.reflect.ClassTag<[A](ProducerControllerImpl.html "type parameter in ProducerControllerImpl")> evidence$5)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](../ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​(java.lang.String producerId,
		                                                                scala.Option<[Behavior](../../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                                [ProducerController.Settings](../ProducerController.Settings.html "class in akka.actor.typed.delivery") settings,
		                                                                scala.reflect.ClassTag<A> evidence$1)
		```
		- #### apply
		
		
		
		```
		public static <A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[ProducerController.Command](../ProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​(java.lang.String producerId,
		                                                                scala.Option<[Behavior](../../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                                [ProducerController.Settings](../ProducerController.Settings.html "class in akka.actor.typed.delivery") settings,
		                                                                scala.Function1<[ConsumerController.SequencedMessage](../ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")<A>,​scala.runtime.BoxedUnit> send,
		                                                                scala.reflect.ClassTag<A> evidence$2)
		```
		
		For custom `send` function. For example used with Sharding where the message must be wrapped in
		 `ShardingEnvelope(SequencedMessage(msg))`.
		- #### enforceLocalProducer
		
		
		
		```
		public static void enforceLocalProducer​([ActorRef](../../ActorRef.html "interface in akka.actor.typed")<?> ref)
		```
		- #### createChunks
		
		
		
		```
		public static <A> scala.collection.immutable.Seq<akka.actor.typed.delivery.internal.ChunkedMessage> createChunks​(A m,
		                                                                                                                 int chunkSize,
		                                                                                                                 [Serialization](../../../../serialization/Serialization.html "class in akka.serialization") serialization)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ConsumerController.SequencedMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ProducerController.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ProducerController.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl.Ack$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl.Ack.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl.InternalCommand.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl.Request$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl.Request.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl.Resend$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl.Resend.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl.ResendFirstUnconfirmed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl.UnsealedInternalCommand.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/TimerScheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serialization.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/internal/ProducerControllerImpl.html)*