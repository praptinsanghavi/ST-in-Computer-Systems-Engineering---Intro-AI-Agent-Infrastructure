---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/WorkPullingProducerControllerImpl$.html
title: WorkPullingProducerControllerImpl$
---

# WorkPullingProducerControllerImpl$

## Content

Package [akka.actor.typed.delivery.internal](package-summary.html)
## Class WorkPullingProducerControllerImpl$

- java.lang.Object
- - akka.actor.typed.delivery.internal.WorkPullingProducerControllerImpl$

- ---

```
public class WorkPullingProducerControllerImpl$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WorkPullingProducerControllerImpl$](WorkPullingProducerControllerImpl$.html "class in akka.actor.typed.delivery.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WorkPullingProducerControllerImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[WorkPullingProducerController.Command](../WorkPullingProducerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(java.lang.String,akka.actor.typed.receptionist.ServiceKey,scala.Option,akka.actor.typed.delivery.WorkPullingProducerController.Settings,scala.reflect.ClassTag))​(java.lang.String producerId,  [ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](../ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> workerServiceKey,  scala.Option<[Behavior](../../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,  [WorkPullingProducerController.Settings](../WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") settings,  scala.reflect.ClassTag<A> evidence$1)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WorkPullingProducerControllerImpl$](WorkPullingProducerControllerImpl$.html "class in akka.actor.typed.delivery.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WorkPullingProducerControllerImpl$
		
		
		
		```
		public WorkPullingProducerControllerImpl$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[WorkPullingProducerController.Command](../WorkPullingProducerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​(java.lang.String producerId,
		                                                                    [ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](../ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> workerServiceKey,
		                                                                    scala.Option<[Behavior](../../Behavior.html "class in akka.actor.typed")<[DurableProducerQueue.Command](../DurableProducerQueue.Command.html "interface in akka.actor.typed.delivery")<A>>> durableQueueBehavior,
		                                                                    [WorkPullingProducerController.Settings](../WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") settings,
		                                                                    scala.reflect.ClassTag<A> evidence$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/WorkPullingProducerControllerImpl$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ServiceKey.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/WorkPullingProducerControllerImpl$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/WorkPullingProducerControllerImpl$.html)*