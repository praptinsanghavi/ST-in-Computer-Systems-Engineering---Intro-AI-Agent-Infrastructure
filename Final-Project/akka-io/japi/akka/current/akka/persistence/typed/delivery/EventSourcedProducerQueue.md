---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue.Settings$.html
title: EventSourcedProducerQueue.Settings$
---

# EventSourcedProducerQueue.Settings$

## Content

Package [akka.persistence.typed.delivery](package-summary.html)
## Class EventSourcedProducerQueue.Settings$

- java.lang.Object
- - akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings$

- Enclosing class:
[EventSourcedProducerQueue](EventSourcedProducerQueue.html "class in akka.persistence.typed.delivery")\<[A](EventSourcedProducerQueue.html "type parameter in EventSourcedProducerQueue")\>

---

```
public static class EventSourcedProducerQueue.Settings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventSourcedProducerQueue.Settings$](EventSourcedProducerQueue.Settings$.html "class in akka.persistence.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Settings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[EventSourcedProducerQueue.Settings](EventSourcedProducerQueue.Settings.html "class in akka.persistence.typed.delivery")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Scala API: Factory method from config `akka.reliable-delivery.producer-controller.event-sourced-durable-queue`  of the `ActorSystem`. |
	| `[EventSourcedProducerQueue.Settings](EventSourcedProducerQueue.Settings.html "class in akka.persistence.typed.delivery")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Scala API: Factory method from Config corresponding to  `akka.reliable-delivery.producer-controller.event-sourced-durable-queue`. |
	| `[EventSourcedProducerQueue.Settings](EventSourcedProducerQueue.Settings.html "class in akka.persistence.typed.delivery")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API: Factory method from config `akka.reliable-delivery.producer-controller.event-sourced-durable-queue`  of the `ActorSystem`. |
	| `[EventSourcedProducerQueue.Settings](EventSourcedProducerQueue.Settings.html "class in akka.persistence.typed.delivery")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Factory method from Config corresponding to  `akka.reliable-delivery.producer-controller.event-sourced-durable-queue`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventSourcedProducerQueue.Settings$](EventSourcedProducerQueue.Settings$.html "class in akka.persistence.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Settings$
		
		
		
		```
		public Settings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [EventSourcedProducerQueue.Settings](EventSourcedProducerQueue.Settings.html "class in akka.persistence.typed.delivery") apply​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Scala API: Factory method from config `akka.reliable-delivery.producer-controller.event-sourced-durable-queue`
		 of the `ActorSystem`.
		- #### apply
		
		
		
		```
		public [EventSourcedProducerQueue.Settings](EventSourcedProducerQueue.Settings.html "class in akka.persistence.typed.delivery") apply​(com.typesafe.config.Config config)
		```
		
		Scala API: Factory method from Config corresponding to
		 `akka.reliable-delivery.producer-controller.event-sourced-durable-queue`.
		- #### create
		
		
		
		```
		public [EventSourcedProducerQueue.Settings](EventSourcedProducerQueue.Settings.html "class in akka.persistence.typed.delivery") create​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API: Factory method from config `akka.reliable-delivery.producer-controller.event-sourced-durable-queue`
		 of the `ActorSystem`.
		- #### create
		
		
		
		```
		public [EventSourcedProducerQueue.Settings](EventSourcedProducerQueue.Settings.html "class in akka.persistence.typed.delivery") create​(com.typesafe.config.Config config)
		```
		
		Java API: Factory method from Config corresponding to
		 `akka.reliable-delivery.producer-controller.event-sourced-durable-queue`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue.Settings$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue.Settings.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/delivery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue.Settings$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/delivery/EventSourcedProducerQueue.Settings$.html)*