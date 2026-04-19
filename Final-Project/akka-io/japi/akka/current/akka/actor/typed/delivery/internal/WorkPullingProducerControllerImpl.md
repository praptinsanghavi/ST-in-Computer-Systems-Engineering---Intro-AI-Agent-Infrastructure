---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/WorkPullingProducerControllerImpl.html
title: WorkPullingProducerControllerImpl
---

# WorkPullingProducerControllerImpl

## Content

Package [akka.actor.typed.delivery.internal](package-summary.html)
## Class WorkPullingProducerControllerImpl\<A\>

- java.lang.Object
- - akka.actor.typed.delivery.internal.WorkPullingProducerControllerImpl\<A\>

- ---

```
public class WorkPullingProducerControllerImpl<A>
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[WorkPullingProducerControllerImpl.InternalCommand](WorkPullingProducerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")` |  |
	| `static interface` | `[WorkPullingProducerControllerImpl.UnsealedInternalCommand](WorkPullingProducerControllerImpl.UnsealedInternalCommand.html "interface in akka.actor.typed.delivery.internal")` | For commands defined in public WorkPullingProducerController |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WorkPullingProducerControllerImpl](#%3Cinit%3E(akka.actor.typed.scaladsl.ActorContext,akka.actor.typed.scaladsl.StashBuffer,java.lang.String,akka.actor.typed.delivery.WorkPullingProducerController.RequestNext,scala.Option,akka.actor.typed.delivery.WorkPullingProducerController.Settings,scala.reflect.ClassTag))​([ActorContext](../../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[WorkPullingProducerControllerImpl.InternalCommand](WorkPullingProducerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")> context,  [StashBuffer](../../scaladsl/StashBuffer.html "interface in akka.actor.typed.scaladsl")<[WorkPullingProducerControllerImpl.InternalCommand](WorkPullingProducerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")> stashBuffer,  java.lang.String producerId,  [WorkPullingProducerController.RequestNext](../WorkPullingProducerController.RequestNext.html "class in akka.actor.typed.delivery")<[A](WorkPullingProducerControllerImpl.html "type parameter in WorkPullingProducerControllerImpl")> requestNext,  scala.Option<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<[A](WorkPullingProducerControllerImpl.html "type parameter in WorkPullingProducerControllerImpl")>>> durableQueue,  [WorkPullingProducerController.Settings](../WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") settings,  scala.reflect.ClassTag<[A](WorkPullingProducerControllerImpl.html "type parameter in WorkPullingProducerControllerImpl")> evidence$3)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[WorkPullingProducerController.Command](../WorkPullingProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,akka.actor.typed.receptionist.ServiceKey,scala.Option,akka.actor.typed.delivery.WorkPullingProducerController.Settings,scala.reflect.ClassTag))​(java.lang.String producerId,  [ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](../ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> workerServiceKey,  scala.Option<[Behavior](../../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [WorkPullingProducerController.Settings](../WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") settings,  scala.reflect.ClassTag<A> evidence$1)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### WorkPullingProducerControllerImpl
		
		
		
		```
		public WorkPullingProducerControllerImpl​([ActorContext](../../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[WorkPullingProducerControllerImpl.InternalCommand](WorkPullingProducerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")> context,
		                                         [StashBuffer](../../scaladsl/StashBuffer.html "interface in akka.actor.typed.scaladsl")<[WorkPullingProducerControllerImpl.InternalCommand](WorkPullingProducerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")> stashBuffer,
		                                         java.lang.String producerId,
		                                         [WorkPullingProducerController.RequestNext](../WorkPullingProducerController.RequestNext.html "class in akka.actor.typed.delivery")<[A](WorkPullingProducerControllerImpl.html "type parameter in WorkPullingProducerControllerImpl")> requestNext,
		                                         scala.Option<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<[A](WorkPullingProducerControllerImpl.html "type parameter in WorkPullingProducerControllerImpl")>>> durableQueue,
		                                         [WorkPullingProducerController.Settings](../WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") settings,
		                                         scala.reflect.ClassTag<[A](WorkPullingProducerControllerImpl.html "type parameter in WorkPullingProducerControllerImpl")> evidence$3)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[WorkPullingProducerController.Command](../WorkPullingProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​(java.lang.String producerId,
		                                                                           [ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](../ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> workerServiceKey,
		                                                                           scala.Option<[Behavior](../../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                                           [WorkPullingProducerController.Settings](../WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") settings,
		                                                                           scala.reflect.ClassTag<A> evidence$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.RequestNext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/WorkPullingProducerControllerImpl.InternalCommand.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/WorkPullingProducerControllerImpl.UnsealedInternalCommand.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/WorkPullingProducerControllerImpl.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/StashBuffer.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/WorkPullingProducerControllerImpl.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/WorkPullingProducerControllerImpl.html)*